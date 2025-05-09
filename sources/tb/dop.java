package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class dop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f17987a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public int f;
    public int g;

    static {
        t2o.a(766510318);
    }

    public dop() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e44587c4", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a88d714", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("418165d0", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3bdceada", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9102a0c8", new Object[]{this})).intValue();
        }
        return this.f17987a;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d90800e", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae96c4dc", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public final void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b97675e", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public final void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ef64d2", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55282f70", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c39254", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf7cae", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public final void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35198f5d", new Object[]{this, new Integer(i)});
            return;
        }
        this.f17987a = i;
        this.b = i;
    }

    public dop(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f17987a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i7;
        this.g = i8;
    }

    public /* synthetic */ dop(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, a07 a07Var) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 0 : i2, (i9 & 4) != 0 ? 0 : i3, (i9 & 8) != 0 ? 0 : i4, (i9 & 16) != 0 ? 0 : i5, (i9 & 32) != 0 ? 0 : i6, (i9 & 64) != 0 ? 0 : i7, (i9 & 128) == 0 ? i8 : 0);
    }
}
