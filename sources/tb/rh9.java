package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.common.NdkCore;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.PexodeException;
import java.io.IOException;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class rh9 implements vw6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Field sBitmapBufferField;

    static {
        t2o.a(618659865);
        t2o.a(618659864);
    }

    public static long getPixelAddressFromBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de63a6fe", new Object[]{bitmap})).longValue();
        }
        long[] jArr = {0};
        try {
            NdkCore.nativePinBitmapWithAddr(bitmap, jArr);
        } catch (Throwable th) {
            xv8.c(p0m.TAG, "get Bitmap pixels address error=%s", th);
        }
        return jArr[0];
    }

    public static boolean invalidBitmap(Bitmap bitmap, PexodeOptions pexodeOptions, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f83d1cc", new Object[]{bitmap, pexodeOptions, str})).booleanValue();
        }
        if (bitmap == null) {
            xv8.c(p0m.TAG, "%s bitmap is null", str);
            return true;
        } else if (bitmap.getWidth() * bitmap.getHeight() >= pexodeOptions.outWidth * pexodeOptions.outHeight) {
            return false;
        } else {
            xv8.c(p0m.TAG, "%s bitmap space not large enough", str);
            return true;
        }
    }

    public static Bitmap newBitmap(PexodeOptions pexodeOptions, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4d9d469", new Object[]{pexodeOptions, new Boolean(z)});
        }
        if (z) {
            return qc1.a().b(pexodeOptions.outWidth, pexodeOptions.outHeight, PexodeOptions.CONFIG);
        }
        return Bitmap.createBitmap(pexodeOptions.outWidth, pexodeOptions.outHeight, PexodeOptions.CONFIG);
    }

    public abstract Bitmap decodeAshmem(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws PexodeException, IOException;

    public abstract Bitmap decodeInBitmap(RewindableStream rewindableStream, PexodeOptions pexodeOptions, t97 t97Var) throws PexodeException, IOException;

    public abstract Bitmap decodeNormal(RewindableStream rewindableStream, PexodeOptions pexodeOptions) throws PexodeException;

    public byte[] getPixelBufferFromBitmap(Bitmap bitmap) {
        try {
            if (ensureBitmapBufferField()) {
                return (byte[]) sBitmapBufferField.get(bitmap);
            }
            return null;
        } catch (Exception e) {
            xv8.c(p0m.TAG, "get Bitmap buffer field error=%s", e);
            return null;
        }
    }

    public synchronized boolean ensureBitmapBufferField() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f923558", new Object[]{this})).booleanValue();
        }
        if (sBitmapBufferField == null) {
            try {
                Field declaredField = Bitmap.class.getDeclaredField("mBuffer");
                sBitmapBufferField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                xv8.c(p0m.TAG, "ensure Bitmap buffer field error=%s", e);
                return false;
            }
        }
        return true;
    }
}
