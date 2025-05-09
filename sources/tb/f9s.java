package tb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(849346566);
    }

    public static Bitmap a(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d540191e", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        if (view == null || i <= 0 || i2 <= 0) {
            return null;
        }
        if (i3 > 0 || i4 > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(createBitmap));
            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, i3, i4, i, i2);
            createBitmap.recycle();
            return createBitmap2;
        }
        Bitmap createBitmap3 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap3));
        return createBitmap3;
    }
}
