package mtopsdk.mtop.intf;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.ali.user.open.mtop.UccRemoteLogin;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.abtest.ABTestCenter;
import com.taobao.analysis.scene.SceneIdentifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.global.init.IExtendMtopInitTask;
import mtopsdk.mtop.global.init.IMtopInitTask;
import mtopsdk.mtop.global.init.MtopInitTaskFactory;
import mtopsdk.mtop.network.NetworkPropertyService;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import tb.fp;
import tb.inx;
import tb.nr2;
import tb.nyn;
import tb.rid;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Mtop {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_PROCESS_NAME = "com.taobao.taobao:channel";
    public static final String MAIN_PROCESS_NAME = "com.taobao.taobao";
    private static final int MAX_PREFETCH_LENGTH = 50;
    private static final String MTOP_ID_ELEME = "MTOP_ID_ELEME";
    private static final String MTOP_ID_INNER = "INNER";
    private static final String MTOP_ID_KOUBEI = "MTOP_ID_KOUBEI";
    public static final String MTOP_ID_TAOBAO = "MTOP_ID_TAOBAO";
    private static final String MTOP_ID_XIANYU = "MTOP_ID_XIANYU";
    private static final String MTOP_SITE_ELEME = "eleme";
    private static final String MTOP_SITE_INNER = "taobao";
    private static final String MTOP_SITE_KOUBEI = "koubei";
    private static final String MTOP_SITE_XIANYU = "xianyu";
    private static final String TAG = "mtopsdk.Mtop";
    public static final String WIDGET_PROCESS_NAME = "com.taobao.taobao:widget";
    public static final String XIAOMI_WIDGET_PROCESS_NAME = "com.taobao.taobao:widgetProvider";
    public final byte[] initLock;
    public final IMtopInitTask initTask;
    private final String instanceId;
    private volatile boolean isInit;
    public volatile boolean isInited;
    public volatile boolean isLaunchFirstFrame;
    public volatile boolean isSignDegradeInited;
    public volatile long lastPrefetchResponseTime;
    public final byte[] launchOptLock;
    public final MtopConfig mtopConfig;
    private Map<String, MtopBuilder> prefetchBuilderMap;
    public final byte[] signDegradeInitLock;
    private int type;
    public static boolean mIsFullTrackValid = false;
    public static final Map<String, Mtop> instanceMap = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* renamed from: mtopsdk.mtop.intf.Mtop$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum;

        static {
            int[] iArr = new int[EnvModeEnum.values().length];
            $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum = iArr;
            try {
                iArr[EnvModeEnum.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.PREPARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[EnvModeEnum.TEST_SANDBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface Id {
        public static final String CUTE = "CUTE";
        public static final String INNER = "INNER";
        public static final String OPEN = "OPEN";
        public static final String PRODUCT = "PRODUCT";
        public static final String SSR = "SSR";

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public @interface Definition {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface Site {
        public static final String ELEME = "eleme";
        public static final String TAOBAO = "taobao";
        public static final String XIANYU = "xianyu";

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public @interface Definition {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface Type {
        public static final int CUTE = 3;
        public static final int INNER = 0;
        public static final int OPEN = 1;
        public static final int PRODUCT = 2;
        public static final int SSR = 4;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public @interface Definition {
        }
    }

    static {
        t2o.a(589299932);
    }

    private Mtop(String str, MtopConfig mtopConfig) {
        this.prefetchBuilderMap = new ConcurrentHashMap();
        this.lastPrefetchResponseTime = System.currentTimeMillis();
        this.isInit = false;
        this.isInited = false;
        this.isSignDegradeInited = false;
        this.initLock = new byte[0];
        this.signDegradeInitLock = new byte[0];
        this.launchOptLock = new byte[0];
        this.isLaunchFirstFrame = false;
        this.type = 0;
        this.instanceId = str;
        this.mtopConfig = mtopConfig;
        IMtopInitTask mtopInitTask = MtopInitTaskFactory.getMtopInitTask(str, 0);
        this.initTask = mtopInitTask;
        if (mtopInitTask != null) {
            try {
                IpChange ipChange = SceneIdentifier.$ipChange;
                IpChange ipChange2 = ABTestCenter.$ipChange;
                mIsFullTrackValid = true;
            } catch (Throwable unused) {
                mIsFullTrackValid = false;
            }
        } else {
            throw new RuntimeException("IMtopInitTask is null,instanceId=" + str);
        }
    }

    public static /* synthetic */ void access$000(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36433310", new Object[]{mtop});
        } else {
            mtop.executeCoreTask();
        }
    }

    public static /* synthetic */ boolean access$100(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b2bfb55", new Object[]{mtop})).booleanValue();
        }
        return mtop.checkLaunchFirstFrame();
    }

    public static /* synthetic */ String access$200(Mtop mtop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce16874e", new Object[]{mtop});
        }
        return mtop.instanceId;
    }

    public static Mtop getInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("56dd1313", new Object[]{str});
        }
        return getMtopInstance(str);
    }

    public static Mtop getInstanceWithAccountSite(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("4df1973b", new Object[]{str});
        }
        String instanceId = MtopAccountSiteUtils.getInstanceId(str);
        if (StringUtils.isBlank(instanceId)) {
            return null;
        }
        return getMtopInstance(instanceId);
    }

    @Deprecated
    public static Mtop getMtopInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("c7b26d2b", new Object[]{str});
        }
        if (!StringUtils.isNotBlank(str)) {
            str = "INNER";
        }
        return instanceMap.get(str);
    }

    @Deprecated
    public static Mtop instance(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("57c06ec3", new Object[]{context}) : instance(null, context, null);
    }

    @Deprecated
    public static void setAppKeyIndex(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17b256d9", new Object[]{new Integer(i), new Integer(i2)});
        } else {
            MtopSetting.setAppKeyIndex(i, i2);
        }
    }

    @Deprecated
    public static void setAppVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{str});
        } else {
            MtopSetting.setAppVersion(str);
        }
    }

    @Deprecated
    public static void setMtopDomain(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac98453", new Object[]{str, str2, str3});
        } else {
            MtopSetting.setMtopDomain(str, str2, str3);
        }
    }

    @Deprecated
    public static void setSecurityAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289de771", new Object[]{str});
        } else {
            MtopSetting.setSecurityAppKey(str);
        }
    }

    public void addPrefetchBuilderToMap(MtopBuilder mtopBuilder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84229281", new Object[]{this, mtopBuilder, str});
            return;
        }
        if (this.prefetchBuilderMap.size() >= 50) {
            MtopPrefetch.cleanPrefetchCache(mtopBuilder.mtopInstance);
        }
        if (this.prefetchBuilderMap.size() >= 50) {
            MtopPrefetch.onPrefetchAndCommit("TYPE_FULL", mtopBuilder.getMtopPrefetch(), mtopBuilder.getMtopContext(), null);
        }
        this.prefetchBuilderMap.put(str, mtopBuilder);
    }

    public MtopBuilder build(IMTOPDataObject iMTOPDataObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBuilder) ipChange.ipc$dispatch("afdc0349", new Object[]{this, iMTOPDataObject, str}) : new MtopBuilder(this, iMTOPDataObject, str);
    }

    public boolean checkMtopSDKInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd87b2e5", new Object[]{this})).booleanValue();
        }
        if (this.isInited) {
            return this.isInited;
        }
        synchronized (this.initLock) {
            try {
                if (!this.isInited) {
                    this.initLock.wait(60000L);
                    if (!this.isInited) {
                        TBSdkLog.e(TAG, this.instanceId + " [checkMtopSDKInit]Didn't call Mtop.instance(...),please execute global init.");
                    }
                }
            } catch (Exception e) {
                TBSdkLog.e(TAG, this.instanceId + " [checkMtopSDKInit] wait Mtop initLock failed---" + e.toString());
            }
        }
        return this.isInited;
    }

    public boolean checkMtopSDKSignDegradeInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3744b0aa", new Object[]{this})).booleanValue();
        }
        if (this.isSignDegradeInited) {
            return this.isSignDegradeInited;
        }
        synchronized (this.signDegradeInitLock) {
            try {
                if (!this.isSignDegradeInited) {
                    this.signDegradeInitLock.wait(20000L);
                    if (!this.isSignDegradeInited) {
                        TBSdkLog.e(TAG, this.instanceId + " [checkMtopSDKSignDegradeInit]Didn't call Mtop.instance(...),please execute global init.");
                    }
                }
            } catch (Exception e) {
                TBSdkLog.e(TAG, this.instanceId + " [checkMtopSDKSignDegradeInit] wait Mtop signDegradeInitLock failed---" + e.toString());
            }
        }
        return this.isSignDegradeInited;
    }

    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        return inx.d(this.instanceId, "deviceId");
    }

    public String getInstanceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        return this.instanceId;
    }

    public MtopConfig getMtopConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopConfig) ipChange.ipc$dispatch("9e59e092", new Object[]{this});
        }
        return this.mtopConfig;
    }

    public String getMultiAccountSid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50302a6b", new Object[]{this, str});
        }
        String str2 = this.instanceId;
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        return inx.d(StringUtils.concatStr(str2, str), "sid");
    }

    public String getMultiAccountUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abeacc1f", new Object[]{this, str});
        }
        String str2 = this.instanceId;
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        return inx.d(StringUtils.concatStr(str2, str), "uid");
    }

    public Map<String, MtopBuilder> getPrefetchBuilderMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("761d820a", new Object[]{this});
        }
        return this.prefetchBuilderMap;
    }

    @Deprecated
    public String getSid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("169fb061", new Object[]{this});
        }
        return getMultiAccountSid(null);
    }

    public String getTtid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        String d = inx.d(this.instanceId, "ttid");
        if (TextUtils.isEmpty(d)) {
            TBSdkLog.e(TAG, this.instanceId + " [getTtid] TTID is empty from XState");
            d = this.mtopConfig.ttid;
            if (!TextUtils.isEmpty(d)) {
                TBSdkLog.e(TAG, this.instanceId + "[getTtid]restore to XState, ttid=" + d);
                inx.m(this.instanceId, "ttid", d);
            }
        }
        return d;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.type;
    }

    @Deprecated
    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return getMultiAccountUserId(null);
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        return inx.c("utdid");
    }

    public boolean isInited() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae907f84", new Object[]{this})).booleanValue();
        }
        return this.isInited;
    }

    public Mtop logSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("62dc8aba", new Object[]{this, new Boolean(z)});
        }
        TBSdkLog.setPrintLog(z);
        return this;
    }

    public Mtop logout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("2cf134be", new Object[]{this});
        }
        return logoutMultiAccountSession(null);
    }

    public Mtop logoutMultiAccountSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("2c4abee6", new Object[]{this, str});
        }
        String str2 = this.instanceId;
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        String concatStr = StringUtils.concatStr(str2, str);
        inx.j(concatStr, "sid");
        inx.j(concatStr, "uid");
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            StringBuilder sb = new StringBuilder(32);
            sb.append(concatStr);
            sb.append(" [logout] remove sessionInfo succeed.");
            TBSdkLog.i(TAG, sb.toString());
        }
        NetworkPropertyService networkPropertyService = this.mtopConfig.networkPropertyService;
        if (networkPropertyService != null) {
            networkPropertyService.setUserId(null);
        }
        return this;
    }

    public Mtop registerDeviceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("5ad54dea", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopConfig.deviceId = str;
            inx.m(this.instanceId, "deviceId", str);
        }
        return this;
    }

    public Mtop registerMultiAccountSession(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("13e99c6b", new Object[]{this, str, str2, str3});
        }
        String str4 = this.instanceId;
        if (StringUtils.isBlank(str)) {
            str = "DEFAULT";
        }
        String concatStr = StringUtils.concatStr(str4, str);
        inx.m(concatStr, "sid", str2);
        inx.m(concatStr, "uid", str3);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(concatStr);
            sb.append(" [registerSessionInfo]register sessionInfo succeed: sid=");
            sb.append(str2);
            sb.append(",uid=");
            sb.append(str3);
            TBSdkLog.e(TAG, sb.toString());
        }
        NetworkPropertyService networkPropertyService = this.mtopConfig.networkPropertyService;
        if (networkPropertyService != null) {
            networkPropertyService.setUserId(str3);
        }
        return this;
    }

    @Deprecated
    public Mtop registerSessionInfo(String str, @Deprecated String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("2419a489", new Object[]{this, str, str2, str3}) : registerMultiAccountSession(null, str, str3);
    }

    public Mtop registerTtid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("55c4cb20", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopConfig.ttid = str;
            inx.m(this.instanceId, "ttid", str);
            NetworkPropertyService networkPropertyService = this.mtopConfig.networkPropertyService;
            if (networkPropertyService != null) {
                networkPropertyService.setTtid(str);
            }
        }
        return this;
    }

    public Mtop registerUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("c8e85dc1", new Object[]{this, str});
        }
        if (str != null) {
            this.mtopConfig.utdid = str;
            inx.l("utdid", str);
        }
        return this;
    }

    public Mtop setCoordinates(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("a5cd151b", new Object[]{this, str, str2});
        }
        inx.l(DispatchConstants.LONGTITUDE, str);
        inx.l(DispatchConstants.LATITUDE, str2);
        return this;
    }

    public void updateAppKeyIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e5b8972", new Object[]{this});
            return;
        }
        EnvModeEnum envModeEnum = this.mtopConfig.envMode;
        if (envModeEnum != null) {
            int i = AnonymousClass3.$SwitchMap$mtopsdk$mtop$domain$EnvModeEnum[envModeEnum.ordinal()];
            if (i == 1 || i == 2) {
                MtopConfig mtopConfig = this.mtopConfig;
                mtopConfig.appKeyIndex = mtopConfig.onlineAppKeyIndex;
            } else if (i == 3 || i == 4) {
                MtopConfig mtopConfig2 = this.mtopConfig;
                mtopConfig2.appKeyIndex = mtopConfig2.dailyAppkeyIndex;
            }
        }
    }

    private boolean checkLaunchFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bb74263", new Object[]{this})).booleanValue();
        }
        if (!"INNER".equals(this.instanceId)) {
            return true;
        }
        if (this.isLaunchFirstFrame) {
            return this.isLaunchFirstFrame;
        }
        synchronized (this.launchOptLock) {
            try {
                if (!this.isLaunchFirstFrame) {
                    TBSdkLog.e(TAG, this.instanceId + " [checkLaunchFirstFrame]wait to first frame.");
                    this.launchOptLock.wait(5000L);
                    TBSdkLog.e(TAG, this.instanceId + " [checkLaunchFirstFrame]isLaunchFirstFrame=" + this.isLaunchFirstFrame);
                }
            } catch (Exception e) {
                TBSdkLog.e(TAG, this.instanceId + " [checkFirstFrame] wait Mtop checkFirstFrame failed---" + e.toString());
            }
        }
        return this.isLaunchFirstFrame;
    }

    private void executeCoreTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0323860", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            synchronized (this.signDegradeInitLock) {
                try {
                    updateAppKeyIndex();
                    this.initTask.executeCoreTask(this.mtopConfig);
                } finally {
                    String str = TAG;
                    TBSdkLog.i(str, this.instanceId + " [init]do executeCoreTask cost[ms]: " + (System.currentTimeMillis() - currentTimeMillis));
                    this.isSignDegradeInited = true;
                    this.signDegradeInitLock.notifyAll();
                }
            }
        } catch (Throwable th) {
            TBSdkLog.e(TAG, this.instanceId + " [init]do executeCoreTask " + th.getMessage());
        }
    }

    private synchronized void init(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624f99b", new Object[]{this, context, str});
        } else if (!this.isInit) {
            if (context == null) {
                TBSdkLog.e(TAG, this.instanceId + " [init] The Parameter context can not be null.");
                return;
            }
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i(TAG, this.instanceId + " [init] context=" + context + ", ttid=" + str);
            }
            this.mtopConfig.context = context.getApplicationContext();
            if (StringUtils.isNotBlank(str)) {
                this.mtopConfig.ttid = str;
            }
            MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.mtop.intf.Mtop.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        synchronized (Mtop.this.initLock) {
                            long currentTimeMillis = System.currentTimeMillis();
                            Mtop.access$000(Mtop.this);
                            Mtop.access$100(Mtop.this);
                            Mtop mtop = Mtop.this;
                            IMtopInitTask iMtopInitTask = mtop.initTask;
                            if (iMtopInitTask instanceof IExtendMtopInitTask) {
                                ((IExtendMtopInitTask) iMtopInitTask).executeSignTask(mtop.mtopConfig);
                            }
                            MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.mtop.intf.Mtop.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    try {
                                        Mtop mtop2 = Mtop.this;
                                        mtop2.initTask.executeExtraTask(mtop2.mtopConfig);
                                    } catch (Throwable th) {
                                        TBSdkLog.e(Mtop.TAG, Mtop.access$200(Mtop.this) + " [init] executeExtraTask error.", th);
                                    }
                                }
                            });
                            TBSdkLog.i(Mtop.TAG, Mtop.access$200(Mtop.this) + " [init]do executeAllTask cost[ms]: " + (System.currentTimeMillis() - currentTimeMillis));
                            Mtop.this.isInited = true;
                            Mtop.this.initLock.notifyAll();
                        }
                    } catch (Exception e) {
                        TBSdkLog.e(Mtop.TAG, Mtop.access$200(Mtop.this) + " [init] executeCoreTask error.", e);
                    }
                }
            });
            this.isInit = true;
        }
    }

    @Deprecated
    public static Mtop instance(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("d87e94b9", new Object[]{context, str}) : instance(null, context, str);
    }

    public MtopBuilder build(MtopRequest mtopRequest, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBuilder) ipChange.ipc$dispatch("90e04d1c", new Object[]{this, mtopRequest, str}) : new MtopBuilder(this, mtopRequest, str);
    }

    public Mtop registerSessionInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("e09ed293", new Object[]{this, str, str2}) : registerMultiAccountSession(null, str, str2);
    }

    public void setLaunchFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3989e8b9", new Object[]{this});
        } else if ("INNER".equals(this.instanceId)) {
            try {
                synchronized (this.launchOptLock) {
                    this.isLaunchFirstFrame = true;
                    this.launchOptLock.notifyAll();
                }
            } catch (Throwable th) {
                TBSdkLog.e(TAG, this.instanceId + " [init]do executeCoreTask " + th.getMessage());
            }
        }
    }

    public void unInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec0ab50", new Object[]{this});
            return;
        }
        this.isInited = false;
        this.isInit = false;
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i(TAG, this.instanceId + "[unInit] MTOPSDK unInit called");
        }
    }

    private static void channelLazyConfig(Context context, Mtop mtop) {
        String str;
        if (SwitchConfig.getInstance().getEnableChannelLazy() && "com.taobao.taobao:channel".equals(MtopUtils.getCurrentProcessName(context))) {
            String instanceId = mtop.getInstanceId();
            if ("INNER".equals(instanceId)) {
                MtopAccountSiteUtils.bindInstanceId("INNER", "taobao");
                return;
            }
            String str2 = MTOP_ID_ELEME;
            if (str2.equals(instanceId)) {
                str = "eleme";
            } else {
                str2 = MTOP_ID_XIANYU;
                if (str2.equals(instanceId)) {
                    str = "xianyu";
                } else {
                    str2 = MTOP_ID_KOUBEI;
                    if (str2.equals(instanceId)) {
                        str = MTOP_SITE_KOUBEI;
                    } else {
                        str2 = "";
                        str = str2;
                    }
                }
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                MtopAccountSiteUtils.bindInstanceId(str2, str);
                try {
                    nyn.f(mtop, (rid) UccRemoteLogin.class.getMethod("getUccLoginImplWithSite", String.class).invoke(null, str));
                } catch (ClassNotFoundException e) {
                    TBSdkLog.e(TAG, e.toString());
                } catch (IllegalAccessException e2) {
                    TBSdkLog.e(TAG, e2.toString());
                } catch (NoSuchMethodException e3) {
                    TBSdkLog.e(TAG, e3.toString());
                } catch (InvocationTargetException e4) {
                    TBSdkLog.e(TAG, e4.toString());
                }
            }
        }
    }

    public static Mtop instance(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Mtop) ipChange.ipc$dispatch("c02b2d8d", new Object[]{str, context}) : instance(str, context, null);
    }

    @Deprecated
    public MtopBuilder build(Object obj, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopBuilder) ipChange.ipc$dispatch("d5db1fc7", new Object[]{this, obj, str}) : new MtopBuilder(this, obj, str);
    }

    public boolean removeCacheBlock(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cde6eb24", new Object[]{this, str})).booleanValue();
        }
        nr2 nr2Var = this.mtopConfig.cacheImpl;
        return nr2Var != null && ((fp) nr2Var).f(str);
    }

    public boolean removeCacheItem(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("931b26b0", new Object[]{this, str, str2})).booleanValue();
        }
        if (StringUtils.isBlank(str2)) {
            TBSdkLog.e(TAG, "[removeCacheItem] remove CacheItem failed,invalid cacheKey=" + str2);
            return false;
        }
        nr2 nr2Var = this.mtopConfig.cacheImpl;
        return nr2Var != null && ((fp) nr2Var).g(str, str2);
    }

    public Mtop switchEnvMode(final EnvModeEnum envModeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("fa489261", new Object[]{this, envModeEnum});
        }
        if (envModeEnum != null) {
            MtopConfig mtopConfig = this.mtopConfig;
            if (mtopConfig.envMode != envModeEnum) {
                if (MtopUtils.isApkDebug(mtopConfig.context) || this.mtopConfig.isAllowSwitchEnv.compareAndSet(true, false)) {
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.i(TAG, this.instanceId + " [switchEnvMode]MtopSDK switchEnvMode called.envMode=" + envModeEnum);
                    }
                    MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.mtop.intf.Mtop.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            Mtop.this.checkMtopSDKInit();
                            if (Mtop.this.mtopConfig.envMode == envModeEnum) {
                                TBSdkLog.i(Mtop.TAG, Mtop.access$200(Mtop.this) + " [switchEnvMode] Current EnvMode matches target EnvMode,envMode=" + envModeEnum);
                                return;
                            }
                            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                                TBSdkLog.i(Mtop.TAG, Mtop.access$200(Mtop.this) + " [switchEnvMode]MtopSDK switchEnvMode start");
                            }
                            Mtop mtop = Mtop.this;
                            mtop.mtopConfig.envMode = envModeEnum;
                            try {
                                mtop.updateAppKeyIndex();
                                if (EnvModeEnum.ONLINE == envModeEnum) {
                                    TBSdkLog.setPrintLog(false);
                                }
                                Mtop mtop2 = Mtop.this;
                                mtop2.initTask.executeCoreTask(mtop2.mtopConfig);
                                Mtop mtop3 = Mtop.this;
                                IMtopInitTask iMtopInitTask = mtop3.initTask;
                                if (iMtopInitTask instanceof IExtendMtopInitTask) {
                                    ((IExtendMtopInitTask) iMtopInitTask).executeSignTask(mtop3.mtopConfig);
                                }
                                Mtop mtop4 = Mtop.this;
                                mtop4.initTask.executeExtraTask(mtop4.mtopConfig);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                                TBSdkLog.i(Mtop.TAG, Mtop.access$200(Mtop.this) + " [switchEnvMode]MtopSDK switchEnvMode end. envMode =" + envModeEnum);
                            }
                        }
                    });
                } else {
                    TBSdkLog.e(TAG, this.instanceId + " [switchEnvMode]release package can switch environment only once!");
                    return this;
                }
            }
        }
        return this;
    }

    public boolean unintallCacheBlock(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd87b5cb", new Object[]{this, str})).booleanValue();
        }
        nr2 nr2Var = this.mtopConfig.cacheImpl;
        return nr2Var != null && ((fp) nr2Var).h(str);
    }

    public static Mtop instance(String str, Context context, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("7766f503", new Object[]{str, context, str2});
        }
        if (!StringUtils.isNotBlank(str)) {
            str = "INNER";
        }
        Map<String, Mtop> map = instanceMap;
        Mtop mtop = map.get(str);
        if (mtop == null) {
            synchronized (Mtop.class) {
                try {
                    mtop = map.get(str);
                    if (mtop == null) {
                        MtopConfig mtopConfig = MtopSetting.mtopConfigMap.get(str);
                        if (mtopConfig == null) {
                            mtopConfig = new MtopConfig(str);
                        }
                        Mtop mtop2 = new Mtop(str, mtopConfig);
                        mtopConfig.mtopInstance = mtop2;
                        map.put(str, mtop2);
                        channelLazyConfig(context, mtop2);
                        mtop = mtop2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!mtop.isInit) {
            mtop.init(context, str2);
        }
        return mtop;
    }

    public static Mtop instance(String str, Context context, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("c09720f8", new Object[]{str, context, str2, new Integer(i)});
        }
        if (!StringUtils.isNotBlank(str)) {
            str = "INNER";
        }
        Map<String, Mtop> map = instanceMap;
        Mtop mtop = map.get(str);
        if (mtop == null) {
            synchronized (Mtop.class) {
                try {
                    mtop = map.get(str);
                    if (mtop == null) {
                        MtopConfig mtopConfig = MtopSetting.mtopConfigMap.get(str);
                        if (mtopConfig == null) {
                            mtopConfig = new MtopConfig(str);
                        }
                        Mtop mtop2 = new Mtop(str, i, mtopConfig);
                        mtopConfig.mtopInstance = mtop2;
                        map.put(str, mtop2);
                        channelLazyConfig(context, mtop2);
                        mtop = mtop2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!mtop.isInit) {
            mtop.init(context, str2);
        }
        return mtop;
    }

    private Mtop(String str, int i, MtopConfig mtopConfig) {
        this.prefetchBuilderMap = new ConcurrentHashMap();
        this.lastPrefetchResponseTime = System.currentTimeMillis();
        this.isInit = false;
        this.isInited = false;
        this.isSignDegradeInited = false;
        this.initLock = new byte[0];
        this.signDegradeInitLock = new byte[0];
        this.launchOptLock = new byte[0];
        this.isLaunchFirstFrame = false;
        this.instanceId = str;
        this.mtopConfig = mtopConfig;
        this.type = i;
        IMtopInitTask mtopInitTask = MtopInitTaskFactory.getMtopInitTask(str, i);
        this.initTask = mtopInitTask;
        if (mtopInitTask != null) {
            try {
                IpChange ipChange = SceneIdentifier.$ipChange;
                IpChange ipChange2 = ABTestCenter.$ipChange;
                mIsFullTrackValid = true;
            } catch (Throwable unused) {
                mIsFullTrackValid = false;
            }
        } else {
            throw new RuntimeException("IMtopInitTask is null,instanceId=" + str);
        }
    }

    public static Mtop instance(String str, Context context, String str2, int i, MtopConfig mtopConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("2cb18455", new Object[]{str, context, str2, new Integer(i), mtopConfig});
        }
        if (!StringUtils.isNotBlank(str)) {
            str = "INNER";
        }
        Map<String, Mtop> map = instanceMap;
        Mtop mtop = map.get(str);
        if (mtop == null) {
            synchronized (Mtop.class) {
                try {
                    mtop = map.get(str);
                    if (mtop == null) {
                        MtopConfig mtopConfig2 = MtopSetting.mtopConfigMap.get(str);
                        if (mtopConfig2 != null) {
                            mtopConfig = mtopConfig2;
                        } else if (mtopConfig == null) {
                            mtopConfig = new MtopConfig(str);
                        }
                        mtop = new Mtop(str, i, mtopConfig);
                        mtopConfig.mtopInstance = mtop;
                        map.put(str, mtop);
                        channelLazyConfig(context, mtop);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!mtop.isInit) {
            mtop.init(context, str2);
        }
        return mtop;
    }
}
