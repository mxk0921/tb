package tb;

import android.app.Activity;
import android.app.Application;
import android.util.DisplayMetrics;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kr7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(573571202);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        Application application = Globals.getApplication();
        if (application == null) {
            return (int) f;
        }
        return (int) (f * application.getResources().getDisplayMetrics().density);
    }

    public static float b(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e460aff0", new Object[]{nwiVar})).floatValue();
        }
        return pb6.z(qq4.a(nwiVar), d(nwiVar));
    }

    public static float c(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b0e99b9", new Object[]{nwiVar})).floatValue();
        }
        try {
            Activity a2 = qq4.a(nwiVar);
            if (a2 == null) {
                jgh.a("getTopshowMaxHeight", "context is null.");
                return 700.0f;
            }
            int z = pb6.z(a2, a(80.0f));
            int b = (int) b(nwiVar);
            jgh.a("getTopshowMaxHeight", "logoHeightAp = " + z + ", screenHeightAp = " + b);
            float f = (float) (b - z);
            if (f <= 0.0f) {
                jgh.a("getTopshowMaxHeight", "topshowScreenHeight error, use 700ap.");
                f = 700.0f;
            }
            jgh.a("getTopshowMaxHeight", "topshowScreenHeight= " + f);
            return f;
        } catch (Throwable th) {
            jgh.b("getTopshowMaxHeight", "caltulate error", th);
            return 700.0f;
        }
    }

    public static int d(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c09631a", new Object[]{nwiVar})).intValue();
        }
        int e = e();
        try {
            Activity a2 = qq4.a(nwiVar);
            if (a2 == null) {
                jgh.a("getPxFullScreenHeight", "context is null.");
                return e;
            }
            if (!(a2.getWindowManager() == null || a2.getWindowManager().getDefaultDisplay() == null)) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                a2.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                int i = displayMetrics.heightPixels;
                if (i <= 0) {
                    jgh.a("getPxFullScreenHeight", "screenHeight error, use default. screenHeight = " + i);
                    return e;
                }
                jgh.a("getPxFullScreenHeight", "screenHeightAp = " + i);
                return i;
            }
            jgh.a("getPxFullScreenHeight", "getWindowManager or defaultDisplay is null.");
            return e;
        } catch (Throwable th) {
            jgh.b("getPxFullScreenHeight", "caltulate error", th);
            return e;
        }
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        Application application = Globals.getApplication();
        if (application == null) {
            return 0;
        }
        return application.getResources().getDisplayMetrics().heightPixels;
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        Application application = Globals.getApplication();
        if (application == null) {
            return 0;
        }
        return application.getResources().getDisplayMetrics().widthPixels;
    }
}
