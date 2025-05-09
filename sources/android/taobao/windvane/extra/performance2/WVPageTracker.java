package android.taobao.windvane.extra.performance2;

import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.taobao.android.riverlogger.RVLLevel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import tb.bsw;
import tb.ftw;
import tb.icn;
import tb.lcn;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.wua;
import tb.x74;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVPageTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int WVZCacheStateHitZCache = 2;
    public static final int WVZCacheStateNotHitZCache = 1;
    public static final int WVZCacheStateNotUseZCache = 0;
    public static final int WVZNSRFail = 2;
    public static final int WVZNSRSkip = 0;
    public static final int WVZNSRSuccess = 1;
    private int jsErrorTimes;
    private String mLastPageUniqueIdentifier;
    private String mPageUniqueIdentifier;
    private String mWebViewUniqueIdentifier;
    private IPerformance performance;
    private long redirectCounts;
    private long redirectEntrance;
    private long redirectExport;
    private String url;
    private IWVWebView webView;
    public static String RVLOG_PAGE_MODEL = "WindVane/Page";
    public static String RVLOG_NETWORK_MODEL = "WindVane/Network";
    public static List<PageStatusCallback> pageStatusCallbacks = new CopyOnWriteArrayList();
    private static String customizedStageIndentifier = "CSI";
    private static int pageIdentifier = 0;
    private long mReceiveFirstPaintElapse = 0;
    private long mNavigationStartTS = 0;
    private int[][] stateMachine = {new int[]{1, 1, -1, -1, -1}, new int[]{-1, 1, 2, 3, -1}, new int[]{-1, 1, 2, 3, 4}, new int[]{-1, 1, 2, 3, -1}, new int[]{-1, -1, -1, 3, -1}};
    private String[] stages = {"initStart", "initEnd", "loadRequest", "interceptStart", "interceptEnd", "startLoad", "navigationStart", "fetchStart", "responseEnd", "domContentLoadedEventStart", "loadEventStart", "loadEventEnd", "finishLoad", "firstPaint", "firstScreenPaint", "timeToInteractive", "T1", "T2", "dealloc", "creatActivity", "attachToWindow", "firstScreenPaintCustomize"};
    private WVPageState state = WVPageState.WVPageStateInit;
    private ArrayList<WVResource> resources = new ArrayList<>();
    private HashMap<String, WVResource> resourcesMap = new HashMap<>();
    private ArrayList<Integer> events = new ArrayList<>();
    private long tti = 0;
    private Object lock_event = new Object();
    private Object lock_resource = new Object();
    private String mPid = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface PageStatusCallback {
        void onPageFinish(String str);

        void onRedirect(String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum WVPageState {
        WVPageStateError(-1),
        WVPageStateInit(0),
        WVPageStateLoadURL(1),
        WVPageStateStartLoad(2),
        WVPageStateFinishLoad(3),
        WVPageStateErrorOccurred(4);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int state;

        WVPageState(int i) {
            this.state = i;
        }

        public static /* synthetic */ Object ipc$super(WVPageState wVPageState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/performance2/WVPageTracker$WVPageState");
        }

        public static WVPageState valueOf(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WVPageState) ipChange.ipc$dispatch("592ae82d", new Object[]{str}) : (WVPageState) Enum.valueOf(WVPageState.class, str);
        }

        public int value() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d249f56b", new Object[]{this})).intValue();
            }
            return this.state;
        }

        public static WVPageState valueOf(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WVPageState) ipChange.ipc$dispatch("7e02f92", new Object[]{new Integer(i)});
            }
            if (i == -1) {
                return WVPageStateError;
            }
            if (i == 0) {
                return WVPageStateInit;
            }
            if (i == 1) {
                return WVPageStateLoadURL;
            }
            if (i == 2) {
                return WVPageStateStartLoad;
            }
            if (i == 3) {
                return WVPageStateFinishLoad;
            }
            if (i != 4) {
                return null;
            }
            return WVPageStateErrorOccurred;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class WVResource implements Serializable {
        public int dataSize;
        public boolean isHTML;
        public long loadingEndTime;
        public long loadingStartTime;
        public int statusCode;
        public String url;
        public String zcacheInfo;
        public int zcacheState;

        static {
            t2o.a(989856011);
        }

        public WVResource() {
        }
    }

    static {
        t2o.a(989856007);
    }

    public static /* synthetic */ String access$000(WVPageTracker wVPageTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17f38dda", new Object[]{wVPageTracker});
        }
        return wVPageTracker.mPid;
    }

    public static /* synthetic */ String access$100(WVPageTracker wVPageTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46a4f7f9", new Object[]{wVPageTracker});
        }
        return wVPageTracker.mPageUniqueIdentifier;
    }

    public static /* synthetic */ long access$200(WVPageTracker wVPageTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42ac137c", new Object[]{wVPageTracker})).longValue();
        }
        return wVPageTracker.mReceiveFirstPaintElapse;
    }

    public static /* synthetic */ long access$302(WVPageTracker wVPageTracker, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79c8640d", new Object[]{wVPageTracker, new Long(j)})).longValue();
        }
        wVPageTracker.mNavigationStartTS = j;
        return j;
    }

    public static /* synthetic */ String[] access$400(WVPageTracker wVPageTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("fcf8c8d9", new Object[]{wVPageTracker});
        }
        return wVPageTracker.stages;
    }

    public static /* synthetic */ void access$500(WVPageTracker wVPageTracker, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449590cf", new Object[]{wVPageTracker, str, new Long(j)});
        } else {
            wVPageTracker.onApmStaged(str, j);
        }
    }

    private void addEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39085c83", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.lock_event) {
            this.events.add(new Integer(i));
        }
    }

    private void addResource(String str, WVResource wVResource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832bda70", new Object[]{this, str, wVResource});
        } else if (str != null) {
            synchronized (this.lock_resource) {
                try {
                    if (this.resourcesMap.get(str) == null) {
                        this.resources.add(wVResource);
                        this.resourcesMap.put(str, wVResource);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void analyzeStates() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61ca8bf5", new Object[]{this});
            return;
        }
        onApmAddedStatistic("redirectCounts", this.redirectCounts - 1);
        long j = this.redirectExport;
        long j2 = this.redirectEntrance;
        long j3 = 0;
        if (j - j2 > 0) {
            j3 = j - j2;
        }
        onApmAddedStatistic("redirectTime", j3);
    }

    private boolean checkoutHash(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9930db09", new Object[]{this, str})).booleanValue();
        }
        if (str == null || (str2 = this.url) == null || str.equals(str2) || !urlWithoutFragment(str).equals(urlWithoutFragment(this.url))) {
            return false;
        }
        return true;
    }

    private void clearEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbd4a54", new Object[]{this});
            return;
        }
        synchronized (this.lock_event) {
            this.events.clear();
        }
    }

    private void clearResource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfd9082", new Object[]{this});
            return;
        }
        synchronized (this.lock_resource) {
            this.resources.clear();
            this.resourcesMap.clear();
        }
    }

    private long currentTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6d4161", new Object[]{this})).longValue();
        }
        return System.currentTimeMillis();
    }

    private boolean isPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06ae0ae", new Object[]{this, str})).booleanValue();
        }
        if (str.equals(this.url)) {
            return true;
        }
        return false;
    }

    private void onApmAddedProperty(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963a47a3", new Object[]{this, str, obj});
            return;
        }
        IPerformance iPerformance = this.performance;
        if (iPerformance != null && iPerformance.getPerformanceDelegate() != null) {
            this.performance.getPerformanceDelegate().recordProperties(str, obj);
        }
    }

    private void onApmAddedResidue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34cb151", new Object[]{this});
            return;
        }
        onApmStaged(this.stages[15], this.tti);
        analyzeResources();
        analyzeEvents();
        onResidueRecovered();
    }

    private void onApmAddedStatistic(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10597a4", new Object[]{this, str, new Long(j)});
            return;
        }
        IPerformance iPerformance = this.performance;
        if (iPerformance != null && iPerformance.getPerformanceDelegate() != null) {
            this.performance.getPerformanceDelegate().recordStatistics(str, j);
        }
    }

    private void onApmFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37c9d58", new Object[]{this});
            return;
        }
        IPerformance iPerformance = this.performance;
        if (iPerformance != null && iPerformance.getPerformanceDelegate() != null) {
            this.performance.getPerformanceDelegate().end();
        }
    }

    private void onApmStaged(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d12aeee", new Object[]{this, str, new Long(j)});
            return;
        }
        IPerformance iPerformance = this.performance;
        if (iPerformance != null && iPerformance.getPerformanceDelegate() != null) {
            this.performance.getPerformanceDelegate().recordStage(str, j);
        }
    }

    private void onApmStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b19349", new Object[]{this});
            return;
        }
        IPerformance iPerformance = this.performance;
        if (iPerformance != null && iPerformance.getPerformanceDelegate() != null) {
            this.performance.getPerformanceDelegate().start();
        }
    }

    private void onPropertyRecovered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df2e396", new Object[]{this});
            return;
        }
        this.jsErrorTimes = 0;
        this.redirectCounts = 0L;
        this.redirectEntrance = 0L;
    }

    private void onResidueRecovered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ebf8be", new Object[]{this});
            return;
        }
        onResourceRecovered();
        clearEvent();
        this.tti = 0L;
    }

    private void onResourceRecovered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3bca1fd", new Object[]{this});
        } else {
            clearResource();
        }
    }

    private void onStateRecovered() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6088b38", new Object[]{this});
        } else if (this.state == WVPageState.WVPageStateError) {
            this.state = WVPageState.WVPageStateInit;
        }
    }

    private void recordRedirectEntrance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5a742a", new Object[]{this});
        } else if (this.redirectEntrance == 0) {
            this.redirectEntrance = currentTime();
        }
    }

    private void recordRedirectExport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba56568", new Object[]{this});
        } else if (this.redirectExport == 0) {
            this.redirectExport = currentTime();
        }
    }

    private void recoverPageIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab595a3", new Object[]{this});
            return;
        }
        String str = this.mLastPageUniqueIdentifier;
        if (str != null) {
            this.mPageUniqueIdentifier = str;
            this.mLastPageUniqueIdentifier = null;
        }
    }

    public static void registerH5LifeCallback(PageStatusCallback pageStatusCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c0a5bf", new Object[]{pageStatusCallback});
        } else if (pageStatusCallback != null && !pageStatusCallbacks.contains(pageStatusCallback)) {
            pageStatusCallbacks.add(pageStatusCallback);
        }
    }

    public static void removeH5LifeCallback(PageStatusCallback pageStatusCallback) {
        List<PageStatusCallback> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9167be", new Object[]{pageStatusCallback});
        } else if (pageStatusCallback != null && (list = pageStatusCallbacks) != null) {
            list.remove(pageStatusCallback);
        }
    }

    private WVResource takeResource(String str) {
        WVResource wVResource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVResource) ipChange.ipc$dispatch("553e10c6", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        synchronized (this.lock_resource) {
            wVResource = this.resourcesMap.get(str);
        }
        return wVResource;
    }

    private void updatePageIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225a71c8", new Object[]{this});
            return;
        }
        this.mLastPageUniqueIdentifier = this.mPageUniqueIdentifier;
        pageIdentifier++;
        this.mPageUniqueIdentifier = this.mWebViewUniqueIdentifier + "-" + pageIdentifier;
    }

    private String urlWithoutFragment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c3a0846", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("#");
        if (indexOf == -1) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    private boolean usable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ab36d83", new Object[]{this})).booleanValue();
        }
        return bsw.b().a().g();
    }

    public void attachToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b23837", new Object[]{this});
        } else if (usable()) {
            onApmStaged(this.stages[20], currentTime());
        }
    }

    public void blockURLEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42a67e0", new Object[]{this});
        } else if (usable()) {
            long currentTime = currentTime();
            lcn.a(RVLLevel.Info, RVLOG_PAGE_MODEL).k("interceptEnd", this.mPageUniqueIdentifier).n(currentTime).f();
            onApmStaged(this.stages[4], currentTime);
        }
    }

    public void blockURLStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7bc8067", new Object[]{this});
        } else if (usable()) {
            long currentTime = currentTime();
            lcn.a(RVLLevel.Info, RVLOG_PAGE_MODEL).k("interceptStart", this.mPageUniqueIdentifier).n(currentTime).f();
            onApmStaged(this.stages[3], currentTime);
        }
    }

    public void creatActivity(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4245c765", new Object[]{this, new Long(j)});
        } else if (usable()) {
            onApmStaged(this.stages[19], j);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (usable()) {
            onApmAddedResidue();
            onApmStaged(this.stages[18], currentTime());
            onApmFinished();
        }
    }

    public String getPageIdentifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e709422b", new Object[]{this});
        }
        return this.mPageUniqueIdentifier;
    }

    public void onPageReceiveProperty(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b9cd3ed", new Object[]{this, jSONObject});
        } else {
            lcn.a(RVLLevel.Info, RVLOG_PAGE_MODEL).k(wua.KEY_PROPERTIES, this.mPageUniqueIdentifier).c(jSONObject).f();
        }
    }

    public void onPageReceiveStage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c4dfda", new Object[]{this, str});
        } else {
            lcn.a(RVLLevel.Info, RVLOG_PAGE_MODEL).k(str, this.mPageUniqueIdentifier).n(currentTime()).f();
        }
    }

    public void onPageReceivedCustomizedFSP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef790eca", new Object[]{this, new Long(j)});
        } else if (usable()) {
            onApmStaged(this.stages[21], j);
        }
    }

    public void onPageReceivedCustomizedStage(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778659f9", new Object[]{this, new Long(j), str});
        } else if (usable()) {
            onApmStaged(customizedStageIndentifier + "-" + str, j);
        }
    }

    public void onPageReceivedFP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c812ca4", new Object[]{this, new Long(j)});
        } else if (usable()) {
            if (this.mNavigationStartTS > 0) {
                lcn.a(RVLLevel.Info, RVLOG_PAGE_MODEL).k("firstPaint", this.mPageUniqueIdentifier).n(this.mNavigationStartTS + j).f();
            } else {
                this.mReceiveFirstPaintElapse = j;
            }
            onApmStaged(this.stages[13], j);
        }
    }

    public void onPageReceivedFSP(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca16de9", new Object[]{this, new Long(j)});
        } else if (usable()) {
            onApmStaged(this.stages[14], j);
        }
    }

    public void onPageReceivedJSError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcaded7", new Object[]{this});
        } else if (usable()) {
            this.jsErrorTimes++;
        }
    }

    public void onPageReceivedPerformanceTiming(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54729ef6", new Object[]{this, iWVWebView});
        } else {
            iWVWebView.evaluateJavascript("(function(performance){var timing=performance&&performance.timing;return timing&&JSON.stringify({ns:timing.navigationStart,fs:timing.fetchStart,rs:timing.requestStart,re:timing.responseEnd,ds:timing.domContentLoadedEventStart,dc:timing.domComplete,ls:timing.loadEventStart,le:timing.loadEventEnd})})(window.performance)", new ValueCallback<String>() { // from class: android.taobao.windvane.extra.performance2.WVPageTracker.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                        return;
                    }
                    String str2 = TextUtils.isEmpty(str) ? "{}" : str;
                    if (str2.startsWith("\"") && str2.endsWith("\"")) {
                        str2 = str2.substring(1, str2.length() - 1);
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str2.replace("\\", ""));
                        long optLong = jSONObject.optLong(NotificationStyle.NOTIFICATION_STYLE);
                        long optLong2 = jSONObject.optLong("rs");
                        long optLong3 = jSONObject.optLong("re");
                        long optLong4 = jSONObject.optLong("ds");
                        long optLong5 = jSONObject.optLong("dc");
                        long optLong6 = jSONObject.optLong(RVStartParams.KEY_LANDSCAPE_SHORT);
                        long optLong7 = jSONObject.optLong("le");
                        RVLLevel rVLLevel = RVLLevel.Info;
                        lcn.a(rVLLevel, WVPageTracker.RVLOG_PAGE_MODEL).k("navigationStart", WVPageTracker.access$100(WVPageTracker.this)).m(WVPageTracker.access$000(WVPageTracker.this)).n(optLong).f();
                        lcn.a(rVLLevel, WVPageTracker.RVLOG_PAGE_MODEL).k("requestStart", WVPageTracker.access$100(WVPageTracker.this)).n(optLong2).f();
                        lcn.a(rVLLevel, WVPageTracker.RVLOG_PAGE_MODEL).k("responseEnd", WVPageTracker.access$100(WVPageTracker.this)).n(optLong3).f();
                        lcn.a(rVLLevel, WVPageTracker.RVLOG_PAGE_MODEL).k("domComplete", WVPageTracker.access$100(WVPageTracker.this)).n(optLong5).f();
                        lcn.a(rVLLevel, WVPageTracker.RVLOG_PAGE_MODEL).k("domContentLoadedEventStart", WVPageTracker.access$100(WVPageTracker.this)).n(optLong4).f();
                        lcn.a(rVLLevel, WVPageTracker.RVLOG_PAGE_MODEL).k("loadEventStart", WVPageTracker.access$100(WVPageTracker.this)).n(optLong6).f();
                        lcn.a(rVLLevel, WVPageTracker.RVLOG_PAGE_MODEL).k("loadEventEnd", WVPageTracker.access$100(WVPageTracker.this)).n(optLong7).f();
                        if (WVPageTracker.access$200(WVPageTracker.this) > 0) {
                            lcn.a(rVLLevel, WVPageTracker.RVLOG_PAGE_MODEL).k("firstPaint", WVPageTracker.access$100(WVPageTracker.this)).n(WVPageTracker.access$200(WVPageTracker.this) + optLong).f();
                        } else {
                            WVPageTracker.access$302(WVPageTracker.this, optLong);
                        }
                        WVPageTracker wVPageTracker = WVPageTracker.this;
                        WVPageTracker.access$500(wVPageTracker, WVPageTracker.access$400(wVPageTracker)[6], optLong);
                        WVPageTracker wVPageTracker2 = WVPageTracker.this;
                        WVPageTracker.access$500(wVPageTracker2, WVPageTracker.access$400(wVPageTracker2)[7], jSONObject.optLong(RVStartParams.KEY_FULLSCREEN_SHORT));
                        WVPageTracker wVPageTracker3 = WVPageTracker.this;
                        WVPageTracker.access$500(wVPageTracker3, WVPageTracker.access$400(wVPageTracker3)[8], optLong3);
                        WVPageTracker wVPageTracker4 = WVPageTracker.this;
                        WVPageTracker.access$500(wVPageTracker4, WVPageTracker.access$400(wVPageTracker4)[9], jSONObject.optLong("ds"));
                        WVPageTracker wVPageTracker5 = WVPageTracker.this;
                        WVPageTracker.access$500(wVPageTracker5, WVPageTracker.access$400(wVPageTracker5)[10], jSONObject.optLong(RVStartParams.KEY_LANDSCAPE_SHORT));
                        WVPageTracker wVPageTracker6 = WVPageTracker.this;
                        WVPageTracker.access$500(wVPageTracker6, WVPageTracker.access$400(wVPageTracker6)[11], jSONObject.optLong("le"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void onPageReceivedT1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc322ef1", new Object[]{this, new Long(j)});
        } else if (usable()) {
            onApmStaged(this.stages[16], j);
        }
    }

    public void onPageReceivedT2(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cde70790", new Object[]{this, new Long(j)});
        } else if (usable()) {
            lcn.a(RVLLevel.Info, RVLOG_PAGE_MODEL).k("T2", this.mPageUniqueIdentifier).n(j).f();
        }
    }

    public void onPageReceivedTTI(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e63103", new Object[]{this, new Long(j)});
        } else if (usable() && j - this.tti <= 5000) {
            this.tti = j;
        }
    }

    public void onPageRenderProcessTerminate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b3f727", new Object[]{this, str});
        } else {
            lcn.a(RVLLevel.Warn, RVLOG_PAGE_MODEL).k("processTerminate", this.mPageUniqueIdentifier).n(currentTime()).f();
        }
    }

    public void onResourceFinished(String str, int i) {
        WVResource takeResource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab24d913", new Object[]{this, str, new Integer(i)});
        } else if (usable() && (takeResource = takeResource(str)) != null) {
            takeResource.loadingEndTime = currentTime();
            takeResource.dataSize = i;
            IPerformance iPerformance = this.performance;
            if (iPerformance != null && iPerformance.getPerformanceDelegate() != null) {
                this.performance.getPerformanceDelegate().onResourceFinished(str, i);
            }
        }
    }

    public void onResourceReceivedStatusCode(String str, String str2, int i) {
        WVResource takeResource;
        List<PageStatusCallback> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f34973b", new Object[]{this, str, str2, new Integer(i)});
        } else if (usable() && (takeResource = takeResource(str)) != null) {
            if (i == 302 && takeResource.isHTML && (list = pageStatusCallbacks) != null) {
                for (PageStatusCallback pageStatusCallback : list) {
                    try {
                        pageStatusCallback.onRedirect(str, str2);
                    } catch (Throwable unused) {
                    }
                }
            }
            takeResource.statusCode = i;
            IPerformance iPerformance = this.performance;
            if (!(iPerformance == null || iPerformance.getPerformanceDelegate() == null)) {
                this.performance.getPerformanceDelegate().onResourceReceivedStatusCode(str, i);
            }
        }
    }

    public void onResourceReceivedZCacheInfo(String str, String str2) {
        WVResource takeResource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c348bf", new Object[]{this, str, str2});
        } else if (usable() && (takeResource = takeResource(str)) != null) {
            takeResource.zcacheInfo = str2;
        }
    }

    public void onResourceReceivedZCacheState(String str, int i) {
        WVResource takeResource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb346d7", new Object[]{this, str, new Integer(i)});
        } else if (usable() && (takeResource = takeResource(str)) != null) {
            takeResource.zcacheState = i;
        }
    }

    public void onResourceStarted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd45445", new Object[]{this, str});
        } else if (usable()) {
            WVResource wVResource = new WVResource();
            wVResource.loadingStartTime = currentTime();
            wVResource.url = str;
            if (isPage(str)) {
                wVResource.isHTML = true;
            }
            addResource(str, wVResource);
            IPerformance iPerformance = this.performance;
            if (iPerformance != null && iPerformance.getPerformanceDelegate() != null) {
                this.performance.getPerformanceDelegate().onResourceStarted(str);
            }
        }
    }

    public void onWebViewNSREvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c2f115", new Object[]{this, new Integer(i)});
        } else if (usable()) {
            onApmAddedProperty("nativeSideRendering", Integer.valueOf(i));
        }
    }

    public void setPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52579a", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.mPid = str;
        }
    }

    public void setWebViewIdentifier(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0219fc", new Object[]{this, new Integer(i)});
            return;
        }
        this.mWebViewUniqueIdentifier = "WV_" + i;
        this.mPageUniqueIdentifier = this.mWebViewUniqueIdentifier + "-" + pageIdentifier;
    }

    private void onStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c60403a", new Object[]{this, new Integer(i)});
            return;
        }
        addEvent(i);
        WVPageState wVPageState = this.state;
        WVPageState wVPageState2 = WVPageState.WVPageStateError;
        if (wVPageState != wVPageState2) {
            if (wVPageState == WVPageState.WVPageStateStartLoad) {
                this.redirectCounts++;
            }
            WVPageState valueOf = WVPageState.valueOf(this.stateMachine[wVPageState.value()][i]);
            this.state = valueOf;
            if (valueOf == wVPageState2) {
                onApmAddedProperty("errorProcess", 1);
            }
        }
    }

    public void initEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecf88b2", new Object[]{this});
        } else if (usable()) {
            onApmStaged(this.stages[1], currentTime());
        }
    }

    public void initStart(IPerformance iPerformance, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7219601b", new Object[]{this, iPerformance, iWVWebView});
        } else if (usable()) {
            this.performance = iPerformance;
            this.webView = iWVWebView;
            updatePageIdentifier();
            long currentTime = currentTime();
            onApmStarted();
            onApmStaged(this.stages[0], currentTime);
            onApmAddedProperty("processName", x74.h(yaa.n));
        }
    }

    public void onPageReceivedError(IWVWebView iWVWebView, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613afa15", new Object[]{this, iWVWebView, str, new Integer(i)});
        } else if (usable()) {
            onStateChanged(4);
            onApmAddedProperty("errorCode", new Integer(i));
            onApmAddedProperty("errorMsg", str);
        }
    }

    public void onPageStarted(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2ae988", new Object[]{this, iWVWebView, str});
        } else if (usable()) {
            if (this.state == WVPageState.WVPageStateFinishLoad) {
                updatePageIdentifier();
                onApmAddedResidue();
                onApmFinished();
                onApmStarted();
                recordRedirectEntrance();
            }
            long currentTime = currentTime();
            if (vpw.commonConfig.c1) {
                icn n = lcn.a(RVLLevel.Info, RVLOG_PAGE_MODEL).m(this.mPid).k("startLoad", this.mPageUniqueIdentifier).a("url", str).n(currentTime);
                n.a("contentType", Integer.valueOf(ftw.g(str)));
                n.f();
            }
            onStateChanged(2);
            onApmStaged(this.stages[5], currentTime);
        }
    }

    public void shouldOverrideUrlLoading(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6e8481", new Object[]{this, iWVWebView, str});
        } else if (usable()) {
            this.url = str;
            lcn.a(RVLLevel.Info, RVLOG_PAGE_MODEL).k("redirect", this.mPageUniqueIdentifier).a("url", str).n(currentTime()).f();
            WVPageState wVPageState = this.state;
            if (wVPageState == WVPageState.WVPageStateFinishLoad || wVPageState == WVPageState.WVPageStateInit) {
                updatePageIdentifier();
                onApmAddedResidue();
                onApmFinished();
                onApmStarted();
                recordRedirectEntrance();
            }
            onStateChanged(1);
        }
    }

    public WVPageTracker() {
        usable();
    }

    private void analyzeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa073b8c", new Object[]{this});
            return;
        }
        synchronized (this.lock_event) {
            String str = "";
            for (int i = 0; i < this.events.size(); i++) {
                try {
                    str = str + this.events.get(i);
                } catch (Throwable th) {
                    throw th;
                }
            }
            onApmAddedProperty("routingEvent", str);
        }
    }

    public void onPageFinished(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224b7655", new Object[]{this, iWVWebView, str});
        } else if (usable()) {
            List<PageStatusCallback> list = pageStatusCallbacks;
            if (list != null) {
                for (PageStatusCallback pageStatusCallback : list) {
                    try {
                        pageStatusCallback.onPageFinish(str);
                    } catch (Throwable unused) {
                    }
                }
            }
            onStateChanged(3);
            if (!checkoutHash(str)) {
                recordRedirectExport();
                long currentTime = currentTime();
                lcn.a(RVLLevel.Info, RVLOG_PAGE_MODEL).k("finishLoad", this.mPageUniqueIdentifier).a("url", str).n(currentTime).f();
                onApmStaged(this.stages[12], currentTime);
                onApmAddedProperty("isFinished", new Integer(1));
                onApmAddedProperty(MonitorItemConstants.KEY_URL, str);
                onApmAddedStatistic("jsErrorTimes", this.jsErrorTimes);
                onPageReceivedPerformanceTiming(iWVWebView);
                analyzeStates();
                onStateRecovered();
                onPropertyRecovered();
            }
        }
    }

    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (usable()) {
            this.url = str;
            recordRedirectEntrance();
            long currentTime = currentTime();
            lcn.a(RVLLevel.Info, RVLOG_PAGE_MODEL).k("loadRequest", this.mPageUniqueIdentifier).m(this.mPid).a("url", str).n(currentTime).f();
            onStateChanged(0);
            onApmStaged(this.stages[2], currentTime);
            IWVWebView iWVWebView = this.webView;
            if (iWVWebView != null && iWVWebView.getUserAgentString() != null && this.webView.getUserAgentString().indexOf("Triver") != -1) {
                onApmAddedProperty("triver", 1);
            }
        }
    }

    private void analyzeResources() {
        WVPageTracker wVPageTracker;
        long j;
        int i;
        WVPageTracker wVPageTracker2 = this;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e777640", new Object[]{wVPageTracker2});
            return;
        }
        String str = "";
        long j2 = 0;
        int i3 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        while (i2 < wVPageTracker2.resources.size()) {
            WVResource wVResource = wVPageTracker2.resources.get(i2);
            if (wVResource == null) {
                v7t.d("WVPageTracker", " analyzeResources : resource为空！");
                i = i2;
            } else {
                long j8 = wVResource.loadingStartTime;
                i = i2;
                long j9 = wVResource.loadingEndTime;
                if (j8 < j9) {
                    j4 += j9 - j8;
                    j3++;
                }
                String valueOf = String.valueOf(wVResource.statusCode);
                if (valueOf.startsWith("2")) {
                    j5++;
                } else if (valueOf.startsWith("4") || valueOf.startsWith("5")) {
                    j6++;
                }
                if (wVResource.isHTML) {
                    int i4 = wVResource.zcacheState;
                    String str2 = wVResource.zcacheInfo;
                    i3 = i4;
                    str = str2 != null ? str2 : str;
                } else {
                    int i5 = wVResource.zcacheState;
                    if (i5 == 1) {
                        j2++;
                    } else if (i5 == 2) {
                        j2++;
                        j7++;
                    } else {
                        str = str;
                        i3 = i3;
                        i2 = i + 1;
                        wVPageTracker2 = this;
                    }
                    i3 = i3;
                    str = str;
                    i2 = i + 1;
                    wVPageTracker2 = this;
                }
            }
            i2 = i + 1;
            wVPageTracker2 = this;
        }
        if (j3 > 0) {
            j = j4 / j3;
            wVPageTracker = this;
        } else {
            wVPageTracker = this;
            j = 0;
        }
        wVPageTracker.onApmAddedStatistic("resourceTotalCount", wVPageTracker.resources.size());
        wVPageTracker.onApmAddedStatistic("resourceSuccessfulCount", j5);
        wVPageTracker.onApmAddedStatistic("resourceFailedCount", j6);
        wVPageTracker.onApmAddedStatistic("resourceAverageTime", j);
        wVPageTracker.onApmAddedStatistic("zcacheUsageCount", j2);
        wVPageTracker.onApmAddedStatistic("zcacheHitCount", j7);
        wVPageTracker.onApmAddedProperty("htmlZCacheState", Integer.valueOf(i3));
        wVPageTracker.onApmAddedProperty("htmlZCacheInfo", str);
    }
}
