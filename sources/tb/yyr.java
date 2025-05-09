package tb;

import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class yyr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714600);
    }

    public static void a(Map map, JSONObject jSONObject, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75bd421", new Object[]{map, jSONObject, strArr});
            return;
        }
        for (String str : strArr) {
            jSONObject.put(str, map.get(str));
        }
    }

    public static void b(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64798bbc", new Object[]{str, str2, str3, map});
        } else {
            FluidSDK.getUTAdapter().trackCustom("Page_videointeract", 19997, str, str2, str3, map);
        }
    }

    public static void c(vrp vrpVar) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95e6be42", new Object[]{vrpVar});
        } else if (vrp.MSG_DATA_CHANGE.equals(vrpVar.c) && (map = vrpVar.h) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                a(map, jSONObject, "pageMap", "extraMap", "id");
                Object obj = map.get("content");
                if (obj instanceof Map) {
                    Map map2 = (Map) obj;
                    JSONObject jSONObject2 = new JSONObject();
                    a(map2, jSONObject2, "id", "status", "summary", "title", "interactiveId");
                    jSONObject.put("content", (Object) jSONObject2);
                    Object obj2 = map2.get(tep.KEY_UNIFORM_RESULT);
                    if (obj2 instanceof Map) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject2.put(tep.KEY_UNIFORM_RESULT, (Object) jSONObject3);
                        a((Map) obj2, jSONObject3, "duration", "firstFrameUrl", "height", "type", "url", "videoId", "width");
                    }
                }
                Object obj3 = map.get(pg1.ATOM_raw);
                if (obj3 instanceof Map) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject.put(pg1.ATOM_raw, (Object) jSONObject4);
                    a((Map) obj3, jSONObject4, LoginConstant.ACCOUNT, "content", "sequenceNumber", "sequenceNumberStr", "nid", "subType", "type", "bginteractive", "playletInfo", "utPairs", "extraData", "frontendTransmission");
                }
                a(map, jSONObject, "type", "hasExposed", "index", "modelIndex", "relativeIndex", "sequenceNumber", sj4.UPDATE_DATA_MSG_FOR_GLOBAL_H5, "utPairs");
                vrpVar.h = jSONObject;
            } catch (Throwable th) {
                ir9.c("TBVideoUtils", "removeUnusedMediaData error", th);
            }
        }
    }
}
