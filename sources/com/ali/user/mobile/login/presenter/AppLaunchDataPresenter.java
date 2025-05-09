package com.ali.user.mobile.login.presenter;

import android.content.Context;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.model.AppLaunchInfo;
import com.ali.user.mobile.login.model.AppLaunchInfoResponseData;
import com.ali.user.mobile.login.model.AppLaunchList;
import com.ali.user.mobile.login.model.AppLaunchRequest;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.model.LoginFlowRequest;
import com.ali.user.mobile.login.model.NeedLoginCheckData;
import com.ali.user.mobile.login.model.NeedLoginInfo;
import com.ali.user.mobile.login.service.impl.UserLoginServiceImpl;
import com.ali.user.mobile.model.DeviceTokenSignParam;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.rpc.ApiConstants;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.RpcRequest;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.security.AlibabaSecurityTokenService;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.NumberAuthService;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.NetworkUtil;
import com.ali.user.mobile.utils.ScreenUtil;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.OauthService;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.verifyidentity.utils.ProductDataHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.tao.shop.common.ShopConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.qp0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AppLaunchDataPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PRE_INFO_DATA = "preinfo";
    private static final String TAG = "AppLaunchDataPresenter";
    private static volatile long stopGetAppLaunchDataTime = Long.MIN_VALUE;

    static {
        t2o.a(69206133);
    }

    public static /* synthetic */ AppLaunchInfoResponseData access$000(Context context, String str, HistoryAccount historyAccount, AppLaunchInfoResponseData appLaunchInfoResponseData, NeedLoginCheckData needLoginCheckData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLaunchInfoResponseData) ipChange.ipc$dispatch("9ba316dd", new Object[]{context, str, historyAccount, appLaunchInfoResponseData, needLoginCheckData});
        }
        return getRemoteAppLaunchInfoResponseData(context, str, historyAccount, appLaunchInfoResponseData, needLoginCheckData);
    }

    private static boolean autoSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a02cce", new Object[0])).booleanValue();
        }
        return LoginSwitch.getSwitch("supportAutologin2", "true");
    }

    public static void buildLoginFlowRequest(LoginParam loginParam, LoginFlowRequest loginFlowRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbda200d", new Object[]{loginParam, loginFlowRequest});
            return;
        }
        Context applicationContext = DataProviderFactory.getApplicationContext();
        UserLoginServiceImpl.buildBaseRequest(loginParam, loginFlowRequest);
        loginFlowRequest.mobileNetworkOn = NetworkUtil.checkEnv(applicationContext);
        loginFlowRequest.loginId = loginParam.loginId;
        loginFlowRequest.t = System.currentTimeMillis();
    }

    private static String formatTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3095f787", new Object[]{new Long(j)});
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(j));
        } catch (Throwable th) {
            th.printStackTrace();
            return "formatTime error";
        }
    }

    public static AppLaunchInfoResponseData getAppLaunchData(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLaunchInfoResponseData) ipChange.ipc$dispatch("a4b188d3", new Object[]{context, new Boolean(z)});
        }
        return getAppLaunchInfoByFileName(context, SecurityGuardManagerWraper.getLastHistoryAccount(), z);
    }

    public static AppLaunchInfoResponseData getAppLaunchInfoByFileName(Context context, HistoryAccount historyAccount, boolean z) {
        String str;
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLaunchInfoResponseData) ipChange.ipc$dispatch("e6e460f1", new Object[]{context, historyAccount, new Boolean(z)});
        }
        if (historyAccount != null) {
            str = String.valueOf(historyAccount.userId);
        } else {
            str = "*";
        }
        AppLaunchInfoResponseData preLoginInfoIfValid = getPreLoginInfoIfValid(str);
        StringBuilder sb = new StringBuilder("first appLaunchLocalCache  is null?  ");
        if (preLoginInfoIfValid == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sb.append(z2);
        LoginTLogAdapter.e(TAG, sb.toString());
        NeedLoginCheckData needLoginInfoIfValid = NeedLoginPresenter.getNeedLoginInfoIfValid();
        StringBuilder sb2 = new StringBuilder("first needLoginCheckData  is null?  ");
        if (needLoginInfoIfValid != null) {
            z3 = false;
        }
        sb2.append(z3);
        LoginTLogAdapter.e(TAG, sb2.toString());
        if (preLoginInfoIfValid != null && needLoginInfoIfValid != null) {
            return preLoginInfoIfValid;
        }
        try {
            return checkCacheAndGetRemoteData(context, str, historyAccount, z);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getDeviceLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89e64461", new Object[0]);
        }
        try {
            int b = qp0.b();
            LoginTLogAdapter.e(TAG, "deviceLevel = " + b);
            if (b == 0) {
                return "high";
            }
            if (b == 1) {
                return "medium";
            }
            return "low";
        } catch (Throwable th) {
            th.printStackTrace();
            return "unknow";
        }
    }

    public static String getLastLoginType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5fb5ac2", new Object[0]);
        }
        String str = (String) SharedPreferencesUtil.getData(DataProviderFactory.getApplicationContext(), "login_type", "");
        if (LoginType.ServerLoginType.AlipaySSOLogin.getType().equals(str) || LoginType.LocalLoginType.LOGIN_TYPE_ALIPAY.equals(str)) {
            return "alipay";
        }
        if (LoginType.ServerLoginType.PasswordLogin.getType().equals(str)) {
            return "pwd";
        }
        if (LoginType.ServerLoginType.SMSLogin.getType().equals(str)) {
            return "sms";
        }
        if (LoginType.ServerLoginType.FaceLogin.getType().equals(str)) {
            return ProductDataHelper.VAL_PRODUCT_FACE;
        }
        return LoginType.ServerLoginType.SimLogin.getType().equals(str) ? "sim" : str;
    }

    private static LoginParam getLoginParam(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginParam) ipChange.ipc$dispatch("977a854c", new Object[]{context});
        }
        LoginParam loginParam = new LoginParam();
        loginParam.deviceLevel = getDeviceLevel();
        loginParam.alipayInstalled = iSupportAlipay(context);
        return loginParam;
    }

    private static synchronized long getStopGetAppLaunchDataTime() {
        synchronized (AppLaunchDataPresenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("724204c8", new Object[0])).longValue();
            }
            return stopGetAppLaunchDataTime;
        }
    }

    public static boolean iSupportAlipay(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("141c5615", new Object[]{context})).booleanValue();
        }
        OauthService oauthService = (OauthService) AliMemberSDK.getService(OauthService.class);
        if (oauthService == null || !oauthService.isAppAuthSurpport(context, "alipay")) {
            return false;
        }
        return true;
    }

    public static synchronized void resetStopGetAppLaunchDataTime() {
        synchronized (AppLaunchDataPresenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3246534d", new Object[0]);
            } else {
                stopGetAppLaunchDataTime = Long.MIN_VALUE;
            }
        }
    }

    private static synchronized void setStopGetAppLaunchDataTime(long j) {
        synchronized (AppLaunchDataPresenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38420ae4", new Object[]{new Long(j)});
            } else {
                stopGetAppLaunchDataTime = j;
            }
        }
    }

    public static AppLaunchInfoResponseData fireAppLaunchRequest(LoginParam loginParam, HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLaunchInfoResponseData) ipChange.ipc$dispatch("f247f411", new Object[]{loginParam, historyAccount});
        }
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.API_NAME = ApiConstants.ApiName.API_CALLED_BEFORE_LOGIN_PAGE;
        rpcRequest.VERSION = "1.0";
        rpcRequest.timeoutMilliSecond = 1000;
        AppLaunchRequest appLaunchRequest = new AppLaunchRequest();
        HashMap hashMap = new HashMap();
        appLaunchRequest.ext = hashMap;
        hashMap.put("lastLoginType", getLastLoginType());
        appLaunchRequest.ext.put("expandRecommendPage", "true");
        if (!TextUtils.isEmpty(loginParam.scene)) {
            appLaunchRequest.ext.put("scene", loginParam.scene);
        }
        List<String> list = loginParam.appendModules;
        if (list != null && !list.isEmpty()) {
            appLaunchRequest.ext.put("appendModules", JSON.toJSONString(loginParam.appendModules));
        }
        buildLoginFlowRequest(loginParam, appLaunchRequest);
        appLaunchRequest.deviceLevel = loginParam.deviceLevel;
        appLaunchRequest.token = loginParam.token;
        if (autoSwitch()) {
            appLaunchRequest.tokenType = loginParam.tokenType;
        }
        boolean isPad = ScreenUtil.isPad(DataProviderFactory.getApplicationContext());
        appLaunchRequest.pad = isPad;
        UserTrackAdapter.sendExtendUT("client_pad", String.valueOf(isPad));
        if (historyAccount != null) {
            appLaunchRequest.deviceTokenKey = historyAccount.tokenKey;
            appLaunchRequest.hid = String.valueOf(historyAccount.userId);
            DeviceTokenSignParam deviceTokenSignParam = new DeviceTokenSignParam();
            if (!TextUtils.isEmpty(DataProviderFactory.getDataProvider().getAppkey())) {
                deviceTokenSignParam.addAppKey(DataProviderFactory.getDataProvider().getAppkey());
            }
            deviceTokenSignParam.addAppVersion(AppInfo.getInstance().getAndroidAppVersion());
            deviceTokenSignParam.addHavanaId(String.valueOf(historyAccount.userId));
            deviceTokenSignParam.addTimestamp(String.valueOf(appLaunchRequest.t));
            deviceTokenSignParam.addSDKVersion(AppInfo.getInstance().getSdkVersion());
            if (!TextUtils.isEmpty(historyAccount.tokenKey)) {
                appLaunchRequest.deviceTokenSign = AlibabaSecurityTokenService.sign(historyAccount.tokenKey, deviceTokenSignParam.build());
            }
        } else {
            appLaunchRequest.firstLogin = true;
        }
        appLaunchRequest.alipayInstalled = loginParam.alipayInstalled;
        appLaunchRequest.onceLogined = !TextUtils.isEmpty(SessionManager.getInstance(DataProviderFactory.getDataProvider().getContext()).getOldUserId());
        if (ServiceFactory.getService(NumberAuthService.class) != null && LoginSwitch.getSwitch("getloginflow_take_maskmobile", "true")) {
            appLaunchRequest.maskMobile = ((NumberAuthService) ServiceFactory.getService(NumberAuthService.class)).getAuthInfoMap().get("number");
        }
        rpcRequest.addParam(ApiConstants.ApiField.LOGIN_INFO, JSON.toJSONString(appLaunchRequest));
        rpcRequest.addParam("riskControlInfo", JSON.toJSONString(UserLoginServiceImpl.getScanFaceWSecurityData()));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sdkTraceId", loginParam.sdkTraceId);
        rpcRequest.addParam("ext", JSON.toJSONString(hashMap2));
        return (AppLaunchInfoResponseData) ((RpcService) ServiceFactory.getService(RpcService.class)).post(rpcRequest, AppLaunchInfoResponseData.class);
    }

    public static AppLaunchInfoResponseData getPreLoginInfoIfValid(String str) {
        HashMap<String, AppLaunchInfoResponseData> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLaunchInfoResponseData) ipChange.ipc$dispatch("38fedd7e", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        String string = DataProviderFactory.getApplicationContext().getSharedPreferences(LoginConstant.APP_LAUNCH_FILE_NAME, 0).getString(PRE_INFO_DATA, "");
        if (!TextUtils.isEmpty(string)) {
            LoginTLogAdapter.e(TAG, "prelogininfo: key=" + str + ",list = " + string);
            try {
                AppLaunchList appLaunchList = (AppLaunchList) JSON.parseObject(string, AppLaunchList.class);
                if (!(appLaunchList == null || (hashMap = appLaunchList.launchData) == null || hashMap.size() <= 0)) {
                    for (String str2 : appLaunchList.launchData.keySet()) {
                        if (TextUtils.equals(str2, str)) {
                            LoginTLogAdapter.e(TAG, "prelogininfo: hit key " + str);
                            AppLaunchInfoResponseData appLaunchInfoResponseData = appLaunchList.launchData.get(str);
                            if (!(appLaunchInfoResponseData == null || appLaunchInfoResponseData.returnValue == 0)) {
                                String appVersion = AppInfo.getInstance().getAppVersion();
                                if (!TextUtils.equals(appVersion, appLaunchInfoResponseData.appVersion)) {
                                    LoginTLogAdapter.e(TAG, "prelogininfo:  expired!" + str + ",old appVersion= " + appLaunchInfoResponseData.appVersion + ", new AppVersion =" + appVersion);
                                    return null;
                                }
                                LoginTLogAdapter.e(TAG, "getPreLoginInfoIfValid expire time = " + formatTime(appLaunchInfoResponseData.calTime * 1000));
                                if (System.currentTimeMillis() / 1000 < appLaunchInfoResponseData.calTime) {
                                    LoginTLogAdapter.e(TAG, "prelogininfo: not expired!" + str + ",expiredTime= " + ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).expireTime + ", calTime=" + appLaunchInfoResponseData.calTime);
                                    return appLaunchInfoResponseData;
                                }
                                LoginTLogAdapter.e(TAG, "prelogininfo: expired! key= " + str + ",expiredTime = " + ((AppLaunchInfo) appLaunchInfoResponseData.returnValue).expireTime + ", calTime=" + appLaunchInfoResponseData.calTime);
                            }
                            return null;
                        }
                        LoginTLogAdapter.e(TAG, "prelogininfo: missed key " + str);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            LoginTLogAdapter.e(TAG, "prelogininfo: list is empty");
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void putPreLoginInfo(java.lang.String r5, com.ali.user.mobile.login.model.AppLaunchInfoResponseData r6) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.ali.user.mobile.login.presenter.AppLaunchDataPresenter.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = "fe4489b4"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r5 = 1
            r3[r5] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0016:
            if (r5 == 0) goto L_0x0087
            if (r6 != 0) goto L_0x001b
            goto L_0x0087
        L_0x001b:
            android.content.Context r1 = com.ali.user.mobile.app.dataprovider.DataProviderFactory.getApplicationContext()
            java.lang.String r2 = com.ali.user.mobile.login.model.LoginConstant.APP_LAUNCH_FILE_NAME
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r2, r0)
            java.lang.String r1 = "preinfo"
            java.lang.String r2 = ""
            java.lang.String r2 = r0.getString(r1, r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0041
            java.lang.Class<com.ali.user.mobile.login.model.AppLaunchList> r3 = com.ali.user.mobile.login.model.AppLaunchList.class
            java.lang.Object r2 = com.alibaba.fastjson.JSON.parseObject(r2, r3)     // Catch: all -> 0x003d
            com.ali.user.mobile.login.model.AppLaunchList r2 = (com.ali.user.mobile.login.model.AppLaunchList) r2     // Catch: all -> 0x003d
            goto L_0x0042
        L_0x003d:
            r2 = move-exception
            r2.printStackTrace()
        L_0x0041:
            r2 = 0
        L_0x0042:
            if (r2 != 0) goto L_0x0049
            com.ali.user.mobile.login.model.AppLaunchList r2 = new com.ali.user.mobile.login.model.AppLaunchList
            r2.<init>()
        L_0x0049:
            java.util.HashMap<java.lang.String, com.ali.user.mobile.login.model.AppLaunchInfoResponseData> r3 = r2.launchData
            if (r3 != 0) goto L_0x0054
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.launchData = r3
        L_0x0054:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "prelogininfo: put key =  "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r4 = ",responseData = "
            r3.append(r4)
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "AppLaunchDataPresenter"
            com.taobao.login4android.log.LoginTLogAdapter.e(r4, r3)
            java.util.HashMap<java.lang.String, com.ali.user.mobile.login.model.AppLaunchInfoResponseData> r3 = r2.launchData
            r3.put(r5, r6)
            android.content.SharedPreferences$Editor r5 = r0.edit()
            java.lang.String r6 = com.alibaba.fastjson.JSON.toJSONString(r2)
            r5.putString(r1, r6)
            r5.apply()
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.presenter.AppLaunchDataPresenter.putPreLoginInfo(java.lang.String, com.ali.user.mobile.login.model.AppLaunchInfoResponseData):void");
    }

    private static synchronized AppLaunchInfoResponseData checkCacheAndGetRemoteData(final Context context, final String str, final HistoryAccount historyAccount, boolean z) {
        boolean z2 = true;
        synchronized (AppLaunchDataPresenter.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AppLaunchInfoResponseData) ipChange.ipc$dispatch("67b9cfc6", new Object[]{context, str, historyAccount, new Boolean(z)});
            }
            final AppLaunchInfoResponseData preLoginInfoIfValid = getPreLoginInfoIfValid(str);
            StringBuilder sb = new StringBuilder("second appLaunchLocalCache is null?  ");
            sb.append(preLoginInfoIfValid == null);
            LoginTLogAdapter.e(TAG, sb.toString());
            final NeedLoginCheckData needLoginInfoIfValid = NeedLoginPresenter.getNeedLoginInfoIfValid();
            StringBuilder sb2 = new StringBuilder("second needLoginCheckData is null? ");
            if (needLoginInfoIfValid != null) {
                z2 = false;
            }
            sb2.append(z2);
            LoginTLogAdapter.e(TAG, sb2.toString());
            if ((preLoginInfoIfValid != null && needLoginInfoIfValid != null) || !z) {
                return preLoginInfoIfValid;
            }
            if (preLoginInfoIfValid != null) {
                CoordinatorWrapper.executeSafely(new Runnable() { // from class: com.ali.user.mobile.login.presenter.AppLaunchDataPresenter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            AppLaunchDataPresenter.access$000(context, str, historyAccount, preLoginInfoIfValid, needLoginInfoIfValid);
                        }
                    }
                });
                return preLoginInfoIfValid;
            }
            return getRemoteAppLaunchInfoResponseData(context, str, historyAccount, preLoginInfoIfValid, needLoginInfoIfValid);
        }
    }

    private static AppLaunchInfoResponseData getRemoteAppLaunchInfoResponseData(Context context, String str, HistoryAccount historyAccount, AppLaunchInfoResponseData appLaunchInfoResponseData, NeedLoginCheckData needLoginCheckData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppLaunchInfoResponseData) ipChange.ipc$dispatch("56138be", new Object[]{context, str, historyAccount, appLaunchInfoResponseData, needLoginCheckData});
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        boolean z = appLaunchInfoResponseData == null;
        if (appLaunchInfoResponseData != null && currentTimeMillis > appLaunchInfoResponseData.calTime - LoginSwitch.getSwitch("pre_login_data_expire_time_check", 10)) {
            z = true;
        }
        boolean z2 = needLoginCheckData == null && currentTimeMillis >= getStopGetAppLaunchDataTime();
        if (needLoginCheckData != null && currentTimeMillis >= getStopGetAppLaunchDataTime() && currentTimeMillis > needLoginCheckData.expireTimestamp - LoginSwitch.getSwitch("need_login_data_expire_time_check", 10)) {
            z2 = true;
        }
        LoginParam loginParam = getLoginParam(context);
        SessionList sessionListFromFile = SecurityGuardManagerWraper.getSessionListFromFile();
        if (autoSwitch() && historyAccount != null) {
            long j = historyAccount.userId;
            if (j > 0) {
                String autoLoginTokenFromList = SecurityGuardManagerWraper.getAutoLoginTokenFromList(sessionListFromFile, String.valueOf(j));
                if (!TextUtils.isEmpty(autoLoginTokenFromList)) {
                    loginParam.token = autoLoginTokenFromList;
                    loginParam.tokenType = TokenType.AUTOLOGIN_TOKEN;
                }
            }
        }
        if (z2 && z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ICallService.KEY_NEED_LOGIN);
            loginParam.appendModules = arrayList;
            LoginTLogAdapter.e(TAG, "need all app launch info");
        } else if (z2) {
            loginParam.scene = ICallService.KEY_NEED_LOGIN;
            LoginTLogAdapter.e(TAG, "only need login info");
        }
        AppLaunchInfoResponseData fireAppLaunchRequest = fireAppLaunchRequest(loginParam, historyAccount);
        if (!(fireAppLaunchRequest == null || fireAppLaunchRequest.returnValue == 0)) {
            long currentTimeMillis2 = System.currentTimeMillis() / 1000;
            if (!ICallService.KEY_NEED_LOGIN.equals(loginParam.scene)) {
                AppLaunchInfo appLaunchInfo = (AppLaunchInfo) fireAppLaunchRequest.returnValue;
                LoginStatus.loginTrackInfo = appLaunchInfo.loginTrackInfo;
                fireAppLaunchRequest.calTime = appLaunchInfo.expireTime + currentTimeMillis2;
                LoginTLogAdapter.e(TAG, "appLaunch expire time = " + formatTime(fireAppLaunchRequest.calTime * 1000));
                fireAppLaunchRequest.appVersion = AppInfo.getInstance().getAppVersion();
                putPreLoginInfo(str, fireAppLaunchRequest);
            }
            if (((AppLaunchInfo) fireAppLaunchRequest.returnValue).needLoginInfo != null) {
                NeedLoginCheckData needLoginCheckData2 = new NeedLoginCheckData();
                NeedLoginInfo needLoginInfo = ((AppLaunchInfo) fireAppLaunchRequest.returnValue).needLoginInfo;
                needLoginCheckData2.needLoginInfo = needLoginInfo;
                needLoginCheckData2.expireTimestamp = needLoginInfo.expire + currentTimeMillis2;
                LoginTLogAdapter.e(TAG, "needLoginInfo expire time = " + formatTime(needLoginCheckData2.expireTimestamp * 1000));
                NeedLoginPresenter.putNeedLoginData(needLoginCheckData2);
            } else if (z2) {
                setStopGetAppLaunchDataTime(currentTimeMillis2 + LoginSwitch.getSwitch("app_launch_call_limit", (int) ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT));
                LoginTLogAdapter.e(TAG, "fetchNeedLoginInfo but resp is null");
            }
        }
        return fireAppLaunchRequest;
    }
}
