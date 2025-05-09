package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ch8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1027604501);
    }

    public static float a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258e00ce", new Object[]{context})).floatValue();
        }
        return g(context) / 375.0f;
    }

    public static JSONObject b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c3df52e1", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            float c = c(context);
            jSONObject.put("sdkVersion", (Object) nkr.TBLive_Container);
            jSONObject.put("scale", (Object) Float.valueOf(c));
            jSONObject.put("apScale", (Object) Float.valueOf(a(context)));
            jSONObject.put("safeAreaInsetTop", (Object) Integer.valueOf(h(context)));
            jSONObject.put("safeAreaInsetBottom", (Object) Integer.valueOf(d(context)));
            jSONObject.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) Float.valueOf(g(context) / c));
            jSONObject.put("screenHeight", (Object) Float.valueOf(e(context) / c));
            jSONObject.put(yj4.PARAM_SCREEN_ORIENTATION, (Object) f(context));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static float c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7077e19f", new Object[]{context})).floatValue();
        }
        if (context != null) {
            return context.getResources().getDisplayMetrics().density;
        }
        return 1.0f;
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if ("landscape".equals(f(context))) {
            int i = displayMetrics.heightPixels;
            int i2 = displayMetrics.widthPixels;
            return i < i2 ? i : i2;
        }
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        return i3 > i4 ? i3 : i4;
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("550de2d", new Object[]{context});
        }
        if (context == null || !(context instanceof Activity) || ((Activity) context).getRequestedOrientation() != 0) {
            return "portrait";
        }
        return "landscape";
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if ("landscape".equals(f(context))) {
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            return i > i2 ? i : i2;
        }
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        return i3 < i4 ? i3 : i4;
    }

    public static boolean i(Context context) {
        int i;
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            i = displayMetrics.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (e(context) < i) {
            return true;
        }
        return false;
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3169ab69", new Object[]{context})).booleanValue();
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d70d573", new Object[]{context})).booleanValue();
        }
        try {
            Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
            Point point = new Point();
            Point point2 = new Point();
            defaultDisplay.getSize(point);
            defaultDisplay.getRealSize(point2);
            if (point2.y != point.y) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b91d22e4", new Object[]{context})).intValue();
        }
        try {
            if ((context instanceof Activity) && !k((Activity) context)) {
                return 0;
            }
            if ((context instanceof Activity) && !l(context)) {
                return 0;
            }
            if (((context instanceof Activity) && !i(context)) || context == null) {
                return 0;
            }
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean k(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49f8e5bf", new Object[]{activity})).booleanValue();
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getId() != -1 && "navigationBarBackground".equals(activity.getResources().getResourceEntryName(childAt.getId()))) {
                    return childAt.getVisibility() == 0;
                }
            }
        }
        return false;
    }
}
