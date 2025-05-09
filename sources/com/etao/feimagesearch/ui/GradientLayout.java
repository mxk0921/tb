package com.etao.feimagesearch.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;
import tb.zb7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class GradientLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isOpenGradient;
    private final Paint paint;

    static {
        t2o.a(481297541);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        ckf.g(attributeSet, "attrs");
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        setLayerType(2, null);
    }

    private final void drawGradient(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66363eaa", new Object[]{this, canvas});
            return;
        }
        canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
        canvas.drawPaint(getGradientPaint());
        canvas.restore();
    }

    private final Paint getGradientPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("fb7024ac", new Object[]{this});
        }
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(getMeasuredWidth(), 0.0f, getMeasuredWidth() - zb7.b(27.0f), 0.0f, Color.parseColor("#00000000"), Color.parseColor("#000000"), Shader.TileMode.CLAMP));
        return paint;
    }

    public static /* synthetic */ Object ipc$super(GradientLayout gradientLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ui/GradientLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.isOpenGradient) {
            drawGradient(canvas);
        }
    }

    public final boolean hasOpenGradient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0a621df", new Object[]{this})).booleanValue();
        }
        return this.isOpenGradient;
    }

    public final void openGradient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de14bf21", new Object[]{this});
        } else {
            this.isOpenGradient = true;
        }
    }
}
