package com.taobao.detail.rate.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import tb.gss;
import tb.xd1;
import tb.zhn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class XRateFlowLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "XRateFlowView";
    private int mDefaultSelectedIndex;
    private boolean mHasInit;
    private boolean mIsFold;
    private boolean mIsMeasureFakerView;
    private a mOuterListener;
    private int mShowLines;
    private int mTotalLines;
    private int mHorizontalSpacing = zhn.j(16.0f);
    private int mVerticalSpacing = zhn.j(8.0f);
    private int mDefaultLines = Integer.MAX_VALUE;
    private HashSet<Integer> mExposeSet = new HashSet<>();
    private List<List<View>> mAllLines = new ArrayList();
    public List<Integer> lineHeights = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    public XRateFlowLayout(Context context) {
        super(context);
    }

    private void clearMeasureParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b40d7c3e", new Object[]{this});
            return;
        }
        this.mAllLines.clear();
        this.lineHeights.clear();
        notifyOuterFoldViewVisibilityIfNeed(false, false);
    }

    private void exposeItemDataIfNeed(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dc2f6c", new Object[]{this, view, new Integer(i)});
        } else if (!this.mIsMeasureFakerView && this.mOuterListener != null && !this.mExposeSet.contains(Integer.valueOf(i))) {
            this.mExposeSet.add(Integer.valueOf(i));
            ((xd1.a) this.mOuterListener).c(i, view.getTag(R.layout.rate_ugc_association_tag_flow_view));
        }
    }

    public static /* synthetic */ Object ipc$super(XRateFlowLayout xRateFlowLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/widget/XRateFlowLayout");
    }

    private boolean needForceUnfoldForSelectedIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e19e1043", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.mIsMeasureFakerView || this.mHasInit || this.mDefaultSelectedIndex < i) {
            return false;
        }
        return true;
    }

    private void notifyOuterExpend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3573d777", new Object[]{this});
            return;
        }
        this.mHasInit = true;
        this.mIsFold = false;
        a aVar = this.mOuterListener;
        if (aVar != null) {
            ((xd1.a) aVar).a(false);
        }
    }

    private void notifyOuterFoldViewVisibilityIfNeed(boolean z, boolean z2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26709bc4", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!this.mIsMeasureFakerView && (aVar = this.mOuterListener) != null) {
            ((xd1.a) aVar).b(z, this.mIsFold, z2);
        }
    }

    public int getShowLines() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d1149c6", new Object[]{this})).intValue();
        }
        return this.mShowLines;
    }

    public int getTotalLines() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b566ba0b", new Object[]{this})).intValue();
        }
        return this.mTotalLines;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int size = this.mAllLines.size();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < size; i5++) {
            List<View> list = this.mAllLines.get(i5);
            int intValue = this.lineHeights.get(i5).intValue();
            for (int i6 = 0; i6 < list.size(); i6++) {
                View view = list.get(i6);
                int measuredWidth = view.getMeasuredWidth() + paddingLeft;
                view.layout(paddingLeft, paddingTop, measuredWidth, view.getMeasuredHeight() + paddingTop);
                paddingLeft = this.mHorizontalSpacing + measuredWidth;
            }
            paddingTop = paddingTop + intValue + this.mVerticalSpacing;
            paddingLeft = getPaddingLeft();
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
        clearMeasureParams();
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i8 >= childCount) {
                i3 = size2;
                break;
            }
            View childAt = getChildAt(i8);
            i3 = size2;
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (childAt.getVisibility() != 8) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i6, paddingLeft + paddingRight, layoutParams.width), ViewGroup.getChildMeasureSpec(i2, paddingTop + paddingBottom, layoutParams.height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth + i9 + this.mHorizontalSpacing > size) {
                    this.mAllLines.add(arrayList);
                    this.lineHeights.add(Integer.valueOf(i10));
                    i11 = i11 + i10 + this.mVerticalSpacing;
                    i7 = Math.max(i7, i9 + this.mHorizontalSpacing);
                    arrayList = new ArrayList();
                    if (this.mIsFold && this.mAllLines.size() == this.mDefaultLines) {
                        i5 = i8;
                        if (!needForceUnfoldForSelectedIndex(i5)) {
                            this.mHasInit = true;
                            this.mShowLines = this.mAllLines.size();
                            notifyOuterFoldViewVisibilityIfNeed(true, true);
                            break;
                        }
                        notifyOuterExpend();
                        notifyOuterFoldViewVisibilityIfNeed(true, true);
                    } else {
                        i5 = i8;
                    }
                    i9 = 0;
                    i10 = 0;
                } else {
                    i5 = i8;
                }
                arrayList.add(childAt);
                exposeItemDataIfNeed(childAt, i5);
                i9 = i9 + measuredWidth + this.mHorizontalSpacing;
                i10 = Math.max(i10, measuredHeight);
                if (i5 == childCount - 1) {
                    this.mAllLines.add(arrayList);
                    this.lineHeights.add(Integer.valueOf(i10));
                    i11 = i11 + i10 + this.mVerticalSpacing;
                    i7 = Math.max(i7, this.mHorizontalSpacing + i9);
                    int size3 = this.mAllLines.size();
                    this.mTotalLines = size3;
                    this.mShowLines = size3;
                    if (this.mAllLines.size() > this.mDefaultLines) {
                        notifyOuterFoldViewVisibilityIfNeed(true, true);
                        i8 = i5 + 1;
                        i6 = i;
                        size2 = i3;
                        childCount = childCount;
                    }
                }
            } else {
                i5 = i8;
            }
            i8 = i5 + 1;
            i6 = i;
            size2 = i3;
            childCount = childCount;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            size = i7;
        }
        if (mode2 == 1073741824) {
            i4 = i3;
        } else {
            i4 = i11 - this.mVerticalSpacing;
        }
        setMeasuredDimension(size, i4);
    }

    public void setDefaultLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68eae09c", new Object[]{this, new Integer(i)});
        } else {
            this.mDefaultLines = i;
        }
    }

    public void setFlowViewOuterListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f139bdf", new Object[]{this, aVar});
        } else {
            this.mOuterListener = aVar;
        }
    }

    public void setFoldStatus(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f042f8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsFold = z;
        requestLayout();
        invalidate();
    }

    public void setHasInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7e588f", new Object[]{this});
        } else {
            this.mHasInit = true;
        }
    }

    public void setHorizontalSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4adbaa3f", new Object[]{this, new Integer(i)});
        } else {
            this.mHorizontalSpacing = i;
        }
    }

    public void setInitParams(int i, int i2, int i3, boolean z, int i4, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36eaa81", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4), new Boolean(z2)});
            return;
        }
        this.mHorizontalSpacing = i2;
        this.mVerticalSpacing = i;
        this.mDefaultLines = i3;
        this.mIsFold = z;
        this.mDefaultSelectedIndex = i4;
        this.mIsMeasureFakerView = z2;
    }

    public void setVerticalSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3176f311", new Object[]{this, new Integer(i)});
        } else {
            this.mVerticalSpacing = i;
        }
    }

    public void updateUIByAdapter(gss gssVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("490615e3", new Object[]{this, gssVar});
            return;
        }
        removeAllViews();
        for (int i = 0; i < gssVar.b(); i++) {
            View d = gssVar.d(this, i, gssVar.c(i));
            d.setTag(R.layout.rate_ugc_association_tag_flow_view, gssVar.c(i));
            addView(d);
        }
    }

    public XRateFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public XRateFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
