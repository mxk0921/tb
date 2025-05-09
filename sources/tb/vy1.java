package tb;

import android.text.TextUtils;
import android.view.FrameMetrics;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.n;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.MemoryDispatcher;
import com.taobao.monitor.impl.trace.PageLeaveDispatcher;
import com.taobao.monitor.impl.trace.b;
import com.taobao.monitor.impl.trace.c;
import com.taobao.monitor.impl.trace.d;
import com.taobao.monitor.impl.trace.g;
import com.taobao.monitor.impl.trace.h;
import com.taobao.monitor.impl.trace.i;
import com.taobao.monitor.impl.trace.j;
import com.taobao.monitor.impl.trace.l;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cw8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class vy1 extends px implements d.e, IPage.b, IPage.c, j.h, cw8.a, b.AbstractC0625b, ApplicationBackgroundChangedDispatcher.b, l.c, g.b, i.b, PageLeaveDispatcher.b, h.b, c.AbstractC0626c, MemoryDispatcher.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final cll c;
    public mdd d;
    public d e;
    public l f;
    public b g;
    public cw8 h;
    public h i;
    public ApplicationBackgroundChangedDispatcher j;
    public i k;
    public g l;
    public j m;
    public PageLeaveDispatcher n;
    public c o;
    public MemoryDispatcher p;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public boolean q = true;
    public final List<Integer> z = new ArrayList();
    public final List<Integer> A = new ArrayList();
    public final List<Integer> B = new ArrayList();
    public int C = 0;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public int G = 0;
    public final List<FrameMetrics> H = new ArrayList();
    public final List<Integer> I = new ArrayList();
    public int n0 = 0;
    public final Map<String, List<Object>> K = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            vy1.this.n0();
            vy1.this.X();
            vy1.this.W();
            vy1.S(vy1.this);
            if (!yq7.c(vy1.T(vy1.this))) {
                vy1.T(vy1.this).removeListener(vy1.this);
            }
            long a2 = out.a();
            vy1.U(vy1.this, a2);
            vy1 vy1Var = vy1.this;
            vy1Var.b0(vy1Var.c.getPageName(), vy1.this.c.x(), new HashMap(), a2);
            vy1.this.d.a(pl4.KEY_LOAD_TYPE, "supplementary");
        }
    }

    public vy1(cll cllVar) {
        this.c = cllVar;
        n0();
        X();
    }

    public static /* synthetic */ void S(vy1 vy1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da7130e", new Object[]{vy1Var});
        } else {
            vy1Var.O();
        }
    }

    public static /* synthetic */ j T(vy1 vy1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("21b9d588", new Object[]{vy1Var});
        }
        return vy1Var.m;
    }

    public static /* synthetic */ void U(vy1 vy1Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6017be34", new Object[]{vy1Var, new Long(j)});
        } else {
            vy1Var.Q(j);
        }
    }

    public static /* synthetic */ Object ipc$super(vy1 vy1Var, String str, Object... objArr) {
        if (str.hashCode() == -410389705) {
            super.R();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/processor/custom/BasePageProcessor");
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void C(cll cllVar, float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454264d4", new Object[]{this, cllVar, new Float(f), new Long(j)});
        } else if (Y(cllVar)) {
            h0(f, j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void E(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a73191", new Object[]{this, cllVar, new Long(j)});
        } else if (Y(cllVar)) {
            i0(j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void G(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11148397", new Object[]{this, cllVar, new Long(j)});
        } else if (Y(cllVar)) {
            j0(j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void H(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1aff1f", new Object[]{this, cllVar, new Long(j)});
        } else if (Y(cllVar)) {
            d0(j);
            N();
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void L(cll cllVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af607a6", new Object[]{this, cllVar, new Integer(i)});
        } else if (Y(cllVar)) {
            g0(i);
        }
    }

    @Override // tb.px
    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e789f337", new Object[]{this});
            return;
        }
        super.R();
        if (!yq7.c(this.e)) {
            this.e.removeListener(this);
        }
        if (!yq7.c(this.p)) {
            this.p.removeListener(this);
        }
        if (!yq7.c(this.g)) {
            this.g.removeListener(this);
        }
        if (!yq7.c(this.f)) {
            this.f.removeListener(this);
        }
        if (!yq7.c(this.h)) {
            this.h.removeListener(this);
        }
        if (!yq7.c(this.j)) {
            this.j.removeListener(this);
        }
        if (!yq7.c(this.l)) {
            this.l.removeListener(this);
        }
        if (!yq7.c(this.k)) {
            this.k.removeListener(this);
        }
        if (!yq7.c(this.m)) {
            this.m.removeListener(this);
        }
        if (!yq7.c(this.n)) {
            this.n.removeListener(this);
        }
        if (!yq7.c(this.i)) {
            this.i.removeListener(this);
        }
        if (!yq7.c(this.o)) {
            this.o.removeListener(this);
        }
        ProcedureGlobal.PROCEDURE_MANAGER.E(this.c);
        m0();
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199c9068", new Object[]{this});
        } else if (nnl.h(this.c.o()) || nnl.h(this.c.getPageName())) {
            w9a.g().f().post(new a());
        }
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe08de", new Object[]{this});
            return;
        }
        zzb<?> M = M(ic.WINDOW_EVENT_DISPATCHER);
        if (M instanceof l) {
            this.f = (l) M;
        }
        zzb<?> M2 = M(ic.APPLICATION_LOW_MEMORY_DISPATCHER);
        if (M2 instanceof b) {
            this.g = (b) M2;
        }
        zzb<?> M3 = M(ic.ACTIVITY_FPS_DISPATCHER);
        if (M3 instanceof cw8) {
            this.h = (cw8) M3;
        }
        zzb<?> M4 = M(ic.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
        if (M4 instanceof ApplicationBackgroundChangedDispatcher) {
            this.j = (ApplicationBackgroundChangedDispatcher) M4;
        }
        zzb<?> M5 = M(ic.NETWORK_STAGE_DISPATCHER);
        if (M5 instanceof i) {
            this.k = (i) M5;
        }
        zzb<?> M6 = M(ic.IMAGE_STAGE_DISPATCHER);
        if (M6 instanceof g) {
            this.l = (g) M6;
        }
        zzb<?> M7 = M(ic.PAGE_RENDER_DISPATCHER);
        if (M7 instanceof j) {
            this.m = (j) M7;
        }
        zzb<?> M8 = M(ic.PAGE_LEAVE_DISPATCHER);
        if (M8 instanceof PageLeaveDispatcher) {
            this.n = (PageLeaveDispatcher) M8;
        }
        zzb<?> M9 = M(ic.LOOPER_HEAVY_MSG_DISPATCHER);
        if (M9 instanceof h) {
            this.i = (h) M9;
        }
        zzb<?> M10 = M(ic.BATTERY_DISPATCHER);
        if (M10 instanceof c) {
            this.o = (c) M10;
        }
        zzb<?> M11 = M(ic.CLOCKED_MEMORY_DISPATCHER);
        if (M11 instanceof MemoryDispatcher) {
            this.p = (MemoryDispatcher) M11;
        }
        if (!yq7.c(this.g)) {
            this.g.addListener(this);
        }
        if (!yq7.c(this.f)) {
            this.f.addListener(this);
        }
        if (!yq7.c(this.h)) {
            this.h.addListener(this);
        }
        if (!yq7.c(this.j)) {
            this.j.addListener(this);
        }
        if (!yq7.c(this.k)) {
            this.k.addListener(this);
        }
        if (!yq7.c(this.l)) {
            this.l.addListener(this);
        }
        if (!yq7.c(this.m)) {
            this.m.addListener(this);
        }
        if (!yq7.c(this.n)) {
            this.n.addListener(this);
        }
        if (!yq7.c(this.i)) {
            this.i.addListener(this);
        }
        if (!yq7.c(this.o)) {
            this.o.addListener(this);
        }
    }

    public void X() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd0eaaa", new Object[]{this});
            return;
        }
        c.b l = new c.b().k(this.c.b()).j(false).o(true).m(true).l(null);
        if ((!o48.i || !w9a.g().h()) && o48.h && !tqo.a(this.c.o())) {
            z = true;
        }
        mdd a2 = sxm.b.a(z4u.a("/pageLoad"), l.i(z).h());
        this.d = a2;
        a2.c();
        ProcedureGlobal.PROCEDURE_MANAGER.D(this.c, this.d);
    }

    public boolean Y(cll cllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("179b760b", new Object[]{this, cllVar})).booleanValue();
        }
        if (cllVar == null || cllVar != this.c) {
            return false;
        }
        return true;
    }

    public abstract void Z(String str, long j);

    @Override // com.taobao.monitor.impl.trace.h.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b39840", new Object[]{this});
        } else {
            this.n0++;
        }
    }

    public abstract void a0(long j);

    @Override // com.taobao.monitor.procedure.IPage.c
    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385ab762", new Object[]{this, str, map});
        } else {
            this.d.b(str, map);
        }
    }

    public abstract void b0(String str, String str2, Map<String, Object> map, long j);

    public abstract void c0(long j);

    public abstract void d0(long j);

    @Override // com.taobao.monitor.impl.trace.i.b
    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b59f8bcd", new Object[]{this, new Integer(i)});
        } else if (!this.q) {
        } else {
            if (i == 0) {
                this.v++;
            } else if (i == 1) {
                this.w++;
            } else if (i == 2) {
                this.x++;
            } else if (i == 3) {
                this.y++;
            }
        }
    }

    public abstract void e0(long j);

    @Override // com.taobao.monitor.impl.trace.j.h
    public void f(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587b791e", new Object[]{this, cllVar, new Long(j)});
        } else if (Y(cllVar)) {
            k0(cllVar, j);
        }
    }

    public abstract void f0(long j);

    @Override // tb.cw8.a
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93e51", new Object[]{this, new Integer(i)});
        } else if (((ArrayList) this.I).size() < 200 && this.q) {
            ((ArrayList) this.I).add(Integer.valueOf(i));
        }
    }

    public abstract void g0(int i);

    public abstract void h0(float f, long j);

    public abstract void i0(long j);

    public abstract void j0(long j);

    public abstract void k0(cll cllVar, long j);

    @Override // tb.cw8.a
    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e069e7c0", new Object[]{this, new Integer(i)});
        } else if (((ArrayList) this.B).size() < 200 && this.q) {
            ((ArrayList) this.B).add(Integer.valueOf(i));
        }
    }

    public void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7c4758", new Object[]{this});
            return;
        }
        ((ArrayList) this.z).clear();
        ((ArrayList) this.A).clear();
        ((ArrayList) this.B).clear();
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        ((ArrayList) this.H).clear();
        ((ArrayList) this.I).clear();
        this.n0 = 0;
        ((HashMap) this.K).clear();
    }

    @Override // tb.cw8.a
    public void m(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d825ceeb", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        if (((ArrayList) this.z).size() < 200 && this.q) {
            ((ArrayList) this.z).add(Integer.valueOf(i));
        }
        if (fyo.SCROLL_TYPE_FINGER.equals(str) && ((ArrayList) this.A).size() < 200 && this.q) {
            this.E += i2;
            this.F += i3;
            this.G += i4;
            this.C += i5;
            this.D += i6;
            ((ArrayList) this.A).add(Integer.valueOf(i));
        }
    }

    public final void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959dd096", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((HashMap) this.K).entrySet()) {
            this.d.u((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void n(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68feefe6", new Object[]{this, cllVar, new Long(j)});
        } else if (Y(cllVar)) {
            c0(j);
        }
    }

    public void n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5f39a62", new Object[]{this});
            return;
        }
        zzb<?> b = yq7.b(ic.CUSTOM_PAGE_LIFECYCLE_DISPATCHER);
        if (b instanceof d) {
            this.e = (d) b;
        }
        if (!yq7.c(this.e)) {
            this.e.addListener(this);
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.c
    public void onStage(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
        } else {
            this.d.j(str, j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void p(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdaffc8", new Object[]{this, cllVar, new Long(j)});
        } else if (Y(cllVar)) {
            this.q = false;
            e0(j);
            if (!yq7.c(this.p)) {
                this.p.removeListener(this);
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.g.b
    public void q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e690afa", new Object[]{this, new Integer(i)});
        } else if (!this.q) {
        } else {
            if (i == 0) {
                this.r++;
            } else if (i == 1) {
                this.s++;
            } else if (i == 2) {
                this.t++;
            } else if (i == 3) {
                this.u++;
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.j.h
    public void t(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f0b107", new Object[]{this, cllVar, new Long(j)});
        } else if (Y(cllVar)) {
            f0(j);
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.c
    public void u(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318f547c", new Object[]{this, str, obj});
        } else if (!TextUtils.isEmpty(str) && obj != null) {
            List list = (List) ((HashMap) this.K).get(str);
            if (list == null) {
                list = new ArrayList();
                ((HashMap) this.K).put(str, list);
            }
            list.add(obj);
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void v(cll cllVar, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81656cc6", new Object[]{this, cllVar, map, new Long(j)});
        } else if (Y(cllVar)) {
            W();
            Q(j);
            b0(cllVar.getPageName(), cllVar.x(), map, j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.e
    public void x(cll cllVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8786d6", new Object[]{this, cllVar, new Long(j)});
        } else if (Y(cllVar)) {
            this.q = true;
            a0(j);
            if (!yq7.c(this.p)) {
                this.p.addListener(this);
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.PageLeaveDispatcher.b
    public void z(cll cllVar, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f3019a", new Object[]{this, cllVar, new Integer(i), new Long(j)});
        } else if (!Y(cllVar)) {
        } else {
            if (i == -5) {
                Z(n.LEAVE_TYPE_JUMP_NEXT_PAGE, j);
            } else if (i == -4) {
                Z("back", j);
                N();
            } else if (i == -3) {
                Z(n.LEAVE_TYPE_F2B, j);
                N();
                V();
            }
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.c
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539dc3c3", new Object[]{this, str, obj});
        } else {
            this.d.a(str, obj);
        }
    }
}
