package com.taobao.detail.rate.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FlowLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FlowLayout";
    private int checkIndex;
    private int collapseIndex;
    private boolean isNeedCollapse;
    private List<View> lineViews;
    public List<List<View>> mAllViews;
    public List<Integer> mLineHeight;
    public List<Integer> mLineWidth;
    private int maxLine;
    private boolean openMaxLineFlag;
    private a updateListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAllViews = new ArrayList();
        this.mLineHeight = new ArrayList();
        this.mLineWidth = new ArrayList();
        this.lineViews = new ArrayList();
        this.openMaxLineFlag = true;
        this.maxLine = 2;
        this.isNeedCollapse = false;
        this.checkIndex = 0;
        this.collapseIndex = 0;
    }

    public static /* synthetic */ Object ipc$super(FlowLayout flowLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/widget/FlowLayout");
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

    public int getCollapseIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd984a69", new Object[]{this})).intValue();
        }
        return this.collapseIndex;
    }

    public boolean isNeedCollapse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4672b8", new Object[]{this})).booleanValue();
        }
        return this.isNeedCollapse;
    }

    public boolean isNeedReLayout() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12144a48", new Object[]{this})).booleanValue();
        }
        int i2 = this.checkIndex;
        if (i2 == 0 || (i = this.collapseIndex) == 0 || i2 < i) {
            return false;
        }
        return true;
    }

    public boolean isOpenMaxLineFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0f8c5b", new Object[]{this})).booleanValue();
        }
        return this.openMaxLineFlag;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mAllViews.clear();
        this.mLineHeight.clear();
        this.mLineWidth.clear();
        this.lineViews.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth + i5 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > (width - getPaddingLeft()) - getPaddingRight()) {
                    if (this.openMaxLineFlag && i7 >= this.maxLine - 1) {
                        break;
                    }
                    this.mLineHeight.add(Integer.valueOf(i6));
                    this.mAllViews.add(this.lineViews);
                    this.mLineWidth.add(Integer.valueOf(i5));
                    i7++;
                    i6 = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin + measuredHeight;
                    this.lineViews = new ArrayList();
                    i5 = 0;
                }
                i5 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i6 = Math.max(i6, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                this.lineViews.add(childAt);
            }
        }
        this.mLineHeight.add(Integer.valueOf(i6));
        this.mLineWidth.add(Integer.valueOf(i5));
        this.mAllViews.add(this.lineViews);
        int paddingTop = getPaddingTop();
        int size = this.mAllViews.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.lineViews = this.mAllViews.get(i9);
            int intValue = this.mLineHeight.get(i9).intValue();
            int paddingLeft = getPaddingLeft();
            for (int i10 = 0; i10 < this.lineViews.size(); i10++) {
                View view = this.lineViews.get(i10);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i11 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i12 = marginLayoutParams2.topMargin + paddingTop;
                    view.layout(i11, i12, view.getMeasuredWidth() + i11, view.getMeasuredHeight() + i12);
                    paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
            }
            paddingTop += intValue;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i;
        int i7 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i6), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i7 >= childCount) {
                i3 = size2;
                break;
            }
            View childAt = getChildAt(i7);
            i3 = size2;
            if (childAt.getVisibility() == 8) {
                if (i7 == childCount - 1) {
                    i11 += i9;
                    i10 = Math.max(i8, i10);
                }
                i5 = 1;
            } else {
                measureChild(childAt, i6, i2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i13 = i8 + measuredWidth;
                if (i13 > (size - getPaddingLeft()) - getPaddingRight()) {
                    if (this.openMaxLineFlag) {
                        i5 = 1;
                        if (i12 >= this.maxLine - 1) {
                            this.collapseIndex = i7;
                            i10 = Math.max(i10, i8);
                            i11 += i9;
                            this.isNeedCollapse = true;
                            break;
                        }
                    } else {
                        i5 = 1;
                    }
                    i10 = Math.max(i10, i8);
                    i11 += i9;
                    i12 += i5;
                } else {
                    i5 = 1;
                    measuredHeight = Math.max(i9, measuredHeight);
                    measuredWidth = i13;
                }
                if (i7 == childCount - 1) {
                    i11 += measuredHeight;
                    i9 = measuredHeight;
                    i10 = Math.max(measuredWidth, i10);
                } else {
                    i9 = measuredHeight;
                }
                i8 = measuredWidth;
            }
            i7 += i5;
            i6 = i;
            size2 = i3;
        }
        if (mode != 1073741824) {
            size = i10 + getPaddingLeft() + getPaddingRight();
        }
        if (mode2 == 1073741824) {
            i4 = i3;
        } else {
            i4 = i11 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, i4);
    }

    public void setCheckIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cac8c30", new Object[]{this, new Integer(i)});
        } else {
            this.checkIndex = i;
        }
    }

    public void setMaxLine(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4828066", new Object[]{this, new Integer(i)});
        } else {
            this.maxLine = i;
        }
    }

    public void setOnUpdateViewListenser(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28a498f", new Object[]{this, aVar});
        }
    }

    public void setOpenMaxLineFlag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faac9495", new Object[]{this, new Boolean(z)});
            return;
        }
        this.openMaxLineFlag = z;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("ce603fbe", new Object[]{this, layoutParams}) : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context) {
        this(context, null);
    }
}
