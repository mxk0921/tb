package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class q3n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f26491a;
    public int b;
    public int c;

    static {
        t2o.a(845152383);
    }

    public q3n(String str, int i, int i2) {
        ckf.g(str, "id");
        this.f26491a = str;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d7173a5", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.f26491a;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266ca9bb", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b393dc05", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddff9baf", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
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
        if (!(obj instanceof q3n)) {
            return false;
        }
        q3n q3nVar = (q3n) obj;
        if (ckf.b(this.f26491a, q3nVar.f26491a) && this.b == q3nVar.b && this.c == q3nVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((this.f26491a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PubTimesFatigue(id=" + this.f26491a + ", dayValue=" + this.b + ", timesValue=" + this.c + ')';
    }
}
