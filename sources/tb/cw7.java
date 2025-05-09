package tb;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class cw7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(140509191);
    }

    public static final float a(Context context, float f) {
        float f2;
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48ebdd", new Object[]{context, new Float(f)})).floatValue();
        }
        ckf.g(context, "$this$dp2px");
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            f2 = 1.0f;
        } else {
            f2 = displayMetrics.density;
        }
        return (f * f2) + 0.5f;
    }
}
