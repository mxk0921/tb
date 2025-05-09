package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k77 implements fwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(767557684);
        t2o.a(767557686);
    }

    @Override // tb.fwd
    public void d(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d365127a", new Object[]{this, str, map});
            return;
        }
        if (map != null) {
            str2 = map.toString();
        } else {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder("TLog UT: eventName=");
        sb.append(str);
        sb.append(", data=");
        sb.append(str2);
    }
}
