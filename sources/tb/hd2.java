package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hd2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float COMPRESS_SCALE = 0.8f;
    public static final float DEFAULT_SCALE = 0.75f;

    static {
        t2o.a(436207625);
    }

    public static Bitmap a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("20e26054", new Object[]{bitmap});
        }
        ggh.b("bitmapCompress before size:" + bitmap.getByteCount() + "width:" + bitmap.getWidth() + ",height" + bitmap.getHeight());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * 0.8f), (int) (((float) bitmap.getHeight()) * 0.8f), true);
        ggh.b("bitmapCompress after size:" + createScaledBitmap.getByteCount() + "width:" + createScaledBitmap.getWidth() + ",height" + createScaledBitmap.getHeight());
        return createScaledBitmap;
    }
}
