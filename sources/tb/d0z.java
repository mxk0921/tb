package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.exception.NanoRuntimeException;
import kotlin.Deprecated;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class d0z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f17492a;
    public final int b;
    public final int c;
    public final int d;
    public int e;

    static {
        t2o.a(598737430);
    }

    public d0z(byte[] bArr, int i, int i2) {
        ckf.g(bArr, "bytes");
        this.f17492a = bArr;
        this.b = i;
        this.c = i2;
        this.d = i2 - i;
        if (i2 > bArr.length || i >= bArr.length || i < 0 || i2 <= 0 || i >= i2) {
            throw new RuntimeException("BytesReader: out of range, offset: " + i + ", limit: " + i2 + ", bytes.size: " + bArr.length);
        }
        this.e = i;
    }

    public final int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62e7f399", new Object[]{this})).intValue();
        }
        return this.e - this.b;
    }

    public final d0z B(int i, int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d0z) ipChange.ipc$dispatch("8f9e1045", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i + i2 <= this.c) {
            this.e += i2;
            byte[] bArr = this.f17492a;
            int i3 = this.b;
            return new d0z(bArr, i3 + i, i3 + i + i2);
        }
        throw new Exception("BytesReader::readBytes: out of range, location: " + i + ", length: " + i2 + ", limit: " + this.c);
    }

    public final Object C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("23546f0", new Object[]{this});
        }
        byte[] bArr = this.f17492a;
        int i = this.e;
        this.e = 1 + i;
        byte b = bArr[i];
        if (b == 44) {
            return Integer.valueOf(c());
        }
        if (b == 45) {
            return Integer.valueOf(e());
        }
        if (b == 46) {
            return Integer.valueOf(k());
        }
        if (b == 47) {
            return Long.valueOf(p());
        }
        if (b == 40) {
            return Integer.valueOf(d() & 255);
        }
        if (b == 41) {
            return Integer.valueOf(g() & 65535);
        }
        if (b == 42) {
            return Long.valueOf(m() & tiv.INT_MASK);
        }
        if (b == 43) {
            if (!ciz.Companion.c()) {
                return Long.valueOf(r());
            }
            throw new NanoRuntimeException("UINT64 is not supported");
        } else if (b == 38) {
            return Float.valueOf(i());
        } else {
            if (b == 39) {
                return Double.valueOf(n());
            }
            if (b == 32) {
                return w(c());
            }
            if (b == 33) {
                return w(e());
            }
            if (b == 34) {
                return w(k());
            }
            if (b == -127) {
                return new j6z(x());
            }
            if (b == -126) {
                return Integer.valueOf(x());
            }
            if (b == 37) {
                return Boolean.TRUE;
            }
            if (b == 36) {
                return Boolean.FALSE;
            }
            if (b == 35) {
                return Integer.MAX_VALUE;
            }
            if (c0z.a(b)) {
                return w(b);
            }
            throw new Exception(ckf.p("Unsupported BytesCode ", Byte.valueOf(b)));
        }
    }

    public final void D(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ced5a91", new Object[]{this, new Integer(i)});
        } else {
            this.e = i + this.b;
        }
    }

    public final void E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9085fe", new Object[]{this, new Integer(i)});
        } else {
            this.e += i;
        }
    }

    public final byte a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cc6c0ca", new Object[]{this})).byteValue();
        }
        byte[] bArr = this.f17492a;
        int i = this.e;
        this.e = 1 + i;
        return bArr[i];
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f835f63", new Object[]{this})).booleanValue();
        }
        if (this.f17492a[this.b] != 0) {
            return true;
        }
        return false;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fe603d9", new Object[]{this})).intValue();
        }
        byte[] bArr = this.f17492a;
        int i = this.e;
        this.e = 1 + i;
        return bArr[i];
    }

    public final byte d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f949fbf", new Object[]{this})).byteValue();
        }
        byte[] bArr = this.f17492a;
        int i = this.e;
        this.e = 1 + i;
        return bArr[i];
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7c730b8", new Object[]{this})).intValue();
        }
        int i = this.e;
        this.e = i + 2;
        byte[] bArr = this.f17492a;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    @Deprecated(message = "b2toiBig is deprecated, use b2toi instead")
    public final int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9441c5c", new Object[]{this})).intValue();
        }
        int i = this.e;
        this.e = i + 2;
        byte[] bArr = this.f17492a;
        return (bArr[1 + i] & 255) | ((bArr[i] & 255) << 8);
    }

    public final short g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e53ec7", new Object[]{this})).shortValue();
        }
        return (short) e();
    }

    @Deprecated(message = "b3toiBig is deprecated, use b3toi instead")
    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e28cf1d", new Object[]{this})).intValue();
        }
        int i = this.e;
        this.e = i + 3;
        byte[] bArr = this.f17492a;
        return ((bArr[1 + i] & 255) << 8) | (bArr[i + 2] & 255) | ((bArr[i] & 255) << 16);
    }

    public final float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("975f43f0", new Object[]{this})).floatValue();
        }
        return Float.intBitsToFloat(k());
    }

    public final float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb69fb3e", new Object[]{this})).floatValue();
        }
        return Float.intBitsToFloat(l());
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97898a76", new Object[]{this})).intValue();
        }
        int i = this.e;
        this.e = i + 4;
        byte[] bArr = this.f17492a;
        return ((bArr[1 + i] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Deprecated(message = "b4toiBig is deprecated, use b4toi instead")
    public final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("230d81de", new Object[]{this})).intValue();
        }
        int i = this.e;
        this.e = i + 4;
        byte[] bArr = this.f17492a;
        return ((bArr[1 + i] & 255) << 16) | (bArr[i + 3] & 255) | ((bArr[i + 2] & 255) << 8) | ((bArr[i] & 255) << 24);
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9724c8a", new Object[]{this})).intValue();
        }
        return k();
    }

    public final double n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36c7c868", new Object[]{this})).doubleValue();
        }
        return Double.longBitsToDouble(p());
    }

    public final double o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f3a6c82", new Object[]{this})).doubleValue();
        }
        return Double.longBitsToDouble(q());
    }

    public final long p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("370e3df3", new Object[]{this})).longValue();
        }
        int i = this.e;
        this.e = i + 8;
        byte[] bArr = this.f17492a;
        return ((bArr[1 + i] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final long q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76a04ce3", new Object[]{this})).longValue();
        }
        int i = this.e;
        this.e = i + 8;
        byte[] bArr = this.f17492a;
        return ((bArr[1 + i] & 255) << 48) | (bArr[i + 7] & 255) | ((bArr[i + 6] & 255) << 8) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 2] & 255) << 40) | ((bArr[i] & 255) << 56);
    }

    public final long r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e11131c", new Object[]{this})).longValue();
        }
        return p();
    }

    public final int s() throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fcd1c26", new Object[]{this})).intValue();
        }
        byte[] bArr = this.f17492a;
        int i = this.e;
        this.e = 1 + i;
        byte b = bArr[i];
        if (b == 44 || b == 40) {
            return c();
        }
        if (b == 45 || b == 41) {
            return e();
        }
        if (b == 46 || b == 42) {
            return k();
        }
        return 0;
    }

    @Deprecated(message = "btoiBig is deprecated, use btoi instead")
    public final int t(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5266681b", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 1) {
            return c();
        }
        if (i == 2) {
            return f();
        }
        if (i == 3) {
            return h();
        }
        if (i == 4) {
            return l();
        }
        throw new Exception(ckf.p("BytesReader::btol: not supported length: ", Integer.valueOf(i)));
    }

    public final long u() throws Exception {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ff762aa", new Object[]{this})).longValue();
        }
        byte[] bArr = this.f17492a;
        int i2 = this.e;
        this.e = i2 + 1;
        byte b = bArr[i2];
        if (b == 40 || b == 44) {
            i = c();
        } else if (b == 41 || b == 45) {
            i = e();
        } else if (b == 42 || b == 46) {
            i = k();
        } else if (b == 43 || b == 47) {
            return p();
        } else {
            if (b == 35) {
                return 0L;
            }
            throw new Exception("BytesReader::btoi: not supported code: " + ((int) b) + ", position: " + (this.e - 1));
        }
        return i;
    }

    public final String v() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b683bf7", new Object[]{this});
        }
        byte[] bArr = this.f17492a;
        int i = this.e;
        this.e = 1 + i;
        byte b = bArr[i];
        if (c0z.a(b)) {
            return w(b & 255);
        }
        if (b == 32) {
            return w(c());
        }
        if (b == 33) {
            return w(e());
        }
        if (b == 34) {
            return w(k());
        }
        throw new Exception(ckf.p("BytesReader::btostrv: not supported code: ", tru.h0(b)));
    }

    public final String w(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("631e2b86", new Object[]{this, new Integer(i)});
        }
        String str = new String(this.f17492a, this.e, i, uj3.UTF_8);
        this.e += i;
        iiz.Companion.j(ckf.p("btostrv: strView: ", str));
        return str;
    }

    public final int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9192adab", new Object[]{this})).intValue();
        }
        byte[] bArr = this.f17492a;
        int i = this.e;
        this.e = 1 + i;
        byte b = bArr[i];
        if (b == 40 || b == 44) {
            return d() & 255;
        }
        if (b == 41 || b == 45) {
            return g() & 65535;
        }
        if (b == 42 || b == 46) {
            return m();
        }
        if (b == 35) {
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    public final boolean y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c5433e4", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.e + i > this.c) {
            return true;
        }
        return false;
    }

    public final int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("416b4fd9", new Object[]{this})).intValue();
        }
        return this.d;
    }
}
