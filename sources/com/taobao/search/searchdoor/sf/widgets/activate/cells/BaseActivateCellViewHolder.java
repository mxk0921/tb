package com.taobao.search.searchdoor.sf.widgets.activate.cells;

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
public abstract class BaseActivateCellViewHolder<BEAN extends ActivateTypedBean, MODEL extends c2p> extends WidgetViewHolder<BEAN, MODEL> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BEAN l;

    static {
        t2o.a(815793175);
    }

    public BaseActivateCellViewHolder(View view, Activity activity, ude udeVar, MODEL model) {
        super(view, activity, udeVar, ListStyle.LIST, 0, model);
    }

    public static /* synthetic */ Object ipc$super(BaseActivateCellViewHolder baseActivateCellViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/cells/BaseActivateCellViewHolder");
    }

    /* renamed from: G0 */
    public void u0(int i, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea1dc07", new Object[]{this, new Integer(i), bean});
            return;
        }
        try {
            this.l = bean;
            H0(i, bean);
        } catch (Throwable th) {
            c4p.o("BaseActivateCellWidget", "render error", th);
        }
    }

    public abstract void H0(int i, BEAN bean);

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "BaseActivateCellWidget";
    }
}
