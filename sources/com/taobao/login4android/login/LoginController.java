package com.taobao.login4android.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.mobile.ability.ExecutorJSBridge;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProvider;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.init.AliUserInit;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.base.helper.AliuserActionReceiver;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.helper.CPHelper;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.exception.RpcException;
import com.ali.user.mobile.filter.LoginFilterCallback;
import com.ali.user.mobile.harmony.HarmonyLoginBackupImpl;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.AppMonitorAdapter;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.action.OtherActions;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.NeedLoginPresenter;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.AutoLoginCallback;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.DeviceTokenSignParam;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.model.SSOMasterParam;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.rpc.h5.MtopAccountCenterUrlResponseData;
import com.ali.user.mobile.rpc.h5.MtopCanChangeNickResponseData;
import com.ali.user.mobile.rpc.login.model.ApplyTokenRequest;
import com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.rpc.login.model.LoginTokenResponseData;
import com.ali.user.mobile.rpc.login.model.MLoginTokenReturnValue;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.security.AlibabaSecurityTokenService;
import com.ali.user.mobile.security.SSOSecurityService;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.LoginService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.url.model.AccountCenterParam;
import com.ali.user.mobile.url.service.impl.UrlFetchServiceImpl;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.DeviceUtils;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.mobile.utils.ResourceUtil;
import com.ali.user.mobile.utils.SiteUtil;
import com.ali.user.mobile.verify.impl.VerifyServiceImpl;
import com.ali.user.mobile.verify.model.GetVerifyUrlResponse;
import com.ali.user.mobile.verify.model.GetVerifyUrlReturnData;
import com.ali.user.mobile.verify.model.VerifyParam;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.jsbridge.ScancodeCallback;
import com.taobao.android.sso.v2.model.ApplySsoTokenRequest;
import com.taobao.android.sso.v2.model.SSOIPCConstants;
import com.taobao.android.sso.v2.model.SSOV2ApplySsoTokenResponseData;
import com.taobao.login4android.Login;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.login4android.biz.alipaysso.AlipaySSOLogin;
import com.taobao.login4android.biz.autologin.AutoLoginBusiness;
import com.taobao.login4android.biz.autologin.AutoLoginParam;
import com.taobao.login4android.biz.logout.BeforeLogoutBiz;
import com.taobao.login4android.biz.logout.LogoutBusiness;
import com.taobao.login4android.biz.logout.LogoutParam;
import com.taobao.login4android.biz.unifysso.UnifySsoLogin;
import com.taobao.login4android.biz.uninstall.UninstallManager;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.jsbridge.JSBridgeService;
import com.taobao.login4android.jsbridge.SDKJSBridgeService;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.receiver.LoginTestBroadcastReceiver;
import com.taobao.login4android.receiver.StatusReceiver;
import com.taobao.login4android.session.ISession;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.thread.LoginTask;
import com.taobao.login4android.thread.LoginThreadHelper;
import com.taobao.login4android.utils.BackgroundExecutor;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.login4android.utils.ToastUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.uc.webview.base.cyclone.BSError;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import tb.fsw;
import tb.g1v;
import tb.mop;
import tb.obk;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LoginController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int E_APPLY_TOKEN_FAIL = 1100;
    public static final String INIT_TAG = "init.login-tag";
    private static final String TAG = "login.LoginController";
    private static LoginController controller;
    public String browserRefUrl;
    private boolean isNotifyLogout = false;
    private AtomicBoolean isAliuserSDKInited = new AtomicBoolean(false);
    private boolean autoLoginRateLimit = false;
    private long autoLoginLimitExpireTime = 0;
    private int autoLoginLeftToLimitCount = 0;

    private LoginController() {
    }

    public static /* synthetic */ void access$000(LoginController loginController, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43387c5", new Object[]{loginController, str, bundle});
        } else {
            loginController.umidTokenLogin(str, bundle);
        }
    }

    public static /* synthetic */ void access$100(LoginController loginController, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4818fbae", new Object[]{loginController, bundle});
        } else {
            loginController.simLogin(bundle);
        }
    }

    public static /* synthetic */ void access$200(LoginController loginController, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6289f4cd", new Object[]{loginController, bundle});
        } else {
            loginController.simVerifyLogin(bundle);
        }
    }

    public static /* synthetic */ void access$300(LoginController loginController, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cfaedec", new Object[]{loginController, bundle});
        } else {
            loginController.targetLogin(bundle);
        }
    }

    public static /* synthetic */ void access$600(LoginController loginController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64689dab", new Object[]{loginController});
        } else {
            loginController.prefetchForAutologin();
        }
    }

    public static /* synthetic */ void access$700(LoginController loginController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbcf2ec", new Object[]{loginController});
        } else {
            loginController.addLoginPlugin();
        }
    }

    private void addLoginPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7147a2", new Object[]{this});
            return;
        }
        SDKJSBridgeService.register();
        try {
            fsw.i("Scancode", ScancodeCallback.class, true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        JSBridgeService.register();
        ExecutorJSBridge.register();
    }

    private void apiReferUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f340476", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("apiName");
                UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder(jSONObject.optString("eventName", "NO_SESSION"));
                uTHitBuilders$UTCustomHitBuilder.setEventPage(UTConstant.PageName.UT_PAGE_EXTEND);
                if (!TextUtils.isEmpty(optString)) {
                    uTHitBuilders$UTCustomHitBuilder.setProperty("apiName", optString);
                }
                String optString2 = jSONObject.optString("msgCode");
                if (!TextUtils.isEmpty(optString2)) {
                    uTHitBuilders$UTCustomHitBuilder.setProperty(g1v.FIELD_ARG2, optString2);
                }
                UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
            } catch (JSONException unused) {
            }
        }
    }

    public static synchronized LoginController getInstance() {
        synchronized (LoginController.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginController) ipChange.ipc$dispatch("f24dadf2", new Object[0]);
            }
            if (controller == null) {
                controller = new LoginController();
            }
            return controller;
        }
    }

    private void openPage(final boolean z, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cba180", new Object[]{this, new Boolean(z), bundle});
            return;
        }
        if (Login.session == null) {
            Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
        }
        LoginTLogAdapter.e(TAG, "try sdkLogin");
        LoginThreadHelper.runOnUIThread(new LoginTask() { // from class: com.taobao.login4android.login.LoginController.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass12 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/login/LoginController$12");
            }

            @Override // com.taobao.login4android.thread.LoginTask
            public void excuteTask() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bc11f42", new Object[]{this});
                } else if (DataProviderFactory.getApplicationContext() != null) {
                    try {
                        Login.session.clearSessionOnlyCookie();
                        LoginTLogAdapter.e(LoginController.TAG, "start openLoginPage");
                        UserTrackAdapter.sendUT("login_api_show_page");
                        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openLoginPage(DataProviderFactory.getApplicationContext(), ApiReferer.generateApiReferer(), bundle);
                    } catch (Exception e) {
                        UserTrackAdapter.sendUT("openLoginPageFail");
                        LoginTLogAdapter.e(LoginController.TAG, e.getMessage());
                        e.printStackTrace();
                        if (z) {
                            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, 721, TLogTracker.SCENE_EXCEPTION, LoginController.this.browserRefUrl);
                        }
                    }
                } else if (z) {
                    BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, IMediaPlayer.MEDIA_INFO_VIDEO_RENDERING_NORMAL, "ContextNull", LoginController.this.browserRefUrl);
                }
            }
        });
    }

    private void prefetchForAutologin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f186f", new Object[]{this});
            return;
        }
        try {
            if (ServiceFactory.getService(NumberAuthService.class) != null) {
                if (Login.checkSessionValid() && !LoginSwitch.getSwitch("prefetch_ignore_session", "true")) {
                    return;
                }
                if (DeviceUtils.shouldReportSample(AppInfo.getInstance().getUtdid())) {
                    ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).preFecth(LoginType.LocalLoginType.AUTO_LOGIN);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void processNetworkError(RpcResponse<LoginReturnData> rpcResponse, boolean z, boolean z2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea27f417", new Object[]{this, rpcResponse, new Boolean(z), new Boolean(z2), bundle});
        } else if (RpcException.isSystemError(rpcResponse.code)) {
            if (LoginStatus.isFromChangeAccount()) {
                if (Login.session == null) {
                    Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
                }
                Login.session.recoverCookie();
            }
            if (z2) {
                HashMap hashMap = new HashMap();
                hashMap.put("clearSession", "false");
                hashMap.put(LoginConstants.LOGIN_TYPE, LoginType.LocalLoginType.AUTO_LOGIN);
                BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, rpcResponse.code, rpcResponse.message, (Map<String, String>) hashMap, this.browserRefUrl);
            }
        } else {
            userLogin(z, z2, bundle);
        }
    }

    private void simLogin(final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a857efdb", new Object[]{this, bundle});
            return;
        }
        final Properties properties = LoginComponent.getProperties();
        UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.SIM_LOGIN, properties);
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            String string = bundle.getString(LoginConstant.UMID_TOKEN, "");
            if (!TextUtils.isEmpty(string)) {
                hashMap.put(LoginConstant.UMID_TOKEN, string);
            }
        }
        ((LoginService) ServiceFactory.getService(LoginService.class)).onekeyLogin(DataProviderFactory.getApplicationContext(), hashMap, new CommonCallback() { // from class: com.taobao.login4android.login.LoginController.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    return;
                }
                LoginStatus.resetLoginFlag();
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.SIM_LOGIN, properties);
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    return;
                }
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "", LoginType.LocalLoginType.SIM_LOGIN, properties);
                LoginController.this.userLogin(true, true, bundle);
            }
        });
    }

    private void simVerifyLogin(final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5da17b4", new Object[]{this, bundle});
            return;
        }
        final Properties properties = LoginComponent.getProperties();
        UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN, properties);
        LoginParam loginParam = new LoginParam();
        if (bundle != null) {
            long j = bundle.getLong("hid", 0L);
            String string = bundle.getString(LoginConstant.LOGIN_ID, "");
            loginParam.hid = j;
            loginParam.loginId = string;
        }
        ((LoginService) ServiceFactory.getService(LoginService.class)).mobileVerifyLogin(DataProviderFactory.getApplicationContext(), loginParam, new CommonCallback() { // from class: com.taobao.login4android.login.LoginController.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    return;
                }
                LoginStatus.resetLoginFlag();
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN, properties);
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                    return;
                }
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "", LoginType.LocalLoginType.MOBILE_VERIFY_LOGIN, properties);
                LoginController.this.userLogin(true, true, bundle);
            }
        });
    }

    private void umidTokenLogin(String str, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e75dcf00", new Object[]{this, str, bundle});
            return;
        }
        final Properties properties = LoginComponent.getProperties();
        UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.UMID_LOGIN, properties);
        final LoginBaseParam loginBaseParam = new LoginBaseParam();
        loginBaseParam.token = str;
        loginBaseParam.ext = new HashMap();
        loginBaseParam.site = DataProviderFactory.getDataProvider().getSite();
        loginBaseParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.UMID_LOGIN, UTConstant.PageName.UT_PAGE_LOGIN_BAR);
        AutoLoginBusiness.umidLogin(loginBaseParam, new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ void access$400(AnonymousClass7 r4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a051ad76", new Object[]{r4});
                } else {
                    r4.failed();
                }
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                } else if (rpcResponse == null || rpcResponse.returnValue == 0 || !(rpcResponse instanceof DefaultLoginResponseData) || !TextUtils.equals(rpcResponse.actionType, "H5")) {
                    failed();
                } else {
                    DefaultLoginResponseData defaultLoginResponseData = (DefaultLoginResponseData) rpcResponse;
                    boolean equals = "true".equals(((LoginReturnData) defaultLoginResponseData.returnValue).extMap.get(mop.KEY_IS_TRANSPARENT));
                    T t = defaultLoginResponseData.returnValue;
                    String str2 = ((LoginReturnData) t).h5Url;
                    String str3 = ((LoginReturnData) t).token;
                    String str4 = ((LoginReturnData) t).scene;
                    UrlParam urlParam = new UrlParam();
                    urlParam.url = str2;
                    urlParam.token = str3;
                    urlParam.scene = str4;
                    urlParam.loginParam = loginBaseParam;
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToLoginUrlPage(DataProviderFactory.getApplicationContext(), urlParam, equals, new LoginFilterCallback() { // from class: com.taobao.login4android.login.LoginController.7.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onFail(int i, Map<String, String> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i), map});
                            } else {
                                AnonymousClass7.access$400(AnonymousClass7.this);
                            }
                        }

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onSuccess() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d0e393ab", new Object[]{this});
                            } else {
                                AnonymousClass7.access$400(AnonymousClass7.this);
                            }
                        }
                    });
                }
            }

            private void failed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("219db244", new Object[]{this});
                    return;
                }
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "", LoginType.LocalLoginType.UMID_LOGIN, properties);
                LoginController.this.userLogin(true, true, bundle);
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    return;
                }
                LoginController.this.processAutoLoginResponse(rpcResponse, false, true, null);
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.UMID_LOGIN, properties);
            }
        });
    }

    public void applyToken(InternalTokenCallback internalTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eaad9e4", new Object[]{this, internalTokenCallback});
        } else {
            applyToken(DataProviderFactory.getDataProvider().getSite(), internalTokenCallback);
        }
    }

    public void applyTokenWithRemoteBiz(int i, String str, InternalTokenCallback internalTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87fe8fc", new Object[]{this, new Integer(i), str, internalTokenCallback});
        } else {
            applyTokenWithRemoteBiz(i, str, null, true, internalTokenCallback);
        }
    }

    public void autoLoginTargetAccount(String str, String str2, int i, boolean z, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1360ee86", new Object[]{this, str, str2, new Integer(i), new Boolean(z), bundle});
        } else {
            autoLoginTargetAccount(str, str2, i, z, bundle, true);
        }
    }

    public void callAfterLogoutRpc(String str, boolean z, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acdffb7", new Object[]{this, str, new Boolean(z), commonCallback});
            return;
        }
        if (z) {
            emptySessionList();
        }
        logoutClean(str);
        if (commonCallback != null) {
            commonCallback.onSuccess();
        }
    }

    public void checkNickModifiable(final CheckResultCallback checkResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a259443f", new Object[]{this, checkResultCallback});
        } else if (checkResultCallback != null) {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, String>() { // from class: com.taobao.login4android.login.LoginController.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass16 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/login/LoginController$16");
                }

                @Override // android.os.AsyncTask
                public String doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("db0124f4", new Object[]{this, objArr}) : Login.getDeviceTokenKey(Login.getUserId());
                }

                public void onPostExecute(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fe870167", new Object[]{this, str});
                    } else {
                        UrlFetchServiceImpl.getInstance().checkNickModifiable(new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.16.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.mobile.callback.RpcRequestCallback
                            public void onError(RpcResponse rpcResponse) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                                } else {
                                    checkResultCallback.result(false);
                                }
                            }

                            @Override // com.ali.user.mobile.callback.RpcRequestCallback
                            public void onSuccess(RpcResponse rpcResponse) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                                    return;
                                }
                                MtopCanChangeNickResponseData mtopCanChangeNickResponseData = (MtopCanChangeNickResponseData) rpcResponse;
                                if (mtopCanChangeNickResponseData != null) {
                                    checkResultCallback.result(mtopCanChangeNickResponseData.success);
                                }
                            }
                        });
                    }
                }
            }, new Object[0]);
        }
    }

    public void clearLoginInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c2afb", new Object[]{this, str});
            return;
        }
        try {
            if (DataProviderFactory.getDataProvider().isRemoveSessionWhenLogout()) {
                SecurityGuardManagerWraper.removeSessionModelFromFile(str);
            } else {
                SecurityGuardManagerWraper.removeSessionAutoLoginTokenFromFile(str);
            }
            Login.session.setSsoToken(null);
            Login.session.setOneTimeToken(null);
            Login.session.clearAutoLoginInfo();
            Login.session.clearSessionInfo();
            LoginTLogAdapter.e(TAG, "clear sessionInfo in LoginController.clearLoginInfo");
            CPHelper.delete(DataProviderFactory.getApplicationContext(), LoginConstant.ACCOUNT);
            UninstallManager.getInstance().clearSessionData();
        } catch (Exception e) {
            e.printStackTrace();
            LoginTLogAdapter.e(TAG, "clearLoginInfo Exception");
        }
    }

    public void doAutoLoginWithCallback(String str, String str2, int i, String str3, boolean z, AutoLoginCallback autoLoginCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c980af4", new Object[]{this, str, str2, new Integer(i), str3, new Boolean(z), autoLoginCallback});
        } else if (autoLoginCallback != null) {
            AutoLoginParam autoLoginParam = new AutoLoginParam();
            autoLoginParam.token = str;
            autoLoginParam.userId = str2;
            autoLoginParam.site = i;
            autoLoginParam.apiRefer = str3;
            autoLoginParam.needBroadcast = z;
            doAutoLoginWithCallback(autoLoginParam, autoLoginCallback);
        }
    }

    public void doReloginWithCallback(String str, String str2, final boolean z, final AutoLoginCallback autoLoginCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3808fbcd", new Object[]{this, str, str2, new Boolean(z), autoLoginCallback});
            return;
        }
        final Properties properties = LoginComponent.getProperties();
        UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
        AutoLoginBusiness.uninstallRelogin(str, str2, new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                } else {
                    onSuccess(rpcResponse);
                }
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else if (rpcResponse == null) {
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "empty response", LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
                    autoLoginCallback.onBizFail(-2, "Null Response");
                } else if (RpcException.isSystemError(rpcResponse.code)) {
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, String.valueOf(rpcResponse.code), LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
                    autoLoginCallback.onNetworkError();
                } else if (!"SUCCESS".equals(rpcResponse.actionType)) {
                    if (LoginSwitch.getSwitch("uninstallTagCaseReloginBizFail", "true")) {
                        ReloginDelegate.setReloginOnce();
                    }
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "BizError", LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
                    autoLoginCallback.onBizFail(rpcResponse.code, rpcResponse.message);
                } else if (UninstallManager.checkIsLoggingIn()) {
                    LoginContext.uninstallResponse = rpcResponse;
                    LoginContext.uninstallType = 2;
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "isLogining", LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
                    autoLoginCallback.onBizFail(BSError.BSDIFF_NEW_FILE_MD5_MISMATCH, "user trigger login");
                } else {
                    LoginController.this.processAutoLoginResponse(rpcResponse, false, z, null);
                    autoLoginCallback.onSuccess();
                    UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.LOGIN_TYPE_UMID, properties);
                }
            }
        });
    }

    public void doSimpleLogoutRpc(LogoutParam logoutParam, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2193d5f5", new Object[]{this, logoutParam, commonCallback});
            return;
        }
        new LogoutBusiness().logout(logoutParam);
        callAfterLogoutRpc(logoutParam.userid, logoutParam.emptyAll, commonCallback);
    }

    public void emptySessionList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe79f5ce", new Object[]{this});
        } else if (DataProviderFactory.getDataProvider().isRemoveSessionWhenLogout()) {
            SecurityGuardManagerWraper.emptySessionListFromFile();
        } else {
            SecurityGuardManagerWraper.emptyAllSessionAutoLoginTokenFromFile();
        }
    }

    public synchronized void logout(int i, String str, String str2, String str3, boolean z, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6968055", new Object[]{this, new Integer(i), str, str2, str3, new Boolean(z), commonCallback});
            return;
        }
        LogoutParam logoutParam = new LogoutParam();
        logoutParam.site = i;
        logoutParam.sid = str;
        logoutParam.autologinToken = str2;
        logoutParam.userid = str3;
        logoutParam.emptyAll = z;
        logout(logoutParam, commonCallback);
    }

    public void navToIVByScene(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a897bf02", new Object[]{this, context, str, new Integer(i)});
        } else {
            navToIVByScene(context, str, i, null);
        }
    }

    public void navToIVWithUserId(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2711aade", new Object[]{this, context, str, str2});
        } else {
            navToIVWithUserId(context, str, DataProviderFactory.getDataProvider().getSite(), str2);
        }
    }

    public void navToWebViewByScene(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730bbe72", new Object[]{this, context, str, new Integer(i)});
        } else {
            navToWebViewByScene(context, str, i, null);
        }
    }

    public void old2NewAutoLogin(String str, String str2, int i, boolean z, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29043c23", new Object[]{this, str, str2, new Integer(i), new Boolean(z), bundle});
            return;
        }
        try {
            processAutoLoginResponse(new AutoLoginBusiness().oldLogin(str, str2, i, ApiReferer.generateApiReferer()), z, true, bundle);
        } catch (Throwable unused) {
            userLogin(z, true, bundle);
        }
    }

    public void openLoginPage(Context context, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18540c81", new Object[]{this, context, bundle});
            return;
        }
        try {
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openLoginPage(context, ApiReferer.generateApiReferer(), bundle);
        } catch (Exception e) {
            e.printStackTrace();
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, IMediaPlayer.MEDIA_INFO_VIDEO_SWITCH_FAILED, TLogTracker.SCENE_EXCEPTION, this.browserRefUrl);
        }
    }

    public void openRegisterPage(Context context, RegistParam registParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e173cd3", new Object[]{this, context, registParam});
            return;
        }
        try {
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openRegisterPage(context, registParam);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openScheme(Context context, UrlParam urlParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c667dd5", new Object[]{this, context, urlParam});
            return;
        }
        if (context == null) {
            context = DataProviderFactory.getApplicationContext();
        }
        if (urlParam == null || TextUtils.isEmpty(urlParam.url)) {
            LoginTLogAdapter.e(TAG, "openScheme fail ,url=" + urlParam.url);
            return;
        }
        Intent intent = new Intent();
        intent.setData(Uri.parse(urlParam.url));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openUrl(Context context, UrlParam urlParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bddf525f", new Object[]{this, context, urlParam});
            return;
        }
        if (context == null) {
            context = DataProviderFactory.getApplicationContext();
        }
        if (urlParam == null || TextUtils.isEmpty(urlParam.url)) {
            LoginTLogAdapter.e(TAG, "openUrl fail ,url=" + urlParam.url);
            return;
        }
        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(context, urlParam);
    }

    public boolean processAutoLoginResponse(RpcResponse<LoginReturnData> rpcResponse, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa6aba7e", new Object[]{this, rpcResponse, new Boolean(z)})).booleanValue() : processAutoLoginResponse(rpcResponse, z, true, null);
    }

    public boolean refreshCookies(boolean z, boolean z2) {
        ISession iSession;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2a50d7f", new Object[]{this, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (!z || (iSession = Login.session) == null) {
            return false;
        }
        return iSession.recoverCookie();
    }

    public void userLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f8cf8f", new Object[]{this, new Boolean(z)});
        } else {
            userLogin(z, true, null);
        }
    }

    private void alipaySsoLogin(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc393169", new Object[]{this, bundle});
            return;
        }
        LoginTLogAdapter.e(TAG, "alipay login");
        String generateTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.ALIPAY_TRUST_LOGIN, UTConstant.PageName.UT_PAGE_ALIPAY_TRUST_LOGIN);
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", generateTraceId);
        UserTrackAdapter.control(UTConstant.PageName.UT_PAGE_ALIPAY_TRUST_LOGIN, UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.ASO_LOGIN, hashMap);
        Properties properties = LoginComponent.getProperties();
        properties.setProperty("sdkTraceId", generateTraceId + "");
        UserTrackAdapter.sendExtendUT(UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.ALIPAY_TRUST_LOGIN, properties);
        String string = bundle.getString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, "");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("source", bundle.getString("source", ""));
        hashMap2.put("version", bundle.getString("version", ""));
        hashMap2.put("app_id", bundle.getString("app_id", ""));
        hashMap2.put(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY, bundle.getString(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY, ""));
        hashMap2.put(AlipayConstant.LOGIN_ALIPAY_CLIENT_VERSION_KEY, bundle.getString(AlipayConstant.LOGIN_ALIPAY_CLIENT_VERSION_KEY, ""));
        hashMap2.put(AlipayConstant.LOGIN_ALIPAY_USER_ID_KEY, bundle.getString(AlipayConstant.LOGIN_ALIPAY_USER_ID_KEY, ""));
        if ((Login.checkSessionValid() || !TextUtils.isEmpty(Login.getLoginToken())) && LoginApprearanceExtensions.AsoLoginFlow.getAsoLoginCallback() != null) {
            hashMap2.put(AlipayConstant.LOGIN_ALIPAY_ACCOUNT_CHECK_KEY, String.valueOf(true));
            hashMap2.put(AlipayConstant.LOGIN_ALIPAY_HAVANA_ID_KEY, Login.getUserId());
        }
        LoginParam loginParam = new LoginParam();
        loginParam.sdkTraceId = generateTraceId;
        loginParam.loginSourceType = LoginType.LocalLoginType.ALIPAY_TRUST_LOGIN;
        loginParam.utPageName = UTConstant.PageName.UT_PAGE_ALIPAY_TRUST_LOGIN;
        loginParam.tokenType = TokenType.ALIPAY_TRUST_LOGIN;
        AlipaySSOLogin.alipayLogin(string, hashMap2, loginParam);
    }

    private void logoutClean(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc67d030", new Object[]{this, str});
        } else if (!this.isNotifyLogout) {
            clearLoginInfo(str);
            ApiReferer.Refer refer = new ApiReferer.Refer();
            refer.eventName = "USER_LOGOUT";
            if (Login.session == null) {
                Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
            }
            Login.session.appendEventTrace(JSON.toJSONString(refer));
            LoginStatus.setLastRefreshCookieTime(0L);
            LoginStatus.resetLoginFlag();
            HashMap hashMap = new HashMap();
            hashMap.put(LoginConstants.LOGOUT_TYPE, LoginConstants.LogoutType.NORMAL_LOGOUT.getType());
            hashMap.put("nick", Login.session.getOldNick());
            hashMap.put("uid", Login.getOldUserId());
            UserTrackAdapter.sendUT("SEND_LOGOUT_BROADCAST");
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGOUT, false, 0, "", (Map<String, String>) hashMap, this.browserRefUrl);
            LoginTLogAdapter.e(TAG, "logout finish");
            this.isNotifyLogout = true;
        }
    }

    private void registerAliuserActionReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c6a932", new Object[]{this});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(LoginResActions.LOGIN_CANCEL_ACTION);
            intentFilter.addAction(LoginResActions.LOGIN_FAIL_ACTION);
            intentFilter.addAction(LoginResActions.LOGIN_SUCCESS_ACTION);
            intentFilter.addAction(LoginResActions.LOGIN_OPEN_ACTION);
            intentFilter.addAction(LoginResActions.LOGIN_NETWORK_ERROR);
            intentFilter.addAction(LoginResActions.WEB_ACTIVITY_CANCEL);
            intentFilter.addAction(LoginResActions.WEB_ACTIVITY_RESULT);
            intentFilter.addAction(LoginResActions.REG_CANCEL);
            intentFilter.addAction(AppInfo.INITED_ACTION);
            intentFilter.addAction(LoginConstant.RESET_LOGIN_STATUS);
            intentFilter.addAction(OtherActions.TBPWD_OPEN);
            intentFilter.addAction(OtherActions.TBPWD_NOT_OPEN);
            intentFilter.setPriority(1000);
            LocalBroadcastManager.getInstance(DataProviderFactory.getApplicationContext()).registerReceiver(new AliuserActionReceiver(), intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.ali.user.sdk.login.TEST_ACCOUNT_SSO");
            if (Debuggable.isDebug()) {
                intentFilter2.addAction("com.ali.user.sdk.login.PWD");
                intentFilter2.addAction("com.ali.user.sdk.login.LOGOUT");
            }
            DataProviderFactory.getApplicationContext().registerReceiver(new LoginTestBroadcastReceiver(), intentFilter2);
            LoginTLogAdapter.e("AliuserActionReceiver", "register receiver");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            Context applicationContext = DataProviderFactory.getApplicationContext();
            if (!LoginSwitch.getSwitch("new_gprs_listen", "true") || Build.VERSION.SDK_INT < 24) {
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                applicationContext.registerReceiver(new StatusReceiver(), intentFilter3);
                return;
            }
            final ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
            ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.taobao.login4android.login.LoginController.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass20 r4, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == 838841652) {
                        super.onAvailable((Network) objArr[0]);
                        return null;
                    } else if (hashCode == 2071672155) {
                        super.onLost((Network) objArr[0]);
                        return null;
                    } else {
                        int hashCode2 = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/login4android/login/LoginController$20");
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b7b355b", new Object[]{this, network});
                    } else {
                        super.onLost(network);
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("31ffb534", new Object[]{this, network});
                        return;
                    }
                    try {
                        super.onAvailable(network);
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                            if (!LoginStatus.isUserLogin() && !TextUtils.isEmpty(Login.getLoginToken())) {
                                return;
                            }
                            NetworkUtil.preFecth("networkConnected2");
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            };
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addTransportType(0);
            connectivityManager.registerNetworkCallback(builder.build(), networkCallback);
        } catch (Exception e) {
            LoginTLogAdapter.w("register status receiver error", e);
        }
    }

    private void targetLogin(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28aa995", new Object[]{this, bundle});
            return;
        }
        final Properties properties = LoginComponent.getProperties();
        UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_COMMIT, "", LoginType.LocalLoginType.AUTO_LOGIN, properties);
        AutoLoginParam autoLoginParam = new AutoLoginParam();
        final long j = bundle.getLong("hid", 0L);
        autoLoginParam.token = bundle.getString(LoginConstant.AUTOLOGIN_TOKEN);
        autoLoginParam.userId = String.valueOf(j);
        autoLoginParam.site = SiteUtil.getDefaultLoginSite();
        autoLoginParam.apiRefer = ApiReferer.generateApiReferer();
        autoLoginParam.needBroadcast = true;
        doAutoLoginWithCallback(autoLoginParam, new AutoLoginCallback() { // from class: com.taobao.login4android.login.LoginController.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.AutoLoginCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    return;
                }
                LoginStatus.resetLoginFlag();
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_SUCCESS, "", LoginType.LocalLoginType.AUTO_LOGIN, properties);
            }

            @Override // com.ali.user.mobile.model.AutoLoginCallback
            public void onBizFail(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("772d31f4", new Object[]{this, new Integer(i), str});
                    return;
                }
                Bundle bundle2 = new Bundle();
                LoginParam loginParam = new LoginParam();
                loginParam.hid = j;
                bundle2.putString(LoginConstant.LOGINPARAM, JSON.toJSONString(loginParam));
                bundle2.putBoolean(LoginConstant.LAUNCH_PASS_GUIDE_FRAGMENT, true);
                bundle2.putBoolean(LoginConstant.FORCE_NOT_FAST, true);
                LoginController.getInstance().userLogin(true, true, bundle2);
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "", LoginType.LocalLoginType.AUTO_LOGIN, properties);
            }

            @Override // com.ali.user.mobile.model.AutoLoginCallback
            public void onNetworkError() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("933d2000", new Object[]{this});
                    return;
                }
                UserTrackAdapter.sendUT(UTConstant.PageName.UT_PAGE_LOGIN_BAR, UTConstant.CustomEvent.UT_SINGLE_LOGIN_FAILURE, "", LoginType.LocalLoginType.AUTO_LOGIN, properties);
                ToastUtil.showToast(DataProviderFactory.getApplicationContext(), ResourceUtil.getNetworkError(), 0);
            }
        });
    }

    public void applyToken(final int i, final InternalTokenCallback internalTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52967183", new Object[]{this, new Integer(i), internalTokenCallback});
        } else if (internalTokenCallback != null) {
            try {
                if (Login.session != null) {
                    BackgroundExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.21
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            long currentTimeMillis;
                            long j;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            final String oneTimeToken = Login.getOneTimeToken();
                            if (oneTimeToken != null) {
                                MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.21.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            internalTokenCallback.onSucess(oneTimeToken);
                                        }
                                    }
                                });
                            } else if (TextUtils.isEmpty(Login.session.getUserId())) {
                                MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.21.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            internalTokenCallback.onFail(LoginConstant.FETCH_TOKEN_FAIL_SESSION_INVALID, "Session is null or Session is invalid.");
                                        }
                                    }
                                });
                            } else {
                                try {
                                    final RpcResponse<MLoginTokenReturnValue> applyToken = UserLoginServiceImpl.getInstance().applyToken(i, Login.session.getUserId(), null);
                                    if (applyToken == null) {
                                        AppMonitorAdapter.commitFail("Page_Member_Other", "GetHavanaSSOtoken", "0", "");
                                        MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.21.3
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                } else {
                                                    internalTokenCallback.onFail("RET_NULL", "apply token return null.");
                                                }
                                            }
                                        });
                                        return;
                                    }
                                    int i2 = applyToken.code;
                                    if (i2 != 3000 || applyToken.returnValue == null) {
                                        AppMonitorAdapter.commitFail("Page_Member_Other", "GetHavanaSSOtoken", "0", String.valueOf(i2));
                                        if (applyToken.code != 13032) {
                                            MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.21.5
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    IpChange ipChange3 = $ipChange;
                                                    if (ipChange3 instanceof IpChange) {
                                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                    } else {
                                                        internalTokenCallback.onFail(LoginConstant.FETCH_TOKEN_FAIL_NOT_SESSION_INVALID, "网络获取旺信token失败，非session失效");
                                                    }
                                                }
                                            });
                                            Login.setHavanaSsoTokenExpiredTime(0L);
                                            Login.setOneTimeToken(null);
                                            return;
                                        }
                                        RpcResponse<LoginReturnData> autoLogin = new AutoLoginBusiness().autoLogin(Login.getLoginToken(), Login.getUserId(), SiteUtil.getDefaultLoginSite(), ApiReferer.generateApiReferer());
                                        if (autoLogin != null && "SUCCESS".equals(autoLogin.actionType)) {
                                            LoginController.this.processAutoLoginResponse(autoLogin, false);
                                            final String oneTimeToken2 = Login.getOneTimeToken();
                                            MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.21.7
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    IpChange ipChange3 = $ipChange;
                                                    if (ipChange3 instanceof IpChange) {
                                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                    } else {
                                                        internalTokenCallback.onSucess(oneTimeToken2);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.21.6
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                    return;
                                                }
                                                InternalTokenCallback internalTokenCallback2 = internalTokenCallback;
                                                internalTokenCallback2.onFail(LoginConstant.FETCH_TOKEN_FAIL_AUTO_LOGIN_FAIL, applyToken.message + ", mtop autoLoginFail");
                                            }
                                        });
                                        return;
                                    }
                                    AppMonitorAdapter.commitSuccess("Page_Member_Other", "GetHavanaSSOtoken");
                                    int i3 = applyToken.returnValue.expireTime;
                                    if (i3 == 0) {
                                        currentTimeMillis = System.currentTimeMillis() / 1000;
                                        j = 900;
                                    } else {
                                        currentTimeMillis = System.currentTimeMillis() / 1000;
                                        j = i3;
                                    }
                                    Login.setHavanaSsoTokenExpiredTime(currentTimeMillis + j);
                                    Login.setOneTimeToken(applyToken.returnValue.token);
                                    MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.21.4
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                internalTokenCallback.onSucess(((MLoginTokenReturnValue) applyToken.returnValue).token);
                                            }
                                        }
                                    });
                                } catch (RpcException e) {
                                    e.printStackTrace();
                                    LoginTLogAdapter.e(LoginController.TAG, e);
                                    MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.21.8
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                                return;
                                            }
                                            InternalTokenCallback internalTokenCallback2 = internalTokenCallback;
                                            internalTokenCallback2.onFail(LoginConstant.FETCH_TOKEN_FAIL_EXCEPTION, e.getMessage() + "|" + e.getExtCode());
                                        }
                                    });
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    LoginTLogAdapter.e(LoginController.TAG, e2);
                                    MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.21.9
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                internalTokenCallback.onFail(LoginConstant.FETCH_TOKEN_FAIL_EXCEPTION, e2.getMessage());
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    });
                } else {
                    internalTokenCallback.onFail(LoginConstant.FETCH_TOKEN_FAIL_SESSION_INVALID, "Session is null or Session is invalid.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                LoginTLogAdapter.e(TAG, e);
                internalTokenCallback.onFail(LoginConstant.FETCH_TOKEN_FAIL_EXCEPTION, e.getMessage());
            }
        }
    }

    public void applyTokenWithRemoteBiz(int i, String str, Map<String, String> map, boolean z, final InternalTokenCallback internalTokenCallback) {
        HistoryAccount findHistoryAccount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca5b3ab", new Object[]{this, new Integer(i), str, map, new Boolean(z), internalTokenCallback});
        } else if (internalTokenCallback != null) {
            RpcRequest rpcRequest = new RpcRequest();
            rpcRequest.API_NAME = "com.taobao.mtop.mLoginTokenService.applySsoToken";
            rpcRequest.VERSION = "1.1";
            rpcRequest.addParam("ext", JSON.toJSONString(new HashMap()));
            rpcRequest.NEED_ECODE = true;
            rpcRequest.NEED_SESSION = true;
            if (map != null) {
                rpcRequest.addParam("ext", JSON.toJSONString(map));
            }
            ApplyTokenRequest applyTokenRequest = new ApplyTokenRequest();
            applyTokenRequest.appName = DataProviderFactory.getDataProvider().getAppkey();
            applyTokenRequest.t = System.currentTimeMillis();
            applyTokenRequest.appVersion = AppInfo.getInstance().getAndroidAppVersion();
            applyTokenRequest.sdkVersion = AppInfo.getInstance().getSdkVersion();
            applyTokenRequest.site = i;
            rpcRequest.requestSite = i;
            if (!TextUtils.isEmpty(str) && (findHistoryAccount = SecurityGuardManagerWraper.findHistoryAccount(Long.parseLong(str))) != null) {
                applyTokenRequest.deviceTokenKey = findHistoryAccount.tokenKey;
                DeviceTokenSignParam deviceTokenSignParam = new DeviceTokenSignParam();
                if (!TextUtils.isEmpty(DataProviderFactory.getDataProvider().getAppkey())) {
                    deviceTokenSignParam.addAppKey(DataProviderFactory.getDataProvider().getAppkey());
                }
                deviceTokenSignParam.addAppVersion(AppInfo.getInstance().getAndroidAppVersion());
                deviceTokenSignParam.addHavanaId(str);
                deviceTokenSignParam.addTimestamp(String.valueOf(applyTokenRequest.t));
                deviceTokenSignParam.addSDKVersion(AppInfo.getInstance().getSdkVersion());
                if (!TextUtils.isEmpty(findHistoryAccount.tokenKey)) {
                    applyTokenRequest.deviceTokenSign = AlibabaSecurityTokenService.sign(findHistoryAccount.tokenKey, deviceTokenSignParam.build());
                }
            }
            rpcRequest.addParam("request", JSON.toJSONString(applyTokenRequest));
            rpcRequest.SHOW_LOGIN_UI = z;
            ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, LoginTokenResponseData.class, new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.22
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onError(RpcResponse rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    } else {
                        internalTokenCallback.onFail("RET_NULL", rpcResponse.message);
                    }
                }

                @Override // com.ali.user.mobile.callback.RpcRequestCallback
                public void onSuccess(RpcResponse rpcResponse) {
                    long currentTimeMillis;
                    long j;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                    } else if (rpcResponse instanceof LoginTokenResponseData) {
                        final LoginTokenResponseData loginTokenResponseData = (LoginTokenResponseData) rpcResponse;
                        AppMonitorAdapter.commitSuccess("Page_Member_Other", "GetHavanaSSOtoken");
                        int i2 = ((MLoginTokenReturnValue) loginTokenResponseData.returnValue).expireTime;
                        if (i2 == 0) {
                            currentTimeMillis = System.currentTimeMillis() / 1000;
                            j = 900;
                        } else {
                            currentTimeMillis = System.currentTimeMillis() / 1000;
                            j = i2;
                        }
                        Login.setHavanaSsoTokenExpiredTime(currentTimeMillis + j);
                        Login.setOneTimeToken(((MLoginTokenReturnValue) loginTokenResponseData.returnValue).token);
                        MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.22.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    internalTokenCallback.onSucess(((MLoginTokenReturnValue) loginTokenResponseData.returnValue).token);
                                }
                            }
                        });
                    } else {
                        internalTokenCallback.onFail("RET_NULL", rpcResponse.message);
                    }
                }
            });
        }
    }

    public void autoLoginTargetAccount(final String str, final String str2, final int i, final boolean z, final Bundle bundle, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58bd950e", new Object[]{this, str, str2, new Integer(i), new Boolean(z), bundle, new Boolean(z2)});
            return;
        }
        try {
            LoginTLogAdapter.e(TAG, "autoLoginTargetAccount() called with: userid = [" + str + "], loginToken = [" + str2 + "], targetSite = [" + i + "], showUI = [" + z + "], data = [" + bundle + "]");
            if (!z2 || !TextUtils.isEmpty(AppInfo.getInstance().getUmidToken())) {
                if (this.autoLoginRateLimit && System.currentTimeMillis() < this.autoLoginLimitExpireTime) {
                    int i2 = this.autoLoginLeftToLimitCount;
                    if (i2 <= 0) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("clearSession", "false");
                        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, 728, "limit", (Map<String, String>) hashMap, this.browserRefUrl);
                        return;
                    }
                    this.autoLoginLeftToLimitCount = i2 - 1;
                }
                processAutoLoginResponse(new AutoLoginBusiness().autoLogin(str2, str, i, z, ApiReferer.generateApiReferer()), z, true, bundle);
                return;
            }
            AppInfo.getInstance().getUmidToken(new DataCallback<String>() { // from class: com.taobao.login4android.login.LoginController.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void result(String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dec15eee", new Object[]{this, str3});
                    } else {
                        LoginController.this.autoLoginTargetAccount(str, str2, i, z, bundle, false);
                    }
                }
            }, 3000);
        } catch (Throwable th) {
            if (TextUtils.equals(Login.getUserId(), str)) {
                ApiReferer.Refer refer = new ApiReferer.Refer();
                refer.eventName = "autoLoginFailed";
                refer.errorMessage = th.getMessage();
                if (Login.session == null) {
                    Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
                }
                Login.session.appendEventTrace(JSON.toJSONString(refer));
            }
            userLogin(z, true, bundle);
        }
    }

    public void navByScheme(String str, String str2, final String str3, final String str4, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470edbf", new Object[]{this, str, str2, str3, str4, commonCallback});
            return;
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.APPLY_SSO_TOKEN_V2;
        rpcRequest.VERSION = "1.0";
        rpcRequest.NEED_ECODE = true;
        rpcRequest.NEED_SESSION = true;
        rpcRequest.requestSite = DataProviderFactory.getDataProvider().getSite();
        final ApplySsoTokenRequest applySsoTokenRequest = new ApplySsoTokenRequest();
        applySsoTokenRequest.slaveAppKey = str;
        applySsoTokenRequest.masterAppKey = DataProviderFactory.getDataProvider().getAppkey();
        applySsoTokenRequest.ssoVersion = SSOIPCConstants.CURRENT_SSO_MINI_PROGRAM;
        String str5 = "hap://app/" + str2 + "/SsoLoginMid?visa=8617ab96f88d12c0";
        applySsoTokenRequest.targetUrl = str5;
        applySsoTokenRequest.slaveBundleId = str5;
        applySsoTokenRequest.hid = Login.getUserId();
        rpcRequest.addParam(ApiConstants.ApiField.SSO_TOKEN_APPLY_REQUEST, JSON.toJSONString(applySsoTokenRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(SecurityGuardManagerWraper.buildWSecurityData()));
        rpcRequest.addParam("ext", JSON.toJSONString(new HashMap()));
        ((RpcService) ServiceFactory.getService(RpcService.class)).remoteBusiness(rpcRequest, SSOV2ApplySsoTokenResponseData.class, new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.23
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                String str6;
                int i;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    return;
                }
                CommonCallback commonCallback2 = commonCallback;
                if (commonCallback2 != null) {
                    if (rpcResponse != null) {
                        i = rpcResponse.code;
                        str6 = rpcResponse.message;
                    } else {
                        i = 1001;
                        str6 = "unknown error";
                    }
                    commonCallback2.onFail(i, str6);
                }
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                SSOV2ApplySsoTokenResponseData sSOV2ApplySsoTokenResponseData;
                ResolveInfo resolveInfo;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else if (rpcResponse != null) {
                    Intent intent = new Intent();
                    String str6 = applySsoTokenRequest.targetUrl;
                    SSOMasterParam sSOMasterParam = new SSOMasterParam();
                    sSOMasterParam.appKey = DataProviderFactory.getDataProvider().getAppkey();
                    sSOMasterParam.ssoToken = (String) ((SSOV2ApplySsoTokenResponseData) rpcResponse).returnValue;
                    sSOMasterParam.t = System.currentTimeMillis();
                    sSOMasterParam.userId = Login.getUserId();
                    sSOMasterParam.ssoVersion = SSOIPCConstants.CURRENT_SSO_MINI_PROGRAM;
                    try {
                        sSOMasterParam.sign = SSOSecurityService.getInstace(DataProviderFactory.getApplicationContext()).sign(sSOMasterParam.appKey, sSOMasterParam.toMap());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    intent.setData(Uri.parse(((str6 + "&resultCode=500") + "&ssoToken=" + ((String) sSOV2ApplySsoTokenResponseData.returnValue)) + "&sourceAppKey=" + sSOMasterParam.appKey + "&ssoVersion=" + sSOMasterParam.ssoVersion + "&masterT=" + sSOMasterParam.t + "&userId=" + sSOMasterParam.userId + "&sign=" + sSOMasterParam.sign + "&targetPage=" + Uri.encode(str3)));
                    if (!TextUtils.isEmpty(str4)) {
                        intent.setAction(str4);
                    } else {
                        intent.setAction("android.intent.action.VIEW");
                    }
                    List<ResolveInfo> queryIntentActivities = DataProviderFactory.getApplicationContext().getPackageManager().queryIntentActivities(intent, 0);
                    if (queryIntentActivities != null) {
                        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                        while (it.hasNext()) {
                            resolveInfo = it.next();
                            String str7 = resolveInfo.activityInfo.packageName;
                            String config = LoginSwitch.getConfig(LoginSwitch.SUPPORT_MINI_PROGRAME, "");
                            if (TextUtils.isEmpty(config)) {
                                break;
                            }
                            try {
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                            if (new JSONObject(config).optBoolean(str7)) {
                                break;
                            }
                        }
                    }
                    resolveInfo = null;
                    if (resolveInfo != null) {
                        intent.setFlags(268435456);
                        intent.setPackage(resolveInfo.activityInfo.packageName);
                        try {
                            DataProviderFactory.getApplicationContext().startActivity(intent);
                            CommonCallback commonCallback2 = commonCallback;
                            if (commonCallback2 != null) {
                                commonCallback2.onSuccess();
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                            CommonCallback commonCallback3 = commonCallback;
                            if (commonCallback3 != null) {
                                commonCallback3.onFail(1001, "start activity failed");
                            }
                        }
                    } else {
                        CommonCallback commonCallback4 = commonCallback;
                        if (commonCallback4 != null) {
                            commonCallback4.onFail(1002, "can't find packageName");
                        }
                    }
                }
            }
        });
    }

    public void navToIVByScene(final Context context, final String str, int i, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f860f292", new Object[]{this, context, str, new Integer(i), bundle});
            return;
        }
        final VerifyParam verifyParam = new VerifyParam();
        verifyParam.fromSite = i;
        verifyParam.actionType = str;
        verifyParam.userId = Login.getUserId();
        new CoordinatorWrapper().execute(new AsyncTask<Object, Void, String>() { // from class: com.taobao.login4android.login.LoginController.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ void access$500(AnonymousClass15 r4, RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fae7040f", new Object[]{r4, rpcResponse});
                } else {
                    r4.errorBroadcast(rpcResponse);
                }
            }

            private void errorBroadcast(RpcResponse rpcResponse) {
                String str2;
                int i2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4cb53d4d", new Object[]{this, rpcResponse});
                    return;
                }
                if (rpcResponse != null) {
                    i2 = rpcResponse.code;
                    str2 = rpcResponse.message;
                } else {
                    i2 = 1100;
                    str2 = "";
                }
                BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, i2, str2, "");
            }

            public static /* synthetic */ Object ipc$super(AnonymousClass15 r2, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/login4android/login/LoginController$15");
            }

            @Override // android.os.AsyncTask
            public String doInBackground(Object[] objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("db0124f4", new Object[]{this, objArr}) : Login.getDeviceTokenKey(Login.getUserId());
            }

            public void onPostExecute(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fe870167", new Object[]{this, str2});
                    return;
                }
                verifyParam.deviceTokenKey = str2;
                VerifyServiceImpl.getInstance().getIdentityVerificationUrl(verifyParam, new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.15.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.ali.user.mobile.callback.RpcRequestCallback
                    public void onError(RpcResponse rpcResponse) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                        } else {
                            AnonymousClass15.access$500(AnonymousClass15.this, rpcResponse);
                        }
                    }

                    @Override // com.ali.user.mobile.callback.RpcRequestCallback
                    public void onSuccess(RpcResponse rpcResponse) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                            return;
                        }
                        GetVerifyUrlResponse getVerifyUrlResponse = (GetVerifyUrlResponse) rpcResponse;
                        T t = getVerifyUrlResponse.returnValue;
                        if (t != 0) {
                            String str3 = ((GetVerifyUrlReturnData) t).token;
                            if (!TextUtils.isEmpty(str3)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("token", str3);
                                hashMap.put("scene", str);
                                BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_SUCCESS, false, 0, "", (Map<String, String>) hashMap, "");
                                return;
                            }
                            String str4 = ((GetVerifyUrlReturnData) getVerifyUrlResponse.returnValue).url;
                            UrlParam urlParam = new UrlParam();
                            AnonymousClass15 r2 = AnonymousClass15.this;
                            urlParam.ivScene = str;
                            urlParam.url = str4;
                            Bundle bundle2 = bundle;
                            if (bundle2 != null) {
                                urlParam.showSkipButton = bundle2.getBoolean(LoginConstant.ICBU_IV_SKIP, false);
                            }
                            AnonymousClass15 r10 = AnonymousClass15.this;
                            LoginController.this.openUrl(context, urlParam);
                        }
                    }
                });
            }
        }, new Object[0]);
    }

    public void navToIVWithUserId(final Context context, final String str, final int i, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af1a379", new Object[]{this, context, str, new Integer(i), str2});
        } else if (TextUtils.isEmpty(str)) {
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, -3, LoginConstant.FETCH_IV_FAIL_INVALID_SCENE, "");
        } else if (TextUtils.isEmpty(str2)) {
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, -2, LoginConstant.FETCH_IV_FAIL_INVALID_USERID, "");
        } else {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, GetVerifyUrlResponse>() { // from class: com.taobao.login4android.login.LoginController.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass17 r2, String str3, Object... objArr) {
                    str3.hashCode();
                    int hashCode = str3.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/taobao/login4android/login/LoginController$17");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                public GetVerifyUrlResponse doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (GetVerifyUrlResponse) ipChange2.ipc$dispatch("d9d8ec28", new Object[]{this, objArr});
                    }
                    VerifyParam verifyParam = new VerifyParam();
                    verifyParam.fromSite = i;
                    String str3 = str2;
                    verifyParam.userId = str3;
                    verifyParam.actionType = str;
                    verifyParam.deviceTokenKey = Login.getDeviceTokenKey(str3);
                    try {
                        return VerifyServiceImpl.getInstance().getNonLoginVerfiyUrl(verifyParam);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }

                public void onPostExecute(GetVerifyUrlResponse getVerifyUrlResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c4d1030f", new Object[]{this, getVerifyUrlResponse});
                    } else if (getVerifyUrlResponse == null) {
                        BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, -1, "RET_NULL", "");
                    } else {
                        int i2 = getVerifyUrlResponse.code;
                        if (i2 != 3000) {
                            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, i2, getVerifyUrlResponse.message, "");
                            return;
                        }
                        T t = getVerifyUrlResponse.returnValue;
                        if (t == 0) {
                            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_IV_FAIL, false, -4, LoginConstant.FETCH_IV_FAIL_INVALID_RETURNVALUE, "");
                        } else if (!TextUtils.isEmpty(((GetVerifyUrlReturnData) t).url)) {
                            UrlParam urlParam = new UrlParam();
                            urlParam.ivScene = str;
                            urlParam.url = ((GetVerifyUrlReturnData) getVerifyUrlResponse.returnValue).url;
                            urlParam.userid = str2;
                            LoginController.this.openUrl(context, urlParam);
                        }
                    }
                }
            }, new Object[0]);
        }
    }

    public void navToWebViewByScene(final Context context, final String str, int i, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3872ad3", new Object[]{this, context, str, new Integer(i), map});
            return;
        }
        AccountCenterParam accountCenterParam = new AccountCenterParam();
        accountCenterParam.scene = str;
        accountCenterParam.fromSite = i;
        UrlFetchServiceImpl.getInstance().navBySceneRemote(accountCenterParam, new RpcRequestCallback() { // from class: com.taobao.login4android.login.LoginController.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onError(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b349f7d", new Object[]{this, rpcResponse});
                    return;
                }
                AppMonitorAdapter.commitFail("Page_Member_Account", "Account_" + str + "_URL", "0", "");
            }

            @Override // com.ali.user.mobile.callback.RpcRequestCallback
            public void onSuccess(RpcResponse rpcResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2811f422", new Object[]{this, rpcResponse});
                } else if (!(rpcResponse instanceof MtopAccountCenterUrlResponseData)) {
                    AppMonitorAdapter.commitFail("Page_Member_Account", "Account_" + str + "_URL", "0", "");
                } else {
                    Context context2 = context;
                    if (context2 == null) {
                        context2 = DataProviderFactory.getApplicationContext();
                    }
                    MtopAccountCenterUrlResponseData mtopAccountCenterUrlResponseData = (MtopAccountCenterUrlResponseData) rpcResponse;
                    if (!TextUtils.isEmpty(mtopAccountCenterUrlResponseData.h5Url)) {
                        AppMonitorAdapter.commitSuccess("Page_Member_Account", "Account_" + str + "_URL");
                        UrlParam urlParam = new UrlParam();
                        urlParam.scene = str;
                        urlParam.url = mtopAccountCenterUrlResponseData.h5Url;
                        urlParam.site = DataProviderFactory.getDataProvider().getSite();
                        urlParam.ext = map;
                        ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openWebViewPage(context2, urlParam);
                        return;
                    }
                    AppMonitorAdapter.commitFail("Page_Member_Account", "Account_" + str + "_URL", "0", String.valueOf(mtopAccountCenterUrlResponseData.code));
                    ToastUtil.showToast(context2, mtopAccountCenterUrlResponseData.errorMessage, 0);
                }
            }
        });
    }

    public boolean processAutoLoginResponse(RpcResponse<LoginReturnData> rpcResponse, boolean z, boolean z2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6de5b2fe", new Object[]{this, rpcResponse, new Boolean(z), new Boolean(z2), bundle})).booleanValue();
        }
        if (rpcResponse == null || !"SUCCESS".equals(rpcResponse.actionType)) {
            processNetworkError(rpcResponse, z, z2, bundle);
            return false;
        }
        try {
            LoginReturnData loginReturnData = rpcResponse.returnValue;
            HashMap hashMap = new HashMap();
            hashMap.put(LoginConstants.LOGIN_TYPE, LoginType.ServerLoginType.AutoLogin.getType());
            LoginDataHelper.processLoginReturnData(z2, loginReturnData, hashMap);
            Map<String, String> map = loginReturnData.extMap;
            if (map != null && "true".equals(map.get("autoLoginRateLimit")) && System.currentTimeMillis() > this.autoLoginLimitExpireTime) {
                this.autoLoginRateLimit = true;
                this.autoLoginLimitExpireTime = System.currentTimeMillis() + (Long.parseLong(loginReturnData.extMap.get("autoLoginLimitPeriod")) * 1000);
                this.autoLoginLeftToLimitCount = Integer.parseInt(loginReturnData.extMap.get("autoLoginLimitCount"));
            }
            return true;
        } catch (Exception unused) {
            if (z) {
                userLogin(z, z2, bundle);
            } else if (z2) {
                BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, 726, "process response exception", this.browserRefUrl);
            }
            return false;
        }
    }

    public void userLogin(boolean z, boolean z2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7236b8f", new Object[]{this, new Boolean(z), new Boolean(z2), bundle});
        } else if (z) {
            openPage(z2, bundle);
        } else if (LoginStatus.concurrentShowUI && LoginSwitch.getSwitch("checkConcurrent", "true")) {
            LoginTLogAdapter.e(TAG, "hit concurrentShowUI");
            openPage(z2, bundle);
        } else if (z2) {
            BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGIN_FAILED, false, IMediaPlayer.MEDIA_INFO_VIDEO_SWITCH_DONE, "showUI=false", this.browserRefUrl);
        }
    }

    public void httpsCookieCheck() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13758720", new Object[]{this});
            return;
        }
        try {
            SessionManager instance = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
            if (LoginSwitch.getSwitch("checkHttpsCookie", "true") && instance.checkSessionValid()) {
                CookieManager instance2 = CookieManager.getInstance();
                instance2.setAcceptCookie(true);
                String cookie = instance2.getCookie("https://.taobao.com");
                LoginTLogAdapter.e(TAG, "https.Cookie=" + cookie);
                Log.e(TAG, "https.Cookie=" + cookie);
                if (!TextUtils.isEmpty(cookie)) {
                    String[] split = cookie.split(";");
                    int length = split.length;
                    String str = "";
                    String str2 = str;
                    for (int i = 0; i < length; i++) {
                        String str3 = split[i];
                        if (!TextUtils.isEmpty(str3)) {
                            split = split;
                            length = length;
                            if (str3.trim().startsWith("unb")) {
                                str = str3.split("=")[1];
                            }
                        } else {
                            split = split;
                            length = length;
                        }
                        if (!TextUtils.isEmpty(str3) && str3.trim().startsWith("munb")) {
                            str2 = str3.split("=")[1];
                        }
                    }
                    LoginTLogAdapter.e(TAG, "https.unb=" + str);
                    Log.e(TAG, "https.unb=" + str);
                    LoginTLogAdapter.e(TAG, "https.munb=" + str2);
                    Log.e(TAG, "https.munb=" + str2);
                    if (!TextUtils.equals(instance.getUserId(), str) && (!TextUtils.isEmpty(str) || !TextUtils.equals(instance.getUserId(), str2))) {
                        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                            if (!CommonUtil.isInABTestRegion("recoverFirst", 10000)) {
                                instance.setSessionExpiredTime(1L);
                                UserTrackAdapter.sendUT("https_SessionNotEqual_directFailed");
                            } else if (!instance.recoverCookie()) {
                                instance.setSessionExpiredTime(1L);
                                UserTrackAdapter.sendUT("https_SessionNotEqual_recoverFailed");
                            } else {
                                UserTrackAdapter.sendUT("https_SessionNotEqual_recoverSucceed");
                            }
                            LoginTLogAdapter.e(TAG, "HttpsCookieSessionNotEqual:  cookie:" + cookie);
                            Log.e(TAG, "HttpsCookieSessionNotEqual:  cookie:" + cookie);
                            UserTrackAdapter.sendUT("https_SessionNotEqual");
                            instance.clearSessionOnlyCookie();
                            String cookie2 = instance2.getCookie("https://.taobao.com");
                            LoginTLogAdapter.e(TAG, "HttpsSessionNotEqual, afterClear, cookieStr= " + cookie2);
                            Log.e(TAG, "HttpsSessionNotEqual, afterClear, cookieStr= " + cookie2);
                        } else {
                            if (!instance.recoverCookie()) {
                                instance.setSessionExpiredTime(1L);
                                UserTrackAdapter.sendUT("https_unbIsNull_recoverFailed");
                            }
                            UserTrackAdapter.sendUT("https_unbIsNull");
                        }
                    }
                    z = true;
                }
                LoginTLogAdapter.e(TAG, "https.check isSessionValid = " + z);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            LoginTLogAdapter.e(TAG, "CheckHttpsCookieException");
        }
    }

    public void initAliuserSDK(DataProvider dataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70939a60", new Object[]{this, dataProvider});
        } else if (this.isAliuserSDKInited.compareAndSet(false, true) || DataProviderFactory.getApplicationContext() == null) {
            LoginTLogAdapter.e(TAG, "start init AliuserSDK | isAliuserSDKInited:" + this.isAliuserSDKInited.get());
            LoginTLogAdapter.trace("init.login-tag", "initAliuserSDK: init start");
            registerAliuserActionReceiver();
            if (!LoginSwitch.getSwitch("initNeedLoginCacheAsync", "true")) {
                NeedLoginPresenter.initCacheIfNotExist();
            }
            AliUserInit.init(dataProvider, new DataCallback<String>() { // from class: com.taobao.login4android.login.LoginController.18
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void result(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dec15eee", new Object[]{this, str});
                        return;
                    }
                    if (LoginSwitch.getSwitch("HarmonyLoginBackupDeleteAll", "false")) {
                        HarmonyLoginBackupImpl.deleteAllFileSync(DataProviderFactory.getApplicationContext());
                    }
                    LoginTLogAdapter.trace("init.login-tag", "initAliuserSDK: init end");
                    OrangeConfig.getInstance().registerListener(new String[]{LoginSwitch.CONFIG_GROUP_LOGIN}, new obk() { // from class: com.taobao.login4android.login.LoginController.18.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.obk
                        public void onConfigUpdate(String str2, Map<String, String> map) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("4f2fc4ea", new Object[]{this, str2, map});
                                return;
                            }
                            OrangeConfig.getInstance().unregisterListener(new String[]{LoginSwitch.CONFIG_GROUP_LOGIN}, this);
                            try {
                                LoginController.access$600(LoginController.this);
                                ReloginDelegate.handle();
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                    }, true);
                }
            });
            MainThreadExecutor.execute(new Runnable() { // from class: com.taobao.login4android.login.LoginController.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LoginController.access$700(LoginController.this);
                    }
                }
            });
        }
    }

    public void doAutoLoginWithCallback(final AutoLoginParam autoLoginParam, final AutoLoginCallback autoLoginCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d0972", new Object[]{this, autoLoginParam, autoLoginCallback});
        } else if (autoLoginCallback != null) {
            if (!autoLoginParam.restoreSession) {
                LoginStatus.compareAndSetLogining(false, true);
            }
            CoordinatorWrapper.executeSafely(new AsyncTask<Object, Void, RpcResponse<LoginReturnData>>() { // from class: com.taobao.login4android.login.LoginController.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/login/LoginController$5");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                public RpcResponse<LoginReturnData> doInBackground(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (RpcResponse) ipChange2.ipc$dispatch("85055509", new Object[]{this, objArr});
                    }
                    try {
                        return new AutoLoginBusiness().autoLogin(autoLoginParam);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }

                public void onPostExecute(RpcResponse<LoginReturnData> rpcResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e0e04a30", new Object[]{this, rpcResponse});
                    } else if (rpcResponse == null) {
                        autoLoginCallback.onBizFail(-2, "Null Response");
                        LoginStatus.resetLoginFlag(!autoLoginParam.isFromChangeAccount);
                    } else if (RpcException.isSystemError(rpcResponse.code)) {
                        autoLoginCallback.onNetworkError();
                        LoginStatus.resetLoginFlag(!autoLoginParam.isFromChangeAccount);
                    } else if (!"SUCCESS".equals(rpcResponse.actionType)) {
                        LoginStatus.resetLoginFlag(true ^ autoLoginParam.isFromChangeAccount);
                        autoLoginCallback.onBizFail(rpcResponse.code, rpcResponse.message);
                    } else if (!autoLoginParam.restoreSession || !LoginStatus.isLogining()) {
                        LoginController.this.processAutoLoginResponse(rpcResponse, false, autoLoginParam.needBroadcast, null);
                        autoLoginCallback.onSuccess();
                    } else {
                        LoginContext.uninstallResponse = rpcResponse;
                        LoginContext.uninstallType = 1;
                        autoLoginCallback.onBizFail(-339393, "call_autologin_but_user_is_logining");
                    }
                }
            }, new Object[0]);
        }
    }

    public void autoLogin(boolean z, final Bundle bundle) {
        int i;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0c7d81", new Object[]{this, new Boolean(z), bundle});
            return;
        }
        StringBuilder sb = new StringBuilder("autoLogin() called with: showUI = [");
        sb.append(z);
        sb.append("], data = [");
        sb.append(bundle);
        sb.append("]");
        if (Login.session == null) {
            Login.session = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
        }
        String userId = Login.getUserId();
        String loginToken = Login.getLoginToken();
        int defaultLoginSite = SiteUtil.getDefaultLoginSite();
        if (bundle != null) {
            boolean z2 = bundle.getBoolean(LoginConstant.FORCE_OPEN_LOGIN, false);
            String string = bundle.getString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, "");
            String string2 = bundle.getString(LoginConstant.LOGIN_BUNDLE_UNIFY_SSO_TOKEN, "");
            boolean z3 = bundle.getBoolean(LoginConstant.CHANGE_ACCOUNT_FLAG);
            String string3 = bundle.getString(LoginConstant.OUTTER_LOGIN_TOKEN, "");
            String string4 = bundle.getString(LoginConstant.OUTTER_LOGIN_TOKEN_TYPE, "");
            final String string5 = bundle.getString(LoginConstant.UMID_TOKEN, "");
            String string6 = bundle.getString("login_type", "");
            Context applicationContext = DataProviderFactory.getApplicationContext();
            if ("umidIv".equals(string6) && !TextUtils.isEmpty(string5)) {
                LoginTLogAdapter.e(TAG, "umidTokenLogin start");
                if (LoginSwitch.getSwitch("loginBarAgreement", "false")) {
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToAgreement(applicationContext, new LoginFilterCallback() { // from class: com.taobao.login4android.login.LoginController.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onFail(int i2, Map<String, String> map) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i2), map});
                                return;
                            }
                            LoginTLogAdapter.e(LoginController.TAG, "umidTokenLogin failed,agreement disagree");
                            LoginStatus.resetLoginFlag();
                        }

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onSuccess() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            } else {
                                LoginController.access$000(LoginController.this, string5, bundle);
                            }
                        }
                    });
                    return;
                } else {
                    umidTokenLogin(string5, bundle);
                    return;
                }
            } else if ("sim".equals(string6)) {
                LoginTLogAdapter.e(TAG, "simLogin start");
                if (LoginSwitch.getSwitch("loginBarAgreement", "false")) {
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToAgreement(applicationContext, new LoginFilterCallback() { // from class: com.taobao.login4android.login.LoginController.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onFail(int i2, Map<String, String> map) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i2), map});
                                return;
                            }
                            LoginStatus.resetLoginFlag();
                            LoginTLogAdapter.e(LoginController.TAG, "simLogin failed,agreement disagree");
                        }

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onSuccess() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            } else {
                                LoginController.access$100(LoginController.this, bundle);
                            }
                        }
                    });
                    return;
                } else {
                    simLogin(bundle);
                    return;
                }
            } else if ("sim_verify".equals(string6)) {
                LoginTLogAdapter.e(TAG, "simVerify start");
                if (LoginSwitch.getSwitch("loginBarAgreement", "false")) {
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToAgreement(applicationContext, new LoginFilterCallback() { // from class: com.taobao.login4android.login.LoginController.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onFail(int i2, Map<String, String> map) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i2), map});
                                return;
                            }
                            LoginStatus.resetLoginFlag();
                            LoginTLogAdapter.e(LoginController.TAG, "simVerifyLogin failed,agreement disagree");
                        }

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onSuccess() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            } else {
                                LoginController.access$200(LoginController.this, bundle);
                            }
                        }
                    });
                    return;
                } else {
                    simVerifyLogin(bundle);
                    return;
                }
            } else if (LoginType.LocalLoginType.AUTO_LOGIN.equals(string6)) {
                LoginTLogAdapter.e(TAG, "autologin from login bar start");
                if (LoginSwitch.getSwitch("loginBarAgreement", "false")) {
                    ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).navToAgreement(applicationContext, new LoginFilterCallback() { // from class: com.taobao.login4android.login.LoginController.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onFail(int i2, Map<String, String> map) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d66999c6", new Object[]{this, new Integer(i2), map});
                                return;
                            }
                            LoginStatus.resetLoginFlag();
                            LoginTLogAdapter.e(LoginController.TAG, "targetLogin failed,agreement disagree");
                        }

                        @Override // com.ali.user.mobile.filter.LoginFilterCallback
                        public void onSuccess() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                            } else {
                                LoginController.access$300(LoginController.this, bundle);
                            }
                        }
                    });
                    return;
                } else {
                    targetLogin(bundle);
                    return;
                }
            } else if (!TextUtils.isEmpty(string2)) {
                LoginTLogAdapter.e(TAG, "autoLogin tokenLogin");
                UnifySsoLogin.tokenLogin(bundle.getInt(LoginConstant.ALIUSER_LOGIN_SITE, 0), string2, bundle.getBoolean("isSilent"), Login.session);
                return;
            } else if (TextUtils.isEmpty(string) || !DataProviderFactory.getDataProvider().enableAlipaySSO()) {
                if (z3) {
                    str2 = bundle.getString(LoginConstant.CHANGE_ACCOUNT_USER_ID, "");
                    str = bundle.getString(LoginConstant.CHANGE_ACCOUNT_AUTOLOGIN_TOKEN, "");
                    i = bundle.getInt(LoginConstant.ALIUSER_LOGIN_SITE, 0);
                    LoginStatus.compareAndSetFromChangeAccount(false, true);
                    ApiReferer.Refer refer = new ApiReferer.Refer();
                    refer.eventName = "changeAccount";
                    refer.userId = str2;
                    refer.site = String.valueOf(i);
                    Login.session.appendEventTrace(JSON.toJSONString(refer));
                } else if (!TextUtils.isEmpty(string3)) {
                    old2NewAutoLogin(string3, string4, DataProviderFactory.getDataProvider().getSite(), z, bundle);
                    return;
                } else if (z2) {
                    LoginTLogAdapter.e(TAG, "forceOpenLoginView,don't do autologin");
                    userLogin(z, true, bundle);
                    return;
                } else {
                    str2 = userId;
                    str = loginToken;
                    i = defaultLoginSite;
                }
                this.browserRefUrl = bundle.getString(LoginConstants.BROWSER_REF_URL);
                LoginTLogAdapter.e(TAG, "autologin with bundle. browserRefUrl = " + this.browserRefUrl);
                String string7 = bundle.getString(LoginConstants.MTOP_API_REFERENCE);
                apiReferUT(string7);
                if (!TextUtils.isEmpty(string7)) {
                    try {
                        Login.session.appendEventTrace(string7);
                    } catch (Throwable unused) {
                        ApiReferer.Refer refer2 = new ApiReferer.Refer();
                        refer2.eventName = string7;
                        Login.session.appendEventTrace(JSON.toJSONString(refer2));
                    }
                }
                UserTrackAdapter.sendExtendUT(LoginConstants.MTOP_API_REFERENCE, string7);
                if (!TextUtils.isEmpty(this.browserRefUrl)) {
                    ApiReferer.Refer refer3 = new ApiReferer.Refer();
                    refer3.eventName = this.browserRefUrl;
                    Login.session.appendEventTrace(JSON.toJSONString(refer3));
                }
            } else {
                alipaySsoLogin(bundle);
                LoginTLogAdapter.e(TAG, "autoLogin alipaySsoLogin");
                return;
            }
        } else {
            str2 = userId;
            str = loginToken;
            i = defaultLoginSite;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            ApiReferer.Refer refer4 = new ApiReferer.Refer();
            refer4.eventName = "autoLoginToken=null|trySdkLogin";
            Login.session.appendEventTrace(JSON.toJSONString(refer4));
            try {
                Properties properties = new Properties();
                properties.put("action", "autologin token null trySdkLogin");
                properties.put("logintoken", TextUtils.isEmpty(str) + "");
                properties.put("userid", TextUtils.isEmpty(str2) + "");
                UserTrackAdapter.sendUT("NullAutoLoginToken", properties);
            } catch (Exception unused2) {
            }
            if (TextUtils.isEmpty(str) || !LoginSwitch.getSwitch("autologin_only", "false")) {
                LoginTLogAdapter.e(TAG, "autoLogin userLogin");
                userLogin(z, true, bundle);
                return;
            }
            LoginTLogAdapter.e(TAG, "autoLogin autoLoginTargetAccount 1");
            autoLoginTargetAccount(str2, str, i, z, bundle);
            return;
        }
        LoginTLogAdapter.e(TAG, "autoLogin autoLoginTargetAccount 2");
        autoLoginTargetAccount(str2, str, i, z, bundle);
    }

    public synchronized void logout(final LogoutParam logoutParam, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b5dd49", new Object[]{this, logoutParam, commonCallback});
        } else if (logoutParam != null) {
            this.isNotifyLogout = false;
            Login.session.clearAutoLoginInfo();
            if (!CommonUtil.isInABTestRegion(LoginSwitch.LOGOUT_REFACTOR, 10000) || !logoutParam.pre) {
                doSimpleLogoutRpc(logoutParam, commonCallback);
            } else {
                SecurityGuardManagerWraper.getSessionList(new DataCallback<SessionList>() { // from class: com.taobao.login4android.login.LoginController.13
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void result(SessionList sessionList) {
                        List<SessionModel> list;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d5f6c387", new Object[]{this, sessionList});
                        } else if (CommonUtil.isInABTestRegion("ignoreSessionCnt", 10000)) {
                            if (!(sessionList == null || (list = sessionList.sessionModels) == null)) {
                                logoutParam.loggedUserNum = list.size();
                            }
                            UserTrackAdapter.sendUT("LogoutTong2");
                            BeforeLogoutBiz.callBeforeLogout(logoutParam, new CommonCallback() { // from class: com.taobao.login4android.login.LoginController.13.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.ali.user.mobile.model.CommonCallback
                                public void onFail(int i, String str) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i), str});
                                        return;
                                    }
                                    AnonymousClass13 r4 = AnonymousClass13.this;
                                    LoginController.this.doSimpleLogoutRpc(logoutParam, commonCallback);
                                }

                                @Override // com.ali.user.mobile.model.CommonCallback
                                public void onSuccess() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("d0e393ab", new Object[]{this});
                                        return;
                                    }
                                    AnonymousClass13 r0 = AnonymousClass13.this;
                                    LoginController.this.doSimpleLogoutRpc(logoutParam, commonCallback);
                                }
                            });
                        } else {
                            LoginController.this.doSimpleLogoutRpc(logoutParam, commonCallback);
                        }
                    }
                });
            }
        }
    }
}
