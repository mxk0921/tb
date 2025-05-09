package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d0b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809652);
    }

    public static Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2189935c", new Object[0]);
        }
        JSONObject b = b();
        if (b == null) {
            uqa.b("smartLoading", "getBucket", "homeGlobalAbTest == null");
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bucket", b.getString("bucket"));
        return hashMap;
    }

    public static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ced519f2", new Object[0]);
        }
        String k = yyj.e().k();
        imn d = zza.d(k);
        if (d == null) {
            uqa.b("smartLoading", "getHomeGlobalAbTest", "recmdDataSource == null");
            return null;
        }
        AwesomeGetContainerData u = d.u(k);
        if (u == null) {
            uqa.b("smartLoading", "getHomeGlobalAbTest", "containerData == null");
            return null;
        }
        JSONObject ext = u.getExt();
        if (ext != null) {
            return ext.getJSONObject("homeGlobalABTest");
        }
        uqa.b("smartLoading", "getHomeGlobalAbTest", "ext == null");
        return null;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a65a6ae", new Object[0]);
        } else {
            a4q.b(b());
        }
    }
}
