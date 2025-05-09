package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class not implements xyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744488974);
        t2o.a(467664921);
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f68647", new Object[]{this, str, map});
        } else {
            aht.c().f(str, map);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894b713a", new Object[]{this, str});
        } else {
            aht.c().h(str);
        }
    }
}
