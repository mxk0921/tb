package com.loc;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import tb.zht;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ff {
    static long d;
    static long e;
    static long f;
    public static long g;
    static long h;
    private es E;

    /* renamed from: a  reason: collision with root package name */
    WifiManager f5696a;
    Context i;
    fe t;
    public static HashMap<String, Long> w = new HashMap<>(36);
    public static long x = 0;
    static int y = 0;
    public static long A = 0;
    ArrayList<eg> b = new ArrayList<>();
    ArrayList<eg> c = new ArrayList<>();
    boolean j = false;
    StringBuilder k = null;
    boolean l = true;
    boolean m = true;
    boolean n = true;
    private volatile WifiInfo C = null;
    String o = null;
    TreeMap<Integer, eg> p = null;
    public boolean q = true;
    public boolean r = true;
    public boolean s = false;
    String u = "";
    long v = 0;
    ConnectivityManager z = null;
    private long D = 30000;
    volatile boolean B = false;

    public ff(Context context, WifiManager wifiManager, Handler handler) {
        this.f5696a = wifiManager;
        this.i = context;
        fe feVar = new fe(context, "wifiAgee", handler);
        this.t = feVar;
        feVar.a();
    }

    private void A() {
        try {
            if (fy.c(this.i, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
                this.r = this.f5696a.isWifiEnabled();
            }
        } catch (Throwable unused) {
        }
    }

    private boolean B() {
        this.q = v();
        A();
        if (!this.q || !this.l) {
            return false;
        }
        if (f != 0) {
            if (fy.b() - f < 4900 || fy.b() - g < 1500) {
                return false;
            }
            fy.b();
        }
        return true;
    }

    public static long b() {
        return ((fy.b() - x) / 1000) + 1;
    }

    public static String p() {
        return String.valueOf(fy.b() - g);
    }

    private List<eg> r() {
        List<ScanResult> list;
        boolean z;
        if (this.f5696a != null) {
            try {
                if (fy.c(this.i, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
                    list = this.f5696a.getScanResults();
                } else {
                    fr.a(new Exception("gst_n_aws"), "OPENSDK_WMW", "gsr_n_aws");
                    list = null;
                }
                HashMap<String, Long> hashMap = new HashMap<>(36);
                if (list != null) {
                    for (ScanResult scanResult : list) {
                        hashMap.put(scanResult.BSSID, Long.valueOf(scanResult.timestamp));
                    }
                }
                if (w.isEmpty() || !w.equals(hashMap)) {
                    w = hashMap;
                    x = fy.b();
                }
                this.o = null;
                ArrayList arrayList = new ArrayList();
                this.u = "";
                this.C = m();
                if (a(this.C)) {
                    this.u = this.C.getBSSID();
                }
                if (list != null && list.size() > 0) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ScanResult scanResult2 = list.get(i);
                        String str = scanResult2.BSSID;
                        if (TextUtils.isEmpty(this.u) || !this.u.equals(str)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        eg egVar = new eg(z);
                        egVar.b = scanResult2.SSID;
                        egVar.d = scanResult2.frequency;
                        egVar.e = scanResult2.timestamp;
                        egVar.f5665a = eg.a(scanResult2.BSSID);
                        egVar.c = (short) scanResult2.level;
                        short elapsedRealtime = (short) ((SystemClock.elapsedRealtime() - (scanResult2.timestamp / 1000)) / 1000);
                        egVar.g = elapsedRealtime;
                        if (elapsedRealtime < 0) {
                            egVar.g = (short) 0;
                        }
                        egVar.f = fy.b();
                        arrayList.add(egVar);
                    }
                }
                this.t.a((List) arrayList);
                return arrayList;
            } catch (SecurityException e2) {
                this.o = e2.getMessage();
            } catch (Throwable th) {
                this.o = null;
                fr.a(th, "WifiManagerWrapper", "getScanResults");
            }
        }
        return null;
    }

    private int s() {
        WifiManager wifiManager = this.f5696a;
        if (wifiManager != null) {
            return wifiManager.getWifiState();
        }
        return 4;
    }

    private boolean t() {
        long b = fy.b() - d;
        if (b < 4900) {
            return false;
        }
        if (u() && b < 9900) {
            return false;
        }
        if (y > 1) {
            long j = this.D;
            if (j == 30000) {
                j = fq.n() != -1 ? fq.n() : 30000L;
            }
            if (Build.VERSION.SDK_INT >= 28 && b < j) {
                return false;
            }
        }
        if (this.f5696a != null) {
            d = fy.b();
            int i = y;
            if (i < 2) {
                y = i + 1;
            }
            if (fy.c(this.i, "WYW5kcm9pZC5wZXJtaXNzaW9uLkNIQU5HRV9XSUZJX1NUQVRF")) {
                return this.f5696a.startScan();
            }
            fr.a(new Exception("n_cws"), "OPENSDK_WMW", "wfs_n_cws");
        }
        return false;
    }

    private boolean u() {
        if (this.z == null) {
            this.z = (ConnectivityManager) fy.a(this.i, "connectivity");
        }
        return a(this.z);
    }

    private boolean v() {
        if (this.f5696a == null) {
            return false;
        }
        return fy.g(this.i);
    }

    private void w() {
        if (B()) {
            long b = fy.b();
            if (b - e >= 10000) {
                this.b.clear();
                h = g;
            }
            x();
            if (b - e >= 10000) {
                for (int i = 20; i > 0 && g == h; i--) {
                    try {
                        Thread.sleep(150L);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private void x() {
        if (B()) {
            try {
                if (t()) {
                    f = fy.b();
                }
            } catch (Throwable th) {
                fr.a(th, "WifiManager", "wifiScan");
            }
        }
    }

    private void y() {
        List<eg> list;
        if (h != g) {
            try {
                list = r();
            } catch (Throwable th) {
                fr.a(th, "WifiManager", "updateScanResult");
                list = null;
            }
            h = g;
            if (list != null) {
                this.b.clear();
                this.b.addAll(list);
                return;
            }
            this.b.clear();
        }
    }

    private void z() {
        try {
            if (this.f5696a != null) {
                int s = s();
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                if (s == 0 || s == 1 || s == 4) {
                    g();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final ArrayList<eg> a() {
        if (!this.s) {
            return this.c;
        }
        b(true);
        return this.c;
    }

    public final WifiInfo c() {
        try {
            if (this.f5696a == null) {
                return null;
            }
            if (fy.c(this.i, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) {
                return this.f5696a.getConnectionInfo();
            }
            fr.a(new Exception("gci_n_aws"), "OPENSDK_WMW", "gci_n_aws");
            return null;
        } catch (Throwable th) {
            fr.a(th, "WifiManagerWrapper", "getConnectionInfo");
            return null;
        }
    }

    public final String d() {
        return this.o;
    }

    public final ArrayList<eg> e() {
        if (this.b == null) {
            return null;
        }
        ArrayList<eg> arrayList = new ArrayList<>();
        if (!this.b.isEmpty()) {
            arrayList.addAll(this.b);
        }
        return arrayList;
    }

    public final void f() {
        try {
            this.s = true;
            List<eg> r = r();
            if (r != null) {
                this.b.clear();
                this.b.addAll(r);
            }
            d(true);
        } catch (Throwable unused) {
        }
    }

    public final void g() {
        this.C = null;
        this.b.clear();
    }

    public final void h() {
        A = System.currentTimeMillis();
        es esVar = this.E;
        if (esVar != null) {
            esVar.b();
        }
    }

    public final void i() {
        if (this.f5696a != null && fy.b() - g > 4900) {
            g = fy.b();
        }
    }

    public final void j() {
        if (this.f5696a != null) {
            this.B = true;
        }
    }

    public final boolean k() {
        return this.q;
    }

    public final boolean l() {
        return this.r;
    }

    public final WifiInfo m() {
        this.C = c();
        return this.C;
    }

    public final boolean n() {
        return this.j;
    }

    public final String o() {
        String str;
        StringBuilder sb = this.k;
        int i = 0;
        if (sb == null) {
            this.k = new StringBuilder(700);
        } else {
            sb.delete(0, sb.length());
        }
        this.j = false;
        int size = this.b.size();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            if (i >= size) {
                break;
            }
            String a2 = eg.a(this.b.get(i).f5665a);
            if (!this.m && !"<unknown ssid>".equals(this.b.get(i).b)) {
                z = true;
            }
            if (TextUtils.isEmpty(this.u) || !this.u.equals(a2)) {
                z3 = z2;
                str = "nb";
            } else {
                str = zht.TAG_ACCESS;
            }
            StringBuilder sb2 = this.k;
            Locale locale = Locale.US;
            sb2.append("#" + a2 + "," + str);
            i++;
            z2 = z3;
        }
        if (this.b.size() == 0) {
            z = true;
        }
        if (!this.m && !z) {
            this.j = true;
        }
        if (!z2 && !TextUtils.isEmpty(this.u)) {
            StringBuilder sb3 = this.k;
            sb3.append("#");
            sb3.append(this.u);
            this.k.append(",access");
        }
        return this.k.toString();
    }

    public final long q() {
        return this.v;
    }

    private void d(boolean z) {
        String str;
        ArrayList<eg> arrayList = this.b;
        if (!(arrayList == null || arrayList.isEmpty())) {
            if (fy.b() - g > 3600000) {
                g();
            }
            if (this.p == null) {
                this.p = new TreeMap<>(Collections.reverseOrder());
            }
            this.p.clear();
            if (this.s && z) {
                try {
                    this.c.clear();
                } catch (Throwable unused) {
                }
            }
            int size = this.b.size();
            this.v = 0L;
            for (int i = 0; i < size; i++) {
                eg egVar = this.b.get(i);
                if (egVar.h) {
                    this.v = egVar.f;
                }
                if (fy.a(eg.a(egVar.f5665a)) && (size <= 20 || a(egVar.c))) {
                    if (this.s && z) {
                        this.c.add(egVar);
                    }
                    if (!TextUtils.isEmpty(egVar.b)) {
                        if (!"<unknown ssid>".equals(egVar.b)) {
                            str = String.valueOf(i);
                        }
                        this.p.put(Integer.valueOf((egVar.c * 25) + i), egVar);
                    } else {
                        str = "unkwn";
                    }
                    egVar.b = str;
                    this.p.put(Integer.valueOf((egVar.c * 25) + i), egVar);
                }
            }
            this.b.clear();
            for (eg egVar2 : this.p.values()) {
                this.b.add(egVar2);
            }
            this.p.clear();
        }
    }

    public final void a(es esVar) {
        this.E = esVar;
    }

    public final void b(boolean z) {
        if (z) {
            w();
        } else {
            x();
        }
        boolean z2 = false;
        if (this.B) {
            this.B = false;
            z();
        }
        y();
        if (fy.b() - g > 20000) {
            this.b.clear();
        }
        e = fy.b();
        if (this.b.isEmpty()) {
            g = fy.b();
            List<eg> r = r();
            if (r != null) {
                this.b.addAll(r);
                z2 = true;
            }
        }
        d(z2);
    }

    public final void c(boolean z) {
        g();
        this.b.clear();
        this.t.a(z);
    }

    public final void a(boolean z) {
        Context context = this.i;
        if (fq.m() && this.n && this.f5696a != null && context != null && z && fy.c() > 17) {
            ContentResolver contentResolver = context.getContentResolver();
            try {
                if (((Integer) fu.a("android.provider.Settings$Global", "getInt", new Object[]{contentResolver, "wifi_scan_always_enabled"}, new Class[]{ContentResolver.class, String.class})).intValue() == 0) {
                    fu.a("android.provider.Settings$Global", "putInt", new Object[]{contentResolver, "wifi_scan_always_enabled", 1}, new Class[]{ContentResolver.class, String.class, Integer.TYPE});
                }
            } catch (Throwable th) {
                fr.a(th, "WifiManagerWrapper", "enableWifiAlwaysScan");
            }
        }
    }

    public final void a(boolean z, boolean z2, boolean z3, long j) {
        this.l = z;
        this.m = z2;
        this.n = z3;
        if (j < 10000) {
            this.D = 10000L;
        } else {
            this.D = j;
        }
    }

    private static boolean a(int i) {
        int i2 = 20;
        try {
            i2 = WifiManager.calculateSignalLevel(i, 20);
        } catch (ArithmeticException e2) {
            fr.a(e2, "Aps", "wifiSigFine");
        }
        return i2 > 0;
    }

    public final boolean a(ConnectivityManager connectivityManager) {
        try {
            if (fy.a(connectivityManager.getActiveNetworkInfo()) == 1) {
                return a(c());
            }
            return false;
        } catch (Throwable th) {
            fr.a(th, "WifiManagerWrapper", "wifiAccess");
            return false;
        }
    }

    public static boolean a(WifiInfo wifiInfo) {
        return wifiInfo != null && !TextUtils.isEmpty(wifiInfo.getSSID()) && fy.a(wifiInfo.getBSSID());
    }
}
