package com.taobao.android.searchbaseframe.meta.list;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.list.cell.BaseXslListAdapter;
import com.taobao.uikit.feature.view.TRecyclerView;
import tb.acx;
import tb.o02;
import tb.t2o;
import tb.ude;
import tb.upk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BaseMetaListAdapter<MODEL extends acx<? extends o02<? extends BaseSearchResult, ?>>> extends BaseXslListAdapter<MODEL> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public upk k;

    static {
        t2o.a(993001846);
    }

    public BaseMetaListAdapter(ListStyle listStyle, Activity activity, ude udeVar, MODEL model, int i) {
        super(listStyle, activity, udeVar, model, i);
    }

    public static /* synthetic */ Object ipc$super(BaseMetaListAdapter baseMetaListAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1524124872) {
            super.onBindViewHolder((WidgetViewHolder) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == -284709802) {
            super.M(((Number) objArr[0]).intValue(), (TRecyclerView) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/searchbaseframe/meta/list/BaseMetaListAdapter");
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.list.cell.BaseXslListAdapter, com.taobao.android.searchbaseframe.list.AbsListAdapter
    public void M(int i, TRecyclerView tRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef07ac56", new Object[]{this, new Integer(i), tRecyclerView});
            return;
        }
        int i2 = this.i;
        if (i2 < 0) {
            super.M(i, tRecyclerView);
        } else {
            notifyItemRangeInserted(i2, i);
        }
        p0();
    }

    @Override // com.taobao.android.searchbaseframe.xsl.list.cell.BaseXslListAdapter, com.taobao.android.searchbaseframe.business.common.list.BaseListAdapter, com.taobao.android.searchbaseframe.list.AbsListAdapter
    /* renamed from: c0 */
    public void onBindViewHolder(WidgetViewHolder widgetViewHolder, int i) {
        upk upkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a527b338", new Object[]{this, widgetViewHolder, new Integer(i)});
            return;
        }
        super.onBindViewHolder(widgetViewHolder, i);
        if (!this.j && (upkVar = this.k) != null) {
            upkVar.T(t(i), i);
        }
    }

    public void s0(upk upkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53fa5d1e", new Object[]{this, upkVar});
        } else {
            this.k = upkVar;
        }
    }
}
