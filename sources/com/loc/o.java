package com.loc;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Xml;
import android.view.WindowManager;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;
import com.taobao.android.address.map.IAddressMap;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Map;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import tb.oeh;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class o {
    private static String A = "";
    private static String B = "";
    private static String C = "";
    private static boolean D = false;
    private static boolean E = false;
    private static String F = "";
    private static boolean G = false;
    private static boolean H = false;
    private static long I = 0;
    private static int J = 0;
    private static String K = null;
    private static String L = "";
    private static boolean M = true;
    private static boolean N = false;
    private static String O = "";
    private static boolean P = false;
    private static int Q = -1;
    private static boolean R = false;
    private static int S = -1;
    private static boolean T = false;
    private static volatile b U = null;

    /* renamed from: a  reason: collision with root package name */
    static String f5742a = "";
    static String b = "";
    static volatile boolean c = true;
    public static boolean d = false;
    static String e = "";
    static boolean f = false;
    public static a g = null;
    static int h = -1;
    static String i = "";
    static String j = "";
    private static String k = null;
    private static boolean l = false;
    private static String m = "";
    private static volatile boolean n = false;
    private static String o = "";
    private static boolean p = false;
    private static boolean q = false;
    private static boolean r = false;
    private static String s = "";
    private static String t = "";
    private static boolean u = false;
    private static boolean v = false;
    private static String w = "";
    private static boolean x = false;
    private static String y = "";
    private static boolean z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        bt a(byte[] bArr, Map<String, String> map);

        String a();

        String a(Context context, String str);

        String a(String str, String str2, String str3, String str4);

        Map<String, String> b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static Context f5745a;
        private static BroadcastReceiver b;
        private static ConnectivityManager c;
        private static NetworkRequest d;
        private static ConnectivityManager.NetworkCallback e;

        public final void a(Context context) {
            if (Build.VERSION.SDK_INT < 24) {
                if (context != null && b == null) {
                    b = new BroadcastReceiver() { // from class: com.loc.o.b.1
                        @Override // android.content.BroadcastReceiver
                        public final void onReceive(Context context2, Intent intent) {
                            if (x.c("WYW5kcm9pZC5uZXQuY29ubi5DT05ORUNUSVZJVFlfQ0hBTkdF").equals(intent.getAction())) {
                                o.q();
                            }
                        }
                    };
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(x.c("WYW5kcm9pZC5uZXQuY29ubi5DT05ORUNUSVZJVFlfQ0hBTkdF"));
                    context.registerReceiver(b, intentFilter);
                }
            } else if (o.b(context, x.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && context != null && c == null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                c = connectivityManager;
                if (connectivityManager != null) {
                    d = new NetworkRequest.Builder().addCapability(0).addCapability(1).build();
                    ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.loc.o.b.2
                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public final void onAvailable(Network network) {
                            super.onAvailable(network);
                            o.q();
                        }

                        @Override // android.net.ConnectivityManager.NetworkCallback
                        public final void onLost(Network network) {
                            super.onLost(network);
                            o.q();
                        }
                    };
                    e = networkCallback;
                    c.registerNetworkCallback(d, networkCallback);
                    f5745a = context;
                }
            }
        }
    }

    private static String A(Context context) {
        if (!TextUtils.isEmpty(F)) {
            return F;
        }
        try {
            String b2 = bd.b(context, "open_common", "a1", "");
            if (TextUtils.isEmpty(b2)) {
                F = IAddressMap.MAP_TYPE_AMAP + UUID.randomUUID().toString().replace("_", "").toLowerCase();
                SharedPreferences.Editor a2 = bd.a(context, "open_common");
                bd.a(a2, "a1", x.b(F));
                bd.a(a2);
            } else {
                F = x.c(b2);
            }
        } catch (Throwable unused) {
        }
        return F;
    }

    private static String B(Context context) {
        if (P) {
            return O;
        }
        K(context);
        if (!b(context, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return O;
        }
        TelephonyManager F2 = F(context);
        if (F2 == null) {
            return O;
        }
        String simOperatorName = F2.getSimOperatorName();
        O = simOperatorName;
        if (TextUtils.isEmpty(simOperatorName)) {
            O = F2.getNetworkOperatorName();
        }
        P = true;
        return O;
    }

    private static int C(Context context) {
        if (R) {
            return Q;
        }
        K(context);
        if (context == null || !b(context, x.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF"))) {
            return Q;
        }
        ConnectivityManager D2 = D(context);
        if (D2 == null) {
            return Q;
        }
        NetworkInfo activeNetworkInfo = D2.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            R = true;
            return Q;
        }
        int type = activeNetworkInfo.getType();
        Q = type;
        R = true;
        return type;
    }

    private static ConnectivityManager D(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    private static int E(Context context) {
        if (T) {
            return S;
        }
        K(context);
        if (!b(context, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return S;
        }
        TelephonyManager F2 = F(context);
        if (F2 == null) {
            return S;
        }
        int proxy_getNetworkType = ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType(F2);
        S = proxy_getNetworkType;
        T = true;
        return proxy_getNetworkType;
    }

    private static TelephonyManager F(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    private static String G(Context context) {
        String str;
        if (!c) {
            return "";
        }
        try {
            str = H(context);
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            c = false;
            return "";
        }
        try {
            byte[] bytes = x.c("MAAAAAAAAAAAAAAAAAAAAAA").getBytes("UTF-8");
            return new String(p.a(x.c("HYW1hcGFkaXVhbWFwYWRpdWFtYXBhZGl1YW1hcGFkaXU").getBytes("UTF-8"), p.b(str), bytes), "UTF-8");
        } catch (Throwable unused2) {
            c = false;
            return "";
        }
    }

    private static String H(Context context) {
        String str;
        try {
            str = I(context);
        } catch (Throwable unused) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (context == null) {
            return "";
        }
        return context.getSharedPreferences(x.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU"), 0).getString(s.a(x.c("RYW1hcF9kZXZpY2VfYWRpdQ")), "");
    }

    private static String I(Context context) {
        RandomAccessFile randomAccessFile;
        ByteArrayOutputStream byteArrayOutputStream;
        String str;
        String[] split;
        if (!b(context, x.c("EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfRVhURVJOQUxfU1RPUkFHRQ=="))) {
            return "";
        }
        String a2 = s.a(x.c("LYW1hcF9kZXZpY2VfYWRpdQ"));
        String J2 = J(context);
        if (TextUtils.isEmpty(J2)) {
            return "";
        }
        File file = new File(J2 + File.separator + x.c("KYmFja3Vwcw"), x.c("MLmFkaXU"));
        if (file.exists() && file.canRead()) {
            if (file.length() == 0) {
                file.delete();
                return "";
            }
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    byte[] bArr = new byte[1024];
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = randomAccessFile.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        } catch (Throwable unused) {
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            a(byteArrayOutputStream2);
                            a(randomAccessFile);
                            return "";
                        }
                    }
                    str = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                randomAccessFile = null;
            }
            if (TextUtils.isEmpty(str) || !str.contains(x.c("SIw")) || (split = str.split(x.c("SIw"))) == null || split.length != 2 || !TextUtils.equals(a2, split[0])) {
                a(byteArrayOutputStream);
                a(randomAccessFile);
            } else {
                String str2 = split[1];
                a(byteArrayOutputStream);
                a(randomAccessFile);
                return str2;
            }
        }
        return "";
    }

    private static String J(Context context) {
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService(WXStorageModule.NAME);
            Class<?> cls = Class.forName(x.c("SYW5kcm9pZC5vcy5zdG9yYWdlLlN0b3JhZ2VWb2x1bWU"));
            Method method = storageManager.getClass().getMethod(x.c("MZ2V0Vm9sdW1lTGlzdA"), new Class[0]);
            Method method2 = cls.getMethod(x.c("FZ2V0UGF0aA"), new Class[0]);
            Method method3 = cls.getMethod(x.c("DaXNSZW1vdmFibGU"), new Class[0]);
            Object invoke = method.invoke(storageManager, new Object[0]);
            int length = Array.getLength(invoke);
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = Array.get(invoke, i2);
                String str = (String) method2.invoke(obj, new Object[0]);
                if (!((Boolean) method3.invoke(obj, new Object[0])).booleanValue()) {
                    return str;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static synchronized b K(Context context) {
        synchronized (o.class) {
            try {
                if (U == null) {
                    if (context == null) {
                        return null;
                    }
                    b bVar = new b();
                    U = bVar;
                    bVar.a(context.getApplicationContext());
                }
                return U;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String a() {
        return k;
    }

    public static String b() {
        try {
            if (!TextUtils.isEmpty(e)) {
                return e;
            }
            a aVar = g;
            return aVar == null ? "" : aVar.a();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int c(Context context) {
        try {
            return E(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static int d(Context context) {
        try {
            return C(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static String e() {
        return "";
    }

    public static String f() {
        return "";
    }

    public static String g() {
        return "";
    }

    public static String h() {
        return w;
    }

    public static int i(Context context) {
        try {
            return E(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int j(Context context) {
        try {
            return C(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static NetworkInfo k(Context context) {
        ConnectivityManager D2;
        if (b(context, x.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) && (D2 = D(context)) != null) {
            return D2.getActiveNetworkInfo();
        }
        return null;
    }

    public static String l(Context context) {
        try {
            NetworkInfo k2 = k(context);
            if (k2 == null) {
                return null;
            }
            return k2.getExtraInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String m() {
        return "";
    }

    public static String n() {
        return "";
    }

    public static long o() {
        long j2 = I;
        if (j2 != 0) {
            return j2;
        }
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            I = ((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576) + ((statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576);
        } catch (Throwable unused) {
        }
        return I;
    }

    public static String p() {
        if (!TextUtils.isEmpty(K)) {
            return K;
        }
        String property = System.getProperty("os.arch");
        K = property;
        return property;
    }

    public static String q(Context context) {
        return k() + "#" + a(context) + "#" + p(context);
    }

    public static int r(Context context) {
        int i2 = J;
        if (i2 != 0) {
            return i2;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return 0;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        int i3 = ((int) (memoryInfo.totalMem / 1024)) / 1024;
        J = i3;
        return i3;
    }

    public static String s(Context context) {
        try {
            return B(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String t(Context context) {
        try {
            if (TextUtils.isEmpty(m)) {
                m = ae.a(context);
            }
        } catch (Throwable unused) {
        }
        return m;
    }

    private static String v(Context context) {
        try {
            String b2 = bd.b(context, "Alvin2", "UTDID2", "");
            if (TextUtils.isEmpty(b2)) {
                return bd.b(context, "Alvin2", oeh.UTDID, "");
            }
            return b2;
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String y(Context context) {
        try {
            Cursor query = context.getContentResolver().query(Uri.parse(x.c("QY29udGVudDovL2NvbS52aXZvLnZtcy5JZFByb3ZpZGVyL0lkZW50aWZpZXJJZC9PQUlE")), null, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    int columnCount = query.getColumnCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= columnCount) {
                            break;
                        } else if (x.c("IdmFsdWU").equals(query.getColumnName(i2))) {
                            o = query.getString(i2);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                query.close();
            }
        } catch (Throwable th) {
            p = true;
            as.a(th, "oa", "vivo");
        }
        return o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String z(Context context) {
        String c2 = x.c("IeGlhb21p");
        String str = Build.MANUFACTURER;
        if (!c2.equalsIgnoreCase(str)) {
            String c3 = x.c("IeGlhb21p");
            String str2 = Build.BRAND;
            if (!c3.equalsIgnoreCase(str2) && !x.c("IUkVETUk=").equalsIgnoreCase(str) && !x.c("IUkVETUk=").equalsIgnoreCase(str2)) {
                if (x.c("Idml2bw").equalsIgnoreCase(str) || x.c("Idml2bw").equalsIgnoreCase(str2)) {
                    return y(context);
                }
                if (x.c("IaHVhd2Vp").equalsIgnoreCase(str) || x.c("IaHVhd2Vp").equalsIgnoreCase(str2) || x.c("ISE9OT1I=").equalsIgnoreCase(str)) {
                    return a(context, 2);
                }
                if (x.c("Mc2Ftc3VuZw").equalsIgnoreCase(str) || x.c("Mc2Ftc3VuZw").equalsIgnoreCase(str2)) {
                    return a(context, 4);
                }
                if (x.c("IT1BQTw").equalsIgnoreCase(str) || x.c("IT1BQTw").equalsIgnoreCase(str2) || x.c("MT25lUGx1cw").equalsIgnoreCase(str) || x.c("MT25lUGx1cw").equalsIgnoreCase(str2) || x.c("IUkVBTE1F").equalsIgnoreCase(str2)) {
                    return a(context, 5);
                }
                p = true;
                return o;
            }
        }
        return x(context);
    }

    public static String a(final Context context) {
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        if (context == null) {
            return "";
        }
        String G2 = G(context);
        b = G2;
        if (!TextUtils.isEmpty(G2)) {
            return b;
        }
        if (c() == null || n) {
            return "";
        }
        n = true;
        cr.a().b(new cs() { // from class: com.loc.o.1
            @Override // com.loc.cs
            public final void a() {
                try {
                    Map<String, String> b2 = o.g.b();
                    String a2 = o.g.a(o.f(context), "", "", o.n());
                    if (!TextUtils.isEmpty(a2)) {
                        bo.a();
                        String a3 = o.g.a(context, new String(bo.a(o.g.a(a2.getBytes(), b2)).f5615a));
                        if (!TextUtils.isEmpty(a3)) {
                            o.b = a3;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
        return "";
    }

    public static String b(Context context) {
        try {
            return B(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static a c() {
        return g;
    }

    public static String d() {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        try {
            String n2 = n();
            return n2.length() < 5 ? "" : n2.substring(3, 5);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String e(final Context context) {
        if (p) {
            return "";
        }
        if (TextUtils.isEmpty(o) && !q) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                cr.a().b(new cs() { // from class: com.loc.o.2
                    @Override // com.loc.cs
                    public final void a() {
                        o.z(context);
                        boolean unused = o.q = true;
                    }
                });
                return o;
            }
            q = true;
            return z(context);
        }
        return o;
    }

    public static String f(Context context) {
        String str;
        if (r) {
            String str2 = f5742a;
            return str2 == null ? "" : str2;
        }
        try {
            str = f5742a;
        } catch (Throwable unused) {
        }
        if (str != null && !"".equals(str)) {
            return f5742a;
        }
        if (b(context, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
            f5742a = Settings.System.getString(context.getContentResolver(), "mqBRboGZkQPcAkyk");
        }
        if (!TextUtils.isEmpty(f5742a)) {
            r = true;
            return f5742a;
        }
        try {
            String v2 = v(context);
            f5742a = v2;
            if (!TextUtils.isEmpty(v2)) {
                r = true;
                return f5742a;
            }
        } catch (Throwable unused2) {
        }
        try {
            f5742a = w(context);
            r = true;
        } catch (Throwable unused3) {
        }
        String str3 = f5742a;
        return str3 == null ? "" : str3;
    }

    public static String g(Context context) {
        try {
            TelephonyManager F2 = F(context);
            if (F2 == null) {
                return "";
            }
            String networkOperator = F2.getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
                return networkOperator.substring(0, 3);
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String h(Context context) {
        TelephonyManager F2;
        if (z) {
            return y;
        }
        try {
            K(context);
            F2 = F(context);
        } catch (Throwable unused) {
        }
        if (F2 == null) {
            return y;
        }
        String networkOperator = F2.getNetworkOperator();
        if (!TextUtils.isEmpty(networkOperator) && networkOperator.length() >= 3) {
            y = networkOperator.substring(3);
            z = true;
            return y;
        }
        z = true;
        return y;
    }

    public static String[] i() {
        return new String[]{"", ""};
    }

    public static String j() {
        return i;
    }

    public static String k() {
        return B;
    }

    public static void l() {
        try {
            ar.a();
        } catch (Throwable unused) {
        }
    }

    public static String m(Context context) {
        String str;
        StringBuilder sb;
        try {
            str = A;
        } catch (Throwable unused) {
        }
        if (str != null && !"".equals(str)) {
            return A;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        if (windowManager == null) {
            return "";
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        if (i3 > i2) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("*");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("*");
            sb.append(i2);
        }
        A = sb.toString();
        return A;
    }

    public static String n(Context context) {
        try {
            if (!b(context, x.c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
                return L;
            }
            TelephonyManager F2 = F(context);
            return F2 == null ? "" : F2.getNetworkOperatorName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String o(Context context) {
        ConnectivityManager D2;
        NetworkInfo activeNetworkInfo;
        try {
            return (!b(context, x.c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (D2 = D(context)) == null || (activeNetworkInfo = D2.getActiveNetworkInfo()) == null) ? "" : activeNetworkInfo.getTypeName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String p(Context context) {
        String str;
        try {
            String k2 = k();
            try {
                if (TextUtils.isEmpty(k2)) {
                    k2 = a(context);
                }
                if (TextUtils.isEmpty(k2)) {
                    k2 = f(context);
                }
                if (TextUtils.isEmpty(k2)) {
                    k2 = e(context);
                }
                if (TextUtils.isEmpty(k2)) {
                    k2 = g();
                }
                return TextUtils.isEmpty(k2) ? A(context) : k2;
            } catch (Throwable unused) {
                return str;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static void q() {
        Q = -1;
        R = false;
        S = -1;
        T = false;
        O = "";
        P = false;
        y = "";
        z = false;
    }

    private static String w(Context context) {
        FileInputStream fileInputStream = null;
        try {
            if (x.a(context, "android.permission.READ_EXTERNAL_STORAGE") && "mounted".equals(Environment.getExternalStorageState())) {
                String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                File file = new File(absolutePath + "/.UTSystemConfig/Global/Alvin2.xml");
                XmlPullParser newPullParser = Xml.newPullParser();
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    newPullParser.setInput(fileInputStream2, "utf-8");
                    boolean z2 = false;
                    for (int eventType = newPullParser.getEventType(); 1 != eventType; eventType = newPullParser.next()) {
                        if (eventType != 2) {
                            if (eventType == 3) {
                                z2 = false;
                            } else if (eventType == 4 && z2) {
                                String text = newPullParser.getText();
                                try {
                                    fileInputStream2.close();
                                } catch (Throwable unused) {
                                }
                                return text;
                            }
                        } else if (newPullParser.getAttributeCount() > 0) {
                            int attributeCount = newPullParser.getAttributeCount();
                            for (int i2 = 0; i2 < attributeCount; i2++) {
                                String attributeValue = newPullParser.getAttributeValue(i2);
                                if ("UTDID2".equals(attributeValue) || oeh.UTDID.equals(attributeValue)) {
                                    z2 = true;
                                }
                            }
                        }
                    }
                    fileInputStream = fileInputStream2;
                } catch (Throwable unused2) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream == null) {
                        return "";
                    }
                    fileInputStream.close();
                }
            }
            if (fileInputStream == null) {
                return "";
            }
        } catch (Throwable unused3) {
        }
        try {
            fileInputStream.close();
        } catch (Throwable unused4) {
            return "";
        }
    }

    private static String a(Context context, int i2) {
        try {
            Intent intent = new Intent();
            if (i2 == 2) {
                intent.setAction(x.c("WY29tLnVvZGlzLm9wZW5kZXZpY2UuT1BFTklEU19TRVJWSUNF"));
                intent.setPackage(x.c("UY29tLmh1YXdlaS5od2lk"));
            } else if (i2 == 4) {
                intent.setClassName(x.c("WY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2U"), x.c("QY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuRGV2aWNlSWRTZXJ2aWNl"));
            } else if (i2 != 5) {
                p = true;
                return o;
            } else {
                intent.setClassName(x.c("YY29tLmhleXRhcC5vcGVuaWQ"), x.c("SY29tLmhleXRhcC5vcGVuaWQuSWRlbnRpZnlTZXJ2aWNl"));
                intent.setAction(x.c("EYWN0aW9uLmNvbS5oZXl0YXAub3BlbmlkLk9QRU5fSURfU0VSVklDRQ"));
            }
            c cVar = new c(context, i2);
            if (context.bindService(intent, cVar, 1)) {
                int i3 = 0;
                while (i3 < 100 && TextUtils.isEmpty(o)) {
                    i3++;
                    Thread.sleep(15L);
                }
                context.unbindService(cVar);
            }
            return o;
        } catch (Throwable th) {
            as.a(th, "oa", String.valueOf(i2));
            p = true;
            return o;
        }
    }

    private static String x(Context context) {
        try {
            Class<?> cls = Class.forName(x.c("WY29tLmFuZHJvaWQuaWQuaW1wbC5JZFByb3ZpZGVySW1wbA"));
            Object invoke = cls.getMethod(x.c("MZ2V0T0FJRA"), Context.class).invoke(cls.newInstance(), context);
            if (invoke != null) {
                String str = (String) invoke;
                o = str;
                return str;
            }
        } catch (Throwable th) {
            as.a(th, "oa", "xm");
            p = true;
        }
        return o;
    }

    public static void a(a aVar) {
        if (g == null) {
            g = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, String str) {
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str) {
        k = str;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private static String f5748a;
        private Context b;
        private int c;

        public c(Context context, int i) {
            this.b = context;
            this.c = i;
        }

        private String a() {
            try {
                if (!TextUtils.isEmpty(f5748a)) {
                    return f5748a;
                }
                byte[] digest = MessageDigest.getInstance(x.c("IU0hBMQ")).digest(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 64).signatures[0].toByteArray());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b : digest) {
                    stringBuffer.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                }
                String stringBuffer2 = stringBuffer.toString();
                if (!TextUtils.isEmpty(stringBuffer2)) {
                    f5748a = stringBuffer2;
                }
                return stringBuffer2;
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String c;
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                int i = this.c;
                if (i == 2) {
                    c = x.c("UY29tLnVvZGlzLm9wZW5kZXZpY2UuYWlkbC5PcGVuRGV2aWNlSWRlbnRpZmllclNlcnZpY2U");
                } else if (i == 4) {
                    c = x.c("UY29tLnNhbXN1bmcuYW5kcm9pZC5kZXZpY2VpZHNlcnZpY2UuSURldmljZUlkU2VydmljZQ");
                } else if (i == 5) {
                    obtain.writeInterfaceToken(x.c("KY29tLmhleXRhcC5vcGVuaWQuSU9wZW5JRA"));
                    obtain.writeString(this.b.getPackageName());
                    obtain.writeString(a());
                    obtain.writeString(x.c("IT1VJRA"));
                    iBinder.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String unused = o.o = obtain2.readString();
                }
                obtain.writeInterfaceToken(c);
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String unused2 = o.o = obtain2.readString();
            } catch (Throwable th) {
                try {
                    as.a(th, "oac", String.valueOf(this.c));
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
