package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.mmad.data.BaseMmAdModel;
import com.taobao.statistic.TBS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i4v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG1_CHOOSE_RESULT = "choose_result";
    public static final String ARG1_DX_CREATE_VIEW_NULL = "dx_create_view_null";
    public static final String ARG1_DX_DOWNLOAD_ERROR = "dx_download_error";
    public static final String ARG1_DX_RENDER_VIEW_NULL = "dx_render_view_null";
    public static final String ARG1_DX_TEMPLATE_VERSION_ERROR = "dx_template_version_error";
    public static final String ARG1_RESOURCE_FAIL = "resource_fail";
    public static final String ARG1_SHOULD_SHOW_RESULT = "should_show_result";
    public static final int EVENT_ID = 2101;
    public static final String EVENT_TYPE = "eventType";
    public static final String MMAD_EVENT_EXPOSE = "mmad_event_expose";
    public static final String MMAD_EVENT_INTERACT = "mmad_event_interact";
    public static final String S_UT_PAGE = "Page_Home_Splash_Interact";

    static {
        t2o.a(573571216);
    }

    public static Map<String, String> a(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("313568e6", new Object[]{nwiVar});
        }
        Map<String, String> hashMap = new HashMap<>();
        if (!(nwiVar == null || nwiVar.d() == null)) {
            hashMap = y(nwiVar.d().d(), hashMap);
            BaseMmAdModel a2 = nwiVar.d().a();
            if (a2 == null) {
                return hashMap;
            }
            try {
                String str = a2.actionResponse;
                if (!TextUtils.isEmpty(str)) {
                    if ("2".equals(str)) {
                        hashMap.put("actionResponse", a2.actionResponse);
                        hashMap.put("actionResult", a2.actionResult);
                        hashMap.put("actionText", a2.actionText);
                        hashMap.put("benefitType", a2.benefitType);
                        hashMap.put("benefitId", a2.benefitId);
                        hashMap.put("benefitTitle", a2.benefitTitle);
                        hashMap.put("benefitImageUrl", a2.benefitImageUrl);
                        hashMap.put("benefitAmountCents", a2.benefitAmountCents);
                        hashMap.put("benefitQuerySource", a2.benefitQuerySource);
                        hashMap.put("benefitSource", a2.benefitQuerySource);
                        hashMap.put("advName", a2.advName);
                        hashMap.put("advColor", a2.advColor);
                    } else if ("1".equals(str)) {
                        hashMap.put("actionResponse", a2.actionResponse);
                        hashMap.put("actionText", a2.actionText);
                        hashMap.put("cardItemId", a2.cardItemId);
                        hashMap.put("cardSkuId", a2.cardSkuId);
                        hashMap.put("cardImageUrl", a2.cardImageUrl);
                        hashMap.put("cardTitle", a2.cardTitle);
                        hashMap.put("cardDesc", a2.cardDesc);
                        hashMap.put("advName", a2.advName);
                        hashMap.put("advColor", a2.advColor);
                    }
                    hashMap.put("gestureSwitch", a2.gestureSwitch);
                    hashMap.put("interactImage", a2.interactImage);
                    hashMap.put("gestureImage", a2.gestureImage);
                } else if (!TextUtils.isEmpty(a2.animationType)) {
                    hashMap.put("animationType", a2.animationType);
                    hashMap.put("animationLottie", a2.animationLottie);
                }
                hashMap.put("actionResponse", a2.actionResponse);
                hashMap.put("actionText", a2.actionText);
                hashMap.put("closeTxt", a2.closeTxt);
                hashMap.put("creative_id", a2.getCreativeId());
                hashMap.put("dx_template_name", nwiVar.a().a());
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(a2.waitTime));
                hashMap.put("timeFromStart", String.valueOf(nwiVar.a().b()));
                String e = dcj.e(a2.getTargetUrl());
                if (!TextUtils.isEmpty(e)) {
                    hashMap.put("alitrackid", e);
                }
            } catch (Throwable th) {
                jgh.b("UTUtil", "buildCommonArgs Error ", th);
            }
        }
        return hashMap;
    }

    public static String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3275e5d", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
        }
        return TextUtils.join(",", arrayList);
    }

    public static void c(nwi nwiVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf35eb9", new Object[]{nwiVar, str, map});
            return;
        }
        if (nwiVar != null) {
            try {
                if (!(nwiVar.d() == null || nwiVar.d().a() == null)) {
                    Map<String, String> a2 = a(nwiVar);
                    if (map != null) {
                        a2.putAll(map);
                    }
                    a2.put("biz", "topshow");
                    String e = dcj.e(nwiVar.d().a().getTargetUrl());
                    if (!TextUtils.isEmpty(e)) {
                        a2.put("alitrackid", e);
                    }
                    p(S_UT_PAGE, ConnectionResult.SERVICE_UPDATING, str, null, null, a2);
                    return;
                }
            } catch (Throwable th) {
                jgh.b("UTUtil", "commit9004AdInteractEvent error ", th);
                return;
            }
        }
        jgh.a("UTUtil", "commit9004AdEvent adModel is null");
    }

    public static void d(nwi nwiVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2d64b9f", new Object[]{nwiVar, map});
            return;
        }
        try {
            c(nwiVar, MMAD_EVENT_EXPOSE, map);
        } catch (Throwable th) {
            jgh.b("UTUtil", "commit9004AdExposeEvent error ", th);
        }
    }

    public static void e(nwi nwiVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc49dad", new Object[]{nwiVar, map});
            return;
        }
        try {
            c(nwiVar, MMAD_EVENT_INTERACT, map);
        } catch (Throwable th) {
            jgh.b("UTUtil", "commit9004AdInteractEvent error ", th);
        }
    }

    public static void f(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8432a00", new Object[]{nwiVar});
        } else {
            p(S_UT_PAGE, 2101, "splash_pop_lottie_not_ready", null, null, a(nwiVar));
        }
    }

    public static void g(nwi nwiVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba593a17", new Object[]{nwiVar, str});
        } else if (nwiVar != null) {
            HashMap hashMap = new HashMap();
            if (nwiVar.h()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            hashMap.put("isColdStart", str2);
            hashMap.put("errMsg", str);
            hashMap.putAll(a(nwiVar));
            p(S_UT_PAGE, 2101, "splash_pop_play_fail", null, null, hashMap);
        }
    }

    public static void h(nwi nwiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3c7775", new Object[]{nwiVar, str});
        } else if (nwiVar != null) {
            HashMap hashMap = new HashMap();
            String str2 = "0";
            hashMap.put("render_status", str2);
            if (nwiVar.h()) {
                str2 = "1";
            }
            hashMap.put("isColdStart", str2);
            hashMap.put("errMsg", str);
            hashMap.putAll(a(nwiVar));
            p(S_UT_PAGE, 2201, "splash_pop_render_fail", null, null, hashMap);
        }
    }

    public static void i(nwi nwiVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff647c1", new Object[]{nwiVar, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (nwiVar != null) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("render_status", str);
            if (!nwiVar.h()) {
                str = "0";
            }
            hashMap.put("isColdStart", str);
            hashMap.put("pop_time_duration", String.valueOf(i));
            hashMap.put("pop_lottie_size_width", String.valueOf(i2));
            hashMap.put("pop_lottie_size_height", String.valueOf(i3));
            hashMap.putAll(a(nwiVar));
            p(S_UT_PAGE, 2201, "splash_pop_render_view", null, null, hashMap);
        }
    }

    public static void j(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a35220", new Object[]{nwiVar});
        } else if (nwiVar != null) {
            p(S_UT_PAGE, 2101, "splash_pop_event_click_skip", null, null, a(nwiVar));
        }
    }

    public static void k(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d39d674", new Object[]{nwiVar});
        } else {
            p(S_UT_PAGE, 2101, "splash_pop_video_not_ready", null, null, a(nwiVar));
        }
    }

    public static void l(String str, nwi nwiVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7aa741c", new Object[]{str, nwiVar, map});
            return;
        }
        try {
            Map<String, String> a2 = a(nwiVar);
            if (map != null) {
                a2.putAll(map);
            }
            p(S_UT_PAGE, 2101, str, null, null, a2);
        } catch (Throwable th) {
            jgh.b("UTUtil", "commitCommonClickEvent error ", th);
        }
    }

    public static void m(String str, nwi nwiVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a75bb8a", new Object[]{str, nwiVar, map});
            return;
        }
        try {
            Map<String, String> a2 = a(nwiVar);
            if (map != null) {
                a2.putAll(map);
            }
            p(S_UT_PAGE, 19999, str, null, null, a2);
        } catch (Throwable th) {
            jgh.b("UTUtil", "commitCommonClickEvent error ", th);
        }
    }

    public static void n(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839215ba", new Object[]{nwiVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("eventType", "count_down_finish");
            e(nwiVar, hashMap);
        } catch (Throwable th) {
            jgh.b("UTUtil", "commitCountDownFinish error ", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o(boolean z, nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af036482", new Object[]{new Boolean(z), nwiVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("render_status", String.valueOf(z ? 1 : 0));
            String str = "0";
            hashMap.put("isColdStart", nwiVar.h() ? "1" : str);
            hashMap.putAll(a(nwiVar));
            p(S_UT_PAGE, 2201, "render_dx_view", null, null, hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("eventType", "render_view");
            hashMap2.put("render_status", String.valueOf((int) z));
            if (nwiVar.h()) {
                str = "1";
            }
            hashMap2.put("isColdStart", str);
            d(nwiVar, hashMap2);
        } catch (Throwable th) {
            jgh.b("UTUtil", "commitSplashInteractRender error ", th);
        }
    }

    public static void p(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c41bb8", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        try {
            map.put("isNewArch", "1");
            String b = b(map);
            jgh.a("UTUtil", "eventId=" + i + ";arg1=" + str2 + ";args=" + b);
            TBS.Ext.commitEvent(str, i, str2, str3, str4, b);
        } catch (Exception e) {
            jgh.a("UTUtil", "commitEvent errMsg=" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void q(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95e59035", new Object[]{nwiVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("eventType", "interact_image");
            d(nwiVar, hashMap);
        } catch (Throwable th) {
            jgh.b("UTUtil", "commitInteractImageExpose error ", th);
        }
    }

    public static void r(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afbe115", new Object[]{nwiVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("eventType", "interact_video");
            d(nwiVar, hashMap);
        } catch (Throwable th) {
            jgh.b("UTUtil", "commitInteractVideoExpose error ", th);
        }
    }

    public static void s(int i, String str, String str2, nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2128c679", new Object[]{new Integer(i), str, str2, nwiVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("success", String.valueOf(i));
            hashMap.put(MUSAppMonitor.ERROR_MSG, str2);
            hashMap.put("error_code", str);
            hashMap.putAll(a(nwiVar));
            p(S_UT_PAGE, 2101, "dx_shopping_request", null, null, hashMap);
        } catch (Throwable th) {
            jgh.b("UTUtil", "commitSplashInteractCartRequest error ", th);
        }
    }

    public static void t(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c7cb93", new Object[]{nwiVar});
            return;
        }
        try {
            p(S_UT_PAGE, 2101, "interact_event_dx_click", null, null, a(nwiVar));
        } catch (Throwable th) {
            jgh.b("UTUtil", "commitSplashInteractClick error ", th);
        }
    }

    public static void u(int i, String str, String str2, nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9aec033", new Object[]{new Integer(i), str, str2, nwiVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("success", String.valueOf(i));
            hashMap.put(MUSAppMonitor.ERROR_MSG, str2);
            hashMap.put("error_code", str);
            hashMap.putAll(a(nwiVar));
            p(S_UT_PAGE, 2101, "dx_coupon_request", null, null, hashMap);
        } catch (Throwable th) {
            jgh.b("UTUtil", "commitSplashInteractCouponRequest error ", th);
        }
    }

    public static void v(boolean z, float f, double d, float f2, nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935c519c", new Object[]{new Boolean(z), new Float(f), new Double(d), new Float(f2), nwiVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("slide_distance", String.valueOf(f));
        hashMap.put("slide_angle", String.valueOf(d));
        hashMap.put("config_slide_distance", String.valueOf(f2));
        hashMap.put("slideStatus", String.valueOf(z ? 1 : 0));
        hashMap.putAll(a(nwiVar));
        p(S_UT_PAGE, 2101, "interact_event_slide", null, null, hashMap);
    }

    public static void w(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c67dd83", new Object[]{nwiVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("eventType", "skip_interact_video");
            e(nwiVar, hashMap);
        } catch (Throwable th) {
            jgh.b("UTUtil", "commitUserSkipInteractVideo error ", th);
        }
    }

    public static void x(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104fed1f", new Object[]{nwiVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("eventType", "skip_splash");
            e(nwiVar, hashMap);
        } catch (Throwable th) {
            jgh.b("UTUtil", "commitUserSkipSplash error ", th);
        }
    }

    public static Map<String, String> y(JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a15f9676", new Object[]{jSONObject, map});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.getString(str));
            }
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }
}
