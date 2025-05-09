package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class wk9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f30741a;
    public int b;
    public int c;

    static {
        t2o.a(815792372);
    }

    public wk9(int i, int i2, int i3) {
        this.f30741a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d2b25d4", new Object[]{this})).intValue();
        }
        return this.f30741a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d28b884", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77226e4", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("948dc9b6", new Object[]{this, new Integer(i)});
        } else {
            this.f30741a = i;
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de544006", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
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
        if (!(obj instanceof wk9)) {
            return false;
        }
        wk9 wk9Var = (wk9) obj;
        if (this.f30741a == wk9Var.f30741a && this.b == wk9Var.b && this.c == wk9Var.c) {
            return true;
        }
        return false;
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d389da6", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((this.f30741a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FlashSaleTime(hour=" + this.f30741a + ", minute=" + this.b + ", second=" + this.c + ')';
    }
}
