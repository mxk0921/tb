package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class GenericGFPoly {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final GenericGF f3635a;
    public final int[] b;

    public GenericGFPoly(GenericGF genericGF, int[] iArr) {
        if (iArr.length != 0) {
            this.f3635a = genericGF;
            int length = iArr.length;
            int i = 1;
            if (length <= 1 || iArr[0] != 0) {
                this.b = iArr;
                return;
            }
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[length - i];
            this.b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final GenericGFPoly addOrSubtract(GenericGFPoly genericGFPoly) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly) ipChange.ipc$dispatch("2cf4b757", new Object[]{this, genericGFPoly});
        }
        if (!this.f3635a.equals(genericGFPoly.f3635a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (isZero()) {
            return genericGFPoly;
        } else {
            if (genericGFPoly.isZero()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = genericGFPoly.b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = GenericGF.addOrSubtract(iArr2[i - length], iArr[i]);
            }
            return new GenericGFPoly(this.f3635a, iArr3);
        }
    }

    public final GenericGFPoly[] divide(GenericGFPoly genericGFPoly) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly[]) ipChange.ipc$dispatch("150bdc3d", new Object[]{this, genericGFPoly});
        }
        if (!this.f3635a.equals(genericGFPoly.f3635a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!genericGFPoly.isZero()) {
            GenericGFPoly zero = this.f3635a.getZero();
            int inverse = this.f3635a.inverse(genericGFPoly.getCoefficient(genericGFPoly.getDegree()));
            GenericGFPoly genericGFPoly2 = this;
            while (genericGFPoly2.getDegree() >= genericGFPoly.getDegree() && !genericGFPoly2.isZero()) {
                int degree = genericGFPoly2.getDegree() - genericGFPoly.getDegree();
                int multiply = this.f3635a.multiply(genericGFPoly2.getCoefficient(genericGFPoly2.getDegree()), inverse);
                GenericGFPoly multiplyByMonomial = genericGFPoly.multiplyByMonomial(degree, multiply);
                zero = zero.addOrSubtract(this.f3635a.buildMonomial(degree, multiply));
                genericGFPoly2 = genericGFPoly2.addOrSubtract(multiplyByMonomial);
            }
            return new GenericGFPoly[]{zero, genericGFPoly2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    public final int getCoefficient(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e878b6b0", new Object[]{this, new Integer(i)})).intValue();
        }
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    public final int[] getCoefficients() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9ca21169", new Object[]{this});
        }
        return this.b;
    }

    public final int getDegree() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e60e653c", new Object[]{this})).intValue();
        }
        return this.b.length - 1;
    }

    public final boolean isZero() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f996967d", new Object[]{this})).booleanValue();
        }
        if (this.b[0] == 0) {
            return true;
        }
        return false;
    }

    public final GenericGFPoly multiply(GenericGFPoly genericGFPoly) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly) ipChange.ipc$dispatch("a19efd4b", new Object[]{this, genericGFPoly});
        }
        if (!this.f3635a.equals(genericGFPoly.f3635a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (isZero() || genericGFPoly.isZero()) {
            return this.f3635a.getZero();
        } else {
            int[] iArr = this.b;
            int length = iArr.length;
            int[] iArr2 = genericGFPoly.b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[(length + length2) - 1];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = GenericGF.addOrSubtract(iArr3[i4], this.f3635a.multiply(i2, iArr2[i3]));
                }
            }
            return new GenericGFPoly(this.f3635a, iArr3);
        }
    }

    public final GenericGFPoly multiplyByMonomial(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly) ipChange.ipc$dispatch("dbb292a6", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f3635a.getZero();
        } else {
            int length = this.b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f3635a.multiply(this.b[i3], i2);
            }
            return new GenericGFPoly(this.f3635a, iArr);
        }
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(getDegree() * 8);
        for (int degree = getDegree(); degree >= 0; degree--) {
            int coefficient = getCoefficient(degree);
            if (coefficient != 0) {
                if (coefficient < 0) {
                    sb.append(" - ");
                    coefficient = -coefficient;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (degree == 0 || coefficient != 1) {
                    int log = this.f3635a.log(coefficient);
                    if (log == 0) {
                        sb.append('1');
                    } else if (log == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(log);
                    }
                }
                if (degree != 0) {
                    if (degree == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(degree);
                    }
                }
            }
        }
        return sb.toString();
    }
}
