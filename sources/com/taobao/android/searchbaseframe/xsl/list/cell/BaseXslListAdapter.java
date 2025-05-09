package com.taobao.android.searchbaseframe.xsl.list.cell;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.acx;
import tb.asi;
import tb.dod;
import tb.o02;
import tb.t2o;
import tb.ude;
import tb.w02;
import tb.w7p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BaseXslListAdapter<MODEL extends acx<? extends o02<? extends BaseSearchResult, ?>>> extends BaseListAdapter<MODEL> implements dod {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int i = -1;
    public boolean j = false;

    static {
        t2o.a(993002039);
        t2o.a(993002096);
    }

    public BaseXslListAdapter(ListStyle listStyle, Activity activity, ude udeVar, MODEL model, int i) {
        super(listStyle, activity, udeVar, model, i);
        setHasStableIds(true);
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.taobao.android.searchbaseframe.xsl.list.cell.BaseXslListAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == -1172900388) {
                    super.onChanged();
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/list/cell/BaseXslListAdapter$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ba16f5dc", new Object[]{this});
                    return;
                }
                super.onChanged();
                BaseXslListAdapter.this.p0();
            }
        });
    }

    public static /* synthetic */ Object ipc$super(BaseXslListAdapter baseXslListAdapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2101947842:
                baseXslListAdapter.h0(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (TRecyclerView) objArr[2]);
                return null;
            case -1760699264:
                return new Integer(super.getItemCount());
            case -1524124872:
                super.onBindViewHolder((WidgetViewHolder) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -613321047:
                baseXslListAdapter.Z(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (TRecyclerView) objArr[2]);
                return null;
            case -284709802:
                super.M(((Number) objArr[0]).intValue(), (TRecyclerView) objArr[1]);
                return null;
            case 288455826:
                super.N(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (TRecyclerView) objArr[2]);
                return null;
            case 1142499695:
                baseXslListAdapter.O((TRecyclerView) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/list/cell/BaseXslListAdapter");
        }
    }

    @Override // tb.dod
    public boolean A(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f68f79e5", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (k0() && i >= 0 && i < getItemCount()) {
            return ((BaseCellBean) U(i)).isSection;
        }
        return false;
    }

    @Override // tb.dod
    public boolean E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68c45755", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!k0()) {
            return false;
        }
        BaseCellBean baseCellBean = (BaseCellBean) U(i);
        if (baseCellBean.isSection || baseCellBean.sectionPos >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public void M(int i, TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef07ac56", new Object[]{this, new Integer(i), tRecyclerView});
            return;
        }
        super.M(i, tRecyclerView);
        p0();
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    public void N(int i, int i2, TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11317c92", new Object[]{this, new Integer(i), new Integer(i2), tRecyclerView});
            return;
        }
        super.N(i, i2, tRecyclerView);
        p0();
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter, com.taobao.android.searchbaseframe.list.AbsListAdapter
    /* renamed from: c0 */
    public void onBindViewHolder(WidgetViewHolder widgetViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a527b338", new Object[]{this, widgetViewHolder, new Integer(i)});
        } else if (A(i)) {
            o0(widgetViewHolder);
        } else {
            if (widgetViewHolder.itemView.getLayoutParams() != null && widgetViewHolder.itemView.getLayoutParams().height == 0) {
                widgetViewHolder.itemView.getLayoutParams().height = -2;
                widgetViewHolder.itemView.requestLayout();
            }
            super.onBindViewHolder(widgetViewHolder, i);
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.list.XSmoothScroller.b
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11842396", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        int itemCount = super.getItemCount();
        int i = this.i;
        if (i < 0) {
            return itemCount;
        }
        if (i >= itemCount - 1) {
            return itemCount;
        }
        return i + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        Object U = U(i);
        if (U == null) {
            return -1L;
        }
        return U.hashCode();
    }

    @Override // tb.dod
    public boolean j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74a0f03e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == getItemCount() - 1) {
            return true;
        }
        return false;
    }

    @Override // tb.dod
    public boolean k(int i) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b5c4b7d", new Object[]{this, new Integer(i)})).booleanValue();
        }
        BaseCellBean t = t(i);
        if (t instanceof MuiseCellBean) {
            obj = ((MuiseCellBean) t).mExtraObj.get("fullSpan");
        } else {
            obj = null;
        }
        if (t.comboFullSpan || t.isSection || t.isFullspan) {
            return true;
        }
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            return true;
        }
        asi asiVar = t.combo;
        if (asiVar == null || asiVar.p() != ListStyle.LIST) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter
    public WidgetViewHolder l0(w02 w02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("dc03348f", new Object[]{this, w02Var});
        }
        return null;
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter
    public WidgetViewHolder m0(w02 w02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("184faa8b", new Object[]{this, w02Var});
        }
        return null;
    }

    public final void n0(int i, BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a9eeaa", new Object[]{this, new Integer(i), baseCellBean});
        } else if (this.i < 0 && baseCellBean.barrier) {
            this.i = i;
        }
    }

    public final void o0(WidgetViewHolder widgetViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fade3fed", new Object[]{this, widgetViewHolder});
            return;
        }
        ViewGroup.LayoutParams layoutParams = widgetViewHolder.itemView.getLayoutParams();
        if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
        }
        ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        layoutParams.height = 0;
        widgetViewHolder.itemView.setLayoutParams(layoutParams);
    }

    @Override // tb.dod
    public BaseCellBean p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("850e8f0d", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        BaseCellBean baseCellBean = (BaseCellBean) U(i);
        if (baseCellBean.isSection) {
            return baseCellBean;
        }
        return (BaseCellBean) U(baseCellBean.sectionPos);
    }

    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7e9a740", new Object[]{this});
        } else if (!k0()) {
            r0();
        } else {
            this.i = -1;
            int itemCount = super.getItemCount();
            BaseCellBean baseCellBean = null;
            w7p w7pVar = null;
            int i = -1;
            for (int i2 = 0; i2 < itemCount; i2++) {
                BaseCellBean baseCellBean2 = (BaseCellBean) U(i2);
                n0(i2, baseCellBean2);
                baseCellBean2.sectionPos = -1;
                if (baseCellBean2.isSection) {
                    baseCellBean2.nextSectionPos = -1;
                    if (baseCellBean != null) {
                        baseCellBean.nextSectionPos = i2;
                    }
                    baseCellBean2.sectionPos = i2;
                    w7pVar = baseCellBean2.ownedSectionStyle;
                    i = i2;
                    baseCellBean = baseCellBean2;
                } else if (baseCellBean != null) {
                    baseCellBean2.sectionPos = i;
                    baseCellBean2.ownedSectionStyle = w7pVar;
                } else {
                    baseCellBean2.ownedSectionStyle = null;
                }
            }
            q0();
        }
    }

    public final void q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e139c17b", new Object[]{this});
            return;
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) W()).e().getTotalSearchResult();
        if (baseSearchResult != null && this.i < 0) {
            baseSearchResult.setHasBarrier(false);
        }
    }

    @Override // tb.dod
    public w7p r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w7p) ipChange.ipc$dispatch("426b5489", new Object[]{this, new Integer(i)});
        }
        if (i >= getItemCount()) {
            return null;
        }
        Object U = U(i);
        if (U instanceof BaseCellBean) {
            return ((BaseCellBean) U).ownedSectionStyle;
        }
        return null;
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4794b", new Object[]{this});
            return;
        }
        this.i = -1;
        BaseSearchResult baseSearchResult = (BaseSearchResult) ((acx) W()).e().getTotalSearchResult();
        if (baseSearchResult != null) {
            if (baseSearchResult.hasBarrier()) {
                int itemCount = super.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    BaseCellBean baseCellBean = (BaseCellBean) U(i);
                    n0(i, baseCellBean);
                    if (baseCellBean.barrier) {
                        break;
                    }
                }
            }
            q0();
        }
    }

    @Override // tb.dod
    public void s(WidgetViewHolder widgetViewHolder, int i, BaseCellBean baseCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9390002", new Object[]{this, widgetViewHolder, new Integer(i), baseCellBean});
        } else if (baseCellBean != null && baseCellBean.isSection) {
            widgetViewHolder.b0(i, baseCellBean);
        }
    }

    @Override // tb.dod
    public BaseCellBean t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("5af16ff4", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return (BaseCellBean) U(i);
    }

    @Override // tb.dod
    public WidgetViewHolder x(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("6e547ce5", new Object[]{this, viewGroup, new Integer(i)});
        }
        return createViewHolder(viewGroup, i);
    }
}
