package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zau {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750755);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05e0722", new Object[]{str});
        } else {
            b(str, null);
        }
    }

    public static void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea5200e", new Object[]{str, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("launchType", (Object) gwv.p());
        UtUtils.e("UCP", UtUtils.g(), "Perf", str, String.valueOf(System.currentTimeMillis()), UtUtils.h(jSONObject));
    }
}
