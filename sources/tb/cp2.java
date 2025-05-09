package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cp2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714308);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43b42b26", new Object[0]);
        }
        return b("video.request.refresh", "Page_videointeract");
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7410455", new Object[]{str, str2});
        }
        try {
            return BUFS.getFeature(new BUFS.QueryArgs(), str, str2, "Page_videointeract");
        } catch (Throwable th) {
            ir9.b("BxUtils", "t:" + th.getMessage());
            return "";
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c39b79d6", new Object[0]);
        }
        return b("guangguang.shortVideo.request.recommend", "guangguang");
    }

    public static boolean d(FluidContext fluidContext) {
        pep sessionParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4759fbb", new Object[]{fluidContext})).booleanValue();
        }
        try {
            sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        } catch (Throwable th) {
            ir9.b("BxUtils", "t:" + th.getMessage());
        }
        if (sessionParams == null) {
            return false;
        }
        return pto.k("supportBXTypeList", sessionParams.b, ",cainixihuansy,");
    }

    public static boolean e(pep pepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbe930a1", new Object[]{pepVar})).booleanValue();
        }
        if (pepVar == null) {
            return false;
        }
        try {
            if (!"guangguang".equals(pepVar.b)) {
                if (!"guangguang_pick".equals(pepVar.b)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            ir9.b("BxUtils", "t:" + th.getMessage());
            return false;
        }
    }
}
