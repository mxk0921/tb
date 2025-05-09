package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import tb.i6d;
import tb.qjd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fo2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f19431a = new JSONObject();
    public z4a b;
    public qjd.b c;
    public i6d.a d;
    public i6d.b e;
    public i6d.c f;
    public final lhd g;
    public boolean h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements i6d.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.i6d.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62f29fbe", new Object[]{this});
            }
        }

        @Override // tb.i6d.c
        public void b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc630345", new Object[]{this, new Long(j)});
            } else {
                fo2.a(fo2.this, "pageRenderStart", j);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements i6d.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.i6d.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5dab0ec", new Object[]{this});
            } else {
                fo2.b(fo2.this, "moduleInit");
            }
        }

        @Override // tb.i6d.b
        public void destroyContainer() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements i6d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.i6d.a
        public void onChildViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
            }
        }

        @Override // tb.i6d.a
        public void onChildViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("517542da", new Object[]{this, view});
                return;
            }
            fo2.b(fo2.this, RenderTrackUtils.renderEnd);
            if (!fo2.c(fo2.this)) {
                fo2.e(fo2.this);
                fo2.d(fo2.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements qjd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.qjd.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3987b210", new Object[]{this, str, str2, str3});
            }
        }

        @Override // tb.qjd.b
        public void b(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d586a494", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
            } else {
                fo2.b(fo2.this, "requestEnd");
            }
        }

        @Override // tb.qjd.b
        public void d(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c78df556", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
            } else {
                fo2.b(fo2.this, "requestStart");
            }
        }
    }

    static {
        t2o.a(729809997);
    }

    public fo2(z4a z4aVar, lhd lhdVar) {
        this.g = lhdVar;
        this.b = z4aVar;
        o();
        l();
        m();
        n();
    }

    public static /* synthetic */ void a(fo2 fo2Var, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562acf37", new Object[]{fo2Var, str, new Long(j)});
        } else {
            fo2Var.q(str, j);
        }
    }

    public static /* synthetic */ void b(fo2 fo2Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a058d6e", new Object[]{fo2Var, str});
        } else {
            fo2Var.p(str);
        }
    }

    public static /* synthetic */ boolean c(fo2 fo2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("914329", new Object[]{fo2Var})).booleanValue();
        }
        return fo2Var.h;
    }

    public static /* synthetic */ boolean d(fo2 fo2Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95c62f11", new Object[]{fo2Var, new Boolean(z)})).booleanValue();
        }
        fo2Var.h = z;
        return z;
    }

    public static /* synthetic */ void e(fo2 fo2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fc1a6", new Object[]{fo2Var});
        } else {
            fo2Var.f();
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9b3528", new Object[]{this});
        } else if (this.b == null) {
            uqa.b("recmdPrefetch", "commitPhaseTime", "containerType == null");
        } else {
            this.f19431a.put("optimizeType", (Object) arm.a());
            this.f19431a.put("result", (Object) arm.c());
            this.f19431a.put("deviceLevel", (Object) m0b.d());
            uqa.b("recmdPrefetch", "commitPhaseTime", "args: " + this.f19431a);
            r5a.j(this.b.f(), 19999, "tradeInfoflowPrefetchRequest", this.b.b(), "tradeInfoflowRenderSuccess", this.f19431a);
        }
    }

    public final i6d.a g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i6d.a) ipChange.ipc$dispatch("f7c0c37a", new Object[]{this});
        }
        return new c();
    }

    public final i6d.b h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i6d.b) ipChange.ipc$dispatch("a1bff13a", new Object[]{this});
        }
        return new b();
    }

    public final i6d.c i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i6d.c) ipChange.ipc$dispatch("995653fc", new Object[]{this});
        }
        return new a();
    }

    public final qjd.b j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qjd.b) ipChange.ipc$dispatch("dd6fe33e", new Object[]{this});
        }
        return new d();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        u();
        r();
        s();
        t();
        arm.d();
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90fc8ee", new Object[]{this});
        } else if (this.g != null) {
            i6d.a g = g();
            this.d = g;
            this.g.b(g);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d6f7ae", new Object[]{this});
        } else if (this.g != null) {
            i6d.b h = h();
            this.e = h;
            this.g.l(h);
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8efc61a", new Object[]{this});
        } else if (this.g != null) {
            i6d.c i = i();
            this.f = i;
            this.g.k(i);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c696e897", new Object[]{this});
        } else if (this.g != null) {
            qjd.b j = j();
            this.c = j;
            this.g.m(j);
        }
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8640c4", new Object[]{this, str});
        } else {
            q(str, System.currentTimeMillis());
        }
    }

    public final void q(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9c72e73", new Object[]{this, str, new Long(j)});
        } else if (!this.h) {
            try {
                this.f19431a.put(str.concat("Time"), (Object) String.valueOf(j));
            } catch (Exception e) {
                uqa.b("recmdPrefetch", "saveCurrentPhaseTime", "出现异常：" + e);
            }
        }
    }

    public final void r() {
        i6d.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97f7737", new Object[]{this});
            return;
        }
        lhd lhdVar = this.g;
        if (lhdVar != null && (aVar = this.d) != null) {
            lhdVar.a(aVar);
        }
    }

    public final void s() {
        i6d.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bfa437", new Object[]{this});
            return;
        }
        lhd lhdVar = this.g;
        if (lhdVar != null && (bVar = this.e) != null) {
            lhdVar.n(bVar);
        }
    }

    public final void t() {
        i6d.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86da7f1", new Object[]{this});
            return;
        }
        lhd lhdVar = this.g;
        if (lhdVar != null && (cVar = this.f) != null) {
            lhdVar.e(cVar);
        }
    }

    public final void u() {
        qjd.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3916e", new Object[]{this});
            return;
        }
        lhd lhdVar = this.g;
        if (lhdVar != null && (bVar = this.c) != null) {
            lhdVar.r(bVar);
        }
    }

    public void v(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2903cfd1", new Object[]{this, z4aVar});
        } else {
            this.b = z4aVar;
        }
    }
}
