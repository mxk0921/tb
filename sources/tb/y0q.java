package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y0q extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f31770a;
    public final RectF b = new RectF();
    public final Paint c = b(Color.rgb(245, 245, 245));
    public final Paint d = b(Color.rgb(230, 230, 230));
    public final Paint e = b(Color.rgb(241, 241, 241));
    public final Paint f = b(Color.rgb(250, 250, 250));

    static {
        t2o.a(912262923);
    }

    public static /* synthetic */ Object ipc$super(y0q y0qVar, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/SkeletonLoadingRecommendDrawable");
    }

    public final void a(Canvas canvas, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2cb6321", new Object[]{this, canvas, new Integer(i), new Integer(i2)});
            return;
        }
        int c = c(16);
        int c2 = c(351);
        int c3 = c(351);
        int c4 = c(319);
        int c5 = c(32);
        int c6 = c(222);
        int c7 = c(10);
        int c8 = c(12);
        int c9 = c(16);
        RectF d = d(c, 0, c2, c3);
        float f = c8;
        canvas.drawRoundRect(d, f, f, this.e);
        int i3 = c + c2 + c;
        canvas.drawRoundRect(d(i3, 0, c2, c3), f, f, this.e);
        canvas.save();
        float f2 = i2;
        canvas.translate(0.0f, d.bottom + f2);
        RectF d2 = d(i, 0, c4, c5);
        float f3 = c9;
        canvas.drawRoundRect(d2, f3, f3, this.f);
        int i4 = i3 + c;
        canvas.drawRoundRect(d(i4, 0, c4, c5), f3, f3, this.f);
        float f4 = d2.bottom;
        float f5 = c7;
        canvas.translate(0.0f, f4 + f5);
        RectF d3 = d(i, 0, c4, c5);
        canvas.drawRoundRect(d3, f3, f3, this.f);
        canvas.drawRoundRect(d(i4, 0, c4, c5), f3, f3, this.f);
        canvas.translate(0.0f, d3.bottom + f5);
        RectF d4 = d(i, 0, c6, c5);
        canvas.drawRoundRect(d4, f3, f3, this.f);
        canvas.drawRoundRect(d(i4, 0, c6, c5), f3, f3, this.f);
        canvas.save();
        canvas.translate(0.0f, d4.bottom + f2);
    }

    public final Paint b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("ecdb6449", new Object[]{this, new Integer(i)});
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setAntiAlias(true);
        return paint;
    }

    public final int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8aaec3a", new Object[]{this, new Integer(i)})).intValue();
        }
        return (int) ((((this.f31770a * 1.0f) / 750.0f) * i) + 0.5f);
    }

    public final RectF d(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("346c8914", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        this.b.set(i, i2, i3 + i, i4 + i2);
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        int c = c(16);
        int c2 = c(32);
        int c3 = c(32);
        int c4 = c(163);
        int c5 = c(36);
        int c6 = c(18);
        canvas.drawColor(-1);
        canvas.drawRect(0.0f, 0.0f, this.f31770a, c, this.c);
        canvas.save();
        canvas.translate(0.0f, c + c3);
        RectF d = d(c2, 0, c4, c5);
        float f = c6;
        canvas.drawRoundRect(d, f, f, this.d);
        canvas.save();
        canvas.translate(0.0f, d.bottom + c3);
        for (int i = 0; i < 3; i++) {
            a(canvas, c2, c3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        rect.height();
        this.f31770a = rect.width();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }
}
