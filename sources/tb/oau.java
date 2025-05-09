package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oau {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Boolean c = null;

    /* renamed from: a  reason: collision with root package name */
    public int f25266a;
    public int b;

    static {
        t2o.a(468713574);
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3060615e", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("guangguangTab3PageEndCoolTime", "60"));
        } catch (Throwable th) {
            ir9.c("TrackServiceConfig", "", th);
            return 60;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59714151", new Object[0])).booleanValue();
        }
        try {
            if (c == null) {
                c = Boolean.valueOf(Boolean.parseBoolean(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("disableGlobalUtParams", String.valueOf(false))));
            }
            ir9.b("TrackServiceConfig", "isDisableGlobalUtParams=" + c);
            return c.booleanValue();
        } catch (Exception e) {
            ir9.c("TrackServiceConfig", "", e);
            return false;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d4b2417", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableCommitEndForMultiplexing", true);
    }

    public static boolean f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cd219c5", new Object[]{fluidContext})).booleanValue();
        }
        if (!pto.l(fluidContext)) {
            return false;
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableLauncherPausePostUT", true);
    }

    public static boolean g(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82f4e4ee", new Object[]{fluidContext})).booleanValue();
        }
        return ((ITrackService) fluidContext.getService(ITrackService.class)).isProcessFromLauncherFlag();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("914c70ab", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("notRemoveUtLogMapUtparam", false);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("517d7818", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("fixTintCardGrayParam", true);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5be47dd4", new Object[]{this})).intValue();
        }
        return this.f25266a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c7f5846", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82eeafb6", new Object[]{this, new Integer(i)});
        } else {
            this.f25266a = i;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb843084", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }
}
