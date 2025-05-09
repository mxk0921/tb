package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class q0q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(620757078);
    }

    public static int a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11c03da2", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        double min = Math.min(i / i3, i2 / i4);
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    public static int b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17b8fb74", new Object[]{bitmap})).intValue();
        }
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    public static int c(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fba33646", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (i == 0) {
            return (int) (i3 * (i2 / i4));
        }
        if (i2 == 0) {
            return i;
        }
        double d = i4 / i3;
        double d2 = i2;
        if (i * d > d2) {
            return (int) (d2 / d);
        }
        return i;
    }

    public static int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9376e84", new Object[]{new Integer(i)})).intValue();
        }
        return i & 65535;
    }

    public static int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67222dcd", new Object[]{new Integer(i)})).intValue();
        }
        return (i & (-65536)) >> 16;
    }

    public static int f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c5fb563", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return (i << 16) | (i2 & 65535);
    }
}
