package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class caa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f16937a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
    }

    static {
        t2o.a(481296420);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[0]);
        }
        return ((tts$g) f16937a).a();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afdff1e4", new Object[0]);
        }
        return ((tts$g) f16937a).c();
    }

    public static Application c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("6a3bb2c7", new Object[0]);
        }
        return ((tts$g) f16937a).b();
    }

    public static long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c918edee", new Object[0])).longValue();
        }
        return ((tts$g) f16937a).d();
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec2213a1", new Object[0])).intValue();
        }
        return ((tts$g) f16937a).e();
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22c7928", new Object[0]);
        }
        return ((tts$g) f16937a).f();
    }

    public static int g(Context context) {
        boolean isInMultiWindowMode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90f1e58d", new Object[]{context})).intValue();
        }
        if (t() || s()) {
            return TBAutoSizeConfig.x().B(context);
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        if (windowManager == null) {
            return j();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 28) {
            isInMultiWindowMode = ((Activity) context).isInMultiWindowMode();
            if (isInMultiWindowMode) {
                return Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        return displayMetrics.heightPixels;
    }

    public static int h(Context context) {
        boolean isInMultiWindowMode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("573830ce", new Object[]{context})).intValue();
        }
        if (t() || s()) {
            return TBAutoSizeConfig.x().H(context);
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        if (windowManager == null) {
            return l();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 28) {
            isInMultiWindowMode = ((Activity) context).isInMultiWindowMode();
            if (isInMultiWindowMode) {
                return Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        return displayMetrics.widthPixels;
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82f9ab7e", new Object[0]);
        }
        a aVar = f16937a;
        if (aVar == null) {
            return "";
        }
        return ((tts$g) aVar).g();
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        return ((tts$g) f16937a).h();
    }

    public static int k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView().getHeight();
        }
        return ((tts$g) f16937a).h();
    }

    public static int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        return ((tts$g) f16937a).i();
    }

    public static int m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView().getWidth();
        }
        return ((tts$g) f16937a).i();
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[0]);
        }
        return ((tts$g) f16937a).j();
    }

    public static String o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f7eefe9", new Object[]{context});
        }
        return ((tts$g) f16937a).k(context);
    }

    public static String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[0]);
        }
        return ((tts$g) f16937a).l();
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        return ((tts$g) f16937a).m();
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28d2a674", new Object[0])).booleanValue();
        }
        return ((tts$g) f16937a).n();
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1270c39", new Object[0])).booleanValue();
        }
        a aVar = f16937a;
        if (aVar == null || !((tts$g) aVar).o()) {
            return false;
        }
        return true;
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c61cbb", new Object[0])).booleanValue();
        }
        a aVar = f16937a;
        if (aVar == null || !((tts$g) aVar).p()) {
            return false;
        }
        return true;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77ed4783", new Object[0])).booleanValue();
        }
        return ((tts$g) f16937a).q();
    }

    public static void v(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564c3246", new Object[]{aVar});
        } else {
            f16937a = aVar;
        }
    }
}
