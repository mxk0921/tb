package tb;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ufw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Paint f29350a = new Paint();
    public static final ColorMatrix b = new ColorMatrix();

    static {
        t2o.a(491782808);
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d79c214a", new Object[]{view});
        } else {
            view.setLayerType(0, null);
        }
    }

    public static void b(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6da0cc", new Object[]{view, new Float(f)});
            return;
        }
        ColorMatrix colorMatrix = b;
        colorMatrix.setSaturation(f);
        Paint paint = f29350a;
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        view.setLayerType(2, paint);
    }
}
