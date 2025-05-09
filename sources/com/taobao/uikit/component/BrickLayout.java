package com.taobao.uikit.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BrickLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mGap;
    private int mMaxLines;

    static {
        t2o.a(931135496);
    }

    public BrickLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(BrickLayout brickLayout, String str, Object... objArr) {
        if (str.hashCode() == 1992612095) {
            super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/component/BrickLayout");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
        } else {
            super.addView(view, i, new BrickLayoutParams(layoutParams));
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6dca2b10", new Object[]{this});
        }
        return new BrickLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new ViewGroup.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                BrickLayoutParams brickLayoutParams = (BrickLayoutParams) childAt.getLayoutParams();
                int i6 = brickLayoutParams.x;
                int i7 = brickLayoutParams.y;
                childAt.layout(i6, i7, ((ViewGroup.MarginLayoutParams) brickLayoutParams).width + i6, ((ViewGroup.MarginLayoutParams) brickLayoutParams).height + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            childAt.measure(makeMeasureSpec, i2);
            BrickLayoutParams brickLayoutParams = (BrickLayoutParams) childAt.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) brickLayoutParams).height <= 0) {
                ((ViewGroup.MarginLayoutParams) brickLayoutParams).height = childAt.getMeasuredHeight();
            }
            if (((ViewGroup.MarginLayoutParams) brickLayoutParams).width <= 0) {
                ((ViewGroup.MarginLayoutParams) brickLayoutParams).width = childAt.getMeasuredWidth();
            }
            if (size - i4 < ((ViewGroup.MarginLayoutParams) brickLayoutParams).width) {
                i5 += i6;
                i7++;
                i4 = 0;
                i6 = 0;
            }
            brickLayoutParams.x = i4;
            int i9 = ((ViewGroup.MarginLayoutParams) brickLayoutParams).topMargin;
            brickLayoutParams.y = i5 + i9;
            i6 = Math.max(i6, ((ViewGroup.MarginLayoutParams) brickLayoutParams).height + i9 + ((ViewGroup.MarginLayoutParams) brickLayoutParams).bottomMargin + this.mGap);
            i4 += ((ViewGroup.MarginLayoutParams) brickLayoutParams).width + this.mGap;
            if (i7 <= this.mMaxLines) {
                i3 = i5 + i6;
            }
        }
        setMeasuredDimension(size, i3);
    }

    public BrickLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("ce603fbe", new Object[]{this, layoutParams}) : new ViewGroup.LayoutParams(layoutParams);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class BrickLayoutParams extends ViewGroup.MarginLayoutParams {
        public int x = 0;
        public int y = 0;

        static {
            t2o.a(931135497);
        }

        public BrickLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public BrickLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public BrickLayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    public BrickLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGap = 0;
        this.mMaxLines = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BrickLayout, i, 0);
        if (obtainStyledAttributes != null) {
            this.mMaxLines = obtainStyledAttributes.getInt(R.styleable.BrickLayout_uik_brickMaxLines, this.mMaxLines);
            this.mGap = obtainStyledAttributes.getDimensionPixelSize(R.styleable.BrickLayout_uik_brickGap, this.mGap);
            obtainStyledAttributes.recycle();
        }
    }
}
