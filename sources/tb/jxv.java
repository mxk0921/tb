package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714035);
    }

    public static int a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e24d3df1", new Object[]{new Float(f), new Float(f2)})).intValue();
        }
        int round = Math.round(f * 1000000.0f);
        int round2 = Math.round(f2 * 1000000.0f);
        if (round > round2) {
            return 1;
        }
        if (round < round2) {
            return -1;
        }
        return 0;
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48ebe0", new Object[]{context, new Float(f)})).intValue();
        }
        if (context == null || a(0.0f, f) == 0) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void c(Canvas canvas, Paint paint, Bitmap bitmap, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc120bcb", new Object[]{canvas, paint, bitmap, rect});
            return;
        }
        try {
            if (NinePatch.isNinePatchChunk(bitmap.getNinePatchChunk())) {
                d(canvas, bitmap, rect);
                return;
            }
        } catch (Exception unused) {
        }
        canvas.drawBitmap(bitmap, rect.left, rect.top, paint);
    }

    public static void d(Canvas canvas, Bitmap bitmap, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3658a9ee", new Object[]{canvas, bitmap, rect});
            return;
        }
        NinePatch.isNinePatchChunk(bitmap.getNinePatchChunk());
        new NinePatch(bitmap, bitmap.getNinePatchChunk(), null).draw(canvas, rect);
    }

    public static Bitmap e(int i, int i2, Drawable drawable) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("46bab0f1", new Object[]{new Integer(i), new Integer(i2), drawable});
        }
        try {
            if (!(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.getHeight() <= 0) {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return createBitmap;
            }
            Matrix matrix = new Matrix();
            matrix.postScale((i * 1.0f) / bitmap.getWidth(), (i2 * 1.0f) / bitmap.getHeight());
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap f(Context context, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6c6abd08", new Object[]{context, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (context == null || i <= 0 || i2 <= 0 || i3 == 0) {
            return null;
        }
        return e(i, i2, context.getResources().getDrawable(i3, null));
    }

    public static Rect g(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("8f76d58d", new Object[]{str, new Float(f)});
        }
        Paint paint = new Paint();
        Rect rect = new Rect();
        paint.setTextSize(f);
        paint.getTextBounds(str, 0, str.length(), rect);
        paint.reset();
        return rect;
    }

    public static boolean h(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ffc4183", new Object[]{bitmap})).booleanValue();
        }
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return false;
        }
        return true;
    }
}
