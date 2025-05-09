package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x4p implements ren {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792248);
    }

    @Override // tb.ren
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef568edd", new Object[]{this, str, str2});
        } else {
            AppMonitor.Counter.commit("tbsearch", "rainbow", c(str, str2), 1.0d);
        }
    }

    @Override // tb.ren
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca8e0d", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sversion", (Object) r4p.SERVER_VERSION_VALUE);
        jSONObject.put("configVersion", (Object) str);
        AppMonitor.Counter.commit("tbsearch", "rainbowVersion", jSONObject.toString(), 1.0d);
    }

    public final String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63606013", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "_default_";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("testName", (Object) str);
        jSONObject.put("testValue", (Object) str2);
        jSONObject.put("sversion", (Object) r4p.SERVER_VERSION_VALUE);
        return jSONObject.toString();
    }
}
