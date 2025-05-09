package com.taobao.android.litecreator.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FixedAspectRatioTUrlImageView extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mAspectRatio = 1.0f;

    static {
        t2o.a(511705678);
    }

    public FixedAspectRatioTUrlImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(FixedAspectRatioTUrlImageView fixedAspectRatioTUrlImageView, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/widgets/FixedAspectRatioTUrlImageView");
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 || mode2 == 1073741824) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = (int) (size / this.mAspectRatio);
        if (mode2 == Integer.MIN_VALUE) {
            i3 = Math.min(i3, View.MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(size, i3);
    }

    public void setAspectRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8d1e8", new Object[]{this, new Float(f)});
            return;
        }
        this.mAspectRatio = f;
        requestLayout();
    }

    public FixedAspectRatioTUrlImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FixedAspectRatioTUrlImageView(Context context) {
        super(context);
    }
}
