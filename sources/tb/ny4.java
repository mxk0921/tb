package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Crop;
import com.taobao.android.litecreator.sdk.editor.data.Transform;
import com.taobao.android.litecreator.util.MediaUtils;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ny4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(511705477);
    }

    public static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7b37ce", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > i2 || i5 > i) {
            while (true) {
                if (i4 / i3 <= i2 && i5 / i3 <= i) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    public static int b(Context context, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab393a7", new Object[]{context, str, bitmap})).intValue();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int n = MediaUtils.n(context, Uri.fromFile(new File(str)));
        if (n == 6 || n == 8) {
            width = height;
            height = width;
        }
        return a(options, width, height);
    }

    public static Bitmap c(int i, Bitmap bitmap, Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("dee59e6e", new Object[]{new Integer(i), bitmap, crop});
        }
        Transform transform = crop.transform;
        float f = transform.scale;
        float f2 = transform.rotate;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Transform transform2 = crop.transform;
        int i2 = transform2.sampleSize;
        int i3 = ((int) transform2.offsetX) / i;
        int i4 = ((int) transform2.offsetY) / i;
        Rect rect = crop.rect;
        int round = Math.round((rect.width() * i2) / f) / i;
        int round2 = Math.round((rect.height() * i2) / f) / i;
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, width, height);
        float[] b = hrn.b(rectF);
        float[] fArr = new float[8];
        Matrix matrix = new Matrix();
        matrix.postRotate(f2);
        matrix.mapPoints(fArr, b);
        RectF d = hrn.d(fArr);
        float abs = Math.abs(d.left - rectF.left);
        int abs2 = (int) ((-i4) + Math.abs(d.top - rectF.top));
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate((int) ((-i3) + abs), abs2);
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        Matrix matrix2 = new Matrix();
        matrix2.postRotate(f2);
        canvas.drawBitmap(bitmap, matrix2, paint);
        return Bitmap.createBitmap(createBitmap, 0, 0, Math.min(width, round), Math.min(height, round2));
    }
}
