package tb;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ek2 extends GradientDrawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Paint f18635a = new Paint();
    public final jfw b;
    public int c;
    public int d;

    static {
        t2o.a(503317219);
    }

    public ek2(jfw jfwVar) {
        this.b = jfwVar;
    }

    public static /* synthetic */ Object ipc$super(ek2 ek2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/drawable/BoxShadowDrawable");
    }

    public final void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2942c1a1", new Object[]{this, canvas});
            return;
        }
        int d = d(-this.b.G.f21974a, this.c, 0);
        int d2 = d(-this.b.G.b, this.d, 0);
        int i = this.c;
        int d3 = d(i - this.b.G.f21974a, i, 0);
        int i2 = this.d;
        int d4 = d(i2 - this.b.G.b, i2, 0);
        if (this.b.E != 1) {
            this.f18635a.setMaskFilter(null);
            this.f18635a.setColor(this.b.E);
            RectF rectF = new RectF(d, d2, d3, d4);
            int i3 = this.b.J;
            canvas.drawRoundRect(rectF, i3, i3, this.f18635a);
        }
    }

    public final void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179b3338", new Object[]{this, canvas});
            return;
        }
        int d = d(this.b.G.f21974a, this.c, 0);
        int d2 = d(this.b.G.b, this.d, 0);
        int i = this.c;
        int d3 = d(this.b.G.f21974a + i, i, 0);
        int i2 = this.d;
        int d4 = d(this.b.G.b + i2, i2, 0);
        this.f18635a.setColor(this.b.G.e);
        if (this.b.G.c > 0) {
            this.f18635a.setMaskFilter(new BlurMaskFilter(this.b.G.c, BlurMaskFilter.Blur.NORMAL));
        }
        RectF rectF = new RectF(d, d2, d3, d4);
        int i3 = this.b.J;
        canvas.drawRoundRect(rectF, i3, i3, this.f18635a);
    }

    public final boolean c(int i, int i2) {
        jfw.a aVar;
        jfw.a aVar2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91ab9f9", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        jfw jfwVar = this.b;
        if (jfwVar == null || (aVar = jfwVar.G) == null || i <= Math.abs(aVar.f21974a) * 2 || i2 <= Math.abs(this.b.G.b) * 2 || (i3 = (aVar2 = this.b.G).c) < 0) {
            return true;
        }
        if (i3 == 0 && aVar2.f21974a == 0 && aVar2.b == 0) {
            return true;
        }
        return false;
    }

    public final int d(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3fd5500", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i > i2) {
            return i2;
        }
        return Math.max(i, i3);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        try {
            this.c = getBounds().width();
            int height = getBounds().height();
            this.d = height;
            if (!c(this.c, height)) {
                b(canvas);
                a(canvas);
            }
        } catch (OutOfMemoryError e) {
            tfs.d(e.getMessage());
        }
    }
}
