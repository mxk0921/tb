package com.taobao.ptr.views.abs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PtrBase;
import com.taobao.ptr.PtrLayout;
import com.taobao.ptr.PullBase;
import tb.l2n;
import tb.m2n;
import tb.n2n;
import tb.t2o;
import tb.v4n;
import tb.vrk;
import tb.xv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PtrListView extends ListView implements v4n, com.taobao.ptr.a, n2n, AbsListView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private l2n mDelegate;
    private View mEndView;
    private boolean mIsDisable;
    private boolean mLastItemVisible;
    private Drawable mLoadingDrawable;
    private m2n mLoadingHelper;
    private vrk mOnLastItemVisibleListener;
    private AbsListView.OnScrollListener mOnScrollListener;
    private ColorStateList mTextColor;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$ptr$PullBase$Mode;

        static {
            int[] iArr = new int[PullBase.Mode.values().length];
            $SwitchMap$com$taobao$ptr$PullBase$Mode = iArr;
            try {
                iArr[PullBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        t2o.a(632291373);
        t2o.a(632291347);
        t2o.a(632291341);
        t2o.a(632291346);
    }

    public PtrListView(Context context) {
        super(context);
        super.setOnScrollListener(this);
    }

    public static /* synthetic */ Object ipc$super(PtrListView ptrListView, String str, Object... objArr) {
        if (str.hashCode() == -1488275586) {
            super.setOnScrollListener((AbsListView.OnScrollListener) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/views/abs/PtrListView");
    }

    public final void disableEndPullFeature(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a378d3cf", new Object[]{this, new Boolean(z)});
        } else if (z) {
            onDisable();
        } else {
            onEnable();
        }
    }

    public final View getEndView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("16948b73", new Object[]{this});
        }
        return this.mEndView;
    }

    @Override // tb.v4n
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.ptr.a
    public int getReadyToRefreshingValue(PtrBase ptrBase, PullBase.Mode mode, int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d985a7f7", new Object[]{this, ptrBase, mode, new Integer(i)})).intValue();
        }
        if (a.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()] != 1 || i == 1 || (view = this.mEndView) == null) {
            return -1;
        }
        return view.getHeight();
    }

    @Override // com.taobao.ptr.a
    public int getReleaseTargetValue(PtrBase ptrBase, PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c4b782a", new Object[]{this, ptrBase, mode, new Integer(i)})).intValue();
        }
        if (a.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()] != 1) {
            return -1;
        }
        return 0;
    }

    public boolean isDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc8c8fe9", new Object[]{this})).booleanValue();
        }
        return this.mIsDisable;
    }

    public boolean isDisableIntrinsicPullFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155fa1b5", new Object[]{this})).booleanValue();
        }
        return isDisable();
    }

    @Override // tb.v4n
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue();
        }
        return xv.b(this);
    }

    @Override // tb.v4n
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue();
        }
        return xv.a(this);
    }

    @Override // tb.n2n
    public void onCompleteUpdate(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fc67cc", new Object[]{this, charSequence});
        } else if (this.mLoadingHelper != null && !isDisable()) {
            this.mLoadingHelper.onCompleteUpdate(charSequence);
        }
    }

    @Override // tb.n2n
    public void onDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d267c10", new Object[]{this});
            return;
        }
        this.mIsDisable = true;
        removeFooterView(this.mEndView);
        this.mEndView = null;
    }

    @Override // tb.n2n
    public void onEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e38fc9", new Object[]{this});
            return;
        }
        this.mIsDisable = false;
        onUpdateDirection(getPullDirection());
    }

    @Override // tb.n2n
    public void onFreeze(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2222633b", new Object[]{this, new Boolean(z), charSequence});
        } else if (this.mLoadingHelper != null && !isDisable()) {
            this.mLoadingHelper.onFreeze(z, charSequence);
        }
    }

    @Override // tb.n2n
    public void onPull(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
        } else if (this.mLoadingHelper != null && !isDisable()) {
            this.mLoadingHelper.onPull(f);
        }
    }

    @Override // tb.v4n
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        } else if (pullBase instanceof PtrBase) {
            PtrBase ptrBase = (PtrBase) pullBase;
            ptrBase.addEndPtrProxy(this);
            PtrLayout endLayout = ptrBase.getEndLayout();
            if (endLayout != null) {
                endLayout.disableIntrinsicPullFeature(true);
            }
            this.mLoadingHelper = new m2n(ptrBase.getEndLayout());
            setEndLoadingTextColor(this.mTextColor);
            setEndLoadingDrawable(this.mLoadingDrawable);
            setEndLoadingDelegate(this.mDelegate);
        }
    }

    @Override // tb.v4n
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        } else if (pullBase instanceof PtrBase) {
            PtrBase ptrBase = (PtrBase) pullBase;
            ptrBase.removeEndPtrProxy(this);
            removeFooterView(this.mEndView);
            this.mEndView = null;
            this.mLoadingHelper = null;
            ptrBase.getEndLayout().disableIntrinsicPullFeature(false);
        }
    }

    @Override // tb.n2n
    public void onRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def893ed", new Object[]{this});
        } else if (this.mLoadingHelper != null && !isDisable()) {
            this.mLoadingHelper.onRefreshing();
        }
    }

    @Override // tb.n2n
    public void onRelease(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd47c3f1", new Object[]{this, new Float(f)});
        } else if (this.mLoadingHelper != null && !isDisable()) {
            this.mLoadingHelper.onRelease(f);
        }
    }

    @Override // tb.n2n
    public void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
        } else if (this.mLoadingHelper != null && !isDisable()) {
            this.mLoadingHelper.onReset();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb0734b", new Object[]{this, absListView, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.mOnLastItemVisibleListener != null) {
            if (i3 > 0 && i + i2 >= i3 - 1) {
                z = true;
            }
            this.mLastItemVisible = z;
        }
        AbsListView.OnScrollListener onScrollListener = this.mOnScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        vrk vrkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532cfb08", new Object[]{this, absListView, new Integer(i)});
            return;
        }
        if (i == 0 && (vrkVar = this.mOnLastItemVisibleListener) != null && this.mLastItemVisible) {
            vrkVar.a();
        }
        AbsListView.OnScrollListener onScrollListener = this.mOnScrollListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
    }

    @Override // tb.n2n
    public void onUpdateDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e55ce5", new Object[]{this, new Integer(i)});
            return;
        }
        m2n m2nVar = this.mLoadingHelper;
        if (m2nVar != null) {
            if (m2nVar != null) {
                m2nVar.onUpdateDirection(i);
            }
            if (!isDisable()) {
                removeFooterView(this.mEndView);
                this.mEndView = null;
                m2n m2nVar2 = this.mLoadingHelper;
                if (m2nVar2 != null) {
                    View a2 = m2nVar2.a(this);
                    this.mEndView = a2;
                    if (a2 != null) {
                        addFooterView(a2);
                    }
                }
            }
        }
    }

    public final void setEndLoadingDelegate(l2n l2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea2efcb", new Object[]{this, l2nVar});
            return;
        }
        this.mDelegate = l2nVar;
        m2n m2nVar = this.mLoadingHelper;
        if (m2nVar != null) {
            m2nVar.e(l2nVar);
            onUpdateDirection(getPullDirection());
        }
    }

    public final void setEndLoadingDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba8e6cc", new Object[]{this, drawable});
            return;
        }
        this.mLoadingDrawable = drawable;
        m2n m2nVar = this.mLoadingHelper;
        if (m2nVar != null) {
            m2nVar.f(drawable);
        }
    }

    public final void setEndLoadingTextColor(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1eb5018", new Object[]{this, colorStateList});
            return;
        }
        this.mTextColor = colorStateList;
        m2n m2nVar = this.mLoadingHelper;
        if (m2nVar != null) {
            m2nVar.g(colorStateList);
        }
    }

    public final void setOnLastItemVisibleListener(vrk vrkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46e24b88", new Object[]{this, vrkVar});
        } else {
            this.mOnLastItemVisibleListener = vrkVar;
        }
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74ab77e", new Object[]{this, onScrollListener});
        } else {
            this.mOnScrollListener = onScrollListener;
        }
    }

    public PtrListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setOnScrollListener(this);
    }

    public PtrListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setOnScrollListener(this);
    }
}
