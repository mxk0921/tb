package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hw0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Point[] f20920a = new Point[2];

    static {
        t2o.a(806355847);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abda1bc1", new Object[]{new Float(f)})).intValue();
        }
        return w2s.a(f);
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        if (context == null) {
            return (int) f;
        }
        return w2s.c(context, f);
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        return i3s.a();
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b91d22e4", new Object[]{context})).intValue();
        }
        if ((context instanceof Activity) && !o((Activity) context)) {
            return 0;
        }
        if ((context instanceof Activity) && !p(context)) {
            return 0;
        }
        if ((!(context instanceof Activity) || k(context)) && context != null) {
            return w2s.f(context);
        }
        return 0;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        char c = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de908de1", new Object[0])).intValue();
        }
        if (v2s.o().f().getApplication().getResources().getConfiguration().orientation != 1) {
            c = 1;
        }
        if (f20920a[c] == null) {
            WindowManager windowManager = (WindowManager) v2s.o().f().getApplication().getSystemService(pg1.ATOM_EXT_window);
            if (windowManager == null) {
                return f();
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f20920a[c] = point;
        }
        return f20920a[c].y;
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        return i3s.c();
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3b9debe", new Object[0])).intValue();
        }
        DisplayMetrics displayMetrics = v2s.o().f().getApplication().getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i > i2) {
            return i;
        }
        return i2;
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0010990", new Object[0])).intValue();
        }
        DisplayMetrics displayMetrics = v2s.o().f().getApplication().getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i > i2) {
            return i2;
        }
        return i;
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        return i3s.f();
    }

    public static int j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        return w2s.h(context);
    }

    public static boolean k(Context context) {
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
        if (f() < i) {
            return true;
        }
        return false;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4aeae8b", new Object[0])).booleanValue();
        }
        try {
            if ((v2s.o().f().getApplication().getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f3bfb9a", new Object[0])).booleanValue();
        }
        return i3s.h();
    }

    public static boolean n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe4c5214", new Object[]{context})).booleanValue();
        }
        return w2s.k(context);
    }

    public static boolean q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        return i3s.m(context);
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fef7dd75", new Object[]{context})).booleanValue();
        }
        return i3s.q(context);
    }

    public static int s(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7726f6d3", new Object[]{new Float(f)})).intValue();
        }
        return w2s.l(f);
    }

    public static int t(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{context, new Float(f)})).intValue();
        }
        return w2s.m(context, f);
    }

    public static int u(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6da9ec0", new Object[]{new Float(f)})).intValue();
        }
        return w2s.n(f);
    }

    public static void v(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1b2e41", new Object[]{context, str});
        } else {
            w(context, str, 80);
        }
    }

    public static void w(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994b0ce2", new Object[]{context, str, new Integer(i)});
            return;
        }
        Toast makeText = Toast.makeText(context.getApplicationContext(), str, 0);
        makeText.setGravity(i, 0, 0);
        makeText.show();
    }

    public static int x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0c60377", new Object[]{new Integer(i)})).intValue();
        }
        return w2s.o(i);
    }

    public static boolean o(Activity activity) {
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

    public static boolean p(Context context) {
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
            return point2.y != point.y;
        } catch (Exception e) {
            q0h.a("AndroidUtils", "isNavigationBarShow exp : " + e.getMessage());
            return false;
        }
    }
}
