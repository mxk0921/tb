package tb;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.MetaListPresenter;
import com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.HashSet;
import java.util.Set;
import tb.kib;
import tb.yw1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class xw1<VIEW extends kib, WIDGET extends yw1<? extends View, ? extends kib, ? extends jib, ? extends acx<? extends o02<? extends BaseSearchResult, ?>>>> extends ox<VIEW, WIDGET> implements jib<VIEW, WIDGET>, y8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BaseListAdapter f31634a;
    public z8e e;
    public boolean b = false;
    public int c = 0;
    public boolean d = true;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;
    public final Set<Integer> i = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/common/list/BaseListPresenter$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (xw1.l0(xw1.this) == 0 && ((kib) xw1.this.getIView()).I()) {
                xw1.this.c().l().b("BaseListPresenter", "dyn overlay hide, no dyn started");
                ((kib) xw1.this.getIView()).F((yw1) xw1.this.getWidget());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/common/list/BaseListPresenter$2");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else if (((kib) xw1.this.getIView()).I()) {
                xw1.this.c().l().A("BaseListPresenter", "dyn overlay hide, timeout");
                ((kib) xw1.this.getIView()).F((yw1) xw1.this.getWidget());
            }
        }
    }

    static {
        t2o.a(993001633);
        t2o.a(993001648);
        t2o.a(993001707);
    }

    public static /* synthetic */ Object ipc$super(xw1 xw1Var, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/common/list/BaseListPresenter");
    }

    public static /* synthetic */ int l0(xw1 xw1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ed2e0b2", new Object[]{xw1Var})).intValue();
        }
        return xw1Var.f;
    }

    @Override // tb.jib
    public void A(WidgetViewHolder<?, ?> widgetViewHolder, int i) {
        z8e z8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b489a3", new Object[]{this, widgetViewHolder, new Integer(i)});
            return;
        }
        ((HashSet) this.i).remove(Integer.valueOf(i));
        if ((widgetViewHolder instanceof wg3) && (z8eVar = this.e) != null) {
            z8eVar.e((wg3) widgetViewHolder, i);
        }
    }

    public void B0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60d87361", new Object[]{this, new Integer(i)});
        } else {
            ((yw1) getWidget()).B0(i);
        }
    }

    public int D0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65a7fe81", new Object[]{this})).intValue();
        }
        return z0();
    }

    public int E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91330373", new Object[]{this})).intValue();
        }
        return d();
    }

    public abstract float G0();

    public void I0(e64 e64Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42482c59", new Object[]{this, e64Var});
        } else {
            r0(e64Var.f18311a);
        }
    }

    public boolean K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a3446b0", new Object[]{this})).booleanValue();
        }
        return L0();
    }

    public boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6dca0fe6", new Object[]{this})).booleanValue();
        }
        if (!((acx) ((yw1) getWidget()).getModel()).g() || !this.d) {
            return false;
        }
        return true;
    }

    public final void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5366266", new Object[]{this});
            return;
        }
        ((kib) getIView()).H((yw1) getWidget(), this.h);
        c().l().c("BaseListPresenter", "dyn overlay shown, onlyViewHolder: %b", Boolean.valueOf(this.h));
    }

    public void O0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ae5690", new Object[]{this, new Integer(i)});
        } else if (c().f().h().c) {
            t0(i);
        }
    }

    @Override // tb.jib
    public void Q() {
        z8e z8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2386c72a", new Object[]{this});
        } else if (this.b && (z8eVar = this.e) != null) {
            z8eVar.c(this);
        }
    }

    public abstract BaseListAdapter Q0(WIDGET widget, int i, acx<? extends o02<? extends BaseSearchResult, ?>> acxVar, ListStyle listStyle, Activity activity);

    public void R0(BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5e3f68", new Object[]{this, baseSearchResult});
        } else {
            ((kib) getIView()).C(baseSearchResult.getCellsCount(), this.f31634a);
        }
    }

    public void S0(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e40efd", new Object[]{this, obj});
        } else {
            ((yw1) getWidget()).postEvent(obj);
        }
    }

    public void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f412b3", new Object[]{this});
            return;
        }
        ((HashSet) this.i).clear();
        this.f31634a.notifyDataSetChanged();
    }

    public void U(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92702da1", new Object[]{this, new Integer(i)});
            return;
        }
        ((yw1) getWidget()).postEvent(xxo.a(i));
        ((yw1) getWidget()).U(i);
    }

    public void U0(boolean z) {
        this.b = z;
        if (z && this.e == null) {
            try {
                this.e = (z8e) c().f().h().g.newInstance();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (!z) {
            this.e = null;
        }
    }

    public final void V0() {
        z8e z8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1cd2ff2", new Object[]{this});
        } else if (this.b && (z8eVar = this.e) != null) {
            z8eVar.a();
        }
    }

    @Override // tb.jib
    public o02 X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o02) ipChange.ipc$dispatch("450cb142", new Object[]{this});
        }
        return ((acx) ((yw1) getWidget()).getModel()).e();
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58927bd", new Object[]{this});
            return;
        }
        this.c = 0;
        ((yw1) getWidget()).postScopeEvent(zxo.a(((kib) getIView()).y()), "childPageWidget");
        ((yw1) getWidget()).a();
        q5i.a();
    }

    public int b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76d52181", new Object[]{this, new Float(f)})).intValue();
        }
        int i = (int) (f / 2.0f);
        if (i > 0 || f < 0.5d) {
            return i;
        }
        return 1;
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c87e87", new Object[]{this});
            return;
        }
        ((yw1) getWidget()).postScopeEvent(yxo.a(), "childPageWidget");
        ((yw1) getWidget()).c1();
    }

    @Override // tb.jib
    public int c2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a1c2e29", new Object[]{this})).intValue();
        }
        return ((acx) ((yw1) getWidget()).getModel()).e().getPageColumn();
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7721ef17", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.ox, tb.ddd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        z8e z8eVar = this.e;
        if (z8eVar != null) {
            z8eVar.destroy();
        }
    }

    @Override // tb.jib
    public void g(wg3 wg3Var, int i) {
        z8e z8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd62a2c", new Object[]{this, wg3Var, new Integer(i)});
        } else if (this.b && (z8eVar = this.e) != null) {
            z8eVar.g(wg3Var, i);
        }
    }

    @Override // tb.jib
    public RecyclerView.Adapter getAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter) ipChange.ipc$dispatch("95b4241c", new Object[]{this});
        }
        return this.f31634a;
    }

    @Override // tb.ddd
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        c().f().h().getClass();
        this.g = true;
        yw1 yw1Var = (yw1) getWidget();
        yw1Var.attachToContainer();
        int b2 = b(G0());
        acx acxVar = (acx) yw1Var.getModel();
        this.f31634a = Q0(yw1Var, b2, acxVar, acxVar.e().getUIListStyle(), yw1Var.getActivity());
        ((kib) getIView()).A(b2);
        ((kib) getIView()).K(this.f31634a);
        yw1Var.y2();
        yw1Var.x2();
        yw1Var.z2();
        yw1Var.w2();
        ((acx) ((yw1) getWidget()).getModel()).e().subscribe(this);
        yw1Var.subscribeEvent(this);
        yw1Var.subscribeScopeEvent(this, "childPageWidget");
    }

    @Override // tb.jib
    public void j0(wg3 wg3Var, int i) {
        z8e z8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3991fd42", new Object[]{this, wg3Var, new Integer(i)});
        } else if (this.b && (z8eVar = this.e) != null) {
            z8eVar.f(wg3Var, i);
        }
    }

    @Override // tb.jib
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9115262f", new Object[]{this});
            return;
        }
        int i = this.f - 1;
        this.f = i;
        try {
            if (this.g && i == 0 && ((kib) getIView()).I()) {
                c().l().b("BaseListPresenter", "dyn overlay hide, count to zero");
                ((kib) getIView()).F((yw1) getWidget());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // tb.jib
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b927a9", new Object[]{this});
        } else if (this.b && this.e != null) {
            if (!K0()) {
                this.e.b();
            } else {
                this.e.c(this);
            }
        }
    }

    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f18e32", new Object[]{this});
            return;
        }
        int i = this.c;
        this.c = 1 + i;
        if (i % w0() == 0) {
            l();
        }
        if (((acx) ((yw1) getWidget()).getModel()).h()) {
            ((yw1) getWidget()).postScopeEvent(byo.a(), "childPageWidget");
        }
        ((yw1) getWidget()).m0();
    }

    @Override // tb.jib
    public void n(WidgetViewHolder<?, ?> widgetViewHolder, int i) {
        z8e z8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c571931", new Object[]{this, widgetViewHolder, new Integer(i)});
            return;
        }
        ((HashSet) this.i).add(Integer.valueOf(i));
        if ((widgetViewHolder instanceof wg3) && (z8eVar = this.e) != null) {
            z8eVar.h((wg3) widgetViewHolder, i);
            this.e.c(this);
        }
        O0(i);
    }

    public void n0() {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fc82f4", new Object[]{this});
            return;
        }
        o02 e = ((acx) ((yw1) getWidget()).getModel()).e();
        BaseSearchResult baseSearchResult = (BaseSearchResult) e.getTotalSearchResult();
        ListStyle uIListStyle = e.getUIListStyle();
        if (baseSearchResult == null || baseSearchResult.getMainInfo().wfgap < 0.0f) {
            f = G0();
        } else {
            f = baseSearchResult.getMainInfo().wfgap;
        }
        int b2 = b(f);
        this.f31634a.i0(b2);
        ((kib) getIView()).J(uIListStyle);
        ((kib) getIView()).A(b2);
        this.f31634a.j0(uIListStyle);
        T0();
    }

    @Override // tb.jib
    public Float o2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("3e4984f9", new Object[]{this});
        }
        return null;
    }

    public void onEventMainThread(u2p u2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa51d788", new Object[]{this, u2pVar});
        } else if (u2pVar.b()) {
            T0();
        }
    }

    @Override // tb.jib
    public void onPause() {
        z8e z8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.d = false;
        if (this.b && (z8eVar = this.e) != null) {
            z8eVar.d(K0(), this);
        }
        q5i.a();
    }

    @Override // tb.jib
    public void onResume() {
        z8e z8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.d = true;
        if (this.b && (z8eVar = this.e) != null) {
            z8eVar.i(K0(), this);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.taobao.android.searchbaseframe.datasource.result.SearchResult] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p0() {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.xw1.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0012
            java.lang.String r2 = "b66401eb"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0012:
            boolean r1 = r4.g
            if (r1 == 0) goto L_0x006a
            tb.o02 r1 = r4.X()     // Catch: Exception -> 0x002b
            com.taobao.android.searchbaseframe.datasource.result.SearchResult r1 = r1.getTotalSearchResult()     // Catch: Exception -> 0x002b
            if (r1 == 0) goto L_0x002d
            boolean r2 = r1.isSuccess()     // Catch: Exception -> 0x002b
            if (r2 == 0) goto L_0x002d
            int r0 = r1.calcMuiseCellCount()     // Catch: Exception -> 0x002b
            goto L_0x002d
        L_0x002b:
            r0 = move-exception
            goto L_0x005b
        L_0x002d:
            if (r0 <= 0) goto L_0x006a
            r4.N0()     // Catch: Exception -> 0x002b
            java.lang.Object r0 = r4.getIView()     // Catch: Exception -> 0x002b
            tb.kib r0 = (tb.kib) r0     // Catch: Exception -> 0x002b
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()     // Catch: Exception -> 0x002b
            tb.xw1$a r1 = new tb.xw1$a     // Catch: Exception -> 0x002b
            r1.<init>()     // Catch: Exception -> 0x002b
            r2 = 80
            r0.postDelayed(r1, r2)     // Catch: Exception -> 0x002b
            java.lang.Object r0 = r4.getIView()     // Catch: Exception -> 0x002b
            tb.kib r0 = (tb.kib) r0     // Catch: Exception -> 0x002b
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()     // Catch: Exception -> 0x002b
            tb.xw1$b r1 = new tb.xw1$b     // Catch: Exception -> 0x002b
            r1.<init>()     // Catch: Exception -> 0x002b
            r2 = 300(0x12c, double:1.48E-321)
            r0.postDelayed(r1, r2)     // Catch: Exception -> 0x002b
            goto L_0x006a
        L_0x005b:
            tb.yko r1 = r4.c()
            tb.c4p r1 = r1.l()
            java.lang.String r2 = "BaseListPresenter"
            java.lang.String r3 = "dyn cover err"
            r1.e(r2, r3, r0)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xw1.p0():void");
    }

    @Override // tb.jib
    public void q0(wg3 wg3Var, int i) {
        z8e z8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78238e5e", new Object[]{this, wg3Var, new Integer(i)});
        } else if (this.b && (z8eVar = this.e) != null) {
            z8eVar.j(this, wg3Var, i);
        }
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4389135", new Object[]{this});
            return;
        }
        this.c = 0;
        ((yw1) getWidget()).r();
        l();
        V0();
    }

    public void r0(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ee5655", new Object[]{this, listStyle});
            return;
        }
        ((acx) ((yw1) getWidget()).getModel()).e().setUserListStyle(listStyle);
        this.f31634a.j0(listStyle);
        ((kib) getIView()).J(listStyle);
        this.f31634a.notifyDataSetChanged();
    }

    @Override // tb.jib
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73091392", new Object[]{this});
        } else {
            this.f++;
        }
    }

    public void t0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c08864", new Object[]{this, new Integer(i)});
        } else if (i >= getAdapter().getItemCount() - ((PartnerRecyclerView) ((kib) getIView()).getRecyclerView()).getPreRequestCellThreshold()) {
            ((MetaListPresenter) this).q1();
        }
    }

    public Set<Integer> u0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("cc12fa6b", new Object[]{this});
        }
        return this.i;
    }

    public int w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40d052f7", new Object[]{this})).intValue();
        }
        return 3;
    }

    public int x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("421cd554", new Object[]{this})).intValue();
        }
        return (int) ((D0() + E0()) * 0.6d);
    }

    public int y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dedad580", new Object[]{this})).intValue();
        }
        return (int) ((D0() + E0()) * 0.4d);
    }

    public int z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc17c05d", new Object[]{this})).intValue();
        }
        return ((kib) getIView()).getRecyclerView().getHeight();
    }

    public void onEventMainThread(z2p z2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34645a2", new Object[]{this, z2pVar});
        } else if (z2pVar.b()) {
            n0();
        } else {
            c().l().d("BaseListPresenter", "SearchEvent.SilentAfter is not new. not support now!!");
        }
    }

    public void onEventMainThread(t2p t2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15b8d6ed", new Object[]{this, t2pVar});
        } else if (t2pVar.c()) {
            n0();
            p0();
            this.h = true;
        } else {
            BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) ((yw1) getWidget()).getModel()).e().getLastSearchResult();
            if (baseSearchResult != null && !baseSearchResult.isFailed()) {
                R0(baseSearchResult);
            }
        }
    }

    public void onEventMainThread(v2p v2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f355957", new Object[]{this, v2pVar});
        } else {
            ((kib) getIView()).E(v2pVar.c(), v2pVar.b(), this.f31634a);
        }
    }

    public void onEventMainThread(y2p y2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2e0d0", new Object[]{this, y2pVar});
            return;
        }
        n0();
        this.h = true;
        p0();
    }

    public void onEventMainThread(e64 e64Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9202d438", new Object[]{this, e64Var});
        } else {
            I0(e64Var);
        }
    }

    public void onEventMainThread(vxo vxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bc07a9b", new Object[]{this, vxoVar});
        } else {
            ((kib) getIView()).x();
        }
    }
}
