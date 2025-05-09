package com.taobao.android.sku.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class HeightMutableFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mHeightMeasured;
    private ValueAnimator mLastAnimator;
    private View mRelationView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ViewGroup.LayoutParams layoutParams = HeightMutableFrameLayout.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                HeightMutableFrameLayout.access$000(HeightMutableFrameLayout.this);
                HeightMutableFrameLayout.this.setLayoutParams(layoutParams);
            }
        }
    }

    static {
        t2o.a(442499371);
    }

    public HeightMutableFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ void access$000(HeightMutableFrameLayout heightMutableFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e3a908", new Object[]{heightMutableFrameLayout});
        } else {
            heightMutableFrameLayout.clearRelationConstraints();
        }
    }

    private void clearRelationConstraints() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13d8114", new Object[]{this});
            return;
        }
        View view = this.mRelationView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if ((layoutParams instanceof LinearLayout.LayoutParams) && (layoutParams2 instanceof LinearLayout.LayoutParams)) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams2;
                if (layoutParams3.weight != 0.0f || layoutParams3.height != 0) {
                    layoutParams3.weight = 0.0f;
                    layoutParams3.height = 0;
                    layoutParams4.weight = 0.0f;
                    this.mRelationView.setLayoutParams(layoutParams3);
                    setLayoutParams(layoutParams4);
                }
            }
        }
    }

    private int getParentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7cd29e1", new Object[]{this})).intValue();
        }
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            return 0;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int height = viewGroup.getHeight();
        if (height == 0) {
            return viewGroup.getMeasuredHeight();
        }
        return height;
    }

    public static /* synthetic */ Object ipc$super(HeightMutableFrameLayout heightMutableFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/widget/HeightMutableFrameLayout");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        this.mHeightMeasured = true;
    }

    public void setRelationView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("718d4d48", new Object[]{this, view});
        } else {
            this.mRelationView = view;
        }
    }

    public void shrinkHeight(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd6f589", new Object[]{this, new Float(f)});
        } else {
            shrinkHeight(f, true);
        }
    }

    public HeightMutableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void shrinkHeight(float f, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d086e6b", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        if (f <= 1.0E-5f) {
            f = 0.0f;
        } else if (f >= 1.00001f) {
            f = 1.0f;
        }
        ValueAnimator valueAnimator = this.mLastAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int height = getHeight();
        if (height <= 0 && (layoutParams = getLayoutParams()) != null) {
            height = layoutParams.height;
        }
        if (height <= 0) {
            height = getMeasuredHeight();
        }
        int parentHeight = (int) (getParentHeight() * f);
        if (!this.mHeightMeasured && Math.abs(f - 1.0f) < 1.0E-5f) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
                clearRelationConstraints();
                setLayoutParams(layoutParams2);
            }
        } else if (height > 0 && parentHeight > 0) {
            if (!z) {
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = parentHeight;
                    clearRelationConstraints();
                    setLayoutParams(layoutParams3);
                    return;
                }
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(height, parentHeight);
            ofInt.addUpdateListener(new a());
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.start();
            this.mLastAnimator = ofInt;
        }
    }

    public HeightMutableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
