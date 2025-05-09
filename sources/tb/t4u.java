package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class t4u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782701);
    }

    public static void a(String str, String str2, HashMap<String, Object> hashMap) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4ab57a", new Object[]{str, str2, hashMap});
            return;
        }
        r5a.j("Page_Home", 19999, "topview_trace_newface", str2, str, hashMap != null ? new JSONObject(hashMap) : null);
        StringBuilder sb = new StringBuilder("GatewayUTUtils[topview_trace] ->  , stage=");
        sb.append(str);
        sb.append(", traceId=");
        sb.append(str2);
        sb.append(", args=");
        if (hashMap != null) {
            str3 = hashMap.toString();
        } else {
            str3 = "null";
        }
        sb.append(str3);
        sfh.f("TopViewReporter", sb.toString());
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f1cd16", new Object[]{str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", "topViewParse");
        hashMap.put("code", str);
        hashMap.put("error_stage", str2);
        a("TopViewParse", str3, hashMap);
    }
}
