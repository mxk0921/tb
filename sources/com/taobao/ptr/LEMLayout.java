package com.taobao.ptr;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class LEMLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String STATE_LEM_STATE = "lem_state";
    private static final String STATE_SUPER = "lem_super";
    private View mContentView;
    private int mEmptyResId;
    private View mEmptyView;
    private int mErrorResId;
    private View mErrorView;
    private LemState mLemState = LemState.getDefault();
    private int mLoadingResId;
    private View mLoadingView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum LemState {
        LOADING(0),
        ERROR(1),
        EMPTY(2),
        CONTENT(3);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int mIntValue;

        LemState(int i) {
            this.mIntValue = i;
        }

        public static boolean AbnormalState(LemState lemState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1919edbe", new Object[]{lemState})).booleanValue();
            }
            if (lemState == null || lemState.getIntValue() >= CONTENT.getIntValue()) {
                return false;
            }
            return true;
        }

        public static LemState getDefault() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LemState) ipChange.ipc$dispatch("aeaf1ccc", new Object[0]);
            }
            return CONTENT;
        }

        public static /* synthetic */ Object ipc$super(LemState lemState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/LEMLayout$LemState");
        }

        public static LemState mapIntToValue(int i) {
            LemState[] values;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LemState) ipChange.ipc$dispatch("f8abaff3", new Object[]{new Integer(i)});
            }
            for (LemState lemState : values()) {
                if (i == lemState.getIntValue()) {
                    return lemState;
                }
            }
            return getDefault();
        }

        public static LemState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LemState) ipChange.ipc$dispatch("ba7b09b3", new Object[]{str});
            }
            return (LemState) Enum.valueOf(LemState.class, str);
        }

        public int getIntValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7e178cb2", new Object[]{this})).intValue();
            }
            return this.mIntValue;
        }
    }

    static {
        t2o.a(632291330);
    }

    public LEMLayout(Context context) {
        super(context);
        init(context, null);
    }

    private void checkChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24376977", new Object[]{this, view});
        } else if (view != this.mLoadingView && view != this.mEmptyView && view != this.mErrorView) {
            if (getChildCount() <= 0) {
                this.mContentView = view;
                return;
            }
            throw new IllegalStateException("LEMLayout can host only one direct child");
        }
    }

    private void inflateEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a467c10d", new Object[]{this});
        } else if (this.mEmptyView == null && this.mEmptyResId > 0) {
            this.mEmptyView = LayoutInflater.from(getContext()).inflate(this.mEmptyResId, (ViewGroup) this, false);
        }
    }

    private void inflateError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf3848", new Object[]{this});
        } else if (this.mErrorView == null && this.mErrorResId > 0) {
            this.mErrorView = LayoutInflater.from(getContext()).inflate(this.mErrorResId, (ViewGroup) this, false);
        }
    }

    private void inflateLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1886033c", new Object[]{this});
        } else if (this.mLoadingView == null && this.mLoadingResId > 0) {
            this.mLoadingView = LayoutInflater.from(getContext()).inflate(this.mLoadingResId, (ViewGroup) this, false);
        }
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LEMLayout);
        int i = R.styleable.LEMLayout_lemLayoutLoading;
        if (obtainStyledAttributes.hasValue(i)) {
            this.mLoadingResId = obtainStyledAttributes.getResourceId(i, 0);
        }
        int i2 = R.styleable.LEMLayout_lemLayoutEmpty;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.mEmptyResId = obtainStyledAttributes.getResourceId(i2, 0);
        }
        int i3 = R.styleable.LEMLayout_lemLayoutError;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.mErrorResId = obtainStyledAttributes.getResourceId(i3, 0);
        }
        int i4 = R.styleable.LEMLayout_lemLayoutState;
        if (obtainStyledAttributes.hasValue(i4)) {
            setState(LemState.mapIntToValue(obtainStyledAttributes.getInteger(i4, LemState.getDefault().getIntValue())));
        }
    }

    private void initAndHideEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941bdccb", new Object[]{this});
            return;
        }
        inflateEmpty();
        superAddView(this.mEmptyView);
        hideView(this.mEmptyView);
    }

    private void initAndHideError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc635406", new Object[]{this});
            return;
        }
        inflateError();
        superAddView(this.mErrorView);
        hideView(this.mErrorView);
    }

    private void initAndHideLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba2277a", new Object[]{this});
            return;
        }
        inflateLoading();
        superAddView(this.mLoadingView);
        hideView(this.mLoadingView);
    }

    public static /* synthetic */ Object ipc$super(LEMLayout lEMLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1557272881:
                super.onViewRemoved((View) objArr[0]);
                return null;
            case -1556944264:
                super.addView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -572887227:
                super.addView((View) objArr[0]);
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 1361193775:
                super.onViewAdded((View) objArr[0]);
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/LEMLayout");
        }
    }

    private void showContentViewInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda1bae5", new Object[]{this});
        } else {
            showContent();
        }
    }

    private void showEmptyViewInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6e1879", new Object[]{this});
        } else if (this.mContentView != null) {
            inflateEmpty();
            superAddView(this.mEmptyView);
            showEmpty();
        }
    }

    private void showErrorViewInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606d8f34", new Object[]{this});
        } else if (this.mContentView != null) {
            inflateError();
            superAddView(this.mErrorView);
            showError();
        }
    }

    private void showLoadingViewInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("798781a8", new Object[]{this});
        } else if (this.mContentView != null) {
            inflateLoading();
            superAddView(this.mLoadingView);
            showLoading();
        }
    }

    private void superAddView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c61a0", new Object[]{this, view});
        } else if (view != null && view.getParent() == null) {
            super.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
            return;
        }
        checkChild(view);
        super.addView(view);
    }

    public final View getEmptyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e61312e5", new Object[]{this});
        }
        return this.mEmptyView;
    }

    public final View getErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f6c59be0", new Object[]{this});
        }
        return this.mErrorView;
    }

    public final LemState getLemState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LemState) ipChange.ipc$dispatch("7712b114", new Object[]{this});
        }
        return this.mLemState;
    }

    public final View getLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dc3c0794", new Object[]{this});
        }
        return this.mLoadingView;
    }

    public final void hideView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a22e04", new Object[]{this, view});
        } else if (view != null && view.getParent() == this && view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setState(LemState.mapIntToValue(bundle.getInt(STATE_LEM_STATE, LemState.getDefault().getIntValue())));
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER));
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        bundle.putInt(STATE_LEM_STATE, this.mLemState.getIntValue());
        bundle.putParcelable(STATE_SUPER, super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51222b2f", new Object[]{this, view});
            return;
        }
        super.onViewAdded(view);
        if (view != null && view == this.mContentView) {
            initAndHideLoading();
            initAndHideEmpty();
            initAndHideError();
            setState(getLemState());
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32de6cf", new Object[]{this, view});
            return;
        }
        super.onViewRemoved(view);
        if (view != null && view == this.mContentView) {
            removeAllViews();
            this.mContentView = null;
        }
    }

    public final void setEmptyView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e28f9b", new Object[]{this, view});
            return;
        }
        View view2 = this.mEmptyView;
        if (!(view2 == null || view2 == view)) {
            removeView(view2);
        }
        this.mEmptyView = view;
        if (getLemState() == LemState.EMPTY) {
            showEmptyViewInternal();
        }
    }

    public final void setErrorView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36812600", new Object[]{this, view});
            return;
        }
        View view2 = this.mErrorView;
        if (!(view2 == null || view2 == view)) {
            removeView(view2);
        }
        this.mErrorView = view;
        if (getLemState() == LemState.ERROR) {
            showErrorViewInternal();
        }
    }

    public final void setLoadingView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198d1dcc", new Object[]{this, view});
            return;
        }
        View view2 = this.mLoadingView;
        if (!(view2 == null || view2 == view)) {
            removeView(view2);
        }
        this.mLoadingView = view;
        if (getLemState() == LemState.LOADING) {
            showLoadingViewInternal();
        }
    }

    public final void setState(LemState lemState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cf4ab4", new Object[]{this, lemState});
            return;
        }
        this.mLemState = lemState;
        if (lemState == LemState.CONTENT) {
            showContentViewInternal();
        } else if (lemState == LemState.EMPTY) {
            showEmptyViewInternal();
        } else if (lemState == LemState.ERROR) {
            showErrorViewInternal();
        } else if (lemState == LemState.LOADING) {
            showLoadingViewInternal();
        }
    }

    public void showContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a33d143", new Object[]{this});
            return;
        }
        hideView(this.mLoadingView);
        hideView(this.mEmptyView);
        hideView(this.mErrorView);
        showView(this.mContentView);
    }

    public final void showContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af80d788", new Object[]{this});
        } else {
            setState(LemState.CONTENT);
        }
    }

    public void showEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8510ecd7", new Object[]{this});
            return;
        }
        hideView(this.mLoadingView);
        hideView(this.mErrorView);
        hideView(this.mContentView);
        showView(this.mEmptyView);
    }

    public final void showEmptyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987e091c", new Object[]{this});
        } else {
            setState(LemState.EMPTY);
        }
    }

    public void showError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed586412", new Object[]{this});
            return;
        }
        hideView(this.mLoadingView);
        hideView(this.mEmptyView);
        hideView(this.mContentView);
        showView(this.mErrorView);
    }

    public final void showErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15716ad7", new Object[]{this});
        } else {
            setState(LemState.ERROR);
        }
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        hideView(this.mEmptyView);
        hideView(this.mErrorView);
        hideView(this.mContentView);
        showView(this.mLoadingView);
    }

    public final void showLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f114b", new Object[]{this});
        } else {
            setState(LemState.LOADING);
        }
    }

    public final void showView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed177369", new Object[]{this, view});
        } else if (view != null && view.getParent() == this && view.getVisibility() == 8) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
            return;
        }
        checkChild(view);
        super.addView(view, i);
    }

    public LEMLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a332ea78", new Object[]{this, view, layoutParams});
            return;
        }
        checkChild(view);
        super.addView(view, layoutParams);
    }

    public LEMLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        checkChild(view);
        super.addView(view, i, layoutParams);
    }
}
