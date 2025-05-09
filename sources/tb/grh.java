package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.srp.ui.list.SrpListStateWidget;
import com.taobao.android.meta.srp.ui.list.SrpStateCell;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.searchbaseframe.business.common.list.BaseListView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.musie.SearchMuiseViewHolder;
import com.taobao.search.refactor.MSChildPageWidget;
import com.taobao.search.sf.DecorationProvider;
import com.taobao.search.sf.newsearch.widgets.NSSceneHeaderMuiseWidget;
import com.taobao.search.sf.newsearch.widgets.NSSceneHeaderWeexWidget;
import com.taobao.search.sf.widgets.list.listcell.weex.SearchListWeexCellViewHolder;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class grh extends neq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final p Companion = new p(null);
    public static boolean x0 = true;
    public ay4<gu1, ? extends pwc> v0;
    public boolean w0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792870);
        }

        public /* synthetic */ p(a07 a07Var) {
            this();
        }

        public p() {
        }
    }

    static {
        t2o.a(815792868);
    }

    public grh(yko ykoVar) {
        ckf.g(ykoVar, "core");
        T0(o4p.C1("restrainFirstScroll"));
        N0(l1());
        X0(new ay4() { // from class: tb.icz
            @Override // tb.ay4
            public final Object a(Object obj) {
                BaseListView.a U1;
                U1 = grh.U1((Void) obj);
                return U1;
            }
        });
        x0(true);
        b1(0);
        z0(new erh());
        t0(new ay4() { // from class: tb.ncz
            @Override // tb.ay4
            public final Object a(Object obj) {
                MSChildPageWidget V1;
                V1 = grh.V1((x02) obj);
                return V1;
            }
        });
        K0(new ay4() { // from class: tb.ocz
            @Override // tb.ay4
            public final Object a(Object obj) {
                WidgetViewHolder a2;
                a2 = grh.a2((w02) obj);
                return a2;
            }
        });
        L0(new ay4() { // from class: tb.pcz
            @Override // tb.ay4
            public final Object a(Object obj) {
                j4p b2;
                b2 = grh.b2((gu1) obj);
                return b2;
            }
        });
        d1(new ay4() { // from class: tb.qcz
            @Override // tb.ay4
            public final Object a(Object obj) {
                m6p c2;
                c2 = grh.c2((gu1) obj);
                return c2;
            }
        });
        q1(new ay4() { // from class: tb.acz
            @Override // tb.ay4
            public final Object a(Object obj) {
                NSSceneHeaderMuiseWidget d2;
                d2 = grh.d2((gu1) obj);
                return d2;
            }
        });
        r1(new ay4() { // from class: tb.bcz
            @Override // tb.ay4
            public final Object a(Object obj) {
                NSSceneHeaderWeexWidget e2;
                e2 = grh.e2((gu1) obj);
                return e2;
            }
        });
        c1(new ay4() { // from class: tb.ccz
            @Override // tb.ay4
            public final Object a(Object obj) {
                WidgetViewHolder f2;
                f2 = grh.f2((w02) obj);
                return f2;
            }
        });
        y0(new ay4() { // from class: tb.dcz
            @Override // tb.ay4
            public final Object a(Object obj) {
                mrh g2;
                g2 = grh.g2((bsi) obj);
                return g2;
            }
        });
        if (x0) {
            rg3<BaseCellBean> a2 = ykoVar.a();
            ListStyle listStyle = ListStyle.LIST;
            SrpListStateWidget.b bVar = SrpListStateWidget.Companion;
            a2.e(listStyle, SrpStateCell.class, bVar.a());
            ykoVar.a().e(ListStyle.WATERFALL, SrpStateCell.class, bVar.a());
            x0 = false;
        }
        W0(new ay4() { // from class: tb.ecz
            @Override // tb.ay4
            public final Object a(Object obj) {
                esh h2;
                h2 = grh.h2((bsi) obj);
                return h2;
            }
        });
        v0(o4p.A0());
        o1(new ay4() { // from class: tb.jcz
            @Override // tb.ay4
            public final Object a(Object obj) {
                orh W1;
                W1 = grh.W1((Activity) obj);
                return W1;
            }
        });
        F0(1);
        s1(new ay4() { // from class: tb.kcz
            @Override // tb.ay4
            public final Object a(Object obj) {
                s0p X1;
                X1 = grh.X1((x02) obj);
                return X1;
            }
        });
        Z0(!l3p.INSTANCE.d());
        a1(o4p.f0());
        q0(new k08());
        G0(new ay4() { // from class: tb.lcz
            @Override // tb.ay4
            public final Object a(Object obj) {
                nrh Y1;
                Y1 = grh.Y1((MetaListWidget) obj);
                return Y1;
            }
        });
        O0(-1);
        M0(o4p.m1());
        s0(o4p.s0());
        B0(new e());
        p0(o4p.n0());
        x1(new ay4() { // from class: tb.mcz
            @Override // tb.ay4
            public final Object a(Object obj) {
                rlf Z1;
                Z1 = grh.Z1((gu1) obj);
                return Z1;
            }
        });
        A0(true);
        E0(o4p.C1("layoutListFirst"));
    }

    public static final BaseListView.a U1(Void r4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseListView.a) ipChange.ipc$dispatch("7ca8c2ae", new Object[]{r4});
        }
        return new DecorationProvider();
    }

    public static final MSChildPageWidget V1(x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MSChildPageWidget) ipChange.ipc$dispatch("5892115", new Object[]{x02Var});
        }
        Activity activity = x02Var.f31046a;
        ckf.f(activity, "activity");
        ude udeVar = x02Var.b;
        ckf.f(udeVar, a.MSG_SOURCE_PARENT);
        acx<? extends o02<? extends BaseSearchResult, ?>> acxVar = x02Var.c;
        ckf.e(acxVar, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<out com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>>");
        return new MSChildPageWidget(activity, udeVar, acxVar, x02Var.d, x02Var.e);
    }

    public static final orh W1(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (orh) ipChange.ipc$dispatch("33758e9", new Object[]{activity});
        }
        ckf.d(activity);
        return new orh(activity);
    }

    public static final s0p X1(x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s0p) ipChange.ipc$dispatch("ab63c723", new Object[]{x02Var});
        }
        return new s0p(x02Var.f31046a, x02Var.b, x02Var.c, x02Var.d, x02Var.e);
    }

    public static final nrh Y1(MetaListWidget metaListWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nrh) ipChange.ipc$dispatch("3bafc9ac", new Object[]{metaListWidget});
        }
        ckf.d(metaListWidget);
        return new nrh(metaListWidget);
    }

    public static final rlf Z1(gu1 gu1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rlf) ipChange.ipc$dispatch("492077d4", new Object[]{gu1Var});
        }
        return new rlf(gu1Var.f31046a, gu1Var.b, gu1Var.c, gu1Var.f, gu1Var.d, gu1Var.e);
    }

    public static final WidgetViewHolder a2(w02 w02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("6ac385cf", new Object[]{w02Var});
        }
        return new SearchMuiseViewHolder(w02Var.f31046a, w02Var.c, w02Var.b, w02Var.g, w02Var.d, w02Var.f);
    }

    public static final j4p b2(gu1 gu1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j4p) ipChange.ipc$dispatch("f7270a8e", new Object[]{gu1Var});
        }
        return new j4p(gu1Var.f31046a, gu1Var.b, gu1Var.c, gu1Var.f, gu1Var.d, gu1Var.e);
    }

    public static final m6p c2(gu1 gu1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m6p) ipChange.ipc$dispatch("96a2bf7d", new Object[]{gu1Var});
        }
        return new m6p(gu1Var.f31046a, gu1Var.b, gu1Var.c, gu1Var.f, gu1Var.d, gu1Var.e);
    }

    public static final NSSceneHeaderMuiseWidget d2(gu1 gu1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NSSceneHeaderMuiseWidget) ipChange.ipc$dispatch("1d672881", new Object[]{gu1Var});
        }
        Activity activity = gu1Var.f31046a;
        ckf.f(activity, "activity");
        ude udeVar = gu1Var.b;
        ckf.f(udeVar, a.MSG_SOURCE_PARENT);
        acx<? extends o02<? extends BaseSearchResult, ?>> acxVar = gu1Var.c;
        ckf.f(acxVar, "modelAdapter");
        TemplateBean templateBean = gu1Var.f;
        ckf.f(templateBean, "templateBean");
        return new NSSceneHeaderMuiseWidget(activity, udeVar, acxVar, templateBean, gu1Var.d, gu1Var.e);
    }

    public static final NSSceneHeaderWeexWidget e2(gu1 gu1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NSSceneHeaderWeexWidget) ipChange.ipc$dispatch("fb2b9218", new Object[]{gu1Var});
        }
        Activity activity = gu1Var.f31046a;
        ckf.f(activity, "activity");
        ude udeVar = gu1Var.b;
        ckf.f(udeVar, a.MSG_SOURCE_PARENT);
        acx<? extends o02<? extends BaseSearchResult, ?>> acxVar = gu1Var.c;
        ckf.f(acxVar, "modelAdapter");
        TemplateBean templateBean = gu1Var.f;
        ckf.f(templateBean, "templateBean");
        return new NSSceneHeaderWeexWidget(activity, udeVar, acxVar, templateBean, gu1Var.d, gu1Var.e);
    }

    public static final WidgetViewHolder f2(w02 w02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("a598406a", new Object[]{w02Var});
        }
        return new SearchListWeexCellViewHolder(w02Var.f31046a, w02Var.c, w02Var.b, w02Var.g, w02Var.d, w02Var.f);
    }

    public static final mrh g2(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mrh) ipChange.ipc$dispatch("99eea4d3", new Object[]{bsiVar});
        }
        return new mrh();
    }

    public static final esh h2(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (esh) ipChange.ipc$dispatch("2375bb39", new Object[]{bsiVar});
        }
        if (o4p.l2()) {
            return new amh();
        }
        return new esh();
    }

    public static final gny i2(x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gny) ipChange.ipc$dispatch("2453933b", new Object[]{x02Var});
        }
        Activity activity = x02Var.f31046a;
        ckf.f(activity, "activity");
        ude udeVar = x02Var.b;
        ckf.f(udeVar, a.MSG_SOURCE_PARENT);
        acx<? extends o02<? extends BaseSearchResult, ?>> acxVar = x02Var.c;
        ckf.e(acxVar, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<com.taobao.search.refactor.MSDataSource>");
        ViewGroup viewGroup = x02Var.d;
        vfw vfwVar = x02Var.e;
        ckf.d(vfwVar);
        return new gny(activity, udeVar, acxVar, viewGroup, vfwVar);
    }

    public static /* synthetic */ Object ipc$super(grh grhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/MSConfig");
    }

    public static final wv3 j2(x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wv3) ipChange.ipc$dispatch("d9ec18dc", new Object[]{x02Var});
        }
        return new wv3(x02Var.f31046a, x02Var.b, x02Var.c, x02Var.d, x02Var.e);
    }

    public static final jw7 k2(x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jw7) ipChange.ipc$dispatch("d9f196ed", new Object[]{x02Var});
        }
        return new jw7(x02Var.f31046a, x02Var.b, null, x02Var.d, x02Var.e);
    }

    public static final hfe l2(x02 x02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hfe) ipChange.ipc$dispatch("39bd4225", new Object[]{x02Var});
        }
        return new hfe(x02Var.f31046a, x02Var.b, x02Var.c, x02Var.d, x02Var.e);
    }

    public final void A1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d58fe84", new Object[]{this});
        } else {
            s1(new ay4() { // from class: tb.fcz
                @Override // tb.ay4
                public final Object a(Object obj) {
                    hfe l2;
                    l2 = grh.l2((x02) obj);
                    return l2;
                }
            });
        }
    }

    public final void L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9062ac76", new Object[]{this});
        } else {
            s1(new ay4() { // from class: tb.gcz
                @Override // tb.ay4
                public final Object a(Object obj) {
                    gny i2;
                    i2 = grh.i2((x02) obj);
                    return i2;
                }
            });
        }
    }

    public final boolean u1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c2fbf89", new Object[]{this})).booleanValue();
        }
        return this.w0;
    }

    public final ay4<gu1, ? extends pwc> v1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay4) ipChange.ipc$dispatch("78c83ced", new Object[]{this});
        }
        ay4<gu1, ? extends pwc> ay4Var = this.v0;
        if (ay4Var != null) {
            return ay4Var;
        }
        ckf.y("topHeaderMod");
        throw null;
    }

    public final void w1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155ef063", new Object[]{this, new Boolean(z)});
        } else {
            this.w0 = z;
        }
    }

    public final void x1(ay4<gu1, ? extends pwc> ay4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd03cbd", new Object[]{this, ay4Var});
            return;
        }
        ckf.g(ay4Var, "<set-?>");
        this.v0 = ay4Var;
    }

    public final void y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("654541fb", new Object[]{this});
        } else {
            s1(new ay4() { // from class: tb.hcz
                @Override // tb.ay4
                public final Object a(Object obj) {
                    wv3 j2;
                    j2 = grh.j2((x02) obj);
                    return j2;
                }
            });
        }
    }

    public final void z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aeb029", new Object[]{this});
        } else {
            s1(new ay4() { // from class: tb.zbz
                @Override // tb.ay4
                public final Object a(Object obj) {
                    jw7 k2;
                    k2 = grh.k2((x02) obj);
                    return k2;
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class e implements lcc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f20179a = o4p.T();

        @Override // tb.lcc
        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ea80cb71", new Object[]{this, str})).booleanValue();
            }
            if (str == null) {
                return false;
            }
            int Y = wsq.Y(str, "@", 0, false, 6, null);
            if (Y > 0) {
                str = str.substring(0, Y);
                ckf.f(str, "substring(...)");
            }
            return y4p.s() && this.f20179a.contains(str);
        }
    }
}
