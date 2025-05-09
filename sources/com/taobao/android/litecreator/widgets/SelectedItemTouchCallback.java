package com.taobao.android.litecreator.widgets;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class SelectedItemTouchCallback extends ItemTouchHelper.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705709);
    }

    public static /* synthetic */ Object ipc$super(SelectedItemTouchCallback selectedItemTouchCallback, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -596902942) {
            super.clearView((RecyclerView) objArr[0], (RecyclerView.ViewHolder) objArr[1]);
            return null;
        } else if (hashCode == 1666624894) {
            super.onSelectedChanged((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1850426492) {
            super.onMoved((RecyclerView) objArr[0], (RecyclerView.ViewHolder) objArr[1], ((Number) objArr[2]).intValue(), (RecyclerView.ViewHolder) objArr[3], ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/litecreator/widgets/SelectedItemTouchCallback");
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5b6d866", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract void b(int i, int i2);

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6bfbe2", new Object[]{this, recyclerView, viewHolder});
            return;
        }
        super.clearView(recyclerView, viewHolder);
        if (a()) {
            viewHolder.itemView.setScaleX(1.0f);
            viewHolder.itemView.setScaleY(1.0f);
            viewHolder.itemView.setAlpha(1.0f);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60866505", new Object[]{this, recyclerView, viewHolder})).intValue();
        }
        return ItemTouchHelper.Callback.makeMovementFlags(12, 0);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f34d69b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ec6018c", new Object[]{this, recyclerView, viewHolder, viewHolder2})).booleanValue();
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4b447c", new Object[]{this, recyclerView, viewHolder, new Integer(i), viewHolder2, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onMoved(recyclerView, viewHolder, i, viewHolder2, i2, i3, i4);
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        recyclerView.getAdapter().notifyItemMoved(adapterPosition, adapterPosition2);
        b(adapterPosition, adapterPosition2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6356ad7e", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        if (i == 2 && a()) {
            viewHolder.itemView.setScaleX(1.2f);
            viewHolder.itemView.setScaleY(1.2f);
            viewHolder.itemView.setAlpha(1.0f);
        }
        super.onSelectedChanged(viewHolder, i);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc91c0af", new Object[]{this, viewHolder, new Integer(i)});
        }
    }
}
