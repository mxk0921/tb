package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.WidgetStartParams;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.net.URLEncoder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ddx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ddx INSTANCE = new ddx();

    static {
        t2o.a(852492307);
    }

    public final void a(bbs bbsVar) {
        String realSpmUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10521eb4", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        JSONObject d = d(bbsVar);
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("MiniApp_Widget", "Click");
        HashMap hashMap = new HashMap();
        String encode = URLEncoder.encode(d.toJSONString(), "UTF-8");
        ckf.f(encode, "encode(commonArgs.toJSONString(), \"UTF-8\")");
        hashMap.put("utparam-cnt", encode);
        String L = bbsVar.L();
        ckf.f(L, "instance.appId");
        hashMap.put("miniapp_id", L);
        StartParams startParams = (StartParams) bbsVar.g(StartParams.class);
        if (startParams == null || !(startParams instanceof WidgetStartParams)) {
            startParams = null;
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
        String str = "";
        if (!(widgetStartParams == null || (realSpmUrl = widgetStartParams.getRealSpmUrl()) == null)) {
            str = realSpmUrl;
        }
        hashMap.put("spm-cnt", str);
        String b0 = bbsVar.b0();
        ckf.f(b0, "instance.spmOri");
        hashMap.put("spm_ori", b0);
        uTHitBuilders$UTControlHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        String d2 = ncs.d(bbsVar);
        String b = ncs.b(bbsVar);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "eventId", "MiniApp_Widget_Click");
        jSONObject.put((JSONObject) "params", (String) hashMap);
        xhv xhvVar = xhv.INSTANCE;
        mcs.e(mcs.MODULE_MONITOR, mcs.EVENT_ON_COMMIT_UT_MONITOR, d2, b, jSONObject);
    }

    public final void b(bbs bbsVar, long j) {
        String realSpmUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc693706", new Object[]{this, bbsVar, new Long(j)});
            return;
        }
        ckf.g(bbsVar, "instance");
        JSONObject d = d(bbsVar);
        if (j > 0) {
            d.put((JSONObject) "miniapp_module_stay_time", (String) Long.valueOf(System.currentTimeMillis() - j));
        }
        HashMap hashMap = new HashMap();
        String encode = URLEncoder.encode(d.toJSONString(), "UTF-8");
        ckf.f(encode, "encode(commonArgs.toJSONString(), \"UTF-8\")");
        hashMap.put("utparam-cnt", encode);
        String L = bbsVar.L();
        ckf.f(L, "instance.appId");
        hashMap.put("miniapp_id", L);
        StartParams startParams = (StartParams) bbsVar.g(StartParams.class);
        if (startParams == null || !(startParams instanceof WidgetStartParams)) {
            startParams = null;
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
        String str = "";
        if (!(widgetStartParams == null || (realSpmUrl = widgetStartParams.getRealSpmUrl()) == null)) {
            str = realSpmUrl;
        }
        hashMap.put("spm-cnt", str);
        String b0 = bbsVar.b0();
        ckf.f(b0, "instance.spmOri");
        hashMap.put("spm_ori", b0);
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("MiniApp_Widget", 2201, "MiniApp_Widget_Exposure", null, null, hashMap);
        String d2 = ncs.d(bbsVar);
        String b = ncs.b(bbsVar);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "eventId", "MiniApp_Widget_Exposure");
        jSONObject.put((JSONObject) "params", (String) hashMap);
        xhv xhvVar = xhv.INSTANCE;
        mcs.e(mcs.MODULE_MONITOR, mcs.EVENT_ON_COMMIT_UT_MONITOR, d2, b, jSONObject);
        UTAnalytics.getInstance().getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
    }

    public final void c(bbs bbsVar) {
        String realSpmUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999a23ab", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        JSONObject d = d(bbsVar);
        UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("MiniApp_Widget", "Touch");
        HashMap hashMap = new HashMap();
        String encode = URLEncoder.encode(d.toJSONString(), "UTF-8");
        ckf.f(encode, "encode(commonArgs.toJSONString(), \"UTF-8\")");
        hashMap.put("utparam-cnt", encode);
        String L = bbsVar.L();
        ckf.f(L, "instance.appId");
        hashMap.put("miniapp_id", L);
        StartParams startParams = (StartParams) bbsVar.g(StartParams.class);
        if (startParams == null || !(startParams instanceof WidgetStartParams)) {
            startParams = null;
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
        String str = "";
        if (!(widgetStartParams == null || (realSpmUrl = widgetStartParams.getRealSpmUrl()) == null)) {
            str = realSpmUrl;
        }
        hashMap.put("spm-cnt", str);
        String b0 = bbsVar.b0();
        ckf.f(b0, "instance.spmOri");
        hashMap.put("spm_ori", b0);
        uTHitBuilders$UTControlHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        String d2 = ncs.d(bbsVar);
        String b = ncs.b(bbsVar);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "eventId", "MiniApp_Widget_Touch");
        jSONObject.put((JSONObject) "params", (String) hashMap);
        xhv xhvVar = xhv.INSTANCE;
        mcs.e(mcs.MODULE_MONITOR, mcs.EVENT_ON_COMMIT_UT_MONITOR, d2, b, jSONObject);
    }

    public final JSONObject d(bbs bbsVar) {
        String relationUrl;
        JSONObject sceneParamObject;
        String c;
        JSONObject e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f4e11861", new Object[]{this, bbsVar});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "miniapp_id", bbsVar.L());
        jSONObject2.put((JSONObject) luw.MINIAPP_ORI_URL_KEY, bbsVar.e0());
        jSONObject2.put((JSONObject) "miniapp_trace_id", bbsVar.h);
        jSONObject2.put((JSONObject) "miniapp_type", "widget");
        String w = r8s.w(bbsVar);
        if (w != null) {
            jSONObject2.put((JSONObject) "miniapp_template_id", w);
        }
        TMSMetaInfoWrapper U = bbsVar.U();
        if (!(U == null || (e = U.e()) == null || (jSONObject = e.getJSONObject("customLaunchParams")) == null)) {
            jSONObject2.put((JSONObject) "miniapp_appinfo_launch_params", (String) jSONObject);
        }
        ITMSPage topPage = bbsVar.W().getTopPage();
        if (!(topPage == null || (c = topPage.c()) == null)) {
            jSONObject2.put((JSONObject) "miniapp_page_name", ies.b(c));
        }
        StartParams startParams = (StartParams) bbsVar.g(StartParams.class);
        if (startParams == null || !(startParams instanceof WidgetStartParams)) {
            startParams = null;
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
        if (!(widgetStartParams == null || (sceneParamObject = widgetStartParams.getSceneParamObject()) == null)) {
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.putAll(sceneParamObject);
            jSONObject4.remove("moduleData");
            jSONObject4.remove("shopModuleData");
            xhv xhvVar = xhv.INSTANCE;
            jSONObject3.put((JSONObject) "widget_params", (String) jSONObject4);
            jSONObject2.put((JSONObject) "miniapp_biz_launch_params", (String) jSONObject3);
        }
        if (!(widgetStartParams == null || (relationUrl = widgetStartParams.getRelationUrl()) == null)) {
            jSONObject2.put((JSONObject) "miniapp_module_redirect_miniapp", Uri.parse(relationUrl).getQueryParameter("_ariver_appid"));
        }
        return jSONObject2;
    }
}
