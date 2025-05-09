package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sm0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301990065);
    }

    public static int a(BitmapFactory.Options options, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7b37ce", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        if (i4 > i3) {
            return Math.round(i3 / i2);
        }
        return Math.round(i4 / i);
    }

    public static Bitmap b(Context context, int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("765e286d", new Object[]{context, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
        }
        Resources resources = context.getResources();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        options.inSampleSize = a(options, i2, i3);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i, options);
    }
}
