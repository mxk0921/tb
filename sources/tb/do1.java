package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class do1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262881);
    }

    public static Rect a(int i, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("99a9fbdc", new Object[]{new Integer(i), rect});
        }
        if (rect.height() == 0) {
            return new Rect();
        }
        return new Rect(0, 0, (int) Math.ceil(((rect.width() * 1.0d) * i) / rect.height()), i);
    }

    public static Drawable b(Context context, Drawable drawable, Rect rect, int i) {
        Throwable th;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("76723de3", new Object[]{context, drawable, rect, new Integer(i)});
        }
        Bitmap bitmap2 = null;
        try {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int width = rect.width() - bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width > 0) {
                if (i >= bitmap.getWidth()) {
                    return drawable;
                }
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i - 1, height);
                Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, i, 0, 1, height);
                Bitmap createBitmap3 = Bitmap.createBitmap(bitmap, i + 1, 0, (bitmap.getWidth() - i) - 1, height);
                Bitmap createBitmap4 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap4);
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                for (int i2 = 0; i2 <= width; i2++) {
                    canvas.drawBitmap(createBitmap2, (i2 + i) - 1, 0.0f, (Paint) null);
                }
                canvas.drawBitmap(createBitmap3, width + i, 0.0f, (Paint) null);
                createBitmap.recycle();
                createBitmap2.recycle();
                createBitmap3.recycle();
                return new BitmapDrawable(context.getResources(), createBitmap4);
            } else if (width >= 0) {
                return drawable;
            } else {
                int width2 = (bitmap.getWidth() - i) + width;
                if (width2 <= 0) {
                    return drawable;
                }
                Bitmap createBitmap5 = Bitmap.createBitmap(bitmap, 0, 0, i, height);
                Bitmap createBitmap6 = Bitmap.createBitmap(bitmap, i - width, 0, width2, height);
                Bitmap createBitmap7 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap7);
                canvas2.drawBitmap(createBitmap5, 0.0f, 0.0f, (Paint) null);
                canvas2.drawBitmap(createBitmap6, i, 0.0f, (Paint) null);
                createBitmap5.recycle();
                createBitmap6.recycle();
                return new BitmapDrawable(context.getResources(), createBitmap7);
            }
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = bitmap;
            if (bitmap2 != null) {
                tgh.c("BackgroundImgUtils", "imgSplitAndMerge fail.Bitmap split=" + i + ",bitmap w==" + bitmap2.getWidth() + ", h==" + bitmap2.getHeight(), th);
            } else {
                tgh.c("BackgroundImgUtils", "imgSplitAndMerge fail.Bitmap split=" + i + ",bitmap == null", th);
            }
            return drawable;
        }
    }

    public static boolean c(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b51f367c", new Object[]{drawable})).booleanValue();
        }
        if (drawable != null) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
                return true;
            }
        }
        return false;
    }
}
