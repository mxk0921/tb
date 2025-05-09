package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CLOSE_PROVIDER = "adaemon_close_provider_preload";
    public static final String KEY_DONT_STARTSERVICE = "adaemon_dont_startservice";
    public static final String KEY_FRAME_LOCK_LIVE = "adaemon_frame_lock";
    public static final String KEY_FRAME_LOCK_ND = "adaemon_frame_lock_nd";
    public static final String KEY_FRAME_LOCK_TAB2 = "adaemon_frame_lock_tab2";
    public static final String KEY_FRAME_LOCK_THEATER = "adaemon_frame_lock_theater";
    public static final String KEY_LIMIT_PREWARM = "adaemon_limit_prewarm";
    public static final String KEY_PROVIDER_PRELOAD = "adaemon_provider_preload";
    public static final String KEY_PROVIDER_PREWARM = "adaemon_provider_prewarm";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f18909a;
    public static volatile Boolean b;

    static {
        t2o.a(349175809);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecfdc8eb", new Object[0])).booleanValue();
        }
        if (b == null) {
            if (c("adaemon_anr_hacker_v1") || c("adaemon_anr_hacker")) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b4aa9c4", new Object[0])).booleanValue();
        }
        return c("anr_normal_change");
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c6904a1", new Object[]{str})).booleanValue();
        }
        return c0.e(str);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6b3f4ef", new Object[0])).booleanValue();
        }
        return c("adaemon_forbid_receiver_hacker");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8f8c755", new Object[0])).booleanValue();
        }
        return c(KEY_FRAME_LOCK_ND);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4608da19", new Object[0])).booleanValue();
        }
        return c(KEY_FRAME_LOCK_LIVE);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("448a847c", new Object[0])).booleanValue();
        }
        return c(KEY_FRAME_LOCK_TAB2);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93931c68", new Object[0])).booleanValue();
        }
        return c(KEY_FRAME_LOCK_THEATER);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ecc288", new Object[0])).booleanValue();
        }
        return c("adaemon_main_looper");
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4a2a42e", new Object[0])).booleanValue();
        }
        if (f18909a == null) {
            f18909a = Boolean.valueOf(i());
        }
        return f18909a.booleanValue();
    }
}
