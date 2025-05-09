package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.performance.IPerformanceService;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16260a = false;
    public final Set<String> b = new HashSet();
    public Boolean c;
    public boolean d;

    static {
        t2o.a(468714120);
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f18bfce", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("reduceDynamicRecommend", true);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adae173a", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableALLCDN", false);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebbcbe04", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableFixPlayNext", true);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de04fa2f", new Object[]{str})).booleanValue();
        }
        boolean equals = TextUtils.equals("true", akt.G2("android_fullscreenvideo.optInteract.enable" + str, "false")) | akt.q2("enableOptInteract");
        ir9.b("InteractionServiceConfig", "enableInteractOpt, type:" + str + " enable: " + equals);
        return equals;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("941a87fe", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableLiveAutoSlide", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6cd344c", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableLiveSegmentPm", true);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d42a920", new Object[0])).booleanValue();
        }
        return (FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig(sj4.NATIVE_ALBUM, true) && nwv.o(akt.G2("AB_fullscreenpage_android.nativeAlbum.enableNativeAlbum", "true"), true) && (!pr9.j() || nwv.o(akt.G2("AB_fullscreenpage_android.nativeAlbum.enablePadNativeAlbum", "true"), true))) || akt.q2(sj4.NATIVE_ALBUM);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aabbd13", new Object[0])).booleanValue();
        }
        if ((!f() || !nwv.o(akt.G2("AB_fullscreenpage_android.nativeAlbum.enableNativeAlbumZoom", String.valueOf(true)), true)) && !akt.q2("enableNativeAlbumZoom")) {
            return false;
        }
        return true;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2acc0e5c", new Object[0])).booleanValue();
        }
        return c(IPerformanceService.MTS_TAG_PENDING_FIRST_FRAME_CALLBACK);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("315d5877", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enablePreAddWeexViewUseCacheData", true);
    }

    public static boolean j(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0aacbfe", new Object[]{fluidContext})).booleanValue();
        }
        return c(IPerformanceService.MTS_TAG_PRECREATE_WEEX);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14a00ca0", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enablePreloadTabNotRequestData", true);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8032e316", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableScrollInterceptForTab2Native", true);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("364fff5f", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableSessionPlayTime", true);
    }

    public static boolean n(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa57e5aa", new Object[]{fluidContext})).booleanValue();
        }
        if (fluidContext == null) {
            return false;
        }
        return !f2k.d(fluidContext);
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265d5fb7", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableWeexStatusInstead", false);
    }

    public static boolean p(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b61f5bb", new Object[]{fluidContext})).booleanValue();
        }
        if (f2k.d(fluidContext) || (n(fluidContext) && !FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableVerticalCDN", false))) {
            return true;
        }
        return false;
    }

    public static int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f0b4b76", new Object[0])).intValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeIntConfig("livePmSubscriberDelay", 3000);
    }

    public static boolean s(FluidContext fluidContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9a2cc52", new Object[]{fluidContext})).booleanValue();
        }
        try {
            uq9 activeCard = ((ICardService) fluidContext.getService(ICardService.class)).getActiveCard();
            if (activeCard != null) {
                String G2 = akt.G2("AB_fullscreenpage_android.nativeAlbum.enableSlideUpAlpha", null);
                if (G2 != null) {
                    z = nwv.o(G2, false);
                } else {
                    z = activeCard.Y().g().slideUpIncludeMultiCard;
                }
            } else {
                z = false;
            }
            ir9.b("InteractionServiceConfig", "isEnableCardTransparent slideUpIncludeMultiCard:" + z);
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            ir9.b("InteractionServiceConfig", "isEnableCardTransparent error:" + e.getMessage());
            return false;
        }
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d249e09e", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableWeexUponSeekBar", false);
    }

    public static boolean x(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("435a06b9", new Object[]{fluidContext})).booleanValue();
        }
        try {
            Boolean t = ((ICardService) fluidContext.getService(ICardService.class)).getConfig().t();
            if (t == null) {
                t = Boolean.valueOf(pto.g(fluidContext));
                ((ICardService) fluidContext.getService(ICardService.class)).getConfig().z(t);
            }
            ir9.b("InteractionServiceConfig", "isTab3ProgressChangeAll enable=" + t);
            return t.booleanValue();
        } catch (Exception e) {
            ir9.b("InteractionServiceConfig", "isTab3ProgressChangeAll error:" + e.getMessage());
            return false;
        }
    }

    public static int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("585bdd54", new Object[0])).intValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeIntConfig("liveAutoSlideDelayTime", 500);
    }

    public void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2367db5b", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e57575a", new Object[]{this, new Boolean(z)});
        } else {
            this.f16260a = z;
        }
    }

    public Set<String> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("aab0ea7e", new Object[]{this});
        }
        return this.b;
    }

    public Boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("fea57cbd", new Object[]{this});
        }
        return this.c;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e247c0d5", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73b37386", new Object[]{this})).booleanValue();
        }
        return this.f16260a;
    }

    public void z(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a273d45", new Object[]{this, bool});
        } else {
            this.c = bool;
        }
    }
}
