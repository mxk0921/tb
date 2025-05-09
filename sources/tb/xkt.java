package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xkt extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public slt b;
    public int e;
    public int f;
    public int g;
    public int h;

    /* renamed from: a  reason: collision with root package name */
    public boolean f31448a = false;
    public int c = 3;
    public final Rect d = new Rect();

    static {
        t2o.a(503317225);
    }

    public static /* synthetic */ Object ipc$super(xkt xktVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/drawable/TextDrawable");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.b = null;
        this.f31448a = false;
        this.c = 3;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7b394bf", new Object[]{this})).intValue();
        }
        slt sltVar = this.b;
        if (sltVar != null) {
            return sltVar.q();
        }
        return 1;
    }

    public void c(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7782c950", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        slt sltVar = this.b;
        if (sltVar != null) {
            sltVar.P(i, i2, i3, i4);
            invalidateSelf();
        }
    }

    public void d(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = i4;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        slt sltVar = this.b;
        if (sltVar != null && sltVar.B() != null) {
            boolean G = this.b.G();
            Picture u = this.b.u();
            if (!G || u != null || this.f31448a) {
                this.f31448a = true;
                canvas.save();
                int F = this.b.F();
                int p = this.b.p();
                int width = (getBounds().width() - this.e) - this.f;
                int height = getBounds().height();
                int i3 = this.g;
                int i4 = (height - i3) - this.h;
                int i5 = this.c;
                if ((i5 & 7) == 1) {
                    i = (width - F) / 2;
                } else {
                    i = 0;
                }
                if ((i5 & 112) == 16) {
                    i2 = (i4 - p) / 2;
                } else {
                    i2 = 0;
                }
                if ((8388615 & i5) == 8388613) {
                    i = width - F;
                }
                canvas.translate(this.e + i, i3 + i2);
                if (this.b.D() == null && akt.t0()) {
                    p = Math.min(p, i4);
                }
                canvas.clipRect(0, 0, F, p);
                this.b.m(canvas);
                canvas.restore();
            }
        }
    }

    public void e(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1ac5a", new Object[]{this, charSequence});
            return;
        }
        slt sltVar = this.b;
        if (sltVar != null) {
            sltVar.Q(charSequence);
            invalidateSelf();
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71780586", new Object[]{this, new Integer(i)});
        } else if (this.c != i) {
            this.c = i;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        slt sltVar = this.b;
        if (sltVar != null) {
            sltVar.S(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        if (this.d.isEmpty()) {
            return -1;
        }
        Rect rect = this.d;
        return rect.bottom - rect.top;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        if (this.d.isEmpty()) {
            return -1;
        }
        Rect rect = this.d;
        return rect.right - rect.left;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        slt sltVar = this.b;
        if (sltVar == null) {
            return -1;
        }
        return sltVar.t();
    }

    public void h(slt sltVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ee42c2", new Object[]{this, sltVar});
            return;
        }
        this.b = sltVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
        } else {
            this.d.set(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            return;
        }
        slt sltVar = this.b;
        if (sltVar != null) {
            sltVar.I(i);
            invalidateSelf();
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
