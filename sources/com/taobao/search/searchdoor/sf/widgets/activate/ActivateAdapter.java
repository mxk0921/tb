package com.taobao.search.searchdoor.sf.widgets.activate;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.base.SearchDoorAdapter;
import tb.c2p;
import tb.s1p;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ActivateAdapter<MODEL extends c2p> extends SearchDoorAdapter<MODEL, ActivateTypedBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793141);
    }

    public ActivateAdapter(Activity activity, ude udeVar, MODEL model) {
        super(s1p.c().a(), ListStyle.LIST, activity, udeVar, model);
    }

    public static /* synthetic */ Object ipc$super(ActivateAdapter activateAdapter, String str, Object... objArr) {
        if (str.hashCode() == -1524124872) {
            super.onBindViewHolder((WidgetViewHolder) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/ActivateAdapter");
    }

    @Override // com.taobao.android.searchbaseframe.list.AbsListAdapter
    /* renamed from: c0 */
    public void onBindViewHolder(WidgetViewHolder widgetViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a527b338", new Object[]{this, widgetViewHolder, new Integer(i)});
        } else {
            super.onBindViewHolder(widgetViewHolder, i);
        }
    }
}
