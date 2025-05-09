package tb;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.falco.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class n73 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static d f24548a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity c;

        public a(Activity activity) {
            this.c = activity;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/monitor/CaptureUiPerformanceMonitor$1");
        }

        @Override // tb.zio
        public void c() {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            boolean e = u7m.e(this.c);
            if (u7m.b(this.c) == 0) {
                z = true;
            }
            if (n73.a() != null) {
                n73.a().J = e;
                n73.a().z = z;
                n73.a().f24549a = zno.h(this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String c;

        public b(String str) {
            this.c = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/monitor/CaptureUiPerformanceMonitor$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                d.b(n73.a(), Boolean.valueOf(gxh.o().d(this.c)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/monitor/CaptureUiPerformanceMonitor$3");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                n73.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean J;

        /* renamed from: a  reason: collision with root package name */
        public String f24549a;
        public String b;
        public boolean c;
        public String d;
        public final long j;
        public long k;
        public long m;
        public boolean z;
        public String g = "";
        public String h = "";
        public boolean i = false;
        public Boolean l = null;
        public long n = 0;
        public long o = 0;
        public long p = 0;
        public long q = 0;
        public long M = 0;
        public long r = 0;
        public long s = 0;
        public long N = 0;
        public long t = 0;
        public long u = 0;
        public long v = 0;
        public long w = 0;
        public long x = 0;
        public long y = 0;
        public long A = 0;
        public long B = 0;
        public long C = 0;
        public long D = 0;
        public long E = 0;
        public long F = 0;
        public long G = 0;
        public long H = 0;
        public long I = 0;
        public long O = 0;
        public long K = 0;
        public long L = 0;
        public long P = 0;
        public final String e = ri7.a();
        public boolean f = false;

        static {
            t2o.a(481296659);
        }

        public d(boolean z, boolean z2, String str) {
            long currentTimeMillis = System.currentTimeMillis();
            this.j = currentTimeMillis;
            this.k = currentTimeMillis;
            this.m = currentTimeMillis;
            this.J = z;
            this.z = z2;
            this.f24549a = str;
        }

        public static /* synthetic */ Boolean a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("319e5be5", new Object[]{dVar});
            }
            return dVar.l;
        }

        public static /* synthetic */ Boolean b(d dVar, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("1ffad224", new Object[]{dVar, bool});
            }
            dVar.l = bool;
            return bool;
        }

        public static /* synthetic */ long c(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a028b8fb", new Object[]{dVar})).longValue();
            }
            return dVar.j;
        }

        public static /* synthetic */ boolean d(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("30e50249", new Object[]{dVar})).booleanValue();
            }
            return dVar.i;
        }

        public void e(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a9db39f", new Object[]{this, str, new Boolean(z)});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.k = currentTimeMillis;
            this.m = currentTimeMillis;
            this.b = str;
            this.c = z;
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b04e5d", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.G = currentTimeMillis - this.y;
            this.H = currentTimeMillis - this.j;
            this.I = SystemClock.uptimeMillis();
            this.O = System.currentTimeMillis();
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4f1ca1", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.y = currentTimeMillis;
            this.F = currentTimeMillis - this.x;
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e35aad23", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.u = currentTimeMillis;
            this.B = currentTimeMillis - this.t;
        }

        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f32c86", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.w = currentTimeMillis;
            this.D = currentTimeMillis - this.v;
        }

        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47660438", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.v = currentTimeMillis;
            this.C = currentTimeMillis - this.u;
        }

        public void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3acf963a", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.x = currentTimeMillis;
            this.E = currentTimeMillis - this.w;
        }

        public void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99d996c3", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.t = currentTimeMillis;
            this.A = currentTimeMillis - this.j;
        }

        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("877656dd", new Object[]{this});
                return;
            }
            this.f = true;
            this.r = System.currentTimeMillis() - this.j;
            this.s = SystemClock.uptimeMillis();
            this.N = System.currentTimeMillis();
        }

        public void n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bfd52f", new Object[]{this, str});
                return;
            }
            this.d = str;
            long currentTimeMillis = System.currentTimeMillis();
            this.n = currentTimeMillis - this.k;
            this.m = currentTimeMillis;
        }

        public void o(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7e8a42e", new Object[]{this, str, str2});
                return;
            }
            this.g = str;
            this.h = str2;
            this.i = false;
        }

        public void p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.o = currentTimeMillis - this.m;
            this.p = currentTimeMillis - this.j;
            this.q = SystemClock.uptimeMillis();
            this.M = System.currentTimeMillis();
            this.i = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements m.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f24550a;

        public e(long j) {
            this.f24550a = j;
        }

        @Override // com.taobao.falco.m.a
        public void a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd090d9d", new Object[]{this, mVar});
            } else if (mVar != null) {
                mVar.h(Long.valueOf(this.f24550a));
            }
        }
    }

    static {
        t2o.a(481296654);
        u();
    }

    public static /* synthetic */ d a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("f98932c7", new Object[0]);
        }
        return f24548a;
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b88b93a", new Object[0]);
        } else {
            d();
        }
    }

    public static void c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a9db39f", new Object[]{str, new Boolean(z)});
            return;
        }
        d dVar = f24548a;
        if (dVar != null) {
            dVar.e(str, z);
        }
    }

    public static void d() {
        d dVar;
        d dVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebeb1784", new Object[0]);
        } else if (f24548a != null && lg4.Q() && !caa.t() && !caa.s()) {
            agh.r("Dynamic", "CaptureUiPerformMonitor", "reportRenderResult: " + JSON.toJSONString(f24548a));
            HashMap hashMap = new HashMap(4);
            if (f24548a.J) {
                hashMap.put(u63.MEASURE_FIRST_FRAME_COST_TIME, Double.valueOf(dVar.K));
            }
            boolean d2 = d.d(f24548a);
            double d3 = vu3.b.GEO_NOT_SUPPORT;
            if (d2) {
                hashMap.put("renderSuccess", Double.valueOf(1.0d));
                hashMap.put("renderFail", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
            } else {
                hashMap.put("renderSuccess", Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
                hashMap.put("renderFail", Double.valueOf(1.0d));
            }
            hashMap.put("fetchTemplateCostTime", Double.valueOf(f24548a.n));
            f24548a.getClass();
            hashMap.put("prepareCostTime", Double.valueOf(0L));
            hashMap.put("renderCostTime", Double.valueOf(f24548a.o));
            hashMap.put("prepareAlbumCost", Double.valueOf(f24548a.A));
            hashMap.put("postAlbumThreadCost", Double.valueOf(f24548a.B));
            hashMap.put("createCursorCost", Double.valueOf(f24548a.C));
            hashMap.put("moveCursorCost", Double.valueOf(f24548a.D));
            hashMap.put("sortAlbumCost", Double.valueOf(f24548a.E));
            hashMap.put("postResult2UiCost", Double.valueOf(f24548a.F));
            hashMap.put("bindItemCost", Double.valueOf(f24548a.G));
            long j = f24548a.H;
            if (j > 0) {
                hashMap.put(u63.MEASURE_ALBUM_LOAD_COST_TIME, Double.valueOf(j));
            }
            long j2 = f24548a.p;
            if (j2 > 0) {
                hashMap.put(u63.MEASURE_MUISE_COST_TIME, Double.valueOf(j2));
            }
            long j3 = f24548a.r;
            if (j3 > 0) {
                hashMap.put("nativeCostTime", Double.valueOf(j3));
            }
            d dVar3 = f24548a;
            long max = Math.max(dVar3.r, dVar3.p);
            d dVar4 = f24548a;
            hashMap.put(u63.MEASURE_INTERACTIVE_COST_TIME, Double.valueOf(Math.max(max, Math.max(dVar4.K, dVar4.H))));
            if (!f24548a.f) {
                hashMap.put("interactiveCostTimeExcludeDowngrade", Double.valueOf(Math.max(dVar2.p, Math.max(dVar2.K, dVar2.H))));
            }
            agh.h("CaptureUiPerformMonitor", "albumLoadCostTime " + f24548a.H + ", muiseCostTime " + f24548a.p + ", firstFrameCostTime " + f24548a.K);
            HashMap hashMap2 = new HashMap(6);
            f24548a.getClass();
            hashMap2.put(BaseMnnRunUnit.MONITOR_POINT_PREPARE_SUCCESS, String.valueOf(false));
            hashMap2.put(u63.DIMENSION_NEW_CAPTURE, "false");
            if (!d.d(f24548a)) {
                hashMap2.put("errorCode", f24548a.g);
                hashMap2.put("errorMsg", f24548a.h);
            }
            hashMap2.put("byeBackSource", String.valueOf(f24548a.c));
            hashMap2.put("pssource", f24548a.b);
            hashMap2.put(WVMicorPublishPlugin.TEMPLATE_URL, f24548a.d);
            hashMap2.put("deviceLevel", f24548a.e);
            hashMap2.put(u63.DIMEN_HAS_DOWNGRADE, String.valueOf(f24548a.f));
            Boolean a2 = d.a(f24548a);
            if (a2 != null) {
                if (a2.booleanValue()) {
                    d3 = 1.0d;
                }
                hashMap.put("has_tmpl_cache_value", Double.valueOf(d3));
                hashMap2.put("has_tmpl_cache", String.valueOf(a2));
            }
            if (!TextUtils.isEmpty(f24548a.f24549a)) {
                zno.p(f24548a.f24549a, "capturePerfDimension", hashMap2);
                zno.p(f24548a.f24549a, "capturePerfMeasure", hashMap);
                d dVar5 = f24548a;
                long max2 = Math.max(dVar5.s, dVar5.q);
                d dVar6 = f24548a;
                zno.q(f24548a.f24549a, "bizPageLoadEnd", Long.valueOf(Math.max(max2, Math.max(dVar6.I, dVar6.L))));
                d dVar7 = f24548a;
                long max3 = Math.max(dVar7.N, dVar7.M);
                d dVar8 = f24548a;
                FalcoGlobalTracer.get().j(new e(Math.max(max3, Math.max(dVar8.O, dVar8.P))));
            }
            jzu.d(u63.MODULE, u63.POINT_CAPTURE_LOAD, hashMap, hashMap2);
            f24548a = null;
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b04e5d", new Object[0]);
            return;
        }
        d dVar = f24548a;
        if (dVar != null && dVar.z && dVar.H == 0) {
            dVar.f();
            v();
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef4f1ca1", new Object[0]);
            return;
        }
        d dVar = f24548a;
        if (dVar != null) {
            dVar.g();
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e35aad23", new Object[0]);
            return;
        }
        d dVar = f24548a;
        if (dVar != null) {
            dVar.h();
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47660438", new Object[0]);
            return;
        }
        d dVar = f24548a;
        if (dVar != null) {
            dVar.j();
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3acf963a", new Object[0]);
            return;
        }
        d dVar = f24548a;
        if (dVar != null) {
            dVar.k();
        }
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ae3b7c", new Object[0]);
            return;
        }
        d dVar = f24548a;
        if (dVar != null) {
            dVar.i();
        }
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d996c3", new Object[0]);
            return;
        }
        d dVar = f24548a;
        if (dVar != null) {
            dVar.l();
        }
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[0]);
        } else {
            f24548a = null;
        }
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("877656dd", new Object[0]);
            return;
        }
        d dVar = f24548a;
        if (dVar != null) {
            dVar.m();
        }
    }

    public static void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bfd52f", new Object[]{str});
            return;
        }
        d dVar = f24548a;
        if (dVar != null) {
            dVar.n(str);
            if (lg4.H()) {
                d.b(f24548a, Boolean.valueOf(gxh.o().d(str)));
            } else {
                VExecutors.defaultSharedThreadPool().submit(new b(str));
            }
        }
    }

    public static void o(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18eb13c3", new Object[]{activity});
            return;
        }
        f24548a = new d(false, false, "default_session");
        q7m.a(new a(activity), 0L, TimeUnit.MILLISECONDS);
    }

    public static void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625fbbc2", new Object[0]);
        }
    }

    public static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402a7323", new Object[0]);
            return;
        }
        d dVar = f24548a;
        if (dVar != null && dVar.J && dVar.K == 0) {
            dVar.K = System.currentTimeMillis() - d.c(f24548a);
            f24548a.L = SystemClock.uptimeMillis();
            f24548a.P = System.currentTimeMillis();
            v();
        }
    }

    public static void r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e8a42e", new Object[]{str, str2});
            return;
        }
        d dVar = f24548a;
        if (dVar != null) {
            dVar.o(str, str2);
            v();
        }
    }

    public static void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8375", new Object[0]);
            return;
        }
        d dVar = f24548a;
        if (dVar != null) {
            dVar.p();
            v();
        }
    }

    public static void t() {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[0]);
        } else if (lg4.Y() && (dVar = f24548a) != null && dVar.K == 0) {
            f24548a = null;
        }
    }

    public static void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19455d1d", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("renderSuccess");
        arrayList.add("renderFail");
        arrayList.add(u63.MEASURE_FIRST_FRAME_COST_TIME);
        arrayList.add("fetchTemplateCostTime");
        arrayList.add("renderCostTime");
        arrayList.add("prepareCostTime");
        arrayList.add(u63.MEASURE_MUISE_COST_TIME);
        arrayList.add("prepareAlbumCost");
        arrayList.add("postAlbumThreadCost");
        arrayList.add("createCursorCost");
        arrayList.add("moveCursorCost");
        arrayList.add("sortAlbumCost");
        arrayList.add("postResult2UiCost");
        arrayList.add("bindItemCost");
        arrayList.add(u63.MEASURE_ALBUM_LOAD_COST_TIME);
        arrayList.add("nativeCostTime");
        arrayList.add(u63.MEASURE_INTERACTIVE_COST_TIME);
        arrayList.add("interactiveCostTimeExcludeDowngrade");
        arrayList.add("has_tmpl_cache_value");
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add("byeBackSource");
        arrayList2.add(BaseMnnRunUnit.MONITOR_POINT_PREPARE_SUCCESS);
        arrayList2.add("errorCode");
        arrayList2.add("errorMsg");
        arrayList2.add("pssource");
        arrayList2.add(WVMicorPublishPlugin.TEMPLATE_URL);
        arrayList2.add("deviceLevel");
        arrayList2.add(u63.DIMEN_HAS_DOWNGRADE);
        arrayList2.add("has_tmpl_cache");
        arrayList2.add("bucket_id");
        arrayList2.add(u63.DIMENSION_NEW_CAPTURE);
        jzu.m(u63.MODULE, u63.POINT_CAPTURE_LOAD, arrayList, arrayList2);
    }

    public static void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d17bd2", new Object[0]);
            return;
        }
        d dVar = f24548a;
        if (dVar != null && dVar.J && dVar.z && dVar.p != 0 && dVar.K != 0) {
            VExecutors.defaultSharedThreadPool().submit(new c());
        }
    }
}
