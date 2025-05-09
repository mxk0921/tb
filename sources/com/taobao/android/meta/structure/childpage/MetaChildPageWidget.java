package com.taobao.android.meta.structure.childpage;

import android.app.Activity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.structure.childpage.MetaChildPageWidget;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.meta.structure.state.page.MetaPageStateWidget;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tb.acx;
import tb.asi;
import tb.auc;
import tb.ay4;
import tb.bsi;
import tb.buc;
import tb.ckf;
import tb.d1a;
import tb.esi;
import tb.euc;
import tb.frk;
import tb.g1a;
import tb.gsi;
import tb.gu1;
import tb.isi;
import tb.k4k;
import tb.kae;
import tb.m8j;
import tb.njg;
import tb.o02;
import tb.og3;
import tb.p1p;
import tb.pwc;
import tb.qg3;
import tb.qtc;
import tb.rtc;
import tb.stc;
import tb.t2o;
import tb.tce;
import tb.tsi;
import tb.ude;
import tb.usi;
import tb.vfw;
import tb.x02;
import tb.ytc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MetaChildPageWidget extends usi<FrameLayout, stc, rtc, acx<? extends a<asi, MetaResult<asi>>>, bsi> implements qg3, qtc, buc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MetaListWidget h;
    public pwc i;
    public ViewPager j;
    public MetaPageStateWidget l;
    public final HashMap<String, List<ytc>> c = new HashMap<>();
    public final SparseArray<esi> d = new SparseArray<>();
    public final HashSet<BaseTypedBean> e = new HashSet<>();
    public final HashSet<BaseTypedBean> f = new HashSet<>();
    public final ArrayList<kae<?, ?>> g = new ArrayList<>();
    public final njg k = kotlin.a.b(new d1a() { // from class: tb.wdz
        @Override // tb.d1a
        public final Object invoke() {
            gsi q;
            q = MetaChildPageWidget.q(MetaChildPageWidget.this);
            return q;
        }
    });

    static {
        t2o.a(993001522);
        t2o.a(993001519);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaChildPageWidget(Activity activity, ude udeVar, acx<? extends a<asi, MetaResult<asi>>> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, acxVar, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
    }

    public static /* synthetic */ Object ipc$super(MetaChildPageWidget metaChildPageWidget, String str, Object... objArr) {
        if (str.hashCode() == -211767613) {
            super.onComponentDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/structure/childpage/MetaChildPageWidget");
    }

    public static final ay4 k(MetaChildPageWidget metaChildPageWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("b0d2fe30", new Object[]{metaChildPageWidget, str});
        }
        ckf.g(metaChildPageWidget, "this$0");
        ckf.g(str, AdvanceSetting.NETWORK_TYPE);
        return metaChildPageWidget.R2("");
    }

    public static final ay4 l(MetaChildPageWidget metaChildPageWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("7b8aa0f1", new Object[]{metaChildPageWidget, str});
        }
        ckf.g(metaChildPageWidget, "this$0");
        ckf.g(str, AdvanceSetting.NETWORK_TYPE);
        return metaChildPageWidget.T2("");
    }

    public static final void m(MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("973e5155", new Object[]{metaChildPageWidget});
            return;
        }
        ckf.g(metaChildPageWidget, "this$0");
        ((euc) metaChildPageWidget.P2().t2()).x();
        metaChildPageWidget.X2();
    }

    public static final ay4 n(MetaChildPageWidget metaChildPageWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("ab77a8b1", new Object[]{metaChildPageWidget, str});
        }
        ckf.g(metaChildPageWidget, "this$0");
        ckf.g(str, AdvanceSetting.NETWORK_TYPE);
        return metaChildPageWidget.R2(str);
    }

    public static final ay4 o(MetaChildPageWidget metaChildPageWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("762f4b72", new Object[]{metaChildPageWidget, str});
        }
        ckf.g(metaChildPageWidget, "this$0");
        ckf.g(str, AdvanceSetting.NETWORK_TYPE);
        return metaChildPageWidget.T2(str);
    }

    public static final void p(MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388d2b5a", new Object[]{metaChildPageWidget});
            return;
        }
        ckf.g(metaChildPageWidget, "this$0");
        ((euc) metaChildPageWidget.P2().t2()).N();
        metaChildPageWidget.X2();
    }

    public static final gsi q(MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsi) ipChange.ipc$dispatch("d031c4d2", new Object[]{metaChildPageWidget});
        }
        ckf.g(metaChildPageWidget, "this$0");
        return new gsi(metaChildPageWidget.w2().q(), metaChildPageWidget);
    }

    public static final void r(MetaChildPageWidget metaChildPageWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe51229", new Object[]{metaChildPageWidget});
            return;
        }
        ckf.g(metaChildPageWidget, "this$0");
        metaChildPageWidget.P2().U2();
    }

    public void A2(kae<BaseTypedBean, ?> kaeVar, esi esiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0dbaa2", new Object[]{this, kaeVar, esiVar, str});
            return;
        }
        ckf.g(kaeVar, "widget");
        ckf.g(esiVar, "header");
        ckf.g(str, "type");
        if (TextUtils.equals(str, "list")) {
            P2().K2(kaeVar);
        } else {
            ((stc) t2()).h(esiVar);
        }
    }

    public void B2(isi isiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d19689f", new Object[]{this, isiVar, new Boolean(z)});
            return;
        }
        ckf.g(isiVar, "mod");
        kae<BaseTypedBean, ?> L2 = L2(isiVar);
        if (L2 != null) {
            if (L2 instanceof m8j) {
                ((m8j) L2).a(w2().p());
            }
            boolean z2 = L2 instanceof auc;
            if (z2) {
                ((auc) L2).b(((stc) t2()).j().getListStart());
            }
            L2.attachToContainer();
            if (!z || !this.f.contains(isiVar.a())) {
                L2.bindWithData(isiVar.a());
            }
            this.e.add(isiVar.a());
            esi esiVar = new esi(L2, w2().o());
            if (z2) {
                auc aucVar = (auc) L2;
                esiVar.r(aucVar.p());
                esiVar.s(aucVar.f());
            }
            esiVar.t(isiVar.b());
            A2(L2, esiVar, isiVar.b());
            g3(isiVar.b(), esiVar);
            this.d.put(L2.hashCode(), esiVar);
        }
    }

    public void C2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e369ca", new Object[]{this, new Boolean(z)});
        }
    }

    public boolean D2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb11f42", new Object[]{this, new Integer(i)})).booleanValue();
        }
        RecyclerView A2 = P2().A2();
        if (A2 != null) {
            return A2.canScrollVertically(i);
        }
        return false;
    }

    public void E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3189632", new Object[]{this});
            return;
        }
        Iterator<kae<?, ?>> it = this.g.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            kae<?, ?> next = it.next();
            ckf.f(next, "next(...)");
            next.destroyAndRemoveFromParent();
        }
        this.g.clear();
        P2().L2();
    }

    public final void F2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7ecffb", new Object[]{this});
            return;
        }
        pwc pwcVar = this.i;
        if (pwcVar != null) {
            pwcVar.destroyAndRemoveFromParent();
        }
        this.i = null;
        ViewGroup P1 = ((stc) t2()).P1();
        P1.removeAllViews();
        P1.getLayoutParams().width = 0;
        P1.setVisibility(8);
    }

    public final void G2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("948abf2a", new Object[]{this});
            return;
        }
        this.f.clear();
        this.f.addAll(this.e);
        this.e.clear();
    }

    /* renamed from: H2 */
    public rtc q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rtc) ipChange.ipc$dispatch("3b25d29f", new Object[]{this});
        }
        Object a2 = w2().e().a(w2());
        ckf.f(a2, "create(...)");
        return (rtc) a2;
    }

    /* renamed from: I2 */
    public stc s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (stc) ipChange.ipc$dispatch("3aaea693", new Object[]{this});
        }
        Object a2 = w2().f().a(w2());
        ckf.f(a2, "create(...)");
        return (stc) a2;
    }

    public void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("237e0025", new Object[]{this});
            return;
        }
        l3(w2().I().a(v2()));
        P2().attachToContainer();
        ((stc) t2()).o().addView(((euc) P2().t2()).getView(), -1, -1);
        ((stc) t2()).j().setCurrentList(P2());
        ((stc) t2()).j().commit();
    }

    public final MetaPageStateWidget K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaPageStateWidget) ipChange.ipc$dispatch("14b7ad33", new Object[]{this});
        }
        x02 v2 = v2();
        ckf.f(v2, "getCreatorParam(...)");
        v2.d = ((stc) t2()).getView();
        v2.e = new k4k();
        Activity activity = v2.f31046a;
        ckf.f(activity, "activity");
        ude udeVar = v2.b;
        ckf.f(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        acx<? extends o02<? extends BaseSearchResult, ?>> acxVar = v2.c;
        ckf.e(acxVar, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<out com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>>");
        MetaPageStateWidget metaPageStateWidget = new MetaPageStateWidget(activity, udeVar, acxVar, v2.d, v2.e);
        metaPageStateWidget.attachToContainer();
        metaPageStateWidget.A2(((stc) t2()).j().getListStart());
        return metaPageStateWidget;
    }

    public final kae<BaseTypedBean, ?> L2(isi isiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kae) ipChange.ipc$dispatch("fa2c72a3", new Object[]{this, isiVar});
        }
        gsi M2 = M2();
        o02 e = ((acx) getModel()).e();
        ckf.f(e, "getScopeDatasource(...)");
        return M2.g(isiVar, (a) e, new g1a() { // from class: tb.zdz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                ay4 n;
                n = MetaChildPageWidget.n(MetaChildPageWidget.this, (String) obj);
                return n;
            }
        }, new g1a() { // from class: tb.aez
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                ay4 o;
                o = MetaChildPageWidget.o(MetaChildPageWidget.this, (String) obj);
                return o;
            }
        });
    }

    public final gsi M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsi) ipChange.ipc$dispatch("685eb0ad", new Object[]{this});
        }
        return (gsi) this.k.getValue();
    }

    public final SparseArray<esi> N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("44094582", new Object[]{this});
        }
        return this.d;
    }

    public final HashMap<String, List<ytc>> O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9174f0b", new Object[]{this});
        }
        return this.c;
    }

    public final MetaListWidget P2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaListWidget) ipChange.ipc$dispatch("ef34550b", new Object[]{this});
        }
        MetaListWidget metaListWidget = this.h;
        if (metaListWidget != null) {
            return metaListWidget;
        }
        ckf.y("listWidget");
        throw null;
    }

    public int Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cd45c8c", new Object[]{this})).intValue();
        }
        return P2().A2().getMeasuredWidth();
    }

    @Override // tb.qg3
    public void R0(og3 og3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1168839", new Object[]{this, og3Var});
        } else {
            P2().R0(og3Var);
        }
    }

    public ay4<gu1, ? extends pwc> R2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("f9703134", new Object[]{this, str});
        }
        ckf.g(str, "type");
        return w2().M();
    }

    public final MetaPageStateWidget S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MetaPageStateWidget) ipChange.ipc$dispatch("2fefd78d", new Object[]{this});
        }
        if (w2().e0() == null) {
            return null;
        }
        if (this.l == null) {
            this.l = K2();
        }
        return this.l;
    }

    public ay4<gu1, ? extends tce> T2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("58d7428e", new Object[]{this, str});
        }
        ckf.g(str, "type");
        return w2().o0();
    }

    public void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f5a315", new Object[]{this});
            return;
        }
        RecyclerView A2 = P2().A2();
        if (A2 == null) {
            return;
        }
        if (A2.isAttachedToWindow()) {
            ((euc) P2().t2()).N();
            X2();
            return;
        }
        A2.post(new Runnable() { // from class: tb.vdz
            @Override // java.lang.Runnable
            public final void run() {
                MetaChildPageWidget.p(MetaChildPageWidget.this);
            }
        });
    }

    public final void V2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a58521de", new Object[]{this});
            return;
        }
        z();
        Z2();
        ((stc) t2()).j().setVisibility(8);
    }

    public void W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        MetaPageStateWidget S2 = S2();
        if (S2 != null) {
            S2.G1(MetaState.DEFAULT);
        }
        ((stc) t2()).j().setVisibility(0);
    }

    public final void X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7e6da2", new Object[]{this});
        } else {
            ((euc) P2().t2()).getView().post(new Runnable() { // from class: tb.tdz
                @Override // java.lang.Runnable
                public final void run() {
                    MetaChildPageWidget.r(MetaChildPageWidget.this);
                }
            });
        }
    }

    @Override // tb.buc
    public int Y() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7531f83", new Object[]{this})).intValue();
        }
        ViewPager viewPager = this.j;
        if (viewPager != null) {
            i = tsi.a(viewPager);
        }
        return i + P2().Y();
    }

    public final void Y2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb05950", new Object[]{this, new Boolean(z)});
        } else if (this.d.size() != 0) {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                if (z) {
                    this.d.valueAt(i).m();
                } else {
                    this.d.valueAt(i).n();
                }
            }
        }
    }

    public void Z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab395c38", new Object[]{this});
            return;
        }
        if (((acx) getModel()).g()) {
            Y2(true);
        }
        M2().a();
    }

    public void a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25e3df7", new Object[]{this});
        }
    }

    @Override // tb.qtc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
            return;
        }
        ((stc) t2()).b(i);
        MetaPageStateWidget S2 = S2();
        if (S2 != null) {
            S2.A2(i);
        }
    }

    public void b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
            return;
        }
        P2().appear();
        Y2(true);
    }

    public void c3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
            return;
        }
        P2().disappear();
        Y2(false);
    }

    public void d3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29d8262e", new Object[]{this});
        } else {
            P2().W2(false);
        }
    }

    public void e3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("112d5266", new Object[]{this, new Boolean(z)});
        } else {
            P2().W2(z);
        }
    }

    public void f3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c280b57", new Object[]{this, new Boolean(z)});
            return;
        }
        MetaResult metaResult = (MetaResult) ((a) ((acx) getModel()).e()).getTotalSearchResult();
        if (metaResult != null && metaResult.isSuccess()) {
            P2().W2(false);
            ((rtc) u2()).Y();
            ((rtc) u2()).d0();
            W2();
        }
    }

    public final void g3(String str, ytc ytcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c576c8", new Object[]{this, str, ytcVar});
            return;
        }
        List<ytc> list = this.c.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.c.put(str, list);
        }
        list.add(ytcVar);
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "MetaChildPageWidget";
    }

    @Override // tb.abx, tb.nde
    public String getScopeTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53eba25d", new Object[]{this});
        }
        return "childPageWidget";
    }

    public void i3(kae<?, ?> kaeVar, boolean z, frk frkVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e6ad09", new Object[]{this, kaeVar, new Boolean(z), frkVar, new Integer(i)});
            return;
        }
        ckf.g(kaeVar, "widget");
        esi esiVar = this.d.get(kaeVar.hashCode());
        if (esiVar != null) {
            ((stc) t2()).j().scrollHeaderToTop(esiVar, z, frkVar, i);
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        J2();
        f3(true);
    }

    public void j3(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1adffc", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        P2().X2(i, z, i2, 0);
        if (!z) {
            X2();
        }
    }

    public void k3(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36586745", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        P2().Y2(z, i, 0);
        if (!z) {
            X2();
        }
    }

    public final void l3(MetaListWidget metaListWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280e8071", new Object[]{this, metaListWidget});
            return;
        }
        ckf.g(metaListWidget, "<set-?>");
        this.h = metaListWidget;
    }

    public void m3(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00cd6a5", new Object[]{this, viewPager});
            return;
        }
        ckf.g(viewPager, "view");
        this.j = viewPager;
    }

    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed586412", new Object[]{this});
            return;
        }
        MetaPageStateWidget S2 = S2();
        if (S2 != null) {
            S2.G1(MetaState.UPDATE_ERROR);
        }
        V2();
    }

    @Override // tb.sxh, tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        if (w2().Y()) {
            ((a) ((acx) getModel()).e()).destroy();
        }
    }

    @Override // tb.buc
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return P2().onInterceptTouchEvent(motionEvent);
    }

    @Override // tb.buc
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return P2().onTouchEvent(motionEvent);
    }

    public void p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        MetaPageStateWidget S2 = S2();
        if (S2 != null) {
            S2.G1(MetaState.UPDATING);
        }
        V2();
    }

    public void q3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96950d81", new Object[]{this});
        } else {
            P2().Z2();
        }
    }

    public void r0(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ee5655", new Object[]{this, listStyle});
            return;
        }
        ckf.g(listStyle, "style");
        P2().r0(listStyle);
    }

    @Override // tb.buc
    public void stopScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec88676", new Object[]{this});
        } else {
            P2().stopScroll();
        }
    }

    @Override // tb.qtc
    public void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c912d9a", new Object[]{this, new Integer(i)});
        } else {
            ((stc) t2()).u(i);
        }
    }

    @Override // tb.buc
    public int v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b356df52", new Object[]{this})).intValue();
        }
        return P2().v1();
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e79b3a", new Object[]{this});
            return;
        }
        RecyclerView A2 = P2().A2();
        if (A2 == null) {
            return;
        }
        if (A2.isAttachedToWindow()) {
            ((euc) P2().t2()).x();
            X2();
            return;
        }
        A2.post(new Runnable() { // from class: tb.udz
            @Override // java.lang.Runnable
            public final void run() {
                MetaChildPageWidget.m(MetaChildPageWidget.this);
            }
        });
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b832b080", new Object[]{this});
            return;
        }
        ((stc) t2()).z();
        this.d.clear();
        this.c.clear();
        P2().z();
        M2().f();
        G2();
    }

    public void z2(BaseTypedBean baseTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d04d1c", new Object[]{this, baseTypedBean});
            return;
        }
        ckf.g(baseTypedBean, "bean");
        gsi M2 = M2();
        o02 e = ((acx) getModel()).e();
        ckf.f(e, "getScopeDatasource(...)");
        kae<BaseTypedBean, ?> h = M2.h(baseTypedBean, "", (a) e, new g1a() { // from class: tb.xdz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                ay4 k;
                k = MetaChildPageWidget.k(MetaChildPageWidget.this, (String) obj);
                return k;
            }
        }, new g1a() { // from class: tb.ydz
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                ay4 l;
                l = MetaChildPageWidget.l(MetaChildPageWidget.this, (String) obj);
                return l;
            }
        });
        if (h != null) {
            h.ensureView();
            h.bindWithData(baseTypedBean);
            this.g.add(h);
            P2().J2(h);
        }
    }

    public void h3(kae<?, ?> kaeVar, boolean z, frk frkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e076d3a", new Object[]{this, kaeVar, new Boolean(z), frkVar});
            return;
        }
        ckf.g(kaeVar, "widget");
        i3(kaeVar, z, frkVar, 0);
    }

    public final void o3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16dfda", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "data");
        o02 e = ((acx) getModel()).e();
        ckf.f(e, "getScopeDatasource(...)");
        a aVar = (a) e;
        BaseTypedBean c = c().n().c(jSONObject, (MetaResult) aVar.getTotalSearchResult());
        MuiseBean muiseBean = c instanceof MuiseBean ? (MuiseBean) c : null;
        if (muiseBean != null) {
            pwc pwcVar = this.i;
            if (pwcVar != null) {
                pwcVar.destroyAndRemoveFromParent();
                this.i = null;
            }
            TemplateBean template = aVar.getTemplate(muiseBean.type);
            if (template != null) {
                ViewGroup P1 = ((stc) t2()).P1();
                Object a2 = w2().M().a(new gu1(v2(), template));
                ckf.f(a2, "create(...)");
                pwc pwcVar2 = (pwc) a2;
                pwcVar2.q2(false);
                pwcVar2.bindWithData(muiseBean);
                P1.getLayoutParams().width = p1p.a(muiseBean.model.getInteger("width").intValue());
                P1.addView(pwcVar2.getView(), -1, -1);
                P1.setVisibility(0);
                this.i = pwcVar2;
                a3();
            }
        }
    }
}
