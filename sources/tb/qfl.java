package tb;

import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IOutLinkService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends TypeReference<Map<String, String>> {
    }

    static {
        t2o.a(729809399);
    }

    public static boolean a(cfc cfcVar, w1e w1eVar) {
        w1e scrolledToItemTraceInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f026db59", new Object[]{cfcVar, w1eVar})).booleanValue();
        }
        IOutLinkService iOutLinkService = (IOutLinkService) cfcVar.a(IOutLinkService.class);
        if (iOutLinkService == null || (scrolledToItemTraceInfo = iOutLinkService.getScrolledToItemTraceInfo()) == null || !scrolledToItemTraceInfo.equals(w1eVar)) {
            return true;
        }
        return false;
    }

    public static void b(wll wllVar, boolean z) {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("849b2c61", new Object[]{wllVar, new Boolean(z)});
            return;
        }
        IHomeViewService iHomeViewService = (IHomeViewService) c4b.i().h(IHomeViewService.class);
        if (iHomeViewService != null) {
            iHomeViewService.selectTab("home");
        }
        try {
            vqa g = vqa.k().i("ExternalLink").j("recommendProcess").g("外链", wllVar.b);
            String str2 = wllVar.b;
            if (!(str2 == null || (jSONObject2 = JSON.parseObject(str2).getJSONObject("nextPageUtProperties")) == null)) {
                r5a.r((Map) JSON.parseObject(jSONObject2.toJSONString(), new a(), new Feature[0]));
            }
            String str3 = wllVar.b;
            if (str3 == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = JSON.parseObject(str3);
            }
            if (jSONObject != null) {
                jSONObject.put("isColdStart", (Object) Boolean.valueOf(z));
                g.h("当前是否是冷启外链拉端", z);
            }
            IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
            if (iHomePageLifecycleService != null) {
                Intent intent = wllVar.d;
                if (jSONObject != null) {
                    str = jSONObject.toJSONString();
                } else {
                    str = "";
                }
                iHomePageLifecycleService.onOutLink("home", intent, str);
            }
            g.a();
        } catch (Exception unused) {
            uqa.b("ExternalLink", "recommendProcess", "recmdParams parse JSON exception :" + wllVar.b);
            ddv.h("OutLinkMicroservicesCompatible", "2.0", "processOutLink", "processOutLink", null, "recmdParams:" + wllVar.b);
        }
    }
}
