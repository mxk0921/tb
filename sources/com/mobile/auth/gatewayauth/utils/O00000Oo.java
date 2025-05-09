package com.mobile.auth.gatewayauth.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.mobile.auth.O0o00;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00000Oo {
    private static String O000000o = "";
    private static volatile String O00000Oo;
    private static volatile long O00000o0;

    public static int O000000o(Context context) {
        try {
            return O0o00.O000000o(context, 4);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
    }

    public static String O00000Oo(Context context) {
        try {
            int O000000o2 = O000000o(context);
            return O000000o2 == 4 ? "unknown" : O000000o2 != 1 ? O000000o2 != 2 ? O000000o2 != 3 ? "unknown" : Constant.VENDOR_CTCC : Constant.VENDOR_CUCC : Constant.VENDOR_CMCC;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static boolean O00000o(Context context) {
        NetworkInfo activeNetworkInfo;
        NetworkInfo networkInfo;
        NetworkInfo networkInfo2;
        NetworkInfo.State state;
        NetworkInfo.State state2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable() || (((networkInfo = connectivityManager.getNetworkInfo(1)) != null && (state2 = networkInfo.getState()) != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) || (networkInfo2 = connectivityManager.getNetworkInfo(0)) == null || (state = networkInfo2.getState()) == null))) {
                if (state != NetworkInfo.State.CONNECTED) {
                    if (state == NetworkInfo.State.CONNECTING) {
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static String O00000o0(Context context) {
        try {
            int O000000o2 = O000000o(context);
            return O000000o2 == 4 ? "unknown" : O000000o2 != 1 ? O000000o2 != 2 ? O000000o2 != 3 ? "unknown" : Constant.CTCC : Constant.CUCC : Constant.CMCC;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static boolean O00000oO(Context context) {
        try {
            if (O0000Oo(context)) {
                return false;
            }
            if (O0000Oo0(context)) {
                return true;
            }
            try {
                Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Boolean) declaredMethod.invoke((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity"), new Object[0])).booleanValue();
            } catch (Exception e) {
                O0000Oo0.O000000o(e);
                return true;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static void O0000O0o(Context context) {
        try {
            O000000o = O0000OOo(context);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[Catch: all -> 0x002e, Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:2:0x0000, B:3:0x0004, B:5:0x000a, B:7:0x0016, B:9:0x001c, B:16:0x0032, B:18:0x0038, B:21:0x004a, B:22:0x004e, B:24:0x0054, B:26:0x0060, B:28:0x0064), top: B:38:0x0000, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O0000OOo(android.content.Context r4) {
        /*
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: all -> 0x002e, Exception -> 0x0030
        L_0x0004:
            boolean r1 = r0.hasMoreElements()     // Catch: all -> 0x002e, Exception -> 0x0030
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r0.nextElement()     // Catch: all -> 0x002e, Exception -> 0x0030
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: all -> 0x002e, Exception -> 0x0030
            boolean r2 = O00000o(r4)     // Catch: all -> 0x002e, Exception -> 0x0030
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = r1.getName()     // Catch: all -> 0x002e, Exception -> 0x0030
            if (r2 == 0) goto L_0x004a
            java.lang.String r2 = r1.getName()     // Catch: all -> 0x002e, Exception -> 0x0030
            java.lang.String r2 = r2.toLowerCase()     // Catch: all -> 0x002e, Exception -> 0x0030
            java.lang.String r3 = "wlan"
            boolean r2 = r2.contains(r3)     // Catch: all -> 0x002e, Exception -> 0x0030
            if (r2 != 0) goto L_0x004a
            goto L_0x0004
        L_0x002e:
            r4 = move-exception
            goto L_0x006f
        L_0x0030:
            r4 = move-exception
            goto L_0x0069
        L_0x0032:
            java.lang.String r2 = r1.getName()     // Catch: all -> 0x002e, Exception -> 0x0030
            if (r2 == 0) goto L_0x004a
            java.lang.String r2 = r1.getName()     // Catch: all -> 0x002e, Exception -> 0x0030
            java.lang.String r2 = r2.toLowerCase()     // Catch: all -> 0x002e, Exception -> 0x0030
            java.lang.String r3 = "rmnet"
            boolean r2 = r2.contains(r3)     // Catch: all -> 0x002e, Exception -> 0x0030
            if (r2 != 0) goto L_0x004a
            goto L_0x0004
        L_0x004a:
            java.util.Enumeration r1 = r1.getInetAddresses()     // Catch: all -> 0x002e, Exception -> 0x0030
        L_0x004e:
            boolean r2 = r1.hasMoreElements()     // Catch: all -> 0x002e, Exception -> 0x0030
            if (r2 == 0) goto L_0x0004
            java.lang.Object r2 = r1.nextElement()     // Catch: all -> 0x002e, Exception -> 0x0030
            java.net.InetAddress r2 = (java.net.InetAddress) r2     // Catch: all -> 0x002e, Exception -> 0x0030
            boolean r3 = r2.isLoopbackAddress()     // Catch: all -> 0x002e, Exception -> 0x0030
            if (r3 != 0) goto L_0x004e
            boolean r3 = r2 instanceof java.net.Inet4Address     // Catch: all -> 0x002e, Exception -> 0x0030
            if (r3 == 0) goto L_0x004e
            java.lang.String r4 = r2.getHostAddress()     // Catch: all -> 0x002e, Exception -> 0x0030
            return r4
        L_0x0069:
            com.mobile.auth.gatewayauth.utils.O0000Oo0.O000000o(r4)     // Catch: all -> 0x002e
        L_0x006c:
            java.lang.String r4 = ""
            return r4
        L_0x006f:
            r0 = 0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r4)     // Catch: all -> 0x0074
            return r0
        L_0x0074:
            r4 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.O00000Oo.O0000OOo(android.content.Context):java.lang.String");
    }

    public static boolean O0000Oo(Context context) {
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            try {
                O0000Oo0.O000000o(th);
                return false;
            } catch (Throwable th2) {
                try {
                    ExceptionProcessor.processException(th2);
                    return false;
                } catch (Throwable th3) {
                    ExceptionProcessor.processException(th3);
                    return false;
                }
            }
        }
    }

    public static boolean O0000Oo0(Context context) {
        if (context != null) {
            try {
                NetworkInfo networkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getNetworkInfo(0);
                if (networkInfo == null || !networkInfo.isAvailable()) {
                    return false;
                }
                if (networkInfo.isConnected()) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return false;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:3:0x0003, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:12:0x002b, B:14:0x0031, B:16:0x0035, B:18:0x0039, B:20:0x003f, B:23:0x0047, B:26:0x004d, B:28:0x0053, B:30:0x005f, B:35:0x006e, B:37:0x0076, B:39:0x0080, B:41:0x0089), top: B:51:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String O0000OoO(android.content.Context r7) {
        /*
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            r1 = 0
            java.lang.String r2 = "NoInternet"
            android.content.Context r3 = r7.getApplicationContext()     // Catch: all -> 0x0028
            java.lang.String r4 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch: all -> 0x0028
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch: all -> 0x0028
            int r4 = tb.sxq.a(r7, r0)     // Catch: all -> 0x0028
            if (r4 != 0) goto L_0x0089
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0028
            r4 = 23
            if (r0 < r4) goto L_0x002b
            android.net.Network r0 = tb.j7l.a(r3)     // Catch: all -> 0x0028
            if (r0 == 0) goto L_0x004a
            android.net.NetworkInfo r0 = r3.getNetworkInfo(r0)     // Catch: all -> 0x0028
            goto L_0x004b
        L_0x0028:
            r7 = move-exception
            goto L_0x0094
        L_0x002b:
            android.net.NetworkInfo[] r0 = r3.getAllNetworkInfo()     // Catch: all -> 0x0028
            if (r0 == 0) goto L_0x004a
            int r3 = r0.length     // Catch: all -> 0x0028
            r4 = 0
        L_0x0033:
            if (r4 >= r3) goto L_0x004a
            r5 = r0[r4]     // Catch: all -> 0x0028
            if (r5 == 0) goto L_0x0047
            boolean r6 = r5.isAvailable()     // Catch: all -> 0x0028
            if (r6 == 0) goto L_0x0047
            boolean r6 = r5.isConnected()     // Catch: all -> 0x0028
            if (r6 == 0) goto L_0x0047
            r0 = r5
            goto L_0x004b
        L_0x0047:
            int r4 = r4 + 1
            goto L_0x0033
        L_0x004a:
            r0 = r1
        L_0x004b:
            if (r0 == 0) goto L_0x0093
            boolean r3 = r0.isConnected()     // Catch: all -> 0x0028
            if (r3 == 0) goto L_0x0093
            java.lang.String r0 = r0.getTypeName()     // Catch: all -> 0x0028
            java.lang.String r3 = "WIFI"
            boolean r3 = r3.equalsIgnoreCase(r0)     // Catch: all -> 0x0028
            if (r3 == 0) goto L_0x006e
            boolean r7 = O00000oO(r7)     // Catch: all -> 0x0028
            if (r7 == 0) goto L_0x006a
            java.lang.String r7 = "wifi+mobile"
        L_0x0068:
            r2 = r7
            goto L_0x0093
        L_0x006a:
            java.lang.String r7 = "wifi"
            goto L_0x0068
        L_0x006e:
            java.lang.String r3 = "MOBILE"
            boolean r0 = r3.equalsIgnoreCase(r0)     // Catch: all -> 0x0028
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = android.net.Proxy.getDefaultHost()     // Catch: all -> 0x0028
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: all -> 0x0028
            if (r0 == 0) goto L_0x0085
            java.lang.String r7 = O0000Ooo(r7)     // Catch: all -> 0x0028
            goto L_0x0068
        L_0x0085:
            java.lang.String r7 = "wap"
            goto L_0x0068
        L_0x0089:
            int r7 = tb.sxq.a(r7, r0)     // Catch: all -> 0x0028
            r0 = 10
            if (r7 != r0) goto L_0x0093
            java.lang.String r2 = "NoClass"
        L_0x0093:
            return r2
        L_0x0094:
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r7)     // Catch: all -> 0x0098
            return r1
        L_0x0098:
            r7 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.O00000Oo.O0000OoO(android.content.Context):java.lang.String");
    }

    private static String O0000Ooo(Context context) {
        try {
            int subtype = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo().getSubtype();
            if (subtype == 20) {
                return "5g";
            }
            switch (subtype) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return "2g";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return "3g";
                case 13:
                    return "4g";
                default:
                    return "unknow";
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
        if (r1 == 1) goto L_0x0043;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
        if (r1 == 2) goto L_0x0041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
        return 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int O000000o(java.lang.String r6) {
        /*
            r0 = 4
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = -1
            int r2 = r6.hashCode()     // Catch: all -> 0x0025
            r3 = -1350608857(0xffffffffaf7f5827, float:-2.3223433E-10)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L_0x0031
            r3 = 95009260(0x5a9b9ec, float:1.596098E-35)
            if (r2 == r3) goto L_0x0027
            r3 = 880617272(0x347d2738, float:2.3576729E-7)
            if (r2 == r3) goto L_0x001b
            goto L_0x003a
        L_0x001b:
            java.lang.String r2 = "cm_zyhl"
            boolean r6 = r6.equals(r2)     // Catch: all -> 0x0025
            if (r6 == 0) goto L_0x003a
            r1 = 0
            goto L_0x003a
        L_0x0025:
            r6 = move-exception
            goto L_0x0045
        L_0x0027:
            java.lang.String r2 = "cu_xw"
            boolean r6 = r6.equals(r2)     // Catch: all -> 0x0025
            if (r6 == 0) goto L_0x003a
            r1 = 1
            goto L_0x003a
        L_0x0031:
            java.lang.String r2 = "ct_sjl"
            boolean r6 = r6.equals(r2)     // Catch: all -> 0x0025
            if (r6 == 0) goto L_0x003a
            r1 = 2
        L_0x003a:
            if (r1 == 0) goto L_0x0044
            if (r1 == r5) goto L_0x0043
            if (r1 == r4) goto L_0x0041
            return r0
        L_0x0041:
            r6 = 3
            return r6
        L_0x0043:
            return r4
        L_0x0044:
            return r5
        L_0x0045:
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)     // Catch: all -> 0x0049
            return r1
        L_0x0049:
            r6 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.O00000Oo.O000000o(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O00000Oo(java.lang.String r5) {
        /*
            java.lang.String r0 = "unknown"
            if (r5 != 0) goto L_0x0006
            return r0
        L_0x0006:
            int r1 = r5.hashCode()     // Catch: all -> 0x0026
            r2 = -1350608857(0xffffffffaf7f5827, float:-2.3223433E-10)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0032
            r2 = 95009260(0x5a9b9ec, float:1.596098E-35)
            if (r1 == r2) goto L_0x0028
            r2 = 880617272(0x347d2738, float:2.3576729E-7)
            if (r1 == r2) goto L_0x001c
            goto L_0x003c
        L_0x001c:
            java.lang.String r1 = "cm_zyhl"
            boolean r5 = r5.equals(r1)     // Catch: all -> 0x0026
            if (r5 == 0) goto L_0x003c
            r5 = 0
            goto L_0x003d
        L_0x0026:
            r5 = move-exception
            goto L_0x004d
        L_0x0028:
            java.lang.String r1 = "cu_xw"
            boolean r5 = r5.equals(r1)     // Catch: all -> 0x0026
            if (r5 == 0) goto L_0x003c
            r5 = 1
            goto L_0x003d
        L_0x0032:
            java.lang.String r1 = "ct_sjl"
            boolean r5 = r5.equals(r1)     // Catch: all -> 0x0026
            if (r5 == 0) goto L_0x003c
            r5 = 2
            goto L_0x003d
        L_0x003c:
            r5 = -1
        L_0x003d:
            if (r5 == 0) goto L_0x004a
            if (r5 == r4) goto L_0x0047
            if (r5 == r3) goto L_0x0044
            return r0
        L_0x0044:
            java.lang.String r5 = "CTCC"
            return r5
        L_0x0047:
            java.lang.String r5 = "CUCC"
            return r5
        L_0x004a:
            java.lang.String r5 = "CMCC"
            return r5
        L_0x004d:
            r0 = 0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r5)     // Catch: all -> 0x0052
            return r0
        L_0x0052:
            r5 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.O00000Oo.O00000Oo(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O00000o0(java.lang.String r5) {
        /*
            java.lang.String r0 = "unknown"
            if (r5 != 0) goto L_0x0006
            return r0
        L_0x0006:
            int r1 = r5.hashCode()     // Catch: all -> 0x0026
            r2 = -1350608857(0xffffffffaf7f5827, float:-2.3223433E-10)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0032
            r2 = 95009260(0x5a9b9ec, float:1.596098E-35)
            if (r1 == r2) goto L_0x0028
            r2 = 880617272(0x347d2738, float:2.3576729E-7)
            if (r1 == r2) goto L_0x001c
            goto L_0x003c
        L_0x001c:
            java.lang.String r1 = "cm_zyhl"
            boolean r5 = r5.equals(r1)     // Catch: all -> 0x0026
            if (r5 == 0) goto L_0x003c
            r5 = 0
            goto L_0x003d
        L_0x0026:
            r5 = move-exception
            goto L_0x004d
        L_0x0028:
            java.lang.String r1 = "cu_xw"
            boolean r5 = r5.equals(r1)     // Catch: all -> 0x0026
            if (r5 == 0) goto L_0x003c
            r5 = 1
            goto L_0x003d
        L_0x0032:
            java.lang.String r1 = "ct_sjl"
            boolean r5 = r5.equals(r1)     // Catch: all -> 0x0026
            if (r5 == 0) goto L_0x003c
            r5 = 2
            goto L_0x003d
        L_0x003c:
            r5 = -1
        L_0x003d:
            if (r5 == 0) goto L_0x004a
            if (r5 == r4) goto L_0x0047
            if (r5 == r3) goto L_0x0044
            return r0
        L_0x0044:
            java.lang.String r5 = "46003"
            return r5
        L_0x0047:
            java.lang.String r5 = "46001"
            return r5
        L_0x004a:
            java.lang.String r5 = "46000"
            return r5
        L_0x004d:
            r0 = 0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r5)     // Catch: all -> 0x0052
            return r0
        L_0x0052:
            r5 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.gatewayauth.utils.O00000Oo.O00000o0(java.lang.String):java.lang.String");
    }

    public static boolean O00000oo(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimState() == 5;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static String O000000o() {
        try {
            return O000000o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static String O000000o(Context context, boolean z) {
        try {
            if (System.currentTimeMillis() - O00000o0 <= 500) {
                if (O00000Oo != null) {
                    if (!z) {
                    }
                    return O00000Oo;
                }
            }
            O00000Oo = O0000OoO(context);
            O00000o0 = System.currentTimeMillis();
            return O00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
