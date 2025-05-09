package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;
import tb.w14;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TextDividerView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Rect mLeftLineBound;
    private Paint mPaint;
    private Resources mResources;
    private Rect mRightLineBound;

    static {
        t2o.a(912262957);
    }

    public TextDividerView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mResources = context.getResources();
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(this.mResources.getColor(R.color.tt_detail_text_divider));
        this.mPaint.setStrokeWidth(1.0f);
    }

    public static /* synthetic */ Object ipc$super(TextDividerView textDividerView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/TextDividerView");
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.mLeftLineBound == null || this.mRightLineBound == null) {
            int dimensionPixelSize = this.mResources.getDimensionPixelSize(R.dimen.tt_detail_main_view_horizontal_margin);
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            this.mPaint.setTextSize(getTextSize());
            CharSequence text = getText();
            int measureText = ((int) this.mPaint.measureText(text, 0, text.length())) / 2;
            Rect rect = new Rect();
            this.mLeftLineBound = rect;
            rect.left = dimensionPixelSize;
            rect.right = (measuredWidth - measureText) - dimensionPixelSize;
            rect.bottom = measuredHeight;
            rect.top = measuredHeight;
            Rect rect2 = new Rect();
            this.mRightLineBound = rect2;
            rect2.left = measuredWidth + measureText + dimensionPixelSize;
            rect2.right = getMeasuredWidth() - dimensionPixelSize;
            Rect rect3 = this.mRightLineBound;
            rect3.bottom = measuredHeight;
            rect3.top = measuredHeight;
        }
        Rect rect4 = this.mLeftLineBound;
        canvas.drawLine(rect4.left, rect4.top, rect4.right, rect4.bottom, this.mPaint);
        Rect rect5 = this.mRightLineBound;
        canvas.drawLine(rect5.left, rect5.top, rect5.right, rect5.bottom, this.mPaint);
    }

    public void setLineColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76a7c5e", new Object[]{this, str});
            return;
        }
        Paint paint = this.mPaint;
        if (paint != null) {
            paint.setColor(w14.a(str));
        }
    }

    public TextDividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public TextDividerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
