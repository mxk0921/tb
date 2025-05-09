package tb;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ir7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ComponentCallbacks f21520a = null;
    public static float b = -1.0f;
    public static int c = -1;
    public static int d = -1;
    public static int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements ComponentCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            } else {
                ir7.f();
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(1032847443);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777b781d", new Object[]{new Float(f)})).intValue();
        }
        return (int) ((f * b()) + 0.5f);
    }

    public static float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f8f989d", new Object[0])).floatValue();
        }
        if (b < 0.0f) {
            e();
        }
        return b;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[0])).intValue();
        }
        if (d < 0) {
            e();
        }
        return d;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43d49fe", new Object[0])).intValue();
        }
        if (c < 0) {
            e();
        }
        return c;
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9aa2585", new Object[0]);
            return;
        }
        DisplayMetrics displayMetrics = Globals.getApplication().getResources().getDisplayMetrics();
        if (f21520a == null) {
            Application application = Globals.getApplication();
            a aVar = new a();
            f21520a = aVar;
            application.registerComponentCallbacks(aVar);
        }
        String str = Build.DEVICE;
        if (str.equalsIgnoreCase("mx2")) {
            e = 96;
        }
        Configuration configuration = Globals.getApplication().getResources().getConfiguration();
        if (str.equalsIgnoreCase("mx2")) {
            e = 96;
        }
        if (configuration.orientation == 2) {
            int i = displayMetrics.heightPixels;
            b = displayMetrics.density;
            c = i;
            d = displayMetrics.widthPixels - e;
            return;
        }
        int i2 = displayMetrics.widthPixels;
        b = displayMetrics.density;
        c = i2;
        d = displayMetrics.heightPixels - e;
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
            return;
        }
        b = -1.0f;
        c = -1;
        d = -1;
    }
}
