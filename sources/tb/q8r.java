package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vm0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q8r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837622);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b216a23c", new Object[]{str, str2});
        } else {
            vm0.d(vm0.a.a("buyFragment").message(str2).tag(str).sampling(1.0f));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed68f80b", new Object[0]);
        } else {
            vm0.d(vm0.a.a("buyFragment").tag("PV").message("Fragment_PV").sampling(0.01f));
        }
    }

    public static void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0446a0c", new Object[]{str, str2, str3, str4});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (str != null) {
                jSONObject.put("requestPrams", (Object) str);
            }
            if (str3 != null) {
                jSONObject.put("message", (Object) str3);
            }
            if (str4 != null) {
                jSONObject.put("traceId", (Object) str4);
            }
            vm0.e("downgradeToH5", jSONObject.toJSONString());
        } catch (Throwable unused) {
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57cee43", new Object[]{str, str2});
        } else {
            vm0.d(vm0.a.a("pageModeMonitor").tag(str).indicator("c1", str2).sampling(0.01f));
        }
    }

    public static void e(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f431d32b", new Object[]{obj, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    jSONObject.put("c1", (Object) ((JSONObject) obj).toJSONString());
                } else if (obj instanceof String) {
                    jSONObject.put("c1", (Object) ((String) obj));
                }
            }
            vm0.d(vm0.a.a("preloadDataTracker").message(jSONObject.toJSONString()).tag(str).sampling(1.0f));
        } catch (Throwable unused) {
        }
    }
}
