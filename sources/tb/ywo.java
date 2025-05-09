package tb;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ywo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ywo INSTANCE = new ywo();

    @JvmStatic
    public static final int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        ckf.g(context, "context");
        Resources resources = context.getResources();
        ckf.f(resources, "context.resources");
        return iai.d(f * resources.getDisplayMetrics().density);
    }

    @JvmStatic
    public static final DisplayMetrics b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("c4d2dda1", new Object[]{context});
        }
        ckf.g(context, "context");
        Object systemService = context.getSystemService(pg1.ATOM_EXT_window);
        if (!(systemService instanceof WindowManager)) {
            systemService = null;
        }
        WindowManager windowManager = (WindowManager) systemService;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    @JvmStatic
    public static final int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        ckf.g(context, "context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return a(context, 24.0f);
    }

    @JvmStatic
    public static final int d(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{context, new Float(f)})).intValue();
        }
        ckf.g(context, "context");
        Resources resources = context.getResources();
        ckf.f(resources, "context.resources");
        return iai.d(f / resources.getDisplayMetrics().density);
    }
}
