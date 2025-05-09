package tb;

import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import tb.dh7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j83 extends k97 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final com.taobao.android.detail2.core.framework.view.feeds.b f21826a;
    public final dh7 b;
    public final cxj c;
    public final VerticalAbsViewHolder d;
    public final b e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements dh7.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352321944);
            t2o.a(352321930);
        }

        public b() {
        }

        @Override // tb.dh7.l
        public void a(int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a5b043d", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
                return;
            }
            j83.j(j83.this).n();
            j83 j83Var = j83.this;
            j83.l(j83Var, j83.k(j83Var));
            j83 j83Var2 = j83.this;
            j83.m(j83Var2, j83.k(j83Var2));
            j83 j83Var3 = j83.this;
            j83.n(j83Var3, j83.k(j83Var3));
        }
    }

    static {
        t2o.a(352321942);
    }

    public j83(dh7 dh7Var, cxj cxjVar, VerticalAbsViewHolder verticalAbsViewHolder) {
        b bVar = new b();
        this.e = bVar;
        this.b = dh7Var;
        this.c = cxjVar;
        this.d = verticalAbsViewHolder;
        this.f21826a = r5k.a(dh7Var, cxjVar, verticalAbsViewHolder);
        dh7Var.t(bVar);
    }

    public static /* synthetic */ Object ipc$super(j83 j83Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1062265499) {
            super.h((com.taobao.android.detail2.core.framework.base.weex.a) objArr[0], (String) objArr[1], (JSONObject) objArr[2]);
            return null;
        } else if (hashCode == 1871413073) {
            super.g((com.taobao.android.detail2.core.framework.base.weex.a) objArr[0], (JSONObject) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail2/core/framework/view/feeds/CardHeightAndUIHandler");
        }
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.view.feeds.b j(j83 j83Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.view.feeds.b) ipChange.ipc$dispatch("69ef2e7a", new Object[]{j83Var});
        }
        return j83Var.f21826a;
    }

    public static /* synthetic */ VerticalAbsViewHolder k(j83 j83Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerticalAbsViewHolder) ipChange.ipc$dispatch("b07b71ae", new Object[]{j83Var});
        }
        return j83Var.d;
    }

    public static /* synthetic */ void l(j83 j83Var, VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f416fe93", new Object[]{j83Var, verticalAbsViewHolder});
        } else {
            j83Var.v(verticalAbsViewHolder);
        }
    }

    public static /* synthetic */ void m(j83 j83Var, VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcaa4e72", new Object[]{j83Var, verticalAbsViewHolder});
        } else {
            j83Var.x(verticalAbsViewHolder);
        }
    }

    public static /* synthetic */ void n(j83 j83Var, VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c53d9e51", new Object[]{j83Var, verticalAbsViewHolder});
        } else {
            j83Var.w(verticalAbsViewHolder);
        }
    }

    @Override // tb.k97
    public void g(com.taobao.android.detail2.core.framework.base.weex.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8b7f51", new Object[]{this, aVar, jSONObject});
        } else {
            super.g(aVar, jSONObject);
        }
    }

    @Override // tb.k97
    public void h(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f50e29b", new Object[]{this, aVar, str, jSONObject});
            return;
        }
        super.h(aVar, str, jSONObject);
        y(aVar);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aff7f9c", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.view.feeds.b bVar = this.f21826a;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b.H0(this.e);
        }
    }

    public final com.taobao.android.detail2.core.framework.data.global.a q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("4acc6a70", new Object[]{this});
        }
        return this.c.j();
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbf78387", new Object[]{this})).intValue();
        }
        if (q().K0(this.d.u0(), this.d.getType())) {
            return (int) this.f21826a.d();
        }
        return z83.a(this.c.j().K().c(), q());
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f2f3025", new Object[]{this})).booleanValue();
        }
        com.taobao.android.detail2.core.framework.view.feeds.b bVar = this.f21826a;
        if (bVar != null) {
            return bVar.g();
        }
        return false;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8170db8", new Object[]{this})).booleanValue();
        }
        return q().J0(this.d.u0(), this.d.getType());
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f0242c", new Object[]{this});
            return;
        }
        this.f21826a.m(this.d.u0(), this.d.getType());
        v(this.d);
    }

    public final void w(VerticalAbsViewHolder verticalAbsViewHolder) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62782a7", new Object[]{this, verticalAbsViewHolder});
        } else if (verticalAbsViewHolder != null && (t = verticalAbsViewHolder.c) != 0) {
            t.n0(this.c);
        }
    }

    public final void x(VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950dcdab", new Object[]{this, verticalAbsViewHolder});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(x3w.KEY_CONTEXT_DATA_HALF_HEIGHT, (Object) Float.valueOf(rra.c(this.c)));
        jSONObject.put("screenHeight", (Object) Integer.valueOf(z83.a(this.c.j().K().c(), q())));
        if (verticalAbsViewHolder != null) {
            verticalAbsViewHolder.C1("heightChange", jSONObject);
        }
    }

    public final void y(com.taobao.android.detail2.core.framework.base.weex.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a485561e", new Object[]{this, aVar});
            return;
        }
        int r = r();
        aVar.O(q().K().b(), r);
        txj.e(txj.TAG_RENDER, this.d.u0() + "最终设置给weex的高度：" + r);
    }

    public final void v(VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2898728", new Object[]{this, verticalAbsViewHolder});
        } else if (q().r0() && !this.f21826a.i(verticalAbsViewHolder.u0(), verticalAbsViewHolder.getType())) {
            ViewGroup.LayoutParams layoutParams = verticalAbsViewHolder.itemView.getLayoutParams();
            layoutParams.height = q().K().c() - 1;
            verticalAbsViewHolder.itemView.setLayoutParams(layoutParams);
            nbq.d("newDetail", wwj.TINCT_SCROLL_OPT, wwj.TINCT_SCROLL_OPT_PRERENDER, "default", true);
        }
    }
}
