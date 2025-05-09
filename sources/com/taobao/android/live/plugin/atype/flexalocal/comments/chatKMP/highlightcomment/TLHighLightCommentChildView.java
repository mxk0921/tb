package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.highlightcomment;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.nw0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TLHighLightCommentChildView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Paint circlePaint;
    private final float circleRadius;
    private final LinearGradient gradient;
    private boolean mSwitchState;
    private final float padding;
    private final float radius;
    private final Paint shadowPaint;
    private final float switchHeight;
    private final float switchWidth;
    private final Paint trackPaint;
    private final int colorOff = Color.parseColor("#CECED0");
    private final RectF trackRect = new RectF();

    static {
        t2o.a(295698680);
    }

    public TLHighLightCommentChildView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.radius = nw0.d(context, 7.0f);
        this.circleRadius = nw0.d(context, 6.0f);
        this.padding = nw0.d(context, 0.5f);
        float d = nw0.d(context, 23.0f);
        this.switchWidth = d;
        this.switchHeight = nw0.d(context, 14.0f);
        int parseColor = Color.parseColor("#FF4EDB");
        int parseColor2 = Color.parseColor("#FA487C");
        Paint paint = new Paint(1);
        this.trackPaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.circlePaint = paint2;
        paint2.setStyle(style);
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        this.shadowPaint = paint3;
        paint3.setStyle(style);
        paint3.setColor(Color.parseColor("#1A000000"));
        paint3.setMaskFilter(new BlurMaskFilter(nw0.d(getContext(), 1.0f), BlurMaskFilter.Blur.NORMAL));
        this.gradient = new LinearGradient(0.0f, 0.0f, d, 0.0f, parseColor, parseColor2, Shader.TileMode.CLAMP);
        updatePaint();
    }

    public static /* synthetic */ Object ipc$super(TLHighLightCommentChildView tLHighLightCommentChildView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/highlightcomment/TLHighLightCommentChildView");
    }

    private void updatePaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b8d71c", new Object[]{this});
        } else if (this.mSwitchState) {
            this.trackPaint.setShader(this.gradient);
        } else {
            this.trackPaint.setColor(this.colorOff);
            this.trackPaint.setShader(null);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        this.trackRect.set(this.padding, (getHeight() / 2.0f) - (this.switchHeight / 2.0f), this.switchWidth + this.padding, (getHeight() / 2.0f) + (this.switchHeight / 2.0f));
        RectF rectF = this.trackRect;
        float f2 = this.radius;
        canvas.drawRoundRect(rectF, f2, f2, this.trackPaint);
        if (this.mSwitchState) {
            f = ((this.trackRect.right - this.circleRadius) - this.padding) - nw0.d(getContext(), 0.5f);
        } else {
            f = this.trackRect.left + this.circleRadius + this.padding;
        }
        canvas.drawCircle(f, getHeight() / 2.0f, this.circleRadius + nw0.d(getContext(), 1.0f), this.shadowPaint);
        canvas.drawCircle(f, getHeight() / 2.0f, this.circleRadius, this.circlePaint);
    }

    public void setSwitchState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b84c12", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mSwitchState = z;
        updatePaint();
        invalidate();
    }
}
