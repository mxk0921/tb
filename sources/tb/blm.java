package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class blm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final clm f16468a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Map<String, ? extends Object> e;

    static {
        t2o.a(1022361867);
    }

    public blm(Map<?, ?> map) {
        ckf.g(map, "data");
        Object obj = map.get("header");
        Map<String, ? extends Object> map2 = null;
        Map map3 = obj instanceof Map ? (Map) obj : null;
        this.f16468a = map3 != null ? new clm(map3) : null;
        this.b = ht4.c(map, "totalCount");
        this.c = ht4.c(map, "onlineCount");
        this.d = ht4.c(map, "pageViewCount");
        Object obj2 = map.get("addUsers");
        Map map4 = obj2 instanceof Map ? (Map) obj2 : null;
        this.e = map4 != null ? ht4.h(map4) : map2;
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6b050099", new Object[]{this});
        }
        return this.e;
    }

    public final clm b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (clm) ipChange.ipc$dispatch("3e714f18", new Object[]{this});
        }
        return this.f16468a;
    }

    public final Integer c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("493bc4b4", new Object[]{this});
        }
        return this.c;
    }

    public final Integer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("d22b7613", new Object[]{this});
        }
        return this.d;
    }

    public final Integer e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("dab7194f", new Object[]{this});
        }
        return this.b;
    }
}
