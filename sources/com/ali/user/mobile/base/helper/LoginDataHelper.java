package com.ali.user.mobile.base.helper;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.login.presenter.NeedLoginPresenter;
import com.ali.user.mobile.model.LoginBaseParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.model.TokenType;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.login.model.AliUserResponseData;
import com.ali.user.mobile.rpc.login.model.DeviceTokenRO;
import com.ali.user.mobile.rpc.login.model.LoginReturnData;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.service.RpcService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.SharedPreferencesUtil;
import com.ali.user.mobile.utils.StringUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.biz.uninstall.UninstallManager;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.ISession;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.login4android.utils.LoginSwitch;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginDataHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login_optimize";

    static {
        t2o.a(69206069);
    }

    public static /* synthetic */ void access$000(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd32a15", new Object[]{str, str2, str3});
        } else {
            saveCp(str, str2, str3);
        }
    }

    public static /* synthetic */ void access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            clearAppLaunchSPAndNeedLoginCache();
        }
    }

    public static long adjustSessionExpireTime(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("139544ee", new Object[]{new Long(j), new Long(j2)})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (currentTimeMillis <= j2) {
            return j;
        }
        if (j > 0) {
            return j + (currentTimeMillis - j2);
        }
        return 86400 + currentTimeMillis;
    }

    public static void beforeProcessLoginData(boolean z, AliUserResponseData aliUserResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280bbea1", new Object[]{new Boolean(z), aliUserResponseData});
        } else if (LoginStatus.isFromChangeAccount() && z) {
            SessionManager instance = SessionManager.getInstance(DataProviderFactory.getApplicationContext());
            if (aliUserResponseData == null || instance == null || !LoginSwitch.getSwitch(LoginSwitch.NEW_LOGOUT_BROADCAST_SWITCH, "true") || !TextUtils.equals(instance.getUserId(), aliUserResponseData.userId)) {
                HashMap hashMap = new HashMap(3);
                hashMap.put(LoginConstants.LOGOUT_TYPE, LoginConstants.LogoutType.CHANGE_ACCOUNT.getType());
                hashMap.put("nick", SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldNick());
                hashMap.put("uid", SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId());
                BroadCastHelper.sendBroadcast(LoginAction.NOTIFY_LOGOUT, false, 0, "", (Map<String, String>) hashMap, "before recover account");
                UserTrackAdapter.sendUT("SEND_LOGOUT_BROADCAST");
            }
        }
    }

    private static void clearAppLaunchSPAndNeedLoginCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e30e69", new Object[0]);
            return;
        }
        AliUserLogin.clearCacheData(LoginConstant.APP_LAUNCH_FILE_NAME);
        NeedLoginPresenter.clearNeedLoginStrategy();
    }

    public static void processLoginReturnData(boolean z, LoginReturnData loginReturnData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8763b23", new Object[]{new Boolean(z), loginReturnData});
        } else {
            processLoginReturnData(z, loginReturnData, null, null);
        }
    }

    public static void registerSessionInfo(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a47da6", new Object[]{str, str2, str3});
        } else {
            registerSessionInfo(str, str2, str3, true);
        }
    }

    private static void saveCp(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1465a96f", new Object[]{str, str2, str3});
            return;
        }
        try {
            Context applicationContext = DataProviderFactory.getApplicationContext();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", (Object) str);
            jSONObject.put("nick", (Object) StringUtil.dataMasking(str3));
            jSONObject.put(SubstituteConstants.KEY_SUBSTITUTE_PAY_AVATAR, (Object) str2);
            CPHelper.save(applicationContext, LoginConstant.ACCOUNT, jSONObject.toString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void sendLoginResultBroadcast(boolean z, String str, String str2, LoginBaseParam loginBaseParam, LoginReturnData loginReturnData, AliUserResponseData aliUserResponseData, String str3, String str4) {
        Map<String, String> map;
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e0dd8f", new Object[]{new Boolean(z), str, str2, loginBaseParam, loginReturnData, aliUserResponseData, str3, str4});
        } else if (z) {
            String str5 = "";
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(LoginResActions.LOGIN_SUCCESS_ACTION);
                intent.putExtra("nick", str2);
                intent.putExtra("uid", str);
                if (loginBaseParam != null && TokenType.MERGE_ACCOUNT.equals(loginBaseParam.tokenType)) {
                    intent.putExtra("message", TokenType.MERGE_ACCOUNT);
                }
                if (LoginStatus.isFromChangeAccount()) {
                    intent.putExtra(LoginConstants.LOGIN_FROM, LoginConstants.LOGIN_FROM_MULTI_ACCOUNT);
                }
                if (!(aliUserResponseData == null || (map2 = aliUserResponseData.loginServiceExt) == null)) {
                    str5 = map2.get(LoginConstants.LOGIN_TYPE);
                }
                if (TextUtils.isEmpty(str5) && (map = loginReturnData.extMap) != null) {
                    str5 = map.get(LoginConstants.LOGIN_TYPE);
                    if (TextUtils.isEmpty(str5)) {
                        str5 = loginReturnData.extMap.get("rootLoginType");
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = str5;
                }
                intent.putExtra(LoginConstants.LOGIN_TYPE, str3);
                intent.putExtra(LoginConstants.LOGIN_ACCOUNT, str4);
                intent.putExtra("serverLoginType", str5);
                BroadCastHelper.sendLocalBroadCast(intent);
                return;
            }
            BroadCastHelper.sendLoginFailBroadcast(711, str5);
            LoginStatus.resetLoginFlag();
        }
    }

    public static SessionModel sessionToModel(ISession iSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionModel) ipChange.ipc$dispatch("f89c3db6", new Object[]{iSession});
        }
        SessionModel sessionModel = new SessionModel();
        sessionModel.sid = iSession.getSid();
        sessionModel.ecode = iSession.getEcode();
        sessionModel.nick = iSession.getNick();
        sessionModel.userId = iSession.getUserId();
        sessionModel.email = iSession.getEmail();
        sessionModel.autoLoginToken = iSession.getLoginToken();
        sessionModel.havanaSsoToken = iSession.getOneTimeToken();
        sessionModel.havanaSsoTokenExpiredTime = iSession.getHavanaSsoTokenExpiredTime();
        sessionModel.ssoToken = iSession.getSsoToken();
        sessionModel.expires = iSession.getSessionExpiredTime();
        if (!TextUtils.isEmpty(iSession.getExtJson())) {
            try {
                sessionModel.loginServiceExt = (Map) JSON.parseObject(iSession.getExtJson(), new TypeReference<Map<String, String>>() { // from class: com.ali.user.mobile.base.helper.LoginDataHelper.2
                }, new Feature[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        sessionModel.site = iSession.getLoginSite();
        String email = iSession.getEmail();
        sessionModel.showLoginId = email;
        if (TextUtils.isEmpty(email)) {
            sessionModel.showLoginId = iSession.getNick();
        }
        return sessionModel;
    }

    public static void processLoginReturnData(boolean z, LoginReturnData loginReturnData, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2f9602", new Object[]{new Boolean(z), loginReturnData, map});
        } else {
            processLoginReturnData(z, loginReturnData, null, map);
        }
    }

    public static void registerSessionInfo(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bebe9ee", new Object[]{str, str2, str3, new Boolean(z)});
            return;
        }
        UserTrackAdapter.sendUT("step_register_mtop");
        ((RpcService) ServiceFactory.getService(RpcService.class)).registerSessionInfo(str, str2, str3);
        if (z && LoginSwitch.getSwitch("login_reset_login_flag_enabled", "true")) {
            LoginStatus.resetLoginFlagNoStack();
        }
        LoginTLogAdapter.e("login_optimize", "register SessionInfo to mtopsdk:(sid:" + str);
    }

    public static void processLoginReturnData(boolean z, LoginReturnData loginReturnData, LoginBaseParam loginBaseParam, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655e174", new Object[]{new Boolean(z), loginReturnData, loginBaseParam, map});
            return;
        }
        LoginTLogAdapter.e("login_optimize", "new task");
        if (loginReturnData != null && loginReturnData.data != null) {
            new CoordinatorWrapper().execute(new LoginDataHelperTask(z, loginReturnData, loginBaseParam, map), new Object[0]);
        }
    }

    public static void handleHistory(LoginReturnData loginReturnData, ISession iSession, AliUserResponseData aliUserResponseData, Map<String, String> map) {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37f6f6e", new Object[]{loginReturnData, iSession, aliUserResponseData, map});
            return;
        }
        if (map == null || TextUtils.isEmpty(map.get(LoginConstants.LOGIN_TYPE))) {
            str = "";
        } else {
            str = map.get(LoginConstants.LOGIN_TYPE);
        }
        LoginType.ServerLoginType serverLoginType = LoginType.ServerLoginType.AutoLogin;
        if (!TextUtils.equals(str, serverLoginType.getType()) && !TextUtils.equals(str, LoginConstant.LOGIN_TYPE_FINGERPRINT)) {
            SharedPreferencesUtil.saveData(DataProviderFactory.getApplicationContext(), "login_type", str);
        }
        DeviceTokenRO deviceTokenRO = loginReturnData.deviceToken;
        if (deviceTokenRO != null) {
            String str4 = deviceTokenRO.key;
            str3 = deviceTokenRO.salt;
            str2 = str4;
        } else {
            str3 = null;
            str2 = null;
        }
        int i = loginReturnData.site;
        String str5 = loginReturnData.showLoginId;
        if (TextUtils.isEmpty(str5)) {
            str5 = loginReturnData.taobaoNick;
        }
        String str6 = loginReturnData.mobile;
        String str7 = aliUserResponseData.headPicLink;
        Long l = loginReturnData.hid;
        long longValue = l == null ? 0L : l.longValue();
        Long l2 = loginReturnData.alipayHid;
        long longValue2 = l2 == null ? 0L : l2.longValue();
        String str8 = aliUserResponseData.autoLoginToken;
        long j = aliUserResponseData.loginTime;
        if (j <= 0) {
            j = System.currentTimeMillis() / 1000;
        }
        HistoryAccount historyAccount = new HistoryAccount(str5, str6, str7, longValue, longValue2, str8, j, str2, "", loginReturnData.taobaoNick, loginReturnData.email, loginReturnData.alipayCrossed, i);
        if (!TextUtils.isEmpty(loginReturnData.accountId)) {
            historyAccount.setAccountId(loginReturnData.accountId);
        }
        Map<String, String> map2 = loginReturnData.extMap;
        if (map2 != null) {
            historyAccount.biometricId = map2.get(SessionConstants.BIOMETRIC);
        }
        historyAccount.setLoginPhone(aliUserResponseData.loginPhone);
        if (aliUserResponseData.loginServiceExt != null) {
            if (TextUtils.isEmpty(str)) {
                str = aliUserResponseData.loginServiceExt.get(LoginConstants.LOGIN_TYPE);
            }
            String str9 = aliUserResponseData.loginServiceExt.get("loginEntrance");
            if (!TextUtils.isEmpty(str9)) {
                SharedPreferencesUtil.saveData(DataProviderFactory.getApplicationContext(), LoginConstant.LOGIN_ENTRANCE, str9);
            }
            if (!aliUserResponseData.loginServiceExt.containsKey("hasPwd")) {
                historyAccount.hasPwd = -1;
            } else if (TextUtils.equals("true", aliUserResponseData.loginServiceExt.get("hasPwd"))) {
                historyAccount.hasPwd = 1;
            } else {
                historyAccount.hasPwd = 0;
            }
        }
        if (!TextUtils.equals(str, serverLoginType.getType()) && !TextUtils.equals(str, LoginConstant.LOGIN_TYPE_FINGERPRINT)) {
            historyAccount.loginType = str;
            SharedPreferencesUtil.saveData(DataProviderFactory.getApplicationContext(), "login_type", str);
        }
        if (loginReturnData.deviceToken != null) {
            SecurityGuardManagerWraper.putLoginHistory(historyAccount, str3);
        } else {
            SecurityGuardManagerWraper.saveHistoryOnly(historyAccount);
        }
        SessionModel sessionModel = new SessionModel();
        sessionModel.sid = aliUserResponseData.sid;
        sessionModel.ecode = aliUserResponseData.ecode;
        sessionModel.nick = aliUserResponseData.nick;
        sessionModel.userId = aliUserResponseData.userId;
        sessionModel.email = aliUserResponseData.email;
        sessionModel.havanaId = aliUserResponseData.havanaId;
        sessionModel.alipayHid = aliUserResponseData.alipayHid;
        sessionModel.loginTime = aliUserResponseData.loginTime;
        sessionModel.autoLoginToken = aliUserResponseData.autoLoginToken;
        sessionModel.headPicLink = aliUserResponseData.headPicLink;
        sessionModel.havanaSsoToken = aliUserResponseData.havanaSsoToken;
        sessionModel.havanaSsoTokenExpiredTime = aliUserResponseData.havanaSsoTokenExpiredTime;
        sessionModel.externalCookies = aliUserResponseData.externalCookies;
        sessionModel.cookies = aliUserResponseData.cookies;
        sessionModel.ssoToken = aliUserResponseData.ssoToken;
        sessionModel.expires = aliUserResponseData.expires;
        sessionModel.extendAttribute = aliUserResponseData.extendAttribute;
        sessionModel.loginServiceExt = aliUserResponseData.loginServiceExt;
        sessionModel.site = loginReturnData.site;
        sessionModel.showLoginId = loginReturnData.showLoginId;
        sessionModel.loginPhone = aliUserResponseData.loginPhone;
        sessionModel.mobile = loginReturnData.mobile;
        try {
            sessionModel.expTags = loginReturnData.extMap.get("expTags");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        SecurityGuardManagerWraper.putSessionModelToFile(sessionModel);
        SecurityGuardManagerWraper.getSessionList(new DataCallback<SessionList>() { // from class: com.ali.user.mobile.base.helper.LoginDataHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public void result(SessionList sessionList) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5f6c387", new Object[]{this, sessionList});
                } else {
                    UninstallManager.getInstance().saveSessionData(sessionList);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void onLoginSuccess(final com.ali.user.mobile.rpc.login.model.LoginReturnData r37, final com.ali.user.mobile.rpc.login.model.AliUserResponseData r38, com.taobao.login4android.session.SessionManager r39) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.base.helper.LoginDataHelper.onLoginSuccess(com.ali.user.mobile.rpc.login.model.LoginReturnData, com.ali.user.mobile.rpc.login.model.AliUserResponseData, com.taobao.login4android.session.SessionManager):void");
    }
}
