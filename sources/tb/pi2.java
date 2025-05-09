package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class pi2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f26108a;
    public boolean b;
    public r7m c;
    public boolean d;

    static {
        t2o.a(481296511);
    }

    public pi2(int i, boolean z, r7m r7mVar, boolean z2) {
        this.f26108a = i;
        this.b = z;
        this.c = r7mVar;
        this.d = z2;
    }

    public final r7m a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r7m) ipChange.ipc$dispatch("1b5570a7", new Object[]{this});
        }
        return this.c;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("632eaff0", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e18c32c7", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void d(r7m r7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0adb7d", new Object[]{this, r7mVar});
        } else {
            this.c = r7mVar;
        }
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d38274", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi2)) {
            return false;
        }
        pi2 pi2Var = (pi2) obj;
        if (this.f26108a == pi2Var.f26108a && this.b == pi2Var.b && ckf.b(this.c, pi2Var.c) && this.d == pi2Var.d) {
            return true;
        }
        return false;
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461bd8a3", new Object[]{this, new Integer(i)});
        } else {
            this.f26108a = i;
        }
    }

    public final void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8643d37d", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i3 = this.f26108a * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i3 + i4) * 31;
        r7m r7mVar = this.c;
        if (r7mVar != null) {
            i = r7mVar.hashCode();
        }
        int i7 = (i6 + i) * 31;
        boolean z2 = this.d;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        return i7 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BottomAreaCache(showType=" + this.f26108a + ", visible=" + this.b + ", allowanceData=" + this.c + ", showAllowance=" + this.d + ')';
    }
}
