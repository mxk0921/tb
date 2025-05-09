package tb;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.stylekit.datatype.GradientColorVO;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e05 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f18189a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public int h;
    public int i;
    public int j;
    public int k;
    public GradientColorVO l;
    public int m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;

    static {
        t2o.a(1039138829);
    }

    public Drawable a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2f4d50bc", new Object[]{this, view});
        }
        if (this.q) {
            return yx7.a(this.m, this.b, (int) this.f18189a, this.g, this.l);
        }
        if (!this.n && !this.p) {
            return yx7.a(this.m, this.b, (int) this.f18189a, this.g, this.l);
        }
        u15 u15Var = new u15();
        u15Var.b(this.m);
        u15Var.c(this.h);
        u15Var.e(this.j);
        u15Var.d(this.i);
        u15Var.f(this.k);
        u15Var.l((int) this.f18189a);
        u15Var.g(this.b);
        u15Var.h(this.c);
        u15Var.i(this.d);
        u15Var.j(this.e);
        u15Var.k(this.f);
        u15Var.m(this.g);
        return u15Var.a();
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        this.m = i;
        boolean z = this.o;
        if (!z) {
            this.o = !z;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3899970", new Object[]{this, new Integer(i)});
            return;
        }
        this.h = i;
        boolean z = this.n;
        if (!z) {
            this.n = !z;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbe664b", new Object[]{this, new Integer(i)});
            return;
        }
        this.i = i;
        boolean z = this.n;
        if (!z) {
            this.n = !z;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1345aa24", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = i;
        boolean z = this.n;
        if (!z) {
            this.n = !z;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fae5bc5", new Object[]{this, new Integer(i)});
            return;
        }
        this.k = i;
        boolean z = this.n;
        if (!z) {
            this.n = !z;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738a7ba7", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6314d6e", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        boolean z = this.p;
        if (!z) {
            this.p = !z;
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100d320d", new Object[]{this, new Integer(i)});
            return;
        }
        this.d = i;
        boolean z = this.p;
        if (!z) {
            this.p = !z;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad056a2", new Object[]{this, new Integer(i)});
            return;
        }
        this.e = i;
        boolean z = this.p;
        if (!z) {
            this.p = !z;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47390843", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = i;
        boolean z = this.p;
        if (!z) {
            this.p = !z;
        }
    }

    public void l(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c811f7e1", new Object[]{this, new Float(f)});
        } else {
            this.f18189a = f;
        }
    }

    public void m(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
        } else {
            this.g = f;
        }
    }

    public void n(GradientColorVO gradientColorVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59e689a", new Object[]{this, gradientColorVO});
            return;
        }
        this.l = gradientColorVO;
        boolean z = this.q;
        if (!z) {
            this.q = !z;
        }
    }
}
