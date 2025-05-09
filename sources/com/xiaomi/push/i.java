package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.C1180n;
import com.xiaomi.channel.commonutils.logger.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static String f14944a = null;

    /* renamed from: a  reason: collision with other field name */
    private static final Set<String> f1125a;
    private static String b = null;
    private static String c = "";
    private static String d;
    private static String e;
    private static final String f = String.valueOf((char) 2);

    /* renamed from: a  reason: collision with other field name */
    private static final String[] f1127a = {"--", "a-", "u-", "v-", "o-", "g-", "d-"};

    /* renamed from: a  reason: collision with other field name */
    private static boolean f1126a = true;

    private static double a(double d2) {
        int i = 1;
        while (true) {
            double d3 = i;
            if (d3 >= d2) {
                return d3;
            }
            i <<= 1;
        }
    }

    public static int b() {
        BufferedReader bufferedReader;
        Throwable th;
        String[] split;
        if (new File("/proc/meminfo").exists()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
                } catch (IOException unused) {
                }
                try {
                    String readLine = bufferedReader.readLine();
                    if (!TextUtils.isEmpty(readLine) && (split = readLine.split("\\s+")) != null && split.length >= 2 && TextUtils.isDigitsOnly(split[1])) {
                        Integer.parseInt(split[1]);
                    }
                    bufferedReader.close();
                } catch (Exception unused2) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused4) {
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        }
        return 0;
    }

    public static String c() {
        return b() + "KB";
    }

    public static String d() {
        long a2 = a(Environment.getDataDirectory());
        return (a2 / 1024) + "KB";
    }

    @Deprecated
    public static String e(Context context) {
        return null;
    }

    @Deprecated
    public static String f(Context context) {
        return "";
    }

    public static synchronized String g(Context context) {
        synchronized (i.class) {
            String str = e;
            if (str != null) {
                return str;
            }
            String b2 = b(context);
            String a2 = a(context);
            String b3 = bm.b(b2 + a2);
            e = b3;
            return b3;
        }
    }

    public static synchronized String h(Context context) {
        String b2;
        synchronized (i.class) {
            String b3 = b(context);
            b2 = bm.b(b3 + ((String) null));
        }
        return b2;
    }

    public static String i(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    @Deprecated
    private static String j(Context context) {
        return "";
    }

    private static String k(Context context) {
        String string = context.getSharedPreferences("device_info", 0).getString("default_id", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String l = l(context);
        a(context, l);
        return l;
    }

    private static String l(Context context) {
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        int i = Build.VERSION.SDK_INT;
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.INCREMENTAL;
        int a2 = a();
        String packageName = context.getPackageName();
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = bm.a(16);
        return bj.a(str + "_" + str2 + "_" + i + "_" + str3 + "_" + str4 + "_" + a2 + "_" + packageName + "_" + currentTimeMillis + "_" + a3);
    }

    static {
        HashSet hashSet = new HashSet();
        f1125a = hashSet;
        hashSet.add("com.xiaomi.xmsf");
        hashSet.add("com.xiaomi.finddevice");
        hashSet.add("com.miui.securitycenter");
    }

    private static float a(int i) {
        float f2 = (((((i + C1180n.b) / 524288) + 1) * 524288) / 1024.0f) / 1024.0f;
        double d2 = f2;
        return d2 > 0.5d ? (float) Math.ceil(d2) : f2;
    }

    /* renamed from: b  reason: collision with other method in class */
    public static String m780b() {
        double a2 = a(((a(Environment.getDataDirectory()) / 1024.0d) / 1024.0d) / 1024.0d);
        return a2 + "GB";
    }

    @Deprecated
    public static String c(Context context) {
        return null;
    }

    @Deprecated
    public static String d(Context context) {
        return null;
    }

    public static int a() {
        Object a2 = bh.a("android.os.UserHandle", "myUserId", new Object[0]);
        if (a2 == null) {
            return -1;
        }
        return ((Integer) Integer.class.cast(a2)).intValue();
    }

    public static String b(Context context) {
        String str = b;
        if (str != null || !f1126a) {
            return str;
        }
        boolean c2 = m782c(context);
        f1126a = c2;
        if (!c2) {
            return null;
        }
        try {
            b = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            b.m410a("failure to get androidId: " + th);
        }
        return b;
    }

    /* renamed from: c  reason: collision with other method in class */
    private static boolean m782c(Context context) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            return true;
        }
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.xiaomi.push.service.XMPushService");
        intent.setComponent(componentName);
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(componentName, 128).metaData;
            if (bundle != null) {
                String string = bundle.getString("supportGetAndroidID");
                if (TextUtils.isEmpty(string)) {
                    return true;
                }
                return Boolean.parseBoolean(string);
            }
        } catch (Exception unused) {
        }
        return true;
    }

    private static long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m781b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m776a() {
        return a(b()) + "GB";
    }

    private static boolean b(String str) {
        if (str == null) {
            return true;
        }
        String trim = str.trim();
        return trim.length() == 0 || trim.equalsIgnoreCase("null") || trim.equalsIgnoreCase("unknown");
    }

    /* renamed from: a  reason: collision with other method in class */
    private static String m777a(int i) {
        if (i > 0) {
            String[] strArr = f1127a;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return f1127a[0];
    }

    @Deprecated
    public static String a(Context context) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x0017, B:13:0x0020, B:14:0x0025, B:17:0x0030, B:19:0x0036, B:22:0x003d, B:24:0x004b, B:25:0x005c, B:27:0x006a, B:30:0x0075, B:33:0x007d, B:34:0x0083, B:35:0x0096, B:37:0x00a8, B:38:0x00ab, B:39:0x00c4), top: B:44:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x0017, B:13:0x0020, B:14:0x0025, B:17:0x0030, B:19:0x0036, B:22:0x003d, B:24:0x004b, B:25:0x005c, B:27:0x006a, B:30:0x0075, B:33:0x007d, B:34:0x0083, B:35:0x0096, B:37:0x00a8, B:38:0x00ab, B:39:0x00c4), top: B:44:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.String a(android.content.Context r6, boolean r7) {
        /*
            java.lang.String r0 = "devid rule select:"
            java.lang.Class<com.xiaomi.push.i> r1 = com.xiaomi.push.i.class
            monitor-enter(r1)
            java.lang.String r2 = com.xiaomi.push.i.d     // Catch: all -> 0x001d
            if (r2 != 0) goto L_0x00c4
            java.lang.String r2 = b(r6)     // Catch: all -> 0x001d
            java.lang.String r3 = ""
            boolean r4 = com.xiaomi.push.j.m874d()     // Catch: all -> 0x001d
            if (r4 != 0) goto L_0x0025
            if (r7 == 0) goto L_0x0020
            java.lang.String r7 = c(r6)     // Catch: all -> 0x001d
        L_0x001b:
            r3 = r7
            goto L_0x0025
        L_0x001d:
            r6 = move-exception
            goto L_0x00c8
        L_0x0020:
            java.lang.String r7 = j(r6)     // Catch: all -> 0x001d
            goto L_0x001b
        L_0x0025:
            java.lang.String r7 = a(r6)     // Catch: all -> 0x001d
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x001d
            r5 = 26
            if (r4 >= r5) goto L_0x0030
            goto L_0x0083
        L_0x0030:
            boolean r4 = b(r3)     // Catch: all -> 0x001d
            if (r4 == 0) goto L_0x0083
            boolean r4 = b(r7)     // Catch: all -> 0x001d
            if (r4 != 0) goto L_0x003d
            goto L_0x0083
        L_0x003d:
            com.xiaomi.push.ax r7 = com.xiaomi.push.ax.a(r6)     // Catch: all -> 0x001d
            java.lang.String r7 = r7.b()     // Catch: all -> 0x001d
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: all -> 0x001d
            if (r3 != 0) goto L_0x005c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x001d
            r6.<init>()     // Catch: all -> 0x001d
            r6.append(r7)     // Catch: all -> 0x001d
            r6.append(r2)     // Catch: all -> 0x001d
            java.lang.String r2 = r6.toString()     // Catch: all -> 0x001d
            r6 = 2
            goto L_0x0096
        L_0x005c:
            com.xiaomi.push.ax r7 = com.xiaomi.push.ax.a(r6)     // Catch: all -> 0x001d
            java.lang.String r7 = r7.mo506a()     // Catch: all -> 0x001d
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch: all -> 0x001d
            if (r3 != 0) goto L_0x0075
            java.lang.String r3 = "00000000-0000-0000-0000-000000000000"
            boolean r3 = r7.startsWith(r3)     // Catch: all -> 0x001d
            if (r3 != 0) goto L_0x0075
            r6 = 4
            r2 = r7
            goto L_0x0096
        L_0x0075:
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch: all -> 0x001d
            if (r7 != 0) goto L_0x007d
            r6 = 5
            goto L_0x0096
        L_0x007d:
            java.lang.String r2 = k(r6)     // Catch: all -> 0x001d
            r6 = 6
            goto L_0x0096
        L_0x0083:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x001d
            r6.<init>()     // Catch: all -> 0x001d
            r6.append(r3)     // Catch: all -> 0x001d
            r6.append(r2)     // Catch: all -> 0x001d
            r6.append(r7)     // Catch: all -> 0x001d
            java.lang.String r2 = r6.toString()     // Catch: all -> 0x001d
            r6 = 1
        L_0x0096:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: all -> 0x001d
            r7.<init>(r0)     // Catch: all -> 0x001d
            r7.append(r6)     // Catch: all -> 0x001d
            java.lang.String r7 = r7.toString()     // Catch: all -> 0x001d
            com.xiaomi.channel.commonutils.logger.b.b(r7)     // Catch: all -> 0x001d
            r7 = 3
            if (r6 != r7) goto L_0x00ab
            com.xiaomi.push.i.d = r2     // Catch: all -> 0x001d
            goto L_0x00c4
        L_0x00ab:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: all -> 0x001d
            r7.<init>()     // Catch: all -> 0x001d
            java.lang.String r6 = m777a(r6)     // Catch: all -> 0x001d
            r7.append(r6)     // Catch: all -> 0x001d
            java.lang.String r6 = com.xiaomi.push.bm.b(r2)     // Catch: all -> 0x001d
            r7.append(r6)     // Catch: all -> 0x001d
            java.lang.String r6 = r7.toString()     // Catch: all -> 0x001d
            com.xiaomi.push.i.d = r6     // Catch: all -> 0x001d
        L_0x00c4:
            java.lang.String r6 = com.xiaomi.push.i.d     // Catch: all -> 0x001d
            monitor-exit(r1)
            return r6
        L_0x00c8:
            monitor-exit(r1)     // Catch: all -> 0x001d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.i.a(android.content.Context, boolean):java.lang.String");
    }

    private static void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info", 0);
        if (TextUtils.isEmpty(sharedPreferences.getString("default_id", null))) {
            sharedPreferences.edit().putString("default_id", str).apply();
        } else {
            b.m410a("default_id exist,do not change it.");
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m778a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m779a(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo = (PackageInfo) bh.a((Object) context.getPackageManager(), "getPackageInfoAsUser", str, 0, 999);
        return packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 8388608) != 8388608;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = f1127a;
            if (i >= strArr.length) {
                return false;
            }
            if (str.startsWith(strArr[i])) {
                return true;
            }
            i++;
        }
    }
}
