package tb;

import android.graphics.RectF;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class weu {
    static {
        new RectF();
    }

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 < f3) {
            return f;
        }
        if (f5 > f4) {
            return f2;
        }
        return a(f, f2, (f5 - f3) / (f4 - f3));
    }
}
