package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class sle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f28131a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;

    static {
        t2o.a(481297067);
    }

    public sle(byte[] bArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2) {
        ckf.g(bArr, "yuv");
        this.f28131a = bArr;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = z2;
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e185dba4", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6b740e7", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed8ac39c", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("964d2a65", new Object[]{this})).intValue();
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
        if (!(obj instanceof sle)) {
            return false;
        }
        sle sleVar = (sle) obj;
        if (ckf.b(this.f28131a, sleVar.f28131a) && this.b == sleVar.b && this.c == sleVar.c && this.d == sleVar.d && this.e == sleVar.e && this.f == sleVar.f && this.g == sleVar.g && this.h == sleVar.h && this.i == sleVar.i && this.j == sleVar.j) {
            return true;
        }
        return false;
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final byte[] g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8e786e12", new Object[]{this});
        }
        return this.f28131a;
    }

    public int hashCode() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = Arrays.hashCode(this.f28131a) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = (((((((((((((((hashCode + i2) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        boolean z2 = this.j;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i4 + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ImageInput(yuv=" + Arrays.toString(this.f28131a) + ", frontCam=" + this.b + ", width=" + this.c + ", height=" + this.d + ", viewWidth=" + this.e + ", viewHeight=" + this.f + ", outputWidth=" + this.g + ", outputHeight=" + this.h + ", displayRotation=" + this.i + ", needFilter=" + this.j + ')';
    }
}
