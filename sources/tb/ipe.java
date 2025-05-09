package tb;

import android.media.Image;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ipe {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297615);
    }

    public static float a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0a8b49f", new Object[]{bArr, new Integer(i), new Integer(i2)})).floatValue();
        }
        if (bArr != null) {
            try {
                if (!(bArr.length == 0 || (i & 1) == 1)) {
                    float f = 0.0f;
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = i3 * i;
                        for (int i5 = 0; i5 < i; i5 += 4) {
                            f += bArr[i4 + i5] & 255;
                        }
                    }
                    return (f / 255.0f) / ((i * i2) >> 2);
                }
            } catch (Exception e) {
                agh.d(was.TAG, "calMeanImgValue", e);
            }
        }
        return -1.0f;
    }

    public static float b(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58482494", new Object[]{bArr, new Integer(i), new Integer(i2)})).floatValue();
        }
        return a(bArr, i, i2);
    }

    public static int c(byte[] bArr, int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e2f5276", new Object[]{bArr, new Integer(i), new Integer(i2), new Float(f)})).intValue();
        }
        if (b(bArr, i, i2) < f) {
            return 1;
        }
        return 2;
    }

    public static int d(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7dcfea5d", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int i4 = i * i2;
        if (i4 <= 0 || bArr.length == 0) {
            return 2;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            try {
                i5 += bArr[i6] & 255;
            } catch (Exception unused) {
                return 2;
            }
        }
        if (i5 / i4 < i3) {
            return 1;
        }
        return 2;
    }

    public static boolean e(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f972816c", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (d(bArr, i, i2, i3) == 1) {
            return true;
        }
        return false;
    }

    public static byte[] f(Image image) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("50aad915", new Object[]{image});
        }
        int width = image.getWidth();
        int height = image.getHeight();
        int i2 = width * height;
        byte[] bArr = new byte[((i2 / 4) * 2) + i2];
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        ByteBuffer buffer2 = image.getPlanes()[1].getBuffer();
        ByteBuffer buffer3 = image.getPlanes()[2].getBuffer();
        int rowStride = image.getPlanes()[0].getRowStride();
        if (rowStride == width) {
            buffer.get(bArr, 0, i2);
            i = i2;
        } else {
            long j = -rowStride;
            i = 0;
            while (i < i2) {
                j += rowStride;
                buffer.position((int) j);
                buffer.get(bArr, i, width);
                i += width;
            }
        }
        int rowStride2 = image.getPlanes()[2].getRowStride();
        int pixelStride = image.getPlanes()[2].getPixelStride();
        if (pixelStride == 2 && rowStride2 == width && buffer2.get(0) == buffer3.get(1)) {
            byte b = buffer3.get(1);
            byte b2 = (byte) (~b);
            try {
                buffer3.put(1, b2);
                if (buffer2.get(0) == b2) {
                    buffer3.put(1, b);
                    buffer3.position(0);
                    buffer2.position(0);
                    buffer3.get(bArr, i2, 1);
                    buffer2.get(bArr, i2 + 1, buffer2.remaining());
                    return bArr;
                }
            } catch (ReadOnlyBufferException unused) {
            }
            buffer3.put(1, b);
        }
        for (int i3 = 0; i3 < height / 2; i3++) {
            for (int i4 = 0; i4 < width / 2; i4++) {
                int i5 = (i4 * pixelStride) + (i3 * rowStride2);
                int i6 = i + 1;
                bArr[i] = buffer3.get(i5);
                i += 2;
                bArr[i6] = buffer2.get(i5);
            }
        }
        return bArr;
    }
}
