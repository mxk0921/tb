package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mr7;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RatioFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mFloatWHRatio = -1.0f;
    private String mWHRatio;

    static {
        t2o.a(912262911);
    }

    public RatioFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(RatioFrameLayout ratioFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/RatioFrameLayout");
    }

    private void parseWHRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f9ceae", new Object[]{this});
        } else {
            this.mFloatWHRatio = mr7.i(this.mWHRatio, -1.0f);
        }
    }

    public String getWHRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b40f89d5", new Object[]{this});
        }
        return this.mWHRatio;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.mFloatWHRatio != -1.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / this.mFloatWHRatio), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setWHRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e539a9", new Object[]{this, str});
        } else if (!TextUtils.equals(this.mWHRatio, str)) {
            this.mWHRatio = str;
            parseWHRatio();
            requestLayout();
        }
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
