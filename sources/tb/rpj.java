package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2c182a", new Object[]{str, str2});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", (Object) str2);
            jSONObject.put("errorCode", (Object) str);
            AppMonitor.Counter.commit(y9a.c(), "navigation_exception", jSONObject.toJSONString(), 1.0d);
        } catch (Throwable th) {
            TLog.loge(y9a.c(), "NavigationMonitor", "count failed", th);
        }
    }
}
