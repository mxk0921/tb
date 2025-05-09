package tb;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class w9i {
    public static ju4 a(int i) {
        if (i == 0) {
            return new tgo();
        }
        if (i != 1) {
            return b();
        }
        return new r25();
    }

    public static ju4 b() {
        return new tgo();
    }

    public static e78 c() {
        return new e78();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).V(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            f(view, (MaterialShapeDrawable) background);
        }
    }

    public static void f(View view, MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.O()) {
            materialShapeDrawable.a0(ogw.g(view));
        }
    }
}
