package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ogo extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Paint f25379a;
    public int b = 0;
    public final RectF c = new RectF();
    public final Path d = new Path();
    public int e = -24771;
    public int f = -761329;
    public boolean g = false;
    public final int h = DensityUtil.dip2px(Globals.getApplication(), 1.5f);

    static {
        t2o.a(815792564);
    }

    public ogo() {
        Paint paint = new Paint();
        this.f25379a = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setAntiAlias(true);
    }

    public static /* synthetic */ Object ipc$super(ogo ogoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/uikit/RoundRectWithArrowDrawable");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b087da32", new Object[]{this});
            return;
        }
        this.f25379a.setShader(new LinearGradient(0.0f, 0.0f, getBounds().width(), 0.0f, this.e, this.f, Shader.TileMode.CLAMP));
        invalidateSelf();
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26de7d2", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e5a209", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d685ef19", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else {
            canvas.drawPath(this.d, this.f25379a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        int min = Math.min(rect.width(), rect.height());
        if (!this.g) {
            i = this.h;
        }
        this.b = (min / 2) - i;
        this.c.set(rect);
        float f = i;
        this.c.inset(f, f);
        int i2 = this.b / 2;
        if (!this.g) {
            this.c.right -= i2;
        }
        this.d.reset();
        if (!this.g) {
            this.d.moveTo(this.c.right - this.b, f);
            this.d.lineTo(this.c.right + i2, rect.centerY());
            Path path = this.d;
            RectF rectF = this.c;
            path.lineTo(rectF.right - this.b, f + rectF.height());
        }
        Path path2 = this.d;
        RectF rectF2 = this.c;
        int i3 = this.b;
        path2.addRoundRect(rectF2, i3, i3, Path.Direction.CW);
        this.d.close();
        a();
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
