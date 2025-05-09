package com.taobao.ptr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import tb.l2n;
import tb.m2n;
import tb.n2n;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PtrLayout extends PullLayout implements n2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private m2n mHelper;
    private View mInnerParent;
    private boolean mIsDisable;
    private Drawable mLoadingDrawable;
    private CharSequence mPullLabel;
    private CharSequence mRefreshingLabel;
    private CharSequence mReleaseLabel;
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
            try {
                $SwitchMap$com$taobao$ptr$PullBase$Mode[PullBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(632291342);
        t2o.a(632291346);
    }

    public PtrLayout(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        super(context, mode, i, attributeSet);
    }

    private int getGravity(PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9377f05", new Object[]{this, mode, new Integer(i)})).intValue();
        }
        if (a.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()] != 1) {
            if (i == 0) {
                return 81;
            }
            return 21;
        } else if (i == 0) {
            return 49;
        } else {
            return 19;
        }
    }

    public static /* synthetic */ Object ipc$super(PtrLayout ptrLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1206316367) {
            super.onInit((Context) objArr[0], (PullBase.Mode) objArr[1], ((Number) objArr[2]).intValue(), (AttributeSet) objArr[3]);
            return null;
        } else if (hashCode == 1958838369) {
            super.updateScrollDirection((PullBase.Mode) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/ptr/PtrLayout");
        }
    }

    public final void disableIntrinsicPullFeature(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac5df9", new Object[]{this, new Boolean(z)});
        } else if (z) {
            onDisable();
        } else {
            onEnable();
        }
    }

    public int getContentSize(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40eac2eb", new Object[]{this, new Integer(i)})).intValue();
        }
        m2n m2nVar = this.mHelper;
        if (m2nVar != null) {
            i2 = m2nVar.b(i);
        }
        if (i2 != 0) {
            return i2;
        }
        if (i != 1) {
            View view = this.mInnerParent;
            if (view != null) {
                return view.getHeight();
            }
            return i2;
        }
        View view2 = this.mInnerParent;
        if (view2 != null) {
            return view2.getWidth();
        }
        return i2;
    }

    public final Drawable getLoadingDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("bd024f8f", new Object[]{this});
        }
        return this.mLoadingDrawable;
    }

    public final CharSequence getPullLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("7b18b2ba", new Object[]{this});
        }
        return this.mPullLabel;
    }

    public final CharSequence getRefreshingLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("b26c9f1c", new Object[]{this});
        }
        return this.mRefreshingLabel;
    }

    public final CharSequence getReleaseLabel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("a7927d0", new Object[]{this});
        }
        return this.mReleaseLabel;
    }

    public final ColorStateList getTextColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("d1adea2d", new Object[]{this});
        }
        return this.mTextColor;
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

    @Override // tb.n2n
    public void onCompleteUpdate(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7fc67cc", new Object[]{this, charSequence});
        } else if (this.mHelper != null && !isDisable()) {
            this.mHelper.onCompleteUpdate(charSequence);
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
        removeView(this.mInnerParent);
        this.mInnerParent = null;
    }

    @Override // tb.n2n
    public void onEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e38fc9", new Object[]{this});
            return;
        }
        this.mIsDisable = false;
        updateScrollDirection(getMode(), getScrollDirection());
    }

    @Override // tb.n2n
    public void onFreeze(boolean z, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2222633b", new Object[]{this, new Boolean(z), charSequence});
        } else if (this.mHelper != null && !isDisable()) {
            this.mHelper.onFreeze(z, charSequence);
        }
    }

    @Override // com.taobao.ptr.PullLayout
    public final void onInit(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e6ed4f", new Object[]{this, context, mode, new Integer(i), attributeSet});
            return;
        }
        super.onInit(context, mode, i, attributeSet);
        this.mPullLabel = context.getString(R.string.ptr_pull_label);
        this.mRefreshingLabel = context.getString(R.string.ptr_refreshing_label);
        this.mReleaseLabel = context.getString(R.string.ptr_release_label);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Refresh);
        int i2 = R.styleable.Refresh_ptrPullLabel;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.mPullLabel = obtainStyledAttributes.getString(i2);
        }
        int i3 = R.styleable.Refresh_ptrRefreshingLabel;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.mRefreshingLabel = obtainStyledAttributes.getString(i3);
        }
        int i4 = R.styleable.Refresh_ptrReleaseLabel;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.mReleaseLabel = obtainStyledAttributes.getString(i4);
        }
        int i5 = R.styleable.Refresh_ptrLoadingTextColor;
        if (obtainStyledAttributes.hasValue(i5)) {
            this.mTextColor = obtainStyledAttributes.getColorStateList(i5);
        }
        int i6 = R.styleable.Refresh_ptrLoadingDrawable;
        if (obtainStyledAttributes.hasValue(i6)) {
            this.mLoadingDrawable = obtainStyledAttributes.getDrawable(i6);
        }
        if (a.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()] == 1) {
            int i7 = R.styleable.Refresh_ptrEndPullLabel;
            if (obtainStyledAttributes.hasValue(i7)) {
                this.mPullLabel = obtainStyledAttributes.getString(i7);
            }
            int i8 = R.styleable.Refresh_ptrEndRefreshingLabel;
            if (obtainStyledAttributes.hasValue(i8)) {
                this.mRefreshingLabel = obtainStyledAttributes.getString(i8);
            }
            int i9 = R.styleable.Refresh_ptrEndReleaseLabel;
            if (obtainStyledAttributes.hasValue(i9)) {
                this.mReleaseLabel = obtainStyledAttributes.getString(i9);
            }
            int i10 = R.styleable.Refresh_ptrEndLoadingTextColor;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.mTextColor = obtainStyledAttributes.getColorStateList(i10);
            }
            int i11 = R.styleable.Refresh_ptrEndLoadingDrawable;
            if (obtainStyledAttributes.hasValue(i11)) {
                this.mLoadingDrawable = obtainStyledAttributes.getDrawable(i11);
            }
        }
        obtainStyledAttributes.recycle();
        this.mHelper = new m2n(this);
        updateScrollDirection(mode, i);
    }

    @Override // tb.n2n
    public void onPull(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620c25d5", new Object[]{this, new Float(f)});
        } else if (this.mHelper != null && !isDisable()) {
            this.mHelper.onPull(f);
        }
    }

    @Override // tb.n2n
    public void onRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def893ed", new Object[]{this});
        } else if (this.mHelper != null && !isDisable()) {
            this.mHelper.onRefreshing();
        }
    }

    @Override // tb.n2n
    public void onRelease(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd47c3f1", new Object[]{this, new Float(f)});
        } else if (this.mHelper != null && !isDisable()) {
            this.mHelper.onRelease(f);
        }
    }

    @Override // tb.n2n
    public void onReset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b89f37", new Object[]{this});
        } else if (this.mHelper != null && !isDisable()) {
            this.mHelper.onReset();
        }
    }

    @Override // tb.n2n
    public void onUpdateDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e55ce5", new Object[]{this, new Integer(i)});
            return;
        }
        m2n m2nVar = this.mHelper;
        if (m2nVar != null) {
            if (m2nVar != null) {
                m2nVar.onUpdateDirection(i);
            }
            if (!isDisable()) {
                removeView(this.mInnerParent);
                this.mInnerParent = null;
                m2n m2nVar2 = this.mHelper;
                if (m2nVar2 != null) {
                    View a2 = m2nVar2.a(this);
                    this.mInnerParent = a2;
                    if (a2 != null) {
                        setChildGravity(a2);
                        addView(this.mInnerParent);
                    }
                }
            }
        }
    }

    public final void setChildGravity(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f959f57", new Object[]{this, view});
        } else if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || !(layoutParams instanceof FrameLayout.LayoutParams)) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2, getGravity(getMode(), getScrollDirection()));
            } else {
                ((FrameLayout.LayoutParams) layoutParams).gravity = getGravity(getMode(), getScrollDirection());
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public void setLoadingDelegate(l2n l2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72bc5a54", new Object[]{this, l2nVar});
            return;
        }
        m2n m2nVar = this.mHelper;
        if (m2nVar != null) {
            m2nVar.e(l2nVar);
        }
        updateScrollDirection(getMode(), getScrollDirection());
    }

    public void setLoadingDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aabccd63", new Object[]{this, drawable});
            return;
        }
        m2n m2nVar = this.mHelper;
        if (m2nVar != null) {
            m2nVar.f(drawable);
        }
    }

    public void setLoadingTextColor(ColorStateList colorStateList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75543c61", new Object[]{this, colorStateList});
            return;
        }
        m2n m2nVar = this.mHelper;
        if (m2nVar != null) {
            m2nVar.g(colorStateList);
        }
    }

    @Override // com.taobao.ptr.PullLayout
    public final void updateScrollDirection(PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c18061", new Object[]{this, mode, new Integer(i)});
            return;
        }
        super.updateScrollDirection(mode, i);
        onUpdateDirection(i);
    }
}
