package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nre extends ImageSpan implements hpc.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f24899a;
    public final int b;
    public final int c;
    public final int d;
    public Object e;
    public final String f;

    static {
        t2o.a(986710213);
        t2o.a(982516044);
    }

    public nre(int i, int i2, int i3, int i4, String str) {
        super(new ox7(i, i2, i3, i4), 1);
        this.f24899a = i;
        this.b = i2;
        this.f = str;
        this.c = i3;
        this.d = i4;
        getDrawable().setBounds(0, 0, i + i3 + i4, i2);
    }

    public static /* synthetic */ Object ipc$super(nre nreVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/richtext/span/ImgSpan");
    }

    public Drawable a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("ff547a30", new Object[]{this});
        }
        return ((ox7) getDrawable()).a();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2bd8590b", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.hpc.a
    public void c(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ebcd44", new Object[]{this, drawable});
        } else {
            ((ox7) getDrawable()).b(drawable);
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        Drawable drawable = getDrawable();
        int height = (i3 + ((i5 - i3) / 2)) - (drawable.getBounds().height() / 2);
        canvas.translate(f, height);
        drawable.draw(canvas);
        canvas.translate(-f, -height);
    }

    @Override // tb.hpc.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e62fda", new Object[]{this});
        }
    }

    @Override // tb.hpc.a
    public void g(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11aa67b", new Object[]{this, obj});
        } else {
            this.e = obj;
        }
    }

    @Override // tb.hpc.a
    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.b;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        if (fontMetricsInt != null) {
            int i3 = -this.b;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return this.f24899a + this.c + this.d;
    }

    @Override // tb.hpc.a
    public Object getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("61e2c7a7", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.hpc.a
    public int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.f24899a;
    }
}
