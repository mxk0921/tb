package com.taobao.search.sf.widgets.onesearch;

import android.app.Activity;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.search.mmd.datasource.bean.OneSearchBean;
import com.taobao.search.mmd.datasource.bean.SFOnesearchBean;
import com.taobao.search.mmd.datasource.bean.SFPromotionBean;
import com.taobao.search.refactor.MSController;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.onesearch.SFMusOnesearchWidget;
import com.taobao.search.sf.widgets.onesearch.b;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.a4p;
import tb.abk;
import tb.auc;
import tb.b4p;
import tb.b64;
import tb.d3d;
import tb.d6p;
import tb.dxk;
import tb.e1x;
import tb.exk;
import tb.fmo;
import tb.fxk;
import tb.g0p;
import tb.g6p;
import tb.gmo;
import tb.gxk;
import tb.h1p;
import tb.hml;
import tb.hxk;
import tb.ipw;
import tb.jrh;
import tb.k7m;
import tb.kgw;
import tb.kr1;
import tb.m8x;
import tb.mec;
import tb.neq;
import tb.nsw;
import tb.o1p;
import tb.phw;
import tb.pv8;
import tb.pwo;
import tb.qrl;
import tb.sen;
import tb.slo;
import tb.smd;
import tb.t2o;
import tb.ude;
import tb.vfw;
import tb.ye0;
import tb.ynd;
import tb.z64;
import tb.zuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a extends phw<SFOnesearchBean, FrameLayout, b64> implements smd, auc, pwo, ipw, ynd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ScreenType B;
    public OneSearchBean C;
    public Runnable D;

    /* renamed from: a  reason: collision with root package name */
    public SFOnesearchBean f11723a;
    public fmo b;
    public com.taobao.search.sf.widgets.onesearch.b c;
    public SFMusOnesearchWidget d;
    public d3d e;
    public View f;
    public View g;
    public View h;
    public View i;
    public d6p j;
    public final boolean l;
    public int m;
    public int p;
    public String q;
    public boolean n = false;
    public int o = 0;
    public boolean t = false;
    public int u = 0;
    public boolean v = false;
    public String w = "";
    public boolean x = true;
    public Integer y = null;
    public Integer z = null;
    public Integer A = null;
    public boolean E = false;
    public float F = 1.0f;
    public boolean r = false;
    public boolean s = false;
    public boolean k = false;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.search.sf.widgets.onesearch.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class View$OnLayoutChangeListenerC0659a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.search.sf.widgets.onesearch.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0660a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0660a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                aVar.y2(a.s2(aVar));
            }
        }

        public View$OnLayoutChangeListenerC0659a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            int i9 = i3 - i;
            int i10 = i7 - i5;
            a.q2(a.this, i9);
            if (i9 != 0 && i10 != 0 && i9 != i10) {
                ((FrameLayout) a.this.getView()).post(new RunnableC0660a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11726a;

        public b(String str) {
            this.f11726a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.t2(a.this).u2(this.f11726a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (a.u2(a.this) != null) {
                a.u2(a.this).run();
                a.v2(a.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b.C0662b f11728a;

        public d(b.C0662b bVar) {
            this.f11728a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.w2(a.this).bindWithData(this.f11728a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a aVar = a.this;
            aVar.y2(a.s2(aVar));
        }
    }

    static {
        t2o.a(815793703);
        t2o.a(993001662);
        t2o.a(993001866);
        t2o.a(993001961);
        t2o.a(815792550);
        t2o.a(815792860);
    }

    public a(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, b64Var, viewGroup, vfwVar);
        subscribeEvent(this);
        if ((getActivity() instanceof mec) && ((mec) getActivity()).o2()) {
            this.l = true;
        }
        ScreenType g = ScreenType.g(activity);
        this.B = g;
        if (g != null) {
            g.i(this);
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode == 299066517) {
            super.onCtxPause();
            return null;
        } else if (hashCode == 593843865) {
            super.onCtxDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/widgets/onesearch/SFOnesearchWidget");
        }
    }

    public static /* synthetic */ int q2(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480e5a23", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.p = i;
        return i;
    }

    public static /* synthetic */ OneSearchBean s2(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OneSearchBean) ipChange.ipc$dispatch("ef56af59", new Object[]{aVar});
        }
        return aVar.C;
    }

    public static /* synthetic */ fmo t2(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fmo) ipChange.ipc$dispatch("b5f195f", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ Runnable u2(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("88f34260", new Object[]{aVar});
        }
        return aVar.D;
    }

    public static /* synthetic */ Runnable v2(a aVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("77998660", new Object[]{aVar, runnable});
        }
        aVar.D = runnable;
        return runnable;
    }

    public static /* synthetic */ com.taobao.search.sf.widgets.onesearch.b w2(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.sf.widgets.onesearch.b) ipChange.ipc$dispatch("5a6e1a1b", new Object[]{aVar});
        }
        return aVar.c;
    }

    public final int A2(float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a063874", new Object[]{this, new Float(f2), new Float(f3)})).intValue();
        }
        ScreenType screenType = this.B;
        if (screenType != null) {
            int c2 = screenType.c();
            if (c2 == 1) {
                f3 = 188.0f;
            } else if (c2 == 2) {
                f3 = 107.0f;
            } else if (c2 == 3) {
                f3 = 191.0f;
            }
            f2 = 375.0f;
        }
        return (int) ((f3 * L2()) / f2);
    }

    public final boolean B2(OneSearchBean oneSearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fb2736f", new Object[]{this, oneSearchBean})).booleanValue();
        }
        if (oneSearchBean == null || !oneSearchBean.isRedirect) {
            return false;
        }
        this.C = oneSearchBean;
        this.o = zuo.b(getActivity(), 0);
        this.mActivity.finish();
        Nav.from(this.mActivity).toUri(oneSearchBean.url);
        return true;
    }

    @Override // tb.ynd
    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc762f42", new Object[]{this});
        } else {
            this.e.C();
        }
    }

    public final void C2(SFOnesearchBean sFOnesearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2a7cd5", new Object[]{this, sFOnesearchBean});
        } else if (sFOnesearchBean != null && sFOnesearchBean.hideNavibar) {
            postEvent(g0p.a());
        }
    }

    public final void D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da37415", new Object[]{this});
        } else if (this.d == null) {
            this.d = new SFMusOnesearchWidget(getActivity(), this, getModel(), (ViewGroup) getView(), new ye0((ViewGroup) getView()));
        }
    }

    public final void E2(d6p d6pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902058c8", new Object[]{this, d6pVar});
        } else if (getView() != 0 && this.b == null) {
            fmo fmoVar = new fmo(getActivity(), this, getModel(), (ViewGroup) getView(), new ye0((ViewGroup) getView(), 1), this);
            this.b = fmoVar;
            fmoVar.v2();
            this.b.y2(d6pVar);
            this.b.attachToContainer();
        }
    }

    public final void F2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d4d50da", new Object[]{this});
        } else if (getView() != 0) {
            if (this.c == null) {
                this.c = new com.taobao.search.sf.widgets.onesearch.b(getActivity(), this, getModel(), (ViewGroup) getView(), new ye0((ViewGroup) getView(), 1));
            }
            this.s = true;
        }
    }

    public neq H2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (neq) ipChange.ipc$dispatch("9acce792", new Object[]{this});
        }
        return (neq) getModel().c();
    }

    public final z64 I2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z64) ipChange.ipc$dispatch("42b711ce", new Object[]{this});
        }
        return (z64) getModel().d().h("controller");
    }

    public OneSearchBean J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OneSearchBean) ipChange.ipc$dispatch("bd6fe939", new Object[]{this});
        }
        return this.C;
    }

    @Override // tb.auc
    public void K0(boolean z, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224521ba", new Object[]{this, new Boolean(z), new Float(f2)});
            return;
        }
        d3d d3dVar = this.e;
        if (d3dVar != null) {
            float f3 = this.F;
            if (f3 < 0.5f && f2 >= 0.5f) {
                d3dVar.D();
            } else if (f3 >= 0.5f && f2 < 0.5f) {
                d3dVar.E();
            }
        }
        this.F = f2;
        if (z) {
            ((FrameLayout) getView()).setAlpha(f2);
            postEvent(hml.a((int) ((1.0f - f2) * g2())));
        }
    }

    public final float K2(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74888410", new Object[]{this, new Float(f2)})).floatValue();
        }
        String str = this.C.url;
        String e2 = g6p.e(str, slo.KEY_X_IMMERSE_STYLE);
        this.n = false;
        this.v = false;
        if (slo.VALUE_YES.equals(e2)) {
            this.n = true;
            String e3 = g6p.e(str, slo.KEY_X_NAVI_STYLE);
            if (!TextUtils.isEmpty(e3)) {
                this.v = true;
                this.w = e3;
            }
        }
        if (f2 > 0.0f) {
            return f2;
        }
        return 0.0f;
    }

    public final int L2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[]{this})).intValue();
        }
        int i = this.p;
        if (i > 0) {
            return i;
        }
        return zuo.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
        if (r11.n != false) goto L_0x010c;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int M2(com.taobao.search.mmd.datasource.bean.OneSearchBean r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.widgets.onesearch.a.M2(com.taobao.search.mmd.datasource.bean.OneSearchBean, boolean, boolean):int");
    }

    public final void N2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f8988d4", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
            if (O2()) {
                this.i.setVisibility(0);
                this.h.setBackgroundResource(R.drawable.tbsearch_layered_srp_onesearch_mask_non_gradient);
                return;
            }
            this.i.setVisibility(8);
            this.h.setBackgroundResource(R.drawable.tbsearch_layered_srp_onesearch_mask_no_tab);
        }
    }

    public final boolean O2() {
        List<TabBean> tabs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("763e85c3", new Object[]{this})).booleanValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getModel().b().getTotalSearchResult();
        if (commonSearchResult == null || (tabs = commonSearchResult.getTabs()) == null || tabs.size() <= 1) {
            return false;
        }
        return true;
    }

    public final void P2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5b71c8", new Object[]{this});
        } else if (!this.r) {
            this.j = new d6p();
            this.j.g(new gmo(getActivity(), this));
            this.r = true;
        }
    }

    public final boolean Q2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f60126e2", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str.startsWith("http://s.m.taobao.com/page") || str.startsWith("https://s.m.taobao.com/page")) {
            return false;
        }
        return true;
    }

    /* renamed from: R2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_onesearch, getContainer(), false);
        if (ScreenType.IS_PAD || ScreenType.IS_FOLDABLE) {
            frameLayout.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0659a());
        }
        return frameLayout;
    }

    public void S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beeb0c92", new Object[]{this});
            return;
        }
        this.t = true;
        y2(this.C);
    }

    public void T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1494a6b", new Object[]{this});
            return;
        }
        fmo fmoVar = this.b;
        if (fmoVar != null) {
            fmoVar.s2();
        }
        if (getView() != 0) {
            ((FrameLayout) getView()).setVisibility(8);
        }
    }

    public void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ab32521", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
        fmo fmoVar = this.b;
        if (fmoVar != null) {
            fmoVar.s2();
        }
    }

    public void V2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f191cf48", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // tb.smd
    public Integer W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4246d547", new Object[]{this});
        }
        return this.A;
    }

    public void W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8245a7b", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e137f506", new Object[]{this});
            return;
        }
        z64 I2 = I2();
        if (I2 instanceof MSController) {
            ((MSController) I2).N0(getModel().e(), this);
        }
    }

    public final void Y2(OneSearchBean oneSearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d22e39", new Object[]{this, oneSearchBean});
            return;
        }
        D2();
        this.d.bindWithData(new SFMusOnesearchWidget.b(oneSearchBean.url, M2(oneSearchBean, true, oneSearchBean.isSearchBarHidden), oneSearchBean.isNewSearch));
        ((FrameLayout) getView()).setVisibility(0);
    }

    @Override // tb.auc
    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a95530d", new Object[]{this});
            return;
        }
        d3d d3dVar = this.e;
        if (d3dVar != null) {
            d3dVar.a();
        }
    }

    @Override // tb.ipw
    public void a1(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("441bf342", new Object[]{this, str, str2, wVCallBackContext});
        } else if ("getData".equals(str)) {
            nsw nswVar = new nsw();
            nswVar.a("data", this.f11723a.model);
            wVCallBackContext.success(nswVar);
        } else {
            wVCallBackContext.error("action " + str + " 暂不支持");
        }
    }

    public final void a3(OneSearchBean oneSearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a51ef13", new Object[]{this, oneSearchBean});
        } else if (getView() != 0) {
            F2();
            this.f.setVisibility(8);
            int M2 = M2(oneSearchBean, Q2(oneSearchBean.url), oneSearchBean.isSearchBarHidden);
            b.C0662b a2 = b.C0662b.a(oneSearchBean);
            a2.b = 1;
            a2.f11734a = M2;
            ((FrameLayout) getView()).post(new d(a2));
            ((FrameLayout) getView()).setVisibility(0);
            this.e = new m8x(this.c);
        }
    }

    @Override // tb.auc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
        }
    }

    public final void b3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90154dd", new Object[]{this, new Integer(i)});
            return;
        }
        d3d d3dVar = this.e;
        if (d3dVar != null) {
            int i2 = this.o;
            if (i >= i2 && this.x) {
                this.x = false;
                d3dVar.F();
            } else if (i < i2 && !this.x) {
                this.x = true;
                d3dVar.a();
            }
        }
    }

    public final void c3(SFOnesearchBean sFOnesearchBean) {
        OneSearchContainer oneSearchContainer;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b30c8f3", new Object[]{this, sFOnesearchBean});
            return;
        }
        if (getView() instanceof OneSearchContainer) {
            oneSearchContainer = (OneSearchContainer) getView();
        } else {
            oneSearchContainer = null;
        }
        if (oneSearchContainer != null) {
            oneSearchContainer.setInterceptTouch(false);
        }
        if (sFOnesearchBean != null) {
            if (!sFOnesearchBean.isFull && !sFOnesearchBean.disableHeaderScroll) {
                z = false;
            }
            if (oneSearchContainer != null && (getModel().e() instanceof jrh)) {
                oneSearchContainer.setInterceptTouch(z);
            }
        }
    }

    public final void d3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3290be", new Object[]{this, new Integer(i)});
            return;
        }
        this.b.z2(i);
        View view = this.f;
        if (view != null) {
            view.getLayoutParams().height = i;
        }
    }

    public boolean e3() {
        OneSearchBean oneSearchBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1acc8544", new Object[]{this})).booleanValue();
        }
        neq H2 = H2();
        if (H2 == null || (oneSearchBean = this.C) == null || oneSearchBean.isFull || !H2.l1()) {
            return false;
        }
        return true;
    }

    @Override // tb.auc
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        OneSearchBean oneSearchBean = this.C;
        if ((oneSearchBean == null || (!oneSearchBean.isNewSearch && !oneSearchBean.isFull)) && h2()) {
            return DensityUtil.dip2px(Globals.getApplication(), 10.0f);
        }
        return 0;
    }

    @Override // tb.smd
    public Integer f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("2027a5aa", new Object[]{this});
        }
        return this.z;
    }

    public final void f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9195865f", new Object[]{this});
            return;
        }
        z64 I2 = I2();
        if (I2 instanceof MSController) {
            ((MSController) I2).b1(getModel().e(), this);
        }
    }

    @Override // tb.phw, tb.khq
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        if (getView() != 0) {
            this.f = ((FrameLayout) getView()).findViewById(R.id.progressLayout);
            this.g = ((FrameLayout) getView()).findViewById(R.id.ll_onesearch_mask);
            this.h = ((FrameLayout) getView()).findViewById(R.id.v_non_gradient_mask);
            this.i = ((FrameLayout) getView()).findViewById(R.id.v_gradient_mask_bottom);
        }
        View view = this.h;
        if (view != null) {
            view.getLayoutParams().height = o1p.b(48) + SystemBarDecorator.getStatusBarHeight(getActivity());
        }
    }

    @Override // tb.smd
    public int g2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e18dc9c", new Object[]{this})).intValue();
        }
        if (this.C == null) {
            return 0;
        }
        return this.o;
    }

    @Override // tb.auc
    public kr1 getBehavior() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kr1) ipChange.ipc$dispatch("9c30dbef", new Object[]{this});
        }
        return null;
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SFOnesearchWidget";
    }

    @Override // tb.auc
    public void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726a97c8", new Object[]{this});
            return;
        }
        d3d d3dVar = this.e;
        if (d3dVar != null) {
            d3dVar.F();
        }
    }

    @Override // tb.smd
    public boolean h2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36698c09", new Object[]{this})).booleanValue();
        }
        OneSearchBean oneSearchBean = this.C;
        if (oneSearchBean != null && oneSearchBean.isNewSearch) {
            return false;
        }
        if (this.n || (oneSearchBean != null && !TextUtils.isEmpty(oneSearchBean.backgroundColor))) {
            return true;
        }
        return false;
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else if (this.r || this.s) {
            if (getView() != 0) {
                ((FrameLayout) getView()).setVisibility(8);
            }
            postEvent(new dxk());
        }
    }

    @Override // tb.smd
    public Integer i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("209ec8de", new Object[]{this});
        }
        return this.y;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        f3();
        kgw.c(getView());
        this.D = null;
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        onComponentDestroy();
        this.D = null;
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        if (this.e != null && this.k && getModel().g()) {
            this.e.F();
        }
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        if (this.e != null && this.k && getModel().g()) {
            this.e.a();
        }
    }

    public void onEventMainThread(hxk hxkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aa30a0d", new Object[]{this, hxkVar});
        } else {
            S2();
        }
    }

    @Override // tb.auc
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if ((this.r || this.s) && this.k && getView() != 0) {
            ((FrameLayout) getView()).setVisibility(0);
        }
    }

    @Override // tb.pwo
    public void w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f1aecd", new Object[]{this, new Integer(i)});
        } else {
            ((FrameLayout) getView()).post(new e());
        }
    }

    @Override // tb.smd
    public boolean x1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5083ab1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final String x2(String str) {
        String str2 = "?";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c891105f", new Object[]{this, str});
        }
        try {
            if (str.startsWith(pv8.h5_online) || str.startsWith("https://h5.m.taobao.com")) {
                TBLocationDTO c2 = a4p.c();
                if (c2 == null) {
                    b4p.a("SFOnesearchWidget", "获取地理位置失败");
                    return str;
                }
                String cityName = c2.getCityName();
                if (TextUtils.isEmpty(cityName)) {
                    b4p.a("SFOnesearchWidget", "获取城市失败");
                    return str;
                }
                if (str.contains(str2)) {
                    str2 = "&";
                }
                String str3 = str + str2 + "onesearchCity=" + cityName;
                b4p.a("SFOnesearchWidget", "添加城市：" + str3);
                return str3;
            }
            b4p.a("SFOnesearchWidget", "无需城市信息");
            return str;
        } catch (Exception unused) {
            b4p.b("SFOnesearchWidget", "添加城市名称失败");
            return str;
        }
    }

    /* renamed from: z2 */
    public void bindWithData(SFOnesearchBean sFOnesearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f61ff6", new Object[]{this, sFOnesearchBean});
            return;
        }
        if (!TextUtils.isEmpty(sFOnesearchBean.utLogMap) && !TextUtils.isEmpty(sFOnesearchBean.expArg1)) {
            HashMap hashMap = new HashMap();
            hashMap.put("utLogMap", g6p.d(sFOnesearchBean.utLogMap));
            hashMap.put("spm", "a2141.7631557.0.0");
            sen.l(sFOnesearchBean.expArg1, hashMap);
        }
        OneSearchBean convertFromSFOnesearchBean = OneSearchBean.convertFromSFOnesearchBean(sFOnesearchBean);
        if (!B2(convertFromSFOnesearchBean)) {
            this.f11723a = sFOnesearchBean;
            try {
                c3(sFOnesearchBean);
            } catch (Throwable unused) {
                b4p.b("SFOnesearchWidget", "setup onesearch container error");
            }
            y2(convertFromSFOnesearchBean);
            C2(sFOnesearchBean);
            X2();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f11730a;

        static {
            t2o.a(815793710);
        }

        private f() {
            this.f11730a = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            }
        }

        public /* synthetic */ f(a aVar, View$OnLayoutChangeListenerC0659a aVar2) {
            this();
        }
    }

    public void onEventMainThread(hml hmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aeb8ea", new Object[]{this, hmlVar});
        } else if (getModel().g()) {
            b3(Math.abs(hmlVar.f20749a));
            if (!getModel().e().isMetaMode()) {
                ((FrameLayout) getView()).setTranslationY(hmlVar.f20749a);
            }
        }
    }

    public final int G2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbf84cb3", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str) || str.contains(h1p.URL_PAY_INIT)) {
            return -1;
        }
        if (str.contains(h1p.URL_TRIPH_INIT)) {
            return 0;
        }
        if (str.contains(h1p.URL_STARSHOP_INIT)) {
            return 2;
        }
        return (!str.contains(h1p.URL_SIMBA) || !str.contains("f=app")) ? 9 : 2;
    }

    public final void Z2(OneSearchBean oneSearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1dfead8", new Object[]{this, oneSearchBean});
        } else if (getView() != 0) {
            P2();
            if (TextUtils.equals(this.q, oneSearchBean.url)) {
                b4p.a("SFOnesearchWidget", "url一致，不展示");
                show();
                return;
            }
            String str = oneSearchBean.url;
            boolean Q2 = Q2(str);
            int G2 = G2(str);
            this.j.c = G2;
            if (!TextUtils.isEmpty(str)) {
                this.q = str;
            }
            if (G2 != -1) {
                String b2 = g6p.b(x2(str), "_s_nx_from", oneSearchBean.from);
                int M2 = M2(oneSearchBean, Q2, oneSearchBean.isSearchBarHidden);
                ((FrameLayout) getView()).setVisibility(0);
                E2(this.j);
                if (!oneSearchBean.isFull && this.b.getView() != 0) {
                    ((FrameLayout) this.b.getView()).setBackgroundColor(0);
                }
                if (getModel() == null || getModel().e() == null || !getModel().e().isMetaMode()) {
                    this.b.u2(b2);
                } else {
                    this.D = new b(b2);
                    if (!this.E) {
                        this.E = true;
                        ((FrameLayout) getView()).addOnLayoutChangeListener(new c());
                    }
                }
                this.e = new e1x(this.b);
                d3(M2);
                return;
            }
            ((FrameLayout) getView()).setVisibility(8);
            fmo fmoVar = this.b;
            if (fmoVar != null) {
                fmoVar.q2();
                this.b.s2();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View] */
    public void y2(OneSearchBean oneSearchBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6cedc3", new Object[]{this, oneSearchBean});
            return;
        }
        try {
            if (oneSearchBean == null) {
                hide();
                this.k = false;
                this.C = null;
                ViewCompat.setBackground(getView(), null);
                return;
            }
            if (slo.VALUE_YES.equals(g6p.e(oneSearchBean.url, slo.KEY_X_IMMERSE_STYLE))) {
                String b2 = g6p.b(oneSearchBean.url, "offsetbottom", String.valueOf(Math.ceil(o1p.c(12))));
                oneSearchBean.url = b2;
                oneSearchBean.url = g6p.b(b2, "bottomPx", "12");
            }
            ScreenType screenType = this.B;
            if (screenType != null) {
                oneSearchBean.url = g6p.b(oneSearchBean.url, k7m.KEY_SCREEN_STYLE, ScreenType.h(screenType.c()));
            }
            this.C = oneSearchBean;
            this.k = true;
            if (e3()) {
                findView(R.id.v_non_gradient_mask).setVisibility(8);
            } else {
                findView(R.id.v_non_gradient_mask).setVisibility(0);
            }
            this.y = qrl.c(g6p.e(oneSearchBean.url, "_xsearchTabTextNormalColor"), null);
            this.z = qrl.c(g6p.e(oneSearchBean.url, "_xsearchTabTextSelectedColor"), null);
            this.A = Integer.valueOf(SFPromotionBean.b(g6p.e(oneSearchBean.url, "_xsearchStatusBarStyle")));
            if (!TextUtils.isEmpty(this.C.backgroundColor)) {
                ((FrameLayout) getView()).setBackgroundColor(qrl.b(this.C.backgroundColor, -1));
            } else {
                ViewCompat.setBackground(getView(), null);
            }
            this.m = abk.a(oneSearchBean.url);
            if (this.t) {
                this.m = 0;
                b4p.m("NxStrategyUtil", "NX force downgrade");
            }
            int i = this.m;
            if (i == 0) {
                Z2(oneSearchBean);
            } else if (i == 3) {
                a3(oneSearchBean);
            } else if (i == 6) {
                Y2(oneSearchBean);
            }
            if (this.n) {
                postEvent(new fxk(this.u));
                if (this.g != null) {
                    N2(TextUtils.equals(g6p.e(oneSearchBean.url, "_xsearchHideMaskView"), slo.VALUE_YES));
                }
            } else {
                postEvent(new gxk(this.u));
                View view = this.g;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            if (this.v) {
                postEvent(new exk(this.w));
            }
        } catch (Exception e2) {
            b4p.l("SFOnesearchWidget", "error bind data", e2);
            this.e = null;
        }
    }
}
