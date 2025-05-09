package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class poq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static koq f26214a;

    public static koq b(x0s x0sVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (koq) ipChange.ipc$dispatch("39959027", new Object[]{x0sVar, map});
        }
        if (f26214a == null) {
            f26214a = a(x0sVar, map);
        }
        return f26214a;
    }

    public static koq a(x0s x0sVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (koq) ipChange.ipc$dispatch("a25428c1", new Object[]{x0sVar, map});
        }
        if (map != null && Boolean.TRUE.equals(map.get("isDebuggable")) && rxv.b(x0sVar.g())) {
            ehh.e(true);
            return new y67(true);
        } else if (x0sVar.f().split("\\.").length > 3) {
            return new y67(true);
        } else {
            return new y67(false);
        }
    }
}
