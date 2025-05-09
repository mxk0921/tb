package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ml2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ? extends Object> f24116a;

    static {
        t2o.a(1022361624);
    }

    public ml2(Map<?, ?> map) {
        Map map2;
        ckf.g(map, "data");
        Object obj = map.get("detail");
        Map<String, ? extends Object> map3 = null;
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        this.f24116a = map2 != null ? ht4.h(map2) : map3;
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("188f3603", new Object[]{this});
        }
        return this.f24116a;
    }
}
