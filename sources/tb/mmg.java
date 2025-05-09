package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.proxy.alphavideo.IAlphaVideoProxy;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import java.util.HashMap;
import java.util.Map;
import tb.bl9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mmg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<? extends BaseFrame>> f24135a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                mmg.a();
            }
        }
    }

    static {
        t2o.a(779092963);
        try {
            if (d9m.p().getFrameClassMap("dynamic_h5_sdk") != null) {
                c("dynamic_h5_sdk", d9m.p().getFrameClassMap("dynamic_h5_sdk"));
            }
            if (d9m.p().getFrameClassMap("tl-intimacy") != null) {
                c("tl-intimacy", d9m.p().getFrameClassMap("tl-intimacy"));
            }
        } catch (Throwable th) {
            x5t.d("LegacyFrameRegistry", th.getMessage());
        }
        try {
            if (bl9.g().b()) {
                d();
            } else {
                bl9.g().i(new a());
            }
        } catch (Throwable th2) {
            x5t.d("LegacyFrameRegistry", th2.getMessage());
        }
        try {
            if (d9m.p().getFrameClassMap("tl-interactive-entrance") != null) {
                c("tl-interactive-entrance", d9m.p().getFrameClassMap("tl-interactive-entrance"));
            }
            if (d9m.p().getFrameClassMap("tl-interact-panel") != null) {
                c("tl-interact-panel", d9m.p().getFrameClassMap("tl-interact-panel"));
            }
        } catch (Throwable th3) {
            x5t.d("LegacyFrameRegistry", th3.getMessage());
        }
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            d();
        }
    }

    public static Class<? extends BaseFrame> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7544247f", new Object[]{str});
        }
        return (Class) ((HashMap) f24135a).get(str);
    }

    public static void c(String str, Class<? extends BaseFrame> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ced1102", new Object[]{str, cls});
        } else {
            f24135a.put(str, cls);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2473d4ab", new Object[0]);
            return;
        }
        try {
            if (d9m.c().getFrameClassMap(IAlphaVideoProxy.KEY_FRAME_CLASS_FAVOR_EFFECT_FRAME) != null) {
                c("tl-favor-effect", d9m.c().getFrameClassMap(IAlphaVideoProxy.KEY_FRAME_CLASS_FAVOR_EFFECT_FRAME));
            }
        } catch (Throwable th) {
            x5t.d("LegacyFrameRegistry", th.getMessage());
        }
        try {
            if (d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_CONNECTION_FRAME_2) != null) {
                c("tl-connect-mic", d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_CONNECTION_FRAME_2));
            }
        } catch (Throwable th2) {
            x5t.d("LegacyFrameRegistry", th2.getMessage());
        }
        try {
            if (d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_NOTICE_FRAME_2) != null) {
                c("tl-notice", d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_NOTICE_FRAME_2));
            }
        } catch (Throwable th3) {
            x5t.d("LegacyFrameRegistry", th3.getMessage());
        }
        try {
            if (d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_BOTTOM_CONTAINER_FRAME) != null) {
                c("tl-bubble-bottom-container", d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_BOTTOM_CONTAINER_FRAME));
            }
        } catch (Throwable th4) {
            x5t.d("LegacyFrameRegistry", th4.getMessage());
        }
        try {
            if (d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_SUBSCRIBE_CARD_FRAME_2) != null) {
                c("tl-subscribe-card", d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_SUBSCRIBE_CARD_FRAME_2));
            }
        } catch (Throwable th5) {
            x5t.d("LegacyFrameRegistry", th5.getMessage());
        }
    }
}
