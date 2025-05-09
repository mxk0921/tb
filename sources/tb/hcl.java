package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hcl implements ygb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031854);
        t2o.a(297795614);
    }

    @Override // tb.ygb
    public void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("775414fd", new Object[]{this, str, str2, str3, str4, map});
            return;
        }
        try {
            hdv.a().commitFailure(str, str2, "1.0", "new_ultron_babel_order", "", map, str3, str4);
        } catch (Throwable unused) {
        }
    }
}
