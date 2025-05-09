package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ehj implements j6a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.j6a
    public void A(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a133cdf0", new Object[]{this, v35Var});
            return;
        }
        v35Var.d("InitAccsOnBackground", "InitTimeStampManagerStop");
        v35Var.c("InitTBWidget");
        v35Var.c("InitAPMRest");
        v35Var.c("InitTurboBootBackground");
        v35Var.e("InitStatisticsSubmit");
    }

    @Override // tb.j6a
    public void B(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfd35ff4", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitDAGPointsReport");
        v35Var.c("InitZCacheColdStartup");
        v35Var.c("InitTBExecutor");
        v35Var.c("InitAUEIdle");
        v35Var.c("InitCacheCleanerIdle");
        v35Var.c("InitNegativeProblems");
        v35Var.c("InitPermissionIdle");
        v35Var.c("InitTucaobarIdle");
    }

    @Override // tb.j6a
    public void C(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6a332", new Object[]{this, v35Var});
        } else {
            v35Var.c("InitZCacheFirstInstall");
        }
    }

    @Override // tb.j6a
    public void D(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("259687bd", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitPhenixApngDelay");
        v35Var.c("InitPhenixHeifDelay");
        v35Var.c("InitWeexSmoothDelay");
        v35Var.c("InitHomePreAdvLauncherDelay");
        v35Var.d("InitPhenixSchedulerDelay", "InitPhenixBuildDelay");
        v35Var.d("InitHomeSwitchLauncherDelay", "InitHomeLauncherDelay");
        v35Var.d("InitHomeGatewayLauncherDelay", "InitHomeLauncherDelay");
        v35Var.c("InitHomePreParamsLauncherDelay");
        v35Var.d("InitDXV2Delay", "InitHomeDinamicX2LauncherDelay");
        v35Var.d("InitDXV3Delay", "InitHomeDinamicX3LauncherDelay");
        v35Var.g("InitPhenixDelay");
    }

    @Override // tb.j6a
    public void E(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17be4029", new Object[]{this, v35Var});
            return;
        }
        v35Var.d("InitAUE", "InitHomeResumed");
        v35Var.d("InitPopConfigLoadTask", "InitHomeResumed");
        v35Var.c("InitPhenixNotifyLaunchFinish");
        v35Var.c("InitBehavirXStashes");
        v35Var.c("InitDXOpt");
        v35Var.c("InitLinkManagerHomeFinish");
        v35Var.c("InitUMIDTokenResume");
        v35Var.c("InitLinkInAction");
        v35Var.c("InitTMSResume");
        v35Var.c("InitSoPreLoader");
    }

    @Override // tb.j6a
    public void a(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b88e85e", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitEnv");
        v35Var.c("InitBundleDebugSetting");
    }

    @Override // tb.j6a
    public void b(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad26f794", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitUCParam");
        v35Var.c("InitWeexSmoothLaunched");
        v35Var.c("InitPreloadNav");
        v35Var.c("InitOrangeConfigLaunched");
        v35Var.c("InitOrangeDelay");
        v35Var.c("InitDiagnose");
        v35Var.c("InitShopRuleOpt");
        v35Var.d("InitTab2Preload", "InitMessagePreload");
        v35Var.d("InitMessagePreload", "InitCartBadge");
        v35Var.d("InitAppBundleIdle", "InitRsoLinkFinish");
        v35Var.c("InitNavigationIdle");
        v35Var.c("InitABGlobal");
        v35Var.d("InitAppBundleTrigger", "InitVoiceAssistant");
        v35Var.c("InitHomeVisible");
        v35Var.c("InitTMSNecessary");
        v35Var.c("InitUtNotify");
        v35Var.c("InitUMIDToken");
        v35Var.c("InitThemeKit");
        v35Var.c("InitChangeAppIcon");
        v35Var.c("InitDXOpt");
        v35Var.c("InitShareFeedbackLaunched");
        v35Var.c("InitPhenixNotifyLaunchFinish");
        v35Var.c("InitNavProcessorPreloadIdle");
    }

    @Override // tb.j6a
    public void c(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81cb0d6", new Object[]{this, v35Var});
            return;
        }
        v35Var.d("InitLaunchdogAlarm", "InitEditionSwitcher");
        v35Var.d("InitEditionSwitcher", "InitHDIdle");
        v35Var.d("InitHDIdle", "InitEDLPIdle");
        v35Var.d("InitEDLPIdle", "InitTaoLiveIdle");
        v35Var.d("InitTaoLiveIdle", "InitTurboBootIdle");
        v35Var.d("InitTurboBootIdle", "InitPhenixAvif");
        v35Var.d("InitPhenixAvif", "InitAppBundleIdle");
        v35Var.d("InitAppBundleIdle", "InitRestOrandleIdle");
        v35Var.d("InitRestOrandleIdle", "InitLoginParam");
        v35Var.d("InitLoginParam", "InitElder");
        v35Var.d("InitElder", "InitColdLogin");
        v35Var.d("InitDetailLauncher", "InitVoiceAssistantIdle");
        v35Var.d("InitVoiceAssistantIdle", "InitNDIdle");
        v35Var.d("InitNDIdle", "InitPush");
        v35Var.d("InitPush", "InitCrashSDKOrange");
        v35Var.d("InitCrashSDKOrange", "InitAPMSecondary");
        v35Var.d("InitAPMSecondary", "InitPowerMessage");
        v35Var.d("InitPowerMessage", "InitTriver");
        v35Var.d("InitTriver", "InitAppRemoteOrangeInitializer");
        v35Var.d("InitAppRemoteOrangeInitializer", "InitDWIdle");
        v35Var.d("InitDWIdle", "InitOvsHomeIdle");
        v35Var.d("InitOvsHomeIdle", "InitAbtestAdapter");
        v35Var.d("InitAbtestAdapter", "InitDAIColdStartup");
        v35Var.d("InitDAIColdStartup", "InitNavSharePreProcess");
        v35Var.d("InitNavSharePreProcess", "InitFontSettingIdle");
        v35Var.d("InitFontSettingIdle", "InitMetricKitIdle");
        v35Var.d("InitMetricKitIdle", "InitAutoSizeIdle");
        v35Var.d("InitAutoSizeIdle", "InitAlimama");
        v35Var.d("InitAlimama", "InitFamily");
        v35Var.d("InitFamily", "InitHomeIdleLauncher");
        v35Var.d("InitHomeIdleLauncher", "InitBrowserProcess");
        v35Var.d("InitBrowserProcess", "InitTMQOlympic");
        v35Var.d("InitTMQOlympic", "InitMTBPreload");
        v35Var.d("InitMTBPreload", "InitAliSports");
        v35Var.d("InitAliSports", "InitPurchaseIdle");
        v35Var.d("InitPurchaseIdle", "InitShop");
        v35Var.d("InitShop", "InitRemoteSoIdle");
        v35Var.d("InitRemoteSoIdle", "InitDownloader");
        v35Var.d("InitWindvaneSecondary", "InitFeedbackJsBridge");
        v35Var.d("InitFeedbackJsBridge", "InitAliPrivacy");
        v35Var.d("InitAliPrivacy", "InitOrangeIdle");
        v35Var.d("InitOrangeIdle", "InitCodeTrack");
        v35Var.d("InitCodeTrack", "InitTaoLogForAccs");
        v35Var.d("InitColdLogin", "InitWeexIdle");
        v35Var.d("InitDownloader", "InitWeexIdle");
        v35Var.d("InitMiniPay", "InitWeexIdle");
        v35Var.c("InitTMSIdle");
        v35Var.c("InitBizErrorReporterOrange");
        v35Var.c("InitMemKeeper");
        v35Var.c("InitQuality");
        v35Var.g("InitAccsInAppConnection");
    }

    @Override // tb.j6a
    public void d(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c665f0", new Object[]{this, v35Var});
            return;
        }
        v35Var.d("InitNegativeProblems", "InitUCDecompress");
        v35Var.d("InitUCDecompress", "InitTurboBootBackground");
    }

    @Override // tb.j6a
    public void e(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c12dbe", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitPhenixHeif");
        v35Var.c("InitPhenixApng");
        v35Var.d("InitPhenixScheduler", "InitPhenixBuild");
        v35Var.c("InitAndroidMonkey");
        v35Var.c("InitGalileo");
        v35Var.c("InitWelcome");
        v35Var.c("InitBootImage");
        v35Var.c("InitBehaviX");
        v35Var.c("InitUpdateLightweight");
        v35Var.c("InitPopPre");
        v35Var.c("InitMetricKit");
        v35Var.c("InitAbilityKit");
    }

    @Override // tb.j6a
    public void f(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc36f30", new Object[]{this, v35Var});
        } else {
            v35Var.c("InitProtodbDaemon");
        }
    }

    @Override // tb.j6a
    public void g(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f017728", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitAgooLifeCycle");
        v35Var.d("InitOrangeConfig", "InitOrangeAfterLogin");
        v35Var.d("InitChannelCookieManager", "InitOrangeConfig");
        v35Var.d("InitNetwork", "InitOrangeConfig");
        v35Var.d("InitChannelCookieManager", "InitAccsInAppConnection");
        v35Var.d("InitNetwork", "InitAccsInAppConnection");
        v35Var.d("InitAccsInAppConnection", "InitMsgKeepAlive");
        v35Var.d("InitAUS", "InitTaoLog");
        v35Var.d("InitTaoLog", "InitTaoLogForAccs");
        v35Var.d("InitAccsInAppConnection", "InitTaoLogForAccs");
    }

    @Override // tb.j6a
    public void h(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c13cbb5", new Object[]{this, v35Var});
            return;
        }
        v35Var.d("InitKeepAlive", "InitTaoLog");
        v35Var.g("InitBasicParam");
    }

    @Override // tb.j6a
    public void i(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2ce3c52", new Object[]{this, v35Var});
            return;
        }
        v35Var.a("InitBasicParam").b("InitUt", "InitMotuCrash");
        v35Var.c("InitEnv");
        v35Var.c("InitAtlasServiceFinder");
        v35Var.d("InitPhenix", "InitPhenixBuild");
    }

    @Override // tb.j6a
    public void j(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a91e7af", new Object[]{this, v35Var});
            return;
        }
        v35Var.d("InitABTest", "InitNav");
        v35Var.a("InitNav").b("InitLinkManager", "InitJTrack", "InitConfigCenterLifecycle", "InitPHAIdle");
        v35Var.c("InitTriverNav");
        v35Var.c("InitPopPost");
        v35Var.c("InitWeexSmoothOpt");
        v35Var.c("InitUt4Aplus");
        v35Var.c("InitUCSoInject");
        v35Var.c("InitAUS");
        v35Var.c("InitTMSEarly");
        v35Var.c("InitPermissionBridge");
        v35Var.c("InitNewDetail");
        v35Var.c("InitFontSetting");
        v35Var.c("InitUCParam");
        v35Var.c("InitLocalization");
        v35Var.c("InitGesture");
    }

    @Override // tb.j6a
    public void k(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a52e30b7", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitMotuCrash");
        v35Var.c("InitTaoLog");
        v35Var.d("InitToastHook", "InitArrayMap");
        v35Var.d("InitArrayMap", "InitProcessInfos");
        v35Var.d("InitProcessInfos", "InitScreenConfig");
        v35Var.d("InitScreenConfig", "InitAtlasServiceFinder");
        v35Var.d("InitAtlasServiceFinder", "InitLifeCycle");
        v35Var.d("InitLifeCycle", "InitLoginLifeCycle");
        v35Var.d("InitLoginLifeCycle", "InitMtopLifeCycle");
        v35Var.d("InitMtopLifeCycle", "InitLinkLifeCycle");
        v35Var.d("InitLinkLifeCycle", "InitAgooLifeCycle");
        v35Var.d("InitAgooLifeCycle", "InitUt");
        v35Var.c("InitDeviceScore");
        v35Var.c("InitHomePreAdvLauncher");
        v35Var.c("InitHomeDinamicX2Launcher");
        v35Var.d("InitHomeDinamicX3Launcher", "InitHomePreCreateViewLauncher");
        v35Var.c("InitOrangeConfig");
        v35Var.d("InitOrangeConfig", "InitOrangeAfterLogin");
        v35Var.d("InitOrangeConfig", "InitSafeModeOrange");
        v35Var.d("InitManufacturer", "InitUt");
        v35Var.d("InitUt", "InitRevisionTrack");
        v35Var.c("InitMtopDelay");
        v35Var.d("InitUt", "InitLinkUtCheck");
        v35Var.g("InitAPM");
    }

    @Override // tb.j6a
    public void l(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8b3477c", new Object[]{this, v35Var});
        } else {
            v35Var.d("InitBasicParam", "InitWindvane");
        }
    }

    @Override // tb.j6a
    public void m(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b89d9cc", new Object[]{this, v35Var});
        } else {
            v35Var.a("InitLoginParam").b("InitOrangeAfterLogout", "InitAccsAfterLogout");
        }
    }

    @Override // tb.j6a
    public void n(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e60545", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitHuDongIdle");
        v35Var.c("BroadcastLogin");
        v35Var.d("InitAccsInAppConnectionB", "InitAccsOnForeground");
        v35Var.d("InitAccsOnForeground", "InitTimeStampManagerStart");
        v35Var.c("InitDowngrade");
        v35Var.c("InitNextRpc");
        v35Var.c("InitPassiveLocation");
        v35Var.d("InitAUE", "InitUpdate");
        v35Var.c("InitAppBundleTrigger");
        v35Var.c("InitLinkRewriter");
        v35Var.c("InitPhenixHeifOpt");
        v35Var.c("InitPhenixApngOpt");
        v35Var.c("InitPhenixGif");
        v35Var.c("InitPhenixWebp");
        v35Var.c("InitTMSForeground");
        v35Var.c("InitEDLPHigh");
        v35Var.c("InitTconHot");
        v35Var.c("InitSGFirstInstall");
        v35Var.g("InitComponentState");
    }

    @Override // tb.j6a
    public void o(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1deb5b5", new Object[]{this, v35Var});
        } else {
            v35Var.c("InitMessage");
        }
    }

    @Override // tb.j6a
    public void p(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29931af", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitWeex");
        v35Var.c("InitLinkManagerB");
        v35Var.c("BroadcastLogin");
        v35Var.c("InitPopCenter");
        v35Var.c("InitLivePopup");
        v35Var.c("InitRemoteSo");
        v35Var.c("InitDWBase");
        v35Var.c("InitElder");
        v35Var.c("InitAbilityKit");
        v35Var.c("InitShopRuleOpt");
        v35Var.c("InitUCParam");
    }

    @Override // tb.j6a
    public void q(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("969f5208", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitWeexSmoothBootFinish");
        v35Var.c("InitOrangeConfigLaunched");
        v35Var.c("InitShopRuleOpt");
        v35Var.c("InitAppRemoteGodEyeInitializer");
        v35Var.c("InitHomeTaskCompleted");
    }

    @Override // tb.j6a
    public void r(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d642b9", new Object[]{this, v35Var});
        } else {
            v35Var.a("InitLoginParam").b("InitOrangeAfterLogin", "InitAccsAfterLogin");
        }
    }

    @Override // tb.j6a
    public void s(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221476ae", new Object[]{this, v35Var});
        } else {
            v35Var.d("InitAPMMin", "InitMtopMultiLang");
        }
    }

    @Override // tb.j6a
    public void t(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb28835", new Object[]{this, v35Var});
            return;
        }
        v35Var.d("InitBasicParam", "InitOrangeFetch");
        v35Var.d("InitVirtualThreadLauncher", "InitOrangeFetch");
        v35Var.d("InitVirtualThreadLauncher", "InitTNet");
        v35Var.d("InitVirtualThreadLauncher", "InitNetworkStrategy");
        v35Var.d("InitSecIO", "InitStatistics");
        v35Var.d("InitRevisionSwitch", "InitHomeSwitchLauncher");
        v35Var.d("InitRevisionSwitch", "InitHomeGatewayLauncher");
        v35Var.d("InitHomeGatewayLauncher", "InitHomeCache");
        v35Var.c("InitSGJpgProcess");
        v35Var.c("InitSecurityManager");
        v35Var.c("InitUCSoInjectB");
        v35Var.c("InitURLRewrite");
        v35Var.c("InitRecPrivacy");
        v35Var.c("InitComponents");
        v35Var.c("InitTurboBootEarly");
        v35Var.c("InitLauncher");
        v35Var.c("InitAppRemoteOlympicInitializer");
        v35Var.g("InitTcon");
    }

    @Override // tb.j6a
    public void u(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147ec6c9", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitDesktopWidget");
        v35Var.c("InitTaoLog");
        v35Var.c("InitNetwork");
    }

    @Override // tb.j6a
    public void v(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d53a8e47", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitTMSEarlyV2");
        v35Var.c("InitLogin");
        v35Var.c("InitNetwork");
        v35Var.c("InitCookieManager");
        v35Var.c("InitHomeLauncher");
        v35Var.c("InitDXV2");
        v35Var.d("InitLogin", "InitLoginParam");
        v35Var.d("InitLogin", "InitLinkLogin");
        v35Var.d("InitLogin", "InitHomePreParamsLauncher");
        v35Var.d("InitMtop", "InitHomePreRequestLauncher");
        v35Var.d("InitNetwork", "InitHomePreRequestLauncher");
        v35Var.d("InitCookieManager", "InitHomePreRequestLauncher");
        v35Var.d("InitHomePreParamsLauncher", "InitHomePreRequestLauncher");
        v35Var.d("InitDXV3", "InitHomePreRequestLauncher");
        v35Var.d("InitMtop", "InitLinkManagerC");
        v35Var.d("InitNetwork", "InitXState");
        v35Var.d("InitCookieManager", "InitXState");
        v35Var.d("InitNetwork", "InitH5Request");
        v35Var.d("InitCookieManager", "InitH5Request");
        v35Var.d("InitXState", "InitMtop");
        v35Var.d("InitLoginSessionCheck", "InitMtop");
        v35Var.d("InitMtop", "InitTab2ColdLaunchTask");
        v35Var.d("InitMtop", "InitTaoLiveColdLaunchTask");
        v35Var.d("InitMtop", "InitMtopSSRLink");
        v35Var.d("InitMtopSSRLink", "InitTriverLightWeight");
        v35Var.d("InitMtopSSRLink", "InitHudongSdk");
        v35Var.d("InitMtop", "InitSearchColdLaunchTask");
        v35Var.c("InitLinkMessageBundle");
        v35Var.c("InitUCParamB");
        v35Var.c("InitRsoLink");
        v35Var.c("InitPhenix");
    }

    @Override // tb.j6a
    public void w(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbafb6de", new Object[]{this, v35Var});
            return;
        }
        v35Var.a("InitSafeMode").b("InitClearSpeedFlag", "InitChangeAppIcon", "InitTMSSafeMode");
        v35Var.e("InitUpdate");
    }

    @Override // tb.j6a
    public void x(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d50ecb1", new Object[]{this, v35Var});
            return;
        }
        v35Var.a("InitBasicParam").b("InitUt", "InitMotuCrash");
        v35Var.c("InitEnv");
        v35Var.c("InitAtlasServiceFinder");
        v35Var.d("InitSecurityManager", "InitLogin");
        v35Var.d("InitLogin", "InitBasicParam");
        v35Var.c("InitNetworkStrategy");
        v35Var.a("InitUt").b("InitTurboBootChannel", "InitDesktopTaskTrigger");
        v35Var.c("InitLinkSmart");
        v35Var.g("InitLauncher");
    }

    @Override // tb.j6a
    public void y(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d863186", new Object[]{this, v35Var});
            return;
        }
        v35Var.c("InitClipUrlWatcherLifeCycle");
        v35Var.c("InitWeexNoSucks");
        v35Var.c("InitLoginSessionValid");
        v35Var.c("InitBootImageIdle");
        v35Var.c("InitWindvane");
        v35Var.c("InitWeexNoSucks");
        v35Var.c("InitAtlasClean");
        v35Var.c("InitDAIColdStartupB");
        v35Var.c("BoradcastAllSpark");
        v35Var.c("InitLivePopup");
        v35Var.c("InitDWBase");
        v35Var.c("InitAVSDK");
        v35Var.c("InitARCameraView");
        v35Var.c("InitWeexNoSucks");
        v35Var.d("InitWindvane", "InitPreloadIdle");
        v35Var.d("InitRemoteSo", "InitWindvane");
        v35Var.c("InitHomeTaskCompleted");
        v35Var.c("InitMemKeeper");
        v35Var.c("InitVirtualThreadIdleLauncher");
        v35Var.c("InitNewDetailIdle");
        v35Var.c("InitPGInitTask");
        v35Var.c("InitWaterMask");
        v35Var.g("InitStatisticsDump");
    }

    @Override // tb.j6a
    public void z(v35<String> v35Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b8988b", new Object[]{this, v35Var});
        } else {
            v35Var.c("InitDAIFirstInstall");
        }
    }
}
