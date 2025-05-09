package tb;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.refactor.list.InshopListPlugin;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class nrh extends hsi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b = true;
    public Boolean c;
    public final List<hsi> d;

    static {
        t2o.a(815792879);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrh(MetaListWidget metaListWidget) {
        super(metaListWidget);
        ckf.g(metaListWidget, "widget");
        List<hsi> m = yz3.m(new cn1(metaListWidget), new ng7(metaListWidget), new k48(metaListWidget), new tmz(metaListWidget));
        this.d = m;
        if (ckf.b(((acx) metaListWidget.getModel()).e().getParamValue("m"), r4p.VALUE_MODULE_INSHOP)) {
            m.add(new InshopListPlugin(metaListWidget));
        }
    }

    public static /* synthetic */ Object ipc$super(nrh nrhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/MSListPlugin");
    }

    @Override // tb.hsi
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321cdedb", new Object[]{this});
            return;
        }
        for (hsi hsiVar : this.d) {
            hsiVar.b();
        }
    }

    @Override // tb.hsi
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        for (hsi hsiVar : this.d) {
            hsiVar.c();
        }
    }

    @Override // tb.hsi
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d60f0b", new Object[]{this});
            return;
        }
        for (hsi hsiVar : this.d) {
            hsiVar.d();
        }
    }

    @Override // tb.hsi
    public void e() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e376a5c", new Object[]{this});
            return;
        }
        if (this.b) {
            this.b = false;
            if (!m()) {
                RESULT totalSearchResult = ((acx) a().getModel()).e().getTotalSearchResult();
                ckf.e(totalSearchResult, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
                if (((CommonSearchResult) totalSearchResult).isPrePaging) {
                    i = o4p.P(4);
                } else {
                    i = -1;
                }
                RecyclerView recyclerView = ((euc) a().t2()).getRecyclerView();
                ckf.e(recyclerView, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
                ((PartnerRecyclerView) recyclerView).setPreRequestCellThreshold(i);
            }
        }
        for (hsi hsiVar : this.d) {
            hsiVar.e();
        }
    }

    @Override // tb.hsi
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("befd50ee", new Object[]{this});
            return;
        }
        k();
        if (!m()) {
            o();
            for (hsi hsiVar : this.d) {
                hsiVar.f();
            }
        }
    }

    @Override // tb.hsi
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58927bd", new Object[]{this});
            return;
        }
        a().postEvent(new yqj());
        wnl wnlVar = wnl.INSTANCE;
        Activity activity = a().getActivity();
        ckf.f(activity, "getActivity(...)");
        wnlVar.b(activity, "pageState", "isScrolling", "true");
        for (hsi hsiVar : this.d) {
            hsiVar.g();
        }
    }

    @Override // tb.hsi
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4389135", new Object[]{this});
            return;
        }
        if (!m()) {
            o();
        }
        wnl wnlVar = wnl.INSTANCE;
        Activity activity = a().getActivity();
        ckf.f(activity, "getActivity(...)");
        wnlVar.b(activity, "pageState", "isScrolling", "false");
        for (hsi hsiVar : this.d) {
            hsiVar.h();
        }
    }

    @Override // tb.hsi
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f18e32", new Object[]{this});
            return;
        }
        for (hsi hsiVar : this.d) {
            hsiVar.i();
        }
    }

    @Override // tb.hsi
    public void j(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ee5655", new Object[]{this, listStyle});
            return;
        }
        ckf.g(listStyle, "listStyle");
        for (hsi hsiVar : this.d) {
            hsiVar.j(listStyle);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4edb3a2", new Object[]{this});
        } else if (a().getActivity() instanceof gnh) {
            Activity activity = a().getActivity();
            ckf.e(activity, "null cannot be cast to non-null type com.taobao.search.performance.M3CardManagerHolder");
            ((gnh) activity).v();
        }
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89582ae9", new Object[]{this})).booleanValue();
        }
        if (this.c == null) {
            BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) a().getModel()).e().getTotalSearchResult();
            if (baseSearchResult != null) {
                Boolean valueOf = Boolean.valueOf(((CommonSearchResult) baseSearchResult).newSearch);
                this.c = valueOf;
                return valueOf.booleanValue();
            }
            this.c = Boolean.FALSE;
        }
        Boolean bool = this.c;
        ckf.d(bool);
        return bool.booleanValue();
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9953e7a", new Object[]{this});
            return;
        }
        RecyclerView.LayoutManager layoutManager = ((euc) a().t2()).getRecyclerView().getLayoutManager();
        ckf.f(layoutManager, "getLayoutManager(...)");
        View childAt = layoutManager.getChildAt(0);
        if (childAt != null) {
            int childAdapterPosition = ((euc) a().t2()).getRecyclerView().getChildAdapterPosition(childAt);
            o02 a2 = ((acx) a().getModel()).a();
            ckf.e(a2, "null cannot be cast to non-null type com.taobao.search.sf.datasource.mainsearch.MainSearchDatasource");
            ((g1i) a2).n0(childAdapterPosition);
        }
    }
}
