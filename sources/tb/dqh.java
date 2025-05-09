package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(577765444);
    }

    public static void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc641ee", new Object[]{map});
            return;
        }
        jqh c = zqh.d().c();
        if (c != null) {
            c.a(map);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89965e6a", new Object[0]);
            return;
        }
        jqh c = zqh.d().c();
        if (c != null) {
            c.b();
        }
    }
}
