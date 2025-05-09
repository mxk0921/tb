package com.mobile.auth;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
class O00O00Oo {
    public static int O000000o(int i) {
        return O0OO0O.O000000o("sso_config_xf", "maxFailedLogTimes", i);
    }

    public static int O00000Oo(int i) {
        return O0OO0O.O000000o("sso_config_xf", "pauseTime", i);
    }

    public static boolean O00000o(boolean z) {
        String str;
        if (z) {
            str = "CU";
        } else {
            str = "";
        }
        return O0OO0O.O000000o("sso_config_xf", "CLOSE_FRIEND_WAPKS", str).contains("CU");
    }

    public static String O00000o0(String str) {
        String O000000o = O0OO0O.O000000o("sso_config_xf", LoggingSPCache.STORAGE_LOGHOST, "");
        return TextUtils.isEmpty(O000000o) ? str : O000000o;
    }

    public static boolean O00000oO(boolean z) {
        String str;
        if (z) {
            str = "CT";
        } else {
            str = "";
        }
        return O0OO0O.O000000o("sso_config_xf", "CLOSE_FRIEND_WAPKS", str).contains("CT");
    }

    public static boolean O00000oo(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        return "1".equals(O0OO0O.O000000o("sso_config_xf", "CLOSE_LOGS_VERSION", str));
    }

    public static String O000000o(String str) {
        String O000000o = O0OO0O.O000000o("sso_config_xf", "config_host", (String) null);
        return TextUtils.isEmpty(O000000o) ? str : O000000o;
    }

    public static String O00000Oo(String str) {
        String O000000o = O0OO0O.O000000o("sso_config_xf", "https_get_phone_scrip_host", (String) null);
        return TextUtils.isEmpty(O000000o) ? str : O000000o;
    }

    public static boolean O00000o0(boolean z) {
        String str = !z ? "0" : "1";
        return "1".equals(O0OO0O.O000000o("sso_config_xf", "CLOSE_M008_APPID_LIST", str)) || "1".equals(O0OO0O.O000000o("sso_config_xf", "CLOSE_M008_SDKVERSION_LIST", str));
    }

    public static boolean O000000o() {
        return System.currentTimeMillis() >= O0OO0O.O000000o("sso_config_xf", "client_valid", 0L);
    }

    public static boolean O00000Oo(boolean z) {
        return "1".equals(O0OO0O.O000000o("sso_config_xf", "CLOSE_IPV6_LIST", !z ? "0" : "1"));
    }

    public static boolean O000000o(boolean z) {
        return "1".equals(O0OO0O.O000000o("sso_config_xf", "CLOSE_IPV4_LIST", !z ? "0" : "1"));
    }
}
