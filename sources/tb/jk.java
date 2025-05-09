package tb;

import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_API = "apiName";
    public static final String KEY_EAGLE_EYE_TRACE_ID = "eagleEyeTraceId";
    public static final String KEY_FULL_TRACE_ID = "fullTraceId";
    public static final String KEY_MAPPING_CODE = "mappingCode";
    public static final String KEY_REQUEST_PARAMS = "requestParams";
    public static final String KEY_RESPONSE_STATUS_CODE = "responseStatusCode";
    public static final String KEY_RET_CODE = "retCode";
    public static final String KEY_RET_MSG = "retMsg";
    public static final String KEY_VERSION = "apiVersion";

    static {
        t2o.a(80740438);
    }

    public final void a(AURANextRPCEndpoint aURANextRPCEndpoint, kk kkVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b55222", new Object[]{this, aURANextRPCEndpoint, kkVar, map});
            return;
        }
        if (aURANextRPCEndpoint != null) {
            map.putAll(b(aURANextRPCEndpoint));
        }
        if (kkVar != null && kkVar.e() != null) {
            map.putAll(c(kkVar.e()));
        }
    }

    public final Map<String, Object> b(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5d408e86", new Object[]{this, aURANextRPCEndpoint});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("apiName", aURANextRPCEndpoint.getApi());
        hashMap.put("apiVersion", aURANextRPCEndpoint.getVersion());
        hashMap.put("requestParams", aURANextRPCEndpoint.getDataParams());
        return hashMap;
    }

    public final Map<String, String> c(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("27e03a46", new Object[]{this, mtopResponse});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_RET_CODE, mtopResponse.getRetCode());
        hashMap.put(KEY_MAPPING_CODE, mtopResponse.getMappingCode());
        hashMap.put(KEY_RET_MSG, mtopResponse.getRetMsg());
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat != null) {
            hashMap.put(KEY_RESPONSE_STATUS_CODE, String.valueOf(mtopStat.statusCode));
            hashMap.put(KEY_FULL_TRACE_ID, mtopStat.fullTraceId);
            hashMap.put("eagleEyeTraceId", mtopStat.eagleEyeTraceId);
        }
        return hashMap;
    }

    public void d(pt<AURAParseIO> ptVar, AURANextRPCIO aURANextRPCIO, kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("558bd1d1", new Object[]{this, ptVar, aURANextRPCIO, kkVar});
            return;
        }
        mi miVar = new mi(0, "AURANextRPCServiceDomain", "-2000_REQUEST_EXCEPTION", "Mtop mainResponse failed. see extParams.NextRPCRemoteResponse NextRPCRemoteResponse");
        HashMap hashMap = new HashMap();
        if (kkVar != null) {
            hashMap.put("NextRPCRemoteResponse", kkVar);
        }
        a(aURANextRPCIO.nextRPCEndpoint, kkVar, hashMap);
        miVar.i(hashMap);
        ptVar.b(miVar);
    }
}
