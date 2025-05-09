package android.taobao.windvane.extra.uc;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.core.WVRunningCoreInfo;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.startup.UCInitializerInfo;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.task.ITaskExecutor;
import com.uc.webview.export.extension.GlobalSettings;
import com.uc.webview.export.extension.IRunningCoreInfo;
import com.uc.webview.export.extension.IStatsHandler;
import com.uc.webview.export.extension.JSILoader;
import com.uc.webview.export.extension.SettingKeys;
import com.uc.webview.export.extension.U4Engine;
import com.uc.webview.export.extension.UCPlayer;
import java.io.File;
import java.util.ArrayList;
import tb.au4;
import tb.bf1;
import tb.mrt;
import tb.oba;
import tb.r9u;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.wpw;
import tb.x74;
import tb.xsw;
import tb.y71;
import tb.yaa;
import tb.ypw;
import tb.ysw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class UCSetupService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UCSetupService";
    private static volatile boolean sHasConfigSettingsBeforeInit = false;
    private static final Object CONFIG_BEFORE_INIT_LOCK = new Object();

    static {
        t2o.a(989856080);
    }

    public static void configGlobalSettings() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b2254f", new Object[0]);
            return;
        }
        wpw wpwVar = vpw.commonConfig;
        GlobalSettings.set(SettingKeys.UCCookieType, wpwVar.g0);
        GlobalSettings.set(SettingKeys.FFMpegAudioDecoderSoPaths, wpwVar.D);
        GlobalSettings.set(SettingKeys.CachePageNumber, wpwVar.i.h);
        GlobalSettings.set(SettingKeys.JsEvalVerboseBacktrace, true);
        String str2 = SettingKeys.EmbedViewReattachList;
        if (Build.VERSION.SDK_INT >= 29) {
            str = wpwVar.i.c;
        } else {
            str = "map";
        }
        GlobalSettings.set(str2, str);
        GlobalSettings.set(SettingKeys.EmbedViewEmbedSurfaceEnableList, wpwVar.i.b);
        GlobalSettings.set(SettingKeys.FocusAutoPopupInputWhitelist, wpwVar.i.f26278a);
        GlobalSettings.set(SettingKeys.DiscardableLimitBytes, wpwVar.i.i);
        GlobalSettings.set(SettingKeys.DiscardableReleaseFreeAfterTimeSwitch, wpwVar.i.j);
        GlobalSettings.set(SettingKeys.DiscardableReleaseFreeAfterSecond, wpwVar.i.k);
        GlobalSettings.set(SettingKeys.DiscardableReleaseFreeUntilByte, wpwVar.i.l);
        GlobalSettings.set(SettingKeys.GrDiscardableLimitByte, wpwVar.i.m);
        GlobalSettings.set(SettingKeys.GrResourceCacheLimitByte, wpwVar.i.n);
        if (wpwVar.x2) {
            GlobalSettings.set(SettingKeys.AudioOutputUseAAudio, true);
        }
        try {
            v7t.i(TAG, "set audio output use aaudio: " + wpwVar.x2);
            String str3 = ypw.b().b;
            if (!TextUtils.isEmpty(str3)) {
                v7t.i(TAG, "set cookie black list = " + str3 + " to uc");
                GlobalSettings.set(SettingKeys.CookiesBlacklistForJs, str3);
            }
        } catch (Throwable unused) {
        }
    }

    public static void configUCSettingsBeforeInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa393aa9", new Object[0]);
        } else if (!sHasConfigSettingsBeforeInit) {
            synchronized (CONFIG_BEFORE_INIT_LOCK) {
                if (!sHasConfigSettingsBeforeInit) {
                    r9u.b("configUCSettingsBeforeInit");
                    wpw wpwVar = vpw.commonConfig;
                    if (wpwVar.C1) {
                        GlobalSettings.set(SettingKeys.SdkInitWebViewMaxWaitMillis, wpwVar.D1);
                        GlobalSettings.set(SettingKeys.SdkInitFailedAndFallbackSystem, true);
                        GlobalSettings.set(SettingKeys.SdkEnableDlClassLoader, true);
                        GlobalSettings.set(SettingKeys.SdkInitWithCpuSched, false);
                        GlobalSettings.set(SettingKeys.EnableBindPerformanceCore, true);
                        GlobalSettings.set(SettingKeys.SdkEnableCoreDexVrErrOptFor12, false);
                        GlobalSettings.set(SettingKeys.SdkEnablePldCkMgr, true);
                    }
                    UCLog.getInstance().init(true);
                    sHasConfigSettingsBeforeInit = true;
                    r9u.d();
                }
            }
        }
    }

    private static String getMultiProcessPrivateDataDirectorySuffix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47cc43fc", new Object[0]);
        }
        if (isMainProcess()) {
            return "";
        }
        String substring = x74.h(yaa.n).substring(yaa.n.getPackageName().length() + 1);
        if (!TextUtils.isEmpty(substring)) {
            return substring;
        }
        String h = x74.h(yaa.n);
        throw new RuntimeException("UCSetupService getMultiProcessPrivateDataDirectorySuffix failure! Subprocess name: " + h + " illegal.");
    }

    public static void initU4ByCompressedLib(Context context, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ce25c6", new Object[]{context, strArr, str});
        } else {
            initU4(context, strArr, null, str, null);
        }
    }

    public static void initU4ByDownload(Context context, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822ed816", new Object[]{context, strArr, str});
        } else {
            initU4(context, strArr, null, null, str);
        }
    }

    public static void initU4ByExtractedDir(Context context, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bcf6adb", new Object[]{context, strArr, str});
        } else {
            initU4(context, strArr, str, null, null);
        }
    }

    public static void initUCPlayerByInner(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d947d5b1", new Object[]{str});
            return;
        }
        v7t.a(TAG, "initUCPlayerByInner libPath:" + str);
        UCPlayer.setLibPath(str);
    }

    private static boolean isMainProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b74977", new Object[0])).booleanValue();
        }
        boolean l = x74.l(yaa.n);
        v7t.i(TAG, "是否在主进程:" + l);
        return l;
    }

    public static boolean isU4MultiProcess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c34c16c6", new Object[]{context})).booleanValue();
        }
        String h = x74.h(context);
        String packageName = context.getPackageName();
        if (!TextUtils.equals(h, packageName + ":sandboxed_privilege_process0")) {
            if (!TextUtils.equals(h, packageName + ":sandboxed_process0")) {
                if (!TextUtils.equals(h, packageName + ":gpu_process")) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void preInit(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5ebfae", new Object[]{context});
        } else {
            mrt.a().execute(new Runnable() { // from class: android.taobao.windvane.extra.uc.UCSetupService.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        U4Engine.createInitializer();
                        U4Engine.getRunningDir(context, false);
                    } catch (Throwable th) {
                        v7t.e(UCSetupService.TAG, "preInit failed", th, new Object[0]);
                    }
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class DownloadController {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final boolean ENABLE_RESUME = false;
        private static DownloadController sInstance;
        private final ArrayList<U4Engine.IDownloadHandle> mDelayedTasks = null;

        static {
            t2o.a(989856086);
        }

        public static DownloadController getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DownloadController) ipChange.ipc$dispatch("417f73ef", new Object[0]);
            }
            if (sInstance == null) {
                synchronized (DownloadController.class) {
                    try {
                        if (sInstance == null) {
                            sInstance = new DownloadController();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return sInstance;
        }

        public void delay(U4Engine.IDownloadHandle iDownloadHandle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88b4d481", new Object[]{this, iDownloadHandle});
            } else if (iDownloadHandle != null) {
                iDownloadHandle.cancel();
            }
        }

        public void resume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            }
        }

        public boolean shouldDelay() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a740881b", new Object[]{this})).booleanValue();
            }
            int currentNetworkType = NetworkHelper.getInstance().getCurrentNetworkType(yaa.n);
            boolean z2 = 1 == currentNetworkType;
            if (yaa.f().l()) {
                z2 |= 4 == currentNetworkType;
            }
            vpw.b();
            if (vpw.commonConfig.S && yaa.f().m()) {
                z2 |= 5 == currentNetworkType;
            }
            if (!z2) {
                v7t.d(UCSetupService.TAG, "current env cannot download u4 core");
            } else {
                StringBuilder sb = new StringBuilder("start download u4 core,is4G=[");
                if (4 == currentNetworkType) {
                    z = true;
                }
                sb.append(z);
                sb.append("]");
                v7t.i(UCSetupService.TAG, sb.toString());
            }
            return !z2;
        }
    }

    public static void initUCPlayerByDownload(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66bf56d", new Object[]{context, str});
            return;
        }
        try {
            UCPlayer.createUpdater().setContext(context.getApplicationContext()).setUrl(str).setClient(new UCPlayer.UpdaterClient() { // from class: android.taobao.windvane.extra.uc.UCSetupService.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/UCSetupService$4");
                }

                @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
                public void onDownloadFinish(String str2, File file) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6e75e042", new Object[]{this, str2, file});
                    }
                }

                @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
                public void onDownloadProgress(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
                public boolean onDownloadStart(String str2, U4Engine.IDownloadHandle iDownloadHandle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("92f77ae7", new Object[]{this, str2, iDownloadHandle})).booleanValue();
                    }
                    if (!DownloadController.getInstance().shouldDelay()) {
                        return true;
                    }
                    DownloadController.getInstance().delay(iDownloadHandle);
                    return false;
                }

                @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
                public void onFailed(UCKnownException uCKnownException) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc3b7ee3", new Object[]{this, uCKnownException});
                    }
                }

                @Override // com.uc.webview.export.extension.UCPlayer.UpdaterClient
                public void onSuccess(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("37d948b5", new Object[]{this, str2});
                    }
                }
            }).start();
        } catch (Throwable th) {
            v7t.e(TAG, "initUCPlayerByDownload start failed: ", th, new Object[0]);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class NetworkHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int NETWORK_TYPE_2G = 2;
        public static final int NETWORK_TYPE_3G = 3;
        public static final int NETWORK_TYPE_4G = 4;
        public static final int NETWORK_TYPE_5G = 5;
        public static final int NETWORK_TYPE_UNKNOWN = 0;
        public static final int NETWORK_TYPE_WIFI = 1;
        private static NetworkHelper sInstance;
        private int mNetworkType = 0;

        static {
            t2o.a(989856087);
        }

        private NetworkHelper() {
        }

        public static NetworkHelper getInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NetworkHelper) ipChange.ipc$dispatch("a4363fc7", new Object[0]);
            }
            if (sInstance == null) {
                synchronized (NetworkHelper.class) {
                    try {
                        if (sInstance == null) {
                            sInstance = new NetworkHelper();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return sInstance;
        }

        public int getCurrentNetworkType(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("61fd1ef", new Object[]{this, context})).intValue();
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (1 == type || 9 == type) {
                return 1;
            }
            if (type == 0) {
                int subtype = activeNetworkInfo.getSubtype();
                if (4 == subtype || 1 == subtype || 2 == subtype) {
                    return 2;
                }
                if (3 == subtype || 8 == subtype || 6 == subtype || 5 == subtype || 12 == subtype) {
                    return 3;
                }
                if (13 == subtype) {
                    return 4;
                }
                vpw.b();
                if (vpw.commonConfig.S && 20 == subtype) {
                    return 5;
                }
            }
            return 0;
        }
    }

    public static void configInitSettings(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85ddb8c", new Object[]{context});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        boolean isMainProcess = isMainProcess();
        configUCSettingsBeforeInit();
        try {
            z = !oba.g("wvDisableWebViewWarmup");
        } catch (Exception unused) {
            z = true;
        }
        wpw wpwVar = vpw.commonConfig;
        boolean z2 = wpwVar.U2;
        if (z2) {
            ITaskExecutor.Instance.set(new ITaskExecutor() { // from class: android.taobao.windvane.extra.uc.UCSetupService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/UCSetupService$1");
                }

                @Override // com.uc.webview.base.task.ITaskExecutor
                public void execute(Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
                    } else {
                        mrt.b().execute(runnable);
                    }
                }

                @Override // com.uc.webview.base.task.ITaskExecutor
                public void schedule(Runnable runnable, long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc2af728", new Object[]{this, runnable, new Long(j)});
                    } else {
                        mrt.b().a(runnable, j);
                    }
                }
            });
        }
        if (wpwVar.T2) {
            preInit(context);
        }
        IStatsHandler.Instance.set(new IStatsHandler() { // from class: android.taobao.windvane.extra.uc.UCSetupService.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final WVUCWebView.WVValueCallback mValueCallback = new WVUCWebView.WVValueCallback();

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/UCSetupService$2");
            }

            @Override // com.uc.webview.export.extension.IStatsHandler
            public boolean stat(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("ac6f09e9", new Object[]{this, str})).booleanValue();
                }
                this.mValueCallback.onReceiveValue(str);
                return true;
            }
        });
        yaa f = yaa.f();
        boolean z3 = wpwVar.n;
        GlobalSettings.set(SettingKeys.IsInternationalVersion, f.n());
        GlobalSettings.set(SettingKeys.UBISiVersion, f.b());
        GlobalSettings.set(SettingKeys.IsHardwareAC, true);
        GlobalSettings.set(SettingKeys.VideoUseStandardMode, true);
        GlobalSettings.set(SettingKeys.SdkInitFailedAndFallbackSystem, true);
        GlobalSettings.set(SettingKeys.SdkInitWebViewMaxWaitMillis, wpwVar.D1);
        GlobalSettings.set(SettingKeys.SdkUseUCPlayer, wpwVar.m);
        GlobalSettings.set(SettingKeys.SdkEnableReuseLastCore, z3);
        GlobalSettings.set(SettingKeys.PrivateDataDirSuffix, getMultiProcessPrivateDataDirectorySuffix());
        GlobalSettings.set(SettingKeys.SdkEnableCorruptionDetector, isMainProcess);
        GlobalSettings.set(SettingKeys.NetworkHostingRetry, String.format("|%d|", Integer.valueOf((int) AliNetworkHostingService.NET_ERROR_FALLBACK)));
        try {
            GlobalSettings.set(SettingKeys.SdkEnableWebviewWarmup, z);
            GlobalSettings.set(SettingKeys.SdkEnablePreStartCoreEngine, z);
        } catch (Exception e) {
            v7t.e(TAG, "configUCSettings fail", e, new Object[0]);
        }
        ysw yswVar = xsw.configData;
        int i = isMainProcess ? yswVar.f32336a : 0;
        int i2 = isMainProcess ? yswVar.b : 0;
        WVCore.getInstance().setUsedWebMulti(i).setUsedGpuMulti(i2);
        boolean z4 = vpw.commonConfig.i3;
        if (!z4 && i2 == 2) {
            GlobalSettings.set(SettingKeys.EnableInRendererGpu, false);
        }
        v7t.d(TAG, "UC多进程模式：webMultiPolicy=[" + i + "], gpuMultiPolicy=[" + i2 + "], enableWarmup=" + z + ", reuse: " + z3 + ", enableGPUInProcess: " + z4 + ", enableDelegateUCTaskExecutor: " + z2);
        GlobalSettings.set(SettingKeys.RenderProcMode, i);
        GlobalSettings.set(SettingKeys.GpuProcMode, i2);
        ExtImgDecoder.getInstance().initDecoderSwitch(applicationContext);
    }

    public static void initU4(Context context, String[] strArr, final String str, final String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed94a0b", new Object[]{context, strArr, str, str2, str3});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        v7t.d(TAG, "initU4 specifiedDir: " + str + ", lib:" + str2 + ", url:" + str3);
        Context applicationContext = context.getApplicationContext();
        try {
            UCInitializerInfo.a().c(13);
            U4Engine.Initializer authKey = U4Engine.createInitializer().setContext(applicationContext).setAuthKey(strArr);
            if (!TextUtils.isEmpty(str)) {
                authKey.setDecompressedDir(new File(str));
            } else if (!TextUtils.isEmpty(str2)) {
                authKey.setCompressedFile(new File(str2));
            } else if (!TextUtils.isEmpty(str3)) {
                authKey.setUrl(str3);
            }
            r9u.a(bf1.LOAD_DEX);
            r9u.a(bf1.LOAD_NATIVE);
            r9u.a(bf1.CORE_INIT);
            authKey.setClient(new U4Engine.InitializerClient() { // from class: android.taobao.windvane.extra.uc.UCSetupService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str4, Object... objArr) {
                    str4.hashCode();
                    int hashCode = str4.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str4 + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/UCSetupService$3");
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onDexReady(ClassLoader classLoader) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ce93ec58", new Object[]{this, classLoader});
                        return;
                    }
                    v7t.d(UCSetupService.TAG, "initU4 onDexReady loader:" + classLoader);
                    UCInitializerInfo.a().c(5);
                    r9u.c(bf1.LOAD_DEX);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onDownloadProgress(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onExtractFinish(File file) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9cdff53", new Object[]{this, file});
                        return;
                    }
                    v7t.d(UCSetupService.TAG, "initU4 onExtractFinish dir:" + file.getAbsolutePath());
                    UCInitializerInfo.a().c(4);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onFailed(IRunningCoreInfo iRunningCoreInfo) {
                    String str4;
                    String str5;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e994354d", new Object[]{this, iRunningCoreInfo});
                        return;
                    }
                    v7t.d(UCSetupService.TAG, "initU4 onFailed UC ExceptionValueCallback : " + iRunningCoreInfo);
                    UCInitializerInfo.a().c(8);
                    r9u.c(bf1.CORE_INIT);
                    UCKnownException exception = iRunningCoreInfo.failedInfo() != null ? iRunningCoreInfo.failedInfo().exception() : null;
                    WVUCWebView.onUCMCoreInitFailed(exception);
                    IRunningCoreInfo.FailedInfo failedInfo = iRunningCoreInfo.failedInfo();
                    JSONObject jSONObject = new JSONObject();
                    if (failedInfo != null) {
                        str5 = failedInfo.reason();
                        str4 = String.valueOf(failedInfo.errorCode());
                    } else {
                        str4 = "unknown";
                        str5 = exception == null ? str4 : exception.getMessage();
                    }
                    jSONObject.put("message", (Object) str5);
                    jSONObject.put(JSILoader.EXTRA_PARAM_SPECIFIED_DIR, (Object) str);
                    jSONObject.put("compressedLibPath", (Object) str2);
                    y71.commitFail("wv_uc_init_v1", str4, jSONObject);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onNativeReady(File file) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("30cecceb", new Object[]{this, file});
                        return;
                    }
                    v7t.d(UCSetupService.TAG, "initU4 onNativeReady libDir:" + file.getAbsolutePath());
                    UCInitializerInfo.a().c(6);
                    r9u.c(bf1.LOAD_NATIVE);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onSuccess(IRunningCoreInfo iRunningCoreInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("aa94dd75", new Object[]{this, iRunningCoreInfo});
                        return;
                    }
                    v7t.d(UCSetupService.TAG, "initU4 onSuccess info:" + iRunningCoreInfo + ", cost:" + (System.currentTimeMillis() - currentTimeMillis));
                    UCInitializerInfo.a().c(7);
                    r9u.c(bf1.CORE_INIT);
                    UCSetupService.configGlobalSettings();
                    Application application = yaa.n;
                    if (application != null) {
                        WVUCWebView.onUCMCoreSwitched(application, currentTimeMillis, iRunningCoreInfo);
                    }
                    WVRunningCoreInfo.setRunningCoreInfo(iRunningCoreInfo);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onDownloadFinish(String str4, File file) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6e75e042", new Object[]{this, str4, file});
                        return;
                    }
                    v7t.d(UCSetupService.TAG, "onDownloadFinish:" + str4 + ", savedFile:" + file.getAbsolutePath());
                    UCInitializerInfo.a().c(2);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public void onInitStart(IRunningCoreInfo iRunningCoreInfo) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("69438924", new Object[]{this, iRunningCoreInfo});
                        return;
                    }
                    v7t.d(UCSetupService.TAG, "initU4 onInitStart");
                    UCInitializerInfo.a().c(0);
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public boolean onDownloadStart(String str4, U4Engine.IDownloadHandle iDownloadHandle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("92f77ae7", new Object[]{this, str4, iDownloadHandle})).booleanValue();
                    }
                    v7t.d(UCSetupService.TAG, "onDownloadStart:" + str4);
                    UCInitializerInfo.a().c(1);
                    if (!DownloadController.getInstance().shouldDelay()) {
                        return true;
                    }
                    WVUCWebView.onUCMCoreDownloadIntercepted();
                    DownloadController.getInstance().delay(iDownloadHandle);
                    return false;
                }

                @Override // com.uc.webview.export.extension.U4Engine.InitializerClient
                public boolean onExtractStart(File file, File file2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("e3a86699", new Object[]{this, file, file2})).booleanValue();
                    }
                    v7t.d(UCSetupService.TAG, "initU4 onExtractStart dir:" + file2.getAbsolutePath());
                    v7t.d(UCSetupService.TAG, "initU4 onExtractStart:true");
                    UCInitializerInfo.a().c(3);
                    return true;
                }
            }).start();
            v7t.d(TAG, "initU4 started");
            WVCore.getInstance().setUCStartInit(true);
        } catch (Throwable th) {
            v7t.e(TAG, "initU4 start failed: ", th, new Object[0]);
            WVCoreSettings.getInstance().notifyCoreEventCallback2Fail(au4.b(7, th.getMessage()));
        }
    }
}
