package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class z6n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(665845821);
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("96aa0cd4", new Object[]{bitmap, bitmap2});
        }
        try {
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            float f = (width2 / width) + 0.6f;
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, true);
            int width3 = createBitmap.getWidth();
            int height3 = createBitmap.getHeight();
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(bitmap, (width3 - width2) / 2, (((height3 - height2) * 2) / 3) - 5, (Paint) null);
            canvas.save();
            canvas.restore();
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return bitmap;
        }
    }

    public static Bitmap b(Bitmap bitmap, Bitmap bitmap2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4d6c539e", new Object[]{bitmap, bitmap2, new Integer(i)});
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        try {
            int[] iArr = new int[width * height];
            int i2 = 0;
            for (int i3 = 0; i3 < height; i3++) {
                for (int i4 = 0; i4 < width; i4++) {
                    int pixel = bitmap.getPixel(i4, i3);
                    if (pixel != -1) {
                        iArr[i2] = i;
                    } else {
                        iArr[i2] = pixel;
                    }
                    i2++;
                }
            }
            bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
