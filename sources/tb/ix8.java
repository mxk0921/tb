package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ix8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f21629a;
    public final int b;
    public final String c;

    static {
        t2o.a(481296936);
    }

    public ix8(int i, int i2, String str) {
        ckf.g(str, "msg");
        this.f21629a = i;
        this.b = i2;
        this.c = str;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a05a76f8", new Object[]{this})).intValue();
        }
        return this.f21629a;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ca0b3d", new Object[]{this})).intValue();
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
        if (!(obj instanceof ix8)) {
            return false;
        }
        ix8 ix8Var = (ix8) obj;
        if (this.f21629a == ix8Var.f21629a && this.b == ix8Var.b && ckf.b(this.c, ix8Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (((this.f21629a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FaceDetectResultBean(faceState=" + this.f21629a + ", token=" + this.b + ", msg=" + this.c + ')';
    }

    public /* synthetic */ ix8(int i, int i2, String str, int i3, a07 a07Var) {
        this(i, i2, (i3 & 4) != 0 ? "unknown" : str);
    }
}
