package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class dif {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17842a;
    public final String b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final String f;
    public final Integer g;
    public final String h;
    public final String i;
    public final String j;
    public final JSONObject k;

    static {
        t2o.a(815792408);
    }

    public dif(String str, String str2, Integer num, String str3, Integer num2, String str4, Integer num3, String str5, String str6, String str7, JSONObject jSONObject) {
        ckf.g(str3, "query");
        ckf.g(str5, "text");
        this.f17842a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = num2;
        this.f = str4;
        this.g = num3;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = jSONObject;
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("addf23d6", new Object[]{this});
        }
        return this.g;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.i;
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cf36e223", new Object[]{this});
        }
        return this.k;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d62ef27", new Object[]{this});
        }
        return this.d;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d989be5a", new Object[]{this});
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
        if (!(obj instanceof dif)) {
            return false;
        }
        dif difVar = (dif) obj;
        if (ckf.b(this.f17842a, difVar.f17842a) && ckf.b(this.b, difVar.b) && ckf.b(this.c, difVar.c) && ckf.b(this.d, difVar.d) && ckf.b(this.e, difVar.e) && ckf.b(this.f, difVar.f) && ckf.b(this.g, difVar.g) && ckf.b(this.h, difVar.h) && ckf.b(this.i, difVar.i) && ckf.b(this.j, difVar.j) && ckf.b(this.k, difVar.k)) {
            return true;
        }
        return false;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ded6033", new Object[]{this});
        }
        return this.f17842a;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a72bc258", new Object[]{this});
        }
        return this.j;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.h;
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
        int i9 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f17842a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i10 = i * 31;
        String str2 = this.b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i11 = (i10 + i2) * 31;
        Integer num = this.c;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        int hashCode = (((i11 + i3) * 31) + this.d.hashCode()) * 31;
        Integer num2 = this.e;
        if (num2 == null) {
            i4 = 0;
        } else {
            i4 = num2.hashCode();
        }
        int i12 = (hashCode + i4) * 31;
        String str3 = this.f;
        if (str3 == null) {
            i5 = 0;
        } else {
            i5 = str3.hashCode();
        }
        int i13 = (i12 + i5) * 31;
        Integer num3 = this.g;
        if (num3 == null) {
            i6 = 0;
        } else {
            i6 = num3.hashCode();
        }
        int hashCode2 = (((i13 + i6) * 31) + this.h.hashCode()) * 31;
        String str4 = this.i;
        if (str4 == null) {
            i7 = 0;
        } else {
            i7 = str4.hashCode();
        }
        int i14 = (hashCode2 + i7) * 31;
        String str5 = this.j;
        if (str5 == null) {
            i8 = 0;
        } else {
            i8 = str5.hashCode();
        }
        int i15 = (i14 + i8) * 31;
        JSONObject jSONObject = this.k;
        if (jSONObject != null) {
            i9 = jSONObject.hashCode();
        }
        return i15 + i9;
    }

    public final Integer i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5a1baf6e", new Object[]{this});
        }
        return this.e;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.f;
    }

    public final Integer k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("da8541", new Object[]{this});
        }
        return this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "InteractiveTagInfo(tagPic=" + this.f17842a + ", rightIcon=" + this.b + ", typeColor=" + this.c + ", query=" + this.d + ", textColor=" + this.e + ", type=" + this.f + ", bgColor=" + this.g + ", text=" + this.h + ", key=" + this.i + ", tagTrace=" + this.j + ", params=" + this.k + ')';
    }
}
