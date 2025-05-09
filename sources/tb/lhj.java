package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class lhj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(482344983);
        h();
        e();
        f();
        i();
        g();
    }

    public static void b(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b95a3db", new Object[]{new Long(j), str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("run_time", Double.valueOf(j));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("net_name", str);
        hashMap2.put("network_type", d());
        hashMap2.put("mobile_model", caa.f());
        jzu.d("PLT_NN", "download_NN_model", hashMap, hashMap2);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb78c378", new Object[]{str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("net_name", (Object) str2);
        jSONObject.put("network_type", (Object) d());
        jSONObject.put("cpu_model", (Object) caa.b());
        jSONObject.put("mobile_model", (Object) caa.f());
        jzu.b("PLT_NN", "NN_runtime_failed", str, jSONObject.toJSONString());
    }

    public static String d() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9db7d71", new Object[0]);
        }
        if (caa.u()) {
            i = 1;
        } else {
            i = n4p.a();
        }
        if (i == 1) {
            return "NETWORK_WIFI";
        }
        if (i != 4) {
            return "OTHER";
        }
        return "NETWORK_4G";
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a020ef56", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("run_time");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("net_name");
        arrayList2.add("net_mode");
        arrayList2.add("cpu_model");
        arrayList2.add("mobile_model");
        jzu.m("PLT_NN", "build_NN_model", arrayList, arrayList2);
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a60a96", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("run_time");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("net_name");
        arrayList2.add("network_type");
        arrayList2.add("mobile_model");
        jzu.m("PLT_NN", "download_NN_model", arrayList, arrayList2);
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6c7f01", new Object[0]);
        } else {
            jzu.l("PLT_NN", "NN_runtime_failed", new ArrayList());
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e6874b", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("run_time");
        arrayList.add("pre_process_time");
        arrayList.add("post_process_time");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("net_name");
        arrayList2.add("net_mode");
        arrayList2.add("cpu_model");
        arrayList2.add("mobile_model");
        jzu.m("PLT_NN", "core_unit_run", arrayList, arrayList2);
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3cfa9a", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("run_time");
        arrayList.add("pre_process_time");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("unit_name");
        arrayList2.add("cpu_model");
        arrayList2.add("mobile_model");
        jzu.m(tmf.MODULE_CHAIN, "core_unit_run", arrayList, arrayList2);
    }

    public static void a(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa604b4d", new Object[]{new Long(j), str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("run_time", Double.valueOf(j));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("net_name", str);
        hashMap2.put("net_mode", str2);
        hashMap2.put("cpu_model", caa.b());
        hashMap2.put("mobile_model", caa.f());
        agh.b("NNMonitor", "NNModelName:%s NNBuildTime:%d", str, Long.valueOf(j));
        jzu.d("PLT_NN", "build_NN_model", hashMap, hashMap2);
    }
}
