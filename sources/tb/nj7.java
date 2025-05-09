package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nj7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LARGE_SCREEN_STYLE_FULL_SCREEN = "fullscreen";
    public static final String LARGE_SCREEN_STYLE_KEY = "largescreenstyle";
    public static final String LARGE_SCREEN_STYLE_SPILT = "spilt";

    static {
        t2o.a(912262779);
    }

    public static qi7 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qi7) ipChange.ipc$dispatch("3fbb041d", new Object[0]);
        }
        return b5m.G().getDeviceLevel();
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1b6fc8c", new Object[0])).intValue();
        }
        return SystemBarDecorator.SystemBarConfig.getStatusBarHeight(b5m.z().a());
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]);
        }
        return b5m.M().b();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d70aa8c", new Object[0])).booleanValue();
        }
        return b5m.G().b(mr7.d());
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2245bdd0", new Object[0])).booleanValue();
        }
        Application d = mr7.d();
        boolean b = b5m.G().b(d);
        boolean H = vbl.H();
        boolean c = b5m.G().c(d);
        tgh.b("DeviceUtils", "isFoldDeviceAndLandscape enableSingleColumn:" + H + ", isPortraitLayout:" + c);
        if (!b || !H || c) {
            return false;
        }
        return true;
    }

    public static boolean f(Context context) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da9c0b0d", new Object[]{context})).booleanValue();
        }
        if (!(context instanceof Activity) || (data = ((Activity) context).getIntent().getData()) == null || !"fullscreen".equals(data.getQueryParameter(LARGE_SCREEN_STYLE_KEY))) {
            return false;
        }
        return true;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9e8082a", new Object[0])).booleanValue();
        }
        Application d = mr7.d();
        boolean h = h();
        boolean c = b5m.G().c(d);
        tgh.b("DeviceUtils", "isPadDeviceAndPortrait isPadDevice:" + h + " isPortraitLayout:" + c);
        if (!h || !c || d()) {
            return false;
        }
        return true;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93870fca", new Object[0])).booleanValue();
        }
        Application d = mr7.d();
        if (b5m.G().a(d) || b5m.G().b(d)) {
            return true;
        }
        return false;
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd2ce4bb", new Object[]{context})).booleanValue();
        }
        boolean h = h();
        boolean c = b5m.G().c(context);
        boolean f = f(context);
        tgh.b("DeviceUtils", "isPadDeviceAndLandscape isPadDevice:" + h + " isPortraitLayout:" + c + " isLargeScreenStyleUri:" + f);
        if (!f || !h || c || e()) {
            return false;
        }
        return true;
    }
}
