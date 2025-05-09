package com.taobao.search.searchdoor.sf.widgets.suggest.cells;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder;
import com.taobao.search.searchdoor.sf.widgets.activate.cells.WeexActivateCellViewHolder;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.WeexActivateCellBean;
import tb.ay4;
import tb.c2p;
import tb.p1p;
import tb.rg3;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WeexSuggestCellViewHolder extends WeexActivateCellViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int y = p1p.a(41.0f);
    public static final ay4<rg3.c, AbsWeexViewHolder> CREATOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ay4<rg3.c, AbsWeexViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public AbsWeexViewHolder<WeexActivateCellBean, c2p> a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AbsWeexViewHolder) ipChange.ipc$dispatch("b43207c5", new Object[]{this, cVar});
            }
            return new WeexSuggestCellViewHolder(cVar.f27354a, cVar.b, cVar.d, cVar.c, cVar.e, (c2p) cVar.f);
        }
    }

    static {
        t2o.a(815793278);
    }

    public WeexSuggestCellViewHolder(Activity activity, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i, c2p c2pVar) {
        super(activity, udeVar, listStyle, viewGroup, i, c2pVar);
    }

    public static /* synthetic */ Object ipc$super(WeexSuggestCellViewHolder weexSuggestCellViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/suggest/cells/WeexSuggestCellViewHolder");
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.cells.WeexActivateCellViewHolder, com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public int I0(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64038bb6", new Object[]{this, weexBean})).intValue();
        }
        return y;
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.cells.WeexActivateCellViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "WeexSuggestCellViewHolder";
    }
}
