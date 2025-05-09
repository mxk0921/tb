package tb;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f30716a;
    public int b;
    public int c;
    public int d;
    public Path e;

    static {
        t2o.a(993001681);
    }

    public wig(View view) {
        ckf.g(view, "view");
        this.f30716a = view;
    }

    public final void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        if (this.e != null) {
            canvas.restore();
        }
    }

    public final void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        if (this.e != null) {
            canvas.save();
            canvas.clipPath(this.e);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60e92a9b", new Object[]{this});
        } else {
            g();
        }
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aad469d", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        g();
        this.f30716a.invalidate();
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843a6316", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d38277", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = i;
        g();
        this.f30716a.invalidate();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5f1215", new Object[]{this});
        } else if (this.b == 0 && this.c == 0) {
            this.e = null;
        } else if (this.f30716a.getWidth() != 0 && this.f30716a.getHeight() != 0) {
            Path path = this.e;
            if (path == null) {
                this.e = new Path();
            } else {
                ckf.d(path);
                path.reset();
            }
            float f = this.b;
            float f2 = this.c;
            Path path2 = this.e;
            ckf.d(path2);
            path2.addRoundRect(new RectF(0.0f, this.d, this.f30716a.getWidth(), this.f30716a.getHeight()), new float[]{f, f, f, f, f2, f2, f2, f2}, Path.Direction.CW);
        }
    }
}
