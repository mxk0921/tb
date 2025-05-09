package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class bmm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16479a;
    public final Integer b;
    public final Map<String, ? extends Object> c;

    static {
        t2o.a(1022361891);
    }

    public bmm(Map<?, ?> map) {
        ckf.g(map, "data");
        this.f16479a = ht4.e(map, "topic");
        this.b = ht4.c(map, "code");
        Object obj = map.get("data");
        Map<String, ? extends Object> map2 = null;
        Map map3 = obj instanceof Map ? (Map) obj : null;
        this.c = map3 != null ? ht4.h(map3) : map2;
    }

    public final Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("66f8a11", new Object[]{this});
        }
        return this.b;
    }

    public final Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.c;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this});
        }
        return this.f16479a;
    }
}
