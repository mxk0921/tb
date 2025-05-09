package tb;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.IPreloadService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class usm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AB_KEY_OPT_P2FF_VIEW = "enableP2ffPreAddview";
    public static final String AB_KEY_OPT_VIDEO_PRELOADCACHE = "enablePreloadCacher";

    /* renamed from: a  reason: collision with root package name */
    public ntm f29588a;

    static {
        t2o.a(468714655);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1827ec44", new Object[]{context})).booleanValue();
        }
        return e0o.b(context, "launcher_can_use_unexposed_cache_render", false);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24d47e9f", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableCacheValidWhenVerticalNull", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6edf77af", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.fixFailPlay", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19110f", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableKeepPreloadVideoData", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cda0f78", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.newUnexposeStrategy", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c46a1d8f", new Object[0])).booleanValue();
        }
        boolean z = hrm.a().b().f20182a;
        ir9.b("PickPreloadControllerNew", "enablePreload:" + z);
        return z;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c74233c1", new Object[0])).booleanValue();
        }
        if (!akt.p2("ShortVideo.enablePredownloadUnexposedStrategy", true) || !e()) {
            return false;
        }
        return true;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("416572ad", new Object[0])).booleanValue();
        }
        return f();
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("296153ae", new Object[0])).booleanValue();
        }
        return !qtm.k();
    }

    public static boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4b7eec3", new Object[]{str})).booleanValue();
        }
        return akt.p2("ShortVideo.enableOptPreloadFirstOpen", true);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc58c35b", new Object[0])).booleanValue();
        }
        boolean h = h();
        boolean z = hrm.a().b().i;
        ir9.b("PickPreloadController", "isEnableDownloadExposedVideo,disableBgDownload:" + z);
        if (!h || z) {
            return false;
        }
        return true;
    }

    public static boolean n(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3005d49", new Object[]{fluidContext})).booleanValue();
        }
        boolean isInactiveUnexposedCacheVideo = ((IPreloadService) fluidContext.getService(IPreloadService.class)).isInactiveUnexposedCacheVideo();
        if (!pto.g(fluidContext) || !isInactiveUnexposedCacheVideo) {
            return false;
        }
        return true;
    }

    public static boolean o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71865172", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (!z || qtm.l(p91.a())) {
            return true;
        }
        return false;
    }

    public ntm k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("2fb83d7c", new Object[]{this});
        }
        return this.f29588a;
    }

    public Pair<String, String> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1d5e9d2c", new Object[]{this});
        }
        return null;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6066d97", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void q(ntm ntmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ab4b80", new Object[]{this, ntmVar});
        } else {
            this.f29588a = ntmVar;
        }
    }
}
