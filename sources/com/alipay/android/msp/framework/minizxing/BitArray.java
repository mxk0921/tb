package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BitArray implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int[] f3629a;
    public int b;

    public BitArray() {
        this.b = 0;
        this.f3629a = new int[1];
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ce3744", new Object[]{this, new Integer(i)});
            return;
        }
        int[] iArr = this.f3629a;
        if (i > iArr.length * 32) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f3629a = iArr2;
        }
    }

    public final void appendBit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa2db7a", new Object[]{this, new Boolean(z)});
            return;
        }
        a(this.b + 1);
        if (z) {
            int[] iArr = this.f3629a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public final void appendBitArray(BitArray bitArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac5bcd9", new Object[]{this, bitArray});
            return;
        }
        int i = bitArray.b;
        a(this.b + i);
        for (int i2 = 0; i2 < i; i2++) {
            appendBit(bitArray.get(i2));
        }
    }

    public final void appendBits(int i, int i2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf2ba67", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        } else {
            a(this.b + i2);
            while (i2 > 0) {
                if (((i >> (i2 - 1)) & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                appendBit(z);
                i2--;
            }
        }
    }

    public final void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        int length = this.f3629a.length;
        for (int i = 0; i < length; i++) {
            this.f3629a[i] = 0;
        }
    }

    public final boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        if (this.b != bitArray.b || !Arrays.equals(this.f3629a, bitArray.f3629a)) {
            return false;
        }
        return true;
    }

    public final boolean get(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72fc15ca", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (((1 << (i & 31)) & this.f3629a[i / 32]) != 0) {
            return true;
        }
        return false;
    }

    public final int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int getSizeInBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46062c9", new Object[]{this})).intValue();
        }
        return (this.b + 7) / 8;
    }

    public final int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (this.b * 31) + Arrays.hashCode(this.f3629a);
    }

    public final void set(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a303a", new Object[]{this, new Integer(i)});
            return;
        }
        int[] iArr = this.f3629a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public final void toBytes(int i, byte[] bArr, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af3e2013", new Object[]{this, new Integer(i), bArr, new Integer(i2), new Integer(i3)});
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (get(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public final String toString() {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(this.b);
        for (int i = 0; i < this.b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            if (get(i)) {
                c = 'X';
            } else {
                c = '.';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final void xor(BitArray bitArray) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb65e8a4", new Object[]{this, bitArray});
        } else if (this.f3629a.length == bitArray.f3629a.length) {
            while (true) {
                int[] iArr = this.f3629a;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ bitArray.f3629a[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public final BitArray clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitArray) ipChange.ipc$dispatch("6bf7ad5a", new Object[]{this}) : new BitArray((int[]) this.f3629a.clone(), this.b);
    }

    public BitArray(int[] iArr, int i) {
        this.f3629a = iArr;
        this.b = i;
    }
}
