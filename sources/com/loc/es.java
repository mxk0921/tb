package com.loc;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.alibaba.security.realidentity.f3;
import com.loc.da;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.KeyGenerator;
import tb.tbj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class es implements em {
    private static long k;

    /* renamed from: a  reason: collision with root package name */
    Context f5676a;
    dw d;
    bv e;
    private Handler g;
    private LocationManager h;
    private a i;
    private ArrayList<dc> f = new ArrayList<>();
    ff b = null;
    fb c = null;
    private volatile boolean j = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements LocationListener {

        /* renamed from: a  reason: collision with root package name */
        private es f5678a;

        public a(es esVar) {
            this.f5678a = esVar;
        }

        public final void a() {
            this.f5678a = null;
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            try {
                es esVar = this.f5678a;
                if (esVar != null) {
                    esVar.a(location);
                }
            } catch (Throwable unused) {
            }
        }

        public final void a(es esVar) {
            this.f5678a = esVar;
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends cs {
        private int b;
        private Location c;

        public b(int i) {
            this.b = i;
        }

        private void b() {
            try {
                if (this.c != null && es.this.j && !fy.m(es.this.f5676a)) {
                    Bundle extras = this.c.getExtras();
                    int i = extras != null ? extras.getInt("satellites") : 0;
                    if (!fy.a(this.c, i)) {
                        ff ffVar = es.this.b;
                        if (ffVar != null && !ffVar.s) {
                            ffVar.f();
                        }
                        ArrayList<eg> a2 = es.this.b.a();
                        List<dz> a3 = es.this.c.a();
                        da.a aVar = new da.a();
                        ef efVar = new ef();
                        efVar.i = this.c.getAccuracy();
                        efVar.f = this.c.getAltitude();
                        efVar.d = this.c.getLatitude();
                        efVar.h = this.c.getBearing();
                        efVar.e = this.c.getLongitude();
                        efVar.j = this.c.isFromMockProvider();
                        efVar.f5664a = this.c.getProvider();
                        efVar.g = this.c.getSpeed();
                        efVar.l = (byte) i;
                        efVar.b = System.currentTimeMillis();
                        efVar.c = this.c.getTime();
                        efVar.k = this.c.getTime();
                        aVar.f5651a = efVar;
                        aVar.b = a2;
                        WifiInfo c = es.this.b.c();
                        if (c != null) {
                            aVar.c = eg.a(c.getBSSID());
                        }
                        aVar.d = ff.A;
                        aVar.f = this.c.getTime();
                        aVar.g = (byte) o.i(es.this.f5676a);
                        aVar.h = o.n(es.this.f5676a);
                        aVar.e = es.this.b.k();
                        aVar.j = fy.a(es.this.f5676a);
                        aVar.i = a3;
                        dc a4 = dw.a(aVar);
                        if (a4 != null) {
                            synchronized (es.this.f) {
                                es.this.f.add(a4);
                                if (es.this.f.size() >= 5) {
                                    es.this.e();
                                }
                            }
                            es.this.d();
                        }
                    }
                }
            } catch (Throwable th) {
                fr.a(th, "cl", "coll");
            }
        }

        private void c() {
            if (!fy.m(es.this.f5676a)) {
                List list = null;
                try {
                    long unused = es.k = System.currentTimeMillis();
                    if (es.this.e.f.c()) {
                        list = bl.a(new File(es.this.e.f5616a), es.this.e.b);
                        ArrayList arrayList = new ArrayList();
                        byte[] a2 = es.a(128);
                        if (a2 == null) {
                            try {
                                list.close();
                                return;
                            } catch (Throwable unused2) {
                                return;
                            }
                        } else {
                            list = es.b(list, es.this.e, arrayList, a2);
                            if (!(list == null || list.size() == 0)) {
                                es.this.e.f.a(true);
                                if (dw.a(x.b(dw.a(fg.a(a2), p.b(a2, dw.a(), x.c()), list)))) {
                                    es.b(list, arrayList);
                                }
                            }
                            try {
                                return;
                            } catch (Throwable unused3) {
                                return;
                            }
                        }
                    }
                    if (list != null) {
                        try {
                            list.close();
                        } catch (Throwable unused4) {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        av.b(th, "leg", "uts");
                        if (list != null) {
                            try {
                                list.close();
                            } catch (Throwable unused5) {
                            }
                        }
                    } finally {
                        if (list != null) {
                            try {
                                list.close();
                            } catch (Throwable unused6) {
                            }
                        }
                    }
                }
            }
        }

        @Override // com.loc.cs
        public final void a() {
            int i = this.b;
            if (i == 1) {
                b();
            } else if (i == 2) {
                c();
            } else if (i == 3) {
                es.this.g();
            }
        }

        public b(es esVar, Location location) {
            this(1);
            this.c = location;
        }
    }

    public es(Context context) {
        this.f5676a = null;
        this.f5676a = context;
        bv bvVar = new bv();
        this.e = bvVar;
        cb.a(this.f5676a, bvVar, at.k, 100, f3.d, "0");
        bv bvVar2 = this.e;
        int i = fq.g;
        boolean z = fq.e;
        int i2 = fq.f;
        bvVar2.f = new cn(context, i, "kKey", new cl(context, z, i2, i2 * 10, "carrierLocKey"));
        this.e.e = new be();
    }

    private static int a(byte[] bArr) {
        return ((bArr[0] & 255) << 24) | (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ArrayList<dc> arrayList;
        try {
            if (!(fy.m(this.f5676a) || (arrayList = this.f) == null || arrayList.size() == 0)) {
                ArrayList arrayList2 = new ArrayList();
                synchronized (this.f) {
                    arrayList2.addAll(this.f);
                    this.f.clear();
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] a2 = a(256);
                if (a2 != null) {
                    byteArrayOutputStream.write(c(a2.length));
                    byteArrayOutputStream.write(a2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        dc dcVar = (dc) it.next();
                        byte[] b2 = dcVar.b();
                        if (b2.length >= 10 && b2.length <= 65535) {
                            byte[] b3 = p.b(a2, b2, x.c());
                            byteArrayOutputStream.write(c(b3.length));
                            byteArrayOutputStream.write(b3);
                            byteArrayOutputStream.write(b(dcVar.a()));
                        }
                    }
                    bw.a(Long.toString(System.currentTimeMillis()), byteArrayOutputStream.toByteArray(), this.e);
                }
            }
        } catch (Throwable th) {
            fr.a(th, "clm", "wtD");
        }
    }

    public final void c() {
        fb fbVar;
        try {
            if (this.d != null && (fbVar = this.c) != null) {
                dw.a(fbVar.a());
            }
        } catch (Throwable th) {
            fr.a(th, "cl", "upc");
        }
    }

    public final void d() {
        try {
            if (!fy.m(this.f5676a) && System.currentTimeMillis() - k >= 60000) {
                cr.a().b(new b(2));
            }
        } catch (Throwable unused) {
        }
    }

    public final void e() {
        try {
            cr.a().b(new b(3));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r9 != null) goto L_0x003b;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.loc.dc> b(com.loc.bl r17, com.loc.bv r18, java.util.List<java.lang.String> r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.es.b(com.loc.bl, com.loc.bv, java.util.List, byte[]):java.util.List");
    }

    private static byte[] c(int i) {
        return new byte[]{(byte) ((i & 65280) >> 8), (byte) (i & 255)};
    }

    @Override // com.loc.em
    public final el a(ek ekVar) {
        try {
            fl flVar = new fl();
            flVar.a(ekVar.b);
            flVar.b(ekVar.f5667a);
            flVar.a(ekVar.d);
            bo.a();
            bu a2 = bo.a(flVar);
            el elVar = new el();
            elVar.c = a2.f5615a;
            elVar.b = a2.b;
            elVar.f5668a = 200;
            return elVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void b() {
        try {
            Handler handler = this.g;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.loc.es.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ff ffVar;
                        try {
                            es esVar = es.this;
                            if (esVar.d != null && (ffVar = esVar.b) != null) {
                                dw.b(ffVar.a());
                            }
                        } catch (Throwable th) {
                            fr.a(th, "cl", "upwr");
                        }
                    }
                });
            }
        } catch (Throwable th) {
            fr.a(th, "cl", "upw");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(bl blVar, List<String> list) {
        if (blVar != null) {
            try {
                for (String str : list) {
                    blVar.c(str);
                }
                blVar.close();
            } catch (Throwable th) {
                av.b(th, "aps", "dlo");
            }
        }
    }

    private static byte[] b(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public final void a() {
        LocationManager locationManager;
        if (!fy.m(this.f5676a)) {
            try {
                a aVar = this.i;
                if (!(aVar == null || (locationManager = this.h) == null)) {
                    locationManager.removeUpdates(aVar);
                }
                a aVar2 = this.i;
                if (aVar2 != null) {
                    aVar2.a();
                }
                if (this.j) {
                    g();
                    this.b.a((es) null);
                    this.c.a((es) null);
                    this.c = null;
                    this.b = null;
                    this.g = null;
                    this.j = false;
                }
            } catch (Throwable th) {
                fr.a(th, "clm", "stc");
            }
        }
    }

    public final void a(Location location) {
        try {
            Handler handler = this.g;
            if (handler != null) {
                handler.post(new b(this, location));
            }
        } catch (Throwable th) {
            av.b(th, "cl", "olcc");
        }
    }

    public final void a(fb fbVar, ff ffVar, Handler handler) {
        LocationManager locationManager;
        if (!this.j && fbVar != null && ffVar != null && handler != null && !fy.m(this.f5676a)) {
            this.j = true;
            this.c = fbVar;
            this.b = ffVar;
            ffVar.a(this);
            this.c.a(this);
            this.g = handler;
            try {
                if (this.h == null) {
                    this.h = (LocationManager) this.f5676a.getSystemService("location");
                }
                if (this.i == null) {
                    this.i = new a(this);
                }
                this.i.a(this);
                a aVar = this.i;
                if (!(aVar == null || (locationManager = this.h) == null)) {
                    locationManager.requestLocationUpdates(tbj.REQUEST_PASSIVE, 1000L, -1.0f, aVar);
                }
                if (this.d == null) {
                    dw dwVar = new dw("6.2.0", l.f(this.f5676a), "S128DF1572465B890OE3F7A13167KLEI", l.c(this.f5676a), this);
                    this.d = dwVar;
                    dwVar.a(o.k()).b(o.f(this.f5676a)).c(o.a(this.f5676a)).d(o.e(this.f5676a)).e(o.n()).f(o.f()).g(Build.MODEL).h(Build.MANUFACTURER).i(Build.BRAND).a(Build.VERSION.SDK_INT).j(Build.VERSION.RELEASE).a(eg.a(o.h())).k(o.h());
                    dw.b();
                }
            } catch (Throwable th) {
                fr.a(th, "col", "init");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] a(int i) {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            if (instance == null) {
                return null;
            }
            instance.init(i);
            return instance.generateKey().getEncoded();
        } catch (Throwable unused) {
            return null;
        }
    }
}
