package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveGridLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mColumn = 0;
    private int mHorizontalSpace = 0;
    private int mVerticalSpace = 0;
    private boolean mSquare = false;

    static {
        t2o.a(779093698);
        t2o.a(779093577);
    }

    public TBLiveGridLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TBLiveGridLayout tBLiveGridLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/view/TBLiveGridLayout");
    }

    public void addChildView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51bfb6ab", new Object[]{this, view});
        } else if (view != null) {
            addView(view);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void makeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960c80ba", new Object[]{this});
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    public void removeChildViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d36fdd", new Object[]{this});
        } else {
            removeAllViews();
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    public void setChildViews(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f643e54f", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            removeAllViews();
            Iterator<View> it = arrayList.iterator();
            while (it.hasNext()) {
                addChildView(it.next());
            }
        }
    }

    public void setColumn(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba50c04", new Object[]{this, new Integer(i)});
        } else {
            this.mColumn = i;
        }
    }

    public void setHorizontalSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08eb8dc", new Object[]{this, new Integer(i)});
        } else {
            this.mHorizontalSpace = i;
        }
    }

    public void setSquare(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84774a6e", new Object[]{this, new Boolean(z)});
        } else {
            this.mSquare = z;
        }
    }

    public void setVerticalSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70aa0e2e", new Object[]{this, new Integer(i)});
        } else {
            this.mVerticalSpace = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.mColumn != 0 && (childCount = getChildCount()) > 0) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    StringBuilder sb = new StringBuilder("i  = ");
                    sb.append(i5);
                    sb.append(" width = ");
                    sb.append(measuredWidth);
                    sb.append(" height = ");
                    sb.append(measuredHeight);
                    childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
                    paddingLeft += measuredWidth + this.mHorizontalSpace;
                    if ((i5 + 1) % this.mColumn == 0) {
                        paddingLeft = getPaddingLeft();
                        paddingTop += measuredHeight + this.mVerticalSpace;
                        StringBuilder sb2 = new StringBuilder("onLayout == breakLine i  = ");
                        sb2.append(i5);
                        sb2.append(" cl = ");
                        sb2.append(paddingLeft);
                        sb2.append(" ct = ");
                        sb2.append(paddingTop);
                    }
                }
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
        super.onMeasure(i, i2);
        if (this.mColumn != 0) {
            int size = View.MeasureSpec.getSize(i);
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i3 = this.mHorizontalSpace;
            int i4 = this.mColumn;
            int i5 = (paddingLeft - (i3 * (i4 - 1))) / i4;
            int childCount = getChildCount();
            if (childCount <= 0) {
                setMeasuredDimension(0, 0);
                return;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                if (this.mSquare) {
                    measureChild(childAt, makeMeasureSpec, makeMeasureSpec);
                } else {
                    measureChild(childAt, makeMeasureSpec, i2);
                }
            }
            int i7 = this.mColumn;
            int i8 = childCount % i7;
            int i9 = childCount / i7;
            if (i8 != 0) {
                i9++;
            }
            if (!this.mSquare) {
                i5 = getChildAt(0).getMeasuredHeight();
            }
            int paddingTop = (i5 * i9) + (this.mVerticalSpace * (i9 - 1)) + getPaddingTop() + getPaddingBottom();
            StringBuilder sb = new StringBuilder("onMeasure == lines = ");
            sb.append(i9);
            sb.append(" count = ");
            sb.append(childCount);
            sb.append(" height = ");
            sb.append(paddingTop);
            setMeasuredDimension(size, paddingTop);
        }
    }

    public TBLiveGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TBLiveGridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
