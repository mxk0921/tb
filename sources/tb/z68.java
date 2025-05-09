package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.remote.RecommendEdgeClient;
import com.taobao.tao.recommend3.remote.RecommendEdgeParams;
import com.taobao.tao.recommend3.remote.RecommendEdgeResult;
import com.taobao.tao.util.TaoHelper;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class z68 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "EdgeComputeDataManager";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements g6j<RecommendEdgeResult> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AwesomeGetData f32567a;

        public a(AwesomeGetData awesomeGetData) {
            this.f32567a = awesomeGetData;
        }

        @Override // tb.g6j
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                return;
            }
            try {
                ddv.k(mtopResponse.getApi(), mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), "requestType", "");
            } catch (Throwable unused) {
            }
        }

        /* renamed from: c */
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2ff8f7", new Object[]{this, mtopResponse});
                return;
            }
            try {
                ddv.k(mtopResponse.getApi(), mtopResponse.getV(), mtopResponse.getRetCode(), mtopResponse.getRetMsg(), "requestType", "");
            } catch (Throwable unused) {
            }
        }

        /* renamed from: d */
        public void onSuccess(RecommendEdgeResult recommendEdgeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4921a375", new Object[]{this, recommendEdgeResult});
            } else if (recommendEdgeResult != null && this.f32567a != null) {
                Map a2 = z68.a(z68.this, recommendEdgeResult);
                if (a2 == null) {
                    hrg.c("intentProcess", "process_error", "edgeMap is null.", z68.TAG, "");
                    return;
                }
                if (cw6.b()) {
                    bqa.d(z68.TAG, "parse edge data complete.");
                }
                Map b = z68.b(z68.this, this.f32567a);
                if (b == null) {
                    hrg.c("intentProcess", "process_error", "dataMap is null.", z68.TAG, "");
                    return;
                }
                if (cw6.b()) {
                    bqa.d(z68.TAG, "parse data map complete.");
                }
                z68.c(z68.this, a2, b);
                if (cw6.b()) {
                    bqa.d(z68.TAG, "merge data and edge map complete.");
                    z68.d(z68.this, b, true);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final z68 f32568a = new z68();

        static {
            t2o.a(729809661);
        }

        public static /* synthetic */ z68 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z68) ipChange.ipc$dispatch("99057ca5", new Object[0]);
            }
            return f32568a;
        }
    }

    static {
        t2o.a(729809659);
    }

    public static /* synthetic */ Map a(z68 z68Var, RecommendEdgeResult recommendEdgeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2579685", new Object[]{z68Var, recommendEdgeResult});
        }
        return z68Var.j(recommendEdgeResult);
    }

    public static /* synthetic */ Map b(z68 z68Var, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ea48548f", new Object[]{z68Var, awesomeGetData});
        }
        return z68Var.g(awesomeGetData);
    }

    public static /* synthetic */ void c(z68 z68Var, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba5e864", new Object[]{z68Var, map, map2});
        } else {
            z68Var.p(map, map2);
        }
    }

    public static /* synthetic */ void d(z68 z68Var, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb27392", new Object[]{z68Var, map, new Boolean(z)});
        } else {
            z68Var.o(map, z);
        }
    }

    public static z68 l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z68) ipChange.ipc$dispatch("c4a0ac00", new Object[0]);
        }
        return b.a();
    }

    public void e(AwesomeGetData awesomeGetData) {
        Map<String, AwesomeGetContainerData> map;
        String k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497f0866", new Object[]{this, awesomeGetData});
        } else if (awesomeGetData != null && (map = awesomeGetData.containers) != null) {
            for (String str : map.keySet()) {
                AwesomeGetContainerData awesomeGetContainerData = map.get(str);
                if (!(awesomeGetContainerData == null || (k = k(awesomeGetContainerData)) == null)) {
                    f(k, awesomeGetData);
                    if (cw6.b()) {
                        bqa.d(TAG, "edge request info is not null, start request edge data. requestInfo = ".concat(k));
                    }
                }
            }
        }
    }

    public final void f(String str, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e228352a", new Object[]{this, str, awesomeGetData});
            return;
        }
        PositionInfo c = kbq.c(Globals.getApplication());
        RecommendEdgeClient recommendEdgeClient = new RecommendEdgeClient();
        String str2 = "";
        RecommendEdgeParams.b h = new RecommendEdgeParams.b().g(str).j(Login.getNick()).l(Login.getOldUserId()).i(Login.getOldEncryptedUserId() == null ? str2 : Login.getOldEncryptedUserId()).m(UTDevice.getUtdid(m0b.c())).h(von.g());
        if (c != null) {
            str2 = c.countryCode;
        }
        recommendEdgeClient.execute(h.f(str2).k("afterRecommend").e("recommend_home_main_edge").d(), new a(awesomeGetData), TaoHelper.getTTID());
    }

    public final Map<String, JSONObject> g(AwesomeGetData awesomeGetData) {
        Map<String, AwesomeGetContainerData> map;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData;
        List<SectionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("21235b91", new Object[]{this, awesomeGetData});
        }
        if (awesomeGetData == null || (map = awesomeGetData.containers) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            AwesomeGetContainerData awesomeGetContainerData = map.get(str);
            if (!(awesomeGetContainerData == null || (awesomeGetContainerInnerData = awesomeGetContainerData.base) == null || (list = awesomeGetContainerInnerData.sections) == null)) {
                for (SectionModel sectionModel : list) {
                    String h = h(sectionModel);
                    if (!TextUtils.isEmpty(h)) {
                        hashMap.put(h, sectionModel);
                    }
                }
            }
        }
        return hashMap;
    }

    public final String h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9903767", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.getJSONObject("args") == null) {
            return null;
        }
        return jSONObject.getJSONObject("args").getString("edgeComputeId");
    }

    public final String i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("934c557d", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("content") == null) {
            return null;
        }
        return jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("content").getString("edgeComputeId");
    }

    public final String k(AwesomeGetContainerData awesomeGetContainerData) {
        JSONObject a2;
        JSONObject a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("faae7cd3", new Object[]{this, awesomeGetContainerData});
        }
        if (awesomeGetContainerData == null) {
            return null;
        }
        JSONObject ext = awesomeGetContainerData.getExt();
        if (ext != null && (a3 = zjn.a(ext)) != null && a3.getBooleanValue("isOpen")) {
            return a3.getString("requestInfo");
        }
        JSONObject deltaExt = awesomeGetContainerData.getDeltaExt();
        if (deltaExt == null || (a2 = zjn.a(deltaExt)) == null || !a2.getBooleanValue("isOpen")) {
            return null;
        }
        return a2.getString("requestInfo");
    }

    public final JSONObject m(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c7eab6c7", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("content") == null) {
            return null;
        }
        return jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("content").getJSONObject("utLogMapEdge");
    }

    public final void n(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a782e3b", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject != null && jSONObject2 != null && (jSONObject3 = jSONObject2.getJSONObject("args")) != null) {
            jSONObject3.put("utLogMapEdge", (Object) jSONObject);
        }
    }

    public final void o(Map<String, JSONObject> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef8e818", new Object[]{this, map, new Boolean(z)});
        } else if (cw6.b() && map != null) {
            for (String str : map.keySet()) {
                JSONObject jSONObject = map.get(str);
                if (z) {
                    bqa.d(TAG, "index is 0, key = " + str + ", data is " + jSONObject.getJSONObject("args"));
                } else {
                    bqa.d(TAG, "index is 0, key = " + str + ", data is " + jSONObject);
                }
            }
        }
    }

    public final void p(Map<String, JSONObject> map, Map<String, JSONObject> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce166746", new Object[]{this, map, map2});
        } else if (map != null && map2 != null) {
            for (String str : map.keySet()) {
                n(map.get(str), map2.get(str));
                if (cw6.b() && map2.get(str) == null) {
                    bqa.d(TAG, "error. no key = " + str + " match to data");
                    StringBuilder sb = new StringBuilder("no key is ");
                    sb.append(str);
                    hrg.c("intentProcess", "process_error", sb.toString(), TAG, "");
                }
            }
        }
    }

    public final Map<String, JSONObject> j(RecommendEdgeResult recommendEdgeResult) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("20070cef", new Object[]{this, recommendEdgeResult});
        }
        if (recommendEdgeResult == null || (jSONObject = recommendEdgeResult.containers) == null || (jSONObject2 = jSONObject.getJSONObject("recommend_home_main_edge")) == null) {
            return null;
        }
        HashMap hashMap = new HashMap(50);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("base");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("delta");
        if (!(jSONObject3 == null || jSONObject3.size() == 0 || jSONObject3.getJSONArray("sections") == null)) {
            JSONArray jSONArray = jSONObject3.getJSONArray("sections");
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject m = m(jSONArray.getJSONObject(i));
                String i2 = i(jSONArray.getJSONObject(i));
                if (m != null) {
                    hashMap.put(i2, m);
                }
            }
        }
        if (!(jSONObject4 == null || jSONObject4.size() == 0 || jSONObject4.getJSONArray("sections") == null)) {
            JSONArray jSONArray2 = jSONObject4.getJSONArray("sections");
            for (int i3 = 0; i3 < jSONArray2.size(); i3++) {
                JSONObject m2 = m(jSONArray2.getJSONObject(i3));
                String i4 = i(jSONArray2.getJSONObject(i3));
                if (m2 != null) {
                    hashMap.put(i4, m2);
                }
            }
        }
        return hashMap;
    }
}
