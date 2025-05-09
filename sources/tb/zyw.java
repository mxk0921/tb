package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zyw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714116);
    }

    public static boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de04a668", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (!z || akt.p2("ShortVideo.enableHandleGameLoadFinishedWebError", false)) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("261e93ba", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableHandleWebCardReloadMsg", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b639723c", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableWebCardKeepScreenOn", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ab75a6", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableWebCardReloadRemoveWebView", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81087575", new Object[0])).booleanValue();
        }
        if (!akt.p2("ShortVideo.enabledWebComponent", true) || e0o.h()) {
            return false;
        }
        return true;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d0f8dfc", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enabledWebComponentBack", true);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2145bf8", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enabledWebComponentErrorPage", true);
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4b345d", new Object[0])).intValue();
        }
        return akt.w2("ShortVideo.waitWebComponentTimeout", 5);
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fb1881a", new Object[0])).intValue();
        }
        return akt.w2("ShortVideo.webComponentDelayDestroy", 10);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39a3b6d6", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableAppearWaitTimeout", true);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("451e2ea8", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableGameLoadFailedAutoScroll", false);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67ee5e5e", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enabledInteractMsg", false);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed100833", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enabledWebComponentPreload", true);
    }

    public static String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("459d445", new Object[0]);
        }
        return akt.H2("ShortVideo.webComponentTestUrl", null);
    }
}
