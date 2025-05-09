package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class w6h extends v6h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public b c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f30483a;

        public a(Map map) {
            this.f30483a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                mza.d().b("Smart_Loading", "loadingView_stay_time", "1.0", "PageHomeCommitTracker_Loading_PV_Rate", "PageHomeCommitTracker_Loading_PV_Rate_Legacy", this.f30483a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f30484a = false;
        public long b = SystemClock.uptimeMillis();
        public long c;
        public long d;
        public long e;
        public long f;
        public boolean g;
        public String h;
        public int i;
        public int j;
        public int k;
        public int l;
        public String m;

        static {
            t2o.a(491782552);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("92e4bf16", new Object[]{bVar});
            }
            return bVar.h;
        }

        public static /* synthetic */ String b(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("addae14a", new Object[]{bVar, str});
            }
            bVar.h = str;
            return str;
        }

        public static /* synthetic */ int c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6d088ebe", new Object[]{bVar})).intValue();
            }
            return bVar.i;
        }

        public static /* synthetic */ long d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e174b32d", new Object[]{bVar})).longValue();
            }
            return bVar.d;
        }

        public static /* synthetic */ long e(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1e48ca5d", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.d = j;
            return j;
        }

        public static /* synthetic */ int f(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5305d49", new Object[]{bVar, new Integer(i)})).intValue();
            }
            bVar.i = i;
            return i;
        }

        public static /* synthetic */ long g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b4b5f2e", new Object[]{bVar})).longValue();
            }
            return bVar.f;
        }

        public static /* synthetic */ long h(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2f479e7c", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.f = j;
            return j;
        }

        public static /* synthetic */ long i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("35220b2f", new Object[]{bVar})).longValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ int j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("96df3abf", new Object[]{bVar})).intValue();
            }
            return bVar.j;
        }

        public static /* synthetic */ int k(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("162f3168", new Object[]{bVar, new Integer(i)})).intValue();
            }
            bVar.j = i;
            return i;
        }

        public static /* synthetic */ int l(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c0b5e6c0", new Object[]{bVar})).intValue();
            }
            return bVar.l;
        }

        public static /* synthetic */ int m(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("272e0587", new Object[]{bVar, new Integer(i)})).intValue();
            }
            bVar.l = i;
            return i;
        }

        public static /* synthetic */ int n(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea8c92c1", new Object[]{bVar})).intValue();
            }
            return bVar.k;
        }

        public static /* synthetic */ int o(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("382cd9a6", new Object[]{bVar, new Integer(i)})).intValue();
            }
            bVar.k = i;
            return i;
        }

        public static /* synthetic */ String p(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6df04db1", new Object[]{bVar});
            }
            return bVar.m;
        }

        public static /* synthetic */ String q(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4881f25", new Object[]{bVar, str});
            }
            bVar.m = str;
            return str;
        }

        public static /* synthetic */ long r(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3e39eac4", new Object[]{bVar})).longValue();
            }
            return bVar.c;
        }

        public static /* synthetic */ long s(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5a2a85a6", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.c = j;
            return j;
        }

        public static /* synthetic */ long t(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("681096c5", new Object[]{bVar})).longValue();
            }
            return bVar.e;
        }

        public static /* synthetic */ long u(b bVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6b2959c5", new Object[]{bVar, new Long(j)})).longValue();
            }
            bVar.e = j;
            return j;
        }

        public static /* synthetic */ boolean v(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("91e742d6", new Object[]{bVar})).booleanValue();
            }
            return bVar.g;
        }

        public static /* synthetic */ boolean w(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7c286a04", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.g = z;
            return z;
        }

        public static /* synthetic */ boolean x(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bbbdeed7", new Object[]{bVar})).booleanValue();
            }
            return bVar.f30484a;
        }

        public static /* synthetic */ boolean y(b bVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8d273e23", new Object[]{bVar, new Boolean(z)})).booleanValue();
            }
            bVar.f30484a = z;
            return z;
        }

        public long A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a210c2ed", new Object[]{this})).longValue();
            }
            return this.f - this.b;
        }

        public long B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e2dbf261", new Object[]{this})).longValue();
            }
            if (!TextUtils.equals(this.m, "error")) {
                long j = this.d;
                if (j > 0) {
                    return this.f - j;
                }
            }
            return 0L;
        }

        public long C() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2ced241", new Object[]{this})).longValue();
            }
            if (TextUtils.equals(this.m, "error")) {
                return 0L;
            }
            return this.e - this.c;
        }

        public b z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("85760aa1", new Object[]{this});
            }
            b bVar = new b();
            bVar.f30484a = this.f30484a;
            bVar.b = this.b;
            bVar.c = this.c;
            bVar.e = this.e;
            bVar.d = this.d;
            bVar.f = this.f;
            bVar.h = this.h;
            bVar.i = this.i;
            bVar.l = this.l;
            bVar.m = this.m;
            bVar.j = this.j;
            bVar.k = this.k;
            return bVar;
        }

        public void D() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9378ed75", new Object[]{this});
                return;
            }
            this.f30484a = false;
            this.m = "none";
        }
    }

    static {
        t2o.a(491782550);
    }

    public static /* synthetic */ Object ipc$super(w6h w6hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/performanceoptimizationservice/impl/trace/feeds/loadmore/LoadingTraceUmbrellaMonitorV2");
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("491dfce9", new Object[]{this})).booleanValue();
        }
        if (b.d(this.c) > 0) {
            return true;
        }
        return false;
    }

    public final void h(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7724153", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.c == null) {
            if (!g() || !TextUtils.equals(b.p(this.c), "error")) {
                b z = this.c.z();
                e();
                m(b.a(z), i, i3, i2, b.j(z));
                b.q(this.c, "error");
                b.y(this.c, true);
                b.w(this.c, false);
                b.e(this.c, SystemClock.uptimeMillis());
            }
        }
    }

    public synchronized void j(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599af62a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.c != null && !g()) {
            if (this.b) {
                i();
            } else {
                h(i, i2, i3);
            }
        }
    }

    public synchronized void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d7a685", new Object[]{this});
            return;
        }
        b bVar = this.c;
        if (bVar != null) {
            b.s(bVar, SystemClock.uptimeMillis());
        }
    }

    public synchronized void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cacb7504", new Object[]{this});
            return;
        }
        b bVar = this.c;
        if (bVar != null) {
            b.u(bVar, SystemClock.uptimeMillis());
        }
    }

    public synchronized void m(String str, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4362c64", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        b bVar = new b();
        this.c = bVar;
        b.b(bVar, str);
        b.f(this.c, i);
        b.k(this.c, i4);
        b.m(this.c, i2);
        b.o(this.c, i3);
        b.q(this.c, "none");
    }

    @Override // tb.v6h
    public synchronized void f(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15eda199", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        if (TextUtils.equals(iUiRefreshActionModel.getRequestType(), "scrollNextPage") && this.c != null) {
            boolean z = !TextUtils.isEmpty(iUiRefreshActionModel.getDataChangeType());
            this.b = z;
            b.w(this.c, z);
            if (g() || !this.b) {
                if (!this.b && g()) {
                    h(b.c(this.c), b.n(this.c), b.l(this.c));
                }
                return;
            }
            e();
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ea8ec4", new Object[]{this});
        } else if (this.c != null && !g()) {
            b.y(this.c, true);
            b.q(this.c, "loading");
            b.e(this.c, SystemClock.uptimeMillis());
        }
    }

    @Override // tb.v6h
    public synchronized void e() {
        boolean z = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6a2a9fa", new Object[]{this});
                return;
            }
            try {
            } catch (Exception e) {
                fve.e("LoadingTraceUmbrellaMonitorV2", "stopRecord:", Log.getStackTraceString(e));
            }
            if (this.c != null) {
                if (!g()) {
                    this.c.D();
                }
                b.h(this.c, SystemClock.uptimeMillis());
                HashMap hashMap = new HashMap(16);
                hashMap.put("containerId", String.valueOf(b.a(this.c)));
                hashMap.put("index", String.valueOf(b.n(this.c)));
                hashMap.put("pageNum", String.valueOf(b.c(this.c)));
                hashMap.put("totalNum", String.valueOf(b.l(this.c)));
                hashMap.put("preloadMoreCount", String.valueOf(b.j(this.c)));
                hashMap.put("deviceLevel", String.valueOf(sue.a()));
                hashMap.put("scrollFullTime", String.valueOf(this.c.A()));
                hashMap.put("requestTime", String.valueOf(this.c.C()));
                hashMap.put("requestResult", String.valueOf(b.v(this.c)));
                hashMap.put("startTime", String.valueOf(b.i(this.c)));
                hashMap.put(TBImageFlowMonitor.REQUEST_START_TIME, String.valueOf(b.r(this.c)));
                hashMap.put("requestEndTime", String.valueOf(b.t(this.c)));
                hashMap.put("showLoadingTime", String.valueOf(b.d(this.c)));
                hashMap.put("endTime", String.valueOf(b.g(this.c)));
                hashMap.put("isLoadingShow", String.valueOf(b.x(this.c)));
                long j = 0;
                if (b.d(this.c) > 0) {
                    z = true;
                }
                hashMap.put("isLoadingViewAppear", String.valueOf(z));
                if (b.d(this.c) > 0) {
                    j = this.c.B();
                }
                hashMap.put("loadingViewStayTime", String.valueOf(j));
                hashMap.put("loadingType", b.p(this.c));
                hashMap.put("frameworkType", "infoflow");
                a(hashMap);
                this.c = null;
                get.a().e(new a(hashMap));
            }
        }
    }
}
