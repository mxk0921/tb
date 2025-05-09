package com.taobao.uikit.feature.features.cellanimator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class CellAnimatorAdapter extends BaseAdapter {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ALPHA = "alpha";
    private static final String SAVEDINSTANCESTATE_VIEWANIMATOR = "savedinstancestate_viewanimator";
    private CellAnimatorController mCellAnimatorController;
    private BaseAdapter mDelegateAdapter;
    private boolean mIsRootAdapter;

    static {
        t2o.a(931135566);
    }

    public CellAnimatorAdapter(BaseAdapter baseAdapter) {
        this.mDelegateAdapter = baseAdapter;
        this.mIsRootAdapter = true;
        if (baseAdapter instanceof CellAnimatorAdapter) {
            ((CellAnimatorAdapter) baseAdapter).mIsRootAdapter = false;
        }
    }

    private void animateViewIfNecessary(int i, View view, ViewGroup viewGroup) {
        Animator[] animatorArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e4abe1", new Object[]{this, new Integer(i), view, viewGroup});
            return;
        }
        BaseAdapter baseAdapter = this.mDelegateAdapter;
        if (baseAdapter instanceof CellAnimatorAdapter) {
            animatorArr = ((CellAnimatorAdapter) baseAdapter).getAnimators(viewGroup, view);
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

    public static /* synthetic */ Object ipc$super(CellAnimatorAdapter cellAnimatorAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/cellanimator/CellAnimatorAdapter");
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c9bb039", new Object[]{this})).booleanValue();
        }
        return this.mDelegateAdapter.areAllItemsEnabled();
    }

    public abstract Animator[] getAnimators(ViewGroup viewGroup, View view);

    public CellAnimatorController getCellAnimatorController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CellAnimatorController) ipChange.ipc$dispatch("78cb8d81", new Object[]{this});
        }
        return this.mCellAnimatorController;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        return this.mDelegateAdapter.getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        return this.mDelegateAdapter.getItem(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return this.mDelegateAdapter.getItemId(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mDelegateAdapter.getItemViewType(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        View view2 = this.mDelegateAdapter.getView(i, view, viewGroup);
        if (this.mIsRootAdapter) {
            animateViewIfNecessary(i, view2, viewGroup);
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue();
        }
        return this.mDelegateAdapter.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35312b0e", new Object[]{this})).booleanValue();
        }
        return this.mDelegateAdapter.hasStableIds();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return this.mDelegateAdapter.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8714c709", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.mDelegateAdapter.isEnabled(i);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eee9a4ec", new Object[]{this});
        } else {
            this.mDelegateAdapter.notifyDataSetChanged();
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("809705c1", new Object[]{this});
        } else {
            this.mDelegateAdapter.notifyDataSetInvalidated();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            CellAnimatorController cellAnimatorController = this.mCellAnimatorController;
            if (cellAnimatorController != null) {
                cellAnimatorController.onRestoreInstanceState(bundle.getParcelable(SAVEDINSTANCESTATE_VIEWANIMATOR));
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        CellAnimatorController cellAnimatorController = this.mCellAnimatorController;
        if (cellAnimatorController != null) {
            bundle.putParcelable(SAVEDINSTANCESTATE_VIEWANIMATOR, cellAnimatorController.onSaveInstanceState());
        }
        return bundle;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63701d27", new Object[]{this, dataSetObserver});
        } else {
            this.mDelegateAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mCellAnimatorController.reset();
        BaseAdapter baseAdapter = this.mDelegateAdapter;
        if (baseAdapter instanceof CellAnimatorAdapter) {
            ((CellAnimatorAdapter) baseAdapter).reset();
        }
    }

    public void setAnimatorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7372a661", new Object[]{this, new Boolean(z)});
            return;
        }
        CellAnimatorController cellAnimatorController = this.mCellAnimatorController;
        if (cellAnimatorController != null) {
            cellAnimatorController.setAnimatorEnable(z);
        }
    }

    public void setCellAnimatorController(CellAnimatorController cellAnimatorController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc3d941", new Object[]{this, cellAnimatorController});
        } else {
            this.mCellAnimatorController = cellAnimatorController;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66db852e", new Object[]{this, dataSetObserver});
        } else {
            this.mDelegateAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
