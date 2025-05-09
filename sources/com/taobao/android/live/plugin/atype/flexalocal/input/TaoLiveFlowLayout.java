package com.taobao.android.live.plugin.atype.flexalocal.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveFlowLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Integer> lineNumList;
    private final int lineSpacing;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class BlankView extends View {
        static {
            t2o.a(295699418);
        }

        public BlankView(Context context) {
            super(context);
        }
    }

    static {
        t2o.a(295699417);
    }

    public TaoLiveFlowLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveFlowLayout taoLiveFlowLayout, String str, Object... objArr) {
        if (str.hashCode() == 1841965840) {
            return super.generateDefaultLayoutParams();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/input/TaoLiveFlowLayout");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6dca2b10", new Object[]{this});
        }
        return new ViewGroup.MarginLayoutParams(super.generateDefaultLayoutParams());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("ce603fbe", new Object[]{this, layoutParams}) : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int i17 = i3 - i;
        int i18 = paddingRight + paddingLeft;
        this.lineNumList.clear();
        int i19 = paddingLeft;
        int i20 = i18;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < getChildCount()) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() == 8) {
                i5 = i21;
                i6 = i18;
            } else {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
                if (z2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = i18;
                    int i24 = marginLayoutParams.leftMargin;
                    i5 = i21;
                    int i25 = marginLayoutParams.rightMargin + i24;
                    int i26 = marginLayoutParams.topMargin;
                    i7 = paddingTop + i26;
                    i8 = i19 + i24;
                    i9 = i24 + i19 + measuredWidth;
                    i10 = marginLayoutParams.bottomMargin + i26;
                    i11 = i26 + paddingTop + measuredHeight;
                    i12 = i25;
                } else {
                    i5 = i21;
                    i6 = i18;
                    i11 = paddingTop + measuredHeight;
                    i9 = i19 + measuredWidth;
                    i7 = paddingTop;
                    i8 = i19;
                    i12 = 0;
                    i10 = 0;
                }
                int i27 = i12 + measuredWidth;
                int i28 = i10 + measuredHeight;
                if (i20 + i27 > i17) {
                    this.lineNumList.add(Integer.valueOf(i22));
                    paddingTop += i23 + this.lineSpacing;
                    if (z2) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                        int i29 = marginLayoutParams2.leftMargin;
                        int i30 = paddingLeft + i29;
                        int i31 = marginLayoutParams2.topMargin;
                        int i32 = paddingTop + i31;
                        i15 = i31 + paddingTop + measuredHeight;
                        i20 = i6;
                        i19 = paddingLeft;
                        i16 = i29 + paddingLeft + measuredWidth;
                        i14 = i30;
                        i13 = i32;
                    } else {
                        int i33 = paddingLeft + measuredWidth;
                        i15 = paddingTop + measuredHeight;
                        i20 = i6;
                        i19 = paddingLeft;
                        i14 = i19;
                        i13 = paddingTop;
                        i16 = i33;
                    }
                    i22 = 0;
                    i23 = 0;
                } else {
                    i15 = i11;
                    i16 = i9;
                    i14 = i8;
                    i13 = i7;
                }
                childAt.layout(i14, i13, i16, i15);
                i22++;
                if (i28 > i23) {
                    i23 = i28;
                }
                i20 += i27;
                i19 += i27;
            }
            i21 = i5 + 1;
            i18 = i6;
        }
        this.lineNumList.add(Integer.valueOf(i22));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        View view;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i7 = paddingLeft + paddingRight;
        int i8 = paddingTop;
        int i9 = i7;
        int i10 = 0;
        int i11 = 0;
        while (i10 < getChildCount()) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                i3 = i10;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    view = childAt;
                    i3 = i10;
                    measureChildWithMargins(childAt, i, 0, i2, i8);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    i4 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    view = childAt;
                    i3 = i10;
                    measureChild(view, i, i2);
                    i5 = 0;
                    i4 = 0;
                }
                int measuredWidth = i5 + view.getMeasuredWidth();
                int measuredHeight = i4 + view.getMeasuredHeight();
                if (i9 + measuredWidth > size) {
                    i8 += i11 + this.lineSpacing;
                    i9 = i7;
                    i6 = 0;
                } else {
                    i6 = i11;
                }
                if (measuredHeight > i6) {
                    i11 = measuredHeight;
                } else {
                    i11 = i6;
                }
                i9 += measuredWidth;
            }
            i10 = i3 + 1;
        }
        if (mode != 1073741824) {
            size2 = i8 + i11 + paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public TaoLiveFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public TaoLiveFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lineNumList = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TaoLiveFlowLayoutAType);
        this.lineSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TaoLiveFlowLayoutAType_lineSpacing_AType, 0);
        obtainStyledAttributes.recycle();
    }
}
