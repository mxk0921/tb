package com.mobile.auth;

import android.content.Context;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0OO00O {
    private static O0OO00O O00000Oo;
    private final Context O000000o;
    private long O00000o0 = 0;
    private String O00000o = "";

    private O0OO00O(Context context) {
        this.O000000o = context;
    }

    public static O0OO00O O000000o() {
        return O00000Oo;
    }

    public String O00000Oo() {
        try {
            int O000000o = O00O0o00.O000000o().O00000Oo().O000000o();
            if (O000000o >= 0) {
                return Integer.toString(O000000o);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String O000000o(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 49679470:
                if (str.equals("46000")) {
                    c = 0;
                    break;
                }
                break;
            case 49679471:
                if (str.equals("46001")) {
                    c = 1;
                    break;
                }
                break;
            case 49679472:
                if (str.equals("46002")) {
                    c = 2;
                    break;
                }
                break;
            case 49679473:
                if (str.equals("46003")) {
                    c = 3;
                    break;
                }
                break;
            case 49679474:
                if (str.equals("46004")) {
                    c = 4;
                    break;
                }
                break;
            case 49679475:
                if (str.equals("46005")) {
                    c = 5;
                    break;
                }
                break;
            case 49679476:
                if (str.equals("46006")) {
                    c = 6;
                    break;
                }
                break;
            case 49679477:
                if (str.equals("46007")) {
                    c = 7;
                    break;
                }
                break;
            case 49679479:
                if (str.equals("46009")) {
                    c = '\b';
                    break;
                }
                break;
            case 49679502:
                if (str.equals("46011")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case 4:
            case 7:
                O0O0O.O00000Oo("SIMUtils", "中国移动");
                return "1";
            case 1:
            case 6:
            case '\b':
                O0O0O.O00000Oo("SIMUtils", "中国联通");
                return "2";
            case 3:
            case 5:
            case '\t':
                O0O0O.O00000Oo("SIMUtils", "中国电信");
                return "3";
            default:
                O0O0O.O00000Oo("SIMUtils", "未知");
                return "0";
        }
    }

    public String O000000o(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = O000000o(z);
        }
        return O000000o(str);
    }

    public String O000000o(boolean z) {
        StringBuilder sb;
        if (!z) {
            return "";
        }
        if (SystemClock.elapsedRealtime() - this.O00000o0 > 3000) {
            this.O00000o0 = SystemClock.elapsedRealtime();
            TelephonyManager telephonyManager = (TelephonyManager) this.O000000o.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            this.O00000o = telephonyManager.getSimOperator();
            sb = new StringBuilder("getSimOperator SysOperator= ");
        } else {
            sb = new StringBuilder("使用缓存operator Operator= ");
        }
        sb.append(this.O00000o);
        O0O0O.O00000Oo("SIMUtils", sb.toString());
        return this.O00000o;
    }

    public static void O000000o(Context context) {
        O00000Oo = new O0OO00O(context);
    }
}
