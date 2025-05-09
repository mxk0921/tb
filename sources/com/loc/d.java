package com.loc;

import android.app.Application;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.location.AMapLocationQualityReport;
import com.amap.api.location.APSService;
import com.amap.api.location.UmidtokenInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bmv;
import tb.vu3;
import tb.yah;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class d {
    private static boolean G = true;
    private static boolean I;
    private static AtomicBoolean J = new AtomicBoolean(false);
    public static volatile boolean g;
    private Context C;
    private g D;

    /* renamed from: a  reason: collision with root package name */
    ew f5643a;
    public c c;
    j j;
    Intent m;
    AMapLocationClientOption b = new AMapLocationClientOption();
    h d = null;
    private boolean E = false;
    private volatile boolean F = false;
    ArrayList<AMapLocationListener> e = new ArrayList<>();
    boolean f = false;
    public boolean h = true;
    public boolean i = true;
    Messenger k = null;
    Messenger l = null;
    int n = 0;
    private boolean H = true;
    b o = null;
    boolean p = false;
    AMapLocationClientOption.AMapLocationMode q = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
    Object r = new Object();
    fw s = null;
    boolean t = false;
    e u = null;
    private AMapLocationClientOption K = new AMapLocationClientOption();
    private i L = null;
    String v = null;
    private ServiceConnection M = new ServiceConnection() { // from class: com.loc.d.2
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                d.this.k = new Messenger(iBinder);
                d.this.E = true;
                d.this.t = true;
            } catch (Throwable th) {
                fr.a(th, "ALManager", "onServiceConnected");
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            d dVar = d.this;
            dVar.k = null;
            dVar.E = false;
        }
    };
    AMapLocationQualityReport w = null;
    boolean x = false;
    boolean y = false;
    private volatile boolean N = false;
    a z = null;
    String A = null;
    boolean B = false;

    /* compiled from: Taobao */
    /* renamed from: com.loc.d$3  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5646a;

        static {
            int[] iArr = new int[AMapLocationClientOption.AMapLocationMode.values().length];
            f5646a = iArr;
            try {
                iArr[AMapLocationClientOption.AMapLocationMode.Battery_Saving.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5646a[AMapLocationClientOption.AMapLocationMode.Device_Sensors.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5646a[AMapLocationClientOption.AMapLocationMode.Hight_Accuracy.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r7) {
            /*
                Method dump skipped, instructions count: 372
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.d.a.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        d f5648a;

        public b(String str, d dVar) {
            super(str);
            this.f5648a = dVar;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            try {
                this.f5648a.j.a();
                fv.a(this.f5648a.C);
                this.f5648a.p();
                d dVar = this.f5648a;
                if (!(dVar == null || dVar.C == null)) {
                    fq.b(this.f5648a.C);
                    fq.a(this.f5648a.C);
                }
                super.onLooperPrepared();
            } catch (Throwable unused) {
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends Handler {
        public c() {
        }

        public c(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            c cVar;
            c cVar2;
            String str = null;
            try {
                super.handleMessage(message);
                d dVar = d.this;
                if (!dVar.p) {
                    int i = message.what;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 13) {
                                switch (i) {
                                    case 5:
                                        Bundle data = message.getData();
                                        data.putBundle("optBundle", fr.a(d.this.b));
                                        d.this.a(10, data);
                                        return;
                                    case 6:
                                        Bundle data2 = message.getData();
                                        h hVar = d.this.d;
                                        if (hVar != null) {
                                            hVar.a(data2);
                                            return;
                                        }
                                        return;
                                    case 7:
                                        d.this.H = message.getData().getBoolean("ngpsAble");
                                        return;
                                    case 8:
                                        fw.a((String) null, 2141);
                                        break;
                                    case 9:
                                        boolean unused = d.I = message.getData().getBoolean("installMockApp");
                                        return;
                                    case 10:
                                        dVar.a((AMapLocation) message.obj);
                                        return;
                                    default:
                                        switch (i) {
                                            case 100:
                                                fw.a((String) null, 2155);
                                                break;
                                            case 101:
                                                break;
                                            case 102:
                                                Bundle data3 = message.getData();
                                                data3.putBundle("optBundle", fr.a(d.this.b));
                                                d.this.a(15, data3);
                                                return;
                                            case 103:
                                                Bundle data4 = message.getData();
                                                if (d.this.D != null) {
                                                    d.this.D.a(data4);
                                                    return;
                                                }
                                                return;
                                            default:
                                                return;
                                        }
                                        Message obtain = Message.obtain();
                                        obtain.what = yj4.VIEW_TYPE_NEW_HOMEPAGE_ONLOOK_HEAD;
                                        obtain.obj = message.obj;
                                        d.this.z.sendMessage(obtain);
                                        if (d.this.K != null && d.this.K.getCacheCallBack() && (cVar2 = d.this.c) != null) {
                                            cVar2.removeMessages(13);
                                            return;
                                        }
                                        return;
                                }
                            } else {
                                ew ewVar = dVar.f5643a;
                                if (ewVar != null) {
                                    dVar.a(ewVar);
                                    return;
                                }
                                AMapLocation aMapLocation = new AMapLocation("LBS");
                                aMapLocation.setErrorCode(33);
                                d.this.a(aMapLocation);
                                return;
                            }
                        }
                        Message obtain2 = Message.obtain();
                        obtain2.what = 12;
                        obtain2.obj = message.obj;
                        d.this.z.sendMessage(obtain2);
                        if (d.this.K != null && d.this.K.getCacheCallBack() && (cVar = d.this.c) != null) {
                            cVar.removeMessages(13);
                            return;
                        }
                        return;
                    }
                    Message obtainMessage = dVar.z.obtainMessage();
                    obtainMessage.what = 11;
                    obtainMessage.setData(message.getData());
                    d.this.z.sendMessage(obtainMessage);
                }
            } catch (Throwable th) {
                if (0 == 0) {
                    str = "handleMessage";
                }
                fr.a(th, "AmapLocationManager$MainHandler", str);
            }
        }
    }

    public d(Context context, Intent intent, Looper looper) {
        this.m = null;
        this.C = context;
        this.m = intent;
        b(looper);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:2|(11:94|3|4|(1:6)|7|(1:9)|10|11|12|(3:14|(2:16|(2:19|(2:21|(1:25)))(1:18))|27)(1:26)|28)|(4:(18:30|88|31|(2:33|(1:35))|37|(3:92|45|46)(1:48)|49|(1:53)|80|54|(1:58)|59|(1:61)|62|(1:64)|(1:69)|82|70)(1:43)|82|70|(2:(0)|(1:83)))|40|(0)(0)|49|(2:51|53)|80|54|(2:56|58)|59|(0)|62|(0)|(2:67|69)) */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0108 A[Catch: all -> 0x011e, TryCatch #11 {all -> 0x00cf, blocks: (B:45:0x00c3, B:67:0x0132, B:69:0x0136, B:49:0x00d3, B:51:0x00db, B:53:0x00df, B:59:0x0101, B:61:0x0108, B:62:0x0120, B:64:0x0125), top: B:92:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125 A[Catch: all -> 0x011e, TRY_LEAVE, TryCatch #11 {all -> 0x00cf, blocks: (B:45:0x00c3, B:67:0x0132, B:69:0x0136, B:49:0x00d3, B:51:0x00db, B:53:0x00df, B:59:0x0101, B:61:0x0108, B:62:0x0120, B:64:0x0125), top: B:92:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.loc.ew b(com.loc.er r14) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.d.b(com.loc.er):com.loc.ew");
    }

    private void h() {
        synchronized (this.r) {
            try {
                a aVar = this.z;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages(null);
                }
                this.z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        try {
            int i = Build.VERSION.SDK_INT;
            if (i < 29) {
                if (i >= 23) {
                    if (!fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=")) {
                        if (fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")) {
                        }
                        k();
                    }
                }
            }
            if ((i >= 31 || i < 29 || this.C.getApplicationInfo().targetSdkVersion < 29 || fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")) && ((i >= 31 || i < 29 || this.C.getApplicationInfo().targetSdkVersion >= 29 || fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") || fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")) && (i < 31 || fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=") || fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O")))) {
                if (this.b == null) {
                    this.b = new AMapLocationClientOption();
                }
                if (!this.F) {
                    this.F = true;
                    int i2 = AnonymousClass3.f5646a[this.b.getLocationMode().ordinal()];
                    long j = 0;
                    if (i2 == 1) {
                        a(1027, (Object) null, 0L);
                        a(1017, (Object) null, 0L);
                        a(1016, (Object) null, 0L);
                        return;
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            if (fy.m(this.C)) {
                                a(1016);
                                a(1017, (Object) null, 0L);
                                a(1026, (Object) null, 0L);
                                return;
                            }
                            a(1027, (Object) null, 0L);
                            a(1015, (Object) null, 0L);
                            if (this.b.isGpsFirst() && this.b.isOnceLocation()) {
                                j = this.b.getGpsFirstTimeout();
                            }
                            a(1016, (Object) null, j);
                        }
                        return;
                    } else if (fy.m(this.C)) {
                        a(1016);
                        a(1017, (Object) null, 0L);
                        a(1026, (Object) null, 0L);
                        return;
                    } else {
                        a(1016);
                        a(1027, (Object) null, 0L);
                        a(1015, (Object) null, 0L);
                        return;
                    }
                } else {
                    return;
                }
            }
            k();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void k() {
        AMapLocation aMapLocation = new AMapLocation("");
        aMapLocation.setErrorCode(12);
        aMapLocation.setLocationDetail("定位权限被禁用,请授予应用定位权限 #1201");
        if (this.w == null) {
            this.w = new AMapLocationQualityReport();
        }
        AMapLocationQualityReport aMapLocationQualityReport = new AMapLocationQualityReport();
        this.w = aMapLocationQualityReport;
        aMapLocationQualityReport.setGpsStatus(4);
        this.w.setGPSSatellites(0);
        this.w.setLocationMode(this.b.getLocationMode());
        this.w.setWifiAble(fy.g(this.C));
        this.w.setNetworkType(fy.h(this.C));
        this.w.setNetUseTime(0L);
        aMapLocation.setLocationQualityReport(this.w);
        fw.a((String) null, 2121);
        d(aMapLocation);
    }

    private void m() {
        String str;
        ew b2 = b(new er(true));
        if (i()) {
            Bundle bundle = new Bundle();
            if (b2 == null || !(b2.getLocationType() == 2 || b2.getLocationType() == 4)) {
                str = "0";
            } else {
                str = "1";
            }
            bundle.putBundle("optBundle", fr.a(this.b));
            bundle.putString("isCacheLoc", str);
            a(0, bundle);
            if (this.F) {
                a(13, (Bundle) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            if (G || (!this.t && !this.N)) {
                G = false;
                this.N = true;
                m();
            } else {
                if (this.t && !a() && !this.y) {
                    this.y = true;
                    p();
                }
                if (i()) {
                    this.y = false;
                    Bundle bundle = new Bundle();
                    bundle.putBundle("optBundle", fr.a(this.b));
                    bundle.putString("d", UmidtokenInfo.getUmidtoken());
                    if (!this.d.b()) {
                        a(1, bundle);
                    }
                }
            }
        } catch (Throwable th) {
            try {
                fr.a(th, "ALManager", "doLBSLocation");
                try {
                    if (!this.b.isOnceLocation()) {
                        o();
                    }
                } catch (Throwable unused) {
                }
            } finally {
                try {
                    if (!this.b.isOnceLocation()) {
                        o();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private void o() {
        if (this.b.getLocationMode() != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
            long j = 1000;
            if (this.b.getInterval() >= 1000) {
                j = this.b.getInterval();
            }
            a(1016, (Object) null, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        try {
            if (this.l == null) {
                this.l = new Messenger(this.c);
            }
            a(q());
        } catch (Throwable unused) {
        }
    }

    private Intent q() {
        String str;
        if (this.m == null) {
            this.m = new Intent(this.C, APSService.class);
        }
        try {
            if (!TextUtils.isEmpty(AMapLocationClientOption.getAPIKEY())) {
                str = AMapLocationClientOption.getAPIKEY();
            } else {
                str = l.f(this.C);
            }
        } catch (Throwable th) {
            fr.a(th, "ALManager", "startServiceImpl p2");
            str = "";
        }
        this.m.putExtra("a", str);
        this.m.putExtra(TplMsg.VALUE_T_NATIVE_RETURN, l.c(this.C));
        this.m.putExtra("d", UmidtokenInfo.getUmidtoken());
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        try {
            new eq().f("#2001");
            fw.a((String) null, 2153);
            ew ewVar = new ew("");
            ewVar.setErrorCode(20);
            ewVar.setLocationDetail("模糊权限下不支持低功耗定位#2001");
            g(ewVar);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "apsLocation:callback");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        fw fwVar;
        Context context;
        int i;
        this.d.b(this.b);
        this.D.b(this.b);
        if (this.F && !this.b.getLocationMode().equals(this.q)) {
            l();
            j();
        }
        this.q = this.b.getLocationMode();
        if (this.s != null) {
            if (this.b.isOnceLocation()) {
                fwVar = this.s;
                context = this.C;
                i = 0;
            } else {
                fwVar = this.s;
                context = this.C;
                i = 1;
            }
            fwVar.a(context, i);
            this.s.a(this.C, this.b);
        }
    }

    private boolean t() {
        int i;
        if (fy.j(this.C)) {
            try {
                i = fu.b(((Application) this.C.getApplicationContext()).getBaseContext(), "checkSelfPermission", "android.permission.FOREGROUND_SERVICE");
            } catch (Throwable unused) {
                i = -1;
            }
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        try {
            i iVar = this.L;
            if (iVar != null) {
                iVar.b();
                this.L = null;
            }
            a(1011, (Object) null, 0L);
            this.p = true;
        } catch (Throwable th) {
            fr.a(th, "ALManager", "onDestroy");
        }
    }

    public final AMapLocation e() {
        AMapLocation aMapLocation = null;
        try {
            j jVar = this.j;
            if (!(jVar == null || (aMapLocation = jVar.b()) == null)) {
                aMapLocation.setTrustedLevel(3);
            }
        } catch (Throwable th) {
            fr.a(th, "ALManager", "getLastKnownLocation");
        }
        return aMapLocation;
    }

    public final void f() {
        try {
            i iVar = this.L;
            if (iVar != null) {
                iVar.b();
                this.L = null;
            }
        } catch (Throwable th) {
            fr.a(th, "ALManager", "stopAssistantLocation");
        }
    }

    public final void g() {
        a(12, (Bundle) null);
        this.h = true;
        this.i = true;
        this.E = false;
        this.t = false;
        l();
        fw fwVar = this.s;
        if (fwVar != null) {
            fwVar.b(this.C);
        }
        fv.a(this.C).a();
        fw.a(this.C);
        e eVar = this.u;
        if (eVar != null) {
            eVar.b().sendEmptyMessage(11);
        } else {
            ServiceConnection serviceConnection = this.M;
            if (serviceConnection != null) {
                this.C.unbindService(serviceConnection);
            }
        }
        try {
            if (this.B) {
                this.C.stopService(q());
            }
        } catch (Throwable unused) {
        }
        this.B = false;
        ArrayList<AMapLocationListener> arrayList = this.e;
        if (arrayList != null) {
            arrayList.clear();
            this.e = null;
        }
        this.M = null;
        h();
        b bVar = this.o;
        if (bVar != null) {
            try {
                fu.a(bVar, HandlerThread.class, "quitSafely", new Object[0]);
            } catch (Throwable unused2) {
                this.o.quit();
            }
        }
        this.o = null;
        c cVar = this.c;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
        }
        j jVar = this.j;
        if (jVar != null) {
            jVar.c();
            this.j = null;
        }
    }

    private a a(Looper looper) {
        a aVar;
        synchronized (this.r) {
            aVar = new a(looper);
            this.z = aVar;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    boolean z = data.getBoolean(at.j, true);
                    Intent q = q();
                    q.putExtra(at.j, z);
                    q.putExtra(at.f, 2);
                    a(q, false);
                }
            } catch (Throwable th) {
                fr.a(th, "ALManager", "doDisableBackgroundLocation");
            }
        }
    }

    private synchronized void e(AMapLocation aMapLocation) {
        if (aMapLocation == null) {
            try {
                aMapLocation = new AMapLocation("");
                aMapLocation.setErrorCode(8);
                aMapLocation.setLocationDetail("coarse amapLocation is null#2005");
            } catch (Throwable th) {
                fr.a(th, "ALManager", "handlerCoarseLocation part2");
                return;
            }
        }
        if (this.w == null) {
            this.w = new AMapLocationQualityReport();
        }
        this.w.setLocationMode(this.b.getLocationMode());
        if (this.D != null) {
            this.w.setGPSSatellites(aMapLocation.getSatellites());
            this.w.setGpsStatus(this.D.b());
        }
        this.w.setWifiAble(fy.g(this.C));
        this.w.setNetworkType(fy.h(this.C));
        this.w.setNetUseTime(0L);
        this.w.setInstallHighDangerMockApp(I);
        aMapLocation.setLocationQualityReport(this.w);
        if (this.F) {
            fw.a(this.C, aMapLocation);
            d(aMapLocation.clone());
            fv.a(this.C).a(aMapLocation);
            fv.a(this.C).b();
        }
        if (!this.p) {
            if (this.D != null) {
                l();
            }
            a(14, (Bundle) null);
        }
    }

    private void f(AMapLocation aMapLocation) {
        AMapLocation aMapLocation2;
        if (aMapLocation != null) {
            try {
                fi fiVar = j.b;
                if (fiVar == null) {
                    j jVar = this.j;
                    aMapLocation2 = jVar != null ? jVar.b() : null;
                } else {
                    aMapLocation2 = fiVar.a();
                }
                fw.a(aMapLocation2, aMapLocation);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(AMapLocation aMapLocation) {
        try {
            if (this.i && this.k != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", fr.a(this.b));
                a(0, bundle);
                if (this.F) {
                    a(13, (Bundle) null);
                }
                this.i = false;
            }
            e(aMapLocation);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "resultGpsLocationSuccess");
        }
    }

    private boolean i() {
        boolean z = false;
        int i = 0;
        do {
            try {
                if (this.k != null) {
                    break;
                }
                Thread.sleep(100L);
                i++;
            } catch (Throwable th) {
                fr.a(th, "ALManager", "checkAPSManager");
            }
        } while (i < 50);
        if (this.k == null) {
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            AMapLocation aMapLocation = new AMapLocation("");
            aMapLocation.setErrorCode(10);
            aMapLocation.setLocationDetail(!fy.k(this.C.getApplicationContext()) ? "请检查配置文件是否配置服务，并且manifest中service标签是否配置在application标签内#1003" : "启动ApsServcie失败#1001");
            bundle.putParcelable(MspEventTypes.ACTION_INVOKE_LOC, aMapLocation);
            obtain.setData(bundle);
            obtain.what = 1;
            this.c.sendMessage(obtain);
        } else {
            z = true;
        }
        if (!z) {
            fw.a((String) null, !fy.k(this.C.getApplicationContext()) ? 2103 : 2101);
        }
        return z;
    }

    public final void c() {
        try {
            a(1004, (Object) null, 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "stopLocation");
        }
    }

    private ew a(er erVar, boolean z) {
        if (!this.b.isLocationCacheEnable()) {
            return null;
        }
        try {
            return erVar.a(z);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "doFirstCacheLoc");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    int i = data.getInt(bmv.MSGTYPE_INTERVAL, 0);
                    Intent q = q();
                    q.putExtra(bmv.MSGTYPE_INTERVAL, i);
                    q.putExtra("h", (Notification) data.getParcelable("h"));
                    q.putExtra(at.f, 1);
                    a(q, true);
                }
            } catch (Throwable th) {
                fr.a(th, "ALManager", "doEnableBackgroundLocation");
            }
        }
    }

    private void d(AMapLocation aMapLocation) {
        Message obtainMessage = this.c.obtainMessage();
        obtainMessage.what = 10;
        obtainMessage.obj = aMapLocation;
        this.c.sendMessage(obtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            a(1025);
            h hVar = this.d;
            if (hVar != null) {
                hVar.a();
            }
            g gVar = this.D;
            if (gVar != null) {
                gVar.a();
            }
            a(1016);
            this.F = false;
            this.n = 0;
        } catch (Throwable th) {
            fr.a(th, "ALManager", "stopLocation");
        }
    }

    public final void b() {
        c cVar;
        try {
            if (this.K.getCacheCallBack() && (cVar = this.c) != null) {
                cVar.sendEmptyMessageDelayed(13, this.K.getCacheCallBackTime());
            }
        } catch (Throwable unused) {
        }
        try {
            a(1003, (Object) null, 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "startLocation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.r) {
            try {
                a aVar = this.z;
                if (aVar != null) {
                    aVar.removeMessages(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(Looper looper) {
        try {
            if (looper == null) {
                this.c = Looper.myLooper() == null ? new c(this.C.getMainLooper()) : new c();
            } else {
                this.c = new c(looper);
            }
        } catch (Throwable th) {
            fr.a(th, "ALManager", "init 1");
        }
        try {
            this.j = new j(this.C);
            b bVar = new b("amapLocManagerThread", this);
            this.o = bVar;
            bVar.setPriority(5);
            this.o.start();
            this.z = a(this.o.getLooper());
            try {
                this.d = new h(this.C, this.c);
                this.D = new g(this.C, this.c);
            } catch (Throwable th2) {
                fr.a(th2, "ALManager", "init 3");
            }
            if (this.s == null) {
                this.s = new fw();
            }
            a(this.C);
        }
    }

    private void c(AMapLocation aMapLocation) {
        if (aMapLocation != null) {
            try {
                String locationDetail = aMapLocation.getLocationDetail();
                StringBuilder sb = TextUtils.isEmpty(locationDetail) ? new StringBuilder() : new StringBuilder(locationDetail);
                boolean c2 = fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF");
                boolean c3 = fy.c(this.C, "WYW5kcm9pZC5wZXJtaXNzaW9uLkNIQU5HRV9XSUZJX1NUQVRF");
                boolean c4 = fy.c(this.C, "WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19MT0NBVElPTl9FWFRSQV9DT01NQU5EUw==");
                boolean c5 = fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=");
                boolean c6 = fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19GSU5FX0xPQ0FUSU9O");
                boolean c7 = fy.c(this.C, "EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04=");
                sb.append(c2 ? "#pm1" : "#pm0");
                String str = "0";
                sb.append(c3 ? "1" : str);
                sb.append(c4 ? "1" : str);
                sb.append(c5 ? "1" : str);
                sb.append(c6 ? "1" : str);
                if (c7) {
                    str = "1";
                }
                sb.append(str);
                aMapLocation.setLocationDetail(sb.toString());
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(AMapLocationListener aMapLocationListener) {
        if (!this.e.isEmpty() && this.e.contains(aMapLocationListener)) {
            this.e.remove(aMapLocationListener);
        }
        if (this.e.isEmpty()) {
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        try {
            AMapLocation aMapLocation = (AMapLocation) message.obj;
            if (this.h && this.k != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("optBundle", fr.a(this.b));
                a(0, bundle);
                if (this.F) {
                    a(13, (Bundle) null);
                }
                this.h = false;
            }
            a(aMapLocation, (eq) null);
            a(1025);
            a(1025, (Object) null, 300000L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "resultGpsLocationSuccess");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AMapLocationListener aMapLocationListener) {
        if (aMapLocationListener != null) {
            if (this.e == null) {
                this.e = new ArrayList<>();
            }
            if (!this.e.contains(aMapLocationListener)) {
                this.e.add(aMapLocationListener);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("listener参数不能为null");
    }

    public final void a(int i, Notification notification) {
        if (i != 0 && notification != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt(bmv.MSGTYPE_INTERVAL, i);
                bundle.putParcelable("h", notification);
                a(1023, bundle, 0L);
            } catch (Throwable th) {
                fr.a(th, "ALManager", "disableBackgroundLocation");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Bundle bundle) {
        if (bundle == null) {
            try {
                bundle = new Bundle();
            } catch (Throwable th) {
                boolean z = (th instanceof IllegalStateException) && th.getMessage().contains("sending message to a Handler on a dead thread");
                if ((th instanceof RemoteException) || z) {
                    this.k = null;
                    this.E = false;
                }
                fr.a(th, "ALManager", "sendLocMessage");
                return;
            }
        }
        if (TextUtils.isEmpty(this.v)) {
            this.v = fr.b(this.C);
        }
        bundle.putString("c", this.v);
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.setData(bundle);
        obtain.replyTo = this.l;
        Messenger messenger = this.k;
        if (messenger != null) {
            messenger.send(obtain);
        }
    }

    private static void b(AMapLocation aMapLocation) {
        if (aMapLocation != null) {
            try {
                if (2 == aMapLocation.getLocationType() || 4 == aMapLocation.getLocationType()) {
                    long time = aMapLocation.getTime();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis > time) {
                        aMapLocation.setTime(currentTimeMillis);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Object obj, long j) {
        synchronized (this.r) {
            try {
                if (this.z != null) {
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    if (obj instanceof Bundle) {
                        obtain.setData((Bundle) obj);
                    } else {
                        obtain.obj = obj;
                    }
                    this.z.sendMessageDelayed(obtain, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(AMapLocationListener aMapLocationListener) {
        try {
            a(1005, aMapLocationListener, 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "unRegisterLocationListener");
        }
    }

    private static void a(final Context context) {
        if (J.compareAndSet(false, true)) {
            cr.a().b(new cs() { // from class: com.loc.d.1
                @Override // com.loc.cs
                public final void a() {
                    o.l();
                    o.a(context);
                    o.f(context);
                }
            });
        }
    }

    private void a(Intent intent) {
        try {
            this.C.bindService(intent, this.M, 1);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "startServiceImpl");
        }
    }

    private void a(Intent intent, boolean z) {
        Context context = this.C;
        if (context != null) {
            if (Build.VERSION.SDK_INT < 26 || !z) {
                context.startService(intent);
            } else if (!t()) {
                Log.e("amapapi", "-------------调用后台定位服务，缺少权限：android.permission.FOREGROUND_SERVICE--------------");
                return;
            } else {
                try {
                    this.C.getClass().getMethod("startForegroundService", Intent.class).invoke(this.C, intent);
                } catch (Throwable unused) {
                    this.C.startService(intent);
                }
            }
            this.B = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        eq eqVar;
        AMapLocation aMapLocation;
        h hVar;
        AMapLocation aMapLocation2 = null;
        if (bundle != null) {
            try {
                bundle.setClassLoader(AMapLocation.class.getClassLoader());
                aMapLocation = (AMapLocation) bundle.getParcelable(MspEventTypes.ACTION_INVOKE_LOC);
                this.A = bundle.getString("nb");
                eqVar = (eq) bundle.getParcelable(Ba.c);
                if (aMapLocation != null) {
                    try {
                        if (aMapLocation.getErrorCode() == 0 && (hVar = this.d) != null) {
                            hVar.c();
                            if (!TextUtils.isEmpty(aMapLocation.getAdCode())) {
                                h.y = aMapLocation;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        fr.a(th, "AmapLocationManager", "resultLbsLocationSuccess");
                        a(aMapLocation2, eqVar);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                eqVar = null;
                fr.a(th, "AmapLocationManager", "resultLbsLocationSuccess");
                a(aMapLocation2, eqVar);
            }
        } else {
            eqVar = null;
            aMapLocation = null;
        }
        h hVar2 = this.d;
        aMapLocation2 = hVar2 != null ? hVar2.a(aMapLocation, this.A) : aMapLocation;
        a(aMapLocation2, eqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        try {
            Bundle data = message.getData();
            AMapLocation aMapLocation = (AMapLocation) data.getParcelable(MspEventTypes.ACTION_INVOKE_LOC);
            String string = data.getString("lastLocNb");
            f(aMapLocation);
            if (this.j.a(aMapLocation, string)) {
                this.j.d();
            }
        } catch (Throwable th) {
            fr.a(th, "ALManager", "doSaveLastLocation");
        }
    }

    public final void a(WebView webView) {
        if (this.L == null) {
            this.L = new i(this.C, webView);
        }
        this.L.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AMapLocation aMapLocation) {
        try {
            if (aMapLocation.getErrorCode() != 0) {
                aMapLocation.setLocationType(0);
            }
            if (aMapLocation.getErrorCode() == 0) {
                double latitude = aMapLocation.getLatitude();
                double longitude = aMapLocation.getLongitude();
                if ((latitude == vu3.b.GEO_NOT_SUPPORT && longitude == vu3.b.GEO_NOT_SUPPORT) || latitude < -90.0d || latitude > 90.0d || longitude < -180.0d || longitude > 180.0d) {
                    fw.a("errorLatLng", aMapLocation.toStr());
                    aMapLocation.setLocationType(0);
                    aMapLocation.setErrorCode(8);
                    aMapLocation.setLocationDetail("LatLng is error#0802");
                }
            }
            if ("gps".equalsIgnoreCase(aMapLocation.getProvider()) || !this.d.b()) {
                aMapLocation.setAltitude(fy.c(aMapLocation.getAltitude()));
                aMapLocation.setBearing(fy.a(aMapLocation.getBearing()));
                aMapLocation.setSpeed(fy.a(aMapLocation.getSpeed()));
                c(aMapLocation);
                b(aMapLocation);
                Iterator<AMapLocationListener> it = this.e.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().onLocationChanged(aMapLocation);
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private synchronized void a(AMapLocation aMapLocation, eq eqVar) {
        if (aMapLocation == null) {
            try {
                aMapLocation = new AMapLocation("");
                aMapLocation.setErrorCode(8);
                aMapLocation.setLocationDetail("amapLocation is null#0801");
            } catch (Throwable th) {
                fr.a(th, "ALManager", "handlerLocation part3");
                return;
            }
        }
        if (!"gps".equalsIgnoreCase(aMapLocation.getProvider())) {
            aMapLocation.setProvider(yah.SP_PREFIX_KEY);
        }
        if (this.w == null) {
            this.w = new AMapLocationQualityReport();
        }
        this.w.setLocationMode(this.b.getLocationMode());
        h hVar = this.d;
        if (hVar != null) {
            this.w.setGPSSatellites(hVar.e());
            this.w.setGpsStatus(this.d.d());
        }
        this.w.setWifiAble(fy.g(this.C));
        this.w.setNetworkType(fy.h(this.C));
        if (aMapLocation.getLocationType() == 1 || "gps".equalsIgnoreCase(aMapLocation.getProvider())) {
            this.w.setNetUseTime(0L);
        }
        if (eqVar != null) {
            this.w.setNetUseTime(eqVar.a());
        }
        this.w.setInstallHighDangerMockApp(I);
        aMapLocation.setLocationQualityReport(this.w);
        if (this.F) {
            a(aMapLocation, this.A);
            if (eqVar != null) {
                eqVar.d(fy.b());
            }
            fw.a(this.C, aMapLocation, eqVar);
            fw.a(this.C, aMapLocation);
            d(aMapLocation.clone());
            fv.a(this.C).a(aMapLocation);
            fv.a(this.C).b();
        }
        if (!this.p) {
            if (this.b.isOnceLocation()) {
                l();
                a(14, (Bundle) null);
            }
        }
    }

    private void a(AMapLocation aMapLocation, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(MspEventTypes.ACTION_INVOKE_LOC, aMapLocation);
        bundle.putString("lastLocNb", str);
        a(1014, bundle, 0L);
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        try {
            this.K = aMapLocationClientOption.clone();
            a(1018, aMapLocationClientOption.clone(), 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "setLocationOption");
        }
    }

    public final void a(AMapLocationListener aMapLocationListener) {
        try {
            a(1002, aMapLocationListener, 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "setLocationListener");
        }
    }

    private static void a(er erVar) {
        try {
            erVar.d();
            erVar.a(new AMapLocationClientOption().setNeedAddress(false));
            erVar.a(true, new eq());
        } catch (Throwable th) {
            fr.a(th, "ALManager", "apsLocation:doFirstNetLocate 2");
        }
    }

    private void a(er erVar, eq eqVar) {
        try {
            erVar.a(this.C);
            erVar.a(this.b);
            erVar.b(eqVar);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "initApsBase");
        }
    }

    private static void a(er erVar, ew ewVar) {
        if (ewVar != null) {
            try {
                if (ewVar.getErrorCode() == 0) {
                    erVar.b(ewVar);
                }
            } catch (Throwable th) {
                fr.a(th, "ALManager", "apsLocation:doFirstAddCache");
            }
        }
    }

    public final void a(boolean z) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean(at.j, z);
            a(1024, bundle, 0L);
        } catch (Throwable th) {
            fr.a(th, "ALManager", "disableBackgroundLocation");
        }
    }

    public final boolean a() {
        return this.E;
    }
}
