package com.alibaba.analytics.core.sync;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.analytics.core.sync.UploadLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledFuture;
import tb.bmv;
import tb.d4v;
import tb.jmv;
import tb.m;
import tb.mnc;
import tb.mp7;
import tb.nhh;
import tb.o2w;
import tb.ofh;
import tb.q6e;
import tb.t2o;
import tb.u51;
import tb.w2v;
import tb.x2r;
import tb.zdt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c implements w2v.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c k = new c();
    public ScheduledFuture c;
    public mnc d;

    /* renamed from: a  reason: collision with root package name */
    public long f2127a = 30000;
    public UploadMode b = null;
    public final jmv e = new jmv();
    public UploadLog.NetworkStatus f = UploadLog.NetworkStatus.ALL;
    public boolean g = false;
    public final Object h = new Object();
    public boolean i = false;
    public long j = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements q6e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.q6e
        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4e8732f", new Object[]{this, new Long(j)});
            } else {
                com.alibaba.analytics.core.sync.a.h().c(c.a(c.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements mnc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.mnc
        public void a(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ecff6bf", new Object[]{this, new Long(j), new Long(j2)});
            } else if (mp7.b()) {
                synchronized (c.b(c.this)) {
                    if (c.c(c.this) != null) {
                        ofh.l().p(c.c(c.this));
                    }
                    o2w.k().d0();
                }
            } else {
                nhh.f("RealTimeMode", "count", Long.valueOf(j), "dbSize", Long.valueOf(j2));
                if (j > 0 && j2 > 0 && UploadMode.REALTIME == c.d(c.this)) {
                    c.f(c.this, zdt.c().d(null, c.g(c.this), 0L));
                }
            }
        }

        @Override // tb.mnc
        public void b(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4903c31", new Object[]{this, new Long(j), new Long(j2)});
            }
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.analytics.core.sync.c$c  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class C0059c implements q6e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0059c() {
        }

        @Override // tb.q6e
        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4e8732f", new Object[]{this, new Long(j)});
                return;
            }
            c cVar = c.this;
            c.i(cVar, c.j(cVar));
            nhh.f("UploadMgr", "CurrentUploadInterval", Long.valueOf(c.h(c.this)));
            com.alibaba.analytics.core.sync.b.i().c(c.a(c.this));
            c.f(c.this, zdt.c().d(c.e(c.this), c.g(c.this), c.h(c.this)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2131a;

        public d(String str) {
            this.f2131a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ofh.l().o(this.f2131a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] $SwitchMap$com$alibaba$analytics$core$sync$UploadMode;

        static {
            int[] iArr = new int[UploadMode.values().length];
            $SwitchMap$com$alibaba$analytics$core$sync$UploadMode = iArr;
            try {
                iArr[UploadMode.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        t2o.a(962592959);
        t2o.a(962593012);
    }

    public c() {
        w2v.d(this);
    }

    public static /* synthetic */ UploadLog.NetworkStatus a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadLog.NetworkStatus) ipChange.ipc$dispatch("8c7351a1", new Object[]{cVar});
        }
        return cVar.f;
    }

    public static /* synthetic */ Object b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2eb3db2", new Object[]{cVar});
        }
        return cVar.h;
    }

    public static /* synthetic */ mnc c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mnc) ipChange.ipc$dispatch("7236a6bd", new Object[]{cVar});
        }
        return cVar.d;
    }

    public static /* synthetic */ UploadMode d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadMode) ipChange.ipc$dispatch("2f23af15", new Object[]{cVar});
        }
        return cVar.b;
    }

    public static /* synthetic */ ScheduledFuture e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("62c8f0b0", new Object[]{cVar});
        }
        return cVar.c;
    }

    public static /* synthetic */ ScheduledFuture f(c cVar, ScheduledFuture scheduledFuture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("5a16de7b", new Object[]{cVar, scheduledFuture});
        }
        cVar.c = scheduledFuture;
        return scheduledFuture;
    }

    public static /* synthetic */ jmv g(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmv) ipChange.ipc$dispatch("fad6e875", new Object[]{cVar});
        }
        return cVar.e;
    }

    public static /* synthetic */ long h(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3c0480f", new Object[]{cVar})).longValue();
        }
        return cVar.f2127a;
    }

    public static /* synthetic */ long i(c cVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b35c65ff", new Object[]{cVar, new Long(j)})).longValue();
        }
        cVar.f2127a = j;
        return j;
    }

    public static /* synthetic */ long j(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b569ee2e", new Object[]{cVar})).longValue();
        }
        return cVar.k();
    }

    public static c p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("2a478bba", new Object[0]);
        }
        return k;
    }

    public final long k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d952f141", new Object[]{this})).longValue();
        }
        if (this.g) {
            long m = m();
            if (r()) {
                return n();
            }
            return m;
        }
        this.i = false;
        long o = o();
        if (o == 0) {
            return 30000L;
        }
        return o;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94315261", new Object[]{this});
            return;
        }
        nhh.d();
        zdt.c().f(this.e);
    }

    public final long m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85d6c9b", new Object[]{this})).longValue();
        }
        long g = x2r.f().g("bu") * 1000;
        if (g <= 0) {
            return 300000L;
        }
        return g;
    }

    public final long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38b378d", new Object[]{this})).longValue();
        }
        long g = x2r.f().g("bu2") * 1000;
        if (g <= 0) {
            return m.CONFIG_TRACK_1022_INTERVAL_TIME;
        }
        return g;
    }

    public final long o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9afeee25", new Object[]{this})).longValue();
        }
        long c = d4v.d().c() * 1000;
        if (c <= 0) {
            return 30000L;
        }
        return c;
    }

    public synchronized void q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        boolean z = !u51.j(context);
        this.g = z;
        nhh.f("UploadMgr", "init mIsAppOnBackground", Boolean.valueOf(z));
        u();
        y("init");
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9881e", new Object[]{this});
            return;
        }
        String i = u51.i(o2w.k().g(), "UTANALYTICS_UPLOAD_ALLOWED_NETWORK_STATUS");
        if (TextUtils.isEmpty(i)) {
            return;
        }
        if ("ALL".equalsIgnoreCase(i)) {
            this.f = UploadLog.NetworkStatus.ALL;
        } else if ("2G".equalsIgnoreCase(i)) {
            this.f = UploadLog.NetworkStatus.TWO_GENERATION;
        } else if ("3G".equalsIgnoreCase(i)) {
            this.f = UploadLog.NetworkStatus.THRID_GENERATION;
        } else if ("4G".equalsIgnoreCase(i)) {
            this.f = UploadLog.NetworkStatus.FOUR_GENERATION;
        } else if ("WIFI".equalsIgnoreCase(i)) {
            this.f = UploadLog.NetworkStatus.WIFI;
        }
    }

    public void t(UploadMode uploadMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d19aae9", new Object[]{this, uploadMode});
        } else if (uploadMode != null && this.b != uploadMode) {
            this.b = uploadMode;
            u();
        }
    }

    public synchronized void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        nhh.q();
        s();
        bmv.b().c();
        com.alibaba.analytics.core.sync.a.h().c(this.f);
        com.alibaba.analytics.core.sync.a.h().d(new a());
        if (this.b == null) {
            this.b = UploadMode.INTERVAL;
        }
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        v(this.b);
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("835803d7", new Object[]{this});
            return;
        }
        if (this.d != null) {
            ofh.l().p(this.d);
        }
        this.d = new b();
        ofh.l().m(this.d);
    }

    @Override // tb.w2v.a
    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            return;
        }
        nhh.m("UploadMgr", "onBackground", Boolean.TRUE);
        y("bg");
        if (UploadMode.INTERVAL == this.b) {
            this.g = true;
            long k2 = k();
            if (this.f2127a != k2) {
                this.f2127a = k2;
                u();
            }
        }
    }

    @Override // tb.w2v.a
    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
            return;
        }
        nhh.m("UploadMgr", "onForeground", Boolean.TRUE);
        y("fg");
        if (UploadMode.INTERVAL == this.b) {
            this.g = false;
            long k2 = k();
            if (this.f2127a != k2) {
                this.f2127a = k2;
                u();
            }
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caaed11", new Object[]{this});
            return;
        }
        nhh.f("UploadMgr", "startIntervalMode CurrentUploadInterval", Long.valueOf(this.f2127a));
        com.alibaba.analytics.core.sync.b.i().d(new C0059c());
        this.c = zdt.c().d(this.c, this.e, 3000L);
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d45b2c35", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.j > 60000) {
            this.j = elapsedRealtime;
            boolean m = u51.m(o2w.k().g());
            this.i = m;
            nhh.f("UploadMgr", "isMainProcessDeadExtend", Boolean.valueOf(m));
        } else {
            nhh.f("UploadMgr", "time limit. isMainProcessDeadExtend", Boolean.valueOf(this.i));
        }
        return this.i;
    }

    public final synchronized void v(UploadMode uploadMode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cdeb826", new Object[]{this, uploadMode});
            return;
        }
        nhh.f("startMode", "mode", uploadMode);
        if (e.$SwitchMap$com$alibaba$analytics$core$sync$UploadMode[uploadMode.ordinal()] != 1) {
            w();
        } else {
            x();
        }
    }

    public final void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbcf6e7d", new Object[]{this, str});
            return;
        }
        nhh.m("UploadMgr", "storeAndUploadDelay", str);
        zdt.c().d(null, new d(str), 500L);
    }
}
