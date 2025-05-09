package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kfj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714562);
    }

    public static boolean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ef49932", new Object[]{fluidContext})).booleanValue();
        }
        return akt.I1(mfj.j(fluidContext));
    }

    public static boolean a(FluidContext fluidContext) {
        Map<String, Map<String, Object>> map;
        Map<String, Object> map2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d536cc96", new Object[]{fluidContext})).booleanValue();
        }
        if (!akt.p2("ShortVideo.enableNewGlobalMute", true)) {
            return false;
        }
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (!(j == null || (map = j.G) == null || (map2 = map.get("newMuteSettingV2")) == null)) {
            z = nwv.o(map2.get("enable"), false);
        }
        ir9.b("MuteConfig", z + "--enableNewMuteSetting ");
        return z;
    }
}
