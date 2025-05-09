package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.srp.SrpWidget;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.NxTabLayout;
import com.taobao.search.refactor.MSearchResult;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.newsearch.widgets.tab.NSTabWidget;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bsh extends SrpWidget<jrh, frh, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public oig n;
    public w4p o;
    public boolean p;
    public kae<BaseTypedBean, ?> q;

    static {
        t2o.a(815792880);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsh(neq neqVar, Activity activity, ude udeVar, acx<jrh> acxVar, ViewGroup viewGroup, vfw vfwVar) {
        super(neqVar, activity, udeVar, acxVar, viewGroup, vfwVar);
        ckf.g(neqVar, "config");
        ckf.g(activity, "activity");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(acxVar, "model");
        subscribeEvent(this);
    }

    public static /* synthetic */ Object ipc$super(bsh bshVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1358571937) {
            return new Boolean(super.o3());
        }
        if (hashCode == 581789757) {
            super.M2((MetaResult) objArr[0]);
            return null;
        } else if (hashCode == 1678439414) {
            super.Z2((MetaResult) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/refactor/MSPageWidget");
        }
    }

    @Override // com.taobao.android.meta.srp.SrpWidget, tb.ksi
    public void M2(MetaResult<frh> metaResult) {
        esi e3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ad683d", new Object[]{this, metaResult});
            return;
        }
        ckf.g(metaResult, "result");
        long currentTimeMillis = System.currentTimeMillis();
        xno srpLifeCycleWatcher = ((jrh) ((acx) getModel()).e()).getSrpLifeCycleWatcher();
        if (srpLifeCycleWatcher != null) {
            srpLifeCycleWatcher.c(zno.SPAN_SETUP_PAGE);
        }
        wnl wnlVar = wnl.INSTANCE;
        Activity activity = getActivity();
        ckf.f(activity, "getActivity(...)");
        wnlVar.b(activity, "page", "stickyComboPosition", "0");
        CommonSearchResult commonSearchResult = metaResult instanceof CommonSearchResult ? (CommonSearchResult) metaResult : null;
        if (!(commonSearchResult == null || !commonSearchResult.isHalfStickySearchBar || (e3 = e3()) == null)) {
            e3.t(ytc.TYPE_HALF_STICKY_SEARCHBAR);
        }
        u3(metaResult);
        super.M2(metaResult);
        w4p w4pVar = this.o;
        if (w4pVar != null) {
            w4pVar.w2((CommonBaseDatasource) ((acx) getModel()).b());
            if (srpLifeCycleWatcher != null) {
                srpLifeCycleWatcher.d(zno.SPAN_SETUP_PAGE, null);
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            y5p firstRequestPerf = ((jrh) ((acx) getModel()).e()).getFirstRequestPerf();
            if (firstRequestPerf != null && firstRequestPerf.p == 0) {
                firstRequestPerf.p = currentTimeMillis2;
                return;
            }
            return;
        }
        ckf.y("promotionWidget");
        throw null;
    }

    @Override // com.taobao.android.meta.srp.SrpWidget
    public void a3(kae<?, ?> kaeVar, MetaResult<frh> metaResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa6a79a", new Object[]{this, kaeVar, metaResult});
            return;
        }
        ckf.g(kaeVar, "searchBarWidget");
        ckf.g(metaResult, "result");
        if (kaeVar instanceof s0p) {
            ((s0p) kaeVar).A2((MSearchResult) metaResult);
        } else if (kaeVar instanceof gny) {
            ((gny) kaeVar).A2((MSearchResult) metaResult);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r2.size() <= 1) goto L_0x004e;
     */
    @Override // com.taobao.android.meta.srp.SrpWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int i3() {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.bsh.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "8a2fcbe0"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
        L_0x0019:
            tb.kae<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, ?> r2 = r4.q
            if (r2 == 0) goto L_0x0027
            android.view.View r2 = r2.getView()
            if (r2 == 0) goto L_0x0027
            int r0 = r2.getMeasuredHeight()
        L_0x0027:
            java.lang.Object r2 = r4.getModel()
            tb.acx r2 = (tb.acx) r2
            tb.o02 r2 = r2.b()
            tb.jrh r2 = (tb.jrh) r2
            com.taobao.android.searchbaseframe.datasource.result.SearchResult r2 = r2.getTotalSearchResult()
            com.taobao.search.sf.datasource.CommonSearchResult r2 = (com.taobao.search.sf.datasource.CommonSearchResult) r2
            if (r2 == 0) goto L_0x004f
            java.util.List r3 = r2.getTabs()
            if (r3 == 0) goto L_0x004e
            java.util.List r2 = r2.getTabs()
            tb.ckf.d(r2)
            int r2 = r2.size()
            if (r2 > r1) goto L_0x004f
        L_0x004e:
            return r0
        L_0x004f:
            r1 = 48
            int r1 = tb.o1p.b(r1)
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bsh.i3():int");
    }

    @Override // com.taobao.android.meta.srp.SrpWidget
    public boolean o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af05d65f", new Object[]{this})).booleanValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((jrh) ((acx) getModel()).b()).getTotalSearchResult();
        if (commonSearchResult == null || !commonSearchResult.newSearch) {
            return super.o3();
        }
        return true;
    }

    public final void onEventMainThread(cxk cxkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc487a3", new Object[]{this, cxkVar});
            return;
        }
        ckf.g(cxkVar, "event");
        this.p = true;
    }

    @Override // com.taobao.android.meta.srp.SrpWidget
    public vrd p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vrd) ipChange.ipc$dispatch("770a8eb3", new Object[]{this});
        }
        x02 v2 = v2();
        ckf.f(v2, "getCreatorParam(...)");
        v2.e = new k4k();
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((jrh) ((acx) getModel()).b()).getTotalSearchResult();
        if (commonSearchResult == null || !commonSearchResult.newSearch || commonSearchResult.guideSearch) {
            return new a12(v2.f31046a, v2.b, v2.c, v2.d, v2.e);
        }
        NSTabWidget nSTabWidget = new NSTabWidget(v2.f31046a, v2.b, v2.c, v2.d, v2.e);
        nSTabWidget.attachToContainer();
        return nSTabWidget;
    }

    @Override // com.taobao.android.meta.srp.SrpWidget
    public void q3() {
        NxTabLayout nxTabLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1456210c", new Object[]{this});
            return;
        }
        pqs h3 = h3();
        if (h3 != null) {
            View h = h3.h();
            oxb oxbVar = null;
            if (h instanceof NxTabLayout) {
                nxTabLayout = (NxTabLayout) h;
            } else {
                nxTabLayout = null;
            }
            if (nxTabLayout != null) {
                if (k3().isEmpty()) {
                    nxTabLayout.setTopRadius(0);
                    ViewCompat.setBackground(nxTabLayout, null);
                    vrd j3 = j3();
                    ckf.e(j3, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.tab.BaseSrpTabWidget");
                    IV t2 = ((a12) j3).t2();
                    ckf.e(t2, "null cannot be cast to non-null type com.taobao.search.sf.widgets.tab.SearchSrpTabView");
                    ((t5p) t2).X();
                    return;
                }
                Activity activity = getActivity();
                if (activity instanceof oxb) {
                    oxbVar = (oxb) activity;
                }
                if (oxbVar == null || !oxbVar.E1()) {
                    nxTabLayout.setBackgroundColor(-1);
                } else {
                    nxTabLayout.setBackgroundResource(R.color.tbsearch_main_card_bg_night);
                }
                nxTabLayout.setTopRadius(getActivity().getResources().getDimensionPixelSize(R.dimen.tbsearch_tab_radius));
                vrd j32 = j3();
                ckf.e(j32, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.tab.BaseSrpTabWidget");
                IV t22 = ((a12) j32).t2();
                ckf.e(t22, "null cannot be cast to non-null type com.taobao.search.sf.widgets.tab.SearchSrpTabView");
                ((t5p) t22).Y();
            }
        }
    }

    public final void u3(MetaResult<frh> metaResult) {
        MSearchResult mSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f4f70b", new Object[]{this, metaResult});
            return;
        }
        if (metaResult instanceof MSearchResult) {
            mSearchResult = (MSearchResult) metaResult;
        } else {
            mSearchResult = null;
        }
        if (mSearchResult == null) {
            return;
        }
        if (mSearchResult.newSearch || mSearchResult.guideSearch) {
            y2();
        }
    }

    public final void v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80e52a9", new Object[]{this});
        } else {
            getActivity().runOnUiThread(new Runnable() { // from class: tb.edz
                @Override // java.lang.Runnable
                public final void run() {
                    bsh.p(bsh.this);
                }
            });
        }
    }

    public final void w3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d8f332", new Object[]{this});
            return;
        }
        tnl d = ((acx) getModel()).d();
        ckf.f(d, "getPageModel(...)");
        w4p w4pVar = new w4p(getActivity(), this, d);
        this.o = w4pVar;
        d.q(vdd.CONFIG_KEY, w4pVar);
    }

    public final void x3(jrh jrhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d001e2b", new Object[]{this, jrhVar});
            return;
        }
        ckf.g(jrhVar, c4o.KEY_DATA_SOURCE);
        w4p w4pVar = this.o;
        if (w4pVar != null) {
            w4pVar.w2(jrhVar);
        } else {
            ckf.y("promotionWidget");
            throw null;
        }
    }

    @Override // com.taobao.android.meta.srp.SrpWidget
    public void Z2(MetaResult<frh> metaResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640af3f6", new Object[]{this, metaResult});
            return;
        }
        ckf.g(metaResult, "result");
        if (!this.p) {
            super.Z2(metaResult);
        }
        BaseTypedBean tabHeader = ((MSearchResult) metaResult).getTabHeader();
        if (tabHeader != null) {
            o02 b = ((acx) getModel()).b();
            ckf.f(b, "getInitDatasource(...)");
            jrh jrhVar = (jrh) b;
            if (kxi.b(tabHeader)) {
                TemplateBean template = jrhVar.getTemplate(tabHeader.type);
                if (template != null) {
                    Object a2 = J2().o0().a(new gu1(v2(), template));
                    ckf.e(a2, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.IViewWidget<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, *>");
                    this.q = (kae) a2;
                }
            } else if (kxi.a(tabHeader)) {
                TemplateBean template2 = jrhVar.getTemplate(tabHeader.type);
                if (template2 != null) {
                    Object a3 = J2().M().a(new gu1(v2(), template2));
                    ckf.e(a3, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.IViewWidget<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, *>");
                    this.q = (kae) a3;
                }
            } else {
                kae<BaseTypedBean, ?> a4 = c().m().a(tabHeader.getClass(), v2());
                ckf.e(a4, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.widget.IViewWidget<com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean, *>");
                this.q = a4;
            }
            kae<BaseTypedBean, ?> kaeVar = this.q;
            if (kaeVar != null) {
                ckf.d(kaeVar);
                kaeVar.ensureView();
                kae<BaseTypedBean, ?> kaeVar2 = this.q;
                ckf.d(kaeVar2);
                kaeVar2.bindWithData(tabHeader);
                esi esiVar = new esi(this.q);
                esiVar.t("sticky");
                esiVar.r(false);
                ((juc) t2()).j().addHeader(esiVar);
            }
        }
    }

    public final void onEventMainThread(v7p v7pVar) {
        BaseCellBean cell;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d511c488", new Object[]{this, v7pVar});
            return;
        }
        ckf.g(v7pVar, "event");
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((jrh) ((acx) getModel()).b()).getTotalSearchResult();
        if (commonSearchResult != null && (cell = commonSearchResult.getCell(v7pVar.b)) != null) {
            asi asiVar = cell.combo;
            ckf.d(asiVar);
            int k = asiVar.k();
            wnl wnlVar = wnl.INSTANCE;
            Activity activity = getActivity();
            ckf.f(activity, "getActivity(...)");
            wnlVar.b(activity, "page", "stickyComboPosition", String.valueOf(k));
        }
    }

    public static final void p(final bsh bshVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037bc92", new Object[]{bshVar});
            return;
        }
        ckf.g(bshVar, "this$0");
        tnd f = ((acx) bshVar.getModel()).f();
        ckf.e(f, "null cannot be cast to non-null type com.taobao.search.sf.context.CommonSearchContext");
        if (((CommonSearchContext) f).isGallerySrp()) {
            TUrlImageView tUrlImageView = new TUrlImageView(bshVar.getActivity());
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            tUrlImageView.setImageUrl(o4p.t());
            FrameLayout view = ((juc) bshVar.t2()).getView();
            ckf.d(view);
            view.addView(tUrlImageView, 0, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        oig oigVar = new oig(bshVar.getActivity(), bshVar, (acx) bshVar.getModel(), bshVar.getContainer(), new vfw() { // from class: tb.bsh$a$a
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.vfw
            public void a(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d136b904", new Object[]{this, view2});
                    return;
                }
                ckf.g(view2, "componentView");
                ((juc) bsh.this.t2()).i(view2);
            }

            @Override // tb.vfw
            public void b(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8c9d0363", new Object[]{this, view2});
                } else {
                    ckf.g(view2, "componentView");
                }
            }
        });
        bshVar.n = oigVar;
        oigVar.v2(true);
        oig oigVar2 = bshVar.n;
        ckf.d(oigVar2);
        oigVar2.ensureView();
        oig oigVar3 = bshVar.n;
        ckf.d(oigVar3);
        oigVar3.attachToContainer();
    }
}
