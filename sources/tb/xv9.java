package tb;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import androidx.core.view.GravityCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xv9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f31626a;
    public Drawable b;
    public final Rect c = new Rect();
    public final Rect d = new Rect();
    public int e = 119;
    public final boolean f = true;
    public boolean g = false;

    static {
        t2o.a(503317461);
    }

    public xv9(View view) {
        this.f31626a = view;
    }

    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            if (this.g) {
                this.g = false;
                Rect rect = this.c;
                Rect rect2 = this.d;
                int right = this.f31626a.getRight() - this.f31626a.getLeft();
                int bottom = this.f31626a.getBottom() - this.f31626a.getTop();
                if (this.f) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(this.f31626a.getPaddingLeft(), this.f31626a.getPaddingTop(), right - this.f31626a.getPaddingRight(), bottom - this.f31626a.getPaddingBottom());
                }
                Gravity.apply(this.e, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abb44a8", new Object[]{this});
            return;
        }
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful()) {
            this.b.setState(this.f31626a.getDrawableState());
        }
    }

    public Drawable c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("612f407a", new Object[]{this});
        }
        return this.b;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbafd8cf", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c74b21", new Object[]{this});
            return;
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919fb6e4", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.g = true;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60e92a9b", new Object[]{this});
        } else {
            this.g = true;
        }
    }

    public void h(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd13670", new Object[]{this, drawable});
            return;
        }
        Drawable drawable2 = this.b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                this.f31626a.unscheduleDrawable(this.b);
            }
            this.b = drawable;
            if (drawable != null) {
                drawable.setCallback(this.f31626a);
                if (drawable.isStateful()) {
                    drawable.setState(this.f31626a.getDrawableState());
                }
                if (this.e == 119) {
                    drawable.getPadding(new Rect());
                }
            }
            this.f31626a.requestLayout();
            this.f31626a.invalidate();
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc8f51b3", new Object[]{this, new Integer(i)});
        } else if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.e = i;
            if (i == 119 && this.b != null) {
                this.b.getPadding(new Rect());
            }
            this.f31626a.requestLayout();
        }
    }

    public boolean j(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        if (drawable == this.b) {
            return true;
        }
        return false;
    }
}
