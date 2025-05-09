package com.loc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.security.ccrc.service.build.Ba;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class e {
    static boolean g;
    Context e;
    private List<Messenger> w;
    private boolean o = false;
    private boolean p = false;

    /* renamed from: a  reason: collision with root package name */
    String f5661a = null;
    b b = null;
    private long q = 0;
    private long r = 0;
    private ew s = null;
    AMapLocation c = null;
    private long t = 0;
    private int u = 0;
    a d = null;
    private j v = null;
    er f = null;
    HashMap<Messenger, Long> h = new HashMap<>();
    fw i = null;
    long j = 0;
    long k = 0;
    String l = null;
    private boolean x = true;
    private String y = "";
    AMapLocationClientOption m = null;
    AMapLocationClientOption n = new AMapLocationClientOption();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0112 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:19:0x0052, B:20:0x0059, B:23:0x005f, B:25:0x0064, B:26:0x006d, B:29:0x0075, B:31:0x0079, B:33:0x0081, B:35:0x008d, B:36:0x0096, B:38:0x009e, B:40:0x00aa, B:41:0x00b2, B:43:0x00b6, B:45:0x00be, B:47:0x00ca, B:49:0x00df, B:50:0x00e5, B:51:0x00eb, B:52:0x00f1, B:53:0x00fc, B:54:0x0107, B:55:0x0112, B:56:0x011c), top: B:60:0x0052 }] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r9) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.loc.e.a.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends HandlerThread {
        public b(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            try {
                e eVar = e.this;
                eVar.v = new j(eVar.e);
                fq.b(e.this.e);
                fq.a(e.this.e);
                e.this.f = new er(false);
                super.onLooperPrepared();
            }
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                super.run();
            } catch (Throwable th) {
                fr.a(th, "APSManager$ActionThread", "run");
            }
        }
    }

    public e(Context context) {
        this.e = null;
        this.e = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ew a(int i, String str) {
        try {
            ew ewVar = new ew("");
            ewVar.setErrorCode(i);
            ewVar.setLocationDetail(str);
            return ewVar;
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", "newInstanceAMapLoc");
            return null;
        }
    }

    public static void d() {
        g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!fy.m(this.e)) {
            try {
                er erVar = this.f;
                if (erVar != null && erVar != null) {
                    erVar.a(this.d);
                    this.f.g();
                }
            } catch (Throwable th) {
                fr.a(th, "ApsServiceCore", "startColl");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            fq.c(this.e);
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", "doCallOtherSer");
        }
    }

    public final Handler b() {
        return this.d;
    }

    public final void c() {
        try {
            HashMap<Messenger, Long> hashMap = this.h;
            if (hashMap != null) {
                hashMap.clear();
                this.h = null;
            }
            List<Messenger> list = this.w;
            if (list != null) {
                list.clear();
            }
            j jVar = this.v;
            if (jVar != null) {
                jVar.c();
                this.v = null;
            }
            this.o = false;
            this.p = false;
            this.f.e();
            a aVar = this.d;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.d = null;
            b bVar = this.b;
            if (bVar != null) {
                fu.a(bVar, HandlerThread.class, "quitSafely", new Object[0]);
            }
            this.b = null;
            if (!(this.i == null || this.j == 0 || this.k == 0)) {
                long b2 = fy.b() - this.j;
                fw.a(this.e, this.i.c(this.e), this.i.d(this.e), this.k, b2);
                this.i.e(this.e);
            }
            fw.a(this.e);
            av.b();
            if (g) {
                Process.killProcess(Process.myPid());
            }
        } catch (Throwable th) {
            fr.a(th, "apm", "tdest");
        }
    }

    private static AMapLocationClientOption b(Bundle bundle) {
        AMapLocationClientOption aMapLocationClientOption = null;
        try {
            aMapLocationClientOption = fr.a(bundle.getBundle("optBundle"));
            String string = bundle.getString("d");
            if (!TextUtils.isEmpty(string)) {
                o.a(string);
            }
        } catch (Throwable th) {
            fr.a(th, "APSManager", "parseBundle");
        }
        return aMapLocationClientOption;
    }

    public final void a() {
        try {
            this.i = new fw();
            b bVar = new b("amapLocCoreThread");
            this.b = bVar;
            bVar.setPriority(5);
            this.b.start();
            this.d = new a(this.b.getLooper());
            this.w = new ArrayList();
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", "onCreate");
        }
    }

    public final void a(Intent intent) {
        a aVar;
        if ("true".equals(intent.getStringExtra("as")) && (aVar = this.d) != null) {
            aVar.sendEmptyMessageDelayed(9, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        try {
            if (this.o) {
                er erVar = this.f;
                if (erVar != null) {
                    erVar.a();
                    return;
                }
                return;
            }
            fr.a(this.e);
            if (bundle != null) {
                this.n = fr.a(bundle.getBundle("optBundle"));
            }
            this.f.a(this.e);
            this.f.b();
            a(this.n);
            this.f.c();
            this.o = true;
            this.x = true;
            this.y = "";
            List<Messenger> list = this.w;
            if (list != null && list.size() > 0) {
                e();
            }
        } catch (Throwable th) {
            this.x = false;
            th.printStackTrace();
            this.y = th.getMessage();
            fr.a(th, "ApsServiceCore", "init");
        }
    }

    public final void b(Intent intent) {
        String stringExtra = intent.getStringExtra("a");
        if (!TextUtils.isEmpty(stringExtra)) {
            m.a(this.e, stringExtra);
        }
        String stringExtra2 = intent.getStringExtra(TplMsg.VALUE_T_NATIVE_RETURN);
        this.f5661a = stringExtra2;
        l.a(stringExtra2);
        String stringExtra3 = intent.getStringExtra("d");
        if (!TextUtils.isEmpty(stringExtra3)) {
            o.a(stringExtra3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Messenger messenger) {
        this.h.remove(messenger);
    }

    private void b(Messenger messenger) {
        try {
            this.f.f();
            if (fq.k()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("installMockApp", true);
                a(messenger, 9, bundle);
            }
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", "initAuth");
        }
    }

    private static void a(Messenger messenger, int i, Bundle bundle) {
        if (messenger != null) {
            try {
                Message obtain = Message.obtain();
                obtain.setData(bundle);
                obtain.what = i;
                messenger.send(obtain);
            } catch (Throwable th) {
                fr.a(th, "ApsServiceCore", "sendMessage");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:4:0x0008, B:7:0x0010, B:9:0x0029, B:11:0x002f, B:16:0x004a, B:18:0x004f, B:20:0x007c, B:22:0x0089, B:24:0x0092, B:26:0x00a3, B:41:0x0124, B:43:0x012c, B:44:0x0132, B:46:0x0136, B:47:0x0141, B:49:0x0145, B:57:0x016d, B:28:0x00ac, B:30:0x00bc, B:33:0x00c6, B:35:0x00ce, B:36:0x00d8, B:38:0x00e1, B:39:0x00e9, B:40:0x00f0, B:52:0x0154, B:54:0x015a, B:56:0x015e), top: B:61:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136 A[Catch: all -> 0x0047, TryCatch #2 {all -> 0x0047, blocks: (B:4:0x0008, B:7:0x0010, B:9:0x0029, B:11:0x002f, B:16:0x004a, B:18:0x004f, B:20:0x007c, B:22:0x0089, B:24:0x0092, B:26:0x00a3, B:41:0x0124, B:43:0x012c, B:44:0x0132, B:46:0x0136, B:47:0x0141, B:49:0x0145, B:57:0x016d, B:28:0x00ac, B:30:0x00bc, B:33:0x00c6, B:35:0x00ce, B:36:0x00d8, B:38:0x00e1, B:39:0x00e9, B:40:0x00f0, B:52:0x0154, B:54:0x015a, B:56:0x015e), top: B:61:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #2 {all -> 0x0047, blocks: (B:4:0x0008, B:7:0x0010, B:9:0x0029, B:11:0x002f, B:16:0x004a, B:18:0x004f, B:20:0x007c, B:22:0x0089, B:24:0x0092, B:26:0x00a3, B:41:0x0124, B:43:0x012c, B:44:0x0132, B:46:0x0136, B:47:0x0141, B:49:0x0145, B:57:0x016d, B:28:0x00ac, B:30:0x00bc, B:33:0x00c6, B:35:0x00ce, B:36:0x00d8, B:38:0x00e1, B:39:0x00e9, B:40:0x00f0, B:52:0x0154, B:54:0x015a, B:56:0x015e), top: B:61:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.os.Messenger r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.e.b(android.os.Messenger, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Messenger messenger, Bundle bundle) {
        if (bundle != null) {
            try {
                if (!bundle.isEmpty() && !this.p) {
                    this.p = true;
                    b(messenger);
                }
            } catch (Throwable th) {
                fr.a(th, "ApsServiceCore", "doInitAuth");
            }
        }
    }

    public final void a(Messenger messenger, Bundle bundle, String str) {
        AMapLocationClientOption b2;
        float f;
        if (bundle != null) {
            try {
                if (!bundle.isEmpty()) {
                    double d = bundle.getDouble(DispatchConstants.LATITUDE);
                    double d2 = bundle.getDouble("lon");
                    float f2 = bundle.getFloat("radius");
                    long j = bundle.getLong("time");
                    if ("FINE_LOC".equals(str)) {
                        AMapLocation aMapLocation = new AMapLocation("gps");
                        aMapLocation.setLatitude(d);
                        aMapLocation.setLocationType(1);
                        aMapLocation.setLongitude(d2);
                        aMapLocation.setAccuracy(f2);
                        aMapLocation.setTime(j);
                        this.f.a(aMapLocation);
                    }
                    if (fq.h() && (b2 = b(bundle)) != null && b2.isNeedAddress()) {
                        a(b2);
                        AMapLocation aMapLocation2 = this.c;
                        if (aMapLocation2 != null) {
                            f = fy.a(new double[]{d, d2, aMapLocation2.getLatitude(), this.c.getLongitude()});
                            if (f < fq.i() * 3) {
                                a(messenger, str);
                            }
                        } else {
                            f = -1.0f;
                        }
                        if (f == -1.0f || f > fq.i()) {
                            a(bundle);
                            ew a2 = this.f.a(d, d2);
                            this.c = a2;
                            if (a2 != null && !TextUtils.isEmpty(a2.getAdCode())) {
                                a(messenger, str);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                fr.a(th, "ApsServiceCore", "doLocationGeo");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Messenger messenger, AMapLocation aMapLocation, String str, eq eqVar) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(AMapLocation.class.getClassLoader());
        bundle.putParcelable(MspEventTypes.ACTION_INVOKE_LOC, aMapLocation);
        bundle.putString("nb", str);
        bundle.putParcelable(Ba.c, eqVar);
        this.h.put(messenger, Long.valueOf(fy.b()));
        a(messenger, 1, bundle);
    }

    private void a(Messenger messenger, String str) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(AMapLocation.class.getClassLoader());
        bundle.putInt("I_MAX_GEO_DIS", fq.i() * 3);
        bundle.putInt("I_MIN_GEO_DIS", fq.i());
        bundle.putParcelable(MspEventTypes.ACTION_INVOKE_LOC, this.c);
        a(messenger, "COARSE_LOC".equals(str) ? 103 : 6, bundle);
    }

    private void a(AMapLocationClientOption aMapLocationClientOption) {
        try {
            er erVar = this.f;
            if (erVar != null) {
                erVar.a(aMapLocationClientOption);
            }
            if (aMapLocationClientOption != null) {
                g = aMapLocationClientOption.isKillProcess();
                if (this.m != null) {
                    if (!(aMapLocationClientOption.isOffset() == this.m.isOffset() && aMapLocationClientOption.isNeedAddress() == this.m.isNeedAddress() && aMapLocationClientOption.isLocationCacheEnable() == this.m.isLocationCacheEnable() && this.m.getGeoLanguage() == aMapLocationClientOption.getGeoLanguage())) {
                        this.r = 0L;
                    }
                    if (!(aMapLocationClientOption.isOffset() == this.m.isOffset() && this.m.getGeoLanguage() == aMapLocationClientOption.getGeoLanguage())) {
                        this.c = null;
                    }
                }
                this.m = aMapLocationClientOption;
            }
        } catch (Throwable th) {
            fr.a(th, "ApsServiceCore", "setExtra");
        }
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(this.l)) {
            this.l = fr.b(this.e);
        }
        return !TextUtils.isEmpty(str) && str.equals(this.l);
    }
}
