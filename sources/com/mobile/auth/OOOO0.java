package com.mobile.auth;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.HashSet;
import org.json.JSONObject;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class OOOO0 {
    private static final char[] O000000o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static int O00000Oo = 1;
    private static int O00000o0 = 0;

    public static String O000000o() {
        try {
            return OOOO00O.O00000o();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static int O00000Oo(Context context) {
        try {
            int O00000o = O00000o(context);
            OOOO00O.O000000o(O00000o);
            return O00000o;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static int O00000o() {
        try {
            return O00000Oo;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static int O00000o0() {
        try {
            O00000o0 = 0;
            O00000Oo = 0;
            return 0;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static int O00000oO() {
        try {
            return O00000o0;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static int O00000oo() {
        try {
            int i = O00000o0;
            if (i < 0 || i > O00000Oo) {
                return O00000Oo;
            }
            int i2 = i + 1;
            O00000o0 = i2;
            return i2;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static String O0000O0o() {
        int i;
        try {
            if (OOOO00O.O00000o != null) {
                return OO0OOOO.O000000o();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (true) {
                    if (!networkInterfaces.hasMoreElements()) {
                        break;
                    }
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if (!nextElement.isVirtual() && nextElement.isUp()) {
                        Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            InetAddress nextElement2 = inetAddresses.nextElement();
                            if (!nextElement2.isLoopbackAddress() && !nextElement2.isLinkLocalAddress() && !nextElement2.isMulticastAddress() && !nextElement2.isAnyLocalAddress()) {
                                if (nextElement2 instanceof Inet4Address) {
                                    hashSet.add(nextElement2.getHostAddress());
                                }
                                if (nextElement2 instanceof Inet6Address) {
                                    String hostAddress = nextElement2.getHostAddress();
                                    if (hostAddress.contains(f7l.MOD)) {
                                        hostAddress = hostAddress.substring(0, hostAddress.indexOf(f7l.MOD));
                                    }
                                    hashSet2.add(hostAddress);
                                }
                            }
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    Object[] array = hashSet.toArray();
                    int min = Math.min(array.length, 5);
                    for (int i2 = 0; i2 < min; i2++) {
                        sb.append((String) array[i2]);
                        if (i2 < min - 1) {
                            sb.append("-");
                        }
                    }
                    "&private_ip=".concat(String.valueOf(sb));
                    jSONObject.put("privateIp", sb.toString());
                }
                if (hashSet2.size() > 0) {
                    Object[] array2 = hashSet2.toArray();
                    int min2 = Math.min(array2.length, 5);
                    for (i = 0; i < min2; i++) {
                        sb2.append((String) array2[i]);
                        if (i < min2 - 1) {
                            sb2.append("-");
                        }
                    }
                    "&private_ip_v6=".concat(String.valueOf(sb2));
                    jSONObject.put("privateIp_v6", sb2.toString());
                }
                if (sb.length() != 0) {
                    return jSONObject.toString();
                }
                return "{\"privateIp\":\"0.0.0.0\"}";
            } catch (Exception unused) {
                return "{\"privateIp\":\"0.0.0.0\"}";
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O000000o(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static int O00000Oo(String str) {
        try {
            try {
                byte[] address = InetAddress.getByName(str).getAddress();
                return (address[0] & 255) | ((address[3] & 255) << 24) | ((address[2] & 255) << 16) | ((address[1] & 255) << 8);
            } catch (UnknownHostException unused) {
                return -1;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    private static int O00000o(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            try {
                connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                OOO.O00000o0("android Build.VERSION:" + Build.VERSION.SDK_INT);
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (Exception unused) {
                OOO.O00000Oo();
            }
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.getType() != 1) {
                    if (activeNetworkInfo.getType() == 0) {
                        OOO.O00000o0("Only Data");
                        String extraInfo = activeNetworkInfo.getExtraInfo();
                        if (TextUtils.isEmpty(extraInfo)) {
                            return 0;
                        }
                        OOOO00O.O00000o(extraInfo);
                        OOOO00O.O000000o(OOOO00O.O00000oO(extraInfo));
                        return 0;
                    }
                    return -1;
                } else if (O000000o(connectivityManager)) {
                    OOO.O00000o0("Data and WIFI");
                    return 1;
                } else {
                    OOO.O00000o0("Only WIFI");
                    return 2;
                }
            }
            return -1;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return -1;
        }
    }

    public static String O00000o0(Context context) {
        try {
            return (String) context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0));
        } catch (Exception unused) {
            return "";
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O000000o(Context context, String str, String str2) {
        String str3;
        try {
            try {
                return O000000o(O000000o(context, str), str2.toLowerCase());
            } catch (Exception unused) {
                OOO.O00000Oo();
                return str3;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static String O00000Oo(String str, String str2, String str3) {
        try {
            return OO0o0.O000000o(str, str2, str3);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O00000o0(String str) {
        try {
            OOO.O00000Oo(str);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static String O000000o(String str) {
        try {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA256");
                instance.update(str.getBytes());
                byte[] digest = instance.digest();
                StringBuffer stringBuffer = new StringBuffer("");
                for (int i = 0; i < digest.length; i++) {
                    int i2 = digest[i];
                    if (i2 < 0) {
                        i2 += 256;
                    }
                    if (i2 < 16) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(Integer.toHexString(i2));
                }
                return stringBuffer.toString();
            } catch (NoSuchAlgorithmException unused) {
                OOO.O00000Oo();
                return "";
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public static void O00000Oo() {
        try {
            OOO.O000000o();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static String O000000o(String str, String str2, String str3) {
        try {
            return OO0o0.O00000Oo(str, str2, str3);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    private static String O000000o(byte[] bArr, String str) {
        try {
            try {
                byte[] digest = MessageDigest.getInstance(str).digest(bArr);
                String str2 = "";
                for (int i = 0; i < digest.length; i++) {
                    if (i != 0) {
                        str2 = str2 + ":";
                    }
                    String hexString = Integer.toHexString(digest[i] & 255);
                    if (hexString.length() == 1) {
                        str2 = str2 + "0";
                    }
                    str2 = str2 + hexString;
                }
                return str2;
            } catch (Exception unused) {
                OOO.O00000Oo();
                return "";
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    private static boolean O000000o(ConnectivityManager connectivityManager) {
        try {
            try {
                Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
            } catch (Exception unused) {
                OOO.O00000Oo();
                return true;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return false;
        }
    }

    private static byte[] O000000o(Context context, String str) {
        try {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                if (packageInfo.packageName.equals(str)) {
                    return packageInfo.signatures[0].toByteArray();
                }
                return null;
            } catch (Exception unused) {
                OOO.O00000Oo();
                return null;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }
}
