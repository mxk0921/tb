package tb;

import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class bth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1022361747);
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        return a.j(jpu.a(RVStartParams.KEY_ONLINE_HOST, null), jpu.a("preHost", null), jpu.a("dailyHost", null));
    }
}
