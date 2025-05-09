package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class r2z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f27075a;
    public final int b;

    static {
        t2o.a(598737191);
    }

    public r2z() {
        this(0, 0, 3, null);
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5824f407", new Object[]{this})).intValue();
        }
        return this.f27075a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4db89faf", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2z)) {
            return false;
        }
        r2z r2zVar = (r2z) obj;
        if (this.f27075a == r2zVar.f27075a && this.b == r2zVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (this.f27075a * 31) + this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Configuration(connectTimeout=" + this.f27075a + ", readTimeout=" + this.b + ')';
    }

    public r2z(int i, int i2) {
        this.f27075a = i;
        this.b = i2;
    }

    public /* synthetic */ r2z(int i, int i2, int i3, a07 a07Var) {
        this((i3 & 1) != 0 ? 3000 : i, (i3 & 2) != 0 ? 10000 : i2);
    }
}
