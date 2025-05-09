package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ahw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713760);
    }

    public static int a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b029ce3", new Object[]{view, new Integer(i), new Integer(i2)})).intValue();
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postTranslate(-i, -i2);
        canvas.setMatrix(matrix);
        view.draw(canvas);
        return Color.alpha(createBitmap.getPixel(0, 0));
    }

    public static int b(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59245763", new Object[]{view, new Integer(i)})).intValue();
        }
        if (view == null) {
            return -1;
        }
        int visibility = view.getVisibility();
        view.setVisibility(i);
        return visibility;
    }
}
