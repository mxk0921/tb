package com.taobao.android.searchbaseframe.business.srp.list.uikit;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import java.util.HashSet;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XSSuggestRecyclerPool extends RecyclerView.RecycledViewPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<Integer> f9333a = new HashSet();

    static {
        t2o.a(993001673);
    }

    public static /* synthetic */ Object ipc$super(XSSuggestRecyclerPool xSSuggestRecyclerPool, String str, Object... objArr) {
        if (str.hashCode() == 180261328) {
            super.putRecycledView((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/business/srp/list/uikit/XSSuggestRecyclerPool");
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
            if (itemViewType >= 20001 && !((HashSet) this.f9333a).contains(Integer.valueOf(itemViewType))) {
                setMaxRecycledViews(itemViewType, 20);
                ((HashSet) this.f9333a).add(Integer.valueOf(itemViewType));
            }
            int recycledViewCount = getRecycledViewCount(itemViewType);
            super.putRecycledView(viewHolder);
            if (getRecycledViewCount(itemViewType) <= recycledViewCount && (viewHolder instanceof WidgetViewHolder)) {
                ((WidgetViewHolder) viewHolder).destroyAndRemoveFromParent();
            }
        } catch (Throwable unused) {
        }
    }
}
