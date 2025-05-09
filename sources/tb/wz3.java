package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class wz3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793294);
    }

    public static final <T> String a(Collection<? extends T> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90e2216d", new Object[]{collection});
        }
        ckf.g(collection, "<this>");
        String b = t0p.b(JSON.toJSONString(collection));
        ckf.f(b, "encode(...)");
        return b;
    }
}
