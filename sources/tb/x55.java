package tb;

import android.content.Context;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.performence.model.UltronPerformanceStageModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886281);
    }

    public static void a(z9v z9vVar, String str, String str2, long j, long j2, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c77a02", new Object[]{z9vVar, str, str2, new Long(j), new Long(j2), new Boolean(z), map});
            return;
        }
        UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel(str);
        ultronPerformanceStageModel.setStartMills(j);
        ultronPerformanceStageModel.setEndMills(j2);
        ultronPerformanceStageModel.setArgs(map);
        ultronPerformanceStageModel.setFreeStage(z);
        z9vVar.h(ultronPerformanceStageModel, str2, false);
    }

    public static void b(z9v z9vVar, vpq vpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772f3057", new Object[]{z9vVar, vpqVar});
        } else if (vpqVar != null) {
            a(z9vVar, "nextRPCParseJsonStage", "apmClientNetwork", vpqVar.b(), vpqVar.a(), true, null);
            a(z9vVar, "nextRPCSwitchThreadStage", "apmClientNetwork", vpqVar.e(), vpqVar.d(), true, null);
            if (vpqVar.f()) {
                z9vVar.e("isHitMTopStreamJson", "true");
            }
        }
    }

    public static void d(Context context, boolean z, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac6a948", new Object[]{context, new Boolean(z), mtopResponse});
        } else if (z) {
            try {
                z9v.u(context).t(mtopResponse.getApi(), true, null);
            } catch (Exception unused) {
            }
        }
    }

    public static void e(Context context, MtopResponse mtopResponse, JSONObject jSONObject, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("120c66b3", new Object[]{context, mtopResponse, jSONObject, new Long(j), new Long(j2)});
        } else {
            f(context, mtopResponse, jSONObject, j, j2, null);
        }
    }

    public static void h(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd67da72", new Object[]{context, mtopResponse});
            return;
        }
        try {
            z9v.u(context).D("apmClientAfterNetworkLogicProcess", null);
        } catch (Exception unused) {
        }
    }

    public static void i(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf8e438", new Object[]{context, mtopResponse});
            return;
        }
        try {
            z9v.u(context).D("apmClientUltronProcess", "apmClientAfterNetworkLogicProcess");
        } catch (Exception e) {
            UnifyLog.e("DMRequesterStagePerformance", "rightBeforeDataParse exception:" + e.getMessage());
        }
    }

    public static void c(z9v z9vVar, MtopResponse mtopResponse) {
        Map<String, List<String>> headerFields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36ff568", new Object[]{z9vVar, mtopResponse});
        } else if (mtopResponse != null && (headerFields = mtopResponse.getHeaderFields()) != null) {
            List<String> list = headerFields.get(HttpConstant.EAGLE_EYE_ID_2);
            if (list != null && !list.isEmpty()) {
                z9vVar.e(HttpConstant.EAGLE_EYE_ID_2, list.get(0));
            }
            List<String> list2 = headerFields.get(HttpHeaderConstant.X_BIN_LENGTH);
            if (list2 != null && !list2.isEmpty()) {
                z9vVar.e("downloadBodyDataSize", list2.get(0));
            }
            List<String> list3 = headerFields.get("x-used-stream");
            if (list3 != null && !list3.isEmpty()) {
                z9vVar.e("streamMode", list3.get(0));
            }
        }
    }

    public static void g(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97adb8d", new Object[]{context, mtopResponse});
        } else if (mtopResponse != null) {
            try {
                z9v.u(context).t(mtopResponse.getApi(), true, null);
            } catch (Exception e) {
                UnifyLog.e("DMRequesterStagePerformance", "rightAfterRequestError exception:" + e.getMessage());
            }
        }
    }

    public static void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c5ae44d", new Object[]{context});
            return;
        }
        try {
            z9v.u(context).B("apmClientBeforeNetworkLogicProcess", false, null);
        } catch (Exception e) {
            UnifyLog.e("DMRequesterStagePerformance", "rightBeforeRequest exception:" + e.getMessage());
        }
    }

    public static void f(Context context, MtopResponse mtopResponse, JSONObject jSONObject, long j, long j2, vpq vpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a53d7d", new Object[]{context, mtopResponse, jSONObject, new Long(j), new Long(j2), vpqVar});
            return;
        }
        try {
            z9v u = z9v.u(context);
            if (u.j()) {
                c(u, mtopResponse);
                er0 er0Var = new er0(jSONObject);
                Map<String, String> b = er0Var.b();
                if (b != null) {
                    u.f(b);
                }
                u.B("apmClientUltronProcess", false, null);
                UltronPerformanceStageModel ultronPerformanceStageModel = new UltronPerformanceStageModel("apmClientNetwork");
                ultronPerformanceStageModel.setStartMills(j);
                ultronPerformanceStageModel.setEndMills(j2);
                u.h(ultronPerformanceStageModel, null, false);
                b(u, vpqVar);
                List<fr0> d = er0Var.d();
                if (!(d == null || d.isEmpty())) {
                    for (fr0 fr0Var : d) {
                        Map<String, String> a2 = fr0Var.a();
                        if (a2 == null) {
                            a2 = new HashMap<>();
                        }
                        a(u, fr0Var.c(), "apmClientNetwork", 0L, fr0Var.b() - fr0Var.d(), true, a2);
                    }
                }
            }
        } catch (Exception e) {
            xh8 c = xh8.a("Ultron").c("DMRequesterStagePerformance");
            f9v.q(c.message("rightAfterDataParse exception:" + e.getMessage()));
        }
    }
}
