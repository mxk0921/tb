package kotlin.uuid;

import tb.nva;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class b extends a {
    public static final /* synthetic */ void b(long j, byte[] bArr, int i, int i2) {
        d(j, bArr, i, i2);
    }

    public static final /* synthetic */ void c(long j, byte[] bArr, int i) {
        e(j, bArr, i);
    }

    public static final void d(long j, byte[] bArr, int i, int i2) {
        int i3 = i + (i2 * 2);
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = nva.b()[(int) (255 & j)];
            bArr[i3 - 1] = (byte) i5;
            i3 -= 2;
            bArr[i3] = (byte) (i5 >> 8);
            j >>= 8;
        }
    }

    public static final void e(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i + i2] = (byte) (j >>> ((7 - i2) * 8));
        }
    }
}
