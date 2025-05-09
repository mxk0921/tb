package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g4v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764411999);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc129e3", new Object[]{str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-url", str);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap);
        hashMap.clear();
        hashMap.put("spm-pre", str);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap));
    }
}
