package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetRequestParams;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.network.domain.NetworkStats;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class w5o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(487587901);
    }

    public static void a(MtopResponse mtopResponse, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c65770a", new Object[]{mtopResponse, jSONObject});
        } else if (mtopResponse != null && mtopResponse.getMtopStat() != null) {
            MtopStatistics mtopStat = mtopResponse.getMtopStat();
            Map<String, Double> b = b(mtopStat);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("request_state", (Object) b);
            jSONObject2.put("api", (Object) mtopStat.apiKey);
            if (mtopResponse.isApiSuccess()) {
                jSONObject2.put("requestStatus", (Object) "success");
            } else {
                jSONObject2.put("requestStatus", (Object) "error");
            }
            jSONObject2.put("requestErrorType", (Object) mtopResponse.getRetCode());
            jSONObject2.put("requestErrorMsg", (Object) mtopResponse.getRetMsg());
            if (jSONObject != null) {
                jSONObject2.putAll(jSONObject);
            }
            we2.a(d(jSONObject), 19999, "request_state_track", jSONObject2);
        }
    }

    public static Map<String, Double> b(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e3cd0845", new Object[]{mtopStatistics});
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("totalTime", Double.valueOf(mtopStatistics.totalTime));
            hashMap.put("networkExeTime", Double.valueOf(mtopStatistics.netTotalTime));
            hashMap.put("cacheCostTime", Double.valueOf(mtopStatistics.cacheCostTime));
            hashMap.put("cacheResponseParseTime", Double.valueOf(mtopStatistics.cacheResponseParseTime));
            hashMap.put("waitExecuteTime", Double.valueOf(mtopStatistics.waitExecuteTime));
            hashMap.put("waitCallbackTime", Double.valueOf(mtopStatistics.waitCallbackTime));
            hashMap.put("signTime", Double.valueOf(mtopStatistics.computeSignTime));
            hashMap.put("wuaTime", Double.valueOf(mtopStatistics.computeWuaTime));
            hashMap.put("miniWuaTime", Double.valueOf(mtopStatistics.computeMiniWuaTime));
            hashMap.put("buildParams2NetworkTime", Double.valueOf(mtopStatistics.buildParams2NetworkTime));
            NetworkStats networkStats = mtopStatistics.netStats;
            if (networkStats != null) {
                hashMap.put("processTime", Double.valueOf(networkStats.processTime));
                hashMap.put("firstDataTime", Double.valueOf(mtopStatistics.netStats.firstDataTime));
                hashMap.put("recDataTime", Double.valueOf(mtopStatistics.netStats.recDataTime));
                hashMap.put("oneWayTime_ANet", Double.valueOf(mtopStatistics.netStats.oneWayTime_ANet));
                hashMap.put("serverRT", Double.valueOf(mtopStatistics.netStats.serverRT));
                hashMap.put("revSize", Double.valueOf(mtopStatistics.netStats.recvSize));
                hashMap.put("dataSpeed", Double.valueOf(mtopStatistics.netStats.dataSpeed));
            }
            MtopStatistics.RbStatisticData rbStatData = mtopStatistics.getRbStatData();
            if (rbStatData != null) {
                hashMap.put("rbReqTime", Double.valueOf(rbStatData.rbReqTime));
                hashMap.put("toMainThTime", Double.valueOf(rbStatData.toMainThTime));
                hashMap.put("mtopJsonParseTime", Double.valueOf(rbStatData.jsonParseTime));
                hashMap.put("mtopReqTime", Double.valueOf(rbStatData.mtopReqTime));
            }
        } catch (Exception e) {
            ugh.d("RequestTrack", "getMeasure error", e);
        }
        return hashMap;
    }

    public static String d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb3c97a7", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return we2.f30653a;
        }
        String string = jSONObject.getString("containerId");
        if (TextUtils.isEmpty(string)) {
            return we2.f30653a;
        }
        xn4 c = xn4.c(string);
        if (c == null || TextUtils.isEmpty(c.c)) {
            return we2.f30653a;
        }
        return c.c;
    }

    public static JSONObject c(AwesomeGetRequestParams awesomeGetRequestParams) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("207b23bf", new Object[]{awesomeGetRequestParams});
        }
        if (awesomeGetRequestParams == null) {
            return null;
        }
        Set<String> keySet = awesomeGetRequestParams.getContainerParams().keySet();
        Iterator<String> it = keySet.iterator();
        String str2 = "";
        if (it.hasNext()) {
            str = it.next();
            AwesomeGetContainerParams awesomeGetContainerParams = awesomeGetRequestParams.getContainerParams().get(str);
            if (awesomeGetContainerParams != null) {
                str2 = awesomeGetContainerParams.getRequestType();
            }
        } else {
            str = str2;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestType", (Object) str2);
        jSONObject.put("containerId", (Object) str);
        if (keySet.size() > 1) {
            jSONObject.put("containerIds", (Object) keySet);
        }
        return jSONObject;
    }
}
