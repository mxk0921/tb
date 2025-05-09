package com.taobao.login4android.ab;

import androidx.collection.ScatterMapKt;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MurmurHash3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(517996569);
    }

    private MurmurHash3() {
    }

    private static int fmix32(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8003d06f", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    public static int hash32(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd3436fb", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int i5 = i2 >> 2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = (i6 << 2) + i;
            i3 = mix32(((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16), i3);
        }
        int i8 = i5 << 2;
        int i9 = i2 - i8;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i4 = bArr[(i + i8) + 2] << 16;
                }
                return fmix32(i2, i3);
            }
            i4 ^= bArr[(i + i8) + 1] << 8;
        }
        i3 ^= Integer.rotateLeft((bArr[i + i8] ^ i4) * ScatterMapKt.MurmurHashC1, 15) * 461845907;
        return fmix32(i2, i3);
    }

    private static int mix32(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f3bec95", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return (Integer.rotateLeft((Integer.rotateLeft(i * ScatterMapKt.MurmurHashC1, 15) * 461845907) ^ i2, 13) * 5) - 430675100;
    }
}
