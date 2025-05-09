package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.manager.utils.FinalConfig;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l9n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810006);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6941013d", new Object[]{str})).booleanValue();
        }
        HashSet<String> hashSet = FinalConfig.disEnableCache;
        if (hashSet == null || hashSet.isEmpty()) {
            return true;
        }
        return !hashSet.contains(str);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0369d1", new Object[]{str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("weexRecType", (Object) str);
        jSONObject.put("containerId", (Object) str2);
        r5a.h("Page_Home", 19999, "WVPluginRegister_fail", jSONObject);
    }
}
