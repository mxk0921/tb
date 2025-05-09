package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lg5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f23321a;
    public int b;
    public int c;

    static {
        t2o.a(444597029);
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b96a7cb3", new Object[]{this});
        }
        return this.f23321a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85622849", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("265b2898", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public byte[] d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ca928bf5", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        return Arrays.copyOfRange(this.f23321a, i, i2);
    }

    public double f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("674561fc", new Object[]{this})).doubleValue();
        }
        return Double.longBitsToDouble(i());
    }

    public float g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("104e47dd", new Object[]{this})).floatValue();
        }
        return Float.intBitsToFloat(h());
    }

    public boolean k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e9bfbe8", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int i2 = this.c;
        if (i > i2) {
            this.b = i2;
        } else if (i < 0) {
            this.b = 0;
        } else {
            this.b = i;
            return true;
        }
        return false;
    }

    public boolean l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a244a3d1", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return k(this.b + i);
    }

    public void m(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21fc1bd", new Object[]{this, bArr});
            return;
        }
        this.f23321a = bArr;
        if (bArr != null) {
            this.c = bArr.length;
        } else {
            this.c = 0;
        }
        this.b = 0;
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a3706", new Object[]{this, new Integer(i)});
        }
    }

    public byte e() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a5be931", new Object[]{this})).byteValue();
        }
        byte[] bArr = this.f23321a;
        if (bArr == null || (i = this.b) >= this.c) {
            Log.e("CodeReader_TMTEST", "readByte error mCode:" + this.f23321a + "  mCurIndex:" + this.b + "  mCount:" + this.c);
            return (byte) -1;
        }
        this.b = 1 + i;
        return bArr[i];
    }

    public int h() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4888f673", new Object[]{this})).intValue();
        }
        byte[] bArr = this.f23321a;
        if (bArr == null || (i = this.b) >= this.c - 3) {
            Log.e("CodeReader_TMTEST", "readInt error mCode:" + this.f23321a + "  mCurIndex:" + this.b + "  mCount:" + this.c);
            return -1;
        }
        int i2 = 1 + i;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = ((bArr[i2] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i5 = i + 3;
        this.b = i5;
        this.b = i + 4;
        return i4 | ((bArr[i3] & 255) << 8) | (bArr[i5] & 255);
    }

    public long i() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2e0874ad", new Object[]{this})).longValue();
        }
        byte[] bArr = this.f23321a;
        if (bArr == null || (i = this.b) >= this.c - 7) {
            Log.e("CodeReader_TMTEST", "readLong error mCode:" + this.f23321a + "  mCurIndex:" + this.b + "  mCount:" + this.c);
            return -1L;
        }
        int i2 = 1 + i;
        this.b = i2;
        int i3 = i + 2;
        this.b = i3;
        int i4 = i + 3;
        this.b = i4;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40);
        int i5 = i + 4;
        this.b = i5;
        int i6 = i + 5;
        this.b = i6;
        long j2 = j | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24);
        int i7 = i + 6;
        this.b = i7;
        int i8 = i + 7;
        this.b = i8;
        this.b = i + 8;
        return (bArr[i8] & 255) | j2 | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8);
    }

    public short j() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15459a0a", new Object[]{this})).shortValue();
        }
        byte[] bArr = this.f23321a;
        if (bArr == null || (i = this.b) >= this.c - 1) {
            Log.e("CodeReader_TMTEST", "readShort error mCode:" + this.f23321a + "  mCurIndex:" + this.b + "  mCount:" + this.c);
            return (short) -1;
        }
        int i2 = 1 + i;
        this.b = i2;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }
}
