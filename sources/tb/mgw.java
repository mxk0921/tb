package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DINAMICX_3_CUSTOM_INPUT_KEY = R.id.dinamic_x_3_view_params_key;

    static {
        t2o.a(157286744);
    }

    public static View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ecbac3d3", new Object[]{context});
        }
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-2, 0));
        view.setTag(R.id.TAG_ULTRON_VIEW_ZERO_HEIGHT, "ZeroHeightView");
        return view;
    }

    public static GradientDrawable b(int i, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("b4c17bf2", new Object[]{new Integer(i), new Float(f), new Float(f2)});
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f2, f2, f2, f2});
        return gradientDrawable;
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (context.getResources().getConfiguration().orientation == 1) {
            return displayMetrics.heightPixels;
        }
        return displayMetrics.widthPixels;
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe4c5214", new Object[]{context})).booleanValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
            return true;
        }
        return false;
    }

    public static int c(Context context) {
        Resources resources;
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b91d22e4", new Object[]{context})).intValue();
        }
        if (!(context instanceof Activity) || !g((Activity) context) || (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5a631f9", new Object[]{activity})).booleanValue();
        }
        View findViewById = activity.getWindow().getDecorView().findViewById(16908290);
        if (findViewById == null) {
            return false;
        }
        WindowManager windowManager = (WindowManager) activity.getSystemService(pg1.ATOM_EXT_window);
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getRealSize(point);
        }
        if (!f(activity)) {
            if (findViewById.getBottom() == point.y) {
                return false;
            }
        } else if (findViewById.getRight() == point.x) {
            return false;
        }
        return true;
    }
}
