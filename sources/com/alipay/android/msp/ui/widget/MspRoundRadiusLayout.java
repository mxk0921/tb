package com.alipay.android.msp.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspRoundRadiusLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int px = 0;
    private int py = 0;

    public MspRoundRadiusLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(MspRoundRadiusLayout mspRoundRadiusLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/widget/MspRoundRadiusLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        if (this.px > 0 || this.py > 0) {
            Path path = new Path();
            RectF rectF = new RectF(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            int i = this.px;
            int i2 = this.py;
            path.addRoundRect(rectF, new float[]{i, i, i, i, i2, i2, i2, i2}, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.INTERSECT);
        }
        super.dispatchDraw(canvas);
    }

    public void setBottomRoundRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5dc6ae9", new Object[]{this, new Integer(i)});
        } else {
            this.py = i;
        }
    }

    public void setTopRoundRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763874f", new Object[]{this, new Integer(i)});
        } else {
            this.px = i;
        }
    }
}
