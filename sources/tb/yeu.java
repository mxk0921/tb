package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class yeu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32029a;
    public final String b;
    public final String c;
    public final String d;
    public final float e;
    public final int f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final int k;
    public final String l;
    public final String m;
    public final int n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;
    public final int s;

    static {
        t2o.a(481297535);
    }

    public yeu(String str, String str2, String str3, String str4, float f, int i, String str5, int i2, int i3, String str6, int i4, String str7, String str8, int i5, float f2, float f3, float f4, float f5, int i6) {
        this.f32029a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = f;
        this.f = i;
        this.g = str5;
        this.h = i2;
        this.i = i3;
        this.j = str6;
        this.k = i4;
        this.l = str7;
        this.m = str8;
        this.n = i5;
        this.o = f2;
        this.p = f3;
        this.q = f4;
        this.r = f5;
        this.s = i6;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        return this.c;
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5db8bfdd", new Object[]{this})).floatValue();
        }
        return this.e;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7b394bf", new Object[]{this})).intValue();
        }
        return this.s;
    }

    public final RectF d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("23232346", new Object[]{this});
        }
        return new RectF(this.o, this.p, this.q, this.r);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeu)) {
            return false;
        }
        yeu yeuVar = (yeu) obj;
        if (ckf.b(this.f32029a, yeuVar.f32029a) && ckf.b(this.b, yeuVar.b) && ckf.b(this.c, yeuVar.c) && ckf.b(this.d, yeuVar.d) && ckf.b(Float.valueOf(this.e), Float.valueOf(yeuVar.e)) && this.f == yeuVar.f && ckf.b(this.g, yeuVar.g) && this.h == yeuVar.h && this.i == yeuVar.i && ckf.b(this.j, yeuVar.j) && this.k == yeuVar.k && ckf.b(this.l, yeuVar.l) && ckf.b(this.m, yeuVar.m) && this.n == yeuVar.n && ckf.b(Float.valueOf(this.o), Float.valueOf(yeuVar.o)) && ckf.b(Float.valueOf(this.p), Float.valueOf(yeuVar.p)) && ckf.b(Float.valueOf(this.q), Float.valueOf(yeuVar.q)) && ckf.b(Float.valueOf(this.r), Float.valueOf(yeuVar.r)) && this.s == yeuVar.s) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f32029a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = i * 31;
        String str2 = this.b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i10 = (i9 + i2) * 31;
        String str3 = this.c;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i11 = (i10 + i3) * 31;
        String str4 = this.d;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int floatToIntBits = (((((i11 + i4) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f) * 31;
        String str5 = this.g;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i12 = (((((floatToIntBits + i5) * 31) + this.h) * 31) + this.i) * 31;
        String str6 = this.j;
        if (str6 == null) {
            i6 = 0;
        } else {
            i6 = str6.hashCode();
        }
        int i13 = (((i12 + i6) * 31) + this.k) * 31;
        String str7 = this.l;
        if (str7 == null) {
            i7 = 0;
        } else {
            i7 = str7.hashCode();
        }
        int i14 = (i13 + i7) * 31;
        String str8 = this.m;
        if (str8 != null) {
            i8 = str8.hashCode();
        }
        return ((((((((((((i14 + i8) * 31) + this.n) * 31) + Float.floatToIntBits(this.o)) * 31) + Float.floatToIntBits(this.p)) * 31) + Float.floatToIntBits(this.q)) * 31) + Float.floatToIntBits(this.r)) * 31) + this.s;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TranslateResult(backgroundColor=" + ((Object) this.f32029a) + ", color=" + ((Object) this.b) + ", content=" + ((Object) this.c) + ", fontFamily=" + ((Object) this.d) + ", fontSize=" + this.e + ", id=" + this.f + ", label=" + ((Object) this.g) + ", letterSpacing=" + this.h + ", lineHeight=" + this.i + ", ocrContent=" + ((Object) this.j) + ", pairId=" + this.k + ", textAlign=" + ((Object) this.l) + ", type=" + ((Object) this.m) + ", zIndex=" + this.n + ", x1=" + this.o + ", y1=" + this.p + ", x2=" + this.q + ", y2=" + this.r + ", lineCount=" + this.s + ')';
    }
}
