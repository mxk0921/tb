package com.taobao.android.detail2.core.framework.view.feeds;

import android.app.Activity;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView;
import com.taobao.taobao.R;
import tb.byj;
import tb.cxj;
import tb.dh7;
import tb.ec7;
import tb.gxq;
import tb.nbq;
import tb.t2o;
import tb.txj;
import tb.wwj;
import tb.x3w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dh7 f7158a;
    public final cxj b;
    public final VerticalAbsViewHolder c;
    public DetailVerticalRecyclerView.c d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends com.taobao.android.detail2.core.framework.view.feeds.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/feeds/NonFullScreenHandler$1");
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.a, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
        public void a(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b2f49e4", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            } else {
                b.a(b.this);
            }
        }

        @Override // com.taobao.android.detail2.core.framework.view.feeds.a, com.taobao.android.detail2.core.framework.view.feeds.DetailVerticalRecyclerView.c
        public void e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb463c7", new Object[]{this, str});
                return;
            }
            int V = b.this.f7158a.V(str);
            b bVar = b.this;
            int V2 = bVar.f7158a.V(bVar.c.w0());
            if (V == V2 - 1) {
                b.this.c.Y0(0);
            }
            b.this.q(str, V, V2);
        }
    }

    static {
        t2o.a(352321962);
    }

    public b(dh7 dh7Var, cxj cxjVar, VerticalAbsViewHolder verticalAbsViewHolder) {
        this.f7158a = dh7Var;
        this.b = cxjVar;
        this.c = verticalAbsViewHolder;
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b74b864", new Object[]{bVar});
        } else {
            bVar.o();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aff7f9c", new Object[]{this});
            return;
        }
        VerticalAbsViewHolder verticalAbsViewHolder = this.c;
        if (verticalAbsViewHolder != null) {
            verticalAbsViewHolder.Y0(0);
        }
    }

    public final float[] c(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("a01c206b", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
        float e = gxq.e(this.b);
        return z ? z2 ? new float[]{e, e, e, e, e, e, e, e} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, e, e, e, e} : z2 ? new float[]{e, e, e, e, 0.0f, 0.0f, 0.0f, 0.0f} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public abstract float d();

    public abstract float e();

    public final void f(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0654e94", new Object[]{this, new Integer(i), str});
        } else if (j(i)) {
            VerticalAbsViewHolder verticalAbsViewHolder = this.c;
            verticalAbsViewHolder.Y0(-verticalAbsViewHolder.g0());
        } else if (this.b.m().c(byj.DOWNGRADE_KEY_NOT_RESET_MAIN_RENDER_MARGIN)) {
            txj.e(txj.TAG_RENDER, "NdVhOffset Downgrade。VH 数据绑定时不重置内容偏移量。index:" + i);
        } else {
            this.c.z1();
            txj.e(txj.TAG_RENDER, "NdVhOffset Success。VH 数据绑定时已成功重置内容偏移量。index:" + i);
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f2f3025", new Object[]{this})).booleanValue();
        }
        x3w z = this.f7158a.z(this.f7158a.V(this.c.w0()) - 1);
        if (z == null) {
            return false;
        }
        return i(z.f31127a, z.b);
    }

    public abstract boolean h();

    public abstract boolean i(int i, String str);

    public final boolean j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("796287eb", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!g() || this.c.W0()) {
            return false;
        }
        int[] c0 = this.f7158a.c0();
        if (i >= c0[0] && i < c0[1]) {
            return false;
        }
        if (i != c0[1] || !this.f7158a.p0()) {
            return true;
        }
        return false;
    }

    public final boolean k(boolean z, boolean z2) {
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95e360ad", new Object[]{this, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (this.c.y0(-1024382953) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z3 && !z2) {
            return false;
        }
        if (z || z3) {
            return true;
        }
        return false;
    }

    public void m(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff3ee5ad", new Object[]{this, new Integer(i), str});
        } else if (h()) {
            p();
            l(i, str, false);
            f(i, str);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc7592d", new Object[]{this});
        } else if (h()) {
            l(this.c.u0(), this.c.getType(), true);
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41c94ab", new Object[]{this});
        } else if (g()) {
            Rect z0 = this.c.z0();
            boolean X0 = this.c.X0();
            int i = z0.top;
            if (i >= 0 && i <= e() && X0) {
                this.c.a1(z0.top / e());
            }
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977fc05b", new Object[]{this});
        } else if (this.d == null) {
            a aVar = new a();
            this.d = aVar;
            this.f7158a.p(aVar);
        }
    }

    public abstract void q(String str, int i, int i2);

    public void l(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96dce089", new Object[]{this, new Integer(i), str, new Boolean(z)});
            return;
        }
        Activity i2 = this.b.i();
        if (i2 != null) {
            boolean g = g();
            boolean i3 = i(i, str);
            this.c.J1(c(i3, g));
            if (i3) {
                nbq.d("newDetail", wwj.TINCT_SCROLL_OPT, wwj.TINCT_SCROLL_OPT_HALF_SCREEN, "default", true);
            }
            if (k(i3, z)) {
                if (i3) {
                    this.c.I1((int) e());
                    this.c.G1((int) i2.getResources().getDimension(R.dimen.new_detail_half_screen_bottom_divider_height));
                    this.c.L1(-1024382953, "true");
                    return;
                }
                this.c.I1(-1);
                this.c.G1(ec7.a(this.b.i(), 0.0f));
                this.c.L1(-1024382953, null);
            }
        }
    }
}
