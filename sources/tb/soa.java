package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.VideoTracker;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b;
import com.taobao.android.fluid.core.FluidContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class soa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713634);
    }

    public static void a(FluidContext fluidContext, uq9 uq9Var, int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80eafa95", new Object[]{fluidContext, uq9Var, new Integer(i), str, str2, str3});
            return;
        }
        String str4 = i + ":" + VideoTracker.c(str);
        if ("2".equals(str2)) {
            b.U(fluidContext, "h5_load_error", str2, str4, VideoTracker.c(str3), null);
        } else {
            b.I(uq9Var, "h5_load_error", str2, str4, VideoTracker.c(str3), null);
        }
    }

    public static void b(FluidContext fluidContext, uq9 uq9Var, long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d427551b", new Object[]{fluidContext, uq9Var, new Long(j), str, str2});
        } else if ("2".equals(str)) {
            b.U(fluidContext, "h5_load_time", String.valueOf(j), str, VideoTracker.c(str2), null);
        } else {
            b.I(uq9Var, "h5_load_time", String.valueOf(j), str, VideoTracker.c(str2), null);
        }
    }

    public static void c(FluidContext fluidContext, uq9 uq9Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96adc6", new Object[]{fluidContext, uq9Var, str, str2});
        } else if ("2".equals(str)) {
            b.U(fluidContext, "h5_load", str, null, VideoTracker.c(str2), null);
        } else {
            b.I(uq9Var, "h5_load", str, null, VideoTracker.c(str2), null);
        }
    }
}
