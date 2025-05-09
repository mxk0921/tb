package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xcs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static float f31306a;

    static {
        t2o.a(849346577);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        e(context);
        return (int) ((f * f31306a) + 0.5f);
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        if (dimensionPixelSize >= 3 || !(context instanceof Activity)) {
            return dimensionPixelSize;
        }
        try {
            Rect rect = new Rect();
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return rect.top;
        } catch (Throwable th) {
            Log.e("ScreenUtils", "getStatusBarHeight fail", th);
            return dimensionPixelSize;
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2b2d47", new Object[]{context});
            return;
        }
        try {
            if (f31306a == 0.0f) {
                f31306a = context.getResources().getDisplayMetrics().density;
            }
        } catch (Throwable th) {
            Log.e("ScreenUtils", "initScale fail", th);
        }
    }

    public static int f(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9d356", new Object[]{context, new Integer(i)})).intValue();
        }
        e(context);
        return (int) ((i / f31306a) + 0.5f);
    }
}
