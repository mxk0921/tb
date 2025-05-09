package tb;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fh3 extends ImageSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALIGN_CENTER = 2;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Drawable> f19292a;

    static {
        t2o.a(912262576);
    }

    public fh3(Drawable drawable, int i) {
        super(drawable, i);
    }

    public static /* synthetic */ Object ipc$super(fh3 fh3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/navbar/CenterImageSpan");
    }

    public final Drawable a() {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("24b88a3d", new Object[]{this});
        }
        WeakReference<Drawable> weakReference = this.f19292a;
        if (weakReference != null) {
            drawable = weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.f19292a = new WeakReference<>(drawable2);
        return drawable2;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
            return;
        }
        Drawable a2 = a();
        canvas.save();
        int i6 = i5 - a2.getBounds().bottom;
        int i7 = ((ImageSpan) this).mVerticalAlignment;
        if (i7 == 1) {
            i6 -= paint.getFontMetricsInt().descent;
        } else if (i7 == 2) {
            i6 = ((i5 - i3) / 2) - (a2.getBounds().height() / 2);
        }
        canvas.translate(f, i6);
        a2.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
        }
        Rect bounds = a().getBounds();
        if (fontMetricsInt != null) {
            int i3 = -bounds.bottom;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }
}
