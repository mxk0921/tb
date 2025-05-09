package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.AceStrategy;
import com.taobao.android.searchbaseframe.ace.model.AceStrategySummary;
import com.taobao.android.searchbaseframe.ace.model.AceSubStrategy;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.ace.model.MTopModel;
import com.taobao.android.searchbaseframe.ace.utils.AceEntryUtils;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p80 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACE_PARAMS_FLAG = "__ACE_PARAMS_FLAG__";
    public static final String ACE_REPORT_FLAG = "__ACE_REPORT_FLAG__";

    /* renamed from: a  reason: collision with root package name */
    public static volatile AceStrategy f25928a;
    public static final Map<String, AceSubStrategy> b = new ConcurrentHashMap();

    static {
        t2o.a(993001576);
    }

    public static boolean a(yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd1949dc", new Object[]{ykoVar})).booleanValue();
        }
        if (ykoVar != null && ykoVar.e().a() && t70.c().h()) {
            return true;
        }
        return false;
    }

    public static void b(yko ykoVar, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d95d8e", new Object[]{ykoVar, str, str2, jSONObject});
        } else if (a(ykoVar)) {
            try {
                HashMap hashMap = new HashMap();
                Uri parse = Uri.parse(str);
                for (String str3 : parse.getQuery().split("&")) {
                    String[] split = str3.split("=");
                    if (split.length >= 2) {
                        hashMap.put(split[0], split[1]);
                    }
                }
                String uri = parse.buildUpon().clearQuery().build().toString();
                MTopModel mTopModel = new MTopModel();
                mTopModel.setApiName(uri);
                mTopModel.setParams((JSONObject) JSON.toJSON(hashMap));
                mTopModel.setResponse(jSONObject);
                mTopModel.setStatus("200");
                mTopModel.setRequestAlias(str2);
                g(mTopModel);
            } catch (Throwable unused) {
            }
        }
    }

    public static void c(yko ykoVar, String str, r7b r7bVar, nsj nsjVar) {
        Map map;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf629e4", new Object[]{ykoVar, str, r7bVar, nsjVar});
        } else if (ykoVar.e().a() && t70.c().h()) {
            try {
                r7bVar.getClass();
                if ("POST".equals(null)) {
                    str2 = (String) r7bVar.f16602a;
                    map = (Map) r7bVar.b;
                } else {
                    HashMap hashMap = new HashMap();
                    Uri parse = Uri.parse((String) r7bVar.f16602a);
                    for (String str3 : parse.getQuery().split("&")) {
                        String[] split = str3.split("=");
                        if (split.length >= 2) {
                            hashMap.put(split[0], split[1]);
                        }
                    }
                    String uri = parse.buildUpon().clearQuery().build().toString();
                    map = hashMap;
                    str2 = uri;
                }
                MTopModel mTopModel = new MTopModel();
                mTopModel.setApiName(str2);
                mTopModel.setParams((JSONObject) JSON.toJSON(map));
                mTopModel.setResponse(JSON.parseObject(new String(nsjVar.a())));
                nsjVar.f().remove(null);
                mTopModel.setResponseHeaders((JSONObject) JSON.toJSON(nsjVar.f()));
                mTopModel.setStatus("200");
                mTopModel.setRequestAlias(str);
                g(mTopModel);
            } catch (Throwable unused) {
            }
        }
    }

    public static void e(yko ykoVar, String str, MtopRequest mtopRequest, m7j m7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2924ebd6", new Object[]{ykoVar, str, mtopRequest, m7jVar});
        } else {
            f(ykoVar, str, mtopRequest, m7jVar, null);
        }
    }

    public static void f(yko ykoVar, String str, MtopRequest mtopRequest, m7j m7jVar, MtopBusiness mtopBusiness) {
        byte[] bArr;
        h3o h3oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171a4fb4", new Object[]{ykoVar, str, mtopRequest, m7jVar, mtopBusiness});
        } else if ((a(ykoVar) || AceEntryUtils.INSTANCE.c()) && (bArr = m7jVar.e) != null) {
            MTopModel mTopModel = new MTopModel();
            mTopModel.setApiName(mtopRequest.getApiName());
            mTopModel.setParams(JSON.parseObject(mtopRequest.getData()));
            mTopModel.setResponse(JSON.parseObject(new String(bArr)));
            mTopModel.setStatus(String.valueOf(m7jVar.f23820a));
            JSONObject jSONObject = (JSONObject) JSON.toJSON(m7jVar.g);
            jSONObject.remove(null);
            mTopModel.setResponseHeaders(jSONObject);
            if (!(mtopBusiness == null || mtopBusiness.getMtopContext() == null || (h3oVar = mtopBusiness.getMtopContext().k) == null)) {
                mTopModel.setRequestHeaders((JSONObject) JSON.toJSON(h3oVar.c));
            }
            mTopModel.setRequestAlias(str);
            if (AceEntryUtils.INSTANCE.c()) {
                try {
                    KMPJsonObject kMPJsonObject = new KMPJsonObject();
                    kMPJsonObject.put("hookType", (Object) "mtop");
                    kMPJsonObject.put("data", JSON.toJSON(mTopModel));
                    x70.INSTANCE.j().a("monitor.data", kMPJsonObject);
                } catch (Throwable unused) {
                }
            } else {
                AceSubStrategy l = l(str);
                if (l == null || "strategy".equals(l.getStrategyType())) {
                    g(mTopModel);
                    return;
                }
                JSONObject s = s(mTopModel);
                if (s != null) {
                    m7jVar.e = s.toString().getBytes();
                }
            }
        }
    }

    public static void g(MTopModel mTopModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688cd382", new Object[]{mTopModel});
            return;
        }
        JsonRpcRequest obtainRequest = JsonRpcRequest.obtainRequest("monitor.data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hookType", (Object) "mtop");
        jSONObject.put("data", JSON.toJSON(mTopModel));
        obtainRequest.setParams(jSONObject);
        t70.c().k(obtainRequest);
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362098ae", new Object[0]);
            return;
        }
        f25928a = null;
        ((ConcurrentHashMap) b).clear();
        t70.c().k(j());
    }

    public static List<AceStrategySummary> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9d2cd54a", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        if (f25928a != null) {
            arrayList.add(AceStrategySummary.strategy(f25928a.getId(), f25928a.getName(), f25928a.getParams()));
        } else {
            for (Map.Entry entry : ((ConcurrentHashMap) b).entrySet()) {
                arrayList.add(AceStrategySummary.mock(((AceSubStrategy) entry.getValue()).getId(), (String) entry.getKey()));
            }
        }
        return arrayList;
    }

    public static JsonRpcRequest j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonRpcRequest) ipChange.ipc$dispatch("dcba3223", new Object[0]);
        }
        List<AceStrategySummary> i = i();
        JsonRpcRequest obtainMessage = JsonRpcRequest.obtainMessage("notify.strategy");
        obtainMessage.setParams((JSON) JSON.toJSON(i));
        return obtainMessage;
    }

    public static String k(yko ykoVar, String str) {
        AceSubStrategy l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7df09ba6", new Object[]{ykoVar, str});
        }
        if (a(ykoVar) && (l = l(str)) != null) {
            return l.getUrl();
        }
        return "";
    }

    public static AceSubStrategy l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AceSubStrategy) ipChange.ipc$dispatch("f87e578f", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        if (f25928a != null) {
            return f25928a.getSubStrategy(str);
        }
        return (AceSubStrategy) ((ConcurrentHashMap) b).get(str);
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad404d61", new Object[0]);
            return;
        }
        f25928a = null;
        t70.c().k(j());
    }

    public static void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e351883f", new Object[]{str});
            return;
        }
        ((ConcurrentHashMap) b).remove(str);
        t70.c().k(j());
    }

    public static void o(yko ykoVar, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39bc290b", new Object[]{ykoVar, map, str});
        } else {
            p(ykoVar, map, str, true);
        }
    }

    public static void p(yko ykoVar, Map<String, String> map, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc9ab29", new Object[]{ykoVar, map, str, new Boolean(z)});
        } else if (a(ykoVar)) {
            map.put(ACE_PARAMS_FLAG, "true");
            if (z) {
                map.put(ACE_REPORT_FLAG, "true");
            }
            if (f25928a != null) {
                map.putAll(f25928a.getParams());
            }
            AceSubStrategy l = l(str);
            if (l != null) {
                map.put("aceId", l.getId());
                Map<String, String> requestParams = l.getRequestParams();
                if (requestParams != null) {
                    map.putAll(requestParams);
                }
            }
        }
    }

    public static void q(String str, AceSubStrategy aceSubStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fecada", new Object[]{str, aceSubStrategy});
            return;
        }
        ((ConcurrentHashMap) b).put(str, aceSubStrategy);
        f25928a = null;
        t70.c().k(j());
    }

    public static void r(AceStrategy aceStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e2e3ef", new Object[]{aceStrategy});
            return;
        }
        f25928a = aceStrategy;
        ((ConcurrentHashMap) b).clear();
        t70.c().k(j());
    }

    public static JSONObject s(MTopModel mTopModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3dff1d77", new Object[]{mTopModel});
        }
        JsonRpcRequest obtainRequest = JsonRpcRequest.obtainRequest("getAceMockResult");
        obtainRequest.setParams((JSON) JSON.toJSON(mTopModel));
        try {
            return t70.c().l(obtainRequest).get(3000L, TimeUnit.MILLISECONDS).getResult().getJSONObject("data");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(yko ykoVar, String str, MtopRequest mtopRequest, MtopResponse mtopResponse, MtopBusiness mtopBusiness) {
        h3o h3oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df8443e2", new Object[]{ykoVar, str, mtopRequest, mtopResponse, mtopBusiness});
        } else if (a(ykoVar)) {
            byte[] bytedata = mtopResponse.getBytedata();
            MTopModel mTopModel = new MTopModel();
            mTopModel.setApiName(mtopRequest.getApiName());
            mTopModel.setParams(JSON.parseObject(mtopRequest.getData()));
            if (bytedata != null) {
                mTopModel.setResponse(JSON.parseObject(new String(bytedata)));
            } else {
                mTopModel.setResponse(new JSONObject());
            }
            mTopModel.setStatus(String.valueOf(mtopResponse.getResponseCode()));
            JSONObject jSONObject = (JSONObject) JSON.toJSON(mtopResponse.getHeaderFields());
            if (jSONObject != null) {
                jSONObject.remove(null);
                mTopModel.setResponseHeaders(jSONObject);
            }
            if (!(mtopBusiness == null || mtopBusiness.getMtopContext() == null || (h3oVar = mtopBusiness.getMtopContext().k) == null)) {
                mTopModel.setRequestHeaders((JSONObject) JSON.toJSON(h3oVar.c));
            }
            mTopModel.setRequestAlias(str);
            AceSubStrategy l = l(str);
            if (l == null || "strategy".equals(l.getStrategyType())) {
                g(mTopModel);
                return;
            }
            JSONObject s = s(mTopModel);
            if (s != null) {
                if (mtopResponse.getOriginFastJsonObject() != null) {
                    mtopResponse.setOriginFastJsonObject(s);
                }
                mtopResponse.setBytedata(s.toString().getBytes());
                JSONArray jSONArray = s.getJSONArray(rb.RESULT_KEY);
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    String[] split = jSONArray.getString(0).split("::");
                    if (split.length >= 2) {
                        mtopResponse.setRetCode(split[0]);
                        mtopResponse.setRetMsg(split[1]);
                    }
                }
            }
        }
    }
}
