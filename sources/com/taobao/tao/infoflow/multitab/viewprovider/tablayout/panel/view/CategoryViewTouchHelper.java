package com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.view;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CategoryViewTouchHelper extends ItemTouchHelper.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PanelCategoryAdapter f12477a;

    static {
        t2o.a(729809557);
    }

    public CategoryViewTouchHelper(PanelCategoryAdapter panelCategoryAdapter) {
        this.f12477a = panelCategoryAdapter;
    }

    public static /* synthetic */ Object ipc$super(CategoryViewTouchHelper categoryViewTouchHelper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/tablayout/panel/view/CategoryViewTouchHelper");
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60866505", new Object[]{this, recyclerView, viewHolder})).intValue();
        }
        return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f34d69b", new Object[]{this})).booleanValue();
        }
        return this.f12477a.T();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ec6018c", new Object[]{this, recyclerView, viewHolder, viewHolder2})).booleanValue();
        }
        int layoutPosition = viewHolder.getLayoutPosition();
        int layoutPosition2 = viewHolder2.getLayoutPosition();
        PanelCategoryAdapter panelCategoryAdapter = this.f12477a;
        if (panelCategoryAdapter != null) {
            panelCategoryAdapter.d0(layoutPosition, layoutPosition2);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc91c0af", new Object[]{this, viewHolder, new Integer(i)});
        }
    }
}
