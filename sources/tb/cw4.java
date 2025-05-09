package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cw4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1019215894);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76b1d87", new Object[]{this, map});
        } else {
            new wc0().b(map);
        }
    }
}
