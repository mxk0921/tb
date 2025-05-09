package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.BHXVisualCenterItem;
import com.taobao.android.meta.structure.list.MetaListWidget;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class cn1 extends ww1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long g;
    public boolean i;
    public boolean e = true;
    public final int[] f = new int[2];
    public final long h = o4p.j();

    static {
        t2o.a(815792890);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn1(MetaListWidget metaListWidget) {
        super(metaListWidget);
        ckf.g(metaListWidget, "widget");
    }

    public static /* synthetic */ Object ipc$super(cn1 cn1Var, String str, Object... objArr) {
        if (str.hashCode() == 1727106610) {
            super.i();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/refactor/list/BXListPlugin");
    }

    public static final void p(cn1 cn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e13d3f67", new Object[]{cn1Var});
            return;
        }
        ckf.g(cn1Var, "this$0");
        try {
            cn1Var.t(cn1Var.r());
        } catch (Throwable unused) {
        }
    }

    public static final void q(cn1 cn1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd04155e", new Object[]{cn1Var});
            return;
        }
        ckf.g(cn1Var, "this$0");
        try {
            cn1Var.t(cn1Var.r());
        } catch (Throwable unused) {
        }
    }

    @Override // tb.hsi
    public void f() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("befd50ee", new Object[]{this});
            return;
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) a().getModel()).e().getTotalSearchResult();
        if (baseSearchResult != null && baseSearchResult.getMainInfo().page == 1 && (frameLayout = (FrameLayout) a().getView()) != null) {
            frameLayout.postDelayed(new Runnable() { // from class: tb.w4w
                @Override // java.lang.Runnable
                public final void run() {
                    cn1.p(cn1.this);
                }
            }, 200L);
        }
    }

    @Override // tb.hsi
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58927bd", new Object[]{this});
        } else if (!this.i) {
            this.i = true;
            if (!m()) {
                try {
                    int y = ((euc) a().t2()).y();
                    if (o4p.l0()) {
                        h6p.p(y, r());
                    } else {
                        h6p.o(y);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // tb.hsi
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4389135", new Object[]{this});
        } else if (this.i) {
            this.i = false;
            if (!m()) {
                try {
                    int y = ((euc) a().t2()).y();
                    if (o4p.l0()) {
                        List<BHXVisualCenterItem> r = r();
                        h6p.n(y, r);
                        t(r);
                    } else {
                        h6p.m(y);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // tb.hsi
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f18e32", new Object[]{this});
            return;
        }
        super.i();
        if (o4p.l0()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.g >= this.h) {
                try {
                    h6p.q(((euc) a().t2()).y(), r());
                    this.g = currentTimeMillis;
                } catch (Throwable unused) {
                }
            }
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
        FrameLayout frameLayout = (FrameLayout) a().getView();
        if (frameLayout != null) {
            frameLayout.post(new Runnable() { // from class: tb.jgv
                @Override // java.lang.Runnable
                public final void run() {
                    cn1.q(cn1.this);
                }
            });
        }
    }

    public final List<BHXVisualCenterItem> r() {
        PartnerRecyclerView partnerRecyclerView;
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b3648d4c", new Object[]{this});
        }
        RecyclerView recyclerView = ((euc) a().t2()).getRecyclerView();
        if (recyclerView instanceof PartnerRecyclerView) {
            partnerRecyclerView = (PartnerRecyclerView) recyclerView;
        } else {
            partnerRecyclerView = null;
        }
        if (partnerRecyclerView == null) {
            return yz3.i();
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) a().getModel()).e().getTotalSearchResult();
        if (baseSearchResult == null) {
            return yz3.i();
        }
        int headerViewsCount = partnerRecyclerView.getHeaderViewsCount();
        ArrayList arrayList = new ArrayList();
        String str2 = baseSearchResult.getMainInfo().rn;
        om1 s = s();
        int childCount = partnerRecyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = partnerRecyclerView.getChildAt(i2);
            ckf.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) childAt;
            int childAdapterPosition = partnerRecyclerView.getChildAdapterPosition(viewGroup);
            if (childAdapterPosition >= headerViewsCount && (i = childAdapterPosition - headerViewsCount) >= 0 && i < baseSearchResult.getCellsCount()) {
                BaseCellBean cell = baseSearchResult.getCell(i);
                if (ckf.b(cell.cardType, "item")) {
                    str = cell.itemId;
                } else {
                    str = cell.bizItemId;
                }
                viewGroup.getLocationOnScreen(this.f);
                BHXVisualCenterItem bHXVisualCenterItem = new BHXVisualCenterItem();
                bHXVisualCenterItem.f27464a = str;
                bHXVisualCenterItem.f = cell.rn;
                bHXVisualCenterItem.g = str2;
                bHXVisualCenterItem.d = i;
                bHXVisualCenterItem.h = v3i.f(jpu.a(q0j.BIZ_CONTEXT_KEY_CARD_TYPE, cell.cardType));
                om1 om1Var = new om1();
                int[] iArr = this.f;
                om1Var.f25484a = iArr[0];
                om1Var.b = iArr[1];
                om1Var.c = viewGroup.getWidth();
                om1Var.d = viewGroup.getHeight();
                bHXVisualCenterItem.b = om1Var;
                bHXVisualCenterItem.c = s;
                arrayList.add(bHXVisualCenterItem);
            }
        }
        return arrayList;
    }

    public final om1 s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (om1) ipChange.ipc$dispatch("fcabbd07", new Object[]{this});
        }
        RecyclerView A2 = a().A2();
        ckf.d(A2);
        A2.getLocationOnScreen(this.f);
        om1 om1Var = new om1();
        int[] iArr = this.f;
        om1Var.f25484a = iArr[0];
        om1Var.b = iArr[1];
        om1Var.c = A2.getWidth();
        om1Var.d = A2.getHeight();
        return om1Var;
    }

    public final void t(List<? extends BHXVisualCenterItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b99001", new Object[]{this, list});
        } else if (o4p.l0()) {
            try {
                cqv.v(c2v.getInstance().getCurrentPageName(), list, this.e);
            } catch (Throwable unused) {
            }
            this.e = false;
        }
    }
}
