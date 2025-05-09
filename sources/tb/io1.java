package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.RichTextContainerComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class io1 extends ImageSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Boolean n = null;

    /* renamed from: a  reason: collision with root package name */
    public int f21475a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i = 0;
    public int j = 0;
    public boolean k = false;
    public final a l;
    public String m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        int getLineCount();

        int getLineSpacing();
    }

    static {
        t2o.a(503317355);
    }

    public io1(a aVar, Drawable drawable, int i) {
        super(drawable, i);
        this.l = aVar;
    }

    public static /* synthetic */ Object ipc$super(io1 io1Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -441663370) {
            super.draw((Canvas) objArr[0], (CharSequence) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).floatValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), (Paint) objArr[8]);
            return null;
        } else if (hashCode == 1176909976) {
            return new Integer(super.getSize((Paint) objArr[0], (CharSequence) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), (Paint.FontMetricsInt) objArr[4]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/flexbox/layoutmanager/span/BackgroundSpan");
        }
    }

    public int a(int i, int i2, int i3, int i4, int i5, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7492c478", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), paint})).intValue();
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (akt.k0()) {
            return i + (((int) (i5 - (fontMetrics.bottom - fontMetrics.top))) / 2);
        }
        float f = fontMetrics.descent;
        return (int) Math.ceil((i3 - (((i5 - f) + fontMetrics.ascent) / 2.0f)) - f);
    }

    public void b(Canvas canvas, CharSequence charSequence, int i, int i2, int i3, int i4, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5c1942", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), paint});
        } else {
            canvas.drawText(d(charSequence, i, i2), i3, i4, paint);
        }
    }

    public int c(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c35ab90", new Object[]{this, paint})).intValue();
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (int) Math.ceil(fontMetrics.bottom - fontMetrics.top);
    }

    public String d(CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("384c294e", new Object[]{this, charSequence, new Integer(i), new Integer(i2)});
        }
        return charSequence.toString().substring(i, i2);
    }

    public int e(Paint paint, CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6e89bbf", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2)})).intValue();
        }
        return Math.round(paint.measureText(charSequence, i, i2));
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f78186", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8120324", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250adb03", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d66b28", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274d54e5", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f74b90", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66e5342", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b9af26", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7116396f", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a528b596", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
        } else {
            this.f21475a = i;
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96fa4c10", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        int i3 = this.i;
        if (i3 == 0) {
            i3 = e(paint, charSequence, i, i2) + this.d + this.e + (this.h * 2);
        }
        int i4 = this.j;
        if (i4 == 0) {
            i4 = c(paint) + this.b + this.c + (this.h * 2);
        }
        getDrawable().setBounds(0, 0, i3, i4);
        if (n == null) {
            if (od0.D().g() != null) {
                n = Boolean.valueOf(od0.D().g().b("updateFontMetrics", "true").equals("true"));
            } else {
                n = Boolean.TRUE;
            }
        }
        if (n.booleanValue()) {
            return i3 + this.f + this.g;
        }
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt) + this.f + this.g;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i6), paint});
            return;
        }
        canvas.save();
        canvas.translate(this.f, 0.0f);
        int e = e(paint, charSequence, i, i2);
        int width = getDrawable().getBounds().width();
        int height = getDrawable().getBounds().height();
        a aVar = this.l;
        int lineSpacing = (aVar == null || aVar.getLineCount() <= 1) ? 0 : this.l.getLineSpacing();
        if (this instanceof RichTextContainerComponent.e) {
            i6 += lineSpacing;
        } else if (!(this instanceof RichTextContainerComponent.f)) {
            i6 -= lineSpacing;
        }
        a aVar2 = this.l;
        if (aVar2 != null && i6 > ((height + aVar2.getLineSpacing()) * this.l.getLineCount()) - this.l.getLineSpacing()) {
            i6 -= this.l.getLineSpacing();
        }
        int i7 = i6 - (((i6 - i3) - height) / 2);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i7, paint);
        int i8 = this.f21475a;
        if (i8 != 0) {
            paint.setColor(i8);
        }
        if (this.k) {
            paint.setTypeface(Typeface.DEFAULT_BOLD);
        }
        int a2 = a(i4, i3, i7, i6, height, paint);
        String str = this.m;
        if (str == null) {
            paint.setStrikeThruText(false);
            paint.setUnderlineText(false);
        } else if (pg1.ATOM_EXT_UDL_line_through.equals(str)) {
            paint.setStrikeThruText(true);
        } else if (pg1.ATOM_EXT_underline.equals(this.m)) {
            paint.setUnderlineText(true);
        }
        b(canvas, charSequence, i, i2, (int) (((width - e) / 2) + f), a2, paint);
        canvas.restore();
    }
}
