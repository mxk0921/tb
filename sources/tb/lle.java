package tb;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lle {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597072);
    }

    public static ColorFilter a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorFilter) ipChange.ipc$dispatch("ef3267cc", new Object[]{new Integer(i)});
        }
        if (i != 1) {
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    public static void b(ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317518b7", new Object[]{imageView, new Integer(i)});
        } else {
            c(imageView, i, null);
        }
    }

    public static void c(ImageView imageView, int i, ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ceb8cf", new Object[]{imageView, new Integer(i), colorFilter});
            return;
        }
        ColorFilter a2 = a(i);
        if (a2 != null) {
            imageView.setColorFilter(a2);
        } else if (colorFilter != null) {
            imageView.setColorFilter(colorFilter);
        } else {
            imageView.clearColorFilter();
        }
    }
}
