package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class p34 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f25851a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final String e;

    static {
        t2o.a(815792335);
    }

    public p34(String str, String str2, Integer num, Integer num2, String str3) {
        ckf.g(str2, "text");
        this.f25851a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
        this.e = str3;
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("3f1e3ca1", new Object[]{this});
        }
        return this.d;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25631a6a", new Object[]{this});
        }
        return this.f25851a;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.b;
    }

    public final Integer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5a1baf6e", new Object[]{this});
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p34)) {
            return false;
        }
        p34 p34Var = (p34) obj;
        if (ckf.b(this.f25851a, p34Var.f25851a) && ckf.b(this.b, p34Var.b) && ckf.b(this.c, p34Var.c) && ckf.b(this.d, p34Var.d) && ckf.b(this.e, p34Var.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f25851a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = ((i * 31) + this.b.hashCode()) * 31;
        Integer num = this.c;
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.hashCode();
        }
        int i5 = (hashCode + i2) * 31;
        Integer num2 = this.d;
        if (num2 == null) {
            i3 = 0;
        } else {
            i3 = num2.hashCode();
        }
        int i6 = (i5 + i3) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i6 + i4;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CommentInfo(numComment=" + this.f25851a + ", text=" + this.b + ", textColor=" + this.c + ", numColor=" + this.d + ", showMinComment=" + this.e + ')';
    }
}
