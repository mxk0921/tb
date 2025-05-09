package com.taobao.uikit.feature.features.cellanimator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class RecyclerCellAnimatorAdapter extends RecyclerView.Adapter {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ALPHA = "alpha";
    private static final String SAVEDINSTANCESTATE_VIEWANIMATOR = "savedinstancestate_viewanimator";
    private RecyclerCellAnimatorController mCellAnimatorController;
    private RecyclerView.Adapter mDelegateAdapter;
    private boolean mIsRootAdapter;

    static {
        t2o.a(931135568);
    }

    public RecyclerCellAnimatorAdapter(RecyclerView.Adapter adapter) {
        this.mDelegateAdapter = adapter;
        this.mIsRootAdapter = true;
        if (adapter instanceof RecyclerCellAnimatorAdapter) {
            ((RecyclerCellAnimatorAdapter) adapter).mIsRootAdapter = false;
        }
        super.setHasStableIds(adapter.hasStableIds());
    }

    private void animateViewIfNecessary(int i, View view, ViewGroup viewGroup) {
        Animator[] animatorArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e4abe1", new Object[]{this, new Integer(i), view, viewGroup});
            return;
        }
        RecyclerView.Adapter adapter = this.mDelegateAdapter;
        if (adapter instanceof RecyclerCellAnimatorAdapter) {
            animatorArr = ((RecyclerCellAnimatorAdapter) adapter).getAnimators(viewGroup, view);
        } else {
            animatorArr = null;
        }
        Animator[] animators = getAnimators(viewGroup, view);
        if (animators != null || animatorArr != null) {
            this.mCellAnimatorController.animateViewIfNecessary(i, view, concatAnimators(animatorArr, animators, ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f)));
        }
    }

    public static Animator[] concatAnimators(Animator[] animatorArr, Animator[] animatorArr2, Animator animator) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator[]) ipChange.ipc$dispatch("58e6f8be", new Object[]{animatorArr, animatorArr2, animator});
        }
        if (animatorArr == null) {
            i = 0;
        } else {
            i = animatorArr.length;
        }
        if (animatorArr2 == null) {
            i2 = 0;
        } else {
            i2 = animatorArr2.length;
        }
        int i3 = i + i2;
        Animator[] animatorArr3 = new Animator[1 + i3];
        if (animatorArr != null && i > 0) {
            System.arraycopy(animatorArr, 0, animatorArr3, 0, i);
        }
        if (animatorArr2 != null && i2 > 0) {
            System.arraycopy(animatorArr2, 0, animatorArr3, i, i2);
        }
        animatorArr3[i3] = animator;
        return animatorArr3;
    }

    public static /* synthetic */ Object ipc$super(RecyclerCellAnimatorAdapter recyclerCellAnimatorAdapter, String str, Object... objArr) {
        if (str.hashCode() == -1614840632) {
            super.setHasStableIds(((Boolean) objArr[0]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/cellanimator/RecyclerCellAnimatorAdapter");
    }

    public abstract Animator[] getAnimators(ViewGroup viewGroup, View view);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.mDelegateAdapter.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return this.mDelegateAdapter.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mDelegateAdapter.getItemViewType(i);
    }

    public RecyclerCellAnimatorController getRecyclerCellAnimatorController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerCellAnimatorController) ipChange.ipc$dispatch("b437fea1", new Object[]{this});
        }
        return this.mCellAnimatorController;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        this.mDelegateAdapter.onBindViewHolder(viewHolder, i);
        if (this.mIsRootAdapter) {
            animateViewIfNecessary(i, viewHolder.itemView, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        return this.mDelegateAdapter.onCreateViewHolder(viewGroup, i);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            RecyclerCellAnimatorController recyclerCellAnimatorController = this.mCellAnimatorController;
            if (recyclerCellAnimatorController != null) {
                recyclerCellAnimatorController.onRestoreInstanceState(bundle.getParcelable(SAVEDINSTANCESTATE_VIEWANIMATOR));
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        RecyclerCellAnimatorController recyclerCellAnimatorController = this.mCellAnimatorController;
        if (recyclerCellAnimatorController != null) {
            bundle.putParcelable(SAVEDINSTANCESTATE_VIEWANIMATOR, recyclerCellAnimatorController.onSaveInstanceState());
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ede27e", new Object[]{this, viewHolder});
        } else {
            this.mDelegateAdapter.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19acd87b", new Object[]{this, viewHolder});
        } else {
            this.mDelegateAdapter.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
        } else {
            this.mDelegateAdapter.onViewRecycled(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544ebd79", new Object[]{this, adapterDataObserver});
        } else {
            this.mDelegateAdapter.registerAdapterDataObserver(adapterDataObserver);
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mCellAnimatorController.reset();
        RecyclerView.Adapter adapter = this.mDelegateAdapter;
        if (adapter instanceof RecyclerCellAnimatorAdapter) {
            ((RecyclerCellAnimatorAdapter) adapter).reset();
        }
    }

    public void setAnimatorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7372a661", new Object[]{this, new Boolean(z)});
            return;
        }
        RecyclerCellAnimatorController recyclerCellAnimatorController = this.mCellAnimatorController;
        if (recyclerCellAnimatorController != null) {
            recyclerCellAnimatorController.setAnimatorEnable(z);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbf7cc8", new Object[]{this, new Boolean(z)});
        } else {
            this.mDelegateAdapter.setHasStableIds(z);
        }
    }

    public void setRecyclerCellAnimatorController(RecyclerCellAnimatorController recyclerCellAnimatorController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da31c43", new Object[]{this, recyclerCellAnimatorController});
        } else {
            this.mCellAnimatorController = recyclerCellAnimatorController;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dceb252", new Object[]{this, adapterDataObserver});
        } else {
            this.mDelegateAdapter.unregisterAdapterDataObserver(adapterDataObserver);
        }
    }
}
