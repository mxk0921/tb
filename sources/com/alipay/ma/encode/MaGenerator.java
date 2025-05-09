package com.alipay.ma.encode;

import android.graphics.Bitmap;
import com.alipay.ma.MaLogger;
import com.alipay.ma.decode.MaDecode;
import com.alipay.ma.encode.InputParameters.Gen0InputParameters;
import com.alipay.ma.encode.InputParameters.Gen3InputParameters;
import com.alipay.ma.encode.InputParameters.LogoBWInputParameters;
import com.alipay.ma.encode.InputParameters.MaEncodeInputParameters;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MaGenerator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MaGenerator";

    static {
        MaLogger.v(TAG, "MaGenerator: loading so files");
        MaDecode.init("maGenerator");
    }

    public static synchronized Bitmap a(Gen0InputParameters gen0InputParameters) {
        synchronized (MaGenerator.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("7179160f", new Object[]{gen0InputParameters});
            }
            try {
                byte[] generateBWQRCode = generateBWQRCode(gen0InputParameters.publicData, gen0InputParameters.hiddenData, gen0InputParameters.margin, gen0InputParameters.qrSize, gen0InputParameters.version, gen0InputParameters.rotation, gen0InputParameters.errorCorrectionLevel);
                int sqrt = (int) Math.sqrt(generateBWQRCode.length * 1.0d);
                return d(generateBWQRCode, sqrt, sqrt);
            } catch (Exception e) {
                MaLogger.e(TAG, "Failed to load libtbdecode.so 2", e);
                return null;
            } catch (UnsatisfiedLinkError e2) {
                MaLogger.e(TAG, "Failed to load libtbdecode.so", e2);
                return null;
            }
        }
    }

    public static synchronized Bitmap b(Gen3InputParameters gen3InputParameters) {
        synchronized (MaGenerator.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("a79521df", new Object[]{gen3InputParameters});
            }
            try {
                byte[] generateGen3Code = generateGen3Code(gen3InputParameters.publicData, gen3InputParameters.bgImage_data, gen3InputParameters.bgImage_width, gen3InputParameters.bgImage_height, gen3InputParameters.bgImage_channel, gen3InputParameters.bgImage_step, gen3InputParameters.qrX, gen3InputParameters.qrY, gen3InputParameters.qrSize, gen3InputParameters.gen3format, gen3InputParameters.domainIndex, gen3InputParameters.errorCorrectionLevel, gen3InputParameters.visual_level, gen3InputParameters.version, gen3InputParameters.type);
                int sqrt = (int) Math.sqrt((generateGen3Code.length / 3.0d) * 1.0d);
                return e(generateGen3Code, sqrt, sqrt, gen3InputParameters.bgImage_channel);
            } catch (Exception e) {
                MaLogger.e(TAG, "Failed to load libtbdecode.so 2", e);
                return null;
            } catch (UnsatisfiedLinkError e2) {
                MaLogger.e(TAG, "Failed to load libtbdecode.so", e2);
                return null;
            }
        }
    }

    public static synchronized Bitmap c(LogoBWInputParameters logoBWInputParameters) {
        synchronized (MaGenerator.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("dbdb9759", new Object[]{logoBWInputParameters});
            }
            try {
                byte[] generateLogoQRCode = generateLogoQRCode(logoBWInputParameters.publicData, logoBWInputParameters.margin, logoBWInputParameters.qrSize, logoBWInputParameters.version, logoBWInputParameters.logoData, logoBWInputParameters.logoWidth, logoBWInputParameters.logoHeight, logoBWInputParameters.logoChannel, logoBWInputParameters.logoSize, logoBWInputParameters.logoX, logoBWInputParameters.logoY, logoBWInputParameters.qrcolor);
                int sqrt = (int) Math.sqrt((generateLogoQRCode.length / 3.0d) * 1.0d);
                return e(generateLogoQRCode, sqrt, sqrt, 3);
            } catch (Exception e) {
                MaLogger.e("Failed to load libtbdecode.so 2", e);
                return null;
            } catch (UnsatisfiedLinkError e2) {
                MaLogger.e(TAG, "Failed to load libtbdecode.so", e2);
                return null;
            }
        }
    }

    public static Bitmap d(byte[] bArr, int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ea80cdf4", new Object[]{bArr, new Integer(i), new Integer(i2)});
        }
        if (bArr == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[i * i2];
        int i4 = 0;
        while (i3 < bArr.length) {
            byte b = bArr[i3];
            iArr[i4] = (((b & 255) << 16) - 16777216) + ((b & 255) << 8) + (b & 255);
            i3++;
            i4++;
        }
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return createBitmap;
    }

    public static Bitmap e(byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bdf7b46e", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (bArr == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[i * i2];
        int i6 = 0;
        while (i5 < bArr.length) {
            if (i3 == 4) {
                i4 = (bArr[i5 + 3] & 255) << 24;
            } else {
                i4 = -16777216;
            }
            iArr[i6] = i4 + ((bArr[i5] & 255) << 16) + ((bArr[i5 + 1] & 255) << 8) + (bArr[i5 + 2] & 255);
            i5 += i3;
            i6++;
        }
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return createBitmap;
    }

    public static Bitmap facade(MaEncodeInputParameters maEncodeInputParameters) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9f528d14", new Object[]{maEncodeInputParameters});
        }
        if (!maEncodeInputParameters.isLegal()) {
            return null;
        }
        try {
            i = maEncodeInputParameters.type;
        } catch (Exception e) {
            e.toString();
        }
        if (i == 0) {
            return a((Gen0InputParameters) maEncodeInputParameters);
        }
        if (i == 1) {
            return null;
        }
        if (i == 3) {
            return b((Gen3InputParameters) maEncodeInputParameters);
        }
        if (i == 4) {
            return c((LogoBWInputParameters) maEncodeInputParameters);
        }
        return null;
    }

    private static native byte[] generateBWQRCode(String str, String str2, int i, int i2, int i3, int i4, char c);

    private static native byte[] generateGen3Code(String str, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, char c, char c2, int i9, int i10, int i11);

    private static native byte[] generateLogoQRCode(String str, int i, int i2, int i3, byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9, int i10);
}
