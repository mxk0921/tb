package com.loc;

import android.app.Application;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.DPoint;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;
import tb.p78;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fy {

    /* renamed from: a  reason: collision with root package name */
    static WifiManager f5714a;
    private static int b;
    private static String[] c;
    private static String d;

    public static double a(double d2) {
        return b(d2);
    }

    public static double b(double d2) {
        return ((long) (d2 * 1000000.0d)) / 1000000.0d;
    }

    public static double c(double d2) {
        return ((long) (d2 * 100.0d)) / 100.0d;
    }

    public static float d(String str) throws NumberFormatException {
        return Float.parseFloat(str);
    }

    public static int e(String str) throws NumberFormatException {
        return Integer.parseInt(str);
    }

    public static int f(String str) throws NumberFormatException {
        return Integer.parseInt(str, 16);
    }

    public static byte g(String str) throws NumberFormatException {
        return Byte.parseByte(str);
    }

    public static String h(Context context) {
        NetworkInfo c2 = c(context);
        if (c2 == null || !c2.isConnectedOrConnecting()) {
            return "DISCONNECTED";
        }
        int type = c2.getType();
        if (type == 1) {
            return "WIFI";
        }
        if (type != 0) {
            return "UNKNOWN";
        }
        String subtypeName = c2.getSubtypeName();
        switch (c2.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "2G";
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
                return "3G";
            case 13:
                return "4G";
            default:
                if (!NetUtil.TYPE_GSM.equalsIgnoreCase(subtypeName)) {
                    if (!"TD-SCDMA".equalsIgnoreCase(subtypeName) && !"WCDMA".equalsIgnoreCase(subtypeName) && !"CDMA2000".equalsIgnoreCase(subtypeName)) {
                        return subtypeName;
                    }
                    return "3G";
                }
                return "2G";
        }
    }

    public static String i(Context context) {
        String h = o.h();
        if (TextUtils.isEmpty(h) || h.equals("00:00:00:00:00:00")) {
            h = fx.a(context);
        }
        if (TextUtils.isEmpty(h)) {
            return "00:00:00:00:00:00";
        }
        return h;
    }

    public static boolean j(Context context) {
        if (Build.VERSION.SDK_INT < 28 || context.getApplicationInfo().targetSdkVersion < 28) {
            return false;
        }
        return true;
    }

    public static boolean k(Context context) {
        ServiceInfo serviceInfo;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.amap.api.location.APSService"), 128);
        } catch (Throwable unused) {
            serviceInfo = null;
        }
        if (serviceInfo == null) {
            return false;
        }
        return true;
    }

    public static String l(Context context) {
        if (d == null) {
            d = fg.a("MD5", l.c(context));
        }
        return d;
    }

    public static boolean m(Context context) {
        try {
            if (!o(context)) {
                if (!n(context)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean n(Context context) {
        return h("vivo") && p(context) && q(context);
    }

    private static boolean o(Context context) {
        int checkSelfPermission;
        int checkSelfPermission2;
        try {
            if (Build.VERSION.SDK_INT < 31 || context == null) {
                return false;
            }
            checkSelfPermission = context.checkSelfPermission(p78.ACCESS_FINE_LOCATION);
            if (checkSelfPermission == 0) {
                return false;
            }
            checkSelfPermission2 = context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION");
            if (checkSelfPermission2 == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean p(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        try {
            int i = Build.VERSION.SDK_INT;
            int i2 = context.getApplicationInfo().targetSdkVersion;
            if (i == 30) {
                z = true;
            } else {
                z = false;
            }
            if (i2 >= 23) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i == 31) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i2 > 30 || i2 < 23) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z || !z2) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z3 || !z4) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z5 || z6) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static float a(float f) {
        return (float) (((long) (f * 100.0d)) / 100.0d);
    }

    public static int b(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i |= (bArr[i2] & 255) << ((1 - i2) * 8);
        }
        return i;
    }

    public static double c(String str) throws NumberFormatException {
        return Double.parseDouble(str);
    }

    public static int d() {
        return new Random().nextInt(65536) - 32768;
    }

    public static String e() {
        try {
            return p.b("S128DF1572465B890OE3F7A13167KLEI".getBytes("UTF-8")).substring(20);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean f(Context context) {
        int i;
        if (context.getApplicationInfo().targetSdkVersion < 29 || Build.VERSION.SDK_INT < 29) {
            return true;
        }
        try {
            i = fu.b(((Application) context).getBaseContext(), "checkSelfPermission", er.G);
        } catch (Throwable unused) {
            i = 0;
        }
        return i == 0;
    }

    public static boolean g(Context context) {
        boolean z;
        if (context == null) {
            return true;
        }
        if (f5714a == null) {
            f5714a = (WifiManager) a(context, "wifi");
        }
        if (c(context, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
            z = f5714a.isWifiEnabled();
            if (z && c() > 17) {
                try {
                    return "true".equals(String.valueOf(fu.a(f5714a, "isScanAlwaysAvailable", new Object[0])));
                } catch (Throwable unused) {
                    return z;
                }
            }
        } else {
            fr.a(new Exception("n_aws"), "OPENSDK_UTS", "iwfal_n_aws");
            z = false;
            return z ? z : z;
        }
    }

    private static boolean h(String str) {
        try {
            String str2 = Build.MANUFACTURER;
            String str3 = Build.BRAND;
            if (!str2.equalsIgnoreCase(str)) {
                if (!str3.toLowerCase().contains(str)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean q(Context context) {
        Cursor cursor;
        boolean z = false;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.vivo.permissionmanager.provider.permission/fuzzy_location_apps"), new String[]{"package_name", "selected_fuzzy"}, "package_name=?", new String[]{context.getPackageName()}, null);
            boolean z2 = false;
            while (cursor != null) {
                try {
                    if (!cursor.moveToNext()) {
                        break;
                    } else if (cursor.getString(0) != null && cursor.getInt(1) == 1) {
                        z2 = true;
                    }
                } catch (Throwable unused) {
                    z = z2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    return z;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return z2;
        } catch (Throwable unused2) {
            cursor = null;
        }
    }

    public static float a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        return a(new double[]{aMapLocation.getLatitude(), aMapLocation.getLongitude(), aMapLocation2.getLatitude(), aMapLocation2.getLongitude()});
    }

    public static long b() {
        return SystemClock.elapsedRealtime();
    }

    public static int c() {
        int i = b;
        if (i > 0) {
            return i;
        }
        try {
            try {
                return fu.b("android.os.Build$VERSION", "SDK_INT");
            } catch (Throwable unused) {
                return 0;
            }
        } catch (Throwable unused2) {
            return Integer.parseInt(fu.a("android.os.Build$VERSION", "SDK").toString());
        }
    }

    public static boolean d(Context context) {
        try {
            NetworkInfo c2 = c(context);
            if (c2 != null) {
                if (c2.isConnectedOrConnecting()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean e(Context context) {
        int i;
        if (Build.VERSION.SDK_INT < 23 || context.getApplicationInfo().targetSdkVersion < 23) {
            for (String str : er.F) {
                if (context.checkCallingOrSelfPermission(str) == 0) {
                }
            }
            return true;
        }
        Application application = (Application) context;
        for (String str2 : er.F) {
            try {
                i = fu.b(application.getBaseContext(), "checkSelfPermission", str2);
            } catch (Throwable unused) {
                i = 0;
            }
            if (i == 0) {
            }
        }
        return true;
        return false;
    }

    public static float a(DPoint dPoint, DPoint dPoint2) {
        return a(new double[]{dPoint.getLatitude(), dPoint.getLongitude(), dPoint2.getLatitude(), dPoint2.getLongitude()});
    }

    private static FileInputStream b(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (file.canRead()) {
            return new FileInputStream(file);
        } else {
            throw new IOException("File '" + file + "' cannot be read");
        }
    }

    public static NetworkInfo c(Context context) {
        try {
            return o.k(context);
        } catch (Throwable th) {
            fr.a(th, "Utils", "getNetWorkInfo");
            return null;
        }
    }

    private static boolean d(Context context, String str) throws Throwable {
        return ((Integer) fu.a(str, "getInt", new Object[]{context.getContentResolver(), ((String) fu.a(str, "AIRPLANE_MODE_ON")).toString()}, new Class[]{ContentResolver.class, String.class})).intValue() == 1;
    }

    public static float a(double[] dArr) {
        float[] fArr = new float[1];
        Location.distanceBetween(dArr[0], dArr[1], dArr[2], dArr[3], fArr);
        return fArr[0];
    }

    public static String b(Context context) {
        PackageInfo packageInfo;
        if (!TextUtils.isEmpty(fr.j)) {
            return fr.j;
        }
        CharSequence charSequence = null;
        if (context == null) {
            return null;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(l.c(context), 64);
        } catch (Throwable th) {
            fr.a(th, "Utils", "getAppName part");
            packageInfo = null;
        }
        try {
            if (TextUtils.isEmpty(fr.k)) {
                fr.k = null;
            }
        } catch (Throwable th2) {
            fr.a(th2, "Utils", "getAppName");
        }
        StringBuilder sb = new StringBuilder();
        if (packageInfo != null) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                charSequence = applicationInfo.loadLabel(context.getPackageManager());
            }
            if (charSequence != null) {
                sb.append(charSequence.toString());
            }
            if (!TextUtils.isEmpty(packageInfo.versionName)) {
                sb.append(packageInfo.versionName);
            }
        }
        String c2 = l.c(context);
        if (!TextUtils.isEmpty(c2)) {
            sb.append(",");
            sb.append(c2);
        }
        if (!TextUtils.isEmpty(fr.k)) {
            sb.append(",");
            sb.append(fr.k);
        }
        String sb2 = sb.toString();
        fr.j = sb2;
        return sb2;
    }

    private static FileOutputStream c(File file) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                if (parentFile.mkdirs() || parentFile.isDirectory()) {
                    file.createNewFile();
                } else {
                    throw new IOException("Directory '" + parentFile + "' could not be created");
                }
            }
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (!file.canWrite()) {
            throw new IOException("File '" + file + "' cannot be written to");
        }
        return new FileOutputStream(file, false);
    }

    public static int a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected()) {
            return networkInfo.getType();
        }
        return -1;
    }

    public static ArrayList<String> b(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("#");
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains(",nb") || split[i].contains(",access")) {
                    arrayList.add(split[i]);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r4.checkCallingOrSelfPermission(com.loc.x.c(r5)) == 0) goto L_0x0014;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r4 == 0) goto L_0x0014;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0023
            r2 = 23
            r3 = 1
            if (r1 < r2) goto L_0x0016
            if (r4 == 0) goto L_0x0023
            java.lang.String r5 = com.loc.x.c(r5)     // Catch: all -> 0x0023
            int r4 = tb.o9k.a(r4, r5)     // Catch: all -> 0x0023
            if (r4 != 0) goto L_0x0023
        L_0x0014:
            r0 = 1
            goto L_0x0023
        L_0x0016:
            if (r4 == 0) goto L_0x0023
            java.lang.String r5 = com.loc.x.c(r5)     // Catch: all -> 0x0023
            int r4 = r4.checkCallingOrSelfPermission(r5)     // Catch: all -> 0x0023
            if (r4 != 0) goto L_0x0023
            goto L_0x0014
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fy.c(android.content.Context, java.lang.String):boolean");
    }

    public static long a() {
        return System.currentTimeMillis();
    }

    public static boolean b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(str, 256);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static Object a(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getApplicationContext().getSystemService(str);
        } catch (Throwable th) {
            fr.a(th, "Utils", "getServ");
            return null;
        }
    }

    public static boolean b(AMapLocation aMapLocation) {
        double longitude = aMapLocation.getLongitude();
        double latitude = aMapLocation.getLatitude();
        return !(longitude == vu3.b.GEO_NOT_SUPPORT && latitude == vu3.b.GEO_NOT_SUPPORT) && longitude <= 180.0d && latitude <= 90.0d && longitude >= -180.0d && latitude >= -90.0d;
    }

    public static String a(int i) {
        if (i == 33) {
            return "补偿定位失败，未命中缓存";
        }
        switch (i) {
            case 0:
                return "success";
            case 1:
                return "重要参数为空";
            case 2:
                return "WIFI信息不足";
            case 3:
                return "请求参数获取出现异常";
            case 4:
                return "网络连接异常";
            case 5:
                return "解析数据异常";
            case 6:
                return "定位结果错误";
            case 7:
                return "KEY错误";
            case 8:
                return "其他错误";
            case 9:
                return "初始化异常";
            case 10:
                return "定位服务启动失败";
            case 11:
                return "错误的基站信息，请检查是否插入SIM卡";
            case 12:
                return "缺少定位权限";
            case 13:
                return "网络定位失败，请检查设备是否插入sim卡，是否开启移动网络或开启了wifi模块";
            case 14:
                return "GPS 定位失败，由于设备当前 GPS 状态差,建议持设备到相对开阔的露天场所再次尝试";
            case 15:
                return "当前返回位置为模拟软件返回，请关闭模拟软件，或者在option中设置允许模拟";
            default:
                switch (i) {
                    case 18:
                        return "定位失败，飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关";
                    case 19:
                        return "定位失败，没有检查到SIM卡，并且关闭了WIFI开关，请打开WIFI开关或者插入SIM卡";
                    case 20:
                        return "模糊定位失败，具体可查看错误信息/详细信息描述";
                    default:
                        return "其他错误";
                }
        }
    }

    public static byte[] b(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            bArr = new byte[4];
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(long r4, java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0009
            java.lang.String r6 = "yyyy-MM-dd HH:mm:ss"
        L_0x0009:
            r0 = 0
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: all -> 0x0018
            java.util.Locale r2 = java.util.Locale.CHINA     // Catch: all -> 0x0018
            r1.<init>(r6, r2)     // Catch: all -> 0x0018
            r1.applyPattern(r6)     // Catch: all -> 0x0015
            goto L_0x0021
        L_0x0015:
            r6 = move-exception
            r0 = r1
            goto L_0x0019
        L_0x0018:
            r6 = move-exception
        L_0x0019:
            java.lang.String r1 = "Utils"
            java.lang.String r2 = "formatUTC"
            com.loc.fr.a(r6, r1, r2)
            r1 = r0
        L_0x0021:
            r2 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x002b
            long r4 = a()
        L_0x002b:
            if (r1 != 0) goto L_0x0030
            java.lang.String r4 = "NULL"
            return r4
        L_0x0030:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = r1.format(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fy.a(long, java.lang.String):java.lang.String");
    }

    public static String a(Context context, TelephonyManager telephonyManager) {
        int i = 0;
        if (telephonyManager != null) {
            try {
                if (context.getApplicationInfo().targetSdkVersion < 29 && Build.VERSION.SDK_INT < 30) {
                    i = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(telephonyManager);
                }
            } catch (Throwable unused) {
            }
        }
        switch (i) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return "CDMA";
            case 5:
                return "EVDO_0";
            case 6:
                return "EVDO_A";
            case 7:
                return "1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "IDEN";
            case 12:
                return "EVDO_B";
            case 13:
                return "LTE";
            case 14:
                return "EHRPD";
            case 15:
                return "HSPAP";
            default:
                return "UNKWN";
        }
    }

    public static List<String> a(File file) {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            try {
                fileInputStream = b(file);
                try {
                    inputStreamReader = new InputStreamReader(fileInputStream, Charset.defaultCharset());
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                arrayList.add(readLine);
                            } catch (Throwable unused) {
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                return arrayList;
                            }
                        }
                        bufferedReader2.close();
                        inputStreamReader.close();
                        fileInputStream.close();
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    inputStreamReader = null;
                }
            } catch (Throwable unused4) {
                fileInputStream = null;
                inputStreamReader = null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static void a(File file, String str) {
        String str2 = null;
        try {
            try {
                str2 = c(file);
                if (str2 != null) {
                    str2.write(str2.getBytes());
                }
            } catch (IOException e) {
                e.printStackTrace();
                if (str2 != null) {
                    try {
                        str2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        } finally {
            if (str2 != null) {
                try {
                    str2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return c() < 17 ? d(context, "android.provider.Settings$System") : d(context, "android.provider.Settings$Global");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor;
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String replace = "2.0.201501131131".replace(".", "");
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.isOpen()) {
                    cursor = sQLiteDatabase.query("sqlite_master", new String[]{"count(*) as c"}, "type = 'table' AND name = '" + str.trim() + replace + "'", null, null, null, null);
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                if (cursor.getInt(0) > 0) {
                                    z = true;
                                }
                            }
                        } catch (Throwable unused) {
                            if (cursor == null) {
                                return true;
                            }
                            cursor.close();
                            return true;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return z;
                }
            } catch (Throwable unused2) {
                cursor = null;
            }
        }
        return false;
    }

    public static boolean a(Location location, int i) {
        boolean z;
        Bundle extras;
        try {
            z = location.isFromMockProvider();
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            return true;
        }
        try {
            extras = location.getExtras();
        } catch (Throwable unused2) {
        }
        if ((extras != null ? extras.getInt("satellites") : 0) <= 0) {
            return true;
        }
        if (i == 0 && location.getAltitude() == vu3.b.GEO_NOT_SUPPORT && location.getBearing() == 0.0f) {
            if (location.getSpeed() == 0.0f) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(AMapLocation aMapLocation) {
        if (aMapLocation != null && aMapLocation.getErrorCode() == 0) {
            return b(aMapLocation);
        }
        return false;
    }

    public static boolean a(ew ewVar) {
        if (ewVar != null && !"8".equals(ewVar.d()) && !"5".equals(ewVar.d()) && !"6".equals(ewVar.d())) {
            return b(ewVar);
        }
        return false;
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && !"00:00:00:00:00:00".equals(str) && !"02:00:00:00:00:00".equals(str) && !str.contains(" :");
    }

    public static boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ArrayList<String> b2 = b(str);
            String[] split = str2.toString().split("#");
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < split.length; i3++) {
                if (split[i3].contains(",nb") || split[i3].contains(",access")) {
                    i++;
                    if (b2.contains(split[i3])) {
                        i2++;
                    }
                }
            }
            if (i2 * 2 >= (b2.size() + i) * 0.618d) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject, String str) {
        return x.a(jSONObject, str);
    }

    public static byte[] a(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            bArr = new byte[2];
        }
        bArr[0] = (byte) (i & 255);
        bArr[1] = (byte) ((i & 65280) >> 8);
        return bArr;
    }

    public static byte[] a(long j) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((j >> (i * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] a(byte[] bArr) {
        return x.b(bArr);
    }

    public static String[] a(TelephonyManager telephonyManager) {
        int i;
        String[] strArr;
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        String[] strArr2 = {"0", "0"};
        if (!TextUtils.isEmpty(networkOperator) && TextUtils.isDigitsOnly(networkOperator) && networkOperator.length() > 4) {
            strArr2[0] = networkOperator.substring(0, 3);
            char[] charArray = networkOperator.substring(3).toCharArray();
            int i2 = 0;
            while (i2 < charArray.length && Character.isDigit(charArray[i2])) {
                i2++;
            }
            strArr2[1] = networkOperator.substring(3, i2 + 3);
        }
        try {
            i = Integer.parseInt(strArr2[0]);
        } catch (Throwable th) {
            fr.a(th, "Utils", "getMccMnc");
            i = 0;
        }
        if (i == 0) {
            strArr2[0] = "0";
        }
        if ("0".equals(strArr2[0]) || "0".equals(strArr2[1])) {
            return (!"0".equals(strArr2[0]) || !"0".equals(strArr2[1]) || (strArr = c) == null) ? strArr2 : strArr;
        }
        c = strArr2;
        return strArr2;
    }
}
