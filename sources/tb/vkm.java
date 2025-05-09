package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class vkm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final clm f30073a;
    public final Map<String, ? extends Object> b;

    static {
        t2o.a(1022361863);
    }

    public vkm(Map<?, ?> map) {
        ckf.g(map, "data");
        Object obj = map.get("header");
        Map<String, ? extends Object> map2 = null;
        Map map3 = obj instanceof Map ? (Map) obj : null;
        this.f30073a = map3 != null ? new clm(map3) : null;
        Object obj2 = map.get(pg1.ATOM_values);
        Map map4 = obj2 instanceof Map ? (Map) obj2 : null;
        this.b = map4 != null ? ht4.h(map4) : map2;
    }

    public final clm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (clm) ipChange.ipc$dispatch("3e714f18", new Object[]{this});
        }
        return this.f30073a;
    }

    public final Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70cb8894", new Object[]{this});
        }
        return this.b;
    }
}
