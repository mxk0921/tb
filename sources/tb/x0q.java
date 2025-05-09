package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x0q extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f31055a;
    public int b;
    public float g = 1.0f;
    public final Paint c = b(Color.rgb(236, 236, 236));
    public final Paint e = b(Color.rgb(245, 245, 245));
    public final Paint d = b(Color.rgb(250, 224, 211));
    public final RectF f = new RectF();

    static {
        t2o.a(912262922);
    }

    public static /* synthetic */ Object ipc$super(x0q x0qVar, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/SkeletonLoadingDrawable");
    }

    public final void a(Canvas canvas, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1dca47", new Object[]{this, canvas, new Integer(i), new Integer(i2)});
            return;
        }
        int c = c(200);
        int c2 = c(20);
        int c3 = c(7);
        int c4 = i2 + c(260) + (c * i);
        canvas.save();
        canvas.translate(0.0f, c4);
        canvas.drawRect(0.0f, 0.0f, this.f31055a, c(20), this.e);
        canvas.translate(c2, c(50));
        float f = c3;
        canvas.drawRoundRect(d(0, 0, 50, 25), f, f, this.c);
        canvas.translate(0.0f, c(95));
        canvas.drawRoundRect(d(0, 0, 50, 25), f, f, this.c);
        canvas.restore();
        canvas.save();
        canvas.translate(c(100), c4 + c(50));
        canvas.drawRoundRect(d(0, 0, 400, 25), f, f, this.c);
        canvas.translate(0.0f, c(95));
        canvas.drawRoundRect(d(0, 0, 300, 25), f, f, this.c);
        canvas.restore();
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
        return (int) ((((this.f31055a * 1.0f) / 750.0f) * i) + 0.5f);
    }

    public final RectF d(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("346c8914", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        this.f.set(c(i), c(i2), c(i3 + i), c(i4 + i2));
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        canvas.drawColor(-1);
        float f = this.f31055a;
        canvas.drawRect(0.0f, 0.0f, f, f * this.g, this.c);
        float f2 = this.g;
        if (f2 == 0.0f) {
            i = this.f31055a / 4;
        } else {
            i = (int) (this.f31055a * f2);
        }
        canvas.save();
        canvas.translate(0.0f, i);
        int c = c(20);
        int c2 = c(15);
        canvas.translate(c, c(30));
        RectF d = d(0, 0, 300, 30);
        float c3 = c(7);
        canvas.drawRoundRect(d, c3, c3, this.d);
        canvas.translate(0.0f, c(30) + c2);
        canvas.drawRoundRect(d(0, 0, 200, 20), c3, c3, this.c);
        canvas.translate(0.0f, c(20) + c2);
        canvas.drawRoundRect(d(0, 0, 550, 25), c3, c3, this.c);
        canvas.translate(0.0f, c(25) + c2);
        canvas.drawRoundRect(d(0, 0, 400, 25), c3, c3, this.c);
        canvas.translate(c(30), c(25) + (c2 * 2));
        RectF d2 = d(0, 0, 100, 20);
        canvas.drawRoundRect(d2, c3, c3, this.c);
        canvas.translate(c(Result.ALIPAY_RSAKEY_MALLOC_FAILED), 0.0f);
        canvas.drawRoundRect(d2, c3, c3, this.c);
        canvas.translate(c(Result.ALIPAY_RSAKEY_MALLOC_FAILED), 0.0f);
        canvas.drawRoundRect(d2, c3, c3, this.c);
        canvas.restore();
        canvas.save();
        canvas.translate(c(690), c(130) + i);
        canvas.drawRoundRect(d(0, 0, 40, 40), c3, c3, this.c);
        canvas.restore();
        for (int i2 = 0; e(i2, i); i2++) {
            a(canvas, i2, i);
        }
    }

    public final boolean e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("627d5a98", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i2 + c(260) + (c(200) * i) < this.b) {
            return true;
        }
        return false;
    }

    public x0q f(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x0q) ipChange.ipc$dispatch("5b0f860f", new Object[]{this, new Float(f)});
        }
        this.g = f;
        return this;
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
        this.b = rect.height();
        this.f31055a = rect.width();
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
