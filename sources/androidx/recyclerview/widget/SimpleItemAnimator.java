package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class SimpleItemAnimator extends RecyclerView.ItemAnimator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    public boolean mSupportsChangeAnimations = true;

    public static /* synthetic */ Object ipc$super(SimpleItemAnimator simpleItemAnimator, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/recyclerview/widget/SimpleItemAnimator");
    }

    public abstract boolean animateAdd(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateAppearance(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5298854", new Object[]{this, viewHolder, itemHolderInfo, itemHolderInfo2})).booleanValue();
        }
        if (itemHolderInfo == null || ((i = itemHolderInfo.left) == (i2 = itemHolderInfo2.left) && itemHolderInfo.top == itemHolderInfo2.top)) {
            return animateAdd(viewHolder);
        }
        return animateMove(viewHolder, i, itemHolderInfo.top, i2, itemHolderInfo2.top);
    }

    public abstract boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c6989c4", new Object[]{this, viewHolder, viewHolder2, itemHolderInfo, itemHolderInfo2})).booleanValue();
        }
        int i3 = itemHolderInfo.left;
        int i4 = itemHolderInfo.top;
        if (viewHolder2.shouldIgnore()) {
            int i5 = itemHolderInfo.left;
            i = itemHolderInfo.top;
            i2 = i5;
        } else {
            i2 = itemHolderInfo2.left;
            i = itemHolderInfo2.top;
        }
        return animateChange(viewHolder, viewHolder2, i3, i4, i2, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animateDisappearance(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("231e3040", new Object[]{this, viewHolder, itemHolderInfo, itemHolderInfo2})).booleanValue();
        }
        int i3 = itemHolderInfo.left;
        int i4 = itemHolderInfo.top;
        View view = viewHolder.itemView;
        if (itemHolderInfo2 == null) {
            i = view.getLeft();
        } else {
            i = itemHolderInfo2.left;
        }
        if (itemHolderInfo2 == null) {
            i2 = view.getTop();
        } else {
            i2 = itemHolderInfo2.top;
        }
        if (viewHolder.isRemoved() || (i3 == i && i4 == i2)) {
            return animateRemove(viewHolder);
        }
        view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
        return animateMove(viewHolder, i3, i4, i, i2);
    }

    public abstract boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean animatePersistence(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adc2322d", new Object[]{this, viewHolder, itemHolderInfo, itemHolderInfo2})).booleanValue();
        }
        int i = itemHolderInfo.left;
        int i2 = itemHolderInfo2.left;
        if (i != i2 || itemHolderInfo.top != itemHolderInfo2.top) {
            return animateMove(viewHolder, i, itemHolderInfo.top, i2, itemHolderInfo2.top);
        }
        dispatchMoveFinished(viewHolder);
        return false;
    }

    public abstract boolean animateRemove(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6691497", new Object[]{this, viewHolder})).booleanValue();
        }
        if (!this.mSupportsChangeAnimations || viewHolder.isInvalid()) {
            return true;
        }
        return false;
    }

    public final void dispatchAddFinished(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc35104", new Object[]{this, viewHolder});
            return;
        }
        onAddFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchAddStarting(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347d7352", new Object[]{this, viewHolder});
        } else {
            onAddStarting(viewHolder);
        }
    }

    public final void dispatchChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1801486d", new Object[]{this, viewHolder, new Boolean(z)});
            return;
        }
        onChangeFinished(viewHolder, z);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778b6fdf", new Object[]{this, viewHolder, new Boolean(z)});
        } else {
            onChangeStarting(viewHolder, z);
        }
    }

    public final void dispatchMoveFinished(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cfcda8", new Object[]{this, viewHolder});
            return;
        }
        onMoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchMoveStarting(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3189eff6", new Object[]{this, viewHolder});
        } else {
            onMoveStarting(viewHolder);
        }
    }

    public final void dispatchRemoveFinished(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5f331b", new Object[]{this, viewHolder});
            return;
        }
        onRemoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public final void dispatchRemoveStarting(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26195569", new Object[]{this, viewHolder});
        } else {
            onRemoveStarting(viewHolder);
        }
    }

    public boolean getSupportsChangeAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("312c6164", new Object[]{this})).booleanValue();
        }
        return this.mSupportsChangeAnimations;
    }

    public void onAddFinished(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede046bf", new Object[]{this, viewHolder});
        }
    }

    public void onAddStarting(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859a690d", new Object[]{this, viewHolder});
        }
    }

    public void onChangeFinished(RecyclerView.ViewHolder viewHolder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6e8a8", new Object[]{this, viewHolder, new Boolean(z)});
        }
    }

    public void onChangeStarting(RecyclerView.ViewHolder viewHolder, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6171101a", new Object[]{this, viewHolder, new Boolean(z)});
        }
    }

    public void onMoveFinished(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c518f4d", new Object[]{this, viewHolder});
        }
    }

    public void onMoveStarting(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40bb19b", new Object[]{this, viewHolder});
        }
    }

    public void onRemoveFinished(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7771f80", new Object[]{this, viewHolder});
        }
    }

    public void onRemoveStarting(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3141ce", new Object[]{this, viewHolder});
        }
    }

    public void setSupportsChangeAnimations(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a37be8", new Object[]{this, new Boolean(z)});
        } else {
            this.mSupportsChangeAnimations = z;
        }
    }
}
