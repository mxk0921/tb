package com.taobao.android.xsearchplugin.muise;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.taobao.R;
import java.util.Map;
import tb.bom;
import tb.bxc;
import tb.c4p;
import tb.com;
import tb.cpc;
import tb.dxc;
import tb.fw;
import tb.lib;
import tb.npc;
import tb.oxb;
import tb.p4p;
import tb.pwo;
import tb.t2o;
import tb.t48;
import tb.ude;
import tb.xpo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class AbsMuiseViewHolder<BEAN, MODEL> extends WidgetViewHolder<BEAN, MODEL> implements npc, bom, dxc, pwo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BEAN A;
    public int B;
    public fw l;
    public View m;
    public ViewGroup n;
    public BEAN o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public final xpo x;
    public JSONObject y;
    public boolean z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/muise/AbsMuiseViewHolder$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            AbsMuiseViewHolder.this.l.Q();
            AbsMuiseViewHolder.this.W0();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            int i9 = i3 - i;
            if (i9 != 0) {
                int i10 = i7 - i5;
                if (!(i10 == i9 && AbsMuiseViewHolder.this.B == i9)) {
                    AbsMuiseViewHolder absMuiseViewHolder = AbsMuiseViewHolder.this;
                    absMuiseViewHolder.B = i9;
                    if (!(absMuiseViewHolder.A == null || absMuiseViewHolder.r < 0 || i10 == 0)) {
                        c4p.D("ScreenTypeAdapt", "itemView width changed, refresh", new Object[0]);
                        AbsMuiseViewHolder.this.h1();
                    }
                }
                if (((ViewGroup) view.getParent()) != null && i != i5 && p4p.d()) {
                    AbsMuiseViewHolder.H0(AbsMuiseViewHolder.this);
                }
            }
        }
    }

    static {
        t2o.a(993002129);
        t2o.a(982515990);
        t2o.a(993001629);
        t2o.a(993002140);
        t2o.a(993001961);
    }

    public AbsMuiseViewHolder(Activity activity, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i, MODEL model) {
        this(activity, I0(activity, viewGroup), udeVar, listStyle, i, model);
    }

    public static /* synthetic */ void H0(AbsMuiseViewHolder absMuiseViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e8c9cd", new Object[]{absMuiseViewHolder});
        } else {
            absMuiseViewHolder.y1();
        }
    }

    public static View I0(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5159ec40", new Object[]{context, viewGroup});
        }
        return LayoutInflater.from(context).inflate(R.layout.libsf_search_item_muise, viewGroup, false);
    }

    public static /* synthetic */ Object ipc$super(AbsMuiseViewHolder absMuiseViewHolder, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1799577682:
                super.d0();
                return null;
            case -1743784140:
                return super.f0();
            case 217607196:
                super.r();
                return null;
            case 299066517:
                super.w0();
                return null;
            case 593843865:
                super.i();
                return null;
            case 949399698:
                super.x0();
                return null;
            case 1626033557:
                super.t0();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/muise/AbsMuiseViewHolder");
        }
    }

    public final void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236c8db3", new Object[]{this});
        } else if (this.t) {
            this.u = true;
            u1();
        }
    }

    public final boolean G0(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34db3154", new Object[]{this, aVar})).booleanValue();
        }
        fw fwVar = this.l;
        if (fwVar == null || aVar == null || !fwVar.d0(aVar)) {
            return false;
        }
        Activity activity = this.f9341a;
        if (activity instanceof cpc) {
            ((cpc) activity).E("cell leak");
        }
        return true;
    }

    public void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15b56b7", new Object[]{this});
        } else {
            this.l.u();
        }
    }

    public void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af423c", new Object[]{this});
            return;
        }
        View view = this.itemView;
        if (view != null) {
            this.m = view.findViewById(R.id.placeholder_img);
            this.n = (ViewGroup) this.itemView.findViewById(R.id.dynamic_container);
            p1(0);
            r1(this.m);
        }
        Activity activity = this.f9341a;
        if (activity instanceof oxb) {
            ((oxb) activity).closeViewDarkMode(this.itemView);
        }
    }

    public int L0(MuiseBean muiseBean, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11457ef2", new Object[]{this, muiseBean, bean})).intValue();
        }
        if (muiseBean != null) {
            return muiseBean.getCachedHeight(j0());
        }
        return -1;
    }

    public abstract int M0(MuiseBean muiseBean);

    public int N0(MuiseBean muiseBean, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec6fbe66", new Object[]{this, muiseBean, bean})).intValue();
        }
        if (j0() == ListStyle.LIST) {
            return M0(muiseBean);
        }
        return P0(muiseBean);
    }

    public ListStyle O0(MuiseBean muiseBean, BEAN bean) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("300b8510", new Object[]{this, muiseBean, bean});
        }
        TemplateBean y = this.l.y(muiseBean);
        if (y == null) {
            return j0();
        }
        int[] iArr = y.supportedStyle;
        int[] g1 = g1(muiseBean);
        if (g1 != null) {
            iArr = g1;
        }
        ListStyle j0 = j0();
        if (iArr == null) {
            return j0;
        }
        for (int i2 : iArr) {
            if (i2 == j0.ordinal()) {
                return j0;
            }
        }
        if (iArr.length > 0) {
            i = iArr[0];
        }
        if (i == 0) {
            return ListStyle.LIST;
        }
        return ListStyle.WATERFALL;
    }

    public abstract int P0(MuiseBean muiseBean);

    public boolean R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78c5b964", new Object[]{this})).booleanValue();
        }
        return this.z;
    }

    public boolean S0(BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fec1e81", new Object[]{this, bean})).booleanValue();
        }
        return false;
    }

    public boolean T0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac4ba603", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    public boolean U0(ListStyle listStyle, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1292e3", new Object[]{this, listStyle, bean})).booleanValue();
        }
        if (listStyle == ListStyle.LIST) {
            return true;
        }
        return false;
    }

    @Override // tb.bom
    public void V(com comVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f821f25", new Object[]{this, comVar});
        } else if (this.t) {
            this.v = true;
            u1();
        }
    }

    public boolean V0(int i, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd0dbe51", new Object[]{this, new Integer(i), bean})).booleanValue();
        }
        if (m0() == bean && n0() == i) {
            return true;
        }
        if (this.A != bean || S0(bean)) {
            return false;
        }
        return true;
    }

    public void W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1ee7fa", new Object[]{this});
        }
    }

    public void X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2274e35e", new Object[]{this});
        }
    }

    public abstract Map<String, Object> a1(BEAN bean, int i, boolean z, ListStyle listStyle);

    public abstract MuiseBean c1(BEAN bean);

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bc9fae", new Object[]{this});
            return;
        }
        super.d0();
        this.A = null;
    }

    public void d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d710d50", new Object[]{this});
        }
    }

    public void e1(BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d286f9fe", new Object[]{this, bean});
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public JSONObject f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("980ff734", new Object[]{this});
        }
        JSONObject f0 = super.f0();
        JSONObject jSONObject = this.y;
        if (jSONObject != null) {
            f0.put("查看init_data", (Object) jSONObject);
        }
        return f0;
    }

    public void f1(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d34a2f8", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.bom
    public void g(com comVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a76c27", new Object[]{this, comVar});
        } else if (this.t) {
            this.v = false;
            v1();
        }
    }

    public void h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9a43b1", new Object[]{this});
            return;
        }
        this.itemView.getLayoutParams().height = this.itemView.getMeasuredHeight();
        k1(this.A, i0());
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.i();
        this.l.u();
    }

    public final void j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("922aa3be", new Object[]{this});
        } else {
            this.itemView.addOnLayoutChangeListener(new b());
        }
    }

    public void k1(BEAN bean, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36bdc6a", new Object[]{this, bean, new Integer(i)});
            return;
        }
        this.q = false;
        int i2 = this.r;
        this.r = i;
        s1();
        MuiseBean c1 = c1(bean);
        ListStyle O0 = O0(c1, bean);
        Map<String, Object> a1 = a1(bean, i, U0(O0, bean), O0);
        if (c0().g().isDebug()) {
            this.y = c0().t().b(a1);
        }
        if (!this.l.P()) {
            c4p.D("[XS.render]", "[Muise render] Start, tItemType: %s, index: %d", c1.type, Integer.valueOf(this.r));
            this.l.W(i);
            z = this.l.L(c1, a1);
            this.A = bean;
            e1(bean);
        } else {
            c4p.D("[XS.render]", "[Muise refresh] Start, tItemType: %s, from index: %d, to index: %d", c1.type, Integer.valueOf(i2), Integer.valueOf(this.r));
            this.l.W(i);
            z = this.l.K(c1, a1);
            this.A = bean;
            e1(bean);
        }
        if (z && (getParent() instanceof lib)) {
            ((lib) getParent()).s();
        }
        if (!z) {
            d1();
            this.q = true;
            n1();
        }
    }

    public void l1(BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eea3484", new Object[]{this, bean});
        }
    }

    public void m1() {
        BEAN bean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f429567", new Object[]{this});
        } else if (this.l.x() == null && !this.l.z() && (bean = this.A) != null) {
            k1(bean, i0());
        }
    }

    public void n1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f75f04a5", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        View view = this.m;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void o1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2184b51", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.n;
        if (viewGroup == null) {
            c0().l().d("AbsMuiseViewHolder", "setCellHeightAutoChange:mDynamicContainer is null");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        if (layoutParams == null) {
            c0().l().d("AbsMuiseViewHolder", "setCellHeightAutoChange:layoutParams is null");
            return;
        }
        layoutParams.height = -2;
        if (this.itemView.getLayoutParams() != null) {
            this.itemView.getLayoutParams().height = -2;
            this.itemView.requestLayout();
        }
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
        } else {
            b1(aVar, String.valueOf(i), str);
        }
    }

    @Override // tb.npc
    public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        if (getParent() instanceof lib) {
            ((lib) getParent()).k();
        }
        fw fwVar = this.l;
        if (fwVar != null) {
            fwVar.u();
        }
        b1(aVar, String.valueOf(i), str);
    }

    @Override // tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        } else {
            i1(aVar);
        }
    }

    @Override // tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        if (getParent() instanceof lib) {
            ((lib) getParent()).k();
        }
        fw fwVar = this.l;
        if (fwVar != null) {
            fwVar.u();
        }
        b1(aVar, String.valueOf(i), str);
    }

    @Override // tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
        } else {
            i1(aVar);
        }
    }

    public void p1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee994aaf", new Object[]{this, new Integer(i)});
        } else {
            this.itemView.setBackgroundColor(i);
        }
    }

    public void q1(fw fwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ca0ad1", new Object[]{this, fwVar});
        } else {
            this.l = fwVar;
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.r();
        this.l.I();
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec29fdff", new Object[]{this});
        } else {
            t0();
        }
    }

    public void r1(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59eb07fe", new Object[]{this, view});
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void s0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeeaee7c", new Object[]{this});
        } else {
            x0();
        }
    }

    public void s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8dcd10f", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        View view = this.m;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void t1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8427100f", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            viewGroup.setDescendantFocusability(393216);
            this.n.setVisibility(0);
            this.n.setDescendantFocusability(262144);
        }
        View view = this.m;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
        } else {
            this.l.u();
        }
    }

    @Override // tb.pwo
    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f1aecd", new Object[]{this, new Integer(i)});
        } else if (this.A != null && this.r >= 0) {
            h1();
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.w0();
        this.l.F();
    }

    public void x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1408fd9", new Object[]{this});
            return;
        }
        BEAN data = getData();
        if (data != null && this.q) {
            MuiseBean c1 = c1(data);
            int w = this.l.w();
            if (w < 0) {
                w = this.itemView.getHeight();
            }
            ListStyle O0 = O0(c1, data);
            f1(c1.getCachedHeight(O0), w);
            c1.updateCachedHeight(O0, w);
        }
    }

    public final void y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b14b559a", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a x = this.l.x();
        int h0 = h0();
        this.s = h0;
        if (!ScreenType.IS_FOLDABLE && !ScreenType.IS_PAD && x != null) {
            x.addInstanceEnv("columnIndex", String.valueOf(h0));
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void z0(BEAN bean) {
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971a19dd", new Object[]{this, bean});
            return;
        }
        MuiseBean c1 = c1(bean);
        Q0(c1, bean);
        boolean U0 = U0(O0(c1, bean), bean);
        ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
        if (layoutParams2 instanceof StaggeredGridLayoutManager.LayoutParams) {
            layoutParams = (StaggeredGridLayoutManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = new StaggeredGridLayoutManager.LayoutParams(layoutParams2);
        }
        layoutParams.setFullSpan(U0);
    }

    public final void z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c768ce", new Object[]{this});
        } else if (this.t) {
            this.u = false;
            this.v = false;
            v1();
        }
    }

    public AbsMuiseViewHolder(Activity activity, View view, ude udeVar, ListStyle listStyle, int i, MODEL model) {
        super(view, activity, udeVar, listStyle, i, model);
        this.o = null;
        this.p = -1;
        this.q = true;
        this.r = -1;
        this.s = -1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = -1;
        this.x = new a();
        this.z = false;
        this.B = 0;
        K0();
        if (getParent() instanceof com) {
            this.t = ((com) getParent()).D1();
        }
        if (getParent() instanceof bxc) {
            ((bxc) getParent()).V1(this);
        }
        ScreenType g = ScreenType.g(activity);
        if (g != null) {
            g.i(this);
        }
        j1();
    }

    public int Y0(MuiseBean muiseBean, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b84fe176", new Object[]{this, muiseBean, bean})).intValue();
        }
        if (muiseBean == null) {
            c0().l().d("AbsMuiseViewHolder", "obtainFixHeightFromTemplate:muise bean is null");
            return 0;
        }
        TemplateBean y = this.l.y(muiseBean);
        if (y == null) {
            c0().l().d("AbsMuiseViewHolder", "obtainFixHeightFromTemplate:template is null");
            return 0;
        } else if (j0() == ListStyle.LIST) {
            return y.listHeight;
        } else {
            return y.midHeight;
        }
    }

    public final void i1(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7b4ca", new Object[]{this, aVar});
            return;
        }
        int i = this.s;
        if (i >= 0) {
            aVar.addInstanceEnv("columnIndex", String.valueOf(i));
        }
        if (getParent() instanceof lib) {
            ((lib) getParent()).k();
        }
        this.q = true;
        x1();
        o1();
        this.l.p(this.n, aVar);
        t1();
        if (this.t) {
            u1();
        } else if (this.z) {
            if (this.l.x() != null) {
                this.l.x().updateNativeState("visibility", "appear");
            }
            this.l.Q();
            W0();
        }
        if (this.o != null && !G0(aVar)) {
            BEAN bean = this.o;
            int i2 = this.p;
            this.o = null;
            this.p = -1;
            k1(bean, i2);
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        m1();
        super.t0();
        this.z = true;
        if (!this.t) {
            if (this.l.x() != null) {
                this.l.x().updateNativeState("visibility", "appear");
            }
            this.l.Q();
            W0();
        }
        A1();
    }

    public final void u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9eeb74", new Object[]{this});
            return;
        }
        if (this.l.x() != null) {
            this.l.x().updateNativeState("visibility", "appear");
        }
        if (this.u && this.v && this.q) {
            if (i0() != this.r || this.w != 0) {
                this.itemView.removeCallbacks(this.x);
                this.itemView.postDelayed(this.x, 100L);
                this.w = 0;
            }
        }
    }

    public final void v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ce0fd2", new Object[]{this});
            return;
        }
        if (this.l.x() != null) {
            this.l.x().updateNativeState("visibility", "disappear");
        }
        this.itemView.removeCallbacks(this.x);
        if (this.w == 0) {
            this.l.R();
            X0();
        }
        this.w = 1;
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.x0();
        this.z = false;
        z1();
        if (!this.t) {
            if (this.l.x() != null) {
                this.l.x().updateNativeState("visibility", "disappear");
            }
            this.l.R();
            X0();
            return;
        }
        v1();
    }

    public int[] g1(MuiseBean muiseBean) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("947cbeb8", new Object[]{this, muiseBean});
        }
        if (muiseBean == null || (jSONArray = muiseBean.status.getJSONArray("supportedStyle")) == null || jSONArray.size() <= 0) {
            return null;
        }
        int size = jSONArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = jSONArray.getIntValue(i);
        }
        return iArr;
    }

    public void Q0(MuiseBean muiseBean, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5cc245", new Object[]{this, muiseBean, bean});
            return;
        }
        int L0 = L0(muiseBean, bean);
        int Y0 = Y0(muiseBean, bean);
        if (T0(L0)) {
            c0().l().c("AbsMuiseViewHolder", "using cached height: %d, type: %s", Integer.valueOf(L0), muiseBean);
            ViewGroup viewGroup = this.n;
            if (viewGroup != null) {
                viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, L0));
                return;
            }
            return;
        }
        if (Y0 > 0) {
            c0().l().c("AbsMuiseViewHolder", "using fixed height: %d, type: %s", Integer.valueOf(Y0), muiseBean);
        } else {
            Y0 = N0(muiseBean, bean);
            c0().l().c("AbsMuiseViewHolder", "using sub size: %d, type: %s", Integer.valueOf(Y0), muiseBean);
        }
        ViewGroup viewGroup2 = this.n;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(new FrameLayout.LayoutParams(-1, Y0));
        }
    }

    public void b1(com.taobao.android.weex_framework.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205ef881", new Object[]{this, aVar, str, str2});
            return;
        }
        c4p.C("[XS.render]", "render failed at %d, code: %s, msg: %s", Integer.valueOf(i0()), str, str2);
        if ((o0() instanceof t48) && getData() != null) {
            ((t48) o0()).n0(this, c1(getData()).type, aVar, str, str2);
        }
        if (!this.q) {
            n1();
        }
        this.q = true;
        if (this.o != null && !G0(aVar)) {
            BEAN bean = this.o;
            int i = this.p;
            this.o = null;
            this.p = -1;
            k1(bean, i);
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void u0(int i, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b45dfc", new Object[]{this, new Integer(i), bean});
        } else if (this.l == null) {
            throw new IllegalStateException("you must call onCreateRender in subclass constructor by hand");
        } else if (!V0(i, bean)) {
            l1(bean);
            MuiseBean c1 = c1(bean);
            D0(bean);
            if (this.q) {
                k1(bean, i);
            } else {
                c4p.C("[XS.render]", "[Muise refresh] Skip redundant data bind: tItemType: %s, form index: %d to index: %d", c1.getdItemType(), Integer.valueOf(this.r), Integer.valueOf(i));
                this.o = bean;
                this.p = i;
            }
            A1();
        }
    }
}
