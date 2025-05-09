package tb;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class k6i {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i, boolean z) {
        TypedValue a2 = a(context, i);
        if (a2 == null || a2.type != 18) {
            return z;
        }
        if (a2.data != 0) {
            return true;
        }
        return false;
    }

    public static int c(Context context, int i, String str) {
        TypedValue a2 = a(context, i);
        if (a2 != null) {
            return a2.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static int d(View view, int i) {
        return c(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
