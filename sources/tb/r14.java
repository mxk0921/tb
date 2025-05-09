package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class r14 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final r14 INSTANCE = new r14();

    static {
        t2o.a(919601405);
    }

    public final int a(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f52c9994", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)})).intValue();
        }
        if (f <= 0) {
            return i;
        }
        if (f >= 1) {
            return i2;
        }
        int alpha = Color.alpha(i);
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        return Color.argb((int) (alpha + ((Color.alpha(i2) - alpha) * f)), (int) (red + ((Color.red(i2) - red) * f)), (int) (green + ((Color.green(i2) - green) * f)), (int) (blue + ((Color.blue(i2) - blue) * f)));
    }
}
