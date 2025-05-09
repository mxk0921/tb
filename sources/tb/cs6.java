package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cs6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte f17284a;
    public byte b;
    public byte c;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public byte h;
    public byte i;
    public int j;
    public int k;
    public int l;
    public int m;
    public byte[] n;

    static {
        t2o.a(628097025);
    }

    public cs6() {
    }

    public static int b(int i, cs6 cs6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac9818d3", new Object[]{new Integer(i), cs6Var})).intValue();
        }
        return c(i, cs6Var) + 1 + cs6Var.l + 1;
    }

    public static int c(int i, cs6 cs6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2374eb8", new Object[]{new Integer(i), cs6Var})).intValue();
        }
        return d(i) + 1 + cs6Var.k + 1;
    }

    public static int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42f25093", new Object[]{new Integer(i)})).intValue();
        }
        return i + 5;
    }

    public static List<cs6> f(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b5cb3426", new Object[]{bArr});
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bArr.length) {
            cs6 cs6Var = new cs6();
            byte b = bArr[i];
            cs6Var.d = (byte) (b & 1);
            cs6Var.c = (byte) ((b >> 1) & 3);
            cs6Var.b = (byte) ((b >> 3) & 1);
            cs6Var.f17284a = (byte) ((b >> 4) & 15);
            byte b2 = bArr[i + 1];
            cs6Var.f = (byte) (b2 & 7);
            cs6Var.e = (byte) ((b2 >> 3) & 31);
            byte b3 = bArr[i + 2];
            cs6Var.h = (byte) (b3 & 31);
            cs6Var.g = (byte) ((b3 >> 5) & 7);
            byte b4 = bArr[i + 3];
            cs6Var.i = (byte) ((b4 >> 3) & 31);
            cs6Var.j = (cs6Var.a(b4 & 7) * 256) + cs6Var.a(bArr[i + 4]);
            cs6Var.k = cs6Var.a(bArr[d(i)]) + (cs6Var.a(bArr[d(i) + 1]) * 256);
            cs6Var.l = cs6Var.a(bArr[c(i, cs6Var)]) + (cs6Var.a(bArr[c(i, cs6Var) + 1]) * 256);
            cs6Var.m = cs6Var.a(bArr[b(i, cs6Var)]) + (cs6Var.a(bArr[b(i, cs6Var) + 1]) * 256);
            int b5 = b(0, cs6Var) + 1 + cs6Var.m + 1;
            byte[] bArr2 = new byte[b5];
            cs6Var.n = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, b5);
            i += b5;
            arrayList.add(cs6Var);
        }
        return arrayList;
    }

    public int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7346b577", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i >= 0) {
            return i;
        }
        return i + 256;
    }

    public final int e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a26fa62d", new Object[]{this, bArr, bArr2, bArr3})).intValue();
        }
        if (bArr == null) {
            i = 0;
        } else {
            i = bArr.length;
        }
        this.k = i;
        if (bArr2 == null) {
            i2 = 0;
        } else {
            i2 = bArr2.length;
        }
        this.l = i2;
        if (bArr3 == null) {
            i3 = 0;
        } else {
            i3 = bArr3.length;
        }
        this.m = i3;
        return b(0, this) + 1 + this.m + 1;
    }

    public byte[] g(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4b7b12c2", new Object[]{this, bArr, bArr2, bArr3});
        }
        byte[] bArr4 = new byte[e(bArr, bArr2, bArr3)];
        byte b = (byte) ((this.f17284a << 4) & 240);
        bArr4[0] = b;
        byte b2 = (byte) (b | ((byte) ((this.b << 3) & 248)));
        bArr4[0] = b2;
        byte b3 = (byte) (b2 | ((byte) ((this.c << 1) & 254)));
        bArr4[0] = b3;
        bArr4[0] = (byte) (b3 | this.d);
        byte b4 = (byte) ((this.e << 3) & 248);
        bArr4[1] = b4;
        bArr4[1] = (byte) (b4 | this.f);
        byte b5 = (byte) ((this.g << 5) & 224);
        bArr4[2] = b5;
        bArr4[2] = (byte) (b5 | this.h);
        byte b6 = (byte) ((this.i << 3) & 248);
        bArr4[3] = b6;
        int i = this.j;
        bArr4[3] = (byte) (b6 | ((byte) (i / 256)));
        bArr4[4] = (byte) (i % 256);
        bArr4[d(0) + 1] = (byte) (this.k / 256);
        bArr4[d(0)] = (byte) (this.k % 256);
        bArr4[c(0, this) + 1] = (byte) (this.l / 256);
        bArr4[c(0, this)] = (byte) (this.l % 256);
        bArr4[b(0, this) + 1] = (byte) (this.m / 256);
        bArr4[b(0, this)] = (byte) (this.m % 256);
        if (this.k != 0) {
            System.arraycopy(bArr, 0, bArr4, d(0) + 2, this.k);
        }
        if (this.l != 0) {
            System.arraycopy(bArr2, 0, bArr4, c(0, this) + 2, this.l);
        }
        if (this.m != 0) {
            System.arraycopy(bArr3, 0, bArr4, b(0, this) + 2, this.m);
        }
        return bArr4;
    }

    public cs6(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f17284a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = (byte) i4;
        this.e = (byte) i5;
        this.f = (byte) i6;
        this.g = (byte) i7;
        this.h = (byte) i8;
        this.i = (byte) i9;
        this.j = i10;
    }
}
