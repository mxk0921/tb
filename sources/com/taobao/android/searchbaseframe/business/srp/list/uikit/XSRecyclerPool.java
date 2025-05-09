package com.taobao.android.searchbaseframe.business.srp.list.uikit;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XSRecyclerPool extends RecyclerView.RecycledViewPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001672);
    }

    public static /* synthetic */ Object ipc$super(XSRecyclerPool xSRecyclerPool, String str, Object... objArr) {
        if (str.hashCode() == 180261328) {
            super.putRecycledView((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/srp/list/uikit/XSRecyclerPool");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe91d0", new Object[]{this, viewHolder});
            return;
        }
        try {
            int itemViewType = viewHolder.getItemViewType();
            int recycledViewCount = getRecycledViewCount(itemViewType);
            super.putRecycledView(viewHolder);
            if (getRecycledViewCount(itemViewType) <= recycledViewCount && (viewHolder instanceof WidgetViewHolder)) {
                ((WidgetViewHolder) viewHolder).destroyAndRemoveFromParent();
            }
        } catch (Throwable unused) {
        }
    }
}
