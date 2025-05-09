package tb;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n14 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int F2COLOR_TRANSPARENT = c("#00f2f2f2");

    /* renamed from: a  reason: collision with root package name */
    public static final int f24438a = c("#f2f2f2");

    static {
        t2o.a(464519251);
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d02f75", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return Color.argb(i, Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    public static int b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ce68634", new Object[]{bitmap})).intValue();
        }
        if (bitmap == null || bitmap.getHeight() < 1 || bitmap.getWidth() < 1) {
            return 0;
        }
        int height = bitmap.getHeight() - 1;
        int width = bitmap.getWidth();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < width; i5++) {
            int pixel = bitmap.getPixel(i5, height);
            i += Color.alpha(pixel);
            i2 += Color.red(pixel);
            i3 += Color.green(pixel);
            i4 += Color.blue(pixel);
        }
        return Color.argb(i / width, i2 / width, i3 / width, i4 / width);
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        if (!str.isEmpty()) {
            try {
            } catch (Exception unused) {
                return 0;
            }
        }
        return Color.parseColor(str);
    }
}
