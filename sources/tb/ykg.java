package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ykg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32146a;
    public final int b;
    public String c;
    public final int d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    static {
        t2o.a(815792390);
    }

    public ykg(String str, int i, String str2, int i2, int i3, String str3, int i4, int i5, int i6, int i7) {
        this.f32146a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        return this.c;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e6f235", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a86c739b", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adef2a0e", new Object[]{this});
        }
        return this.f;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykg)) {
            return false;
        }
        ykg ykgVar = (ykg) obj;
        if (ckf.b(this.f32146a, ykgVar.f32146a) && this.b == ykgVar.b && ckf.b(this.c, ykgVar.c) && this.d == ykgVar.d && this.e == ykgVar.e && ckf.b(this.f, ykgVar.f) && this.g == ykgVar.g && this.h == ykgVar.h && this.i == ykgVar.i && this.j == ykgVar.j) {
            return true;
        }
        return false;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.f32146a;
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9ddb4e6", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f32146a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = ((i * 31) + this.b) * 31;
        String str2 = this.c;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (((((i4 + i2) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((((((((i5 + i3) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j;
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e2a16ca", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LeftScripInfo(text=" + this.f32146a + ", type=" + this.b + ", imageUrl=" + this.c + ", width=" + this.d + ", height=" + this.e + ", needHiddenLiveNumber=" + this.f + ", listLeft=" + this.g + ", listTop=" + this.h + ", wfLeft=" + this.i + ", wfTop=" + this.j + ')';
    }
}
