package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ncy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(283115578);
    }

    public static void a(String str, Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3501d5e", new Object[]{str, map, new Boolean(z)});
            return;
        }
        qgh.c(str, map);
        ad0 e = ed0.h().e();
        if (e == null) {
            return;
        }
        if (!z || !e.h()) {
            e.g().b(str, map);
        }
    }
}
