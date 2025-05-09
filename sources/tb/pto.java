package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.intelligence.IIntelligenceService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class pto {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NEXT_VIDEO_BREAK = 2;
    public static final int NEXT_VIDEO_NONE = 0;
    public static final int NEXT_VIDEO_PUBLIC = 1;

    static {
        t2o.a(468714753);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50c70bc5", new Object[0]);
        }
        JSONObject jSONObject = (JSONObject) akt.B2(IIntelligenceService.KEY_ABTEST_UI_RELAYOUT, new JSONObject());
        if (!jSONObject.containsKey("uiLayoutStrategy")) {
            return "-1";
        }
        String obj = jSONObject.get("uiLayoutStrategy").toString();
        ir9.b("Tab2MobileAI", "initHandleRecognizeService info:" + jSONObject.get("uiLayoutStrategy"));
        return obj;
    }

    public static String b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8af1f609", new Object[]{fluidContext});
        }
        if (fluidContext == null) {
            return "video";
        }
        return fluidContext.getInstanceConfig().getTabId();
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b3fa82", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        String lowerCase = str2.toLowerCase();
        if (lowerCase.contains(",all,")) {
            return true;
        }
        return lowerCase.contains("," + str + ",");
    }

    public static boolean d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60809ba4", new Object[]{fluidContext})).booleanValue();
        }
        mca globalState = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getGlobalState();
        if (globalState.c == null) {
            globalState.c = Boolean.valueOf(Boolean.parseBoolean(FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig("degradeUtIndex", "false")));
        }
        return globalState.c.booleanValue();
    }

    public static boolean e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2896b538", new Object[0])).booleanValue();
        }
        if (pr9.j()) {
            str = "ShortVideo.enableImmersiveVideoForLarge";
        } else {
            str = "ShortVideo.enableImmersiveVideoNormal";
        }
        return akt.p2(str, true);
    }

    public static boolean f(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa83fbc1", new Object[]{fluidContext})).booleanValue();
        }
        pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
        if (sessionParams == null) {
            return false;
        }
        return k("TBVideoGuangTypeList", sessionParams.b, ",guangguang,guangguang_follow,guangguang_homepage,guang_std_a,guang_std_b,guangguang_cainixihuan,guangguang_pick,guangguang_interaction_ad,");
    }

    public static boolean g(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0995650", new Object[]{fluidContext})).booleanValue();
        }
        return FluidInstanceConfig.CONTAINER_NAME_GG_TAG3.equals(fluidContext.getInstanceConfig().getBizType());
    }

    public static boolean h(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d06e1c42", new Object[]{fluidContext})).booleanValue();
        }
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (j == null || !"guangguang".equalsIgnoreCase(j.p)) {
            return false;
        }
        return true;
    }

    public static boolean i(FluidContext fluidContext) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb1af87", new Object[]{fluidContext})).booleanValue();
        }
        if (fluidContext == null) {
            return false;
        }
        if (!b93.n(fluidContext) && q(fluidContext) && fluidContext.getInstanceConfig().isTab3Fullscreen()) {
            z = true;
        }
        return j(z);
    }

    public static boolean j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92c29f27", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (!e() || !z) {
            return false;
        }
        return true;
    }

    public static boolean k(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bde9d470", new Object[]{str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            return c(str2, FluidSDK.getRemoteConfigAdapter().getOrangeStringConfig(str, str3));
        } catch (Throwable th) {
            TLog.loge("SceneServiceConfig", "isInTypeList error", th);
            return false;
        }
    }

    public static boolean l(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0032198", new Object[]{fluidContext})).booleanValue();
        }
        return fluidContext.getInstanceConfig().isTab3FromLauncher();
    }

    public static boolean n(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12044196", new Object[]{fluidContext})).booleanValue();
        }
        return ((IContainerService) fluidContext.getService(IContainerService.class)).getConfig().p();
    }

    public static boolean o(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af69f82e", new Object[]{fluidContext})).booleanValue();
        }
        return FluidInstanceConfig.CONTAINER_NAME_SHOP_LOFT.equals(((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams().b().a());
    }

    public static boolean p(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5abc3a33", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        if (!p91.m(context) || !z) {
            return false;
        }
        return true;
    }

    public static boolean q(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7ac0e99", new Object[]{fluidContext})).booleanValue();
        }
        return p(fluidContext.getContext(), g(fluidContext));
    }

    public static boolean m(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17001b7", new Object[]{fluidContext})).booleanValue();
        }
        return TextUtils.equals(sj4.TAB2_SOURCE_OUTSIDE, fluidContext.getInstanceConfig().getTab3ComponentSource());
    }
}
