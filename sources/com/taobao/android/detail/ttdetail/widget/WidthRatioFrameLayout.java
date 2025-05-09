package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class WidthRatioFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mWidthRatio = -1.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WidthRatioFrameLayout.this.requestLayout();
            }
        }
    }

    static {
        t2o.a(912262959);
    }

    public WidthRatioFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(WidthRatioFrameLayout widthRatioFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/WidthRatioFrameLayout");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (Float.compare(this.mWidthRatio, 0.0f) > 0) {
            i = View.MeasureSpec.makeMeasureSpec((int) (((View.getDefaultSize(0, i) - getPaddingTop()) - getPaddingBottom()) * this.mWidthRatio), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setWidthRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab4e892", new Object[]{this, new Float(f)});
        } else if (this.mWidthRatio != f) {
            this.mWidthRatio = f;
            if (isInLayout()) {
                post(new a());
            } else {
                requestLayout();
            }
        }
    }

    public WidthRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WidthRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WidthRatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
