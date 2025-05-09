package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.tanx.exposer.achieve.AdMonitorType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ocy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f25305a = ConnectionResult.SERVICE_UPDATING;

    static {
        t2o.a(283115579);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd23f8d8", new Object[0])).intValue();
        }
        return f25305a;
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c75b96be", new Object[]{new Integer(i)});
        } else {
            f25305a = i;
        }
    }

    public static void c(bd0 bd0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b978b352", new Object[]{bd0Var});
        } else if (bd0Var == null) {
            qgh.a("tanx_expose_request_duplicated", "AdMonitorExtraParams is null");
        } else {
            ncy.a("tanx_expose_request_duplicated", wzo.d(bd0Var), true);
        }
    }

    public static void d(bd0 bd0Var, AdMonitorType adMonitorType) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d435b9", new Object[]{bd0Var, adMonitorType});
            return;
        }
        if (adMonitorType == AdMonitorType.CLICK) {
            str = "tanx_click_invoke_success";
        } else if (adMonitorType == AdMonitorType.EXPOSE) {
            str = "tanx_expose_invoke_success";
        } else {
            str = "tanx_interact_invoke_success";
        }
        if (bd0Var == null) {
            qgh.a(str, "AdMonitorExtraParams is null");
        } else {
            ncy.a(str, wzo.d(bd0Var), true);
        }
    }

    public static void e(bd0 bd0Var, AdMonitorType adMonitorType, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f6c343", new Object[]{bd0Var, adMonitorType, str});
            return;
        }
        if (adMonitorType == AdMonitorType.CLICK) {
            str2 = "tanx_click_invoke_error";
        } else if (adMonitorType == AdMonitorType.EXPOSE) {
            str2 = "tanx_expose_invoke_error";
        } else {
            str2 = "tanx_interact_invoke_error";
        }
        if (bd0Var == null) {
            qgh.a(str2, "AdMonitorExtraParams is null");
            return;
        }
        Map<String, Object> d = wzo.d(bd0Var);
        d.put("errorMsg", str);
        ncy.a(str2, d, true);
    }

    public static void f(bd0 bd0Var, AdMonitorType adMonitorType, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e48c24d", new Object[]{bd0Var, adMonitorType, str, str2});
            return;
        }
        if (adMonitorType == AdMonitorType.CLICK) {
            str3 = "tanx_click_request";
        } else if (adMonitorType == AdMonitorType.EXPOSE) {
            str3 = "tanx_expose_request";
        } else {
            str3 = "tanx_interact_request";
        }
        if (bd0Var == null) {
            qgh.a(str3, "AdMonitorExtraParams is null");
            return;
        }
        Map<String, Object> d = wzo.d(bd0Var);
        d.put("host", str);
        d.put("url_hash", str2);
        ncy.a(str3, d, true);
    }

    public static void g(tcy tcyVar, int i, String str, boolean z, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd90754", new Object[]{tcyVar, new Integer(i), str, new Boolean(z), str2});
        } else if (tcyVar == null || tcyVar.l() == null) {
            qgh.a("exposeRequestFail", "wrapper is null");
        } else {
            if (tcyVar.l() == AdMonitorType.CLICK) {
                str3 = "tanx_click_request_fail";
            } else if (tcyVar.l() == AdMonitorType.EXPOSE) {
                str3 = "tanx_expose_request_fail";
            } else {
                str3 = "tanx_interact_request_fail";
            }
            if (tcyVar.j() == null) {
                qgh.a(str3, "AdMonitorExtraParams is null");
                return;
            }
            Map<String, Object> d = wzo.d(tcyVar.j());
            d.put("host", tcyVar.o());
            d.put("url_hash", tcyVar.n());
            d.put(v4s.PARAM_IS_RETRY, String.valueOf(z));
            d.put("retryType", str2);
            d.put("url", tcyVar.k());
            d.put("errorCode", String.valueOf(i));
            d.put("errorMsg", str);
            ncy.a(str3, d, false);
        }
    }

    public static void h(tcy tcyVar, boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be66f59b", new Object[]{tcyVar, new Boolean(z), str});
        } else if (tcyVar == null || tcyVar.l() == null) {
            qgh.a("exposeRequestSuccess", "wrapper is null");
        } else {
            if (tcyVar.l() == AdMonitorType.CLICK) {
                str2 = "tanx_click_request_success";
            } else if (tcyVar.l() == AdMonitorType.EXPOSE) {
                str2 = "tanx_expose_request_success";
            } else {
                str2 = "tanx_interact_request_success";
            }
            if (tcyVar.j() == null) {
                qgh.a(str2, "AdMonitorExtraParams is null");
                return;
            }
            Map<String, Object> d = wzo.d(tcyVar.j());
            d.put("host", tcyVar.o());
            d.put("url_hash", tcyVar.n());
            d.put(v4s.PARAM_IS_RETRY, String.valueOf(z));
            d.put("retryType", str);
            ncy.a(str2, d, false);
        }
    }

    public static void i(bd0 bd0Var, AdMonitorType adMonitorType, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a7a5f1", new Object[]{bd0Var, adMonitorType, str});
            return;
        }
        if (adMonitorType == AdMonitorType.CLICK) {
            str2 = "tanx_click_invalid_url";
        } else if (adMonitorType == AdMonitorType.EXPOSE) {
            str2 = "tanx_expose_invalid_url";
        } else {
            str2 = "tanx_interact_invalid_url";
        }
        if (bd0Var == null) {
            qgh.a(str2, "AdMonitorExtraParams is null");
            return;
        }
        Map<String, Object> d = wzo.d(bd0Var);
        d.put("errorMsg", str);
        ncy.a(str2, d, true);
    }
}
