package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uuq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f29623a;

    static {
        t2o.a(468714318);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe5e84b5", new Object[]{str});
        }
        return "VideoListTypeKey_" + str;
    }

    public static String b(FluidContext fluidContext) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("252b2fa3", new Object[]{fluidContext});
        }
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams == null || (str = sessionParams.b) == null) {
            return null;
        }
        Object a2 = ggs.a(a(str));
        if (a2 instanceof String) {
            return (String) a2;
        }
        if (b93.a()) {
            return "newdetail";
        }
        return c(fluidContext).get(str);
    }

    public static Map<String, String> c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("21650306", new Object[]{fluidContext});
        }
        Map<String, String> map = f29623a;
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        f29623a = hashMap;
        hashMap.put("guangguang_pick", "newdetail");
        return f29623a;
    }

    public static boolean d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc647207", new Object[]{fluidContext})).booleanValue();
        }
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (j == null || sessionParams == null) {
            return false;
        }
        return ggs.e(a(sessionParams.b), jwi.f(j));
    }
}
