package tb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ey8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int[] j = {0, -16777216};
    public static final int[] k = {-16777216, 0};
    public static final int[] l = {0, 0, -16777216};
    public static final int[] m = {-16777216, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    public final View f18883a;
    public int[] b;
    public final Paint c;
    public Shader d;
    public Shader e;
    public final Rect f = new Rect();
    public final Rect g = new Rect();
    public boolean h = false;
    public boolean i = false;

    static {
        t2o.a(503316909);
    }

    public ey8(View view) {
        Paint paint = new Paint(1);
        this.c = paint;
        this.f18883a = view;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e1f0ee", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b28cae", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c27bdaf1", new Object[]{this})).booleanValue();
        }
        int[] iArr = this.b;
        if (iArr == null) {
            return false;
        }
        if (iArr[0] > 0 || iArr[1] > 0) {
            return true;
        }
        return false;
    }

    public void d(Canvas canvas, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd00f03", new Object[]{this, canvas, new Integer(i)});
        } else {
            canvas.restoreToCount(i);
        }
    }

    public int e(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45d62592", new Object[]{this, canvas})).intValue();
        }
        return canvas.saveLayer(0.0f, 0.0f, this.f18883a.getWidth() + this.f18883a.getScrollX(), this.f18883a.getHeight(), null, 31);
    }

    public void f(Canvas canvas) {
        boolean z;
        int i;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d80e9e", new Object[]{this, canvas});
        } else if (c()) {
            Paint paint = this.c;
            int width = this.f18883a.getWidth() - this.f18883a.getPaddingRight();
            View view = this.f18883a;
            if (view instanceof HorizontalScrollView) {
                if (((HorizontalScrollView) view).getChildCount() != 0) {
                    view = ((HorizontalScrollView) this.f18883a).getChildAt(0);
                } else {
                    return;
                }
            }
            if (((view.getRight() - view.getLeft()) - this.f18883a.getScrollX()) - width > 0) {
                z = true;
            } else {
                z = false;
            }
            int scrollX = this.f18883a.getScrollX();
            if (this.i) {
                i = this.f18883a.getPaddingLeft();
            } else {
                i = 0;
            }
            if (scrollX <= i) {
                z2 = false;
            }
            if (z || this.h) {
                i();
                paint.setShader(this.e);
                canvas.drawRect(this.g, paint);
            }
            if (z2 || this.h) {
                h();
                paint.setShader(this.d);
                canvas.drawRect(this.f, paint);
            }
        }
    }

    public void g(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bad10d0", new Object[]{this, iArr});
            return;
        }
        if (!(iArr == null || iArr.length == 4)) {
            iArr = null;
        }
        this.b = iArr;
        this.f18883a.invalidate();
    }

    public final void h() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b30a527c", new Object[]{this});
            return;
        }
        int[] iArr = this.b;
        int i2 = iArr[0] + iArr[2];
        if (this.i) {
            i = 0;
        } else {
            i = this.f18883a.getPaddingLeft();
        }
        int scrollX = i + this.f18883a.getScrollX();
        int paddingTop = this.f18883a.getPaddingTop();
        int i3 = scrollX + i2;
        this.f.set(scrollX, paddingTop, i3, this.f18883a.getHeight() - this.f18883a.getPaddingBottom());
        int i4 = this.b[2];
        if (i4 > 0) {
            float f = paddingTop;
            this.d = new LinearGradient(scrollX, f, i3, f, l, new float[]{0.0f, (i4 * 1.0f) / i2, 1.0f}, Shader.TileMode.CLAMP);
            return;
        }
        float f2 = paddingTop;
        this.d = new LinearGradient(scrollX, f2, i3, f2, j, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void i() {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9966e11f", new Object[]{this});
            return;
        }
        int[] iArr2 = this.b;
        int i = iArr2[1] + iArr2[3];
        int paddingLeft = ((this.f18883a.getPaddingLeft() + ((this.f18883a.getWidth() - this.f18883a.getPaddingLeft()) - this.f18883a.getPaddingRight())) - i) + this.f18883a.getScrollX();
        int paddingTop = this.f18883a.getPaddingTop();
        int i2 = paddingLeft + i;
        this.g.set(paddingLeft, paddingTop, i2, this.f18883a.getHeight() - this.f18883a.getPaddingBottom());
        if (this.b[3] > 0) {
            float f = paddingTop;
            this.e = new LinearGradient(paddingLeft, f, i2, f, m, new float[]{0.0f, (iArr[1] * 1.0f) / i, 1.0f}, Shader.TileMode.CLAMP);
            return;
        }
        float f2 = paddingTop;
        this.e = new LinearGradient(paddingLeft, f2, i2, f2, k, (float[]) null, Shader.TileMode.CLAMP);
    }
}
