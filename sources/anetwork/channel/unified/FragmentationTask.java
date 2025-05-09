package anetwork.channel.unified;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.FragmentStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.cookie.CookieManager;
import anetwork.channel.monitor.NetworkQoSCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FragmentationTask implements IUnifiedTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_RETRY_TIMES = 1;
    private static final int MULTIPATH_TIMER_INTERVAL = 1000;
    private static final String TAG = "anet.FragmentationTask";
    private NetworkQoSCenter.FragmentationRecommender.Fragment fragment;
    private FragmentStatistic fs;
    private RequestContext rc;
    private Request request;
    private volatile int state;
    private int userPathType;
    private FragmentationAggregator aggregator = null;
    private MultipathEnhanceTimer multipathTimer = null;
    private FragmentCallback mainCallback = null;
    private volatile FragmentCallback acceptingCallback = null;
    public volatile Cancelable cancelable = null;
    private Session session = null;
    private int retryTimesCount = 0;
    private int contentLength = 0;
    private int receiveChunkCount = 0;
    private long receiveBytesCount = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface DownloadingType {
        public static final int DEFAULT = 0;
        public static final int FAILED_RETRY = 1;
        public static final int MULTIPATH_TIMER = 2;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public @interface Definition {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface FragmentationTaskState {
        public static final int CANCELLED = 6;
        public static final int DATA_RECEIVING = 3;
        public static final int FAILED = 5;
        public static final int FINISH_SUCCESS = 4;
        public static final int INIT = 0;
        public static final int RESPONDED = 2;
        public static final int SENT = 1;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public @interface Definition {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class MultipathEnhanceTimer implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public FragmentCallback callback;
        public Cancelable cancelable;
        public Session session;

        static {
            t2o.a(607126130);
        }

        private MultipathEnhanceTimer() {
            this.session = null;
            this.cancelable = null;
            this.callback = null;
        }

        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + FragmentationTask.access$000(FragmentationTask.this).index + "] cancel multi-path timer", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            Cancelable cancelable = this.cancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
            FragmentCallback fragmentCallback = this.callback;
            if (fragmentCallback != null) {
                fragmentCallback.setCancelled();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = FragmentationTask.access$000(FragmentationTask.this).index;
            ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer[" + hashCode() + "] running", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            synchronized (FragmentationTask.access$100(FragmentationTask.this)) {
                try {
                    if (FragmentationTask.access$200(FragmentationTask.this) != 1) {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer exit with state: " + FragmentationTask.access$200(FragmentationTask.this), FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                    } else if (!FragmentationTask.access$500(FragmentationTask.this).isMultipathAvailable()) {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer exit with multi-path UNAVAILABLE", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                    } else if (FragmentationTask.access$1000(FragmentationTask.this) >= 1) {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer exit with OVER retry limitation: " + FragmentationTask.access$1000(FragmentationTask.this), FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                    } else {
                        Session mulitpathSession = FragmentationTask.access$500(FragmentationTask.this).getMulitpathSession();
                        if (mulitpathSession != null) {
                            ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer trigger a new request with LONG_LINK(mp)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                            FragmentationTask.access$000(FragmentationTask.this).pathType = 1;
                            this.session = mulitpathSession;
                            this.cancelable = FragmentationTask.access$1600(FragmentationTask.this, mulitpathSession, 2);
                        } else {
                            Session httpSession = FragmentationTask.access$500(FragmentationTask.this).getHttpSession();
                            if (httpSession != null) {
                                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer trigger a new request with SHORT_LINK(mp)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                                httpSession.setForceCellular(true);
                                FragmentationTask.access$000(FragmentationTask.this).pathType = 1;
                                this.session = httpSession;
                                this.cancelable = FragmentationTask.access$1600(FragmentationTask.this, httpSession, 2);
                            } else {
                                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + i + "] multi-path timer exit with NULL multi-path session", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        t2o.a(607126123);
        t2o.a(607126132);
    }

    public FragmentationTask(RequestContext requestContext, NetworkQoSCenter.FragmentationRecommender.Fragment fragment, int i) {
        this.rc = null;
        this.fs = null;
        this.userPathType = 0;
        this.state = 0;
        this.rc = requestContext;
        this.request = requestContext.config.getAwcnRequest();
        this.fragment = fragment;
        this.state = 0;
        this.userPathType = i;
        this.fs = new FragmentStatistic();
        ALog.e(TAG, "[fragmentation] create task[" + fragment.index + "], path[" + fragment.pathType + "], userPath[" + i + "], range[" + fragment.rangeStart + ", " + fragment.rangeEnd + "]", null, new Object[0]);
    }

    public static /* synthetic */ NetworkQoSCenter.FragmentationRecommender.Fragment access$000(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkQoSCenter.FragmentationRecommender.Fragment) ipChange.ipc$dispatch("c84c894d", new Object[]{fragmentationTask});
        }
        return fragmentationTask.fragment;
    }

    public static /* synthetic */ RequestContext access$100(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestContext) ipChange.ipc$dispatch("a433e40e", new Object[]{fragmentationTask});
        }
        return fragmentationTask.rc;
    }

    public static /* synthetic */ int access$1000(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c607d5e9", new Object[]{fragmentationTask})).intValue();
        }
        return fragmentationTask.retryTimesCount;
    }

    public static /* synthetic */ int access$1100(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("992f3aa", new Object[]{fragmentationTask})).intValue();
        }
        return fragmentationTask.userPathType;
    }

    public static /* synthetic */ Request access$1200(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("4ba8a51d", new Object[]{fragmentationTask});
        }
        return fragmentationTask.request;
    }

    public static /* synthetic */ FragmentCallback access$1300(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentCallback) ipChange.ipc$dispatch("154372d0", new Object[]{fragmentationTask});
        }
        return fragmentationTask.mainCallback;
    }

    public static /* synthetic */ MultipathEnhanceTimer access$1400(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultipathEnhanceTimer) ipChange.ipc$dispatch("18bd739b", new Object[]{fragmentationTask});
        }
        return fragmentationTask.multipathTimer;
    }

    public static /* synthetic */ Cancelable access$1600(FragmentationTask fragmentationTask, Session session, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cancelable) ipChange.ipc$dispatch("fe026c2d", new Object[]{fragmentationTask, session, new Integer(i)});
        }
        return fragmentationTask.downloading(session, i);
    }

    public static /* synthetic */ int access$200(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("da74eebc", new Object[]{fragmentationTask})).intValue();
        }
        return fragmentationTask.state;
    }

    public static /* synthetic */ int access$202(FragmentationTask fragmentationTask, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("577ca98b", new Object[]{fragmentationTask, new Integer(i)})).intValue();
        }
        fragmentationTask.state = i;
        return i;
    }

    public static /* synthetic */ int access$300(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e000c7d", new Object[]{fragmentationTask})).intValue();
        }
        return fragmentationTask.contentLength;
    }

    public static /* synthetic */ int access$302(FragmentationTask fragmentationTask, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("855543ea", new Object[]{fragmentationTask, new Integer(i)})).intValue();
        }
        fragmentationTask.contentLength = i;
        return i;
    }

    public static /* synthetic */ FragmentCallback access$400(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentCallback) ipChange.ipc$dispatch("674836e2", new Object[]{fragmentationTask});
        }
        return fragmentationTask.acceptingCallback;
    }

    public static /* synthetic */ FragmentCallback access$402(FragmentationTask fragmentationTask, FragmentCallback fragmentCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentCallback) ipChange.ipc$dispatch("acbf5b91", new Object[]{fragmentationTask, fragmentCallback});
        }
        fragmentationTask.acceptingCallback = fragmentCallback;
        return fragmentCallback;
    }

    public static /* synthetic */ FragmentationAggregator access$500(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentationAggregator) ipChange.ipc$dispatch("a0872896", new Object[]{fragmentationTask});
        }
        return fragmentationTask.aggregator;
    }

    public static /* synthetic */ int access$600(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8a165c0", new Object[]{fragmentationTask})).intValue();
        }
        return fragmentationTask.receiveChunkCount;
    }

    public static /* synthetic */ int access$608(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4ee35c8", new Object[]{fragmentationTask})).intValue();
        }
        int i = fragmentationTask.receiveChunkCount;
        fragmentationTask.receiveChunkCount = 1 + i;
        return i;
    }

    public static /* synthetic */ long access$700(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c2c8382", new Object[]{fragmentationTask})).longValue();
        }
        return fragmentationTask.receiveBytesCount;
    }

    public static /* synthetic */ long access$702(FragmentationTask fragmentationTask, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cb7b128", new Object[]{fragmentationTask, new Long(j)})).longValue();
        }
        fragmentationTask.receiveBytesCount = j;
        return j;
    }

    public static /* synthetic */ FragmentStatistic access$800(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentStatistic) ipChange.ipc$dispatch("b29a256e", new Object[]{fragmentationTask});
        }
        return fragmentationTask.fs;
    }

    public static /* synthetic */ Session access$900(FragmentationTask fragmentationTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("3f6f8de", new Object[]{fragmentationTask});
        }
        return fragmentationTask.session;
    }

    public static /* synthetic */ Session access$902(FragmentationTask fragmentationTask, Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Session) ipChange.ipc$dispatch("77e4d184", new Object[]{fragmentationTask, session});
        }
        fragmentationTask.session = session;
        return session;
    }

    private Cancelable downloading(Session session, int i) {
        int i2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cancelable) ipChange.ipc$dispatch("a3ba1d28", new Object[]{this, session, new Integer(i)});
        }
        NetworkQoSCenter.FragmentationRecommender.Fragment fragment = this.fragment;
        if (fragment != null) {
            i2 = fragment.index;
        } else {
            i2 = 0;
        }
        if (this.state == 6) {
            ALog.e(TAG, "[fragmentation] task[" + i2 + "] is CANCELLED", this.rc.seqNum, new Object[0]);
            return null;
        } else if (session == null) {
            ALog.e(TAG, "[fragmentation] task[" + i2 + "] run failed, session is NULL", this.rc.seqNum, new Object[0]);
            return null;
        } else {
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            FragmentCallback fragmentCallback = new FragmentCallback(this.fragment.pathType, z);
            if (z) {
                this.multipathTimer.callback = fragmentCallback;
            } else {
                this.mainCallback = fragmentCallback;
            }
            this.state = 1;
            if (i == 2 || i == 1) {
                int i3 = this.retryTimesCount + 1;
                this.retryTimesCount = i3;
                FragmentStatistic fragmentStatistic = this.fs;
                fragmentStatistic.retryTimes = i3;
                fragmentStatistic.retryType = i;
                fragmentStatistic.retryTimestamp = System.currentTimeMillis();
            }
            try {
                FragmentStatistic fragmentStatistic2 = this.fs;
                fragmentStatistic2.actualPathType = this.fragment.pathType;
                fragmentStatistic2.actualSessionType = session.getConnType().getType();
            } catch (Exception unused) {
            }
            this.request = preProcessRequest(this.request);
            ALog.e(TAG, "[fragmentation] task[" + i2 + "] send request on session[" + session.mSeq + "]", this.rc.seqNum, new Object[0]);
            return session.request(this.request, fragmentCallback);
        }
    }

    private Request preProcessRequest(Request request) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Request) ipChange.ipc$dispatch("3f01980c", new Object[]{this, request});
        }
        Request.Builder newBuilder = request.newBuilder();
        if (this.rc.config.isRequestCookieEnabled()) {
            String cookie = CookieManager.getCookie(this.rc.config.getUrlString());
            if (!TextUtils.isEmpty(cookie)) {
                String str2 = request.getHeaders().get("Cookie");
                if (!TextUtils.isEmpty(str2)) {
                    cookie = StringUtils.concatString(str2, "; ", cookie);
                }
                if (AwcnConfig.isHostInCookiePrintLogWhiteList(request.getHost())) {
                    RequestContext requestContext = this.rc;
                    CookieManager.printLog("FragmentationTask", requestContext.seqNum, cookie, requestContext.config.getUrlString());
                }
                newBuilder.addHeader("Cookie", cookie);
            }
        }
        if (this.retryTimesCount == 0) {
            str = HttpConstant.RANGE_PRE + this.fragment.rangeStart + "-" + this.fragment.rangeEnd;
            newBuilder.setReadTimeout(2000);
        } else {
            str = HttpConstant.RANGE_PRE + (this.fragment.rangeStart + this.receiveBytesCount) + "-" + this.fragment.rangeEnd;
            newBuilder.setReadTimeout(3000);
        }
        ALog.e(TAG, "[fragmentation] task[" + this.fragment.index + "] with request add Range header[" + str + "]!", this.rc.seqNum, new Object[0]);
        newBuilder.addHeader(HttpConstant.RANGE, str);
        Request build = newBuilder.build();
        if (build != null) {
            build.isGold = request.isGold;
            build.recvRateBpsLimit = request.recvRateBpsLimit;
        }
        return build;
    }

    private void setupMultipathTimer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f2576b", new Object[]{this});
        } else if (this.multipathTimer == null) {
            MultipathEnhanceTimer multipathEnhanceTimer = new MultipathEnhanceTimer();
            ALog.e(TAG, "[fragmentation] task[" + this.fragment.index + "] setup a multi-path timer:" + multipathEnhanceTimer.hashCode(), this.rc.seqNum, new Object[0]);
            this.multipathTimer = multipathEnhanceTimer;
            ThreadPoolExecutorFactory.submitScheduledTask(multipathEnhanceTimer, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // anet.channel.request.Cancelable
    public synchronized void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        this.state = 6;
        if (this.cancelable != null) {
            this.cancelable.cancel();
        }
        MultipathEnhanceTimer multipathEnhanceTimer = this.multipathTimer;
        if (multipathEnhanceTimer != null) {
            multipathEnhanceTimer.cancel();
        }
    }

    public void download(Session session) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcd94e7", new Object[]{this, session});
            return;
        }
        ALog.e(TAG, "[fragmentation][QoS] trigger task[" + this.fragment.index + "] download", this.rc.seqNum, new Object[0]);
        try {
            FragmentStatistic fragmentStatistic = this.fs;
            fragmentStatistic.requestIndex = this.fragment.index;
            fragmentStatistic.startTimestamp = System.currentTimeMillis();
            FragmentStatistic fragmentStatistic2 = this.fs;
            fragmentStatistic2.userPathType = this.userPathType;
            fragmentStatistic2.planPathType = this.fragment.pathType;
            fragmentStatistic2.planSessionType = session.getConnType().getType();
        } catch (Exception unused) {
        }
        if (session != null) {
            this.session = session;
            this.cancelable = downloading(session, 0);
            if (this.aggregator.isMultipathAvailable() && !this.fragment.isMultipath) {
                setupMultipathTimer();
                return;
            }
            return;
        }
        ALog.e(TAG, "[fragmentation] task[" + this.fragment.index + "] exit with NULL session", this.rc.seqNum, new Object[0]);
    }

    public String getRangeInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e8d5944", new Object[]{this});
        }
        return this.fragment.rangeStart + "-" + this.fragment.rangeEnd + "-" + this.fragment.index;
    }

    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return this.state;
    }

    public boolean isMultipath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e8f315f", new Object[]{this})).booleanValue();
        }
        return this.fragment.isMultipath;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        int i = this.fragment.index;
        ALog.e(TAG, "[fragmentation] task[" + i + "] retry-func running", this.rc.seqNum, new Object[0]);
        synchronized (this) {
            try {
                if (this.state >= 2) {
                    ALog.e(TAG, "[fragmentation] task[" + i + "] retry-func exit with state: " + this.state, this.rc.seqNum, new Object[0]);
                } else if (this.retryTimesCount >= 1) {
                    ALog.e(TAG, "[fragmentation] task[" + i + "] retry-func exit with OVER retry limitation: " + this.retryTimesCount, this.rc.seqNum, new Object[0]);
                } else {
                    this.cancelable = downloading(this.session, 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setGetLongMultiPathRet(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d73e029", new Object[]{this, new Integer(i)});
        } else {
            this.fs.getLongMultiPathRet = i;
        }
    }

    public void setParentAggregator(FragmentationAggregator fragmentationAggregator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9932b368", new Object[]{this, fragmentationAggregator});
        } else {
            this.aggregator = fragmentationAggregator;
        }
    }

    public void setScenePriority(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c1aedc4", new Object[]{this, str, new Integer(i)});
            return;
        }
        FragmentStatistic fragmentStatistic = this.fs;
        fragmentStatistic.scene = str;
        fragmentStatistic.priorityLevel = i;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class FragmentCallback implements RequestCb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int idx;
        private boolean isMutipathRetry;
        private int pathType;
        private boolean isNormalResponse = false;
        private boolean isCancelled = false;
        private AtomicBoolean isDone = new AtomicBoolean(false);

        static {
            t2o.a(607126127);
            t2o.a(607125523);
        }

        public FragmentCallback(int i, boolean z) {
            this.isMutipathRetry = false;
            this.pathType = 0;
            this.idx = 0;
            this.isMutipathRetry = z;
            this.pathType = i;
            this.idx = FragmentationTask.access$000(FragmentationTask.this).index;
        }

        private void cancelParallelRequest() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a03da35", new Object[]{this});
            } else if (this.isMutipathRetry) {
                if (FragmentationTask.access$1300(FragmentationTask.this) != null) {
                    FragmentationTask.access$1300(FragmentationTask.this).setCancelled();
                }
                if (FragmentationTask.this.cancelable != null) {
                    ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] multi-path response cancel parallel request", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                    FragmentationTask.this.cancelable.cancel();
                }
            } else if (FragmentationTask.access$1400(FragmentationTask.this) != null) {
                FragmentationTask.access$1400(FragmentationTask.this).cancel();
            }
        }

        private boolean isNormalResponseCode(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a4946ba1", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 200 || i == 206) {
                return true;
            }
            return false;
        }

        private boolean isParallelRequestingNone() {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ef7a3f07", new Object[]{this})).booleanValue();
            }
            if (this.isMutipathRetry) {
                String str = "[fragmentation] task[" + FragmentationTask.access$000(FragmentationTask.this).index + "][isParallelRequestingNone] 1 isMutipathRetry is true";
                String str2 = FragmentationTask.access$100(FragmentationTask.this).seqNum;
                if (FragmentationTask.access$1300(FragmentationTask.this) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Boolean valueOf = Boolean.valueOf(z3);
                if (FragmentationTask.access$1300(FragmentationTask.this) == null || !FragmentationTask.access$1300(FragmentationTask.this).isDone.get()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                ALog.e(FragmentationTask.TAG, str, str2, "isMainCallbackNotNull", valueOf, "isDone", Boolean.valueOf(z4));
                if (FragmentationTask.access$1300(FragmentationTask.this) == null || FragmentationTask.access$1300(FragmentationTask.this).isDone.get() || FragmentationTask.access$1300(FragmentationTask.this).isCancelled()) {
                    return true;
                }
                return false;
            } else if (FragmentationTask.access$1400(FragmentationTask.this) == null || FragmentationTask.access$1400(FragmentationTask.this).callback == null) {
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + FragmentationTask.access$000(FragmentationTask.this).index + "][isParallelRequestingNone] 3 isMutipathRetry is false", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                return true;
            } else {
                String str3 = "[fragmentation] task[" + FragmentationTask.access$000(FragmentationTask.this).index + "][isParallelRequestingNone] 1 isMutipathRetry is false";
                String str4 = FragmentationTask.access$100(FragmentationTask.this).seqNum;
                if (FragmentationTask.access$1300(FragmentationTask.this) != null) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf2 = Boolean.valueOf(z);
                if (FragmentationTask.access$1300(FragmentationTask.this) == null || !FragmentationTask.access$1300(FragmentationTask.this).isDone.get()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ALog.e(FragmentationTask.TAG, str3, str4, "isMainCallbackNotNull", valueOf2, "isDone", Boolean.valueOf(z2));
                if (FragmentationTask.access$1400(FragmentationTask.this).callback.isDone.get() || FragmentationTask.access$1400(FragmentationTask.this).callback.isCancelled) {
                    return true;
                }
                return false;
            }
        }

        private boolean isReceiveCompleted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4a512b7d", new Object[]{this})).booleanValue();
            }
            if (FragmentationTask.access$700(FragmentationTask.this) == (FragmentationTask.access$000(FragmentationTask.this).rangeEnd - FragmentationTask.access$000(FragmentationTask.this).rangeStart) + 1) {
                return true;
            }
            return false;
        }

        private void processFinish(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bc98404", new Object[]{this, new Integer(i), str});
                return;
            }
            FragmentationTask.access$202(FragmentationTask.this, 4);
            FragmentationAggregator access$500 = FragmentationTask.access$500(FragmentationTask.this);
            FragmentationTask fragmentationTask = FragmentationTask.this;
            access$500.updateTaskState(fragmentationTask, FragmentationTask.access$200(fragmentationTask));
            ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (SUCCESS)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            FragmentationTask.access$800(FragmentationTask.this).ret = 1;
            AppMonitor.getInstance().commitStat(FragmentationTask.access$800(FragmentationTask.this));
            if (FragmentationTask.access$500(FragmentationTask.this).isAllTasksFinish() && FragmentationTask.access$100(FragmentationTask.this) != null) {
                if (FragmentationTask.access$100(FragmentationTask.this).callback != null) {
                    if (FragmentationTask.access$500(FragmentationTask.this).isSuccess()) {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] all fragments download finish (SUCCESS)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        FragmentationTask.access$100(FragmentationTask.this).callback.onFinish(new DefaultFinishEvent(i, str, FragmentationTask.access$1200(FragmentationTask.this)));
                    } else {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] all fragments download finish (FRAGMENTATION_PARTIAL_FINISH)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        FragmentationTask.access$100(FragmentationTask.this).callback.onFinish(new DefaultFinishEvent(-207, str, FragmentationTask.access$1200(FragmentationTask.this)));
                    }
                }
                if (FragmentationTask.access$100(FragmentationTask.this).config != null && FragmentationTask.access$100(FragmentationTask.this).config.isQoSAsync()) {
                    QosTaskQueue.getInstance().pollQueuingTask(FragmentationTask.access$100(FragmentationTask.this));
                }
            }
            NetworkQoSCenter instance = NetworkQoSCenter.getInstance();
            if (instance != null) {
                instance.input(FragmentationTask.access$800(FragmentationTask.this).traffic, FragmentationTask.access$800(FragmentationTask.this).totalTime - FragmentationTask.access$800(FragmentationTask.this).retryCostTime, FragmentationTask.access$800(FragmentationTask.this).srtt, true, this.pathType);
            }
        }

        public boolean isCancelled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
            }
            return this.isCancelled;
        }

        @Override // anet.channel.RequestCb
        public void onDataReceive(ByteArray byteArray, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a65ed612", new Object[]{this, byteArray, new Boolean(z)});
            } else if (this != FragmentationTask.access$400(FragmentationTask.this)) {
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onDataReceive(), exit with NOT acceptingCallback" + this.isCancelled, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            } else if (FragmentationTask.access$200(FragmentationTask.this) > 3 || this.isCancelled) {
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onDataReceive(), exit with state=" + FragmentationTask.access$200(FragmentationTask.this) + ", cancelled=" + this.isCancelled, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            } else if (byteArray != null) {
                if (byteArray.getDataLength() == 0) {
                    ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "]  onDataReceive fin=true ", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                    return;
                }
                ALog.d(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onDataReceive data_len = " + byteArray.getDataLength() + " isNormalResponse=[" + this.isNormalResponse + "]", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                FragmentationTask.access$202(FragmentationTask.this, 3);
                if (this.isNormalResponse) {
                    FragmentationTask.access$608(FragmentationTask.this);
                    FragmentationTask fragmentationTask = FragmentationTask.this;
                    FragmentationTask.access$702(fragmentationTask, FragmentationTask.access$700(fragmentationTask) + byteArray.getDataLength());
                    if (FragmentationTask.access$100(FragmentationTask.this).callback != null) {
                        FragmentationAggregator access$500 = FragmentationTask.access$500(FragmentationTask.this);
                        FragmentationTask fragmentationTask2 = FragmentationTask.this;
                        access$500.updateTaskState(fragmentationTask2, FragmentationTask.access$200(fragmentationTask2));
                        byteArray.setRangeIndex(FragmentationTask.access$000(FragmentationTask.this).index);
                        FragmentationTask.access$100(FragmentationTask.this).callback.onDataReceiveSize(FragmentationTask.access$600(FragmentationTask.this), FragmentationTask.access$300(FragmentationTask.this), byteArray);
                    }
                }
            }
        }

        @Override // anet.channel.RequestCb
        public void onFinish(int i, String str, RequestStatistic requestStatistic) {
            RequestContext requestContext;
            boolean z;
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c490acd4", new Object[]{this, new Integer(i), str, requestStatistic});
                return;
            }
            RequestContext access$100 = FragmentationTask.access$100(FragmentationTask.this);
            synchronized (access$100) {
                try {
                    try {
                        if (FragmentationTask.access$200(FragmentationTask.this) >= 4 || this.isCancelled) {
                            ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish(), exit with state=" + FragmentationTask.access$200(FragmentationTask.this) + ", cancelled=" + this.isCancelled, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        } else if (this.isDone.get()) {
                            ALog.e(FragmentationTask.TAG, "[fragmentation][opt] task[" + this.idx + "] isDone( " + i + " ), total received size: " + FragmentationTask.access$700(FragmentationTask.this), FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        } else {
                            this.isDone.set(true);
                            try {
                                FragmentationTask.access$800(FragmentationTask.this).deprecatedSessionType = FragmentationTask.access$900(FragmentationTask.this).getDeprecatedSessionType();
                                FragmentStatistic access$800 = FragmentationTask.access$800(FragmentationTask.this);
                                if (System.currentTimeMillis() - GlobalAppRuntimeInfo.getNetworkStatusChangedTime() <= NetworkConfigCenter.getNetworkChangeThresholdTime()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                access$800.isNetworkChangeThresholdTime = z;
                                FragmentationTask.access$800(FragmentationTask.this).setBaseInfo(requestStatistic);
                                FragmentationTask.access$800(FragmentationTask.this).finishTimestamp = System.currentTimeMillis();
                                FragmentStatistic access$8002 = FragmentationTask.access$800(FragmentationTask.this);
                                if (FragmentationTask.access$800(FragmentationTask.this).retryTimes > 0) {
                                    requestContext = access$100;
                                    try {
                                        j = FragmentationTask.access$800(FragmentationTask.this).finishTimestamp - FragmentationTask.access$800(FragmentationTask.this).retryTimestamp;
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    requestContext = access$100;
                                    j = 0;
                                }
                                access$8002.retryCostTime = j;
                                FragmentationTask.access$800(FragmentationTask.this).totalTime = FragmentationTask.access$800(FragmentationTask.this).finishTimestamp - FragmentationTask.access$800(FragmentationTask.this).startTimestamp;
                                FragmentationTask.access$800(FragmentationTask.this).traffic = FragmentationTask.access$700(FragmentationTask.this);
                                FragmentationTask.access$800(FragmentationTask.this).statusCode = i;
                                FragmentationTask.access$800(FragmentationTask.this).srtt = requestStatistic.srtt;
                            } catch (Exception unused2) {
                                requestContext = access$100;
                            }
                            ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish( " + i + " ), total received size: " + FragmentationTask.access$700(FragmentationTask.this), FragmentationTask.access$100(FragmentationTask.this).seqNum, "isDone", Boolean.valueOf(this.isDone.get()));
                            if (!this.isNormalResponse || !isNormalResponseCode(i)) {
                                if (FragmentationTask.access$1000(FragmentationTask.this) == 0) {
                                    FragmentationTask.access$800(FragmentationTask.this).firstErrorCode = FragmentationTask.access$800(FragmentationTask.this).statusCode;
                                }
                                boolean isReceiveCompleted = isReceiveCompleted();
                                if (FragmentationTask.access$1000(FragmentationTask.this) < 1 && !isReceiveCompleted) {
                                    FragmentationTask.access$202(FragmentationTask.this, 0);
                                    FragmentationAggregator access$500 = FragmentationTask.access$500(FragmentationTask.this);
                                    FragmentationTask fragmentationTask = FragmentationTask.this;
                                    access$500.updateTaskState(fragmentationTask, FragmentationTask.access$200(fragmentationTask));
                                    ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (FAILURE) with retry", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                                    Session mulitpathSession = FragmentationTask.access$500(FragmentationTask.this).getMulitpathSession();
                                    if (FragmentationTask.access$000(FragmentationTask.this).isMultipath || !FragmentationTask.access$500(FragmentationTask.this).isMultipathAvailable() || mulitpathSession == null) {
                                        ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (FAILURE), retry SHORT_LINK, userPath=[" + FragmentationTask.access$1100(FragmentationTask.this) + "], retryTimes=[" + FragmentationTask.access$1000(FragmentationTask.this) + "]", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                                        FragmentationTask.access$000(FragmentationTask.this).pathType = FragmentationTask.access$1100(FragmentationTask.this);
                                        FragmentationTask fragmentationTask2 = FragmentationTask.this;
                                        FragmentationTask.access$902(fragmentationTask2, FragmentationTask.access$500(fragmentationTask2).getHttpSession());
                                    } else {
                                        ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (FAILURE), retry MULTI-PATH, userPath=[" + FragmentationTask.access$1100(FragmentationTask.this) + "], retryTimes=[" + FragmentationTask.access$1000(FragmentationTask.this) + "]", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                                        FragmentationTask.access$000(FragmentationTask.this).pathType = 1;
                                        FragmentationTask.access$902(FragmentationTask.this, mulitpathSession);
                                    }
                                    ThreadPoolExecutorFactory.submitPriorityTask(FragmentationTask.this, ThreadPoolExecutorFactory.Priority.HIGH);
                                    return;
                                }
                                processFailure(i, str, isReceiveCompleted);
                                return;
                            }
                            processFinish(i, str);
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @Override // anet.channel.RequestCb
        public void onResponseCode(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38c34976", new Object[]{this, new Integer(i), map});
                return;
            }
            synchronized (FragmentationTask.access$100(FragmentationTask.this)) {
                try {
                    if (FragmentationTask.access$200(FragmentationTask.this) < 2 && !this.isCancelled) {
                        ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onResponseCode(" + i + f7l.BRACKET_END_STR, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                        boolean isNormalResponseCode = isNormalResponseCode(i);
                        this.isNormalResponse = isNormalResponseCode;
                        if (isNormalResponseCode) {
                            cancelParallelRequest();
                            CookieManager.setCookie(FragmentationTask.access$100(FragmentationTask.this).config.getHost(), FragmentationTask.access$100(FragmentationTask.this).config.getUrlString(), map);
                            FragmentationTask.access$302(FragmentationTask.this, HttpHelper.parseContentLength(map));
                            FragmentationTask.access$202(FragmentationTask.this, 2);
                            FragmentationTask.access$402(FragmentationTask.this, this);
                            if (FragmentationTask.access$100(FragmentationTask.this).callback == null || FragmentationTask.access$500(FragmentationTask.this).isResponded()) {
                                FragmentationAggregator access$500 = FragmentationTask.access$500(FragmentationTask.this);
                                FragmentationTask fragmentationTask = FragmentationTask.this;
                                access$500.updateTaskState(fragmentationTask, FragmentationTask.access$200(fragmentationTask));
                            } else {
                                FragmentationAggregator access$5002 = FragmentationTask.access$500(FragmentationTask.this);
                                FragmentationTask fragmentationTask2 = FragmentationTask.this;
                                access$5002.updateTaskState(fragmentationTask2, FragmentationTask.access$200(fragmentationTask2));
                                FragmentationTask.access$100(FragmentationTask.this).callback.onResponseCode(i, FragmentationTask.access$500(FragmentationTask.this).buildResponseHeader(map));
                            }
                        }
                        return;
                    }
                    ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onResponseCode(" + i + "), exit with state=" + FragmentationTask.access$200(FragmentationTask.this) + ", cancelled=" + this.isCancelled, FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setCancelled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3eecc016", new Object[]{this});
            } else {
                this.isCancelled = true;
            }
        }

        private void processFailure(int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb0c6c89", new Object[]{this, new Integer(i), str, new Boolean(z)});
            } else if (z) {
                FragmentationTask.access$202(FragmentationTask.this, 4);
                FragmentationAggregator access$500 = FragmentationTask.access$500(FragmentationTask.this);
                FragmentationTask fragmentationTask = FragmentationTask.this;
                access$500.updateTaskState(fragmentationTask, FragmentationTask.access$200(fragmentationTask));
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (FAILURE->SUCCESS) with receive-completed", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                FragmentationTask.access$800(FragmentationTask.this).ret = 3;
                AppMonitor.getInstance().commitStat(FragmentationTask.access$800(FragmentationTask.this));
                if (FragmentationTask.access$500(FragmentationTask.this).isAllTasksFinish() && FragmentationTask.access$100(FragmentationTask.this) != null) {
                    if (FragmentationTask.access$100(FragmentationTask.this).callback != null) {
                        if (FragmentationTask.access$500(FragmentationTask.this).isSuccess()) {
                            ALog.e(FragmentationTask.TAG, "[fragmentation] all fragments download finish (SUCCESS)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                            FragmentationTask.access$100(FragmentationTask.this).callback.onFinish(new DefaultFinishEvent(206, "receive-completed", FragmentationTask.access$1200(FragmentationTask.this)));
                        } else {
                            ALog.e(FragmentationTask.TAG, "[fragmentation] all fragments download finish (FRAGMENTATION_PARTIAL_FINISH)", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                            FragmentationTask.access$100(FragmentationTask.this).callback.onFinish(new DefaultFinishEvent(-207, str, FragmentationTask.access$1200(FragmentationTask.this)));
                        }
                    }
                    if (FragmentationTask.access$100(FragmentationTask.this).config != null && FragmentationTask.access$100(FragmentationTask.this).config.isQoSAsync()) {
                        QosTaskQueue.getInstance().pollQueuingTask(FragmentationTask.access$100(FragmentationTask.this));
                    }
                }
            } else if (isParallelRequestingNone()) {
                FragmentationTask.access$202(FragmentationTask.this, 5);
                FragmentationAggregator access$5002 = FragmentationTask.access$500(FragmentationTask.this);
                FragmentationTask fragmentationTask2 = FragmentationTask.this;
                access$5002.updateTaskState(fragmentationTask2, FragmentationTask.access$200(fragmentationTask2));
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (FAILURE) with MAX_RETRY_TIMES", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                FragmentationTask.access$800(FragmentationTask.this).ret = 0;
                AppMonitor.getInstance().commitStat(FragmentationTask.access$800(FragmentationTask.this));
                if (FragmentationTask.access$500(FragmentationTask.this).isAllTasksFinish() && FragmentationTask.access$100(FragmentationTask.this) != null) {
                    ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (real return FAILURE) with MAX_RETRY_TIMES", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
                    if (FragmentationTask.access$100(FragmentationTask.this).callback != null) {
                        FragmentationTask.access$100(FragmentationTask.this).callback.onFinish(new DefaultFinishEvent(i, str, FragmentationTask.access$1200(FragmentationTask.this)));
                    }
                    if (FragmentationTask.access$100(FragmentationTask.this).config != null && FragmentationTask.access$100(FragmentationTask.this).config.isQoSAsync()) {
                        QosTaskQueue.getInstance().pollQueuingTask(FragmentationTask.access$100(FragmentationTask.this));
                    }
                }
            } else {
                ALog.e(FragmentationTask.TAG, "[fragmentation] task[" + this.idx + "] onFinish (FAILURE), wait parallel requesting", FragmentationTask.access$100(FragmentationTask.this).seqNum, new Object[0]);
            }
        }
    }
}
