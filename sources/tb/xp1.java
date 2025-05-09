package tb;

import com.alibaba.ariver.remoterpc.EncodingUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class xp1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f31506a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, c0z.MAP32, 57, 43, 47};

    static {
        t2o.a(401604635);
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9bd317fc", new Object[]{bArr});
        }
        return b(bArr, f31506a);
    }

    public static String b(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b09e8315", new Object[]{bArr, bArr2});
        }
        byte[] bArr3 = new byte[((bArr.length + 2) * 4) / 3];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            bArr3[i] = bArr2[(bArr[i2] & 255) >> 2];
            int i3 = i2 + 1;
            bArr3[i + 1] = bArr2[((bArr[i2] & 3) << 4) | ((bArr[i3] & 255) >> 4)];
            int i4 = i + 3;
            int i5 = i2 + 2;
            bArr3[i + 2] = bArr2[((bArr[i3] & 15) << 2) | ((bArr[i5] & 255) >> 6)];
            i += 4;
            bArr3[i4] = bArr2[bArr[i5] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            bArr3[1 + i] = bArr2[(bArr[length] & 3) << 4];
            int i6 = i + 3;
            bArr3[2 + i] = 61;
            i += 4;
            bArr3[i6] = 61;
        } else if (length2 == 2) {
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i7 = length + 1;
            bArr3[i + 1] = bArr2[((bArr[i7] & 255) >> 4) | ((bArr[length] & 3) << 4)];
            int i8 = i + 3;
            bArr3[i + 2] = bArr2[(bArr[i7] & 15) << 2];
            i += 4;
            bArr3[i8] = 61;
        }
        try {
            return new String(bArr3, 0, i, EncodingUtils.US_ASCII);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
