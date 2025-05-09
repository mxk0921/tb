package com.taobao.uikit.actionbar.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CustomiseScrollView extends ScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mMaxHeightDp;
    private float mMaxWidthDp;

    static {
        t2o.a(927989846);
    }

    public CustomiseScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CustomiseScrollView, i, 0);
        this.mMaxWidthDp = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CustomiseScrollView_maxWidth, 0);
        this.mMaxHeightDp = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CustomiseScrollView_maxHeight, 0);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ Object ipc$super(CustomiseScrollView customiseScrollView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/actionbar/view/CustomiseScrollView");
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        float f = this.mMaxHeightDp;
        if (f > 0.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) f, Integer.MIN_VALUE);
        }
        float f2 = this.mMaxWidthDp;
        if (f2 > 0.0f) {
            i = View.MeasureSpec.makeMeasureSpec((int) f2, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fff43f93", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxHeightDp = i;
        }
    }

    public void setMaxWidthDpt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14eff058", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxWidthDp = i;
        }
    }

    public CustomiseScrollView(Context context) {
        this(context, null, 0);
    }

    public CustomiseScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxWidthDp = -1.0f;
        this.mMaxHeightDp = -1.0f;
        init(context, attributeSet, i);
    }
}
