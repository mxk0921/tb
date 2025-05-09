package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.ability.localization.Localization;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.aura.taobao.adapter.extension.performance.model.AURAPerformanceStageModel;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.network.domain.NetworkStats;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.performance.commonArgs")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class il extends et {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public yi f;

    static {
        t2o.a(81789175);
    }

    public static /* synthetic */ Object ipc$super(il ilVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -568123961) {
            super.S((kk) objArr[0]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/performance/AURAPerformanceCommonArgsExtension");
        }
    }

    public final HashMap<String, String> J0(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("212f923c", new Object[]{this, str, str2, map, map2});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!yn.a(str)) {
            hashMap.put(HttpConstant.EAGLE_EYE_ID_2, str);
        }
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        if (str2 != null) {
            hashMap.put("page", str2);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final Map<String, String> K0(kk kkVar) {
        MtopStatistics mtopStat;
        NetworkStats networkStats;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1c3c624", new Object[]{this, kkVar});
        }
        MtopResponse e = kkVar.e();
        if (e == null || (mtopStat = e.getMtopStat()) == null || (networkStats = mtopStat.getNetworkStats()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("serverRT", String.valueOf(networkStats.serverRT));
            hashMap.put("sendSize", String.valueOf(networkStats.sendSize));
            hashMap.put("recvSize", String.valueOf(networkStats.recvSize));
            hashMap.put("firstDataTime", String.valueOf(networkStats.firstDataTime));
            hashMap.put("NetworkStats汇总", networkStats.toString());
            hashMap.put("totalTime", String.valueOf(mtopStat.totalTime));
            hashMap.put("startTime", String.valueOf(mtopStat.startTime));
            hashMap.put("netSendStartTime", String.valueOf(mtopStat.netSendStartTime));
            hashMap.put("netSendEndTime", String.valueOf(mtopStat.netSendEndTime));
            hashMap.put("netTotalTime", String.valueOf(mtopStat.netTotalTime));
            hashMap.put("bxSleep", String.valueOf(mtopStat.bxSleep));
            hashMap.put("bxUI", String.valueOf(mtopStat.bxUI));
            hashMap.put("bxMainAction", String.valueOf(mtopStat.bxMainAction));
            hashMap.put("rspCbStart", String.valueOf(mtopStat.rspCbStart));
            hashMap.put("rspCbEnd", String.valueOf(mtopStat.rspCbEnd));
            hashMap.put("MtopStatistics汇总", mtopStat.toString());
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public final String L0(kk kkVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acd3252e", new Object[]{this, kkVar});
        }
        JSONObject b = kkVar.b();
        if (b == null || (jSONObject = b.getJSONObject("data")) == null || (jSONObject2 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT)) == null) {
            return null;
        }
        return jSONObject2.getString("page");
    }

    public final Map<String, String> M0(kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("99e4e358", new Object[]{this, kkVar});
        }
        ok g = kkVar.g();
        if (g == null) {
            return null;
        }
        long a2 = g.a();
        HashMap hashMap = new HashMap();
        hashMap.put(TBImageFlowMonitor.REQUEST_START_TIME, g.g() + "");
        hashMap.put("requestEndTime", g.b() + "");
        hashMap.put("requestTotalTime_thread", a2 + "");
        if (g.j() > 0) {
            a2 -= g.j();
        }
        if (g.e() > 0) {
            a2 -= g.e();
        }
        hashMap.put("requestTotalTime", a2 + "");
        hashMap.put("parseJsonTime", g.e() + "");
        hashMap.put("switchMainThreadTime", g.j() + "");
        return hashMap;
    }

    public final void N0(kk kkVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArray;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea317d4", new Object[]{this, kkVar});
            return;
        }
        JSONObject jSONObject5 = kkVar.b().getJSONObject("data");
        if (jSONObject5 != null && (jSONObject = jSONObject5.getJSONObject("data")) != null && (jSONObject2 = jSONObject.getJSONObject("submit")) != null && (jSONObject3 = jSONObject2.getJSONObject("events")) != null && (jSONArray = jSONObject3.getJSONArray("exposureItem")) != null) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject6 = (JSONObject) next;
                    if ("userTrack".equals(jSONObject6.getString("type")) && (jSONObject4 = jSONObject6.getJSONObject("fields")) != null && "Page_NewConfirmOrder_Button-submit".equals(jSONObject4.getString("arg1"))) {
                        B().update("submitExposureItemArgs", jSONObject4.getJSONObject("args"));
                    }
                }
            }
        }
    }

    @Override // tb.et
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.et, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        this.f = yiVar;
        super.onCreate(loVar, yiVar);
    }

    @Override // tb.et, tb.vbb
    public void S(kk kkVar) {
        AURAPerformanceStageModel aURAPerformanceStageModel;
        AURAPerformanceStageModel aURAPerformanceStageModel2;
        String str;
        boolean z;
        il ilVar = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de231dc7", new Object[]{ilVar, kkVar});
            return;
        }
        super.S(kkVar);
        if (kkVar.j()) {
            String a2 = ik.a(kkVar);
            Map<String, String> M0 = M0(kkVar);
            Map<String, String> K0 = K0(kkVar);
            String str2 = (String) L().g("purchaseFrom", String.class);
            String L0 = L0(kkVar);
            String str3 = (String) L().g("bucket", String.class);
            ok g = kkVar.g();
            if (g == null || !g.l()) {
                aURAPerformanceStageModel2 = null;
                aURAPerformanceStageModel = null;
            } else {
                aURAPerformanceStageModel2 = new AURAPerformanceStageModel("pareJsonDataTime");
                aURAPerformanceStageModel2.setStartMills(g.d());
                aURAPerformanceStageModel2.setEndMills(g.c());
                aURAPerformanceStageModel = new AURAPerformanceStageModel("switchThreadTime");
                aURAPerformanceStageModel.setStartMills(g.i());
                aURAPerformanceStageModel.setEndMills(g.h());
            }
            try {
                for (gcb gcbVar : ilVar.f.f(gcb.class)) {
                    HashMap<String, String> J0 = ilVar.J0(a2, L0, M0, K0);
                    if (!TextUtils.isEmpty(str2)) {
                        J0.put("purchaseFrom", str2);
                    }
                    J0.put("isI18n", Localization.o() + "");
                    if (g != null) {
                        str = String.valueOf(g.k());
                    } else {
                        str = "none";
                    }
                    J0.put("isHitMTopStreamJson", str);
                    if (!TextUtils.isEmpty(str3)) {
                        J0.put("bucket", str3);
                    }
                    if (g == null || g.f() <= 0) {
                        K0 = K0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        K0 = K0;
                        sb.append(g.f());
                        sb.append("");
                        J0.put("preRequestSaveTime", sb.toString());
                    }
                    if (aURAPerformanceStageModel2 != null) {
                        z = false;
                        gcbVar.s0(aURAPerformanceStageModel2, tk.NEXT_RPC_SERVICE_CODE, false);
                    } else {
                        z = false;
                    }
                    if (aURAPerformanceStageModel != null) {
                        gcbVar.s0(aURAPerformanceStageModel, tk.NEXT_RPC_SERVICE_CODE, z);
                    }
                    gcbVar.P(J0);
                    ilVar = this;
                    a2 = a2;
                    M0 = M0;
                }
                N0(kkVar);
            } catch (Throwable th) {
                String c = AURATraceUtil.c(th);
                ck.g().e(c);
                th.a(c);
            }
        }
    }
}
