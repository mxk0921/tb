package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.YuvImage;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tox {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nij f28851a;

    static {
        t2o.a(481297663);
    }

    public tox(Context context) {
        this.f28851a = new nij(context);
    }

    public static YuvImage a(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = i4;
        int i9 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YuvImage) ipChange.ipc$dispatch("2a481131", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i8), new Integer(i5), new Integer(i6)});
        }
        if (i3 > i || i8 > i2) {
            return null;
        }
        int i10 = (i3 / 2) * 2;
        int i11 = (i8 / 2) * 2;
        int i12 = (i5 / 2) * 2;
        int i13 = (i6 / 2) * 2;
        int i14 = i12 * i13;
        byte[] bArr2 = new byte[(i14 / 2) + i14];
        int i15 = 0;
        while (true) {
            i7 = i13 + i11;
            if (i8 >= i7) {
                break;
            }
            System.arraycopy(bArr, (i8 * i) + i10, bArr2, i15 * i12, i12);
            i15++;
            i8++;
        }
        for (int i16 = i11 / 2; i16 < i7 / 2; i16++) {
            System.arraycopy(bArr, (i * i2) + i10 + (i16 * i), bArr2, (i9 * i12) + i14, i12);
            i9++;
        }
        return new YuvImage(bArr2, 17, i12, i13, null);
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("3b3fa0af", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        int i3 = i * i2;
        byte[] bArr2 = new byte[(i3 * 3) / 2];
        int i4 = i - 1;
        int i5 = 0;
        for (int i6 = i4; i6 >= 0; i6--) {
            for (int i7 = 0; i7 < i2; i7++) {
                bArr2[i5] = bArr[(i7 * i) + i6];
                i5++;
            }
        }
        int i8 = i3;
        while (i4 > 0) {
            for (int i9 = 0; i9 < i2 / 2; i9++) {
                int i10 = (i9 * i) + i3;
                bArr2[i8] = bArr[(i4 - 1) + i10];
                bArr2[i8 + 1] = bArr[i10 + i4];
                i8 += 2;
            }
            i4 -= 2;
        }
        return bArr2;
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9949d6ed", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        int i3 = i * i2;
        int i4 = (i3 * 3) / 2;
        byte[] bArr2 = new byte[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            for (int i7 = i2 - 1; i7 >= 0; i7--) {
                bArr2[i5] = bArr[(i7 * i) + i6];
                i5++;
            }
        }
        int i8 = i4 - 1;
        for (int i9 = i - 1; i9 > 0; i9 -= 2) {
            for (int i10 = 0; i10 < i2 / 2; i10++) {
                int i11 = (i10 * i) + i3;
                bArr2[i8] = bArr[i11 + i9];
                bArr2[i8 - 1] = bArr[i11 + (i9 - 1)];
                i8 -= 2;
            }
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.YuvImage d(android.graphics.YuvImage r16, int r17, android.graphics.RectF r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tox.d(android.graphics.YuvImage, int, android.graphics.RectF, int, int):android.graphics.YuvImage");
    }

    public Bitmap e(int i, int i2, int i3, byte[] bArr, RectF rectF, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("93dfadce", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), bArr, rectF, new Integer(i4), new Integer(i5)});
        }
        YuvImage d = d(new YuvImage(bArr, 17, i2, i3, null), i, rectF, i4, i5);
        return this.f28851a.b(d.getYuvData(), d.getWidth(), d.getHeight());
    }
}
