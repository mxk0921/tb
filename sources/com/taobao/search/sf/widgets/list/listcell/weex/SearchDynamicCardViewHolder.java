package com.taobao.search.sf.widgets.list.listcell.weex;

import android.app.Activity;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import tb.b64;
import tb.ckf;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SearchDynamicCardViewHolder extends SearchListWeexCellViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793656);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchDynamicCardViewHolder(Activity activity, b64 b64Var, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i) {
        super(activity, b64Var, udeVar, listStyle, viewGroup, i);
        ckf.g(activity, "activity");
        ckf.g(b64Var, "modelAdapter");
        ckf.g(udeVar, a.MSG_SOURCE_PARENT);
        ckf.g(listStyle, "style");
    }

    public static /* synthetic */ Object ipc$super(SearchDynamicCardViewHolder searchDynamicCardViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/listcell/weex/SearchDynamicCardViewHolder");
    }

    @Override // com.taobao.android.xsearchplugin.weex.biz.srp.BaseSrpListWeexCellViewHolder, com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public int I0(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64038bb6", new Object[]{this, weexBean})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.android.xsearchplugin.weex.biz.srp.BaseSrpListWeexCellViewHolder, com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public int K0(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fef46e7", new Object[]{this, weexBean})).intValue();
        }
        return 0;
    }
}
