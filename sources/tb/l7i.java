package tb;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.ColorUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class l7i {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;

    public static int a(Context context, int i, int i2) {
        TypedValue a2 = k6i.a(context, i);
        if (a2 != null) {
            return a2.data;
        }
        return i2;
    }

    public static int b(Context context, int i, String str) {
        return k6i.c(context, i, str);
    }

    public static int c(View view, int i) {
        return k6i.d(view, i);
    }

    public static int d(View view, int i, int i2) {
        return a(view.getContext(), i, i2);
    }

    public static int e(int i, int i2) {
        return ColorUtils.compositeColors(i2, i);
    }

    public static int f(int i, int i2, float f) {
        return e(i, ColorUtils.setAlphaComponent(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int g(View view, int i, int i2, float f) {
        return f(c(view, i), c(view, i2), f);
    }
}
