package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class zk1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int AUTO_NEXT_VIDEO_STATE_FALSE = 2;
    public static final int AUTO_NEXT_VIDEO_STATE_NONE = 0;
    public static final int AUTO_NEXT_VIDEO_STATE_TRUE = 1;
    public static final String KEY_AUTO_NEXT_VIDEO_STATE = "auto_next_video_state";
    public static final String KEY_IS_FIRST_PLAY = "is_not_first_play";

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f32816a;
    public static volatile int b;
    public static volatile int c = -1;

    static {
        t2o.a(468713998);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[0]);
        } else if (!f32816a) {
            d();
        }
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc9dd328", new Object[0])).intValue();
        }
        a();
        return b;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84cd6304", new Object[0])).intValue();
        }
        if (c >= 0) {
            return c;
        }
        try {
            c = Integer.parseInt(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("videoPlayerDelayTime", "1000"));
        } catch (Throwable th) {
            ir9.c("VideoConfig", "getVideoPlayerDelayTime", th);
        }
        if (c < 0) {
            c = 1000;
        }
        return c;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        b = ono.b(p91.a(), KEY_AUTO_NEXT_VIDEO_STATE, 0);
        ono.a(p91.a(), KEY_IS_FIRST_PLAY, true);
        f32816a = true;
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9be44ca4", new Object[]{str})).booleanValue();
        }
        a();
        if (b == 1) {
            return true;
        }
        if (b == 2) {
            return false;
        }
        return Boolean.parseBoolean(str);
    }

    public static void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41664276", new Object[]{new Boolean(z)});
            return;
        }
        if (z) {
            b = 1;
        } else {
            b = 2;
        }
        ono.h(p91.a(), KEY_AUTO_NEXT_VIDEO_STATE, b);
    }
}
