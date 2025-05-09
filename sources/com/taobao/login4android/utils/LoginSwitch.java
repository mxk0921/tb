package com.taobao.login4android.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.orange.OrangeConfig;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCS_LOGIN_SWITCH = "accs_login_switch";
    public static final String ALIPAY_SSO_SWITCH = "alipay_sso_switch";
    public static final String BIND_ALIPAY_SWITCH = "bind_alipay_switch";
    public static final String BIO_LOGIN_AUTO = "auto_bio";
    public static final String CONFIG_GROUP_LOGIN = "login4android";
    public static String DEFAULT_UI_BALCKLIST = "";
    public static String DEFAULT_UI_BLACKLIST_TIME = "";
    public static final String ENABLE_REGISTER = "enable_register";
    public static final String FACE_LOGIN_AUTO = "auto_face";
    public static final String FINGER_ORANGE = "finger_percent";
    public static final int FINGER_PERCENT = 10000;
    public static final String FORBID_LOGIN_FROM_BACKGROUND = "forbid_login_from_background_new";
    public static final String FORCE_SID_CHECK = "force_sid_check";
    public static final String HELP_LINK = "help_link";
    public static final String LOGOUT_REFACTOR = "logout_refactor_finger";
    public static final int LOGOUT_REFACTOR_DEFAULT = 10000;
    public static final String MEMBER_AUTH_URL = "memberAuthUrl";
    public static final int MULTI_DEFAULT = 10000;
    public static final String NEED_KEEP_SGCOOKIE_IN_CHANGE_ACCOUNT = "need_keep_sgcookie_in_change_account";
    public static final String NEW_LOGOUT_BROADCAST_SWITCH = "new_logout_broadcast_switch";
    public static final String ONEKEY_LOGIN_PERCENT = "onekey_login_percent_v2";
    public static final String ONEKEY_REGISTER_PERCENT = "onekey_register_percent";
    public static final String OPEN_ADAPTER_PAD_AND_FOLD = "open_adapter_pad_and_fold";
    public static final String PROTOCOL = "custom_protocol";
    public static final String PROTOCOL_XIANYU = "custom_protocol_xianyu";
    public static final String PWD_ERROR_TO_ALIPAY = "pwd2alipay";
    public static final int PWD_ERROR_TO_ALIPAY_PERCENT = 10000;
    public static final String REGISTER_ONEKEY_WAIT = "register_onekey_wait";
    public static final String REGISTER_TV = "register_tv";
    public static final int REGITER_ONEKEY_WAIT_DEFAULT = 3000;
    public static final String REG_TO_LOGIN_SENDSMS = "reg_to_login_sendsms";
    public static final String RPC_TIMEOUT_MS = "rpc_request_timeout_ms";
    public static final String SECURITY_SETTING_URL = "securitySettingUrl";
    public static final String SGCOOKIE = "sgcookie";
    public static final String SIM_LOGIN_AUTO = "auto_sim";
    public static final String SMS_CHECK = "sms_check";
    public static final String SMS_LOGIN_AUTO = "auto_sms";
    public static final String SUPPORT_FACE_LOGIN = "support_face_login";
    public static final String SUPPORT_FINGERPRINT_LOGIN = "support_fingerprint_login";
    public static final String SUPPORT_MINI_PROGRAME = "support_mini_program";
    public static final String SUPPORT_OVERSEA_SIMLOGIN = "support_oversea_simlogin";
    public static final String SWITCH_VALUE_FALSE = "false";
    public static final String SWITCH_VALUE_TRUE = "true";
    public static final String TAG = "loginsession.LoginSwitch";
    public static final String WEAK_REFERENCE_HOME_ACT = "weak_reference_home_act";

    static {
        t2o.a(516948011);
    }

    public static String getConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(CONFIG_GROUP_LOGIN, str, str2);
            LoginTLogAdapter.e(TAG, "LoginSwitch:getConfig, confighName=" + str + ", value=" + config);
            return config;
        } catch (Throwable th) {
            th.printStackTrace();
            return str2;
        }
    }

    public static boolean getSwitch(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d7f2a49", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(CONFIG_GROUP_LOGIN, str, str2);
            LoginTLogAdapter.e(TAG, "LoginSwitch:getSwitch, switchName=" + str + ", value=" + config);
            return Boolean.parseBoolean(config);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static int getSwitch(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c25e11b", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            OrangeConfig instance = OrangeConfig.getInstance();
            String config = instance.getConfig(CONFIG_GROUP_LOGIN, str, i + "");
            LoginTLogAdapter.e(TAG, "LoginSwitch:getSwitch, switchName=" + str + ", value=" + config);
            return Integer.parseInt(config);
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }
}
