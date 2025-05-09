package com.mobile.auth;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.json.JSONObject;
import tb.y1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OO0Oo00 {
    private static volatile OO0Oo00 O00000Oo;
    public Context O000000o;
    private ExecutorService O00000o0 = Executors.newSingleThreadExecutor();

    private OO0Oo00() {
    }

    public static OO0Oo00 O000000o() {
        try {
            if (O00000Oo == null) {
                synchronized (OO0Oo00.class) {
                    if (O00000Oo == null) {
                        O00000Oo = new OO0Oo00();
                    }
                }
            }
            return O00000Oo;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O00000Oo() {
        try {
            return OOO0OO0.O00000Oo();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000a, B:8:0x0014, B:11:0x001e, B:14:0x0023, B:15:0x0025, B:17:0x002b, B:18:0x0030), top: B:22:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O00000o() {
        /*
            java.lang.String r0 = com.mobile.auth.OOO0OO0.O00000o0     // Catch: all -> 0x0021
            if (r0 == 0) goto L_0x0023
            int r1 = r0.length()     // Catch: all -> 0x0021
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = r0.trim()     // Catch: all -> 0x0021
            int r1 = r1.length()     // Catch: all -> 0x0021
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = "null"
            boolean r0 = r1.equals(r0)     // Catch: all -> 0x0021
            if (r0 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: all -> 0x0021
            goto L_0x0025
        L_0x0021:
            r0 = move-exception
            goto L_0x0033
        L_0x0023:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: all -> 0x0021
        L_0x0025:
            boolean r0 = r0.booleanValue()     // Catch: all -> 0x0021
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "msv6.wosms.cn"
            com.mobile.auth.OOO0OO0.O00000o0 = r0     // Catch: all -> 0x0021
        L_0x0030:
            java.lang.String r0 = com.mobile.auth.OOO0OO0.O00000o0     // Catch: all -> 0x0021
            return r0
        L_0x0033:
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.OO0Oo00.O00000o():java.lang.String");
    }

    public static String O00000o0() {
        return "phoneinfo";
    }

    public static String O00000oO() {
        return "auth.wosms.cn";
    }

    public static void O00000oo() {
        try {
            OOO00o.O000000o = false;
            OOO00o.O00000Oo = false;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O0000O0o() {
        try {
            OOO0oO.O000000o().O00000Oo();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static String O000000o(Context context, String str, String str2) {
        try {
            return OO0Oo0.O000000o(context, str, str2);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O00000Oo(Context context) {
        try {
            OO0o000.O00000Oo(context);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static boolean O00000o(Context context) {
        try {
            int O00000Oo2 = OOOO0.O00000Oo(context);
            return O00000Oo2 == 0 || O00000Oo2 == 1;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    public static void O00000o0(Context context) {
        try {
            OO0o000.O00000o(context);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000oO(Context context) {
        try {
            OO0Oo0.O000000o(context);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static boolean O00000Oo(String str) {
        try {
            if (!str.equalsIgnoreCase("ali.wosms.cn") && !str.equalsIgnoreCase("m.zzx.cnklog.com") && !str.equalsIgnoreCase("msv6.wosms.cn") && !str.equalsIgnoreCase("test.wosms.cn")) {
                OOO0OO0.O00000o0 = "msv6.wosms.cn";
                return false;
            }
            OOO0OO0.O00000o0 = str;
            return true;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    public final String O000000o(String str) {
        char c;
        try {
            if (this.O000000o == null) {
                return "sdk 未初始化, context 为空";
            }
            try {
                String lowerCase = str.toLowerCase();
                switch (lowerCase.hashCode()) {
                    case -903629273:
                        if (lowerCase.equals("sha256")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 107902:
                        if (lowerCase.equals("md5")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3528965:
                        if (lowerCase.equals("sha1")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 93029116:
                        if (lowerCase.equals(HiAnalyticsConstant.HaKey.BI_KEY_APPID)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 667683678:
                        if (lowerCase.equals("sdkversion")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 909712337:
                        if (lowerCase.equals(NewHtcHomeBadger.PACKAGENAME)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    return OOOO00O.O00000o0();
                }
                if (c == 1) {
                    return this.O000000o.getApplicationContext().getPackageName();
                }
                if (c == 2 || c == 3 || c == 4) {
                    Context context = this.O000000o;
                    return OOOO0.O000000o(context, context.getPackageName(), str.toLowerCase());
                } else if (c == 5) {
                    return OOO0OO0.O00000Oo();
                } else {
                    throw new Exception("no info");
                }
            } catch (Exception e) {
                return "no info:" + e.toString();
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O000000o(int i, OO0OOo0 oO0OOo0, String str) {
        try {
            OOO.O00000oO("type:" + i + "\nmsg:" + str);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resultCode", 1);
                jSONObject.put("resultMsg", str);
                jSONObject.put("resultData", "");
                jSONObject.put(y1r.COL_SEQ, "");
                oO0OOo0.onResult(jSONObject.toString());
            } catch (Exception unused) {
                OOO.O00000Oo();
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O000000o(boolean z) {
        try {
            OOO.O000000o(z);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static boolean O000000o(Context context) {
        try {
            if (OO0o000.O000000o(context)) {
                if (OO0o000.O00000o0(context)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    public static boolean O000000o(Context context, String str, String str2, String str3) {
        try {
            return OO0Oo0.O000000o(context, str, str2, str3);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }
}
