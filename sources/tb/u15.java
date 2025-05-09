package tb;

import android.graphics.drawable.StateListDrawable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u15 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f29069a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public StateListDrawable m;

    static {
        t2o.a(1039138831);
    }

    public StateListDrawable a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateListDrawable) ipChange.ipc$dispatch("8a2411ac", new Object[]{this});
        }
        this.m = new StateListDrawable();
        int i = this.e;
        if (!(i == -1 && this.k == -1)) {
            int i2 = this.k;
            if (i2 == -1 || i2 == 0) {
                this.k = this.g;
            }
            if (i == -1 || i == 0) {
                this.e = this.f29069a;
            }
            this.m.addState(cjq.d, yx7.a(this.e, this.k, this.f, this.l, null));
        }
        int i3 = this.d;
        if (!(i3 == -1 && this.j == -1)) {
            int i4 = this.j;
            if (i4 == -1 || i4 == 0) {
                this.j = this.g;
            }
            if (i3 == -1 || i3 == 0) {
                this.d = this.f29069a;
            }
            this.m.addState(cjq.b, yx7.a(this.d, this.j, this.f, this.l, null));
        }
        int i5 = this.c;
        if (!(i5 == -1 && this.i == -1)) {
            int i6 = this.i;
            if (i6 == -1 || i6 == 0) {
                this.i = this.g;
            }
            if (i5 == -1 || i5 == 0) {
                this.c = this.f29069a;
            }
            this.m.addState(cjq.f17103a, yx7.a(this.c, this.i, this.f, this.l, null));
        }
        int i7 = this.b;
        if (!(i7 == -1 && this.h == -1)) {
            int i8 = this.h;
            if (i8 == -1 || i8 == 0) {
                this.h = this.g;
            }
            if (i7 == -1 || i7 == 0) {
                this.b = this.f29069a;
            }
            this.m.addState(cjq.c, yx7.a(this.b, this.h, this.f, this.l, null));
        }
        return this.m;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else {
            this.f29069a = i;
        }
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3899970", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = i;
        this.f29069a = i;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbe664b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1345aa24", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fae5bc5", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738a7ba7", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6314d6e", new Object[]{this, new Integer(i)});
            return;
        }
        this.h = i;
        this.g = i;
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100d320d", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dad056a2", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47390843", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8120324", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void m(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
        } else {
            this.l = f;
        }
    }
}
