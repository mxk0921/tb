package com.taobao.login4android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import com.ali.user.mobile.UserTraceImpl;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.dataprovider.DataProvider;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.init.AliUserInit;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.mobile.base.helper.LoginDataHelper;
import com.ali.user.mobile.callback.CommonDataCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.data.LoginComponent;
import com.ali.user.mobile.harmony.HarmonyLoginBackupImpl;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.AppLaunchDataPresenter;
import com.ali.user.mobile.login.presenter.NeedLoginPresenter;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.RegistParam;
import com.ali.user.mobile.model.UrlParam;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.LoginService;
import com.ali.user.mobile.service.NavigatorService;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.StorageService;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.HarmonyUtils;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.ali.user.mobile.utils.StringUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.broadcast.LoginBroadcastReceiver;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginEnvType;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.constants.LoginUrlConstants;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.login.CheckResultCallback;
import com.taobao.login4android.login.DefaultTaobaoAppProvider;
import com.taobao.login4android.login.InternalTokenCallback;
import com.taobao.login4android.login.LoginController;
import com.taobao.login4android.membercenter.bind.BindAlipay;
import com.taobao.login4android.session.ISession;
import com.taobao.login4android.session.InjectHandler;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.login4android.thread.LoginAsyncTask;
import com.taobao.login4android.thread.LoginThreadHelper;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.login4android.utils.ReflectionHelper;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;
import tb.f7l;
import tb.m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Login {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long COOKIES_REFRESH_INTERVAL = 1800000;
    private static final long COOKIES_REFRESH_SHRINK = 1680000;
    public static final String INIT_TAG = "init.login-tag";
    private static final String REFRESH_RESULT = "refreshResult";
    public static final String TAG = "login.Login";
    private static AsyncTask loginTask;
    private static volatile BroadcastReceiver mReceiver;
    public static ISession session;
    private static final Object lock = new Object();
    private static final Object mLock = new Object();

    public static /* synthetic */ void access$000(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddeb9a3d", new Object[]{new Boolean(z)});
        } else {
            notifyRefreshResult(z);
        }
    }

    public static void alipayAuth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abf4823", new Object[]{str});
        }
    }

    public static void applyToken(InternalTokenCallback internalTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eaad9e4", new Object[]{internalTokenCallback});
            return;
        }
        UserTrackAdapter.sendUT("LoginAPI_ApplyToken");
        LoginController.getInstance().applyToken(internalTokenCallback);
    }

    public static void applyTokenWithRemoteBiz(InternalTokenCallback internalTokenCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a44ed5", new Object[]{internalTokenCallback});
            return;
        }
        UserTrackAdapter.sendUT("LoginAPI_ApplyTokenRemoteBiz");
        LoginController.getInstance().applyTokenWithRemoteBiz(DataProviderFactory.getDataProvider().getSite(), getUserId(), internalTokenCallback);
    }

    public static void bindAlipay(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7383a802", new Object[]{str, str2});
            return;
        }
        try {
            IpChange ipChange2 = BindAlipay.$ipChange;
            ReflectionHelper.invokeMethod(BindAlipay.class, BindAlipay.class.getDeclaredMethod("bindAlipay", String.class, String.class), str, str2);
        } catch (Throwable unused) {
        }
    }

    public static boolean canAutoLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcacb095", new Object[0])).booleanValue();
        }
        return !TextUtils.isEmpty(getLoginToken());
    }

    public static void checkNickModifiable(CheckResultCallback checkResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a259443f", new Object[]{checkResultCallback});
        } else {
            LoginController.getInstance().checkNickModifiable(checkResultCallback);
        }
    }

    public static boolean checkSessionValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edaaf5b9", new Object[0])).booleanValue();
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.checkSessionValid();
        }
        return false;
    }

    public static String getAlipayLoginId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c860d475", new Object[0]);
        }
        ISession iSession = session;
        if (iSession == null) {
            return "";
        }
        try {
            JSONObject parseObject = JSON.parseObject(iSession.getExtJson());
            if (parseObject != null) {
                return StringUtil.dataMasking(parseObject.getString(SessionConstants.ALIPAY_LOGIN_ID));
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static boolean getCommentUsed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fbf9f11", new Object[0])).booleanValue();
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.isCommentTokenUsed();
        }
        return true;
    }

    public static String getDeviceTokenKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f59886dd", new Object[]{str});
        }
        return SecurityGuardManagerWraper.getDeviceTokenKey(str);
    }

    public static String getDisplayNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1aa7244a", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getDisplayNick();
        }
        return "";
    }

    public static String getEcode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42b43e5d", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getEcode();
        }
        return "";
    }

    public static String getEmail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c52188d3", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getEmail();
        }
        return "";
    }

    public static String getExtJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1db89666", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getExtJson();
        }
        return "";
    }

    public static long getHavanaSsoTokenExpiredTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("632590b6", new Object[0])).longValue();
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getHavanaSsoTokenExpiredTime();
        }
        return 0L;
    }

    public static String getHeadPicLink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ea1ca4b", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getHeadPicLink();
        }
        return "";
    }

    public static void getLoginMaskPhone(int i, String str, CommonDataCallback commonDataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9205ae", new Object[]{new Integer(i), str, commonDataCallback});
        } else if (commonDataCallback != null) {
            if (ServiceFactory.getService(NumberAuthService.class) != null) {
                ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getLoginMaskPhone(i, str, commonDataCallback);
            } else {
                commonDataCallback.onFail(-199, "sdk not init");
            }
        }
    }

    public static String getLoginPhone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b105ea5e", new Object[0]);
        }
        ISession iSession = session;
        if (iSession == null) {
            return "";
        }
        String loginPhone = iSession.getLoginPhone();
        if (TextUtils.isEmpty(loginPhone)) {
            return "";
        }
        return StringUtil.dataMasking(loginPhone);
    }

    public static int getLoginSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[0])).intValue();
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getLoginSite();
        }
        return 0;
    }

    public static String getLoginToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84ac42b3", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getLoginToken();
        }
        return "";
    }

    public static String getNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d48c0c0", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getNick();
        }
        return "";
    }

    public static String getOldEncryptedUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bebdeaa0", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getOldEncryptedUserId();
        }
        return "";
    }

    public static String getOldUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32ec82c2", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getOldUserId();
        }
        return "";
    }

    public static String getOneTimeToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("120aa9d", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getOneTimeToken();
        }
        return "";
    }

    public static String getSid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("169fb061", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getSid();
        }
        return "";
    }

    public static String getSnsNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34f04354", new Object[0]);
        }
        ISession iSession = session;
        if (iSession == null) {
            return "";
        }
        try {
            JSONObject parseObject = JSON.parseObject(iSession.getExtJson());
            if (parseObject != null) {
                return parseObject.getString(SessionConstants.TAOBAO_NICK_NAME);
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String getSubSid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f2fb415", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getSubSid();
        }
        return "";
    }

    public static String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getUserId();
        }
        return "";
    }

    @Deprecated
    public static String getUserName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d328f00d", new Object[0]);
        }
        ISession iSession = session;
        if (iSession != null) {
            return iSession.getUserName();
        }
        return "";
    }

    public static void goRegister(final RegistParam registParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0480e6", new Object[]{registParam});
        } else {
            CoordinatorWrapper.executeSafely(new LoginAsyncTask() { // from class: com.taobao.login4android.Login.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/Login$5");
                }

                @Override // com.taobao.login4android.thread.LoginAsyncTask
                public Object excuteTask(Object[] objArr) throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("d0eda63", new Object[]{this, objArr});
                    }
                    LoginController.getInstance().openRegisterPage(DataProviderFactory.getApplicationContext(), RegistParam.this);
                    return null;
                }
            }, new Object[0]);
        }
    }

    public static void init(Context context, String str, String str2, LoginEnvType loginEnvType, DataProvider dataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67246168", new Object[]{context, str, str2, loginEnvType, dataProvider});
        } else {
            init(context, str, str2, loginEnvType, dataProvider, loginEnvType != null && loginEnvType.getSdkEnvType() == 1);
        }
    }

    public static boolean isLoginUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cf81cf25", new Object[]{str})).booleanValue() : isLoginUrl(LoginUrlConstants.getLoginUrls(), str);
    }

    private static boolean isUrlValid(String str, String str2) {
        Pattern[] patternArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b54cae36", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("[;]");
            int length = split.length;
            patternArr = new Pattern[length];
            for (int i = 0; i < length; i++) {
                patternArr[i] = Pattern.compile(split[i]);
            }
        } else {
            patternArr = null;
        }
        if (patternArr != null) {
            for (Pattern pattern : patternArr) {
                if (pattern.matcher(str2).matches()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void login(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95000964", new Object[]{new Boolean(z)});
        } else {
            login(z, null);
        }
    }

    public static void logout(final Context context, int i, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f158cd2a", new Object[]{context, new Integer(i), str, str2, str3, new Boolean(z)});
            return;
        }
        UserTrackAdapter.sendUT("LoginAPI_Logout");
        LoginController.getInstance().logout(i, str, str2, str3, z, new CommonCallback() { // from class: com.taobao.login4android.Login.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i2, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i2), str4});
                } else {
                    onSuccess();
                }
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    return;
                }
                AliUserLogin.clearCacheData(LoginConstant.APP_LAUNCH_FILE_NAME);
                if (LoginSwitch.getSwitch("get_need_login_data", "true")) {
                    CoordinatorWrapper.executeSafely(new Runnable() { // from class: com.taobao.login4android.Login.6.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                AppLaunchDataPresenter.getAppLaunchData(context, true);
                            }
                        }
                    });
                }
                LoginTLogAdapter.e(Login.TAG, "logout finish");
                if (context == null) {
                    return;
                }
                if (!LoginStatus.compareAndSetLogining(false, true)) {
                    LoginTLogAdapter.e(Login.TAG, "logout: return because is logining right now. isLogining=true, userLogin=" + LoginStatus.isUserLogin() + ", lastLoginTime=" + LoginStatus.getLastLoginTime());
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("source", "Logout");
                LoginStatus.sdkSessionTraceID = ApiReferer.generateSdkSessionTraceId();
                LoginController.getInstance().openLoginPage(context, bundle);
            }
        });
    }

    public static void navByScene(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ddb1e99", new Object[]{context, str});
        } else {
            navByScene(context, str, DataProviderFactory.getDataProvider().getSite());
        }
    }

    public static void navToIVByScene(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c35fb821", new Object[]{context, str});
        } else {
            navToIVByScene(context, str, null);
        }
    }

    public static void navToIVWithUserId(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2711aade", new Object[]{context, str, str2});
        } else {
            LoginController.getInstance().navToIVWithUserId(context, str, str2);
        }
    }

    private static void notifyRefreshResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6331427e", new Object[]{new Boolean(z)});
            return;
        }
        try {
            Intent intent = new Intent(LoginAction.NOTIFY_REFRESH_COOKIES.name());
            intent.putExtra(REFRESH_RESULT, z);
            BroadCastHelper.doSendBroadcast(intent);
        } catch (NullPointerException unused) {
        }
    }

    public static void onekeyLogin(Context context, Map<String, String> map, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acb8e5", new Object[]{context, map, commonCallback});
        } else {
            ((LoginService) ServiceFactory.getService(LoginService.class)).onekeyLogin(context, map, commonCallback);
        }
    }

    public static void openScheme(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcbf643c", new Object[]{context, str});
            return;
        }
        UrlParam urlParam = new UrlParam();
        urlParam.url = str;
        LoginController.getInstance().openScheme(context, urlParam);
    }

    public static void openUrl(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ddb2746", new Object[]{context, str});
            return;
        }
        UrlParam urlParam = new UrlParam();
        urlParam.url = str;
        LoginController.getInstance().openUrl(context, urlParam);
    }

    private static void preFetchAliComInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20cf300f", new Object[0]);
        } else if (ServiceFactory.getService(NumberAuthService.class) != null && LoginSwitch.getSwitch("enable_auth_prefetch", "true")) {
            try {
                if (TextUtils.isEmpty(getLoginToken())) {
                    LoginTLogAdapter.e(TAG, "call authsdk prefetch");
                    ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).preFecth("init");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void pwdLogin(String str, String str2, CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d3b478", new Object[]{str, str2, commonCallback});
        } else if (commonCallback != null) {
            LoginParam loginParam = new LoginParam();
            loginParam.site = DataProviderFactory.getDataProvider().getSite();
            loginParam.loginId = str;
            loginParam.password = str2;
            if (ServiceFactory.getService(LoginService.class) != null) {
                ((LoginService) ServiceFactory.getService(LoginService.class)).pwdLogin(loginParam, commonCallback);
            } else {
                commonCallback.onFail(-1, "not initd");
            }
        }
    }

    public static void qrLogin(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9819e3", new Object[]{context, str});
        } else if (ServiceFactory.getService(NavigatorService.class) != null) {
            ((NavigatorService) ServiceFactory.getService(NavigatorService.class)).openScanActivity(context, str);
        }
    }

    public static void refreshCookies() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0535bb", new Object[0]);
            return;
        }
        UserTrackAdapter.sendUT("LoginAPI_RefreshCookies");
        if (!checkSessionValid()) {
            notifyRefreshResult(false);
            return;
        }
        synchronized (mLock) {
            try {
                if (System.currentTimeMillis() - LoginStatus.getLastRefreshCookieTime() > 1800000) {
                    LoginStatus.setLastRefreshCookieTime(System.currentTimeMillis());
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            CoordinatorWrapper.executeSafely(new LoginAsyncTask<Object, Void, Boolean>() { // from class: com.taobao.login4android.Login.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/Login$7");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.taobao.login4android.thread.LoginAsyncTask
                public Boolean excuteTask(Object... objArr) throws RemoteException {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("6f9b46c", new Object[]{this, objArr}) : Boolean.valueOf(LoginController.getInstance().refreshCookies(true, false));
                }

                public void onPostExecute(Boolean bool) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b98eb50", new Object[]{this, bool});
                    } else if (bool == null || !bool.booleanValue()) {
                        LoginStatus.setLastRefreshCookieTime(System.currentTimeMillis() - Login.COOKIES_REFRESH_SHRINK);
                        Login.access$000(false);
                    } else {
                        LoginStatus.setLastRefreshCookieTime(System.currentTimeMillis());
                        Login.access$000(true);
                    }
                }
            }, new Object[0]);
        } else {
            notifyRefreshResult(false);
        }
    }

    public static void setCommentUsed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c318a73", new Object[]{new Boolean(z)});
            return;
        }
        ISession iSession = session;
        if (iSession != null) {
            iSession.setCommentTokenUsed(z);
        }
    }

    public static void setHavanaSsoTokenExpiredTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a9ce4e", new Object[]{new Long(j)});
            return;
        }
        ISession iSession = session;
        if (iSession != null) {
            iSession.setHavanaSsoTokenExpiredTime(j);
        }
    }

    public static void setOneTimeToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3931d79", new Object[]{str});
            return;
        }
        ISession iSession = session;
        if (iSession != null) {
            iSession.setOneTimeToken(str);
        }
    }

    public static void touristLogin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da9ccea8", new Object[]{str});
        } else if (ServiceFactory.getService(LoginService.class) != null) {
            ((LoginService) ServiceFactory.getService(LoginService.class)).touristLogin(str, null);
        }
    }

    public static boolean isLoginUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c07d2af", new Object[]{str, str2})).booleanValue();
        }
        try {
            return isUrlValid(str, str2);
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, th.getMessage());
            return false;
        }
    }

    public static boolean isLogoutUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9df331d0", new Object[]{str})).booleanValue();
        }
        try {
            return isUrlValid(LoginUrlConstants.getLogoutUrls(), str);
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, th.getMessage());
            return false;
        }
    }

    public static boolean isQRLoginUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2eae706", new Object[]{str})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.contains("qrcodeCheck.htm");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void login(final boolean z, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e478f0", new Object[]{new Boolean(z), bundle});
            return;
        }
        if (bundle != null) {
            LoginTLogAdapter.e(TAG, "start login: extraData=" + bundle + ",apiReferer=" + bundle.getString(LoginConstants.MTOP_API_REFERENCE));
            LoginStatus.browserRefUrl = bundle.getString(LoginConstants.BROWSER_REF_URL);
            LoginStatus.mtopApiReferer = bundle.getString(LoginConstants.MTOP_API_REFERENCE);
        } else {
            LoginStatus.browserRefUrl = "";
            LoginStatus.mtopApiReferer = "";
        }
        LoginStatus.sdkSessionTraceID = ApiReferer.generateSdkSessionTraceId();
        LoginTLogAdapter.e(TAG, "start login: showUI:" + z);
        if (!LoginStatus.compareAndSetLogining(false, true)) {
            UserTrackAdapter.sendUT("login_api_login_exist");
            StringBuilder sb = new StringBuilder("login: return because is logining right now. isLogining=true, userLogin=");
            sb.append(LoginStatus.isUserLogin());
            sb.append(", lastLoginTime=");
            sb.append(LoginStatus.getLastLoginTime());
            sb.append(", extraData = ");
            sb.append(bundle == null ? "null" : bundle.toString());
            LoginTLogAdapter.e(TAG, sb.toString());
            long currentTimeMillis = System.currentTimeMillis() - LoginStatus.getLastLoginTime();
            Log.e(TAG, "t = " + currentTimeMillis);
            if (currentTimeMillis >= m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT) {
                LoginTLogAdapter.e(TAG, "reset login status after 3min");
                LoginStatus.resetLoginFlag();
            } else if (z && LoginStatus.isUserLogin()) {
                AsyncTask asyncTask = loginTask;
                if (!(asyncTask == null || asyncTask.isCancelled() || loginTask.getStatus() == AsyncTask.Status.FINISHED)) {
                    LoginTLogAdapter.e(TAG, "cancel last login task");
                    try {
                        loginTask.cancel(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                LoginAsyncTask loginAsyncTask = new LoginAsyncTask() { // from class: com.taobao.login4android.Login.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/Login$3");
                    }

                    @Override // com.taobao.login4android.thread.LoginAsyncTask
                    public Object excuteTask(Object[] objArr) throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("d0eda63", new Object[]{this, objArr});
                        }
                        LoginTLogAdapter.e(LoginAsyncTask.TAG, "loginWithBundle finish");
                        if (!CommonUtil.isInABTestRegion("login_act_resume_not_pull", 10000) || !LoginStatus.isLoginActResume) {
                            UserTrackAdapter.sendExtendUT("OPEN_LOGIN_PAGE_WHEN_TIMEOUT", "close");
                            BroadCastHelper.sendLocalBroadCast(new Intent(LoginResActions.LOGIN_CLOSE_ACTION));
                            LoginController.getInstance().userLogin(z, true, bundle);
                            return null;
                        }
                        UserTrackAdapter.sendExtendUT("OPEN_LOGIN_PAGE_WHEN_TIMEOUT", "resume");
                        return null;
                    }
                };
                loginTask = loginAsyncTask;
                CoordinatorWrapper.executeSafely(loginAsyncTask, new Object[0]);
                return;
            } else {
                return;
            }
        }
        LoginAsyncTask<Object, Void, Void> loginAsyncTask2 = new LoginAsyncTask<Object, Void, Void>() { // from class: com.taobao.login4android.Login.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/Login$4");
            }

            @Override // com.taobao.login4android.thread.LoginAsyncTask
            public Void excuteTask(Object... objArr) throws RemoteException {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("b3b3ac6e", new Object[]{this, objArr});
                }
                LoginTLogAdapter.e(LoginAsyncTask.TAG, "login progress: excuteTask");
                LoginController.getInstance().autoLogin(z, bundle);
                return null;
            }
        };
        loginTask = loginAsyncTask2;
        CoordinatorWrapper.executeSafely(loginAsyncTask2, new Object[0]);
    }

    public static void navByScene(Context context, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14497cc", new Object[]{context, str, map});
        } else {
            LoginController.getInstance().navToWebViewByScene(context, str, DataProviderFactory.getDataProvider().getSite(), map);
        }
    }

    public static void navToIVByScene(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8554f13", new Object[]{context, str, bundle});
        } else {
            navToIVByScene(context, str, DataProviderFactory.getDataProvider().getSite(), bundle);
        }
    }

    private static synchronized void init(final Context context, String str, String str2, LoginEnvType loginEnvType, final DataProvider dataProvider, boolean z) {
        synchronized (Login.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d687e6c", new Object[]{context, str, str2, loginEnvType, dataProvider, new Boolean(z)});
            } else if (DataProviderFactory.getDataProvider() == null || !(DataProviderFactory.getDataProvider() instanceof DefaultTaobaoAppProvider) || DataProviderFactory.getApplicationContext() == null) {
                Debuggable.init(context);
                UserTrackAdapter.sendUT("sdk_init_commit", LoginComponent.getProperties());
                session = SessionManager.getInstance(context);
                LoginTLogAdapter.e(TAG, " start Login init.");
                dataProvider.setContext(context);
                dataProvider.setTTID(str);
                dataProvider.setEnvType(loginEnvType.getSdkEnvType());
                if (HarmonyUtils.isSupportInitHarmony()) {
                    dataProvider.setHarmonyLoginBackup(new HarmonyLoginBackupImpl(context));
                }
                DataProviderFactory.setDataProvider(dataProvider);
                session.setSDKHandler(new InjectHandler() { // from class: com.taobao.login4android.Login.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.login4android.session.InjectHandler
                    public void addExtra(Map<String, String> map, boolean z2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9189f8e5", new Object[]{this, map, new Boolean(z2)});
                        } else {
                            UserTraceImpl.addExtra(map, z2, true);
                        }
                    }
                });
                session.trackLoginValid("loginValid", "login");
                LoginTLogAdapter.e(TAG, " start Login init.app version = " + AppInfo.getInstance().getAppVersion());
                if (ServiceFactory.getService(StorageService.class) != null) {
                    ((StorageService) ServiceFactory.getService(StorageService.class)).init(context.getApplicationContext());
                }
                final boolean equals = "true".equals((String) SharedPreferencesUtil.getData(context, LoginConstant.XDEVICE, ""));
                session.setWriteUT(!equals);
                preFetchAliComInfo();
                AliUserInit.initSystemService();
                LoginController.getInstance().initAliuserSDK(dataProvider);
                CoordinatorWrapper.executeSafely(new Runnable() { // from class: com.taobao.login4android.Login.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        String str3;
                        String str4;
                        String str5;
                        String[] split;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            if (LoginSwitch.getSwitch("initNeedLoginCacheAsync", "true")) {
                                NeedLoginPresenter.initCacheIfNotExist();
                            }
                            LoginContext.times.put("login_init_step_0_start", System.currentTimeMillis() + "");
                            LoginController.getInstance().httpsCookieCheck();
                            ISession iSession = Login.session;
                            if (iSession != null) {
                                LoginDataHelper.registerSessionInfo(iSession.getSid(), Login.session.getUserId(), Login.session.getSessionDisastergrd(), Login.session.checkSessionValid());
                                SessionManager instance = SessionManager.getInstance(context);
                                boolean z2 = !equals;
                                if (Login.session.getNick() == null) {
                                    str3 = "";
                                } else {
                                    str3 = Login.session.getNick();
                                }
                                if (Login.session.getUserId() == null) {
                                    str4 = "";
                                } else {
                                    str4 = Login.session.getUserId();
                                }
                                if (Login.session.getUidDigest() == null) {
                                    str5 = "";
                                } else {
                                    str5 = Login.session.getUidDigest();
                                }
                                instance.updateUserAccount(z2, str3, str4, str5, "", false);
                                UserTrackAdapter.sendUT("init_step_update_usertrack");
                                if (Login.session.checkSessionValid()) {
                                    if (DataProviderFactory.getDataProvider().isCheckCookieValid() && TextUtils.equals(LoginThreadHelper.getCurProcessName(context), context.getPackageName())) {
                                        SessionConstants.IS_CHECK_COOKIE_VALID = true;
                                        CookieManager instance2 = CookieManager.getInstance();
                                        instance2.setAcceptCookie(true);
                                        String cookie = instance2.getCookie(".taobao.com");
                                        if (TextUtils.isEmpty(cookie)) {
                                            if (!Login.session.recoverCookie()) {
                                                Login.session.setSessionExpiredTime(1L);
                                            }
                                            LoginTLogAdapter.e(Login.TAG, "CookieIsNull:  sid:" + Login.getSid());
                                            UserTrackAdapter.sendUT("CookieIsNull");
                                        } else {
                                            String str6 = "";
                                            String str7 = str6;
                                            for (String str8 : cookie.split(";")) {
                                                if (!TextUtils.isEmpty(str8) && str8.trim().startsWith("unb")) {
                                                    str6 = str8.split("=")[1];
                                                } else if (!TextUtils.isEmpty(str8) && str8.trim().startsWith("munb")) {
                                                    str7 = str8.split("=")[1];
                                                }
                                            }
                                            if (!TextUtils.equals(Login.session.getUserId(), str6) && (!TextUtils.isEmpty(str6) || !TextUtils.equals(Login.session.getUserId(), str7))) {
                                                if (!TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str7)) {
                                                    Login.session.setSessionExpiredTime(1L);
                                                    LoginTLogAdapter.e(Login.TAG, "SessionNotEqual:  cookie:" + cookie);
                                                    UserTrackAdapter.sendUT("SessionNotEqual");
                                                } else {
                                                    if (!Login.session.recoverCookie()) {
                                                        Login.session.setSessionExpiredTime(1L);
                                                    }
                                                    UserTrackAdapter.sendUT("unbIsNull");
                                                }
                                            }
                                        }
                                    }
                                    if (LoginSwitch.getSwitch(LoginSwitch.FORCE_SID_CHECK, "false")) {
                                        String encode = URLEncoder.encode(Login.getSid(), "utf-8");
                                        if (TextUtils.isEmpty(encode) || !encode.contains(f7l.MOD)) {
                                            ((RpcService) ServiceFactory.getService(RpcService.class)).registerSessionInfo(Login.session.getSid(), Login.session.getUserId(), Login.session.getSessionDisastergrd());
                                        } else {
                                            LoginTLogAdapter.e(Login.TAG, "sid encode is invalid: urlEncodeSid=" + encode + ",sid=" + Login.getSid());
                                        }
                                    } else {
                                        LoginDataHelper.registerSessionInfo(Login.session.getSid(), Login.session.getUserId(), Login.session.getSessionDisastergrd());
                                    }
                                    if (SecurityGuardManagerWraper.getSessionListFromFile() == null) {
                                        SecurityGuardManagerWraper.putSessionModelToFile(LoginDataHelper.sessionToModel(Login.session));
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(dataProvider.getAppkey())) {
                                LoginBroadcastHelper.sentInitFailBroadcast(DataProviderFactory.getApplicationContext());
                            }
                            LoginContext.times.put("login_init_step_0_end", System.currentTimeMillis() + "");
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
                if (mReceiver == null) {
                    synchronized (lock) {
                        if (mReceiver == null) {
                            mReceiver = new LoginBroadcastReceiver();
                            LoginBroadcastHelper.registerLoginReceiver(DataProviderFactory.getApplicationContext(), mReceiver);
                        }
                    }
                }
            } else {
                LoginTLogAdapter.e(TAG, "Login has inited, discard current request.");
            }
        }
    }

    public static void logout(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc40ebd7", new Object[]{context});
        } else {
            logout(context, getLoginSite(), getSid(), getLoginToken(), getUserId(), false);
        }
    }

    public static void navByScene(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d89278a", new Object[]{context, str, new Integer(i)});
            return;
        }
        Properties properties = new Properties();
        if (!TextUtils.isEmpty(str)) {
            properties.put("scene", str);
        }
        UserTrackAdapter.sendUT("LoginAPI_NavByScene", properties);
        LoginController.getInstance().navToWebViewByScene(context, str, i);
    }

    public static void navToIVByScene(Context context, String str, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f860f292", new Object[]{context, str, new Integer(i), bundle});
            return;
        }
        Properties properties = new Properties();
        if (!TextUtils.isEmpty(str)) {
            properties.put("scene", str);
        }
        UserTrackAdapter.sendUT("LoginAPI_navToIV", properties);
        LoginController.getInstance().navToIVByScene(context, str, i, bundle);
    }

    public static void logout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e233c511", new Object[0]);
        } else {
            logout(null);
        }
    }
}
