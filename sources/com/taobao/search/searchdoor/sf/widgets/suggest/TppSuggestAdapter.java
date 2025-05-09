package com.taobao.search.searchdoor.sf.widgets.suggest;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.base.SearchDoorAdapter;
import com.taobao.search.searchdoor.sf.widgets.suggest.cells.MuiseSuggestCellViewHolder;
import com.taobao.search.searchdoor.sf.widgets.suggest.cells.WeexSuggestCellViewHolder;
import tb.c2p;
import tb.rg3;
import tb.s1p;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TppSuggestAdapter<MODEL extends c2p> extends SearchDoorAdapter<MODEL, ActivateTypedBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793272);
    }

    public TppSuggestAdapter(Activity activity, ude udeVar, MODEL model) {
        super(s1p.c().d(), ListStyle.LIST, activity, udeVar, model);
    }

    public static /* synthetic */ Object ipc$super(TppSuggestAdapter tppSuggestAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/suggest/TppSuggestAdapter");
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.base.SearchDoorAdapter, com.taobao.android.searchbaseframe.list.AbsListAdapter
    public WidgetViewHolder P(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetViewHolder) ipChange.ipc$dispatch("771e3c5f", new Object[]{this, viewGroup});
        }
        return new MuiseSuggestCellViewHolder(S(), X(), g(), viewGroup, T(), (c2p) W());
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.base.SearchDoorAdapter
    /* renamed from: k0 */
    public AbsWeexViewHolder Q(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsWeexViewHolder) ipChange.ipc$dispatch("3f34eb5f", new Object[]{this, viewGroup});
        }
        rg3.c cVar = new rg3.c();
        cVar.f27354a = S();
        cVar.f = W();
        cVar.e = T();
        cVar.d = g();
        cVar.b = X();
        cVar.c = viewGroup;
        return WeexSuggestCellViewHolder.CREATOR.a(cVar);
    }
}
