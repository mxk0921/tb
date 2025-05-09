package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class pwm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final owm f26362a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final String f;
    public final Integer g;
    public final String h;
    public final boolean i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final Integer o;
    public final String p;
    public final String q;

    static {
        t2o.a(815792436);
    }

    public pwm(owm owmVar, String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, Integer num3, String str11, String str12) {
        ckf.g(str9, "desc");
        this.f26362a = owmVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = num;
        this.f = str4;
        this.g = num2;
        this.h = str5;
        this.i = z;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = str10;
        this.o = num3;
        this.p = str11;
        this.q = str12;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52c12870", new Object[]{this});
        }
        return this.k;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
        }
        return this.m;
    }

    public final owm c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (owm) ipChange.ipc$dispatch("c3bc5ada", new Object[]{this});
        }
        return this.f26362a;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8152f10b", new Object[]{this});
        }
        return this.p;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d853caae", new Object[]{this});
        }
        return this.l;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwm)) {
            return false;
        }
        pwm pwmVar = (pwm) obj;
        if (ckf.b(this.f26362a, pwmVar.f26362a) && ckf.b(this.b, pwmVar.b) && ckf.b(this.c, pwmVar.c) && ckf.b(this.d, pwmVar.d) && ckf.b(this.e, pwmVar.e) && ckf.b(this.f, pwmVar.f) && ckf.b(this.g, pwmVar.g) && ckf.b(this.h, pwmVar.h) && this.i == pwmVar.i && ckf.b(this.j, pwmVar.j) && ckf.b(this.k, pwmVar.k) && ckf.b(this.l, pwmVar.l) && ckf.b(this.m, pwmVar.m) && ckf.b(this.n, pwmVar.n) && ckf.b(this.o, pwmVar.o) && ckf.b(this.p, pwmVar.p) && ckf.b(this.q, pwmVar.q)) {
            return true;
        }
        return false;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70e0188c", new Object[]{this});
        }
        return this.h;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f550f4b1", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27bf98ff", new Object[]{this});
        }
        return this.b;
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
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        owm owmVar = this.f26362a;
        if (owmVar == null) {
            i = 0;
        } else {
            i = owmVar.hashCode();
        }
        int i16 = i * 31;
        String str = this.b;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i17 = (i16 + i2) * 31;
        String str2 = this.c;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i18 = (i17 + i3) * 31;
        String str3 = this.d;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int i19 = (i18 + i4) * 31;
        Integer num = this.e;
        if (num == null) {
            i5 = 0;
        } else {
            i5 = num.hashCode();
        }
        int i20 = (i19 + i5) * 31;
        String str4 = this.f;
        if (str4 == null) {
            i6 = 0;
        } else {
            i6 = str4.hashCode();
        }
        int i21 = (i20 + i6) * 31;
        Integer num2 = this.g;
        if (num2 == null) {
            i7 = 0;
        } else {
            i7 = num2.hashCode();
        }
        int i22 = (i21 + i7) * 31;
        String str5 = this.h;
        if (str5 == null) {
            i8 = 0;
        } else {
            i8 = str5.hashCode();
        }
        int a2 = (((i22 + i8) * 31) + bbz.a(this.i)) * 31;
        String str6 = this.j;
        if (str6 == null) {
            i9 = 0;
        } else {
            i9 = str6.hashCode();
        }
        int i23 = (a2 + i9) * 31;
        String str7 = this.k;
        if (str7 == null) {
            i10 = 0;
        } else {
            i10 = str7.hashCode();
        }
        int i24 = (i23 + i10) * 31;
        String str8 = this.l;
        if (str8 == null) {
            i11 = 0;
        } else {
            i11 = str8.hashCode();
        }
        int hashCode = (((i24 + i11) * 31) + this.m.hashCode()) * 31;
        String str9 = this.n;
        if (str9 == null) {
            i12 = 0;
        } else {
            i12 = str9.hashCode();
        }
        int i25 = (hashCode + i12) * 31;
        Integer num3 = this.o;
        if (num3 == null) {
            i13 = 0;
        } else {
            i13 = num3.hashCode();
        }
        int i26 = (i25 + i13) * 31;
        String str10 = this.p;
        if (str10 == null) {
            i14 = 0;
        } else {
            i14 = str10.hashCode();
        }
        int i27 = (i26 + i14) * 31;
        String str11 = this.q;
        if (str11 != null) {
            i15 = str11.hashCode();
        }
        return i27 + i15;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3a46146", new Object[]{this});
        }
        return this.c;
    }

    public final Integer j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("461bd493", new Object[]{this});
        }
        return this.o;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2de241ee", new Object[]{this});
        }
        return this.n;
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("859e3ef", new Object[]{this});
        }
        return this.j;
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a099e802", new Object[]{this});
        }
        return this.f;
    }

    public final Integer n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("3d65d93a", new Object[]{this});
        }
        return this.g;
    }

    public final Integer o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4d517c4a", new Object[]{this});
        }
        return this.e;
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12fc6b65", new Object[]{this});
        }
        return this.d;
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c8e17fa", new Object[]{this});
        }
        return this.q;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PriceInfo(icon=" + this.f26362a + ", preText=" + this.b + ", price=" + this.c + ", suffixText=" + this.d + ", suffixColor=" + this.e + ", subText=" + this.f + ", subTextColor=" + this.g + ", originPrice=" + this.h + ", originPriceStrikeThrough=" + this.i + ", sold=" + this.j + ", comment=" + this.k + ", location=" + this.l + ", desc=" + this.m + ", priceBottomText=" + this.n + ", priceBottomColor=" + this.o + ", listBackgroundImgUrl=" + this.p + ", wfBackgroundImgUrl=" + this.q + ')';
    }
}
