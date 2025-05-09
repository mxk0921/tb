package com.taobao.android.detail.ttdetail.transfer.widget.coupon;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import tb.do1;
import tb.mr7;
import tb.owo;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class XRichTextViewByCouponV3 extends DXNativeTextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable drawable;
    public int drawableH;
    public Rect drawableRect;
    public int drawableW;
    private int lineSpacingExtra;
    private NinePatch np;
    private Rect npRect;
    private String separator;
    private Drawable targetBgDrawable;
    private Drawable textBgDrawable;
    private TextPaint textPaint;
    private int xIconHeight;
    private int xTextBgPaddingH;
    private int xTextBgPaddingV;
    private int linesNum = 1;
    private int ascent = 0;
    private int imageTextSpace = mr7.a(5.0f);
    private int textSpace = mr7.a(5.0f);
    private final int textMarginLeft = 0;

    static {
        t2o.a(912262729);
    }

    public XRichTextViewByCouponV3(Context context) {
        super(context);
        init(context, null);
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        Bitmap.Config config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("cc237851", new Object[]{drawable});
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return createBitmap;
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.lineSpacingExtra = 3;
        textPaint.setTextSize(getTextSize());
        this.textPaint.setColor(getTextColors().getColorForState(getDrawableState(), 0));
        this.textPaint.setAntiAlias(true);
        setLineSpacing(this.lineSpacingExtra, 1.0f);
        this.ascent = (int) this.textPaint.ascent();
    }

    public static /* synthetic */ Object ipc$super(XRichTextViewByCouponV3 xRichTextViewByCouponV3, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 362446068:
                super.setLineSpacing(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                return null;
            case 835841791:
                super.setMaxLines(((Number) objArr[0]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/coupon/XRichTextViewByCouponV3");
        }
    }

    private void releaseImg(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd16a67", new Object[]{this, drawable});
        } else if (do1.c(drawable)) {
            ((BitmapDrawable) drawable).getBitmap().recycle();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
        } else {
            super.onAttachedToWindow();
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
        releaseTargetBgDrawableImg();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        Bitmap bitmap;
        boolean z = true;
        int i3 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (!TextUtils.isEmpty(getText())) {
            this.ascent = (int) this.textPaint.ascent();
            CharSequence text = getText();
            String[] split = TextUtils.isEmpty(this.separator) ? new String[]{text.toString()} : text.toString().split(this.separator);
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            getPaddingTop();
            if (this.drawable != null) {
                int i4 = this.drawableW;
                Rect rect = this.drawableRect;
                rect.left = 0;
                rect.right = i4;
                int height = getHeight();
                int i5 = this.drawableH;
                rect.top = (height - i5) / 2;
                Rect rect2 = this.drawableRect;
                rect2.bottom = rect2.top + i5;
                this.drawable.setBounds(rect2);
                this.drawable.draw(canvas);
                i = i4;
            } else {
                i = 0;
            }
            int i6 = this.imageTextSpace;
            if (i == 0) {
                i2 = 0;
            } else {
                i2 = i6;
            }
            int i7 = 0;
            int i8 = 0;
            while (i7 < split.length) {
                int breakText = this.textPaint.breakText(split[i7], z, (width - i) - i2, null);
                int i9 = i7 + 1;
                int i10 = this.xTextBgPaddingH;
                int i11 = z ? 1 : 0;
                int i12 = z ? 1 : 0;
                int paddingRight = (paddingLeft * i9) + (getPaddingRight() * i7) + i + i8 + i2 + (i10 * ((i7 * 2) + i11));
                TextPaint textPaint = this.textPaint;
                String str = split[i7];
                int measureText = i8 + ((int) textPaint.measureText(str, 0, str.length())) + this.textSpace;
                if (paddingRight + measureText <= getWidth()) {
                    int height2 = ((getHeight() - ((int) this.textPaint.getTextSize())) / i3) - this.xTextBgPaddingV;
                    if (this.textBgDrawable != null) {
                        TextPaint textPaint2 = this.textPaint;
                        String str2 = split[i7];
                        Rect rect3 = new Rect(paddingRight - this.xTextBgPaddingH, height2, ((int) textPaint2.measureText(str2, 0, str2.length())) + paddingRight + this.xTextBgPaddingH, ((int) this.textPaint.getTextSize()) + height2 + (this.xTextBgPaddingV * 2));
                        if (!do1.c(this.targetBgDrawable) && (bitmap = ((BitmapDrawable) this.textBgDrawable).getBitmap()) != null) {
                            this.targetBgDrawable = do1.b(tq4.d(this), this.textBgDrawable, do1.a(bitmap.getHeight(), rect3), bitmap.getWidth() / 2);
                        }
                        if (do1.c(this.targetBgDrawable)) {
                            this.targetBgDrawable.setBounds(rect3);
                            this.targetBgDrawable.draw(canvas);
                        }
                    }
                    Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
                    canvas.drawText(split[i7], 0, breakText, paddingRight, (int) (((getHeight() / 2) - (fontMetrics.top / 2.0f)) - (fontMetrics.bottom / 2.0f)), (Paint) this.textPaint);
                    i7 = i9;
                    i8 = measureText;
                    z = true;
                    i3 = 2;
                } else {
                    return;
                }
            }
        }
    }

    public void releaseTargetBgDrawableImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e65fdfaf", new Object[]{this});
            return;
        }
        Drawable drawable = this.textBgDrawable;
        if (drawable == null || !drawable.equals(this.targetBgDrawable)) {
            releaseImg(this.targetBgDrawable);
            this.targetBgDrawable = null;
        }
    }

    public void setIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a1c526", new Object[]{this, drawable});
        } else if (this.drawable != drawable) {
            this.drawable = drawable;
            if (drawable != null) {
                getPaddingTop();
                this.textPaint.ascent();
                int intrinsicWidth = this.drawable.getIntrinsicWidth();
                int intrinsicHeight = this.drawable.getIntrinsicHeight();
                int i = this.xIconHeight;
                if (i != intrinsicHeight) {
                    intrinsicWidth = (intrinsicWidth * i) / intrinsicHeight;
                }
                this.drawableW = intrinsicWidth;
                this.drawableH = i;
                this.drawableRect = new Rect();
            }
            invalidate();
        }
    }

    public void setImageTextSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5480a59c", new Object[]{this, new Integer(i)});
            return;
        }
        this.imageTextSpace = mr7.a(i);
        invalidate();
    }

    public void setLineSpace(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727ca22c", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            this.lineSpacingExtra = i;
            super.setLineSpacing(i, 1.0f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
            return;
        }
        this.linesNum = i;
        super.setMaxLines(i);
        requestLayout();
        invalidate();
    }

    public void setSeparator(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f2e2f4", new Object[]{this, str});
        } else {
            this.separator = str;
        }
    }

    public void setTextBackground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82aa4668", new Object[]{this, drawable});
        } else if (drawable == null || !drawable.equals(this.textBgDrawable)) {
            this.textBgDrawable = drawable;
            invalidate();
        }
    }

    public void setTextBgPaddingH(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f20271", new Object[]{this, new Integer(i)});
        } else {
            this.xTextBgPaddingH = i;
        }
    }

    public void setTextBgPaddingV(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd5db23", new Object[]{this, new Integer(i)});
        } else {
            this.xTextBgPaddingV = i;
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        this.textPaint.setColor(i);
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0807134", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        this.textPaint.setTextSize(f);
        invalidate();
    }

    public void setXIconHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbc5946", new Object[]{this, new Integer(i)});
        } else {
            this.xIconHeight = owo.h(tq4.d(this), i);
        }
    }

    public XRichTextViewByCouponV3(Context context, AttributeSet attributeSet) {
        super(context);
        init(context, attributeSet);
    }

    public XRichTextViewByCouponV3(Context context, AttributeSet attributeSet, int i) {
        super(context);
        init(context, attributeSet);
    }
}
