package com.taobao.search.m3.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.kw1;
import tb.o1p;
import tb.t2o;
import tb.tfe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class CountDownView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float radius;
    private static final int textColor = -1;
    private static final int viewHeight;
    private final Paint bgPaint;
    private float minuteWidth;
    private final TextPaint paint;
    private boolean showCountDown;
    public static final a Companion = new a(null);
    private static final float textSize = o1p.a(11.0f);
    private static final int bgColor = Color.parseColor("#4c000000");
    private static final int circleMargin = o1p.a(5.0f);
    private static final float circleRadius = o1p.a(1.0f);
    private static final int iconSize = o1p.a(6.0f);
    private static final int iconHeight = o1p.a(6.5f);
    private static final int iconMargin = o1p.a(2.0f);
    private static final int pl = o1p.a(5.0f);
    private static final int pr = o1p.a(3.0f);
    private static final int timeMargin = o1p.a(3.0f);
    private final tfe icon = new tfe(this, null, 2, null);
    private String minuteStr = "";
    private String secondStr = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792464);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792463);
        int a2 = o1p.a(15.0f);
        viewHeight = a2;
        radius = a2 / 2.0f;
    }

    public CountDownView(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.paint = textPaint;
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        paint.setColor(bgColor);
        textPaint.setColor(-1);
        textPaint.setTextSize(textSize);
    }

    private final String fillZero(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2358d4f", new Object[]{this, new Integer(i)});
        }
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    public static /* synthetic */ Object ipc$super(CountDownView countDownView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/m3/video/CountDownView");
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.icon.d("https://gw.alicdn.com/mt/TB1UosV7kY2gK0jSZFgXXc5OFXa-24-26.png", iconSize, iconHeight);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.icon.e();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        float f = radius;
        canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), f, f, this.bgPaint);
        int i3 = pl;
        float f2 = i3;
        canvas.translate(i3, 0.0f);
        int height = getHeight();
        int i4 = iconHeight;
        canvas.translate(0.0f, (height - i4) / 2.0f);
        this.icon.c(canvas);
        canvas.translate(0.0f, (-(getHeight() - i4)) / 2.0f);
        if (this.showCountDown) {
            canvas.translate(iconSize + iconMargin, 0.0f);
            kw1.a(canvas, this.paint, 0.0f, this.minuteStr, 0.0f, getHeight());
            float f3 = this.minuteWidth;
            int i5 = timeMargin;
            float f4 = f2 + i + i2 + f3 + (i5 / 2.0f);
            canvas.translate((i5 / 2.0f) + f3, 0.0f);
            int height2 = getHeight();
            int i6 = circleMargin;
            float f5 = circleRadius;
            canvas.drawCircle(0.0f, (height2 - i6) / 2.0f, f5, this.paint);
            canvas.drawCircle(0.0f, (getHeight() + i6) / 2.0f, f5, this.paint);
            f2 = f4 + (i5 / 2.0f);
            canvas.translate(i5 / 2.0f, 0.0f);
            kw1.a(canvas, this.paint, 0.0f, this.secondStr, 0.0f, getHeight());
        }
        canvas.translate(-f2, 0.0f);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        float f = pl + pr + iconSize;
        if (this.showCountDown && !TextUtils.isEmpty(this.minuteStr) && !TextUtils.isEmpty(this.secondStr)) {
            float measureText = this.paint.measureText(this.minuteStr);
            this.minuteWidth = measureText;
            f = f + iconMargin + measureText + this.paint.measureText(this.secondStr) + timeMargin;
        }
        setMeasuredDimension((int) f, viewHeight);
    }

    public final void update(boolean z, int i, int i2) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e540b64", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        if (this.showCountDown == z) {
            z2 = false;
        }
        this.showCountDown = z;
        if (z) {
            int i3 = (i - i2) / 1000;
            this.minuteStr = fillZero(i3 / 60);
            this.secondStr = fillZero(i3 % 60);
        }
        if (z || z2) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        return true;
    }
}
