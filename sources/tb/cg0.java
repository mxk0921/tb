package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class cg0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(736100461);
    }

    public static void a(LinkedSplashData linkedSplashData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32aaf255", new Object[]{linkedSplashData, new Boolean(z)});
        } else if (linkedSplashData != null) {
            JSONObject subSection = linkedSplashData.getSubSection();
            JSONObject jSONObject = subSection.getJSONObject(rr6.TYPE_POPVIEW);
            if (jSONObject != null) {
                b(jSONObject, z);
            }
            JSONObject jSONObject2 = subSection.getJSONObject("searchText");
            if (jSONObject2 != null) {
                b(jSONObject2, z);
            }
        }
    }

    public static void b(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("976c61ca", new Object[]{jSONObject, new Boolean(z)});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("ext");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            jSONObject.put("ext", (Object) jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("monitorArgs", (Object) c(z));
        jSONObject3.put("utArgs", (Object) d(z));
        jSONObject2.put("advClientParam", (Object) jSONObject3);
    }

    public static Map<String, String> d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("87ec3209", new Object[]{new Boolean(z)});
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("is_cold", Boolean.toString(z));
        hashMap.put("scene", PopStrategy.IDENTIFIER_SPLASH);
        return hashMap;
    }

    public static Map<String, String> c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f94df0c8", new Object[]{new Boolean(z)});
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("is_cold", Boolean.toString(z));
        return hashMap;
    }
}
