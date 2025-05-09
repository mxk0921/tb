package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class qtt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f26930a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    static {
        t2o.a(1029701671);
    }

    public qtt() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("940115e0", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1e1d844", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fffe3ad", new Object[]{this})).intValue();
        }
        return this.f26930a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtt)) {
            return false;
        }
        qtt qttVar = (qtt) obj;
        if (this.f26930a == qttVar.f26930a && this.b == qttVar.b && this.c == qttVar.c && this.d == qttVar.d && this.e == qttVar.e && this.f == qttVar.f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((((((this.f26930a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TimeInfo(year=" + this.f26930a + ", month=" + this.b + ", day=" + this.c + ", hour=" + this.d + ", minute=" + this.e + ", second=" + this.f + ')';
    }

    public qtt(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f26930a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public /* synthetic */ qtt(int i, int i2, int i3, int i4, int i5, int i6, int i7, a07 a07Var) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6);
    }
}
