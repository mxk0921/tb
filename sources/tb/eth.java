package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class eth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f18805a;
    public final Map<String, ? extends Object> b;
    public final String c;
    public final String d;
    public final Map<String, ? extends Object> e;
    public final gth f;
    public final String g;
    public final cth h;

    static {
        t2o.a(1022361750);
    }

    public eth(Map<?, ?> map) {
        ArrayList arrayList;
        ckf.g(map, "data");
        Object obj = map.get(rb.RESULT_KEY);
        cth cthVar = null;
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = null;
        }
        this.f18805a = arrayList;
        Object obj3 = map.get("data");
        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
        this.b = map2 != null ? ht4.h(map2) : null;
        this.c = ht4.e(map, "v");
        this.d = ht4.e(map, "api");
        Object obj4 = map.get("responseHeader");
        Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
        this.e = map3 != null ? ht4.h(map3) : null;
        Object obj5 = map.get("statInfo");
        Map map4 = obj5 instanceof Map ? (Map) obj5 : null;
        this.f = map4 != null ? new gth(map4) : null;
        this.g = ht4.e(map, "currentId");
        Object obj6 = map.get("errorInfo");
        Map map5 = obj6 instanceof Map ? (Map) obj6 : null;
        this.h = map5 != null ? new cth(map5) : cthVar;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.d;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc1413fb", new Object[]{this});
        }
        return this.g;
    }

    public final Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.b;
    }

    public final cth d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cth) ipChange.ipc$dispatch("2ba8c47f", new Object[]{this});
        }
        return this.h;
    }

    public final Map<String, Object> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("812158a0", new Object[]{this});
        }
        return this.e;
    }

    public final List<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dd2d5f95", new Object[]{this});
        }
        return this.f18805a;
    }

    public final gth g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gth) ipChange.ipc$dispatch("90296647", new Object[]{this});
        }
        return this.f;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22bdab39", new Object[]{this});
        }
        return this.c;
    }
}
