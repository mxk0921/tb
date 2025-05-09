package com.taobao.search.searchdoor.sf.widgets.suggest.cells;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import tb.c2p;
import tb.c4p;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BaseSuggestCellWidget extends WidgetViewHolder<ActivateTypedBean, c2p> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793273);
    }

    public BaseSuggestCellWidget(View view, Activity activity, ude udeVar, c2p c2pVar) {
        super(view, activity, udeVar, ListStyle.LIST, 0, c2pVar);
    }

    public static /* synthetic */ Object ipc$super(BaseSuggestCellWidget baseSuggestCellWidget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/suggest/cells/BaseSuggestCellWidget");
    }

    /* renamed from: G0 */
    public void u0(int i, ActivateTypedBean activateTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea1dc07", new Object[]{this, new Integer(i), activateTypedBean});
            return;
        }
        try {
            H0(i, activateTypedBean);
        } catch (Throwable th) {
            c4p.o("BaseSuggestCellWidget", "render error", th);
        }
    }

    public void H0(int i, ActivateTypedBean activateTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103d56ed", new Object[]{this, new Integer(i), activateTypedBean});
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "BaseSuggestCellWidget";
    }
}
