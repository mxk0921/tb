package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class rp7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f27527a;
    public final int b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Set<String> f;
    public final String g;
    public final String h;
    public String i;
    public boolean j;

    static {
        t2o.a(815792344);
    }

    public rp7(int i, int i2, String str, String str2, Integer num, Set<String> set, String str3, String str4, String str5, boolean z) {
        this.f27527a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = num;
        this.f = set;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = z;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this});
        }
        return this.c;
    }

    public final Set<String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6bbc37c1", new Object[]{this});
        }
        return this.f;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82244c22", new Object[]{this});
        }
        return this.h;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7393055", new Object[]{this});
        }
        return this.g;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp7)) {
            return false;
        }
        rp7 rp7Var = (rp7) obj;
        if (this.f27527a == rp7Var.f27527a && this.b == rp7Var.b && ckf.b(this.c, rp7Var.c) && ckf.b(this.d, rp7Var.d) && ckf.b(this.e, rp7Var.e) && ckf.b(this.f, rp7Var.f) && ckf.b(this.g, rp7Var.g) && ckf.b(this.h, rp7Var.h) && ckf.b(this.i, rp7Var.i) && this.j == rp7Var.j) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("871378b0", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8916abb9", new Object[]{this});
        }
        return this.i;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.d;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i8 = ((this.f27527a * 31) + this.b) * 31;
        String str = this.c;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = (i8 + i) * 31;
        String str2 = this.d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i10 = (i9 + i2) * 31;
        Integer num = this.e;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        int i11 = (i10 + i3) * 31;
        Set<String> set = this.f;
        if (set == null) {
            i4 = 0;
        } else {
            i4 = set.hashCode();
        }
        int i12 = (i11 + i4) * 31;
        String str3 = this.g;
        if (str3 == null) {
            i5 = 0;
        } else {
            i5 = str3.hashCode();
        }
        int i13 = (i12 + i5) * 31;
        String str4 = this.h;
        if (str4 == null) {
            i6 = 0;
        } else {
            i6 = str4.hashCode();
        }
        int i14 = (i13 + i6) * 31;
        String str5 = this.i;
        if (str5 != null) {
            i7 = str5.hashCode();
        }
        return ((i14 + i7) * 31) + bbz.a(this.j);
    }

    public final Integer i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5a1baf6e", new Object[]{this});
        }
        return this.e;
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.f27527a;
    }

    public final void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a54ab4", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("249c25dd", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DiscountInfo(width=" + this.f27527a + ", height=" + this.b + ", iconUrl=" + this.c + ", text=" + this.d + ", textColor=" + this.e + ", prizeIdSet=" + this.f + ", receivedText=" + this.g + ", receivedDefaultText=" + this.h + ", showText=" + this.i + ", refresh=" + this.j + ')';
    }

    public /* synthetic */ rp7(int i, int i2, String str, String str2, Integer num, Set set, String str3, String str4, String str5, boolean z, int i3, a07 a07Var) {
        this(i, i2, str, str2, num, set, str3, str4, (i3 & 256) != 0 ? str2 : str5, (i3 & 512) != 0 ? true : z);
    }
}
