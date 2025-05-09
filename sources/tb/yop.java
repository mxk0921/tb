package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class yop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Integer f32244a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    static {
        t2o.a(815792451);
    }

    public yop(Integer num, String str, String str2, int i, int i2, String str3) {
        ckf.g(str2, "hiddenType");
        this.f32244a = num;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = str3;
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("7a6355db", new Object[]{this});
        }
        return this.f32244a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("759cdb3f", new Object[]{this});
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e32456a", new Object[]{this});
        }
        return this.f;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef1b8c70", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85d5f711", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yop)) {
            return false;
        }
        yop yopVar = (yop) obj;
        if (ckf.b(this.f32244a, yopVar.f32244a) && ckf.b(this.b, yopVar.b) && ckf.b(this.c, yopVar.c) && this.d == yopVar.d && this.e == yopVar.e && ckf.b(this.f, yopVar.f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.b;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        Integer num = this.f32244a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i4 = i * 31;
        String str = this.b;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int hashCode = (((((((i4 + i2) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ShopItemInfo(color=" + this.f32244a + ", text=" + this.b + ", hiddenType=" + this.c + ", iconWidth=" + this.d + ", iconHeight=" + this.e + ", icon=" + this.f + ')';
    }
}
