package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ReedSolomonEncoder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final GenericGF f3638a;
    public final List<GenericGFPoly> b;

    public ReedSolomonEncoder(GenericGF genericGF) {
        this.f3638a = genericGF;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new GenericGFPoly(genericGF, new int[]{1}));
    }

    public final GenericGFPoly a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericGFPoly) ipChange.ipc$dispatch("6879353b", new Object[]{this, new Integer(i)});
        }
        if (i >= ((ArrayList) this.b).size()) {
            List<GenericGFPoly> list = this.b;
            GenericGFPoly genericGFPoly = (GenericGFPoly) ((ArrayList) list).get(((ArrayList) list).size() - 1);
            for (int size = ((ArrayList) this.b).size(); size <= i; size++) {
                GenericGF genericGF = this.f3638a;
                genericGFPoly = genericGFPoly.multiply(new GenericGFPoly(genericGF, new int[]{1, genericGF.exp((size - 1) + genericGF.getGeneratorBase())}));
                ((ArrayList) this.b).add(genericGFPoly);
            }
        }
        return (GenericGFPoly) ((ArrayList) this.b).get(i);
    }

    public final void encode(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a6fcf8", new Object[]{this, iArr, new Integer(i)});
        } else if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                GenericGFPoly a2 = a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] coefficients = new GenericGFPoly(this.f3638a, iArr2).multiplyByMonomial(i, 1).divide(a2)[1].getCoefficients();
                int length2 = i - coefficients.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(coefficients, 0, iArr, length + length2, coefficients.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        } else {
            throw new IllegalArgumentException("No error correction bytes");
        }
    }
}
