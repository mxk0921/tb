package tb;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class e5z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e5z INSTANCE = new e5z();

    /* renamed from: a  reason: collision with root package name */
    public static DisplayMetrics f18304a;

    static {
        t2o.a(598737158);
    }

    public final DisplayMetrics a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("aeee540d", new Object[]{this, context});
        }
        if (f18304a == null) {
            f18304a = context.getResources().getDisplayMetrics();
        }
        DisplayMetrics displayMetrics = f18304a;
        ckf.d(displayMetrics);
        return displayMetrics;
    }

    public final float b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bbe988f", new Object[]{this, context, new Float(f)})).floatValue();
        }
        ckf.g(context, "context");
        return TypedValue.applyDimension(2, f, a(context));
    }
}
