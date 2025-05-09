package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fkz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(435159134);
    }

    public static void a(String str, Boolean bool, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bc406b", new Object[]{str, bool, map});
            return;
        }
        HashMap hashMap = new HashMap();
        if (bool != null) {
            hashMap.put("isUpload", bool.toString());
        }
        hashMap.put("content", JSON.toJSONString(map));
        b(str, "", "", hashMap);
    }

    public static void b(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64af0a7d", new Object[]{str, str2, str3, map});
            return;
        }
        if (map == null) {
            try {
                map = Collections.emptyMap();
            } catch (Throwable th) {
                ggh.d("[PreferControl] PreferTrackUtil error: " + th);
                return;
            }
        }
        Map<String, String> build = new UTOriginalCustomHitBuilder("UserPreferenceSync", 19999, str, str2, str3, map).build();
        ggh.b("arg1: " + str + "  arg2: " + str2 + "  arg3: " + str3 + " args: " + build);
        UTAnalytics.getInstance().getDefaultTracker().send(build);
    }
}
