package com.taobao.search.m3.flash;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.BaseItemView;
import com.taobao.tao.timestamp.TimeStampManager;
import tb.a07;
import tb.ckf;
import tb.fqk;
import tb.ilt;
import tb.kw1;
import tb.o1p;
import tb.t2o;
import tb.tfe;
import tb.uk9;
import tb.vk9;
import tb.wk9;
import tb.yu4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class FlashSaleView extends BaseItemView implements fqk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final float dotMargin;
    private static final float dotSize;
    private final TextPaint commonPaint;
    private boolean hasIcon;
    private uk9 saleInfo;
    private final TextPaint timePaint;
    private int[] visibilityArray;
    public static final a Companion = new a(null);
    private static final int iconSize = o1p.a(11.0f);
    private static final float commonTextSize = o1p.a(12.0f);
    private static final int viewHeight = o1p.a(12.0f);
    private static final int commonColor = Color.parseColor("#FF5000");
    private static final int iconMarginRight = o1p.a(2.0f);
    private static final int timeRectSize = o1p.a(12.0f);
    private static final float timeRectRadius = o1p.a(2.0f);
    private static final float timeTextSize = o1p.a(10.0f);
    private static final int timeMargin = o1p.a(5.5f);
    private static final int timeWidth = o1p.a(74.0f);
    private static final int textMargin = o1p.a(5.0f);
    private static final int commonBgColor = Color.parseColor("#FFE5DA");
    private final Paint rectPaint = new Paint(1);
    private final wk9 countDownTime = new wk9(0, 0, 0);
    private final tfe icon = new tfe(this, null, 2, null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792374);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f6a4ffc6", new Object[]{this})).floatValue();
            }
            return FlashSaleView.access$getCommonTextSize$cp();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792373);
        t2o.a(815792375);
        float a2 = o1p.a(1.5f);
        dotSize = a2;
        dotMargin = a2;
    }

    public FlashSaleView(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.commonPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.timePaint = textPaint2;
        textPaint.setColor(commonColor);
        textPaint.setTextSize(commonTextSize);
        textPaint2.setTextSize(timeTextSize);
    }

    public static final /* synthetic */ float access$getCommonTextSize$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8dbad19", new Object[0])).floatValue();
        }
        return commonTextSize;
    }

    private final String convert(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("515c1e37", new Object[]{this, new Integer(i)});
        }
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    private final void drawDot(Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859a1f67", new Object[]{this, canvas, new Float(f)});
            return;
        }
        float f2 = f + timeRectSize + (timeMargin / 2.0f);
        float f3 = dotMargin;
        float f4 = dotSize;
        float f5 = f4 / 2.0f;
        canvas.drawCircle(f2, ((getHeight() - f3) - f4) / 2.0f, f5, this.commonPaint);
        canvas.drawCircle(f2, ((getHeight() + f3) + f4) / 2.0f, f5, this.commonPaint);
    }

    private final void drawTime(Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("464cbb33", new Object[]{this, canvas, new Float(f)});
        } else if (this.countDownTime.a() > 0 || this.countDownTime.b() > 0 || this.countDownTime.c() > 0) {
            int height = getHeight();
            int i = timeRectSize;
            float f2 = (height - i) / 2.0f;
            drawTimeItem(canvas, f, f2, this.countDownTime.a());
            drawDot(canvas, f);
            int i2 = timeMargin;
            float f3 = f + i + i2;
            drawTimeItem(canvas, f3, f2, this.countDownTime.b());
            drawDot(canvas, f3);
            drawTimeItem(canvas, f3 + i + i2, f2, this.countDownTime.c());
        }
    }

    private final void drawTimeItem(Canvas canvas, float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae4a069", new Object[]{this, canvas, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        int i2 = timeRectSize;
        float f3 = timeRectRadius;
        canvas.drawRoundRect(f, f2, f + i2, f2 + i2, f3, f3, this.rectPaint);
        String convert = convert(i);
        kw1.a(canvas, this.timePaint, f + ((i2 - ilt.Companion.a(convert, this.timePaint)) / 2.0f), convert, 0.0f, getHeight());
    }

    public static /* synthetic */ Object ipc$super(FlashSaleView flashSaleView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else if (hashCode == 2022597206) {
            super.reset();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/m3/flash/FlashSaleView");
        }
    }

    private final void loadIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2076bf86", new Object[]{this});
            return;
        }
        uk9 uk9Var = this.saleInfo;
        if (uk9Var != null && this.hasIcon) {
            tfe tfeVar = this.icon;
            String b = uk9Var.b();
            int i = iconSize;
            tfeVar.d(b, i, i);
        }
    }

    private final void releaseIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470471a7", new Object[]{this});
        } else {
            this.icon.e();
        }
    }

    private final void updateCountDownTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b483887c", new Object[]{this});
            return;
        }
        uk9 uk9Var = this.saleInfo;
        ckf.d(uk9Var);
        long c = uk9Var.c() - TimeStampManager.instance().getCurrentTimeStamp();
        if (c <= 0) {
            this.countDownTime.d(0);
            this.countDownTime.e(0);
            this.countDownTime.f(0);
            invalidate();
            return;
        }
        long j = 3600000;
        long j2 = c / j;
        long j3 = c - (j * j2);
        long j4 = 60000;
        long j5 = j3 / j4;
        this.countDownTime.d((int) j2);
        this.countDownTime.e((int) j5);
        this.countDownTime.f((int) ((j3 - (j4 * j5)) / 1000));
        invalidate();
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        return viewHeight;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        loadIcon();
        yu4.Companion.c(this);
    }

    @Override // tb.fqk
    public void onCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51afa2b9", new Object[]{this});
        } else if (this.saleInfo != null) {
            updateCountDownTime();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        releaseIcon();
        yu4.Companion.d(this);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        float f;
        vk9 vk9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        uk9 uk9Var = this.saleInfo;
        if (uk9Var != null) {
            long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
            long c = uk9Var.c();
            if (1 > c || c > currentTimeStamp) {
                z = false;
            } else {
                z = true;
            }
            boolean isEmpty = TextUtils.isEmpty(uk9Var.d());
            if (!this.hasIcon || (z && isEmpty)) {
                f = 0.0f;
            } else {
                int i = viewHeight;
                int i2 = iconSize;
                float f2 = (i - i2) >> 1;
                canvas.translate(0.0f, f2);
                this.icon.c(canvas);
                canvas.translate(0.0f, -f2);
                f = i2 + iconMarginRight;
            }
            if (z) {
                String d = uk9Var.d();
                if (d != null) {
                    kw1.a(canvas, this.commonPaint, f, d, 0.0f, getHeight());
                    return;
                }
                return;
            }
            int[] iArr = this.visibilityArray;
            if (iArr != null) {
                int size = uk9Var.e().size();
                float f3 = f;
                for (int i3 = 0; i3 < size; i3++) {
                    if (iArr[i3] != 8) {
                        kw1.a(canvas, this.commonPaint, f3, uk9Var.e().get(i3).a(), 0.0f, getHeight());
                        f3 += vk9Var.b() + textMargin;
                    }
                }
                drawTime(canvas, f3);
            }
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        uk9 uk9Var = this.saleInfo;
        if (uk9Var != null) {
            if (!this.hasIcon) {
                i = 0;
            } else {
                i = iconSize + iconMarginRight;
            }
            int measuredWidth = getMeasuredWidth();
            int i2 = timeWidth;
            int i3 = (measuredWidth - i2) - i;
            if (uk9Var.c() <= 0) {
                i3 += i2;
            }
            int[] iArr = this.visibilityArray;
            if (iArr != null) {
                for (int size = uk9Var.e().size() - 1; -1 < size; size--) {
                    vk9 vk9Var = uk9Var.e().get(size);
                    int b = vk9Var.b();
                    int i4 = textMargin;
                    if (b + i4 <= i3) {
                        iArr[size] = 0;
                    } else {
                        iArr[size] = 8;
                    }
                    i3 = (i3 - vk9Var.b()) - i4;
                }
            }
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void reset() {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        super.reset();
        releaseIcon();
        uk9 uk9Var = this.saleInfo;
        if (uk9Var != null) {
            this.visibilityArray = new int[uk9Var.e().size()];
            Paint paint = this.rectPaint;
            Integer a2 = uk9Var.a();
            if (a2 != null) {
                i = a2.intValue();
            } else {
                i = commonBgColor;
            }
            paint.setColor(i);
            TextPaint textPaint = this.timePaint;
            Integer f = uk9Var.f();
            if (f != null) {
                i2 = f.intValue();
            } else {
                i2 = commonColor;
            }
            textPaint.setColor(i2);
            TextPaint textPaint2 = this.commonPaint;
            Integer f2 = uk9Var.f();
            if (f2 != null) {
                i3 = f2.intValue();
            } else {
                i3 = commonColor;
            }
            textPaint2.setColor(i3);
            updateCountDownTime();
        }
    }

    public final void update(uk9 uk9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bd326ae", new Object[]{this, uk9Var});
        } else if (this.saleInfo != uk9Var) {
            this.saleInfo = uk9Var;
            ckf.d(uk9Var);
            this.hasIcon = !TextUtils.isEmpty(uk9Var.b());
            reset();
            loadIcon();
            requestLayout();
        }
    }
}
