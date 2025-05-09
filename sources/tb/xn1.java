package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xn1 extends vuu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int c;
    public final int d;
    public final String e;
    public Shader f;
    public int g;
    public int h;
    public Paint i;
    public final int j;
    public int k;
    public Rect l;
    public final boolean m;
    public final boolean n;

    static {
        t2o.a(986710121);
    }

    public xn1(String str, int i, int i2) {
        this.k = 0;
        this.m = true;
        this.e = str;
        this.c = i;
        this.d = i2;
        this.n = false;
        q(true);
    }

    public static /* synthetic */ Object ipc$super(xn1 xn1Var, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/BackgroundDrawable");
    }

    @Override // tb.vuu, android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // tb.vuu
    public void l(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (this.m) {
            canvas.drawRect(this.l, this.i);
        }
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("756dbba7", new Object[]{this})).intValue();
        }
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        this.l.set(rect);
        if (this.e != null) {
            if (!(this.f != null && this.g == rect.width() && this.h == rect.height())) {
                float[] e = cxh.e(this.e, rect.width(), rect.height());
                LinearGradient linearGradient = new LinearGradient(e[0], e[1], e[2], e[3], this.c, this.d, Shader.TileMode.CLAMP);
                this.f = linearGradient;
                this.i.setShader(linearGradient);
            }
            this.g = rect.width();
            this.h = rect.height();
        }
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3be7a5c3", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf041d", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i = new Paint(1);
        this.l = new Rect();
        if (!z) {
            this.i.setColor(this.j);
        }
        this.i.setStyle(Paint.Style.FILL);
    }

    public void r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903ef3f", new Object[]{this, new Integer(i)});
            return;
        }
        this.k = i;
        if (this.n) {
            this.i.setColor(i);
            invalidateSelf();
        }
    }

    @Override // tb.vuu, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else {
            this.i.setAlpha(i);
        }
    }

    @Override // tb.vuu, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else {
            this.i.setColorFilter(colorFilter);
        }
    }

    public xn1(int i) {
        this.k = 0;
        this.m = true;
        this.j = i;
        this.n = true;
        q(false);
        if (i == 0) {
            this.m = false;
        }
    }
}
