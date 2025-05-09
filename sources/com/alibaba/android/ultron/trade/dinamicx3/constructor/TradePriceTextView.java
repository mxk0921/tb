package com.alibaba.android.ultron.trade.dinamicx3.constructor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import tb.t2o;
import tb.uwo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class TradePriceTextView extends DXNativeTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Paint mDeleteLinePaint;
    private float mDeleteLineWidth;
    private float mHalfDeleteLineWidth;
    private boolean mHasDeleteLine = false;

    static {
        t2o.a(155189293);
    }

    public TradePriceTextView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TradePriceTextView tradePriceTextView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/dinamicx3/constructor/TradePriceTextView");
    }

    private void lazyInitDeleteLinePaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943e0322", new Object[]{this});
        } else if (this.mDeleteLinePaint == null) {
            Paint paint = new Paint();
            this.mDeleteLinePaint = paint;
            paint.setAntiAlias(true);
            this.mDeleteLinePaint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.mDeleteLinePaint.setColor(getCurrentTextColor());
            float a2 = uwo.a(getContext(), 1.0f);
            this.mDeleteLineWidth = a2;
            this.mHalfDeleteLineWidth = a2 / 2.0f;
            this.mDeleteLinePaint.setStrokeWidth(a2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.mHasDeleteLine) {
            lazyInitDeleteLinePaint();
            float height = ((getHeight() * 1.0f) / 2.0f) - this.mHalfDeleteLineWidth;
            canvas.drawLine(0.0f, height, getWidth(), height, this.mDeleteLinePaint);
        }
    }

    public void setHasDeleteLine(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("effef456", new Object[]{this, new Boolean(z)});
        } else if (z != this.mHasDeleteLine) {
            this.mHasDeleteLine = z;
            invalidate();
        }
    }

    public TradePriceTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TradePriceTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
