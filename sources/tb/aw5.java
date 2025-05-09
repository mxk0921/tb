package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class aw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f16037a;
    public int[] b;
    public int[] c;
    public int[] d;
    public byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;

    static {
        t2o.a(444596829);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b6d1a5b", new Object[]{this});
        } else if (ip2.d(this.e, this.f) == 1718843492) {
            int b = ip2.b(this.e, this.f + 4);
            if (b <= 1) {
                int d = ip2.d(this.e, this.f + 8);
                this.i = d;
                if (this.f + d > this.e.length) {
                    throw new IllegalArgumentException("Invalid binary, offset: " + this.f + "+ fileLen: " + this.i + " > bytes.length: " + this.e.length);
                }
                return;
            }
            throw new IllegalArgumentException("Invalid binary, newer format not support: " + b);
        } else {
            throw new IllegalArgumentException("Invalid binary, invalid magic number");
        }
    }

    public byte[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3e6c8fa1", new Object[]{this});
        }
        return this.e;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a545213c", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c09d88be", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.d[i];
    }

    public int f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aafc6331", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.c[i] + this.f;
    }

    public void g(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b637ba25", new Object[]{this, bArr, new Integer(i)});
            return;
        }
        this.e = bArr;
        this.f = i;
        a();
        int d = ip2.d(bArr, i + 12);
        int i2 = 0;
        while (true) {
            if (i2 >= d) {
                break;
            }
            int i3 = i + 16 + (i2 * 12);
            if (ip2.d(bArr, i3) == 1) {
                this.f16037a = ip2.d(bArr, i3 + 4);
                break;
            }
            i2++;
        }
        if (this.f16037a != 0) {
            int i4 = i + 16 + (d * 12);
            int d2 = ip2.d(bArr, i4);
            this.h = d2;
            if (d2 != 0) {
                this.c = new int[d2];
                this.d = new int[d2];
                for (int i5 = 0; i5 < this.h; i5++) {
                    int i6 = i5 * 8;
                    this.c[i5] = ip2.d(bArr, i4 + 4 + i6);
                    this.d[i5] = ip2.d(bArr, i4 + 8 + i6);
                }
                int d3 = ip2.d(bArr, this.f16037a + i);
                this.g = d3;
                this.b = new int[d3];
                for (int i7 = 0; i7 < this.g; i7++) {
                    this.b[i7] = ip2.d(bArr, this.f16037a + i + 4 + (i7 * 4));
                }
                return;
            }
            throw new IllegalArgumentException("Empty binary, 0 expression");
        }
        throw new IllegalArgumentException("Invalid binary, no const section");
    }

    public mw5 c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("e8fa7aa5", new Object[]{this, new Integer(i)});
        }
        int i2 = this.b[i];
        int d = ip2.d(this.e, this.f + i2);
        if (d == 0) {
            return mw5.O(new String(this.e, this.f + i2 + 8, ip2.d(this.e, (this.f + i2) + 4) - 1, Charset.forName("UTF-8")));
        }
        throw new IllegalArgumentException("not support const type:" + d);
    }
}
