package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wwo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Point[] f30974a = new Point[2];

    static {
        t2o.a(295699954);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b91d22e4", new Object[]{context})).intValue();
        }
        try {
            if ((context instanceof Activity) && !e((Activity) context)) {
                return 0;
            }
            if ((context instanceof Activity) && !f(context)) {
                return 0;
            }
            if ((!(context instanceof Activity) || d(context)) && context != null) {
                return w2s.f(context);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        char c = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de908de1", new Object[0])).intValue();
        }
        if (v2s.o().f().getApplication().getResources().getConfiguration().orientation != 1) {
            c = 1;
        }
        if (f30974a[c] == null) {
            WindowManager windowManager = (WindowManager) v2s.o().f().getApplication().getSystemService(pg1.ATOM_EXT_window);
            if (windowManager == null) {
                return c();
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f30974a[c] = point;
        }
        return f30974a[c].y;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        return i3s.c();
    }

    public static boolean d(Context context) {
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
        if (c() < i) {
            return true;
        }
        return false;
    }

    public static boolean f(Context context) {
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
        } catch (Exception e) {
            Log.e("AndroidUtils", "isNavigationBarShow exp : " + e.getMessage());
            return false;
        }
    }

    public static boolean e(Activity activity) {
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
