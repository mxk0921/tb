package com.taobao.android.dinamic_v35.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNanoScrollViewContainer extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int heightMeasureSpec;
    private int widthMeasureSpec;

    static {
        t2o.a(444596438);
    }

    public DXNanoScrollViewContainer(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DXNanoScrollViewContainer dXNanoScrollViewContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic_v35/view/DXNanoScrollViewContainer");
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18362898", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
    }

    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781b3ab5", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        getPaddingBottom();
        getPaddingBottom();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int i6 = paddingTop + layoutParams.topMargin;
                int i7 = paddingLeft + layoutParams.leftMargin;
                setChildFrame(childAt, i7, i6, measuredWidth, measuredHeight);
                paddingLeft = i7 + measuredWidth + layoutParams.rightMargin;
            }
        }
    }

    public void layoutVertical(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd404e87", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                int i6 = paddingLeft + layoutParams.leftMargin;
                int i7 = paddingTop + layoutParams.topMargin;
                setChildFrame(childAt, i6, i7, measuredWidth, measuredHeight);
                paddingTop = i7 + measuredHeight + layoutParams.bottomMargin;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (getOrientation() == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int measuredWidth;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, this.widthMeasureSpec, 0, this.heightMeasureSpec, 0);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (getOrientation() == 1) {
                    measuredWidth = i5 + childAt.getMeasuredHeight() + layoutParams.topMargin;
                    i4 = layoutParams.bottomMargin;
                } else {
                    measuredWidth = i5 + childAt.getMeasuredWidth() + layoutParams.leftMargin;
                    i4 = layoutParams.rightMargin;
                }
                i5 = measuredWidth + i4;
            }
        }
        if (getOrientation() == 1) {
            i5 = View.MeasureSpec.getSize(this.widthMeasureSpec);
            i3 = i5;
        } else {
            i3 = View.MeasureSpec.getSize(this.heightMeasureSpec);
        }
        setMeasuredDimension(i5, i3);
    }

    public void saveMeasureSpec(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c35caa3", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.widthMeasureSpec = i;
        this.heightMeasureSpec = i2;
    }

    public DXNanoScrollViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXNanoScrollViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
