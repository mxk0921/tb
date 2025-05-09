package tb;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q8v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f26590a;

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f3256a51", new Object[]{jSONObject});
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("global");
        if (jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject(LinkageUtils.PolicyType.RULE)) == null) {
            return null;
        }
        return jSONObject2.getJSONObject("globalMerge");
    }

    public static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cfcc97ce", new Object[]{jSONObject, jSONObject2, jSONObject3});
        }
        if (!(jSONObject2 == null || jSONObject3 == null)) {
            Iterator it = ((ArrayList) f26590a).iterator();
            while (it.hasNext()) {
                jSONObject3.remove((String) it.next());
            }
            try {
                JSONObject b = h9v.b(jSONObject2, jSONObject3);
                c(jSONObject, jSONObject2, jSONObject3);
                return b;
            } catch (Exception e) {
                hav.a("UltronMergeGlobalException", e.getMessage());
            }
        }
        return jSONObject3;
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5431b46c", new Object[]{jSONObject, jSONObject2, jSONObject3});
            return;
        }
        JSONObject a2 = a(jSONObject);
        if (a2 != null) {
            h9v.c(a2, jSONObject2, jSONObject3);
        }
    }

    static {
        t2o.a(83886234);
        ArrayList arrayList = new ArrayList();
        f26590a = arrayList;
        arrayList.add("performanceStage");
        arrayList.add(LinkageUtils.PolicyType.RULE);
    }
}
