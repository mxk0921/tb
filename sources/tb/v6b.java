package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class v6b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29808a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final JSONArray i;
    public final String j;
    public final int k;
    public final int l;
    public final r3p m;
    public final ux3 n;
    public final JSONObject o;
    public final JSONObject p;
    public boolean q;

    static {
        t2o.a(815792996);
    }

    public v6b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, JSONArray jSONArray, String str9, int i, int i2, r3p r3pVar, ux3 ux3Var, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        ckf.g(str, "title");
        ckf.g(jSONObject2, "originData");
        this.f29808a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = jSONArray;
        this.j = str9;
        this.k = i;
        this.l = i2;
        this.m = r3pVar;
        this.n = ux3Var;
        this.o = jSONObject;
        this.p = jSONObject2;
        this.q = z;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31a0210d", new Object[]{this});
        }
        return this.f;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1857cd37", new Object[]{this});
        }
        return this.g;
    }

    public final ux3 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux3) ipChange.ipc$dispatch("f3e3e699", new Object[]{this});
        }
        return this.n;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("786da075", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b063064", new Object[]{this});
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
        if (!(obj instanceof v6b)) {
            return false;
        }
        v6b v6bVar = (v6b) obj;
        if (ckf.b(this.f29808a, v6bVar.f29808a) && ckf.b(this.b, v6bVar.b) && ckf.b(this.c, v6bVar.c) && ckf.b(this.d, v6bVar.d) && ckf.b(this.e, v6bVar.e) && ckf.b(this.f, v6bVar.f) && ckf.b(this.g, v6bVar.g) && ckf.b(this.h, v6bVar.h) && ckf.b(this.i, v6bVar.i) && ckf.b(this.j, v6bVar.j) && this.k == v6bVar.k && this.l == v6bVar.l && ckf.b(this.m, v6bVar.m) && ckf.b(this.n, v6bVar.n) && ckf.b(this.o, v6bVar.o) && ckf.b(this.p, v6bVar.p) && this.q == v6bVar.q) {
            return true;
        }
        return false;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a532361", new Object[]{this});
        }
        return this.h;
    }

    public final r3p g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r3p) ipChange.ipc$dispatch("a81b388f", new Object[]{this});
        }
        return this.m;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a2945f1", new Object[]{this});
        }
        return this.c;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = this.f29808a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i13 = (hashCode + i) * 31;
        String str2 = this.c;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i14 = (i13 + i2) * 31;
        String str3 = this.d;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i15 = (i14 + i3) * 31;
        String str4 = this.e;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i16 = (i15 + i4) * 31;
        String str5 = this.f;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i17 = (i16 + i5) * 31;
        String str6 = this.g;
        if (str6 == null) {
            i6 = 0;
        } else {
            i6 = str6.hashCode();
        }
        int i18 = (i17 + i6) * 31;
        String str7 = this.h;
        if (str7 == null) {
            i7 = 0;
        } else {
            i7 = str7.hashCode();
        }
        int i19 = (i18 + i7) * 31;
        JSONArray jSONArray = this.i;
        if (jSONArray == null) {
            i8 = 0;
        } else {
            i8 = jSONArray.hashCode();
        }
        int i20 = (i19 + i8) * 31;
        String str8 = this.j;
        if (str8 == null) {
            i9 = 0;
        } else {
            i9 = str8.hashCode();
        }
        int i21 = (((((i20 + i9) * 31) + this.k) * 31) + this.l) * 31;
        r3p r3pVar = this.m;
        if (r3pVar == null) {
            i10 = 0;
        } else {
            i10 = r3pVar.hashCode();
        }
        int i22 = (i21 + i10) * 31;
        ux3 ux3Var = this.n;
        if (ux3Var == null) {
            i11 = 0;
        } else {
            i11 = ux3Var.hashCode();
        }
        int i23 = (i22 + i11) * 31;
        JSONObject jSONObject = this.o;
        if (jSONObject != null) {
            i12 = jSONObject.hashCode();
        }
        return ((((i23 + i12) * 31) + this.p.hashCode()) * 31) + bbz.a(this.q);
    }

    public final JSONArray i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("4ae58e93", new Object[]{this});
        }
        return this.i;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df2fcee", new Object[]{this});
        }
        return this.j;
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72a749a5", new Object[]{this})).intValue();
        }
        return this.l;
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b75d101c", new Object[]{this});
        }
        return this.b;
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f33f3c", new Object[]{this})).intValue();
        }
        return this.k;
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.f29808a;
    }

    public final JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("40e47994", new Object[]{this});
        }
        return this.o;
    }

    public final void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb901b8f", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "HotSpotsItem(title=" + this.f29808a + ", tagIcon=" + this.b + ", searchNum=" + this.c + ", indexIcon=" + this.d + ", markIcon=" + this.e + ", arrowIcon=" + this.f + ", arrowIconDark=" + this.g + ", itemJumpUrl=" + this.h + ", searchParams=" + this.i + ", searchText=" + this.j + ", tagWidth=" + this.k + ", tagHeight=" + this.l + ", searchIcon=" + this.m + ", clueTag=" + this.n + ", utLogMap=" + this.o + ", originData=" + this.p + ", exposed=" + this.q + ')';
    }

    public /* synthetic */ v6b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, JSONArray jSONArray, String str9, int i, int i2, r3p r3pVar, ux3 ux3Var, JSONObject jSONObject, JSONObject jSONObject2, boolean z, int i3, a07 a07Var) {
        this(str, str2, str3, str4, str5, str6, str7, str8, jSONArray, str9, i, i2, r3pVar, ux3Var, jSONObject, jSONObject2, (i3 & 65536) != 0 ? false : z);
    }
}
