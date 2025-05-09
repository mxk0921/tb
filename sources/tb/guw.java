package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class guw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982516075);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4742818", new Object[]{str, str2, str3});
            return;
        }
        gce e = r3x.e();
        if (e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("page_url", str);
            hashMap.put(gce.KEY_CRASH_INFO_JS_VERSION, str2);
            e.a(hashMap);
        }
    }
}
