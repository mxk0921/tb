package tb;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.ad2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fgo implements ad2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final fgo INSTANCE = new fgo();

    static {
        t2o.a(511705567);
        t2o.a(620757008);
    }

    @Override // tb.ad2
    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return "rotate";
    }

    @Override // tb.ad2
    public Bitmap process(String str, ad2.a aVar, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("59b6dc7b", new Object[]{this, str, aVar, bitmap});
        }
        try {
            int q = cg9.q(Globals.getApplication(), str);
            if (q != 0) {
                Matrix matrix = new Matrix();
                matrix.reset();
                matrix.setRotate(q);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}
