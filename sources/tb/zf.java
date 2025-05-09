package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import tb.sj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32717a;
    public JSONObject b;
    public AURAGlobalData c;
    public final boolean d = xk.a("enableNewJSTracker", true);

    static {
        t2o.a(81789164);
    }

    public zf(String str) {
        this.f32717a = str;
    }

    public final void a(Map<String, String> map, mi miVar) {
        kk kkVar;
        MtopStatistics mtopStat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80b2482", new Object[]{this, map, miVar});
            return;
        }
        AURAGlobalData aURAGlobalData = this.c;
        if (!(aURAGlobalData == null || (kkVar = (kk) aURAGlobalData.get("aura_data_response", kk.class)) == null || (mtopStat = kkVar.e().getMtopStat()) == null)) {
            map.put("eagleEyeTraceId", mtopStat.eagleEyeTraceId);
        }
        Map<String, Object> d = miVar.d();
        if (d != null) {
            for (String str : d.keySet()) {
                if (d.get(str) instanceof String) {
                    map.put(str, (String) d.get(str));
                }
            }
        }
    }

    public void b(mi miVar) {
        String str;
        HashMap hashMap;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3914f16e", new Object[]{this, miVar});
        } else if (this.d) {
            i(miVar);
        } else {
            int g = g(miVar.f(), this.f32717a, 100);
            if (g != 0 && sj.e(g)) {
                String c = miVar.c();
                String b = miVar.b();
                String str3 = c + "_" + miVar.f() + "_" + b;
                String e = miVar.e();
                HashMap hashMap2 = new HashMap();
                if ("AURANextRPCServiceDomain".equals(miVar.c())) {
                    hashMap = d(miVar);
                    str = c(miVar);
                    str2 = "mtop_perf";
                } else {
                    hashMap = hashMap2;
                    str2 = "error";
                    str = str3;
                }
                a(hashMap, miVar);
                String str4 = "taobao." + this.f32717a + ".monitor";
                HashMap hashMap3 = new HashMap();
                hashMap3.put("errorMsg", e);
                j(hashMap, pg1.ATOM_stack, sj.c(hashMap3.toString()));
                sj.f("AURA监控", str2, "26900-tracker", str4, str3, String.valueOf(g), hashMap, str);
            }
        }
    }

    public final String c(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92904687", new Object[]{this, miVar});
        }
        MtopResponse f = f(miVar);
        if (f == null) {
            return null;
        }
        return f.getRetCode();
    }

    public final Map<String, String> d(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc4f3796", new Object[]{this, miVar});
        }
        MtopResponse f = f(miVar);
        if (f == null) {
            return null;
        }
        Map<String, Object> d = miVar.d();
        HashMap hashMap = new HashMap();
        try {
            j(hashMap, "api", f.getApi());
            j(hashMap, "success", String.valueOf(f.isApiSuccess()));
            j(hashMap, "headers", sj.c(tj.c(f.getHeaderFields())));
            j(hashMap, "traceId", sj.c((String) fk.b(d, "eagleEyeTraceId", String.class, null)));
            j(hashMap, "status", f.getRetCode());
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public final kk e(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kk) ipChange.ipc$dispatch("fcacb458", new Object[]{this, miVar});
        }
        if (this.c == null) {
            return null;
        }
        kk kkVar = (kk) fk.b(miVar.d(), "NextRPCRemoteResponse", kk.class, null);
        if (kkVar == null) {
            return (kk) this.c.get("aura_data_response", kk.class);
        }
        return kkVar;
    }

    public final MtopResponse f(mi miVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("6fb427c8", new Object[]{this, miVar});
        }
        kk kkVar = (kk) fk.b(miVar.d(), "NextRPCRemoteResponse", kk.class, null);
        if (kkVar == null) {
            return null;
        }
        return kkVar.e();
    }

    public final int g(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92501dfc", new Object[]{this, new Integer(i), str, new Integer(i2)})).intValue();
        }
        if (i == 1) {
            return 100;
        }
        JSONObject h = h();
        if (h == null) {
            return i2;
        }
        try {
            return Integer.parseInt(h.getString(str));
        } catch (Throwable unused) {
            return i2;
        }
    }

    public final void i(mi miVar) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801f2b7b", new Object[]{this, miVar});
            return;
        }
        kk e = e(miVar);
        String a2 = ik.a(e);
        if (!"AURANextRPCServiceDomain".equals(miVar.c())) {
            String str = miVar.b() + "_" + miVar.e();
            if (miVar.f() == 0) {
                sj.g(sj.b.a("abortErrorMonitor").tag(str).message(a2).indicator("c1", this.f32717a).sampling(1.0f));
            } else {
                sj.g(sj.b.a("loggerErrorMonitor").tag(str).message(a2).indicator("c1", this.f32717a).sampling(0.001f));
            }
        } else if (e != null) {
            ok g = e.g();
            p5j n = sj.c.o(this.f32717a + "#" + e.a(), false).n(a2);
            if (g != null) {
                j = g.a();
            } else {
                j = 0;
            }
            sj.h(n.m(j).message(e.h()).sampling(1.0f));
        }
    }

    public final void j(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4747018", new Object[]{this, map, str, str2});
        } else if (map != null && str != null && str2 != null) {
            map.put(str, str2);
        }
    }

    public void k(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f17be9", new Object[]{this, aURAGlobalData});
        } else {
            this.c = aURAGlobalData;
        }
    }

    public final JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9ae04326", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject a2 = tj.a(fj.b("auraMonitorSamplingConfig", "{\n\t\"purchase\": \"1\",\n\t\"confirmOrder\": \"1\",\n\t\"tbwaitpay\": \"1\",\n\t\"tbwaitpayfloat\": \"1\"\n\t\"tmgDeliveryConfirmOrder\": \"1\"\n\t\"tmgDeliveryPurchase\": \"1\"\n}", true));
        this.b = a2;
        return a2;
    }
}
