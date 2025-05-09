package com.ali.user.mobile.login.model;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.dataprovider.StringOrangeResult;
import com.ali.user.mobile.utils.LanguageUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.LoginSwitch;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginConstant {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCOUNT = "account";
    public static final String ACTION_CONTINUELOGIN = "continueLogin";
    public static final String ALIUSER_LOGIN_SITE = "AliUser_loginSite";
    public static final String APPLAUNCH_INFO = "applaunch_info";
    public static final String AUTOLOGIN_TOKEN = "autologin_token";
    public static final String CHANGE_ACCOUNT_AUTOLOGIN_TOKEN = "AliuserChangeAccount_autologin_token";
    public static final String CHANGE_ACCOUNT_FLAG = "AliuserChangeAccount";
    public static final String CHANGE_ACCOUNT_USER_ID = "AliuserChangeAccount_UserId";
    public static final String CURRENT_LOGIN_MODE_STATE = "current_login_mode_state";
    public static final String EXT_ACTION = "_ap_action";
    public static final String FETCH_IV_FAIL_CANCEL = "USER_CANCEL";
    public static final int FETCH_IV_FAIL_CANCEL_CODE = -5;
    public static final String FETCH_IV_FAIL_INVALID_RETURNVALUE = "INVALID_RETURNVALUE";
    public static final int FETCH_IV_FAIL_INVALID_RETURNVALUE_CODE = -4;
    public static final String FETCH_IV_FAIL_INVALID_SCENE = "INVALID_SCENE";
    public static final int FETCH_IV_FAIL_INVALID_SCENE_CODE = -3;
    public static final String FETCH_IV_FAIL_INVALID_USERID = "INVALID_USERID";
    public static final int FETCH_IV_FAIL_INVALID_USERID_CODE = -2;
    public static final String FETCH_IV_FAIL_NULL_RESPONSE = "RET_NULL";
    public static final int FETCH_IV_FAIL_NULL_RESPONSE_CODE = -1;
    public static final String FETCH_TOKEN_FAIL_AUTO_LOGIN_FAIL = "AUTO_LOGIN_FAIL";
    public static final String FETCH_TOKEN_FAIL_EXCEPTION = "CAUSE_EXCEPTION";
    public static final String FETCH_TOKEN_FAIL_NOT_SESSION_INVALID = "NET_FETCH_TOKEN_FAIL_NOT_SESSION_INVALID";
    public static final String FETCH_TOKEN_FAIL_NULL_RESPONSE = "RET_NULL";
    public static final String FETCH_TOKEN_FAIL_SESSION_INVALID = "SessionInValid";
    public static final String FIND_ACCOUNT_URL = "https://passport.taobao.com/ac/h5/nick_find.htm?from_site=0&lang=zh_CN&app_name=tb";
    public static final String FORCE_HIDE_ALL = "force_hide_all_fragment";
    public static final String FORCE_NORMAL_MODE = "forceNormalMode";
    public static final String FORCE_NOT_FACE = "forNotFaceMode";
    public static final String FORCE_NOT_FAST = "forceNotFast";
    public static final String FORCE_OPEN_LOGIN = "forceOpenLoginView";
    public static final String FORM_ADD_ACCOUNT = "fromAddAccount";
    public static final String FROM_ONE_KEY = "fromOnekey";
    public static final String FROM_OVERSEA = "fromOversea";
    public static final String HELP_URL_OVERSEA = "https://ai.alimebot.taobao.com/intl/index.htm?from=ObiAjGcaIU";
    public static final String HELP_URL_OVERSEA_EN = "https://ai.alimebot.taobao.com/intl/index.htm?from=PymP9x3Mxm";
    public static final String HELP_URL_OVERSEA_MS = "https://ai.alimebot.taobao.com/intl/index.htm?from=xQZGmYxn9B";
    public static final String HELP_URL_OVERSEA_RU = "https://ai.alimebot.taobao.com/intl/index.htm?from=T4VyiQ3yVl";
    public static final String HELP_URL_OVERSEA_TH = "https://ai.alimebot.taobao.com/intl/index.htm?from=jHmo6tUmSf";
    public static final String HID = "hid";
    public static final String ICBU_IV_SKIP = "showSkipButton";
    public static final String LAUCNH_MOBILE_LOGIN_FRAGMENT_LABEL = "launchMobileLoginFragment";
    public static final String LAUCNH_USER_LOGIN_FRAGMENT_LABEL = "launchLoginFragment";
    public static final String LAUNCH_PASS_GUIDE_FRAGMENT = "launchPassGuideFragment";
    public static final String LAUNCH_PASS_QR_FRAGMENT = "launchPassQrFragment";
    public static final String LAUNCH_PASS_SIM = "launchPassSimFragment";
    public static final String LAUNCH_SNS_TO_SMS_FRAGMENT = "launchSnsToSmsFragment";
    public static final String LOGINPARAM = "key_loginParam";
    public static final String LOGIN_BUNDLE_UNIFY_SSO_TOKEN = "unifySsoToken";
    public static final String LOGIN_ENTRANCE = "login_entrance";
    public static final String LOGIN_ID = "loginid";
    public static final String LOGIN_TYPE = "login_type";
    public static final String LOGIN_TYPE_FINGERPRINT = "fingerprintLogin";
    public static final String LOGIN_TYPE_KEY = "login_type";
    public static final String OUTTER_LOGIN_TOKEN = "outter_login_token";
    public static final String OUTTER_LOGIN_TOKEN_TYPE = "outter_login_token_type";
    public static final String RESET_LOGIN_STATUS = "NOTIFY_LOGIN_STATUS_RESET";
    public static final int RESULT_WINDVANE_CLOSEALL = 721;
    public static final int RESULT_WINDWANE_CLOSEW = 720;
    public static final String SCAN_KEY = "key_scanParam";
    public static final String SCAN_SCENE = "key_scanScene";
    public static final String START_TIME = "startTime";
    public static final String SUPPORT_OVERSEA_SIMLOGIN = "supportOverseaSimLogin";
    public static final String TAOBAO_HELP_URL = "https://passport.taobao.com/ac/h5/ihelp_center.htm?fromSite=0";
    public static final String TAOBAO_HELP_URLpre = "https://passportpre.taobao.com/ac/h5/ihelp_center.htm?fromSite=0";
    public static final String TARGET_HID = "targetHid";
    public static final String UMID_TOKEN = "umidLoginToken";
    public static final String WINDVANE = "windvane";
    public static final String XDEVICE = "xdevice";
    public static String APP_LAUNCH_FILE_NAME = "getAppLaunch_first";
    public static String NEED_LOGIN_FILE_NAME = "need_login_info";

    public static String getHelpUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88e2dbc1", new Object[0]);
        }
        StringOrangeResult helpLink = DataProviderFactory.getOrangeConfig().helpLink();
        if (helpLink.orangeExist) {
            return helpLink.value;
        }
        if (DataProviderFactory.getDataProvider().getEnvType() == 2) {
            return TAOBAO_HELP_URLpre;
        }
        return TAOBAO_HELP_URL;
    }

    public static String getHelpUrlOversea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76f48136", new Object[0]);
        }
        String defaultHelpUrlOversea = getDefaultHelpUrlOversea();
        String language = LanguageUtil.getLanguage();
        return LoginSwitch.getConfig("oversea_help_" + language, defaultHelpUrlOversea);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r1.equals("ms") == false) goto L_0x0021;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getDefaultHelpUrlOversea() {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.ali.user.mobile.login.model.LoginConstant.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "a4089a61"
            java.lang.Object r0 = r1.ipc$dispatch(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0012:
            java.lang.String r1 = com.ali.user.mobile.utils.LanguageUtil.getLanguage()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case 3494: goto L_0x0047;
                case 3651: goto L_0x003b;
                case 3700: goto L_0x002f;
                case 3886: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            r0 = -1
            goto L_0x0051
        L_0x0023:
            java.lang.String r0 = "zh"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002d
            goto L_0x0021
        L_0x002d:
            r0 = 3
            goto L_0x0051
        L_0x002f:
            java.lang.String r0 = "th"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0039
            goto L_0x0021
        L_0x0039:
            r0 = 2
            goto L_0x0051
        L_0x003b:
            java.lang.String r0 = "ru"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0045
            goto L_0x0021
        L_0x0045:
            r0 = 1
            goto L_0x0051
        L_0x0047:
            java.lang.String r3 = "ms"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0051
            goto L_0x0021
        L_0x0051:
            switch(r0) {
                case 0: goto L_0x0064;
                case 1: goto L_0x0060;
                case 2: goto L_0x005c;
                case 3: goto L_0x0058;
                default: goto L_0x0054;
            }
        L_0x0054:
            java.lang.String r0 = "https://ai.alimebot.taobao.com/intl/index.htm?from=PymP9x3Mxm"
            return r0
        L_0x0058:
            java.lang.String r0 = "https://ai.alimebot.taobao.com/intl/index.htm?from=ObiAjGcaIU"
            return r0
        L_0x005c:
            java.lang.String r0 = "https://ai.alimebot.taobao.com/intl/index.htm?from=jHmo6tUmSf"
            return r0
        L_0x0060:
            java.lang.String r0 = "https://ai.alimebot.taobao.com/intl/index.htm?from=T4VyiQ3yVl"
            return r0
        L_0x0064:
            java.lang.String r0 = "https://ai.alimebot.taobao.com/intl/index.htm?from=xQZGmYxn9B"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.login.model.LoginConstant.getDefaultHelpUrlOversea():java.lang.String");
    }

    static {
        t2o.a(69206124);
    }
}
