package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class jlm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Integer f22058a;
    public final Map<String, ? extends Object> b;

    static {
        t2o.a(1022361879);
    }

    public jlm(Map<?, ?> map) {
        Map map2;
        ckf.g(map, "data");
        this.f22058a = ht4.c(map, "code");
        Object obj = map.get("data");
        Map<String, ? extends Object> map3 = null;
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        this.b = map2 != null ? ht4.h(map2) : map3;
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("66f8a11", new Object[]{this});
        }
        return this.f22058a;
    }

    public final Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.b;
    }
}
