package com.taobao.search.searchdoor.sf.widgets.suggest.cells;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.cells.MuiseActivateCellViewHolder;
import java.util.HashMap;
import tb.a07;
import tb.c2p;
import tb.ckf;
import tb.p1p;
import tb.r4p;
import tb.t2o;
import tb.ude;
import tb.xyd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class MuiseSuggestCellViewHolder extends MuiseActivateCellViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int LIST_STUB_HEIGHT = p1p.a(41.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815793275);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815793274);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MuiseSuggestCellViewHolder(Activity activity, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i, c2p c2pVar) {
        super(activity, udeVar, listStyle, viewGroup, i, c2pVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        ckf.g(listStyle, "style");
    }

    public static /* synthetic */ Object ipc$super(MuiseSuggestCellViewHolder muiseSuggestCellViewHolder, String str, Object... objArr) {
        if (str.hashCode() == -1416250663) {
            super.F1((HashMap) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/suggest/cells/MuiseSuggestCellViewHolder");
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.cells.MuiseActivateCellViewHolder
    public void F1(HashMap<String, Object> hashMap) {
        String str;
        SearchDoorContext a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab95bad9", new Object[]{this, hashMap});
            return;
        }
        ckf.g(hashMap, "status");
        super.F1(hashMap);
        hashMap.put("index", Integer.valueOf(getAdapterPosition()));
        c2p l0 = l0();
        if (l0 == null || (a2 = l0.a()) == null || (str = a2.l()) == null) {
            str = "";
        }
        hashMap.put("keyword", str);
        Activity activity = getActivity();
        ckf.f(activity, "getActivity(...)");
        hashMap.put(r4p.KEY_TB_2024, String.valueOf(xyd.a(activity)));
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.cells.MuiseActivateCellViewHolder, com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public int M0(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81ae34c", new Object[]{this, muiseBean})).intValue();
        }
        return LIST_STUB_HEIGHT;
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.cells.MuiseActivateCellViewHolder, com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder
    public void h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9a43b1", new Object[]{this});
            return;
        }
        this.itemView.getLayoutParams().height = this.itemView.getMeasuredHeight();
        k1(this.A, i0());
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.activate.cells.MuiseActivateCellViewHolder, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "MuiseSuggestCellViewHolder";
    }
}
