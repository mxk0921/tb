package com.taobao.android.fluid;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.DefaultFluidInitialize;
import com.taobao.android.fluid.framework.DefaultFluidInstance;
import com.taobao.android.fluid.framework.adapter.IAdapter;
import com.taobao.android.fluid.framework.adapter.IEnvAdapter;
import com.taobao.android.fluid.framework.adapter.IHttpNetAdapter;
import com.taobao.android.fluid.framework.adapter.IImageAdapter;
import com.taobao.android.fluid.framework.adapter.ILocationAdapter;
import com.taobao.android.fluid.framework.adapter.ILoginAdapter;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.INavAdapter;
import com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter;
import com.taobao.android.fluid.framework.adapter.IShareAdapter;
import com.taobao.android.fluid.framework.adapter.IUTAdapter;
import com.taobao.android.fluid.framework.data.DataVersionManager;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import java.util.HashMap;
import java.util.Map;
import tb.a7m;
import tb.aps;
import tb.ar9;
import tb.dr9;
import tb.huh;
import tb.ir9;
import tb.lr9;
import tb.mr9;
import tb.nr9;
import tb.qe7;
import tb.ryr;
import tb.s0j;
import tb.t2o;
import tb.tr9;
import tb.vr9;
import tb.vrp;
import tb.zoc;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class FluidSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FLUID_SDK_FLAG = "isFluidSDK";
    public static final String FLUID_SDK_FLAG_VALUE = "1";
    private static final String METRIC_NAME = "firstScreen";
    private static final String SCENE_NAME = "Tab2";
    private static final String TAG = "FluidSDK";
    public static final int TBVS_VERSION = 31;
    public static final int TYPE_HUITUI = 10;
    private static Map<String, IAdapter> sAdapterMap;
    private static String sAppName;
    private static String sAppVersion;
    private static Context sContext;
    private static boolean sIsBetaAppPackage;
    private static boolean sIsDebug;
    public static final ar9 SDK_NOT_INIT = new ar9("SDK-1", "SDK 未初始化");
    public static final ar9 SDK_INIT_ERROR = new ar9("SDK-2", "SDK 初始化失败");
    private static final mr9 sPreloadInstanceManager = new mr9();
    private static final dr9 sInstanceManager = new dr9();
    private static boolean sIsInitialized = false;

    static {
        t2o.a(468713473);
        ensureFluidSDKInit();
    }

    private FluidSDK() {
    }

    public static void clearFluidInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25c942b9", new Object[0]);
        } else {
            sInstanceManager.a();
        }
    }

    public static void clearPreloadFluidInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa7dea", new Object[0]);
        } else {
            sPreloadInstanceManager.a();
        }
    }

    public static void clearPreloadTaskForContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45fa45a", new Object[]{context});
            return;
        }
        FluidInstance preloadRecommendTabInstance = getPreloadRecommendTabInstance(context);
        if (preloadRecommendTabInstance != null) {
            ir9.b("FluidSDK", preloadRecommendTabInstance + " 执行 clearPreloadTaskForContext 成功");
            ((IPreloadService) preloadRecommendTabInstance.getService(IPreloadService.class)).clearPreloadTaskForContext(preloadRecommendTabInstance, context);
        }
        clearFluidInstance();
        clearPreloadFluidInstance();
    }

    public static FluidInstance createFluidInstance(FluidInstanceConfig fluidInstanceConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("80550358", new Object[]{fluidInstanceConfig});
        }
        String bizName = fluidInstanceConfig.getBizName();
        String preloadBizName = FluidInstanceConfig.getPreloadBizName(bizName);
        boolean isPreloadInstance = fluidInstanceConfig.isPreloadInstance();
        boolean isTabInstance = fluidInstanceConfig.isTabInstance();
        ir9.b(mr9.TAG, "创建视频流实例，业务名称：" + bizName + "，预加载业务名称：" + preloadBizName + "，是否 TAB 实例：" + isTabInstance + "，是否预创建实例：" + isPreloadInstance);
        mr9 mr9Var = sPreloadInstanceManager;
        FluidInstance b = mr9Var.b(preloadBizName);
        if (b == null || !isTabInstance || b.getInstanceConfig().isTabInstance()) {
            DefaultFluidInstance defaultFluidInstance = new DefaultFluidInstance(fluidInstanceConfig);
            ir9.b(mr9.TAG, defaultFluidInstance + " 新的视频流实例已创建");
            if (isPreloadInstance) {
                mr9Var.c(preloadBizName, defaultFluidInstance);
            }
            if (isTabInstance) {
                sInstanceManager.c(bizName, defaultFluidInstance);
            }
            return defaultFluidInstance;
        }
        mr9Var.d(preloadBizName);
        b.updateInstanceConfig(fluidInstanceConfig);
        sInstanceManager.c(bizName, b);
        ir9.b(mr9.TAG, b + " 复用预加载实例已找到，更新实例配置");
        return b;
    }

    public static void doPreload(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8863546d", new Object[]{context, jSONObject});
            return;
        }
        FluidInstance preloadRecommendTabInstance = getPreloadRecommendTabInstance(context);
        if (preloadRecommendTabInstance != null) {
            ir9.b("FluidSDK", preloadRecommendTabInstance + " 执行 doPreload 成功");
            ((IPreloadService) preloadRecommendTabInstance.getService(IPreloadService.class)).doPreload(preloadRecommendTabInstance, context, jSONObject);
        }
    }

    private static void ensureFluidSDKInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38791425", new Object[0]);
        } else if (sIsInitialized) {
            ir9.b("FluidSDK", "FluidSDK 已经初始化，无需调用初始化方法");
        } else {
            ir9.b("FluidSDK", "FluidSDK 未初始化，补充初始化 SDK");
            DefaultFluidInitialize.init(null);
        }
    }

    private static <T extends IAdapter> T getAdapter(Class<? extends IAdapter> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((IAdapter) ipChange.ipc$dispatch("587a8eff", new Object[]{cls}));
        }
        String name = cls.getName();
        Map<String, IAdapter> map = sAdapterMap;
        if (map != null) {
            return (T) map.get(name);
        }
        ir9.b("FluidSDK", "查找 Adapter: " + cls.getName() + ", Fluid SDK 没有初始化");
        return null;
    }

    public static String getAppName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[0]);
        }
        return sAppName;
    }

    public static String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        return sAppVersion;
    }

    public static Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[0]);
        }
        return sContext;
    }

    public static IEnvAdapter getEnvAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IEnvAdapter) ipChange.ipc$dispatch("d6d6a184", new Object[0]);
        }
        return (IEnvAdapter) getAdapter(IEnvAdapter.class);
    }

    public static FluidInstance getFluidInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("de98d784", new Object[]{str});
        }
        return sInstanceManager.b(str);
    }

    public static double getFluidRemoteVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3df6773", new Object[0])).doubleValue();
        }
        return 8.0d;
    }

    public static IHttpNetAdapter getHttpNetAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHttpNetAdapter) ipChange.ipc$dispatch("e6f85714", new Object[0]);
        }
        return (IHttpNetAdapter) getAdapter(IHttpNetAdapter.class);
    }

    public static IImageAdapter getImageAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IImageAdapter) ipChange.ipc$dispatch("79607420", new Object[0]);
        }
        return (IImageAdapter) getAdapter(IImageAdapter.class);
    }

    public static ILocationAdapter getLocationAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILocationAdapter) ipChange.ipc$dispatch("edbeffe2", new Object[0]);
        }
        return (ILocationAdapter) getAdapter(ILocationAdapter.class);
    }

    public static ILoginAdapter getLoginAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILoginAdapter) ipChange.ipc$dispatch("8b01eb3c", new Object[0]);
        }
        return (ILoginAdapter) getAdapter(ILoginAdapter.class);
    }

    public static IMTopAdapter getMTopAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMTopAdapter) ipChange.ipc$dispatch("b5f60982", new Object[0]);
        }
        return (IMTopAdapter) getAdapter(IMTopAdapter.class);
    }

    public static INavAdapter getNavAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INavAdapter) ipChange.ipc$dispatch("356e6670", new Object[0]);
        }
        return (INavAdapter) getAdapter(INavAdapter.class);
    }

    public static FluidInstance getPreloadRecommendTabInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("ee99654a", new Object[]{context});
        }
        FluidInstance b = sPreloadInstanceManager.b(mr9.BIZ_NAME_RECOMMEND_TAB);
        if (b != null) {
            return b;
        }
        ir9.b(mr9.TAG, "没有预加载实例，创建新的预加载推荐TAB视频流实例");
        return createFluidInstance(nr9.INSTANCE.a(context));
    }

    public static FluidInstance getPreloadRecommendTabInstanceOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("19e9fa9e", new Object[0]);
        }
        return sPreloadInstanceManager.b(mr9.BIZ_NAME_RECOMMEND_TAB);
    }

    public static IRemoteConfigAdapter getRemoteConfigAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteConfigAdapter) ipChange.ipc$dispatch("6eb7e182", new Object[0]);
        }
        return (IRemoteConfigAdapter) getAdapter(IRemoteConfigAdapter.class);
    }

    public static IShareAdapter getShareAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IShareAdapter) ipChange.ipc$dispatch("cfd3fb28", new Object[0]);
        }
        return (IShareAdapter) getAdapter(IShareAdapter.class);
    }

    public static IUTAdapter getUTAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUTAdapter) ipChange.ipc$dispatch("b7320362", new Object[0]);
        }
        return (IUTAdapter) getAdapter(IUTAdapter.class);
    }

    public static void init(tr9 tr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a416f300", new Object[]{tr9Var});
        } else if (sIsInitialized) {
            ir9.b("FluidSDK", "Fluid SDK 初始化完成");
        } else {
            if (tr9Var.i() != null) {
                sContext = tr9Var.i().getApplicationContext();
            }
            sAppName = tr9Var.g();
            sAppVersion = tr9Var.h();
            sIsBetaAppPackage = vr9.c();
            sIsDebug = tr9Var.j();
            sAdapterMap = tr9Var.f();
            sIsInitialized = true;
        }
    }

    public static boolean isAppStorePackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cac50e7", new Object[0])).booleanValue();
        }
        return !isBetaAppPackage();
    }

    public static boolean isBetaAppPackage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1a7b5ca", new Object[0])).booleanValue();
        }
        return sIsBetaAppPackage;
    }

    public static boolean isDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        return sIsDebug;
    }

    public static boolean isRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b899ed88", new Object[0])).booleanValue();
        }
        if (isDebug() || vr9.d()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startWarmUp$1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7c7c79", new Object[0]);
        } else {
            DataVersionManager.n();
        }
    }

    public static void registerMessageHandler(String str, lr9 lr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60645999", new Object[]{str, lr9Var});
            return;
        }
        FluidInstance fluidInstance = getFluidInstance(str);
        if (fluidInstance == null) {
            ir9.b("FluidSDK", "注册 MessageHandler 失败，没有 bizName: " + str + " 对应的 FluidInstance");
            return;
        }
        IMessageService iMessageService = (IMessageService) fluidInstance.getService(IMessageService.class);
        if (iMessageService == null) {
            ir9.b("FluidSDK", "注册 MessageHandler 失败，消息服务 IMessageService 未注册");
            return;
        }
        iMessageService.registerMessageHandler(lr9Var);
        ir9.b("FluidSDK", fluidInstance + " 注册 MessageHandler 成功, messageHandler: " + lr9Var);
    }

    public static void removeFluidInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4efb2aac", new Object[]{str});
        } else {
            sInstanceManager.d(str);
        }
    }

    public static void sendMessage(String str, vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ab9897", new Object[]{str, vrpVar});
            return;
        }
        FluidInstance fluidInstance = getFluidInstance(str);
        if (fluidInstance == null) {
            ir9.b("FluidSDK", "发送消息失败，没有 bizName: " + str + " 对应的 FluidInstance， 消息：" + vrpVar);
            return;
        }
        IMessageService iMessageService = (IMessageService) fluidInstance.getService(IMessageService.class);
        if (iMessageService == null) {
            ir9.b("FluidSDK", "发送消息失败，消息服务 IMessageService 未注册，消息：" + vrpVar);
            return;
        }
        iMessageService.sendMessage(vrpVar);
        ir9.b("FluidSDK", fluidInstance + " 发送消息成功，消息：" + vrpVar);
    }

    public static JSONObject startRender(Context context, ViewGroup viewGroup, Uri uri, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1781818b", new Object[]{context, viewGroup, uri, str, new Boolean(z)});
        }
        FluidInstance preloadRecommendTabInstance = getPreloadRecommendTabInstance(context);
        if (preloadRecommendTabInstance == null) {
            return null;
        }
        ir9.b("FluidSDK", " 执行 startRender 成功。" + preloadRecommendTabInstance);
        return ((IPreloadService) preloadRecommendTabInstance.getService(IPreloadService.class)).startRender(preloadRecommendTabInstance, context, viewGroup, uri, str, z);
    }

    public static void startWarmUp(final Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d3f79c8", new Object[]{context, uri});
            return;
        }
        ryr.b(context, null, "warmup_in_fluidSDK");
        HashMap hashMap = new HashMap();
        hashMap.put("playerInitializedProxyGlobal", Boolean.valueOf(a7m.c()));
        if (aps.e()) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.qr9
                @Override // java.lang.Runnable
                public final void run() {
                    FluidSDK.lambda$startWarmUp$0(context);
                }
            });
        }
        if (aps.y()) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.rr9
                @Override // java.lang.Runnable
                public final void run() {
                    FluidSDK.lambda$startWarmUp$1();
                }
            });
        }
        if (aps.f() && (aps.x() || aps.w())) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.sr9
                @Override // java.lang.Runnable
                public final void run() {
                    FluidSDK.lambda$startWarmUp$2(context);
                }
            });
        }
        FluidInstance preloadRecommendTabInstance = getPreloadRecommendTabInstance(context);
        ((IPreloadService) preloadRecommendTabInstance.getService(IPreloadService.class)).startWarmUp(preloadRecommendTabInstance, context, uri);
        ir9.b("FluidSDK", preloadRecommendTabInstance + " 执行 startWarmUp 成功");
        ryr.d(context, null, "warmup_in_fluidSDK", hashMap);
    }

    public static void unRegisterMessageHandler(String str, lr9 lr9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2b612", new Object[]{str, lr9Var});
            return;
        }
        FluidInstance fluidInstance = getFluidInstance(str);
        if (fluidInstance == null) {
            ir9.b("FluidSDK", "注销 MessageHandler 失败，没有 bizName: " + str + " 对应的 FluidInstance");
            return;
        }
        IMessageService iMessageService = (IMessageService) fluidInstance.getService(IMessageService.class);
        if (iMessageService == null) {
            ir9.b("FluidSDK", "注销 MessageHandler 失败，消息服务 IMessageService 未注册");
            return;
        }
        iMessageService.unRegisterMessageHandler(lr9Var);
        ir9.b("FluidSDK", fluidInstance + " 注销 MessageHandler 成功, messageHandler: " + lr9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startWarmUp$0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a012dd0", new Object[]{context});
            return;
        }
        ryr.b(context, null, "cacheWarmup");
        zoc i = huh.h().i("Tab2", "firstScreen");
        String p = i != null ? i.p(s0j.MTS_TASK_INIT_DETAIL_CACHE) : null;
        ir9.b("FluidSDK", "warm up detailcache in preloadService");
        qe7.l();
        ir9.b("FluidSDK", "end warm up detailcache in preloadService");
        if (i != null) {
            i.f(p, true);
        }
        ryr.d(context, null, "cacheWarmup", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startWarmUp$2(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5a850e", new Object[]{context});
            return;
        }
        if (aps.w()) {
            zoc i = huh.h().i("Tab2", "firstScreen");
            String p = i != null ? i.p(s0j.MTS_TASK_INIT_DW_PROXY) : null;
            ir9.b("FluidSDK", "warm up player cache server in sdk warmup");
            a7m.d(context);
            ir9.b("FluidSDK", "end warm up player cache server sdk warmup");
            if (i != null) {
                i.f(p, true);
            }
        }
        if (aps.x()) {
            ir9.b("FluidSDK", "warm up player so in sdk warmup");
            zoc i2 = huh.h().i("Tab2", "firstScreen");
            String p2 = i2 != null ? i2.p(s0j.MTS_TASK_LOAD_LIBRARY) : null;
            try {
                z = TaobaoMediaPlayer.IsLoadLibrariesOnce();
            } catch (Exception unused) {
            }
            boolean isLibLoaded = TaobaoMediaPlayer.isLibLoaded();
            HashMap hashMap = new HashMap();
            hashMap.put("hasLoadSoRuned", Boolean.valueOf(z));
            hashMap.put("hasSoLoaded", Boolean.valueOf(isLibLoaded));
            ryr.b(context, null, "loadLibrariesOnce");
            TaobaoMediaPlayer.loadLibrariesOnce(null);
            ryr.d(context, null, "loadLibrariesOnce", hashMap);
            ir9.b("FluidSDK", "end warm up player so in sdk warmup,hasLoadSoRuned:" + z + ",hasSoLoaded:" + isLibLoaded);
            if (i2 != null) {
                i2.f(p2, true);
            }
        }
    }
}
