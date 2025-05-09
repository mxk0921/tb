package com.mobile.auth;

import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class OOOO00O {
    public static String O000000o = "123.125.99.31";
    public static int O00000Oo = 0;
    public static OO0OOOO O00000o = null;
    public static String O00000o0 = "0";
    private static String O00000oO = "";
    private static String O00000oo = "";
    private static String O0000O0o = "";
    private static int O0000OOo = 5;
    private static String O0000Oo = "";
    private static int O0000Oo0 = -1;
    private static String O0000OoO = "";
    private static String O0000Ooo = "";

    public static String O000000o() {
        try {
            return h1p.HTTPS_PREFIX + OO0Oo00.O00000o() + "/unicomAuth/android/v3.0/qc?";
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O00000Oo() {
        try {
            return O00000o0;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O00000o() {
        try {
            return O00000oo;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O00000o0() {
        try {
            return O00000oO;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O00000oO() {
        try {
            String O000000o2 = OO0o0.O000000o();
            O00000oo = O000000o2;
            return O000000o2;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O00000oo() {
        try {
            return O0000O0o;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static int O0000O0o() {
        try {
            return O0000OOo;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static int O0000OOo() {
        try {
            return O0000Oo0;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static void O000000o(int i) {
        try {
            O00000Oo = i;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000Oo(int i) {
        try {
            O0000OOo = i;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000o(String str) {
        try {
            OOO.O00000o0("APN:".concat(String.valueOf(str)));
            O0000O0o = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000o0(int i) {
        try {
            O0000Oo0 = i;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static String O00000oO(String str) {
        try {
            if (!ConnectionUtil.TYPE_CMNET.equals(str) && !"cmwap".equals(str)) {
                if (!ConnectionUtil.TYPE_3GWAP.equals(str) && !ConnectionUtil.TYPE_UNIWAP.equals(str) && !ConnectionUtil.TYPE_3GNET.equals(str) && !ConnectionUtil.TYPE_UNINET.equals(str)) {
                    if (!ConnectionUtil.TYPE_CTNET.equals(str)) {
                        if (!ConnectionUtil.TYPE_CTWAP.equals(str)) {
                            return "0";
                        }
                    }
                    return "2";
                }
                return "3";
            }
            return "1";
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O00000oo(String str) {
        try {
            O0000Oo = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O000000o(String str) {
        try {
            O00000o0 = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000Oo(String str) {
        try {
            O00000oO = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000o0(String str) {
        try {
            O00000oo = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static boolean O000000o(String str, String str2) {
        try {
            OOO.O00000o0("\nhostname : " + str + "\nsubjectName : " + str2);
            if (str.endsWith(".10010.com") && O00000Oo(str2, "CN=10010.com")) {
                return true;
            }
            if (str.equals("auth.wosms.cn") && O00000Oo(str2, "CN=auth.wosms.cn")) {
                return true;
            }
            if (str.equals("msv6.wosms.cn") && O00000Oo(str2, "CN=msv6.wosms.cn")) {
                return true;
            }
            if (str.equals("ali.wosms.cn") && O00000Oo(str2, "CN=ali.wosms.cn")) {
                return true;
            }
            if (str.equals("test.wosms.cn") && O00000Oo(str2, "CN=test.wosms.cn")) {
                return true;
            }
            if (str.equals("m.zzx.cnklog.com") && O00000Oo(str2, "CN=m.zzx.cnklog.com")) {
                return true;
            }
            if (str.equals("id6.me") && O00000Oo(str2, "CN=*.id6.me")) {
                return true;
            }
            if (str.equals("cert.cmpassport.com")) {
                if (O00000Oo(str2, "CN=*.cmpassport.com")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    private static boolean O00000Oo(String str, String str2) {
        try {
            if (!str.startsWith(str2)) {
                return str.endsWith(str2);
            }
            return true;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }
}
