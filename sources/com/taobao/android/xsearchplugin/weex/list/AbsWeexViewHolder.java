package com.taobao.android.xsearchplugin.weex.list;

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
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.taobao.R;
import com.taobao.weex.bridge.JSCallback;
import java.util.Map;
import tb.bom;
import tb.c4p;
import tb.cbk;
import tb.com;
import tb.f64;
import tb.t2o;
import tb.t48;
import tb.ude;
import tb.uz;
import tb.xpo;
import tb.zak;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class AbsWeexViewHolder<BEAN, MODEL> extends WidgetViewHolder<BEAN, MODEL> implements uz.d, cbk.a, bom {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public uz l;
    public View m;
    public ViewGroup n;
    public BEAN o;
    public boolean p;
    public int q;
    public final boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public final xpo v;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/weex/list/AbsWeexViewHolder$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            AbsWeexViewHolder.this.l.H();
            AbsWeexViewHolder.this.N0();
        }
    }

    static {
        t2o.a(993002183);
        t2o.a(993002193);
        t2o.a(993002197);
        t2o.a(993001629);
    }

    public AbsWeexViewHolder(Activity activity, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i, MODEL model) {
        this(activity, G0(activity, viewGroup), udeVar, listStyle, i, model);
    }

    public static View G0(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5159ec40", new Object[]{context, viewGroup});
        }
        return LayoutInflater.from(context).inflate(R.layout.libsf_search_item_weex, viewGroup, false);
    }

    public static /* synthetic */ Object ipc$super(AbsWeexViewHolder absWeexViewHolder, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1743784140:
                return absWeexViewHolder.f0();
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/weex/list/AbsWeexViewHolder");
        }
    }

    @Override // tb.uz.d
    public void H(cbk cbkVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed0b776", new Object[]{this, cbkVar, str, str2});
            return;
        }
        if ((o0() instanceof t48) && getData() != null) {
            ((t48) o0()).n0(this, R0(getData()).type, cbkVar, str, str2);
        }
        if (!this.p) {
            U0();
        }
        this.p = true;
        BEAN bean = this.o;
        if (bean != null) {
            this.o = null;
            T0(bean);
        }
    }

    public void H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af423c", new Object[]{this});
            return;
        }
        View view = this.itemView;
        if (view != null) {
            View findViewById = view.findViewById(R.id.placeholder_img);
            this.m = findViewById;
            findViewById.setVisibility(8);
            this.n = (ViewGroup) this.itemView.findViewById(R.id.dynamic_container);
            W0(0);
            X0(this.m);
        }
    }

    public abstract int I0(WeexBean weexBean);

    public ListStyle J0(WeexBean weexBean) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("c6c2a262", new Object[]{this, weexBean});
        }
        TemplateBean q = this.l.q(weexBean);
        if (q == null) {
            return j0();
        }
        int[] iArr = q.supportedStyle;
        int[] S0 = S0(weexBean);
        if (S0 != null) {
            iArr = S0;
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

    public abstract int K0(WeexBean weexBean);

    public void K1(cbk cbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db503d", new Object[]{this, cbkVar});
            return;
        }
        this.p = true;
        e1();
        V0();
        this.l.i(this.n, cbkVar);
        b1();
        if (!this.r) {
            this.l.H();
            N0();
        } else {
            c1();
        }
        BEAN bean = this.o;
        if (bean != null) {
            this.o = null;
            T0(bean);
        }
    }

    public boolean M0(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1276dc7", new Object[]{this, listStyle})).booleanValue();
        }
        if (listStyle == ListStyle.LIST) {
            return true;
        }
        return false;
    }

    public void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1ee7fa", new Object[]{this});
        }
    }

    public void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2274e35e", new Object[]{this});
        }
    }

    public abstract Map<String, Object> Q0(BEAN bean, int i, boolean z, ListStyle listStyle);

    public abstract WeexBean R0(BEAN bean);

    public void U0() {
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

    @Override // tb.bom
    public void V(com comVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f821f25", new Object[]{this, comVar});
        } else if (this.r) {
            this.t = true;
            c1();
        }
    }

    public void V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2184b51", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.n;
        if (viewGroup == null) {
            c0().l().d("AbsWeexViewHolder", "setCellHeightAutoChange:mDynamicContainer is null");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        if (layoutParams == null) {
            c0().l().d("AbsWeexViewHolder", "setCellHeightAutoChange:layoutParams is null");
        } else {
            layoutParams.height = -2;
        }
    }

    public void W0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee994aaf", new Object[]{this, new Integer(i)});
        } else {
            this.itemView.setBackgroundColor(i);
        }
    }

    public void X0(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59eb07fe", new Object[]{this, view});
        }
    }

    public void Y0(uz uzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d007a9e2", new Object[]{this, uzVar});
        } else {
            this.l = uzVar;
        }
    }

    public void Y1(cbk cbkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9957aa4", new Object[]{this, cbkVar});
            return;
        }
        this.p = true;
        e1();
        V0();
        this.l.i(this.n, cbkVar);
        b1();
        if (!this.r) {
            this.l.H();
            N0();
        } else {
            c1();
        }
        BEAN bean = this.o;
        if (bean != null) {
            this.o = null;
            T0(bean);
        }
    }

    public void a1() {
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

    public void b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8427100f", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.n;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        View view = this.m;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public final void c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9eeb74", new Object[]{this});
        } else if (this.s && this.t && this.p) {
            if (i0() != this.q || this.u != 0) {
                this.itemView.removeCallbacks(this.v);
                this.itemView.postDelayed(this.v, 100L);
                this.u = 0;
            }
        }
    }

    public final void d1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ce0fd2", new Object[]{this});
            return;
        }
        this.itemView.removeCallbacks(this.v);
        if (this.u == 0) {
            this.l.I();
            O0();
        }
        this.u = 1;
    }

    public void e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1408fd9", new Object[]{this});
            return;
        }
        BEAN data = getData();
        if (data != null && this.p) {
            WeexBean R0 = R0(data);
            int p = this.l.p();
            if (p < 0) {
                p = this.itemView.getHeight();
            }
            ListStyle J0 = J0(R0);
            if (R0.getCachedHeight(J0) <= 0) {
                R0.updateCachedHeight(J0, p);
            }
        }
    }

    public final void f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c768ce", new Object[]{this});
        } else if (this.r) {
            this.s = false;
            this.t = false;
            d1();
        }
    }

    @Override // tb.bom
    public void g(com comVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a76c27", new Object[]{this, comVar});
        } else if (this.r) {
            this.t = false;
            d1();
        }
    }

    public final void g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236c8db3", new Object[]{this});
        } else if (this.r) {
            this.s = true;
            c1();
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.i();
        this.l.o();
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.r();
        this.l.w();
    }

    @Override // tb.cbk.a
    public void r2(String str, JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bfe7a2d", new Object[]{this, str, jSONObject, jSCallback, jSCallback2});
        } else {
            A0(f64.a(str, jSONObject, zak.a(jSCallback), zak.a(jSCallback2)));
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.t0();
        g1();
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void u0(int i, BEAN bean) {
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b45dfc", new Object[]{this, new Integer(i), bean});
        } else if (this.l != null) {
            WeexBean R0 = R0(bean);
            this.l.q(R0);
            L0(R0);
            boolean M0 = M0(J0(R0));
            ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
            if (layoutParams2 instanceof StaggeredGridLayoutManager.LayoutParams) {
                layoutParams = (StaggeredGridLayoutManager.LayoutParams) layoutParams2;
            } else {
                layoutParams = new StaggeredGridLayoutManager.LayoutParams(layoutParams2);
            }
            layoutParams.setFullSpan(M0);
            if (m0() != bean || n0() != i) {
                if (this.p) {
                    T0(bean);
                } else {
                    this.o = bean;
                }
                g1();
            }
        } else {
            throw new IllegalStateException("you must call onCreateRender in subclass constructor by hand");
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void v0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
        } else {
            this.l.o();
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
        this.l.u();
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public void x0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.x0();
        f1();
        if (!this.r) {
            this.l.I();
            O0();
            return;
        }
        d1();
    }

    public AbsWeexViewHolder(Activity activity, View view, ude udeVar, ListStyle listStyle, int i, MODEL model) {
        super(view, activity, udeVar, listStyle, i, model);
        this.o = null;
        this.p = true;
        this.q = -1;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = -1;
        this.v = new a();
        H0();
        c0().f().h();
        if (getParent() instanceof com) {
            this.r = ((com) getParent()).D1();
        }
    }

    public int P0(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a85417e8", new Object[]{this, weexBean})).intValue();
        }
        if (weexBean == null) {
            c0().l().d("AbsWeexViewHolder", "obtainFixHeightFromTemplate:weex bean is null");
            return 0;
        }
        TemplateBean q = this.l.q(weexBean);
        if (q == null) {
            c0().l().d("AbsWeexViewHolder", "obtainFixHeightFromTemplate:template is null");
            return 0;
        } else if (j0() == ListStyle.LIST) {
            return q.listHeight;
        } else {
            return q.midHeight;
        }
    }

    public int[] S0(WeexBean weexBean) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("191d41d4", new Object[]{this, weexBean});
        }
        if (weexBean == null || (jSONArray = weexBean.status.getJSONArray("supportedStyle")) == null || jSONArray.size() <= 0) {
            return null;
        }
        int size = jSONArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = jSONArray.getIntValue(i);
        }
        return iArr;
    }

    public void T0(BEAN bean) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485e4db9", new Object[]{this, bean});
            return;
        }
        this.p = false;
        this.q = i0();
        a1();
        ListStyle J0 = J0(R0(bean));
        Map<String, Object> Q0 = Q0(bean, i0(), M0(J0), J0);
        if (c0().g().isDebug()) {
            c0().t().b(Q0);
        }
        if (!this.l.G()) {
            c4p l = c0().l();
            l.b("AbsWeexViewHolder", "render weex cell：" + this);
            z = this.l.D(R0(bean), Q0);
        } else {
            c4p l2 = c0().l();
            l2.b("AbsWeexViewHolder", "refresh weex cell：：" + this);
            z = this.l.C(R0(bean), Q0);
        }
        if (!z) {
            this.p = true;
            U0();
        }
    }

    public void L0(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991f7a73", new Object[]{this, weexBean});
            return;
        }
        int cachedHeight = weexBean != null ? weexBean.getCachedHeight(j0()) : -1;
        int P0 = P0(weexBean);
        if (cachedHeight > 0) {
            c0().l().c("AbsWeexViewHolder", "using cached height: %d, tyep: %s", Integer.valueOf(cachedHeight), weexBean);
            ViewGroup viewGroup = this.n;
            if (viewGroup != null) {
                viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, cachedHeight));
                return;
            }
            return;
        }
        if (P0 > 0) {
            c0().l().c("AbsWeexViewHolder", "using fixed height: %d, type: %s", Integer.valueOf(P0), weexBean);
        } else {
            if (j0() == ListStyle.LIST) {
                P0 = I0(weexBean);
            } else {
                P0 = K0(weexBean);
            }
            c0().l().c("AbsWeexViewHolder", "using sub size: %d, type: %s", Integer.valueOf(P0), weexBean);
        }
        ViewGroup viewGroup2 = this.n;
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(new FrameLayout.LayoutParams(-1, P0));
        }
    }
}
