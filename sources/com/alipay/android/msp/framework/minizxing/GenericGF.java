package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bpr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class GenericGF {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final GenericGF AZTEC_DATA_6;
    public static final GenericGF AZTEC_DATA_8;
    public static final GenericGF DATA_MATRIX_FIELD_256;
    public static final GenericGF MAXICODE_FIELD_64;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f3634a;
    public final int[] b;
    public final GenericGFPoly c;
    public final GenericGFPoly d;
    public final int e;
    public final int f;
    public final int g;
    public static final GenericGF AZTEC_DATA_12 = new GenericGF(4201, 4096, 1);
    public static final GenericGF AZTEC_DATA_10 = new GenericGF(bpr.MSG_TYPE_UPDATE_BROADCASTER_SCORE, 1024, 1);
    public static final GenericGF AZTEC_PARAM = new GenericGF(19, 16, 1);
    public static final GenericGF QR_CODE_FIELD_256 = new GenericGF(285, 256, 0);

    static {
        GenericGF genericGF = new GenericGF(67, 64, 1);
        AZTEC_DATA_6 = genericGF;
        GenericGF genericGF2 = new GenericGF(301, 256, 1);
        DATA_MATRIX_FIELD_256 = genericGF2;
        AZTEC_DATA_8 = genericGF2;
        MAXICODE_FIELD_64 = genericGF;
    }

    public GenericGF(int i, int i2, int i3) {
        this.f = i;
        this.e = i2;
        this.g = i3;
        this.f3634a = new int[i2];
        this.b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f3634a[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.b[this.f3634a[i6]] = i6;
        }
        this.c = new GenericGFPoly(this, new int[]{0});
        this.d = new GenericGFPoly(this, new int[]{1});
    }

    public static int addOrSubtract(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eaea06b2", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return i ^ i2;
    }

    public final GenericGFPoly buildMonomial(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly) ipChange.ipc$dispatch("addf9673", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.c;
        } else {
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new GenericGFPoly(this, iArr);
        }
    }

    public final int exp(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("897cbf52", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.f3634a[i];
    }

    public final int getGeneratorBase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6a8be08", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public final GenericGFPoly getOne() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly) ipChange.ipc$dispatch("f47f739b", new Object[]{this});
        }
        return this.d;
    }

    public final int getSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public final GenericGFPoly getZero() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly) ipChange.ipc$dispatch("f598926d", new Object[]{this});
        }
        return this.c;
    }

    public final int inverse(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efa3221f", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i != 0) {
            return this.f3634a[(this.e - this.b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public final int log(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7531468b", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i != 0) {
            return this.b[i];
        }
        throw new IllegalArgumentException();
    }

    public final int multiply(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18995a3e", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f3634a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.e - 1)];
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "GF(0x" + Integer.toHexString(this.f) + ',' + this.e + ')';
    }
}
