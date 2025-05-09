package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class woo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f30826a;
    public final int b;
    public final int c;
    public final int d;

    static {
        t2o.a(839909377);
    }

    public woo() {
        this(0, 0, 0, 0, 15, null);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89e4c91b", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2350677", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1d449e0", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9c9cf19", new Object[]{this})).intValue();
        }
        return this.f30826a;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woo)) {
            return false;
        }
        woo wooVar = (woo) obj;
        if (this.f30826a == wooVar.f30826a && this.b == wooVar.b && this.c == wooVar.c && this.d == wooVar.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((((this.f30826a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SafeAreaConfig(top=" + this.f30826a + ", bottom=" + this.b + ", left=" + this.c + ", right=" + this.d + ')';
    }

    public woo(int i, int i2, int i3, int i4) {
        this.f30826a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public /* synthetic */ woo(int i, int i2, int i3, int i4, int i5, a07 a07Var) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
