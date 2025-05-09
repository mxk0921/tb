package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class x6b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31177a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final List<v6b> g;
    public final int h;
    public final JSONObject i;
    public final JSONObject j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    static {
        t2o.a(815792998);
    }

    public x6b(String str, String str2, String str3, String str4, Integer num, Integer num2, List<v6b> list, int i, JSONObject jSONObject, JSONObject jSONObject2, boolean z, boolean z2, boolean z3, boolean z4) {
        ckf.g(list, bia.UNDER_TAKE_GOODS_LIST);
        ckf.g(jSONObject2, "originData");
        this.f31177a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = num2;
        this.g = list;
        this.h = i;
        this.i = jSONObject;
        this.j = jSONObject2;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dd1a5b6", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d417163c", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("786da075", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public final Integer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("9a25041a", new Object[]{this});
        }
        return this.f;
    }

    public final Integer e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("41e89e4f", new Object[]{this});
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6b)) {
            return false;
        }
        x6b x6bVar = (x6b) obj;
        if (ckf.b(this.f31177a, x6bVar.f31177a) && ckf.b(this.b, x6bVar.b) && ckf.b(this.c, x6bVar.c) && ckf.b(this.d, x6bVar.d) && ckf.b(this.e, x6bVar.e) && ckf.b(this.f, x6bVar.f) && ckf.b(this.g, x6bVar.g) && this.h == x6bVar.h && ckf.b(this.i, x6bVar.i) && ckf.b(this.j, x6bVar.j) && this.k == x6bVar.k && this.l == x6bVar.l && this.m == x6bVar.m && this.n == x6bVar.n) {
            return true;
        }
        return false;
    }

    public final List<v6b> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c2c777b9", new Object[]{this});
        }
        return this.g;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f84d441c", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9abeefcc", new Object[]{this})).booleanValue();
        }
        return this.n;
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
        String str = this.f31177a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i8 = i * 31;
        String str2 = this.b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i9 = (i8 + i2) * 31;
        String str3 = this.c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i10 = (i9 + i3) * 31;
        String str4 = this.d;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i11 = (i10 + i4) * 31;
        Integer num = this.e;
        if (num == null) {
            i5 = 0;
        } else {
            i5 = num.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        Integer num2 = this.f;
        if (num2 == null) {
            i6 = 0;
        } else {
            i6 = num2.hashCode();
        }
        int hashCode = (((((i12 + i6) * 31) + this.g.hashCode()) * 31) + this.h) * 31;
        JSONObject jSONObject = this.i;
        if (jSONObject != null) {
            i7 = jSONObject.hashCode();
        }
        return ((((((((((hashCode + i7) * 31) + this.j.hashCode()) * 31) + bbz.a(this.k)) * 31) + bbz.a(this.l)) * 31) + bbz.a(this.m)) * 31) + bbz.a(this.n);
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("814c03d", new Object[]{this});
        }
        return this.c;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbf611af", new Object[]{this});
        }
        return this.f31177a;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ceb6c438", new Object[]{this});
        }
        return this.d;
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32bfb760", new Object[]{this});
        }
        return this.b;
    }

    public final JSONObject m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a4b6accd", new Object[]{this});
        }
        return this.i;
    }

    public final void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2acbe6e", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb901b8f", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public final void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3f65580", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "HotSpotsTab(tabName=" + this.f31177a + ", tabTitle=" + this.b + ", tabImage=" + this.c + ", tabSelectedImage=" + this.d + ", imageWidth=" + this.e + ", imageHeight=" + this.f + ", itemList=" + this.g + ", deepColorSize=" + this.h + ", tabTrace=" + this.i + ", originData=" + this.j + ", selected=" + this.k + ", animate=" + this.l + ", exposed=" + this.m + ", tabExposed=" + this.n + ')';
    }

    public /* synthetic */ x6b(String str, String str2, String str3, String str4, Integer num, Integer num2, List list, int i, JSONObject jSONObject, JSONObject jSONObject2, boolean z, boolean z2, boolean z3, boolean z4, int i2, a07 a07Var) {
        this(str, str2, str3, str4, num, num2, list, i, jSONObject, jSONObject2, (i2 & 1024) != 0 ? false : z, (i2 & 2048) != 0 ? false : z2, (i2 & 4096) != 0 ? false : z3, (i2 & 8192) != 0 ? false : z4);
    }
}
