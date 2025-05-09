package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TypefaceEmojiSpan extends EmojiSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Paint sDebugPaint;
    private TextPaint mWorkingPaint;

    public TypefaceEmojiSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        super(typefaceEmojiRasterizer);
    }

    private TextPaint applyCharacterSpanStyles(CharSequence charSequence, int i, int i2, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextPaint) ipChange.ipc$dispatch("6e31450f", new Object[]{this, charSequence, new Integer(i), new Integer(i2), paint});
        }
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0 && (characterStyleArr.length != 1 || characterStyleArr[0] != this)) {
                TextPaint textPaint = this.mWorkingPaint;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.mWorkingPaint = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    if (!(characterStyle instanceof MetricAffectingSpan)) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
                return textPaint;
            } else if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            } else {
                return null;
            }
        } else if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        } else {
            return null;
        }
    }

    private static Paint getDebugPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("cfd690a3", new Object[0]);
        }
        if (sDebugPaint == null) {
            TextPaint textPaint = new TextPaint();
            sDebugPaint = textPaint;
            textPaint.setColor(EmojiCompat.get().getEmojiSpanIndicatorColor());
            sDebugPaint.setStyle(Paint.Style.FILL);
        }
        return sDebugPaint;
    }

    public static /* synthetic */ Object ipc$super(TypefaceEmojiSpan typefaceEmojiSpan, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/emoji2/text/TypefaceEmojiSpan");
    }

    public void drawBackground(Canvas canvas, TextPaint textPaint, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba0076c", new Object[]{this, canvas, textPaint, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f, f3, f2, f4, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint2});
            return;
        }
        TextPaint applyCharacterSpanStyles = applyCharacterSpanStyles(charSequence, i, i2, paint2);
        if (!(applyCharacterSpanStyles == null || applyCharacterSpanStyles.bgColor == 0)) {
            drawBackground(canvas, applyCharacterSpanStyles, f, f + getWidth(), i3, i5);
        }
        if (EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
            canvas.drawRect(f, i3, f + getWidth(), i5, getDebugPaint());
        }
        TypefaceEmojiRasterizer typefaceRasterizer = getTypefaceRasterizer();
        float f2 = i4;
        if (applyCharacterSpanStyles != null) {
            paint2 = applyCharacterSpanStyles;
        }
        typefaceRasterizer.draw(canvas, f, f2, paint2);
    }
}
