package com.taobao.android.megadesign.FlowLayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.txo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MegaFlowLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ALIGN_CENTER = 1;
    private static final int ALIGN_LEFT = 0;
    private static final int ALIGN_RIGHT = 2;
    private static final int STYLE_SCROLL = 1;
    private static final int STYLE_TRUNCATION = 0;
    private txo scrollDecorator;
    private List<List<View>> mAllViews = new ArrayList();
    public List<Integer> mLineHeight = new ArrayList();
    private int mHorizontalSpacing = dpToPx(16);
    private int mVerticalSpacing = dpToPx(16);
    private int mMaxVisibleLines = 5;
    private int mLineAlignment = 0;
    private int displayStyle = 0;

    public MegaFlowLayout(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlowLayout);
            this.mHorizontalSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_horizontalSpacing, this.mHorizontalSpacing);
            this.mVerticalSpacing = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_verticalSpacing, this.mVerticalSpacing);
            this.mLineAlignment = obtainStyledAttributes.getInt(R.styleable.FlowLayout_lineAlignment, 0);
            this.mMaxVisibleLines = obtainStyledAttributes.getInt(R.styleable.FlowLayout_maxLine, this.mMaxVisibleLines);
            this.displayStyle = obtainStyledAttributes.getInt(R.styleable.FlowLayout_displayStyle, 0);
            obtainStyledAttributes.recycle();
        }
        if (this.displayStyle == 1) {
            this.scrollDecorator = new txo(context, this);
        }
    }

    public static /* synthetic */ Object ipc$super(MegaFlowLayout megaFlowLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -894236565) {
            super.computeScroll();
            return null;
        } else if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        } else {
            if (hashCode == 949399698) {
                super.onDetachedFromWindow();
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/megadesign/FlowLayout/MegaFlowLayout");
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d4b702", new Object[]{this, layoutParams})).booleanValue();
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        super.computeScroll();
        txo txoVar = this.scrollDecorator;
        if (txoVar != null) {
            txoVar.a();
        }
    }

    public int dpToPx(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11e1c020", new Object[]{this, new Integer(i)})).intValue();
        }
        return Math.round(TypedValue.applyDimension(1, i, getResources().getDisplayMetrics()));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6dca2b10", new Object[]{this});
        }
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getMaxVisibleLines() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51d449f5", new Object[]{this})).intValue();
        }
        return this.mMaxVisibleLines;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        txo txoVar = this.scrollDecorator;
        if (txoVar != null) {
            txoVar.d();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        txo txoVar = this.scrollDecorator;
        if (txoVar == null || !txoVar.b(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < this.mAllViews.size(); i6++) {
            List<View> list = this.mAllViews.get(i6);
            int intValue = this.mLineHeight.get(i6).intValue();
            int i7 = 0;
            for (View view : list) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                i7 += view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + this.mHorizontalSpacing;
            }
            if (!list.isEmpty()) {
                i7 -= this.mHorizontalSpacing;
            }
            int i8 = this.mLineAlignment;
            if (i8 == 1) {
                i5 = ((((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - i7) / 2) + paddingLeft;
            } else if (i8 != 2) {
                i5 = paddingLeft;
            } else {
                i5 = (getMeasuredWidth() - getPaddingRight()) - i7;
            }
            for (View view2 : list) {
                if (view2.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                    int i9 = marginLayoutParams2.leftMargin + i5;
                    int i10 = marginLayoutParams2.topMargin + paddingTop;
                    view2.layout(i9, i10, view2.getMeasuredWidth() + i9, view2.getMeasuredHeight() + i10);
                    i5 += view2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + this.mHorizontalSpacing;
                }
            }
            paddingTop += intValue + this.mVerticalSpacing;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ArrayList arrayList;
        txo txoVar;
        int i3;
        View view;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mAllViews.clear();
        this.mLineHeight.clear();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount();
        ArrayList arrayList3 = arrayList2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i6 >= childCount) {
                arrayList = arrayList3;
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                i3 = i6;
            } else {
                i3 = i6;
                measureChildWithMargins(childAt, i, 0, i2, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (i7 + measuredWidth + this.mHorizontalSpacing > (size - getPaddingLeft()) - getPaddingRight() && !arrayList3.isEmpty()) {
                    if (this.displayStyle == 0 && i5 >= this.mMaxVisibleLines) {
                        arrayList = arrayList3;
                        break;
                    }
                    this.mAllViews.add(arrayList3);
                    this.mLineHeight.add(Integer.valueOf(i8));
                    if (this.mLineHeight.size() - 1 > 0) {
                        paddingTop += this.mVerticalSpacing;
                    }
                    paddingTop += i8;
                    arrayList3 = new ArrayList();
                    i5++;
                    view = childAt;
                    i4 = 0;
                    i7 = 0;
                } else {
                    arrayList3 = arrayList3;
                    i5 = i5;
                    i4 = i8;
                    view = childAt;
                }
                arrayList3.add(view);
                i7 += measuredWidth + this.mHorizontalSpacing;
                i8 = Math.max(i4, measuredHeight);
            }
            i6 = i3 + 1;
        }
        if (!arrayList.isEmpty()) {
            this.mAllViews.add(arrayList);
            this.mLineHeight.add(Integer.valueOf(i8));
            paddingTop = paddingTop + this.mVerticalSpacing + i8;
        }
        if (this.displayStyle == 1 && (txoVar = this.scrollDecorator) != null) {
            txoVar.e();
        }
        if (mode != 1073741824) {
            size = View.resolveSize(size, i);
        }
        if (mode2 != 1073741824) {
            size2 = View.resolveSize(paddingTop, i2);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        txo txoVar = this.scrollDecorator;
        if (txoVar != null) {
            txoVar.c(motionEvent);
        }
        return true;
    }

    public void setColumnSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cbf8771", new Object[]{this, new Integer(i)});
        } else {
            this.mHorizontalSpacing = i;
        }
    }

    public void setMaxVisibleLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6308984d", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            this.mMaxVisibleLines = i;
            requestLayout();
        }
    }

    public void setRowSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e994f31", new Object[]{this, new Integer(i)});
        } else {
            this.mVerticalSpacing = i;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("ce603fbe", new Object[]{this, layoutParams}) : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public MegaFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public MegaFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
