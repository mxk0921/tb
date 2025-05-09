package com.taobao.homepage.dinamic3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.f4b;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RIconTextView extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable drawable;
    private int lineSpacingExtra;
    private TextPaint textPaint;
    private int linesNum = 2;
    private int ascent = 0;
    private final int textMarginLeft = 3;
    private int textSize = 0;

    static {
        t2o.a(729809066);
    }

    public RIconTextView(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16013b5d", new Object[]{this, context, attributeSet});
            return;
        }
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.lineSpacingExtra = 9;
        textPaint.setTextSize(getTextSize());
        this.textPaint.setColor(getTextColors().getColorForState(getDrawableState(), 0));
        this.textPaint.setAntiAlias(true);
        this.ascent = (int) this.textPaint.ascent();
    }

    public static /* synthetic */ Object ipc$super(RIconTextView rIconTextView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/view/RIconTextView");
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int breakText;
        String str;
        int i;
        int i2;
        int i3;
        CharSequence charSequence;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (!TextUtils.isEmpty(getText())) {
            this.ascent = (int) this.textPaint.ascent();
            CharSequence text = getText();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop() + (-this.ascent);
            Drawable drawable = this.drawable;
            if (drawable != null) {
                i4 = drawable.getBounds().width();
                this.drawable.draw(canvas);
            }
            if (f4b.b("enableIconTextViewImprovement", true)) {
                breakText = this.textPaint.breakText(text, 0, text.length(), true, width - i4, null);
            } else {
                breakText = this.textPaint.breakText(text.toString(), true, width - i4, null);
            }
            int i5 = breakText;
            int i6 = 0;
            String str2 = "enableIconTextViewImprovement";
            int i7 = paddingLeft;
            int i8 = width;
            CharSequence charSequence2 = text;
            canvas.drawText(text, 0, i5, i4 + paddingLeft + 3, paddingTop, this.textPaint);
            if (i5 < charSequence2.length()) {
                int i9 = paddingTop;
                int i10 = 1;
                while (i10 < this.linesNum) {
                    int i11 = i10 + 1;
                    int i12 = i9 + this.lineSpacingExtra + this.textSize;
                    int i13 = i6 + i5;
                    float f = i8;
                    if (this.textPaint.measureText(charSequence2, i13, charSequence2.length()) > f) {
                        i5 = this.textPaint.breakText(charSequence2, i13, charSequence2.length(), true, f, null);
                        if (f4b.b(str2, true)) {
                            CharSequence subSequence = charSequence2.subSequence(i13, i13 + i5);
                            i3 = i7;
                            str = str2;
                            charSequence = charSequence2;
                            i2 = i13;
                            i = i12;
                            canvas.drawText(subSequence, 0, subSequence.length(), i3, i12, this.textPaint);
                        } else {
                            str = str2;
                            charSequence = charSequence2;
                            i2 = i13;
                            i = i12;
                            i3 = i7;
                            canvas.drawText(charSequence.toString().substring(i2, i2 + i5), i3, i, this.textPaint);
                        }
                        i7 = i3;
                        i9 = i;
                        str2 = str;
                        i10 = i11;
                        charSequence2 = charSequence;
                        i6 = i2;
                        i8 = i8;
                    } else {
                        canvas.drawText(charSequence2, i13, charSequence2.length(), i7, i12, this.textPaint);
                        return;
                    }
                }
            }
        }
    }

    public void setIcon(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a1c526", new Object[]{this, drawable});
        } else if (this.drawable != drawable) {
            this.drawable = drawable;
            if (drawable != null) {
                int paddingTop = (int) (getPaddingTop() + (-this.textPaint.ascent()));
                int intrinsicWidth = this.drawable.getIntrinsicWidth();
                int intrinsicHeight = this.drawable.getIntrinsicHeight();
                int textSize = (int) this.textPaint.getTextSize();
                if (textSize != intrinsicHeight) {
                    intrinsicWidth = (intrinsicWidth * textSize) / intrinsicHeight;
                }
                int descent = (int) (((paddingTop + this.textPaint.descent()) - textSize) / 2.0f);
                this.drawable.setBounds(0, descent, intrinsicWidth, textSize + descent);
            }
            invalidate();
        }
    }

    public void setLineSpacingExtra(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf919", new Object[]{this, new Integer(i)});
            return;
        }
        this.lineSpacingExtra = i;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d1eeff", new Object[]{this, new Integer(i)});
            return;
        }
        this.linesNum = i;
        requestLayout();
        invalidate();
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
        this.textSize = (int) f;
        this.textPaint.setTextSize(f);
        invalidate();
    }

    public RIconTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public RIconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
