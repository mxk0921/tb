package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gg0 extends ImageSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 0;
    public static final int ALIGN_TOP = 1;

    /* renamed from: a  reason: collision with root package name */
    public int f19963a;
    public int b;
    public int c;
    public Path e;
    public int g;
    public int h;
    public int d = 0;
    public String f = "cover";
    public RectF i = null;

    static {
        t2o.a(503317354);
    }

    public gg0(Drawable drawable, int i, int i2) {
        super(drawable, i);
        this.f19963a = i2;
    }

    public static /* synthetic */ Object ipc$super(gg0 gg0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/span/AdvancedImageSpan");
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e73c6b9", new Object[]{this, new Float(f)});
        } else if (f > 0.0f) {
            Path path = this.e;
            if (path == null) {
                this.e = new Path();
            } else {
                path.reset();
            }
            this.e.addRoundRect(new RectF(0.0f, 0.0f, getDrawable().getBounds().width(), getDrawable().getBounds().height()), f, f, Path.Direction.CW);
        }
    }

    public void b(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ba02e96", new Object[]{this, fArr});
        } else if (fArr != null) {
            for (float f : fArr) {
                if (f > 0.0f) {
                    Path path = this.e;
                    if (path == null) {
                        this.e = new Path();
                    } else {
                        path.reset();
                    }
                    this.e.addRoundRect(new RectF(0.0f, 0.0f, getDrawable().getBounds().width(), getDrawable().getBounds().height()), fArr, Path.Direction.CW);
                    return;
                }
            }
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8120324", new Object[]{this, new Integer(i)});
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f05e5b0b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint.FontMetrics fontMetrics;
        Paint.FontMetrics fontMetrics2;
        boolean z;
        float f2;
        int i6;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i7 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        Drawable drawable = getDrawable();
        int height = drawable.getBounds().height();
        canvas.save();
        canvas.translate(this.b, 0.0f);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i8 = this.g;
        if (i8 <= 0) {
            i8 = drawable.getBounds().width();
        }
        int i9 = this.h;
        if (i9 <= 0) {
            i9 = drawable.getBounds().height();
        }
        if ("contain".equals(this.f)) {
            if (intrinsicWidth * i9 > i8 * intrinsicHeight) {
                f8 = (i8 * 1.0f) / intrinsicWidth;
                f6 = (i9 - (intrinsicHeight * f8)) * 0.5f;
                f7 = 0.0f;
            } else {
                f8 = (i9 * 1.0f) / intrinsicHeight;
                f7 = (i8 - (intrinsicWidth * f8)) * 0.5f;
                f6 = 0.0f;
            }
            drawable.setBounds(0, 0, (int) (intrinsicWidth * f8), (int) (intrinsicHeight * f8));
            canvas.translate(f7, f6);
            this.i = null;
            fontMetrics = null;
        } else if ("cover".equals(this.f)) {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (intrinsicWidth * i9 > i8 * intrinsicHeight) {
                f5 = (i9 * 1.0f) / intrinsicHeight;
                f4 = ((intrinsicWidth * f5) - i8) * 0.5f;
                f3 = 0.0f;
            } else {
                f5 = (i8 * 1.0f) / intrinsicWidth;
                f3 = ((intrinsicHeight * f5) - i9) * 0.5f;
                f4 = 0.0f;
            }
            drawable.setBounds(0, 0, (int) (intrinsicWidth * f5), (int) (intrinsicHeight * f5));
            this.i = new RectF(f4, f3, i8 + f4, i9 + f3);
            canvas.translate(-f4, -f3);
            fontMetrics = null;
        } else {
            drawable.setBounds(0, 0, i8, i9);
            fontMetrics = null;
            this.i = null;
        }
        int i10 = i5 - i3;
        if (paint != null) {
            fontMetrics2 = paint.getFontMetrics();
            if (fontMetrics2 != null) {
                i10 = (int) (fontMetrics2.bottom - fontMetrics2.top);
            }
        } else {
            fontMetrics2 = fontMetrics;
        }
        if (fontMetrics2 != null) {
            z = true;
        } else {
            z = false;
        }
        int i11 = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (z) {
                        f2 = (i4 + fontMetrics2.descent) - height;
                        i6 = 2;
                    } else {
                        i7 = i10 - height;
                    }
                }
                i6 = 2;
                f2 = 0.0f;
            } else {
                if (z) {
                    f2 = i4 + fontMetrics2.ascent;
                    i6 = 2;
                }
                i6 = 2;
                f2 = 0.0f;
            }
        } else if (z) {
            float f9 = i4;
            f2 = ((((fontMetrics2.descent + f9) + f9) + fontMetrics2.ascent) / 2.0f) - ((height * 1.0f) / 2.0f);
            i6 = 2;
        } else {
            i6 = 2;
            i7 = (i10 - height) / 2;
            f2 = 0.0f;
        }
        if (!z) {
            f2 = (i7 + i3) - (this.f19963a / i6);
        }
        canvas.translate(f, f2);
        Path path = this.e;
        if (path != null && !path.isEmpty()) {
            canvas.clipPath(this.e);
        }
        RectF rectF = this.i;
        if (rectF != null) {
            canvas.clipRect(rectF);
        }
        drawable.draw(canvas);
        canvas.restore();
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf919", new Object[]{this, new Integer(i)});
        } else {
            this.f19963a = i;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274d54e5", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right + this.b + this.c;
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f74b90", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146c4f8f", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }
}
