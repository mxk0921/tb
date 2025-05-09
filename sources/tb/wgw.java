package tb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class wgw {
    static {
        t2o.a(945815843);
    }

    public static boolean a(ViewParent viewParent) {
        if (!(viewParent instanceof View)) {
            return true;
        }
        View view = (View) viewParent;
        if (view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return false;
        }
        return a(view.getParent());
    }

    public static boolean b(View view) {
        if (view == null) {
            return false;
        }
        if (view.hasFocus()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (b(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Activity c(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean d(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return true;
        }
        if (i > 0) {
            if (view.getHeight() < 10 || view.getWidth() < 10) {
                return true;
            }
            i--;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            if (d(viewGroup.getChildAt(i2), i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(View view) {
        if (view == null || !view.isAttachedToWindow() || view.getVisibility() != 0 || view.getAlpha() <= 0.0f) {
            return false;
        }
        Drawable background = view.getBackground();
        if (background != null && background.getAlpha() <= 0) {
            return false;
        }
        return true;
    }
}
