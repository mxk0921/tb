package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ExtraHeightLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mExtraHeight;

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
                ExtraHeightLinearLayout.this.requestLayout();
            }
        }
    }

    static {
        t2o.a(912262896);
    }

    public ExtraHeightLinearLayout(Context context) {
        super(context);
    }

    private void initTypedArray(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("debc868c", new Object[]{this, context, attributeSet});
        } else if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExtraHeightView);
            this.mExtraHeight = (int) obtainStyledAttributes.getDimension(R.styleable.ExtraHeightView_extraHeight, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public static /* synthetic */ Object ipc$super(ExtraHeightLinearLayout extraHeightLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/ExtraHeightLinearLayout");
    }

    public int getExtraHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2a0981b", new Object[]{this})).intValue();
        }
        return this.mExtraHeight;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + this.mExtraHeight, View.MeasureSpec.getMode(i2)));
        }
    }

    public void setExtraHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f74e7", new Object[]{this, new Integer(i)});
            return;
        }
        this.mExtraHeight = i;
        if (isInLayout()) {
            post(new a());
        } else {
            requestLayout();
        }
    }

    public ExtraHeightLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initTypedArray(context, attributeSet);
    }

    public ExtraHeightLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initTypedArray(context, attributeSet);
    }

    public ExtraHeightLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initTypedArray(context, attributeSet);
    }
}
