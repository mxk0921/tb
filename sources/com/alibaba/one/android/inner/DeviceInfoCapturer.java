package com.alibaba.one.android.inner;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.os.Parcel;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.alibaba.one.sdk.d;
import com.alibaba.one.sdk.f;
import com.alibaba.one.sdk.g;
import com.alibaba.one.sdk.h;
import com.taobao.orange.OConstant;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.regex.Pattern;
import tb.pg1;

@SuppressLint({"MissingPermission"})
/* loaded from: classes.dex */
public class DeviceInfoCapturer {

    /* renamed from: a  reason: collision with root package name */
    public static ClassLoader f2490a = null;
    private static Context b = null;
    private static TelephonyManager c = null;
    private static WifiManager d = null;
    private static volatile String e = null;
    private static volatile String f = null;
    private static volatile boolean g = false;
    private static Map<Integer, String> h = new HashMap();
    private static Map<Integer, Integer> i = new HashMap();
    private static final List<Integer> j = Arrays.asList(0, 1, 2, 13, 11, 15, 16, 12, 18, 25, 26, 27, 28, 24);
    private static final List<Integer> k = Arrays.asList(25, 26, 27, 28);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }
    }

    private static String a(boolean z) {
        WindowManager windowManager = (WindowManager) b.getSystemService(pg1.ATOM_EXT_window);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!z) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        } else if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
    }

    private static String b() {
        Context context = b;
        try {
            String str = (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", Context.class).invoke(null, context);
            if (str != null) {
                if (!str.isEmpty()) {
                    if (str.contains("?")) {
                    }
                    return str;
                }
            }
            String str2 = (String) Class.forName(OConstant.REFLECT_UTDID).getMethod("getUtdid", Context.class).invoke(null, context);
            try {
                if (str2.contains("?")) {
                    return "";
                }
            } catch (Exception unused) {
            }
            return str2;
        } catch (Exception unused2) {
            return "";
        }
    }

    private static String c() {
        try {
            return h.a(b);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String d() {
        try {
            String string = Settings.Secure.getString(b.getContentResolver(), "android_id");
            return string != null ? string.trim() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String doCommandForString(int i2) {
        if (j.contains(Integer.valueOf(i2))) {
            String str = h.get(Integer.valueOf(i2));
            Integer num = i.get(Integer.valueOf(i2));
            int i3 = k.contains(Integer.valueOf(i2)) ? 2 : 1;
            if (str != null || (num != null && num.intValue() >= i3)) {
                return str;
            }
            i.put(Integer.valueOf(i2), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
        }
        String str2 = null;
        try {
            switch (i2) {
                case 3:
                    str2 = a(false);
                    break;
                case 4:
                    str2 = a(true);
                    break;
                case 5:
                    str2 = n();
                    break;
                case 6:
                    str2 = h();
                    break;
                case 7:
                    str2 = i();
                    break;
                case 8:
                    str2 = k();
                    break;
                case 9:
                    str2 = j();
                    break;
                case 10:
                    str2 = l();
                    break;
                case 12:
                    str2 = g.b();
                    break;
                case 13:
                    str2 = m();
                    break;
                case 17:
                    str2 = f.a();
                    break;
                case 18:
                    str2 = d();
                    break;
                case 19:
                    str2 = o();
                    break;
                case 20:
                    str2 = e();
                    break;
                case 21:
                    str2 = f();
                    break;
                case 22:
                    str2 = g();
                    break;
                case 23:
                    str2 = b();
                    break;
                case 24:
                    str2 = c();
                    break;
                case 25:
                    str2 = e;
                    break;
                case 26:
                    str2 = t();
                    break;
                case 27:
                    str2 = s();
                    break;
                case 28:
                    str2 = f;
                    break;
                case 29:
                    str2 = p();
                    break;
                case 30:
                    str2 = u();
                    break;
                case 31:
                    str2 = v();
                    break;
                case 32:
                    str2 = g.a();
                    break;
            }
        } catch (Exception unused) {
        }
        if (j.contains(Integer.valueOf(i2)) && str2 != null) {
            h.put(Integer.valueOf(i2), str2);
        }
        return str2;
    }

    private static String e() {
        Context context = b;
        if (context != null) {
            try {
                return context.getPackageName();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    private static String f() {
        try {
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 16).versionName;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String g() {
        try {
            PackageInfo packageInfo = b.getPackageManager().getPackageInfo(e(), 64);
            d.a();
            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                return null;
            }
            return d.a(packageInfo.signatures[0].toCharsString());
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static String h() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            return listFiles != null ? String.valueOf(listFiles.length) : "0";
        } catch (Throwable unused) {
            return "1";
        }
    }

    private static String i() {
        String str;
        try {
            String q = q();
            try {
                return q.length() > 0 ? q : r();
            } catch (Throwable unused) {
                return str;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static void initialize(Context context) {
        b = context;
        try {
            f2490a = context.getApplicationContext().getClassLoader();
            c = (TelephonyManager) context.getSystemService("phone");
            d = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            f.a(b);
            Class.forName("com.alibaba.one.android.inner.OneStubCenter$OneNetworkCallback");
            Class.forName("com.alibaba.one.android.inner.OneStubCenter$OneServiceConnection");
        } catch (Throwable unused) {
        }
        g.a(b);
        final Context context2 = b;
        if (context2 != null) {
            try {
                if (("Huawei".equalsIgnoreCase(Build.BRAND) || "honor".equalsIgnoreCase(Build.BRAND)) && Build.VERSION.SDK_INT > 24) {
                    new Thread(new Runnable() { // from class: com.alibaba.one.android.inner.DeviceInfoCapturer.1
                        /* JADX WARN: Finally extract failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
                            ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.alibaba.one.android.inner.DeviceInfoCapturer.1.1
                                @Override // android.content.ServiceConnection
                                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                                    linkedBlockingQueue.offer(iBinder);
                                    if (DeviceInfoCapturer.g) {
                                        Log.e("bindHwService", "onServiceConnected! save iBinder!");
                                    }
                                }

                                @Override // android.content.ServiceConnection
                                public final void onServiceDisconnected(ComponentName componentName) {
                                    if (DeviceInfoCapturer.g) {
                                        Log.e("bindOppoService", "onServiceDisconnected! clean iBinder!");
                                    }
                                    linkedBlockingQueue.clear();
                                }
                            };
                            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
                            intent.setPackage("com.huawei.hwid");
                            if (context2.bindService(intent, serviceConnection, 1)) {
                                Parcel obtain = Parcel.obtain();
                                Parcel obtain2 = Parcel.obtain();
                                String str = null;
                                try {
                                    try {
                                        obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                                        IBinder iBinder = (IBinder) linkedBlockingQueue.take();
                                        if (iBinder != null) {
                                            iBinder.transact(1, obtain, obtain2, 0);
                                            obtain2.readException();
                                            str = obtain2.readString();
                                        }
                                    } catch (Exception e2) {
                                        if (DeviceInfoCapturer.g) {
                                            Log.e("bindHwService", "transact ERROR!", e2);
                                        }
                                    }
                                    obtain2.recycle();
                                    obtain.recycle();
                                    String unused2 = DeviceInfoCapturer.e = str;
                                } catch (Throwable th) {
                                    obtain2.recycle();
                                    obtain.recycle();
                                    throw th;
                                }
                            } else if (DeviceInfoCapturer.g) {
                                Log.e("bindHwService", "bindService ERROR!");
                            }
                        }
                    }).start();
                }
            } catch (Throwable unused2) {
            }
        }
        final Context context3 = b;
        if (context3 != null) {
            try {
                if ("Oppo".equalsIgnoreCase(Build.BRAND) || "Realme".equalsIgnoreCase(Build.BRAND) || "OnePlus".equalsIgnoreCase(Build.BRAND)) {
                    new Thread(new Runnable() { // from class: com.alibaba.one.android.inner.DeviceInfoCapturer.2
                        /* JADX WARN: Can't wrap try/catch for region: R(8:(4:18|59|19|(14:21|(1:23)|61|24|30|(1:32)|33|54|34|(2:36|37)|43|(1:45)|46|47))|54|34|(0)|43|(0)|46|47) */
                        /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
                            r0 = move-exception;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
                            if (com.alibaba.one.android.inner.DeviceInfoCapturer.g != false) goto L_0x00f3;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
                            android.util.Log.e("bindOppoService", "transact ERROR!", r0);
                         */
                        /* JADX WARN: Finally extract failed */
                        /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
                        /* JADX WARN: Removed duplicated region for block: B:36:0x00de A[Catch: all -> 0x00ea, Exception -> 0x00ec, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ec, blocks: (B:34:0x00c8, B:36:0x00de), top: B:54:0x00c8, outer: #2 }] */
                        /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 285
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.one.android.inner.DeviceInfoCapturer.AnonymousClass2.run():void");
                        }
                    }).start();
                }
            } catch (Throwable unused3) {
            }
        }
        UserTrackBridge.init(b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 == null) goto L_0x0038;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String j() {
        /*
            java.lang.String r0 = "0"
            java.lang.String r1 = "/proc/meminfo"
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch: all -> 0x002d
            r3.<init>(r1)     // Catch: all -> 0x002d
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: all -> 0x002a
            r4 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r3, r4)     // Catch: all -> 0x002a
            java.lang.String r2 = r1.readLine()     // Catch: all -> 0x002b
            if (r2 == 0) goto L_0x0023
            java.lang.String r4 = "\\s+"
            java.lang.String[] r2 = r2.split(r4)     // Catch: all -> 0x002b
            int r4 = r2.length     // Catch: all -> 0x002b
            r5 = 1
            if (r4 <= r5) goto L_0x0023
            r0 = r2[r5]     // Catch: all -> 0x002b
        L_0x0023:
            r3.close()     // Catch: all -> 0x0026
        L_0x0026:
            r1.close()     // Catch: all -> 0x0038
            goto L_0x0038
        L_0x002a:
            r1 = r2
        L_0x002b:
            r2 = r3
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch: all -> 0x0034
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            if (r1 == 0) goto L_0x0038
            goto L_0x0026
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.one.android.inner.DeviceInfoCapturer.j():java.lang.String");
    }

    private static String k() {
        long j2;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j2 = statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j2 = 0;
        }
        return String.valueOf(j2);
    }

    private static String l() {
        long j2 = 0;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                j2 = statFs.getBlockSize() * statFs.getBlockCount();
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
        if (r1.hasTransport(3) != false) goto L_0x0076;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
        r0 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
        if (r5 != 9) goto L_0x00a1;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:11:0x002e, B:17:0x003e, B:19:0x0051, B:21:0x005f, B:23:0x0069, B:26:0x0070, B:30:0x007a, B:32:0x0080, B:34:0x0086, B:38:0x0095, B:44:0x00a3), top: B:55:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:11:0x002e, B:17:0x003e, B:19:0x0051, B:21:0x005f, B:23:0x0069, B:26:0x0070, B:30:0x007a, B:32:0x0080, B:34:0x0086, B:38:0x0095, B:44:0x00a3), top: B:55:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m() {
        /*
            r0 = -1
            r1 = 0
            android.content.Context r2 = com.alibaba.one.android.inner.DeviceInfoCapturer.b     // Catch: all -> 0x00a1
            java.lang.String r3 = "phone"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: all -> 0x00a1
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch: all -> 0x00a1
            android.content.Context r3 = com.alibaba.one.android.inner.DeviceInfoCapturer.b     // Catch: all -> 0x00a1
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: all -> 0x00a1
            if (r2 == 0) goto L_0x0038
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x00a1
            r5 = 24
            if (r4 < r5) goto L_0x0033
            java.lang.String r4 = "android.permission.READ_PHONE_STATE"
            android.content.Context r5 = com.alibaba.one.android.inner.DeviceInfoCapturer.b     // Catch: all -> 0x00a1
            java.lang.String r5 = r5.getPackageName()     // Catch: all -> 0x00a1
            int r4 = r3.checkPermission(r4, r5)     // Catch: all -> 0x00a1
            if (r4 != 0) goto L_0x0038
            int r4 = r2.getNetworkType()     // Catch: all -> 0x00a1
            if (r4 != 0) goto L_0x0039
            int r4 = r2.getDataNetworkType()     // Catch: all -> 0x0078
            goto L_0x0039
        L_0x0033:
            int r4 = r2.getNetworkType()     // Catch: all -> 0x00a1
            goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            r2 = 2
            if (r4 == 0) goto L_0x003e
            if (r2 != r4) goto L_0x0078
        L_0x003e:
            android.content.Context r5 = com.alibaba.one.android.inner.DeviceInfoCapturer.b     // Catch: all -> 0x0078
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch: all -> 0x0078
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch: all -> 0x0078
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0078
            r7 = 29
            r8 = -2
            r9 = 3
            r10 = 1
            if (r6 < r7) goto L_0x007a
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            android.content.Context r2 = com.alibaba.one.android.inner.DeviceInfoCapturer.b     // Catch: all -> 0x0078
            java.lang.String r2 = r2.getPackageName()     // Catch: all -> 0x0078
            int r1 = r3.checkPermission(r1, r2)     // Catch: all -> 0x0078
            if (r1 != 0) goto L_0x0078
            android.net.Network r1 = r5.getActiveNetwork()     // Catch: all -> 0x0078
            android.net.NetworkCapabilities r1 = r5.getNetworkCapabilities(r1)     // Catch: all -> 0x0078
            if (r1 == 0) goto L_0x0078
            boolean r2 = r1.hasTransport(r10)     // Catch: all -> 0x0078
            if (r2 == 0) goto L_0x0070
            goto L_0x00b4
        L_0x0070:
            boolean r0 = r1.hasTransport(r9)     // Catch: all -> 0x0078
            if (r0 == 0) goto L_0x0078
        L_0x0076:
            r0 = -2
            goto L_0x00b4
        L_0x0078:
            r0 = r4
            goto L_0x00b4
        L_0x007a:
            android.net.NetworkInfo r3 = r5.getActiveNetworkInfo()     // Catch: all -> 0x0078
            if (r3 == 0) goto L_0x0078
            boolean r5 = r3.isConnected()     // Catch: all -> 0x0078
            if (r5 == 0) goto L_0x0078
            java.lang.String r5 = r3.getTypeName()     // Catch: all -> 0x0078
            java.lang.String r6 = "WIFI"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch: all -> 0x0078
            if (r5 == 0) goto L_0x0093
            r4 = -1
        L_0x0093:
            if (r4 != 0) goto L_0x0078
            int r5 = r3.getType()     // Catch: all -> 0x0078
            if (r5 == 0) goto L_0x00a3
            if (r5 == r10) goto L_0x00b4
            r0 = 9
            if (r5 == r0) goto L_0x0076
        L_0x00a1:
            r0 = 0
            goto L_0x00b4
        L_0x00a3:
            int r0 = r3.getSubtype()     // Catch: all -> 0x0078
            switch(r0) {
                case 1: goto L_0x00b3;
                case 2: goto L_0x00b3;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00b1;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00b1;
                case 9: goto L_0x00b1;
                case 10: goto L_0x00b1;
                case 11: goto L_0x00b3;
                case 12: goto L_0x00b1;
                case 13: goto L_0x00ae;
                case 14: goto L_0x00b1;
                case 15: goto L_0x00b1;
                case 16: goto L_0x00b3;
                case 17: goto L_0x00b1;
                case 18: goto L_0x00ae;
                case 19: goto L_0x00aa;
                case 20: goto L_0x00ab;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            goto L_0x00a1
        L_0x00ab:
            r0 = 20
            goto L_0x00b4
        L_0x00ae:
            r0 = 18
            goto L_0x00b4
        L_0x00b1:
            r0 = 3
            goto L_0x00b4
        L_0x00b3:
            r0 = 2
        L_0x00b4:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.one.android.inner.DeviceInfoCapturer.m():java.lang.String");
    }

    private static String n() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    private static String o() {
        try {
            return String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String p() {
        Context context = b;
        try {
            Class<?> cls = Class.forName(OConstant.REFLECT_SECURITYGUARD);
            Object invoke = cls.getMethod("getInstance", Context.class).invoke(null, context);
            return invoke != null ? (String) cls.getMethod("getSDKVerison", new Class[0]).invoke(invoke, new Object[0]) : "";
        } catch (Exception unused) {
            return "";
        }
    }

    private static String q() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                bufferedReader = new BufferedReader(fileReader, 8192);
            } catch (Throwable unused) {
            }
            try {
                readLine = bufferedReader.readLine();
            } catch (Throwable unused2) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused3) {
                    }
                }
                if (fileReader == null) {
                    return "";
                }
                try {
                    fileReader.close();
                } catch (Throwable unused4) {
                    return "";
                }
            }
        } catch (Throwable unused5) {
            fileReader = null;
        }
        if (readLine == null || readLine.length() <= 0) {
            try {
                bufferedReader.close();
            } catch (Throwable unused6) {
            }
            fileReader.close();
        } else {
            String trim = readLine.trim();
            try {
                bufferedReader.close();
            } catch (Throwable unused7) {
            }
            try {
                fileReader.close();
            } catch (Throwable unused8) {
            }
            return trim;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        r1 = r3[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        r2.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String r() {
        /*
            java.lang.String r0 = "/proc/cpuinfo"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: all -> 0x0040
            r2.<init>(r0)     // Catch: all -> 0x0040
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: all -> 0x003d
            r3 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r2, r3)     // Catch: all -> 0x003d
        L_0x000f:
            java.lang.String r3 = r0.readLine()     // Catch: all -> 0x003e
            if (r3 == 0) goto L_0x0036
            int r4 = r3.length()     // Catch: all -> 0x003e
            if (r4 <= 0) goto L_0x000f
            java.lang.String r4 = ":"
            java.lang.String[] r3 = r3.split(r4)     // Catch: all -> 0x003e
            int r4 = r3.length     // Catch: all -> 0x003e
            r5 = 1
            if (r4 <= r5) goto L_0x000f
            r4 = 0
            r4 = r3[r4]     // Catch: all -> 0x003e
            java.lang.String r6 = "BogoMIPS"
            boolean r4 = r4.contains(r6)     // Catch: all -> 0x003e
            if (r4 == 0) goto L_0x000f
            r1 = r3[r5]     // Catch: all -> 0x003e
            java.lang.String r1 = r1.trim()     // Catch: all -> 0x003e
        L_0x0036:
            r2.close()     // Catch: all -> 0x0039
        L_0x0039:
            r0.close()     // Catch: all -> 0x003c
        L_0x003c:
            return r1
        L_0x003d:
            r0 = r1
        L_0x003e:
            r1 = r2
            goto L_0x0041
        L_0x0040:
            r0 = r1
        L_0x0041:
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch: all -> 0x0047
            goto L_0x0048
        L_0x0047:
        L_0x0048:
            if (r0 == 0) goto L_0x004d
            r0.close()     // Catch: all -> 0x004d
        L_0x004d:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.one.android.inner.DeviceInfoCapturer.r():java.lang.String");
    }

    private static String s() {
        String str = null;
        try {
            Cursor query = b.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
            if (query != null) {
                if (query.moveToNext()) {
                    str = query.getString(query.getColumnIndex("value"));
                }
                query.close();
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    private static String t() {
        Method method;
        try {
            Class<?> cls = Class.forName("com.android.id.IdentifierManager");
            if (cls == null || (method = cls.getMethod("getOAID", Context.class)) == null) {
                return null;
            }
            method.setAccessible(true);
            return (String) method.invoke(cls, b);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String u() {
        Method method;
        try {
            Class<?> cls = Class.forName("com.yunos.tvtaobao.uuid.CloudUUID");
            if (cls == null || (method = cls.getMethod("getCloudUUID", new Class[0])) == null) {
                return null;
            }
            return (String) method.invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:14:0x003f). Please submit an issue!!! */
    private static String v() {
        long j2;
        String str;
        if (Build.VERSION.SDK_INT > 8) {
            PackageInfo packageInfo = b.getPackageManager().getPackageInfo(b.getPackageName(), 0);
            if (packageInfo != null) {
                j2 = packageInfo.firstInstallTime;
            }
            j2 = -1;
        } else {
            ApplicationInfo applicationInfo = b.getPackageManager().getApplicationInfo(b.getPackageName(), 0);
            if (!(applicationInfo == null || (str = applicationInfo.sourceDir) == null)) {
                j2 = new File(str).lastModified();
            }
            j2 = -1;
        }
        if (j2 == -1) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(Long.valueOf(j2));
        } catch (Exception unused) {
            return null;
        }
    }
}
