package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hn4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20758a;
    public boolean b;
    public String c;
    public boolean d = false;

    static {
        t2o.a(468714132);
    }

    public hn4(FluidContext fluidContext) {
        fluidContext.getContext().getResources().getDimensionPixelSize(R.dimen.fluid_sdk_private_list_margin_top);
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4721c088", new Object[]{fluidContext})).booleanValue();
        }
        if (!pto.g(fluidContext) || !FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableCloseGlobalH5AtTab3", true)) {
            return false;
        }
        return true;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78027369", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableNewContentErrorStatus", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10db72ce", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getABTestBooleanConfig("AB_fullscreenpage_android.normalOPT2503.optTBErrorTip0304", FluidSDK.isBetaAppPackage());
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb975688", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getABTestBooleanConfig("AB_fullscreenpage_android.normalOPT2503.optTBErrorView0304", FluidSDK.isBetaAppPackage());
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e05ca3e4", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enablePrefetchVideoInfo0306", FluidSDK.isBetaAppPackage());
    }

    public static boolean f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48aa88e7", new Object[]{fluidContext})).booleanValue();
        }
        if (!f2k.d(fluidContext) || !FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableUseNewVideoSizeForPad", FluidSDK.isBetaAppPackage())) {
            return false;
        }
        return true;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d47fc477", new Object[0])).intValue();
        }
        return akt.w2("ShortVideo.errorContentAutoScrollDelay", 1000);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3868a8fb", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableTopTitle", true);
    }

    public static boolean o(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a72fb899", new Object[]{fluidContext})).booleanValue();
        }
        return ((IContainerService) fluidContext.getService(IContainerService.class)).isTab3GuideShoppingVersion();
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("feb45a82", new Object[]{this});
        }
        return this.c;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b711a14e", new Object[]{this})).booleanValue();
        }
        return this.f20758a;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfaf1660", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8fdc2de", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb037b1a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4e96806", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71ed1e02", new Object[]{this, new Boolean(z)});
        } else {
            this.f20758a = z;
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba8b134", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2994072", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0e2e4a", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public static boolean i(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcd8f082", new Object[]{fluidContext})).booleanValue();
        }
        try {
            if (pto.l(fluidContext) && akt.Z1() && ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().g()) {
                return e0o.b(p91.a(), e0o.FEATURE_OPT_LOADING, true);
            }
            return false;
        } catch (Throwable th) {
            ir9.c("ContainerServiceConfig", "", th);
            return false;
        }
    }
}
