package com.taobao.homepage.view.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TailFadeFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mFadeWidth;
    private Paint mPaint;
    private boolean mShowTailFade;

    static {
        t2o.a(729809193);
    }

    public TailFadeFrameLayout(Context context) {
        super(context);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public static /* synthetic */ Object ipc$super(TailFadeFrameLayout tailFadeFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -1952076612) {
            return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/widgets/TailFadeFrameLayout");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ba5acbc", new Object[]{this, canvas, view, new Long(j)})).booleanValue();
        }
        if (!this.mShowTailFade || this.mPaint == null || this.mFadeWidth <= 0) {
            return super.drawChild(canvas, view, j);
        }
        int width = getWidth();
        float height = getHeight();
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, width, height, null, 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        int save = canvas.save();
        canvas.translate(width - this.mFadeWidth, 0.0f);
        canvas.drawRect(0.0f, 0.0f, this.mFadeWidth, height, this.mPaint);
        canvas.restoreToCount(save);
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    public void setFadeWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e993f9f4", new Object[]{this, new Integer(i)});
            return;
        }
        this.mFadeWidth = i;
        this.mPaint.setShader(new LinearGradient(0.0f, 0.0f, this.mFadeWidth, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
    }

    public void showFade(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a240e7b4", new Object[]{this, new Boolean(z)});
        } else if (z != this.mShowTailFade) {
            this.mShowTailFade = z;
            invalidate();
        }
    }

    public TailFadeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public TailFadeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
