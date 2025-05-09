package tb;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v0q extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ORIGIN_HEIGHT = 102;
    public static final int ORIGIN_WIDTH = 750;
    public Paint b;
    public int d;
    public int e;

    /* renamed from: a  reason: collision with root package name */
    public final RectF f29716a = new RectF();
    public final Paint c = b(Color.rgb(238, 238, 238));

    static {
        t2o.a(912262921);
    }

    public static /* synthetic */ Object ipc$super(v0q v0qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/SkeletonBottomLoadingDrawable");
    }

    public final Paint a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("33f08500", new Object[]{this});
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new LinearGradient(0.0f, 0.0f, c(440), 0.0f, new int[]{Color.rgb(255, 196, 0), Color.rgb(255, 148, 1), Color.rgb(255, 124, 0), Color.rgb(255, 86, 9)}, new float[]{0.0f, 0.5f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        return paint;
    }

    public final Paint b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("9ef678f8", new Object[]{this, new Integer(i)});
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        return paint;
    }

    public final int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8aaec3a", new Object[]{this, new Integer(i)})).intValue();
        }
        return (int) ((((this.d * 1.0f) / 750.0f) * i) + 0.5f);
    }

    public final RectF d(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("346c8914", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        this.f29716a.set(c(i), c(i2), c(i3 + i), c(i4 + i2));
        return this.f29716a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int c;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (this.b != null) {
            if (nj7.e()) {
                canvas.translate(0.0f, this.e);
            }
            canvas.drawColor(-1);
            float c2 = c(10);
            canvas.drawRoundRect(d(30, 20, 35, 35), c2, c2, this.c);
            canvas.drawRoundRect(d(123, 20, 35, 35), c2, c2, this.c);
            canvas.drawRoundRect(d(216, 20, 35, 35), c2, c2, this.c);
            float c3 = this.e - c(35);
            this.f29716a.set(c(30), c3, c(65), c(20) + c);
            canvas.drawRoundRect(this.f29716a, c2, c2, this.c);
            this.f29716a.set(c(123), c3, c(158), c(20) + c);
            canvas.drawRoundRect(this.f29716a, c2, c2, this.c);
            this.f29716a.set(c(216), c3, c(251), c(20) + c);
            canvas.drawRoundRect(this.f29716a, c2, c2, this.c);
            canvas.save();
            if (nj7.e()) {
                i = this.d;
            } else {
                i = 0;
            }
            canvas.translate(i + c(Result.ALIPAY_READ_REG_INFO_FAILED), c(12));
            RectF d = d(0, 0, 440, 0);
            float c4 = this.e - (c(12) * 2);
            d.bottom = c4;
            float f = c4 / 2.0f;
            canvas.drawRoundRect(d, f, f, this.b);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        return 102;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        return 750;
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
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        if (nj7.e()) {
            i = rect.height() / 2;
        } else {
            i = rect.height();
        }
        this.e = i;
        boolean e = nj7.e();
        int width = rect.width();
        if (e) {
            width /= 2;
        }
        this.d = width;
        this.b = a();
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
