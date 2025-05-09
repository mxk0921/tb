package com.loc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.security.ccrc.service.build.Ba;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import java.util.ArrayList;
import org.android.agoo.common.AgooConstants;
import tb.iuf;
import tb.p78;
import tb.vox;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class er {
    static int C = -1;
    private static boolean M;
    boolean H;
    private Handler P;
    private fd Q;
    private String R;
    private es T;
    public static String[] F = {"android.permission.ACCESS_COARSE_LOCATION", p78.ACCESS_FINE_LOCATION};
    public static String G = "android.permission.ACCESS_BACKGROUND_LOCATION";
    private static volatile boolean S = false;

    /* renamed from: a  reason: collision with root package name */
    Context f5673a = null;
    ConnectivityManager b = null;
    ff c = null;
    fb d = null;
    fh e = null;
    fo f = null;
    ArrayList<eg> g = new ArrayList<>();
    a h = null;
    AMapLocationClientOption i = new AMapLocationClientOption();
    ew j = null;
    long k = 0;
    private int K = 0;
    fp l = null;
    boolean m = false;
    private String L = null;
    fm n = null;
    StringBuilder o = new StringBuilder();
    boolean p = true;
    boolean q = true;
    AMapLocationClientOption.GeoLanguage r = AMapLocationClientOption.GeoLanguage.DEFAULT;
    boolean s = true;
    boolean t = false;
    WifiInfo u = null;
    boolean v = true;
    private String N = null;
    StringBuilder w = null;
    boolean x = false;
    public boolean y = false;
    int z = 12;
    private boolean O = true;
    ey A = null;
    boolean B = false;
    ev D = null;
    String E = null;
    IntentFilter I = null;
    LocationManager J = null;

    /* compiled from: Taobao */
    /* renamed from: com.loc.er$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5674a;

        static {
            int[] iArr = new int[AMapLocationClientOption.GeoLanguage.values().length];
            f5674a = iArr;
            try {
                iArr[AMapLocationClientOption.GeoLanguage.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5674a[AMapLocationClientOption.GeoLanguage.ZH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5674a[AMapLocationClientOption.GeoLanguage.EN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public er(boolean z) {
        this.H = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010b A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:10:0x0052, B:12:0x007b, B:18:0x0089, B:20:0x0091, B:23:0x0099, B:24:0x009b, B:26:0x00a1, B:27:0x00ab, B:31:0x00b6, B:33:0x00c9, B:35:0x00cd, B:36:0x00d7, B:39:0x00ed, B:41:0x00f3, B:43:0x00f7, B:44:0x00fe, B:45:0x0104, B:46:0x0107, B:48:0x010b), top: B:102:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.loc.ew b(boolean r12, com.loc.eq r13) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.er.b(boolean, com.loc.eq):com.loc.ew");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c9, code lost:
        if (com.loc.fy.f(r16.f5673a) == false) goto L_0x01cb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cb, code lost:
        r16.o.append("或后台运行没有后台定位权限");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d0, code lost:
        r1 = r16.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e1, code lost:
        if (com.loc.fy.f(r16.f5673a) == false) goto L_0x01cb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025b, code lost:
        if (r16.v == false) goto L_0x025e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x025e, code lost:
        r5 = "cgi";
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0299, code lost:
        if (r16.v == false) goto L_0x025e;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String c(com.loc.eq r17) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.er.c(com.loc.eq):java.lang.String");
    }

    private void i() {
        if (this.n != null) {
            try {
                if (this.i == null) {
                    this.i = new AMapLocationClientOption();
                }
                this.n.a(this.i.getHttpTimeOut(), this.i.getLocationProtocol().equals(AMapLocationClientOption.AMapLocationProtocol.HTTPS), j());
            } catch (Throwable unused) {
            }
        }
    }

    private int j() {
        int i;
        if (this.i.getGeoLanguage() == null || (i = AnonymousClass1.f5674a[this.i.getGeoLanguage().ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return 0;
        }
        return 2;
    }

    private void k() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        AMapLocationClientOption.GeoLanguage geoLanguage = AMapLocationClientOption.GeoLanguage.DEFAULT;
        boolean z5 = true;
        try {
            geoLanguage = this.i.getGeoLanguage();
            z2 = this.i.isNeedAddress();
            try {
                z = this.i.isOffset();
                try {
                    z3 = this.i.isLocationCacheEnable();
                } catch (Throwable unused) {
                    z5 = z;
                    z4 = true;
                    z = z5;
                    z3 = z4;
                    this.q = z;
                    this.p = z2;
                    this.s = z3;
                    this.r = geoLanguage;
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            z2 = true;
        }
        try {
            this.t = this.i.isOnceLocationLatest();
            this.B = this.i.isSensorEnable();
            if (!(z == this.q && z2 == this.p && z3 == this.s && geoLanguage == this.r)) {
                r();
            }
        } catch (Throwable unused4) {
            z4 = z3;
            z5 = z;
            z = z5;
            z3 = z4;
            this.q = z;
            this.p = z2;
            this.s = z3;
            this.r = geoLanguage;
        }
        this.q = z;
        this.p = z2;
        this.s = z3;
        this.r = geoLanguage;
    }

    private void l() {
        try {
            if (this.h == null) {
                this.h = new a();
            }
            if (this.I == null) {
                IntentFilter intentFilter = new IntentFilter();
                this.I = intentFilter;
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                this.I.addAction("android.net.wifi.SCAN_RESULTS");
            }
            this.f5673a.registerReceiver(this.h, this.I);
        } catch (Throwable th) {
            fr.a(th, "Aps", "initBroadcastListener");
        }
    }

    private byte[] m() throws Throwable {
        if (this.l == null) {
            this.l = new fp();
        }
        if (this.i == null) {
            this.i = new AMapLocationClientOption();
        }
        this.l.a(this.f5673a, this.i.isNeedAddress(), this.i.isOffset(), this.d, this.c, this.b, this.E, this.Q);
        return this.l.a();
    }

    private boolean n() {
        if (this.k != 0 && fy.b() - this.k <= 20000) {
            return false;
        }
        return true;
    }

    private void o() {
        ff ffVar = this.c;
        if (ffVar != null) {
            ffVar.a(this.m);
        }
    }

    private boolean p() {
        ArrayList<eg> e = this.c.e();
        this.g = e;
        if (e == null || e.size() <= 0) {
            return true;
        }
        return false;
    }

    private void q() {
        if (this.N != null) {
            this.N = null;
        }
        StringBuilder sb = this.w;
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    private void r() {
        try {
            fh fhVar = this.e;
            if (fhVar != null) {
                fhVar.a();
            }
            d(null);
            this.O = false;
            ev evVar = this.D;
            if (evVar != null) {
                evVar.a();
            }
        } catch (Throwable th) {
            fr.a(th, "Aps", "cleanCache");
        }
    }

    public final ew a(double d, double d2) {
        try {
            String a2 = this.n.a(this.f5673a, d, d2);
            if (!a2.contains("\"status\":\"1\"")) {
                return null;
            }
            ew a3 = this.f.a(a2);
            a3.setLatitude(d);
            a3.setLongitude(d2);
            return a3;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void d() {
        if (this.o.length() > 0) {
            StringBuilder sb = this.o;
            sb.delete(0, sb.length());
        }
    }

    public final void e() {
        a aVar;
        this.E = null;
        this.x = false;
        this.y = false;
        fh fhVar = this.e;
        if (fhVar != null) {
            fhVar.b(this.f5673a);
        }
        ev evVar = this.D;
        if (evVar != null) {
            evVar.a();
        }
        if (this.f != null) {
            this.f = null;
        }
        fd fdVar = this.Q;
        if (fdVar != null) {
            fdVar.a(this.H);
        }
        try {
            Context context = this.f5673a;
            if (!(context == null || (aVar = this.h) == null)) {
                context.unregisterReceiver(aVar);
            }
        } catch (Throwable th) {
            try {
                fr.a(th, "Aps", "destroy");
            } finally {
                this.h = null;
            }
        }
        fb fbVar = this.d;
        if (fbVar != null) {
            fbVar.a(this.H);
        }
        ff ffVar = this.c;
        if (ffVar != null) {
            ffVar.c(this.H);
        }
        ArrayList<eg> arrayList = this.g;
        if (arrayList != null) {
            arrayList.clear();
        }
        ey eyVar = this.A;
        if (eyVar != null) {
            eyVar.f();
        }
        this.j = null;
        this.f5673a = null;
        this.w = null;
        this.J = null;
    }

    public final void f() {
        es esVar = this.T;
        if (esVar != null) {
            esVar.d();
        }
    }

    public final void g() {
        try {
            Context context = this.f5673a;
            if (context != null) {
                if (this.T == null) {
                    this.T = new es(context);
                }
                this.T.a(this.d, this.c, this.P);
            }
        } catch (Throwable th) {
            av.b(th, "as", "stc");
        }
    }

    public final void h() {
        es esVar = this.T;
        if (esVar != null) {
            esVar.a();
        }
    }

    private static ew a(int i, String str) {
        ew ewVar = new ew("");
        ewVar.setErrorCode(i);
        ewVar.setLocationDetail(str);
        if (i == 15) {
            fw.a((String) null, 2151);
        }
        return ewVar;
    }

    private void d(ew ewVar) {
        if (ewVar != null) {
            this.j = ewVar;
        }
    }

    public final void b() {
        this.n = fm.a(this.f5673a);
        i();
        if (this.b == null) {
            this.b = (ConnectivityManager) fy.a(this.f5673a, "connectivity");
        }
        if (this.l == null) {
            this.l = new fp();
        }
    }

    public final void c() {
        if (this.A == null) {
            this.A = new ey(this.f5673a);
        }
        l();
        this.c.b(false);
        this.g = this.c.e();
        this.d.a(false, p());
        this.e.a(this.f5673a);
        b(this.f5673a);
        this.y = true;
    }

    private void b(Context context) {
        try {
            if (context.checkCallingOrSelfPermission(x.c("EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFQ1VSRV9TRVRUSU5HUw==")) == 0) {
                this.m = true;
            }
        } catch (Throwable unused) {
        }
    }

    private static void c(ew ewVar) {
        if (ewVar.getErrorCode() != 0 || ewVar.getLocationType() != 0) {
            return;
        }
        if ("-5".equals(ewVar.d()) || "1".equals(ewVar.d()) || "2".equals(ewVar.d()) || "14".equals(ewVar.d()) || AgooConstants.REPORT_NOT_ENCRYPT.equals(ewVar.d()) || "-1".equals(ewVar.d())) {
            ewVar.setLocationType(5);
        } else {
            ewVar.setLocationType(6);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:49|(1:51)(2:53|(1:55)(9:56|(1:58)|88|59|(2:62|(1:64)(2:66|(1:68)(2:69|(1:71)(1:72))))|73|(3:75|(1:81)(1:79)|80)|82|83))|52|88|59|(2:62|(0)(0))|73|(0)|82|83) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:20|(2:22|(1:24)(1:25))|26|(2:86|27)|(6:32|36|84|38|41|(2:43|44)(2:45|(2:47|48)(10:49|(1:51)(2:53|(1:55)(9:56|(1:58)|88|59|(2:62|(1:64)(2:66|(1:68)(2:69|(1:71)(1:72))))|73|(3:75|(1:81)(1:79)|80)|82|83))|52|88|59|(2:62|(0)(0))|73|(0)|82|83)))|35|36|84|38|41|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
        com.loc.fr.a(r0, "Aps", "getLocation getCgiListParam");
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167 A[Catch: all -> 0x016b, TryCatch #2 {all -> 0x016b, blocks: (B:59:0x0157, B:62:0x015d, B:64:0x0167, B:68:0x0173, B:71:0x017d, B:72:0x0182), top: B:88:0x0157 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.loc.ew a(com.loc.eq r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.er.a(com.loc.eq):com.loc.ew");
    }

    public final ew a(ew ewVar) {
        this.D.a(this.s);
        return this.D.a(ewVar);
    }

    public final void b(eq eqVar) {
        try {
        } catch (Throwable th) {
            fr.a(th, "Aps", "initFirstLocateParam");
        }
        if (!this.x) {
            q();
            if (this.t) {
                l();
            }
            this.c.b(this.t);
            this.g = this.c.e();
            this.d.a(true, p());
            String c = c(eqVar);
            this.N = c;
            if (!TextUtils.isEmpty(c)) {
                this.w = a(this.w);
            }
            this.x = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ff ffVar;
            ff ffVar2;
            if (context != null && intent != null) {
                try {
                    String action = intent.getAction();
                    if (!TextUtils.isEmpty(action)) {
                        if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                            ff ffVar3 = er.this.c;
                            if (ffVar3 != null) {
                                ffVar3.i();
                            }
                            try {
                                if (intent.getExtras() != null && intent.getExtras().getBoolean("resultsUpdated", true) && (ffVar2 = er.this.c) != null) {
                                    ffVar2.h();
                                }
                            } catch (Throwable unused) {
                            }
                        } else if (action.equals("android.net.wifi.WIFI_STATE_CHANGED") && (ffVar = er.this.c) != null) {
                            ffVar.j();
                        }
                    }
                } catch (Throwable th) {
                    fr.a(th, "Aps", "onReceive");
                }
            }
        }
    }

    private ew a(ew ewVar, bu buVar, eq eqVar) {
        if (buVar != null) {
            try {
                byte[] bArr = buVar.f5615a;
                if (!(bArr == null || bArr.length == 0)) {
                    fo foVar = new fo();
                    String str = new String(buVar.f5615a, "UTF-8");
                    if (str.contains("\"status\":\"0\"")) {
                        ew a2 = foVar.a(str, this.f5673a, buVar, eqVar);
                        a2.h(this.w.toString());
                        return a2;
                    } else if (!str.contains("</body></html>")) {
                        return null;
                    } else {
                        ewVar.setErrorCode(5);
                        ff ffVar = this.c;
                        if (ffVar == null || !ffVar.a(this.b)) {
                            eqVar.f("#0502");
                            this.o.append("请求可能被劫持了#0502");
                            fw.a((String) null, 2052);
                        } else {
                            eqVar.f("#0501");
                            this.o.append("您连接的是一个需要登录的网络，请确认已经登入网络#0501");
                            fw.a((String) null, (int) iuf.DEAMON_JOB_ID);
                        }
                        ewVar.setLocationDetail(this.o.toString());
                        return ewVar;
                    }
                }
            } catch (Throwable th) {
                ewVar.setErrorCode(4);
                fr.a(th, "Aps", "checkResponseEntity");
                eqVar.f("#0403");
                StringBuilder sb = this.o;
                sb.append("check response exception ex is" + th.getMessage() + "#0403");
                ewVar.setLocationDetail(this.o.toString());
                return ewVar;
            }
        }
        ewVar.setErrorCode(4);
        this.o.append("网络异常,请求异常#0403");
        eqVar.f("#0403");
        ewVar.h(this.w.toString());
        ewVar.setLocationDetail(this.o.toString());
        if (buVar != null) {
            fw.a(buVar.d, 2041);
        }
        return ewVar;
    }

    public final void b(ew ewVar) {
        if (fy.a(ewVar)) {
            this.e.a(this.N, this.w, ewVar, this.f5673a, true);
        }
    }

    public final ew a(boolean z) {
        int i;
        String sb;
        if (this.c.n()) {
            i = 15;
            sb = "networkLocation has been mocked!#1502";
        } else if (TextUtils.isEmpty(this.N)) {
            i = this.z;
            sb = this.o.toString();
        } else {
            ew a2 = this.e.a(this.f5673a, this.N, this.w, true, z);
            if (fy.a(a2)) {
                d(a2);
            }
            return a2;
        }
        return a(i, sb);
    }

    public final ew a(boolean z, eq eqVar) {
        eqVar.e(z ? Ba.c : "first");
        if (this.f5673a == null) {
            eqVar.f("#0101");
            this.o.append("context is null#0101");
            fw.a((String) null, (int) vox.CLASS_2011);
            return a(1, this.o.toString());
        } else if (this.c.n()) {
            eqVar.f("#1502");
            return a(15, "networkLocation has been mocked!#1502");
        } else {
            b();
            if (TextUtils.isEmpty(this.N)) {
                return a(this.z, this.o.toString());
            }
            ew b = b(z, eqVar);
            if (fy.a(b) && !S) {
                this.e.a(this.w.toString());
                this.e.a(this.d.e());
                d(b);
            }
            S = true;
            return b;
        }
    }

    private StringBuilder a(StringBuilder sb) {
        if (sb == null) {
            sb = new StringBuilder(700);
        } else {
            sb.delete(0, sb.length());
        }
        sb.append(this.d.m());
        sb.append(this.c.o());
        return sb;
    }

    public final void a() {
        fb fbVar = this.d;
        if (fbVar != null) {
            fbVar.b();
        }
    }

    public final void a(Context context) {
        try {
            if (this.f5673a == null) {
                this.D = new ev();
                Context applicationContext = context.getApplicationContext();
                this.f5673a = applicationContext;
                fy.b(applicationContext);
                if (this.c == null) {
                    this.c = new ff(this.f5673a, (WifiManager) fy.a(this.f5673a, "wifi"), this.P);
                }
                if (this.d == null) {
                    this.d = new fb(this.f5673a, this.P);
                }
                this.Q = new fd(context, this.P);
                if (this.e == null) {
                    this.e = new fh();
                }
                if (this.f == null) {
                    this.f = new fo();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            fr.a(th, "Aps", "initBase");
        }
    }

    public final void a(Handler handler) {
        this.P = handler;
    }

    public final void a(AMapLocation aMapLocation) {
        if (aMapLocation.getErrorCode() == 0) {
            fc fcVar = new fc();
            fcVar.f5693a = aMapLocation.getLocationType();
            fcVar.d = aMapLocation.getTime();
            fcVar.e = (int) aMapLocation.getAccuracy();
            fcVar.b = aMapLocation.getLatitude();
            fcVar.c = aMapLocation.getLongitude();
            if (aMapLocation.getLocationType() == 1) {
                this.Q.a(fcVar);
            }
        }
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.i = aMapLocationClientOption;
        if (aMapLocationClientOption == null) {
            this.i = new AMapLocationClientOption();
        }
        ff ffVar = this.c;
        if (ffVar != null) {
            this.i.isWifiActiveScan();
            ffVar.a(this.i.isWifiScan(), this.i.isMockEnable(), AMapLocationClientOption.isOpenAlwaysScanWifi(), aMapLocationClientOption.getScanWifiInterval());
        }
        i();
        fh fhVar = this.e;
        if (fhVar != null) {
            fhVar.a(this.i);
        }
        fo foVar = this.f;
        if (foVar != null) {
            foVar.a(this.i);
        }
        k();
    }

    public final void a(ew ewVar, int i) {
        if (ewVar != null && ewVar.getErrorCode() == 0) {
            fc fcVar = new fc();
            fcVar.d = ewVar.getTime();
            fcVar.e = (int) ewVar.getAccuracy();
            fcVar.b = ewVar.getLatitude();
            fcVar.c = ewVar.getLongitude();
            fcVar.f5693a = i;
            fcVar.g = Integer.parseInt(ewVar.d());
            fcVar.h = ewVar.l();
            this.Q.b(fcVar);
        }
    }

    private boolean a(long j) {
        if (!this.O) {
            this.O = true;
            return false;
        } else if (fy.b() - j >= 800) {
            return false;
        } else {
            return (fy.a(this.j) ? fy.a() - this.j.getTime() : 0L) <= 10000;
        }
    }
}
