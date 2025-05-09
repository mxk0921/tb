package com.taobao.login4android;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.core.callback.InitResultCallback;
import com.ali.user.open.core.config.ConfigManager;
import com.ali.user.open.core.config.Environment;
import com.ali.user.open.jsbridge.UccJsBridge;
import com.ali.user.open.jsbridge.UserTrackBridge;
import com.ali.user.open.ucc.webview.UccSystemJSBridge;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.security.rp.RPSDK;
import com.alipay.mobile.verifyidentity.alipay.H5Plugin.WindVaneInit;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sns4android.jsbridge.SNSJsbridge;
import com.taobao.login4android.activity.LoginProxyActivity;
import com.taobao.login4android.api.LoginApiContext;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginEnvType;
import com.taobao.login4android.init.loginbar.LoginBarController;
import com.taobao.login4android.jsbridge.AuthBridge;
import com.taobao.login4android.jsbridge.PopJSBridge;
import com.taobao.login4android.jsbridge.TBLoginJSBridge;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.membercenter.security.AccountSecurityJSbridge;
import com.taobao.login4android.monitor.MonitorLifecycle;
import com.taobao.login4android.receiver.TBLoginReceiver;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.thread.LoginThreadHelper;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.login4android.video.VerifyJsbridge;
import com.taobao.login4android.weex.WVIntentModule;
import com.taobao.login4android.weex.WVUserModule;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ff0;
import tb.fsw;
import tb.mf0;
import tb.obk;
import tb.rmo;
import tb.smo;
import tb.t2o;
import tb.t5r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TaoBaoLoginInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INIT_TAG = "init.login-tag";
    public static final String TAG = "login.LoginApplication";
    public static Application mApplication;
    public static Context mContext;
    public static volatile boolean isInited = false;
    private static final AtomicBoolean LOCK = new AtomicBoolean(false);
    public static long startTime = -1;
    public static long stepTime1 = -1;
    public static long endTime = -1;
    public static volatile Map<String, String> tbTimes = Collections.synchronizedMap(new HashMap());

    static {
        t2o.a(517996552);
    }

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            doInitSDK(context);
        }
    }

    public static /* synthetic */ void access$100(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18144810", new Object[]{context});
        } else {
            initUcc(context);
        }
    }

    private static void clearPreAppInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a49e1348", new Object[]{context});
        } else if (context != null) {
            try {
                Localization.a(new Localization.a() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.ability.localization.Localization.a
                    public void onChange(Language language, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
                            return;
                        }
                        AliUserLogin.clearCacheData(LoginConstant.APP_LAUNCH_FILE_NAME);
                        LoginBarController.updateLoginBar();
                    }
                });
                LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/TaoBaoLoginInitializer$7");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                        } else {
                            AliUserLogin.clearCacheData(LoginConstant.APP_LAUNCH_FILE_NAME);
                        }
                    }
                }, new IntentFilter("EDITON_SWITCHER_EDITTION_CODE_CHANGED"));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static synchronized void init(Context context) {
        synchronized (TaoBaoLoginInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
            } else {
                init(context, false);
            }
        }
    }

    private static void doInitSDK(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbc8782", new Object[]{context});
            return;
        }
        LoginTLogAdapter.trace("init.login-tag", "doInitSDK: init task real start");
        stepTime1 = System.currentTimeMillis();
        Map<String, String> map = tbTimes;
        map.put("init_start", stepTime1 + "");
        LoginEnvType loginEnvType = LoginEnvType.ONLINE;
        int a2 = EnvironmentSwitcher.a();
        if (a2 == EnvironmentSwitcher.EnvType.PRE.getValue()) {
            loginEnvType = LoginEnvType.PRE;
        } else if (a2 == EnvironmentSwitcher.EnvType.TEST.getValue() || a2 == EnvironmentSwitcher.EnvType.TEST_2.getValue()) {
            loginEnvType = LoginEnvType.DEV;
        }
        TaobaoAppProvider taobaoAppProvider = new TaobaoAppProvider();
        AliUserLogin.setLoginAppreanceExtions(new TaoBaoLoginAppearanceExtensions());
        Login.init(context, TaoApplication.getTTID(), Globals.getVersionName(), loginEnvType, taobaoAppProvider);
        PopJSBridge.register();
        VerifyJsbridge.register();
        try {
            fsw.h(UccSystemJSBridge.ALU_SYSTEM_JSBRIDGE, UccJsBridge.class);
            if (fsw.d("VITaoBaoJSAPIAdapter") == null) {
                LoginTLogAdapter.trace(TAG, "call WindVaneInit.init,register VITaoBaoJSAPIAdapter");
                WindVaneInit.getInstance().init();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        CoordinatorWrapper.executeSafely(new Runnable() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    TaoBaoLoginInitializer.access$100(context);
                }
            }
        });
        LoginTLogAdapter.e(TAG, "find new prefech time");
        LoginApprearanceExtensions.AsoLoginFlow.setAsoLoginCallback(new LoginApprearanceExtensions.AsoLoginCallback() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.common.api.LoginApprearanceExtensions.AsoLoginCallback
            public void onNeedSwitch(String str, DataCallback<Boolean> dataCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c8fbca96", new Object[]{this, str, dataCallback});
                    return;
                }
                LoginContext.mDataCallback = dataCallback;
                Intent intent = new Intent(TaoBaoLoginInitializer.mContext, LoginProxyActivity.class);
                intent.putExtra("action", LoginProxyActivity.ACTION_TYPE_ACCOUNT_SWITCH);
                intent.putExtra("message", str);
                intent.addFlags(268435456);
                intent.setPackage(TaoBaoLoginInitializer.mContext.getPackageName());
                TaoBaoLoginInitializer.mContext.startActivity(intent);
            }
        });
        MonitorLifecycle.listen(mApplication);
        LoginBroadcastHelper.registerLoginReceiver(mContext, new TBLoginReceiver());
        try {
            OrangeConfig.getInstance().registerListener(new String[]{LoginSwitch.CONFIG_GROUP_LOGIN}, new obk() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.obk
                public void onConfigUpdate(String str, Map<String, String> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map2});
                        return;
                    }
                    OrangeConfig.getInstance().unregisterListener(new String[]{LoginSwitch.CONFIG_GROUP_LOGIN}, this);
                    LoginTLogAdapter.e(TaoBaoLoginInitializer.TAG, "login onConfigUpdate: for refreshAddressByLaunchV2");
                    if (LoginSwitch.getSwitch("refreshAddressByLaunchV2", "false")) {
                        MainThreadExecutor.postDelayed(new Runnable() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                Context context2 = TaoBaoLoginInitializer.mContext;
                                if (context2 != null) {
                                    mf0.l(context2, "", "", "appLaunch");
                                }
                            }
                        }, 1000L);
                    }
                }
            }, true);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        clearPreAppInfo(mContext);
        Map<String, String> map2 = tbTimes;
        map2.put("init_end", System.currentTimeMillis() + "");
    }

    public static synchronized void init(Context context, boolean z) {
        synchronized (TaoBaoLoginInitializer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b35b22e3", new Object[]{context, new Boolean(z)});
            } else if (context != null) {
                String curProcessName = LoginThreadHelper.getCurProcessName(context);
                LoginTLogAdapter.trace(TAG, "init() called with: context = [" + context + "],isInited=" + isInited + ",thread=" + Thread.currentThread().getName() + ",process=" + curProcessName);
                if (isInited) {
                    LoginTLogAdapter.trace(TAG, "init() already inited,return");
                } else if (TextUtils.equals("com.taobao.taobao", curProcessName)) {
                    if (LOCK.compareAndSet(false, true)) {
                        LoginTLogAdapter.trace(TAG, "init() LOCK=false, enter flow 0");
                        mContext = context;
                        mApplication = (Application) context.getApplicationContext();
                        startInit(context.getApplicationContext(), z);
                    } else {
                        LoginTLogAdapter.trace(TAG, "init() LOCK=true,exit");
                    }
                }
            }
        }
    }

    private static void initUcc(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e45a86dc", new Object[]{context});
            return;
        }
        LoginTLogAdapter.e("init.login-tag", "initUcc: start");
        Map<String, String> map = tbTimes;
        map.put("init_ucc_start", System.currentTimeMillis() + "");
        try {
            ff0.b(context);
            fsw.h("TBLoginJSBridge", TBLoginJSBridge.class);
            fsw.h("aluAuth", WVIntentModule.class);
            fsw.h("aluAccount", WVUserModule.class);
            fsw.h("aluSSOLoginJSBridge", AuthBridge.class);
            fsw.h("ALBBUserTrackJSBridge", UserTrackBridge.class);
            AccountSecurityJSbridge.register();
            int a2 = EnvironmentSwitcher.a();
            if (a2 == EnvironmentSwitcher.EnvType.PRE.getValue()) {
                RPSDK.initialize(RPSDK.RPSDKEnv.RPSDKEnv_PRE, mContext);
                AliMemberSDK.setEnvironment(Environment.PRE);
            } else {
                if (!(a2 == EnvironmentSwitcher.EnvType.TEST.getValue() || a2 == EnvironmentSwitcher.EnvType.TEST_2.getValue())) {
                    RPSDK.initialize(RPSDK.RPSDKEnv.RPSDKEnv_ONLINE, mContext);
                    AliMemberSDK.setEnvironment(Environment.ONLINE);
                }
                RPSDK.initialize(RPSDK.RPSDKEnv.RPSDKEnv_DAILY, mContext);
                AliMemberSDK.setEnvironment(Environment.TEST);
            }
            ConfigManager.setAppKeyIndex(0, 2);
            ConfigManager.getInstance().setRegisterSidToMtopDefault(false);
            ConfigManager.getInstance().isMultiProcessEnable = true;
            OrangeConfig.getInstance().registerListener(new String[]{LoginSwitch.CONFIG_GROUP_LOGIN}, new obk() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.obk
                public void onConfigUpdate(String str, Map<String, String> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map2});
                        return;
                    }
                    if (LoginSwitch.getSwitch("close_ucc_multi_process", "false") && TaoBaoLoginInitializer.mContext != null) {
                        ConfigManager.getInstance().isMultiProcessEnable = false;
                    }
                    OrangeConfig.getInstance().unregisterListener(new String[]{LoginSwitch.CONFIG_GROUP_LOGIN}, this);
                }
            }, true);
            AliMemberSDK.init(context.getApplicationContext(), "taobao", new InitResultCallback() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.open.core.callback.FailureCallback
                public void onFailure(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
                        return;
                    }
                    UserTrackAdapter.sendUT("UccInitFail_" + str);
                }

                @Override // com.ali.user.open.core.callback.InitResultCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                        return;
                    }
                    Map<String, String> map2 = TaoBaoLoginInitializer.tbTimes;
                    map2.put("init_ucc_end", System.currentTimeMillis() + "");
                    TaoBaoLoginInitializer.endTime = System.currentTimeMillis();
                    LoginTLogAdapter.trace("init.login-tag", "initUcc: onSuccess");
                    smo smoVar = new smo();
                    smoVar.f28149a = SNSPlatform.PLATFORM_ALIPAY;
                    smoVar.b = "2021003109674454";
                    rmo.d(smoVar);
                    smo smoVar2 = new smo();
                    smoVar2.f28149a = SNSPlatform.PLATFORM_ALIPAYHK;
                    rmo.d(smoVar2);
                    UccJsBridge.getInstance().setUccDataProvider();
                    fsw.h("aluAuthJSBridge", SNSJsbridge.class);
                }
            });
            MainThreadExecutor.postDelayed(new Runnable() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        HashMap hashMap = new HashMap(TaoBaoLoginInitializer.tbTimes);
                        hashMap.putAll(LoginContext.times);
                        UserTrackAdapter.sendUserTrack(UTConstant.PageName.UT_PAGE_EXTEND, "login_sdk_init_time_cost", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        long j = TaoBaoLoginInitializer.endTime;
                        if (j != -1) {
                            t5r.b("login_sdk_init_cost", Long.valueOf(j - TaoBaoLoginInitializer.startTime));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }, 1000L);
        }
    }

    private static void startInit(final Context context, final boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4535cae5", new Object[]{context, new Boolean(z)});
        } else if (!isInited) {
            isInited = true;
            LoginTLogAdapter.trace(TAG, "startInit() LOCK=false, enter flow 1 ,startInit,");
            LoginContext.callback = new CommonCallback() { // from class: com.taobao.login4android.TaoBaoLoginInitializer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onFail(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    }
                }

                @Override // com.ali.user.mobile.model.CommonCallback
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else {
                        LoginApiContext.isLoginSDKInited = true;
                    }
                }
            };
            startTime = System.currentTimeMillis();
            SessionManager instance = SessionManager.getInstance(context);
            if (instance == null || !instance.checkSessionValid()) {
                z2 = z;
            }
            if (LoginThreadHelper.isMainThread() || z2) {
                new Thread("initLoginSDK") { // from class: com.taobao.login4android.TaoBaoLoginInitializer.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/TaoBaoLoginInitializer$2");
                    }

                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        LoginTLogAdapter.e(TaoBaoLoginInitializer.TAG, "run: startInit on Thread initLoginSDK,:" + Thread.currentThread().getName() + ",forceNewThread=" + z);
                        TaoBaoLoginInitializer.access$000(context);
                    }
                }.start();
                return;
            }
            LoginTLogAdapter.e(TAG, "run: startInit on Thread:" + Thread.currentThread().getName());
            doInitSDK(context);
        }
    }
}
