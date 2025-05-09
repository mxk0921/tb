package com.tmall.android.dai;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;
import com.taobao.mrt.MRT;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAIConfiguration;
import com.tmall.android.dai.adapter.DAIUserAdapter;
import com.tmall.android.dai.compute.DAIComputeService;
import com.tmall.android.dai.internal.compute.ServiceListener;
import com.tmall.android.dai.internal.config.b;
import com.tmall.android.dai.internal.featurecenter.FeatureCenterImpl;
import com.tmall.android.dai.internal.init.WalleInitBridgeJava;
import com.tmall.android.dai.internal.streamprocessing.WalleStreamListener;
import com.tmall.android.dai.internal.streamprocessing.WalleStreamSource;
import com.tmall.android.dai.internal.streamprocessing.WalleUtTrackerListener;
import com.tmall.android.dai.internal.util.DeviceInfos;
import com.tmall.android.dai.internal.windvane.WVDaiApiPlugin;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.tensorflow.contrib.tmall.sqlite.DbManager;
import org.tensorflow.contrib.tmall.task.TaskManager;
import tb.adt;
import tb.ajj;
import tb.av7;
import tb.bm8;
import tb.boa;
import tb.bzn;
import tb.cuv;
import tb.f45;
import tb.fsw;
import tb.g45;
import tb.gtf;
import tb.h45;
import tb.i2v;
import tb.iph;
import tb.iwt;
import tb.kgh;
import tb.kj1;
import tb.kjn;
import tb.kzo;
import tb.ld0;
import tb.lu0;
import tb.mdt;
import tb.ni7;
import tb.oqh;
import tb.pg1;
import tb.pi7;
import tb.pow;
import tb.psj;
import tb.qow;
import tb.ral;
import tb.t2o;
import tb.uh4;
import tb.vxa;
import tb.yww;
import tb.yxi;
import tb.zai;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DAI {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_COMPUTE_COMPLETE = "com.tmall.android.dai.intent.action.COMPUTE_COMPLETE";
    public static final String ACTION_INITIALIZE_COMPLETE = "com.tmall.android.dai.intent.action.INITIALIZE_COMPLETE";
    public static final String EXTRA_MODEL_NAME = "com.tmall.android.dai.intent.extra.MODEL_NAME";
    public static final String EXTRA_OUTPUT_DATA = "com.tmall.android.dai.intent.extra.OUTPUT_DATA";
    public static final String EXTRA_RESULT = "com.tmall.android.dai.intent.extra.RESULT";
    private static final String ODCP_SERVICEID = "ODCP";
    public static final int SDK_VERSION_CODE = 2;
    private static final String TAG = "DAI";
    public static final String WALLE_DOWNLOAD_ONLY = "__walle_inner_only_download";
    public static final String WALLE_INNER_EXTEND_ARGS = "__walle_inner_extend_args";
    public static final String WALLE_RESOURCE_DOWNLOAD = "com.alibaba.walle.resource_download";
    public static final HashMap<String, String> debugStatusMap = new HashMap<>();
    private static final Map<String, String> mSceneModelNameMap = new HashMap();
    private static final Map<Object, String> mKeyNameMap = new HashMap();
    private static final Map<Object, String> mAliasTriIdMap = new HashMap();
    private static ConcurrentHashMap<Object, String> mFeatureCenterTaskMap = new ConcurrentHashMap<>();
    private static volatile boolean available = false;
    private static Boolean degrade32Runtime = null;
    public static volatile boolean mInit = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DAI.initFeatureCenterInner();
            }
        }
    }

    static {
        t2o.a(1034944582);
    }

    private DAI() {
    }

    public static boolean check32RuntimeDegrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5679050", new Object[0])).booleanValue();
        }
        Boolean bool = degrade32Runtime;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (is64Runtime() || ral.e().j()) {
            degrade32Runtime = Boolean.FALSE;
            return false;
        }
        degrade32Runtime = Boolean.TRUE;
        return true;
    }

    public static JSONObject convertMrtTaskDescription(MRTTaskDescription mRTTaskDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("665dc5f0", new Object[]{mRTTaskDescription});
        }
        return null;
    }

    public static h45 getRegisteredModel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h45) ipChange.ipc$dispatch("83dea6c8", new Object[]{str});
        }
        return kzo.c().e().g(str);
    }

    public static h45 getRegisteredModelForAlias(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h45) ipChange.ipc$dispatch("842a7041", new Object[]{str});
        }
        if (mFeatureCenterTaskMap.contains(str)) {
            str2 = mFeatureCenterTaskMap.get(str);
        } else {
            str2 = mKeyNameMap.get(str);
        }
        return kzo.c().e().g(str2);
    }

    public static h45 getRegisteredModelForSceneName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h45) ipChange.ipc$dispatch("e52ddcfa", new Object[]{str});
        }
        String str2 = mSceneModelNameMap.get(str);
        if (str2 != null) {
            return getRegisteredModel(str2);
        }
        return null;
    }

    @Deprecated
    public static Collection<h45> getRegisteredModels() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("a44f35de", new Object[0]);
        }
        return kzo.c().e().a();
    }

    public static final synchronized Map<String, Object> getStatusInfo() {
        synchronized (DAI.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("7c7374b2", new Object[0]);
            }
            return qow.b();
        }
    }

    public static void initFeatureCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1f56c2", new Object[0]);
        } else {
            gtf.i().h().execute(new a());
        }
    }

    public static int initFeatureCenterInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79df3255", new Object[0])).intValue();
        }
        try {
            lu0.e("walle_feature_center", "feature_query", MeasureSet.create().addMeasure("feature_size"), DimensionSet.create().addDimension("feature_name").addDimension("task_name").addDimension("trigger_id"));
            FeatureCenterImpl.a();
            kgh.a(TAG, "initFeatureCenter success");
            return 1;
        } catch (Throwable th) {
            kgh.d(TAG, "initFeatureCenter.", th);
            initializeFailure(181, th.getMessage());
            lu0.d(TAG, 19999, "init_error", "java-c-data bridge", null, null);
            return -2;
        }
    }

    private static void initFinishedBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da121246", new Object[0]);
            return;
        }
        available = true;
        try {
            Intent intent = new Intent("com.tmall.android.dai.intent.action.INITIALIZE_COMPLETE");
            intent.setPackage(kzo.c().b().getPackageName());
            kzo.c().b().sendBroadcast(intent);
        } catch (Throwable th) {
            kgh.d(TAG, th.getMessage(), th);
        }
        iwt.e().k();
    }

    private static int initStreamProcessing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51585edd", new Object[0])).intValue();
        }
        if (!ral.e().m()) {
            return -2;
        }
        DeviceInfos.b();
        WalleStreamListener.getInstance().registerCallbackToStreamConstructor();
        WalleStreamSource.getInstance();
        WalleUtTrackerListener.a().c();
        return 1;
    }

    public static synchronized int initialNativeData() {
        synchronized (DAI.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dc8f58bf", new Object[0])).intValue();
            } else if (kzo.c().n()) {
                return 1;
            } else {
                DbManager.getInstance().initIfNeeded();
                kgh.a(TAG, "initialNativeData success");
                kzo.c().u(true);
                return 1;
            }
        }
    }

    public static synchronized int initialNativeTaskHandle() {
        synchronized (DAI.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9d293762", new Object[0])).intValue();
            } else if (kzo.c().o()) {
                return 1;
            } else {
                kgh.a(TAG, "initialNativeTaskHandle start");
                TaskManager.getInstance().addListener(new ServiceListener());
                mdt.e().c(8, new psj());
                mdt.e().c(9, new kjn());
                mdt.e().c(11, new ni7(kzo.c().b()));
                mdt.e().c(12, new bm8());
                mdt.e().c(13, new av7());
                mdt.e().c(17, new boa());
                mdt.e().c(18, new zai());
                mdt.e().c(19, new uh4());
                mdt.e().c(20, new adt() { // from class: tb.y35
                    @Override // tb.adt
                    public final Map a(Map map) {
                        Map lambda$initialNativeTaskHandle$1;
                        lambda$initialNativeTaskHandle$1 = DAI.lambda$initialNativeTaskHandle$1(map);
                        return lambda$initialNativeTaskHandle$1;
                    }
                });
                mdt.e().c(22, new yxi());
                mdt.e().c(24, new ajj());
                if (!ral.e().h()) {
                    kgh.a(TAG, "initialNativeTaskHandle onNativeInit");
                    TaskManager.getInstance().onNativeInit();
                }
                boolean equals = "true".equals(DAIKVStoreage.getValue("JARVIS", "featureUploadAllSwitch"));
                vxa.k(equals);
                TaskManager.getInstance().initializeMonitor(equals);
                kgh.a(TAG, "initialNativeTaskHandle addTaskInner success");
                kzo.c().v(true);
                kgh.a(TAG, "initialNativeTaskHandle success");
                return 1;
            }
        }
    }

    private static void initializeFailure(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19f790c", new Object[]{new Integer(i), str});
            return;
        }
        lu0.a("Business", "initialize", String.valueOf(i), str);
        kzo.c().s(true);
    }

    public static boolean is64Runtime() {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1ae6ddb", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        is64Bit = Process.is64Bit();
        return is64Bit;
    }

    public static boolean isAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[0])).booleanValue();
        }
        if (!available || !kzo.c().m()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$initialNativeTaskHandle$1(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("637c7dfb", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(pg1.ATOM_EXT_match, String.valueOf(kj1.a((String) map.get("crowd_ids"))));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initialize$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b64de0", new Object[0]);
            return;
        }
        initFinishedBroadcast();
        kgh.j(TAG, "[WalleInit] refactored Walle init finished");
        lu0.d(TAG, 19999, "WalleInit", "refactored Walle init finished", null, null);
        HashMap hashMap = new HashMap();
        hashMap.put("deviceLevel", pi7.a());
        lu0.d(TAG, 19999, "device_coverage", null, null, hashMap);
    }

    public static synchronized int loadBaseLib() {
        synchronized (DAI.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2f24c7a8", new Object[0])).intValue();
            } else if (kzo.c().l()) {
                kgh.a(TAG, "so is inited");
                return 1;
            } else {
                kgh.a(TAG, "loadBaseLib");
                Context b = kzo.c().b();
                if (b == null) {
                    b = pow.c().a();
                }
                if (b != null) {
                    AliNNPython.initialize(kzo.c().b());
                    AliNNPython.nativeRedirectStdioToLogCat();
                    kgh.a(TAG, "call python initialize()");
                } else if (!AliNNPython.isNewPythonEngine()) {
                    kgh.a(TAG, "python not load, context is null");
                    return -2;
                }
                kgh.a(TAG, "AliNNPython.isNewPythonEngine():" + AliNNPython.isNewPythonEngine());
                if (!AliNNPython.nativeAvailable()) {
                    kgh.c(TAG, "python not load failed2");
                    return -2;
                } else if (!bzn.d().c("walle_base").i()) {
                    return -3;
                } else {
                    kgh.a(TAG, "加载libwalle_base.so成功");
                    kzo.c().p(true);
                    return 1;
                }
            }
        }
    }

    public static int loadNativeDBBeforeStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("834fbc2", new Object[0])).intValue();
        }
        try {
            Integer num = (Integer) yww.b().f32397a.submit(new Callable() { // from class: tb.z35
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Integer loadNativeDBBeforeStartInner;
                    loadNativeDBBeforeStartInner = DAI.loadNativeDBBeforeStartInner();
                    return loadNativeDBBeforeStartInner;
                }
            }).get();
            kgh.a(TAG, "[WalleInit] loadNativeDBBeforeStart finished, return " + num);
            return num.intValue();
        } catch (Exception e) {
            kgh.d(TAG, "[WalleInit] loadNativeDBBeforeStartInner exception", e);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Integer loadNativeDBBeforeStartInner() {
        int loadBaseLib;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2ee6b95c", new Object[0]);
        }
        if (kzo.c().n()) {
            return 1;
        }
        ral.e().p(pow.c().a());
        if (ral.e().i() && !ral.e().l() && (loadBaseLib = loadBaseLib()) == 1 && WalleInitBridgeJava.a().b()) {
            WalleInitBridgeJava.a().d();
            return Integer.valueOf(loadBaseLib);
        }
        return -1;
    }

    public static DAIConfiguration.Builder newConfigurationBuilder(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DAIConfiguration.Builder) ipChange.ipc$dispatch("28718470", new Object[]{context});
        }
        return new DAIConfiguration.Builder(context);
    }

    public static void onBasicConfigUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb97d561", new Object[0]);
            return;
        }
        Context b = kzo.c().b();
        try {
            if (iph.a()) {
                kgh.a(TAG, "MNNBridge load success");
            } else {
                kgh.c(TAG, "MNNBridge load fail");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        HashMap<String, String> hashMap = debugStatusMap;
        hashMap.put("progress", "MNNPyBridgeLoaded");
        try {
            hashMap.put("UserTrackPlugin", "tryRegister");
            i2v.getInstance().registerPlugin(new cuv());
            hashMap.put("UserTrackPlugin", "registerSuccess");
            try {
                pow.d(b);
            } catch (Throwable th2) {
                kgh.d(TAG, "WADataCollector初始化失败.", th2);
            }
            try {
                fsw.h("WVDAIHandler", WVDaiApiPlugin.class);
            } catch (Throwable th3) {
                kgh.d(TAG, "WV插件注册失败。", th3);
            }
            HashMap<String, String> hashMap2 = debugStatusMap;
            hashMap2.put("UserTrackPlugin", "WVRegistered");
            lu0.c("Business", "initialize");
            HashMap hashMap3 = new HashMap();
            hashMap3.put("deviceLevel", pi7.a());
            lu0.d(TAG, 19999, "device_coverage", null, null, hashMap3);
            MRT.h(b);
            oqh.d().c(ral.e().c(), ral.e().d(), ODCP_SERVICEID);
            initFeatureCenter();
            hashMap2.put("progress", "FeatureCenterInited");
            available = true;
            try {
                gtf.i().l(b.getApplicationContext());
                Intent intent = new Intent("com.tmall.android.dai.intent.action.INITIALIZE_COMPLETE");
                intent.setPackage(kzo.c().b().getPackageName());
                kzo.c().b().sendBroadcast(intent);
            } catch (Throwable th4) {
                kgh.d(TAG, th4.getMessage(), th4);
            }
            iwt.e().k();
        } catch (Throwable th5) {
            debugStatusMap.put("UserTrackPlugin", "registerFailed");
            kgh.f(TAG, "UT插件注册失败。", th5);
            initializeFailure(97, th5.getMessage());
            lu0.d(TAG, 19999, "init_error", "ut plugin", null, null);
        }
    }

    public static boolean osSupport64() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cfcf954", new Object[0])).booleanValue();
        }
        if (Build.SUPPORTED_64_BIT_ABIS.length > 0) {
            return true;
        }
        return false;
    }

    public static void registerDAIModelInner(h45 h45Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0dbfa51", new Object[]{h45Var});
            return;
        }
        qow.d(h45Var.h(), true, "");
        kzo.c().e().b(h45Var);
        oqh.d().i(b.b(h45Var));
    }

    public static int registerModel(h45 h45Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f96a8d14", new Object[]{h45Var})).intValue();
        }
        if (h45Var == null) {
            kgh.c(TAG, "[registerModel] modelConfigMapdaiModel");
            return -1;
        }
        String str = h45Var.c;
        if (str != null) {
            mSceneModelNameMap.put(str, h45Var.h());
        }
        if (!TextUtils.isEmpty(h45Var.f20401a)) {
            mKeyNameMap.put(h45Var.f20401a, h45Var.h());
            mAliasTriIdMap.put(h45Var.f20401a, h45Var.l);
            if (!TextUtils.isEmpty(h45Var.e())) {
                mFeatureCenterTaskMap.put(h45Var.f20401a, h45Var.l);
            }
        }
        registerDAIModelInner(h45Var);
        return 0;
    }

    @Deprecated
    public static void runCompute(String str, Map<String, Object> map, DAICallback dAICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63e2720", new Object[]{str, map, dAICallback});
        } else {
            runComputeWithTriId(str, map, dAICallback, null);
        }
    }

    public static void runComputeByAlias(String str, Map<String, Object> map, DAICallback dAICallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29316e61", new Object[]{str, map, dAICallback});
        } else {
            runComputeByAliasWithTriId(str, map, dAICallback, null);
        }
    }

    public static void runComputeByAliasWithTriId(String str, Map<String, Object> map, DAICallback dAICallback, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6693a911", new Object[]{str, map, dAICallback, str2});
            return;
        }
        try {
            String str3 = mFeatureCenterTaskMap.get(str);
            if (TextUtils.isEmpty(str3)) {
                str3 = mKeyNameMap.get(str);
            }
            if (TextUtils.isEmpty(str3)) {
                if (dAICallback != null) {
                    dAICallback.onError(new DAIError(209, "model not register"));
                }
                kgh.a(TAG, "cannot found modelName,modelAlias:" + str);
                return;
            }
            if (str2 == null) {
                str2 = mAliasTriIdMap.get(str);
            }
            runComputeWithTriId(str3, map, dAICallback, str2);
        } catch (Throwable unused) {
        }
    }

    public static void runComputeWithTriId(String str, Map<String, Object> map, DAICallback dAICallback, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4870f2", new Object[]{str, map, dAICallback, str2});
            return;
        }
        try {
            if (ld0.c() != null) {
                kzo.c().e().h(str, map, DAIComputeService.TaskPriority.NORMAL, dAICallback, str2);
            } else if (dAICallback != null) {
                dAICallback.onError(new DAIError(83));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void unregisterModel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0cd0f1e", new Object[]{str});
        } else if (str != null) {
            kgh.b(TAG, "unregister model: ".concat(str));
            kzo.c().e().f(str);
            qow.c(str, "");
        }
    }

    public static synchronized void initialize(Context context, DAIConfiguration dAIConfiguration) {
        synchronized (DAI.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50dcb2de", new Object[]{context, dAIConfiguration});
                return;
            }
            kgh.j(TAG, "Walle DAI.initialize called");
            lu0.d(TAG, 19999, "init", null, null, null);
            int i = Build.VERSION.SDK_INT;
            if (context == null) {
                lu0.d(TAG, 19999, "init_error", "context", null, null);
                kgh.c(TAG, "context is null,initialize failed");
            } else if (dAIConfiguration == null) {
                lu0.d(TAG, 19999, "init_error", VideoControllerManager.ARRAY_KEY_CONFIGURATION, null, null);
                kgh.c(TAG, "configuration is null,initialize failed");
            } else {
                kzo.c().r(context);
                ral.e().p(context);
                if (!ral.e().i()) {
                    kzo.c().s(true);
                    kgh.c(TAG, "Orange开关未开，Walle降级");
                    lu0.d(TAG, 19999, "init_error", "orange", null, null);
                } else if (ral.e().l()) {
                    kzo.c().s(true);
                    kgh.c(TAG, "[WalleInit] lowDeviceDowngradeAll, Walle disabled!!!");
                    lu0.d(TAG, 19999, "init_error", "low_device_downgrade", null, null);
                } else {
                    if (check32RuntimeDegrade()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("support_64", String.valueOf(osSupport64()));
                        hashMap.put("sdk_version", String.valueOf(i));
                        lu0.d(TAG, 19999, "init_error", "degrade_32_bit", null, hashMap);
                    }
                    kzo.c().q(dAIConfiguration);
                    if (dAIConfiguration.getUserAdapterClass() != null) {
                        ld0.g(dAIConfiguration.getUserAdapterClass());
                    } else if (dAIConfiguration.getUserAdapter() != null) {
                        ld0.f(dAIConfiguration.getUserAdapter());
                    } else {
                        kgh.s(TAG, "UserAdapter is null!");
                        kzo.c().s(true);
                        lu0.d(TAG, 19999, "init_error", "user adapter", null, null);
                        return;
                    }
                    if (loadBaseLib() != 1) {
                        lu0.d(TAG, 19999, "init_error", "load so", null, null);
                        return;
                    }
                    if (ral.e().g()) {
                        kgh.s(TAG, "[WalleInit] Walle init rollbacked");
                        if (initialNativeTaskHandle() != -2) {
                            if (initialNativeData() != -2) {
                                mInit = true;
                                DAIUserAdapter c = ld0.c();
                                if (c != null) {
                                    vxa.i(kzo.c().b(), c.getTtid());
                                    debugStatusMap.put("progress", "HighwayClientInit");
                                } else {
                                    kgh.s(TAG, "highway client not init!");
                                    lu0.d(TAG, 19999, "init_error", "highway client", null, null);
                                }
                                initStreamProcessing();
                                debugStatusMap.put("progress", "BaseConfigCheck");
                                kzo.c().a().c();
                                kgh.j(TAG, "[WalleInit] rollbacked Walle init finished");
                                lu0.d(TAG, 19999, "WalleInit", "rollbacked Walle init finished", null, null);
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("deviceLevel", pi7.a());
                                lu0.d(TAG, 19999, "device_coverage", null, null, hashMap2);
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        yww.b().c();
                        yww.b().f32397a.execute(new Runnable() { // from class: tb.x35
                            @Override // java.lang.Runnable
                            public final void run() {
                                DAI.lambda$initialize$0();
                            }
                        });
                    }
                    mInit = true;
                }
            }
        }
    }

    @Deprecated
    public static void runCompute(String str, Map<String, Object> map, DAICallback dAICallback, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c9065", new Object[]{str, map, dAICallback, map2});
        } else {
            runComputeWithTriId(str, map, dAICallback, map2, (String) null);
        }
    }

    @Deprecated
    public static void runComputeByAlias(String str, Map<String, Object> map, f45 f45Var, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca2a12d", new Object[]{str, map, f45Var, map2});
        } else {
            runComputeByAliasWithTriId(str, map, f45Var, map2, null);
        }
    }

    public static void runCompute(String str, Map<String, Object> map, f45 f45Var, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c710482c", new Object[]{str, map, f45Var, map2});
        } else {
            runComputeWithTriId(str, map, f45Var, map2, (String) null);
        }
    }

    public static void runComputeWithTriId(String str, Map<String, Object> map, DAICallback dAICallback, Map<String, Object> map2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386b91e7", new Object[]{str, map, dAICallback, map2, str2});
            return;
        }
        if (map2 != null) {
            if (map == null) {
                try {
                    map = new HashMap<>();
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            }
            map.put(WALLE_INNER_EXTEND_ARGS, map2);
        }
        runComputeWithTriId(str, map, dAICallback, str2);
    }

    public static void runComputeWithTriId(String str, Map<String, Object> map, f45 f45Var, Map<String, Object> map2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a9f4fe", new Object[]{str, map, f45Var, map2, str2});
            return;
        }
        try {
            if (ld0.c() != null) {
                runComputeWithTriId(str, map, f45Var != null ? new g45(str, map, f45Var) : null, map2, str2);
            } else if (f45Var != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("code", 0);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("name", str);
                hashMap2.put("input", map);
                hashMap.put("model", hashMap2);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("code", 83);
                hashMap.put("error", hashMap3);
                f45Var.a(false, hashMap);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void runComputeByAliasWithTriId(String str, Map<String, Object> map, f45 f45Var, Map<String, Object> map2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2239035d", new Object[]{str, map, f45Var, map2, str2});
            return;
        }
        try {
            String str3 = mKeyNameMap.get(str);
            if (TextUtils.isEmpty(str3)) {
                if (f45Var != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("code", 0);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("name", str3);
                    hashMap2.put("input", map);
                    hashMap.put("model", hashMap2);
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("code", 209);
                    hashMap.put("error", hashMap3);
                    f45Var.a(false, hashMap);
                }
                kgh.a(TAG, "cannot found modelName,modelAlias:" + str);
                return;
            }
            runComputeWithTriId(str3, map, f45Var, map2, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
