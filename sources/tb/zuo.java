package tb;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.tao.Globals;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.SystemBarDecorator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zuo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f33025a;
    public static int b;
    public static float c;

    static {
        t2o.a(815793497);
    }

    public static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9ccb814", new Object[]{activity})).intValue();
        }
        if (activity == null) {
            Log.e("ScreenAdaptUtil", "getContentView：activity is null");
            return d();
        }
        View findViewById = activity.findViewById(16908290);
        if (findViewById == null) {
            Log.e("ScreenAdaptUtil", "getContentView：content view is null");
            return d();
        }
        int height = findViewById.getHeight();
        if (height > 0) {
            return height;
        }
        Log.e("ScreenAdaptUtil", "getContentView：the height of content view is invalid");
        return d();
    }

    public static int b(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7768625", new Object[]{activity, new Integer(i)})).intValue();
        }
        return a(activity) - i;
    }

    public static float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f8f989d", new Object[0])).floatValue();
        }
        if (c <= 0.0f) {
            c = Constants.screen_density;
        }
        return c;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        if (b <= 0) {
            b = Constants.screen_height;
        }
        b4p.a("ScreenAdaptUtil", "getScreenHeight:" + b);
        return b;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        if (f33025a <= 0) {
            if (ScreenType.IS_PAD || ScreenType.IS_FOLDABLE) {
                f33025a = TBAutoSizeConfig.x().H(Globals.getApplication());
            } else {
                f33025a = Constants.screen_width;
            }
        }
        b4p.a("ScreenAdaptUtil", "getScreenWidth:" + f33025a);
        return f33025a;
    }

    public static int f(int i, int i2, Activity activity) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fbcf79f", new Object[]{new Integer(i), new Integer(i2), activity})).intValue();
        }
        if (activity instanceof mec) {
            z = ((mec) activity).o2();
        }
        int a2 = (a(activity) - i) - i2;
        if (!z) {
            return a2 + SystemBarDecorator.getStatusBarHeight(activity);
        }
        return a2;
    }

    public static void g(int i, int i2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5817e36f", new Object[]{new Integer(i), new Integer(i2), new Float(f)});
            return;
        }
        f33025a = i;
        b = i2;
        c = f;
    }

    public static void h(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb84d02", new Object[]{displayMetrics});
            return;
        }
        c = displayMetrics.density;
        f33025a = displayMetrics.widthPixels;
        b = displayMetrics.heightPixels;
    }
}
