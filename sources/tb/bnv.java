package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.util.ActivityMonitor;
import java.io.File;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750431);
    }

    public static void b(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("414b815a", new Object[]{str, str2, str3, str4, str5, jSONObject});
            return;
        }
        BHREvent buildInternalEvent = BHREvent.buildInternalEvent(str3, str4, str5, true);
        buildInternalEvent.createTime = System.currentTimeMillis();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("br_action", (Object) str2);
        jSONObject.put("br_from", (Object) str);
        jSONObject.put("br_currentPageName", (Object) ActivityMonitor.p());
        jSONObject.put("br_currentPageUrl", (Object) ActivityMonitor.q());
        buildInternalEvent.bizArgKVMapObject = jSONObject;
        fm1.f().a(buildInternalEvent);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c7cc522", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f82.d().getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("ucp");
        sb.append(str);
        return sb.toString();
    }

    public static boolean d(kq4 kq4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a940a6ea", new Object[]{kq4Var})).booleanValue();
        }
        return kq4Var.c().getTaskInfo().getBooleanValue("isNeedWua");
    }

    public static JSONObject a(String str, String str2, String str3, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("28fd1fec", new Object[]{str, str2, str3, map});
        }
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put("schemeId", (Object) str);
        jSONObject.put("bizId", (Object) str2);
        jSONObject.put("traceId", (Object) str3);
        if (map != null) {
            jSONObject.putAll(map);
        }
        return jSONObject;
    }
}
