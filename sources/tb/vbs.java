package tb;

import com.alibaba.android.aura.taobao.adapter.pageevent.AURAPageEventStrategy;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.model.RateInfoV2;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.themis.inside.adapter.TLogAdapterImpl;
import com.taobao.themis.kernel.adapter.IMonitorAdapter;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.List;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class vbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vbs INSTANCE = new vbs();

    static {
        t2o.a(839909845);
    }

    @JvmStatic
    public static final void a(bbs bbsVar, String str, boolean z, long j, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd62ae8", new Object[]{bbsVar, str, new Boolean(z), new Long(j), str2, str3});
            return;
        }
        ckf.g(str, "apiName");
        if (bbsVar != null) {
            JSONObject w = w(bbsVar);
            w.put((JSONObject) "apiName", str);
            w.put((JSONObject) "status", (String) Boolean.valueOf(z));
            if (str2 == null) {
                str2 = "";
            }
            w.put((JSONObject) "errorCode", str2);
            if (str3 == null) {
                str3 = "";
            }
            w.put((JSONObject) "errorMsg", str3);
            w.put((JSONObject) "timeCost", (String) Long.valueOf(j));
            IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
            if (iMonitorAdapter != null) {
                iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "API", w, new JSONObject());
            }
        }
    }

    @JvmStatic
    public static final void b(String str, String str2, String str3, double d, double d2, double d3, List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95cdb4d6", new Object[]{str, str2, str3, new Double(d), new Double(d2), new Double(d3), list, list2});
            return;
        }
        ckf.g(str, "appId");
        ckf.g(str2, "containerType");
        ckf.g(str3, "appDeveloperVersion");
        ckf.g(list, "latency");
        ckf.g(list2, AURAPageEventStrategy.FREQUENCY);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "tmsAppId", str);
        jSONObject.put((JSONObject) "containerType", str2);
        jSONObject.put((JSONObject) "gmVersion", str3);
        jSONObject.put((JSONObject) "latency", (String) list);
        jSONObject.put((JSONObject) AURAPageEventStrategy.FREQUENCY, (String) list2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "api_quantile", (String) Double.valueOf(d));
        jSONObject2.put((JSONObject) "api_min", (String) Double.valueOf(d2));
        jSONObject2.put((JSONObject) "api_max", (String) Double.valueOf(d3));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_api_stas_monitor", jSONObject, jSONObject2);
        }
    }

    @JvmStatic
    public static final void c(bbs bbsVar, String str, String str2, boolean z, double d, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("106349f1", new Object[]{bbsVar, str, str2, new Boolean(z), new Double(d), str3, str4});
            return;
        }
        ckf.g(str, "apiName");
        ckf.g(str2, "type");
        if (bbsVar != null) {
            JSONObject w = w(bbsVar);
            w.put((JSONObject) "apiName", str);
            w.put((JSONObject) "type", str2);
            w.put((JSONObject) "status", (String) Boolean.valueOf(z));
            w.put((JSONObject) "timeCost", (String) Double.valueOf(d));
            if (str3 == null) {
                str3 = "";
            }
            w.put((JSONObject) "errorCode", str3);
            if (str4 == null) {
                str4 = "";
            }
            w.put((JSONObject) "errorMsg", str4);
            IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
            if (iMonitorAdapter != null) {
                iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "Cloud", w, new JSONObject());
            }
        }
    }

    @JvmStatic
    public static final void d(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b773d4c", new Object[]{str, str2, jSONObject});
            return;
        }
        ckf.g(str, "monitorPoint");
        ckf.g(str2, "errorMsg");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "errorMsg", str2);
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, str, jSONObject2, new JSONObject());
        }
    }

    @JvmStatic
    public static final void e(bbs bbsVar, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8534b0", new Object[]{bbsVar, str, str2, jSONObject});
            return;
        }
        ckf.g(str, "monitorPoint");
        ckf.g(str2, "errorMsg");
        if (bbsVar != null) {
            JSONObject w = w(bbsVar);
            w.put((JSONObject) "errorMsg", str2);
            if (jSONObject != null) {
                w.putAll(jSONObject);
            }
            IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
            if (iMonitorAdapter != null) {
                iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, str, w, new JSONObject());
            }
        }
    }

    public static /* synthetic */ void f(String str, String str2, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d92cd670", new Object[]{str, str2, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        d(str, str2, jSONObject);
    }

    @JvmStatic
    public static final void g(bbs bbsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb6328d", new Object[]{bbsVar, str});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "encoding");
        JSONObject w = w(bbsVar);
        w.put((JSONObject) "encoding", str);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "file_encoding_type", w, new JSONObject());
        }
    }

    @JvmStatic
    public static final void h(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cae6f6", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        ckf.g(str, "oriUrl");
        ckf.g(str2, "traceId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "oriUrl", str);
        jSONObject.put((JSONObject) "traceId", str2);
        jSONObject.put((JSONObject) "downgradeActivity", (String) Boolean.valueOf(z));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_fragment_create", jSONObject, new JSONObject());
        }
    }

    public static /* synthetic */ void i(String str, String str2, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a38286", new Object[]{str, str2, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        h(str, str2, z);
    }

    @JvmStatic
    public static final void j(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c673c8", new Object[]{str, str2, str3});
            return;
        }
        ckf.g(str, "appId");
        ckf.g(str2, "appDeveloperVersion");
        ckf.g(str3, pg1.ATOM_stack);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "tmsAppId", str);
        jSONObject.put((JSONObject) pg1.ATOM_stack, str3);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_jnr_monitor", jSONObject, new JSONObject());
        }
    }

    @JvmStatic
    public static final void k(bbs bbsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7a2c7f", new Object[]{bbsVar, str});
            return;
        }
        ckf.g(str, "errorMsg");
        if (bbsVar != null) {
            JSONObject w = w(bbsVar);
            w.put((JSONObject) "errorMsg", str);
            IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
            if (iMonitorAdapter != null) {
                iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "JSError", w, new JSONObject());
            }
        }
    }

    @JvmStatic
    public static final void l(String str, String str2, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f77b24bd", new Object[]{str, str2, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ckf.g(str, "appId");
        ckf.g(str2, "appDeveloperVersion");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "tmsAppId", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "heap_size", (String) Integer.valueOf(i));
        jSONObject2.put((JSONObject) "max_heap_size", (String) Integer.valueOf(i2));
        jSONObject2.put((JSONObject) "memory_occupy", (String) Integer.valueOf(i3));
        jSONObject2.put((JSONObject) "max_memory_occupy", (String) Integer.valueOf(i4));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_js_memory_monitor", jSONObject, jSONObject2);
        }
    }

    @JvmStatic
    public static final void m(String str, String str2, int i, int i2, int i3, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce792be", new Object[]{str, str2, new Integer(i), new Integer(i2), new Integer(i3), str3});
            return;
        }
        ckf.g(str, "appId");
        ckf.g(str2, "appDeveloperVersion");
        ckf.g(str3, pg1.ATOM_stack);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "tmsAppId", str);
        jSONObject.put((JSONObject) pg1.ATOM_stack, str3);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "current_size", (String) Integer.valueOf(i));
        jSONObject2.put((JSONObject) "target_size", (String) Integer.valueOf(i2));
        jSONObject2.put((JSONObject) "limit", (String) Integer.valueOf(i3));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_js_oom_monitor", jSONObject, jSONObject2);
        }
    }

    @JvmStatic
    public static final void n(String str, String str2, int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7195205", new Object[]{str, str2, new Integer(i), new Double(d)});
            return;
        }
        ckf.g(str, "appId");
        ckf.g(str2, "appDeveloperVersion");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "tmsAppId", str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "jank_count", (String) Integer.valueOf(i));
        jSONObject2.put((JSONObject) "rate", (String) Double.valueOf(d));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_jank_monitor", jSONObject, jSONObject2);
        }
    }

    @JvmStatic
    public static final void o(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70ba686", new Object[]{str, str2, str3});
            return;
        }
        ckf.g(str, "appId");
        ckf.g(str2, "appDeveloperVersion");
        ckf.g(str3, pg1.ATOM_stack);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "tmsAppId", str);
        jSONObject.put((JSONObject) pg1.ATOM_stack, str3);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_js_large_memory_monitor", jSONObject, new JSONObject());
        }
    }

    @JvmStatic
    public static final void p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1543e44c", new Object[]{str, str2});
            return;
        }
        ckf.g(str, "oriUrl");
        ckf.g(str2, "traceId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "oriUrl", str);
        jSONObject.put((JSONObject) "traceId", str2);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_launch_by_fragment", jSONObject, new JSONObject());
        }
    }

    @JvmStatic
    public static final void q(bbs bbsVar, String str, boolean z, double d, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47eb0a6", new Object[]{bbsVar, str, new Boolean(z), new Double(d), str2, str3});
            return;
        }
        ckf.g(str, "apiName");
        if (bbsVar != null) {
            JSONObject w = w(bbsVar);
            w.put((JSONObject) "apiName", str);
            w.put((JSONObject) "status", (String) Boolean.valueOf(z));
            w.put((JSONObject) "timeCost", (String) Double.valueOf(d));
            if (str2 == null) {
                str2 = "";
            }
            w.put((JSONObject) "errorCode", str2);
            if (str3 == null) {
                str3 = "";
            }
            w.put((JSONObject) "errorMsg", str3);
            IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
            if (iMonitorAdapter != null) {
                iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "Mtop", w, new JSONObject());
            }
        }
    }

    @JvmStatic
    public static final void r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c72253", new Object[]{str, str2});
            return;
        }
        ckf.g(str, "appId");
        ckf.g(str2, TBImageFlowMonitor.ERROR_ORIGIN_URL);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "appId", str);
        jSONObject.put((JSONObject) TBImageFlowMonitor.ERROR_ORIGIN_URL, str2);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_pha_router", jSONObject, new JSONObject());
        }
    }

    @JvmStatic
    public static final void s(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37983106", new Object[]{bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        JSONObject w = w(bbsVar);
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_pub_hide_title_bar", w, new JSONObject());
        }
    }

    @JvmStatic
    public static final void t(String str, String str2, String str3, String str4, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c996602", new Object[]{str, str2, str3, str4, new Double(d)});
            return;
        }
        ckf.g(str, "appId");
        ckf.g(str2, "containerType");
        ckf.g(str3, "appDeveloperVersion");
        ckf.g(str4, "apiName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "tmsAppId", str);
        jSONObject.put((JSONObject) "containerType", str2);
        jSONObject.put((JSONObject) "gmVersion", str3);
        jSONObject.put((JSONObject) "apiName", str4);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "latency", (String) Double.valueOf(d));
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_single_api_stas_monitor", jSONObject, jSONObject2);
        }
    }

    @JvmStatic
    public static final void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c59d943d", new Object[]{str});
            return;
        }
        ckf.g(str, "url");
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "url", str);
            xhv xhvVar = xhv.INSTANCE;
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "themis_std_pop_error_url", jSONObject, new JSONObject());
        }
    }

    @JvmStatic
    public static final void v(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f528053", new Object[]{jSONObject});
            return;
        }
        ckf.g(jSONObject, "dimensions");
        IMonitorAdapter iMonitorAdapter = (IMonitorAdapter) p8s.b(IMonitorAdapter.class);
        if (iMonitorAdapter != null) {
            iMonitorAdapter.trackStat(TLogAdapterImpl.TLOG_MODULE, "commitSubPageCreateViewException", jSONObject, new JSONObject());
        }
    }

    @JvmStatic
    public static final JSONObject w(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b2fee691", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "instance");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "tmsAppId", bbsVar.L());
        jSONObject.put((JSONObject) "uniappId", bbsVar.d0());
        jSONObject.put((JSONObject) "tmsAppVersion", r8s.i(bbsVar));
        jSONObject.put((JSONObject) "templateId", r8s.w(bbsVar));
        jSONObject.put((JSONObject) "url", bbsVar.e0());
        jSONObject.put((JSONObject) "solutionType", bbsVar.a0().name());
        jSONObject.put((JSONObject) "frameTempType", r8s.c(bbsVar));
        jSONObject.put((JSONObject) "bizType", r8s.k(bbsVar));
        jSONObject.put((JSONObject) qxq.SUB_KEY_FRAGMENT_JUMP, r8s.h(bbsVar));
        jSONObject.put((JSONObject) RateInfoV2.KEY_OPEN_MODE, r8s.t(bbsVar));
        jSONObject.put((JSONObject) "containerType", bbsVar.O().name());
        String h = TMSInstanceExtKt.h(bbsVar);
        if (h != null) {
            jSONObject.put((JSONObject) "frameworkVersion", h);
        }
        return jSONObject;
    }
}
