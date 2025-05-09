package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class uwg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713981);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("847eae7b", new Object[0])).booleanValue();
        }
        return c();
    }

    public static boolean b(atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb03af58", new Object[]{atbVar})).booleanValue();
        }
        if (!a() || atbVar == null) {
            return false;
        }
        if (atbVar.getVideoState() == 1 || atbVar.getVideoState() == 8) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1e4a2fe", new Object[0])).booleanValue();
        }
        boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enablePreloadLive", true);
        tfs.d("直播卡片提前播放：orange开关打开：" + orangeBooleanConfig);
        return orangeBooleanConfig;
    }

    public static void d(FluidContext fluidContext, k5h k5hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd9782bb", new Object[]{fluidContext, k5hVar, new Boolean(z)});
        } else if ((!TextUtils.equals(fluidContext.getInstanceConfig().getTabId(), sj4.TAB2_CONTAINER_TYPE_LIVE_LARGE) || z) && a() && k5hVar != null) {
            k5hVar.P0();
            k5hVar.V0(false);
        }
    }

    public static void e(FluidContext fluidContext, atb atbVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c13231", new Object[]{fluidContext, atbVar, new Boolean(z)});
        } else if (!TextUtils.equals(fluidContext.getInstanceConfig().getTabId(), sj4.TAB2_CONTAINER_TYPE_LIVE_LARGE) || z) {
            mfj.B(atbVar);
        }
    }
}
