package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ulm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public clm f29469a;
    public String b;
    public Map<String, ? extends Object> c;

    static {
        t2o.a(1022361886);
    }

    public ulm(Map<?, ?> map) {
        ckf.g(map, "data");
        Object obj = map.get("header");
        Map<String, ? extends Object> map2 = null;
        Map map3 = obj instanceof Map ? (Map) obj : null;
        this.f29469a = map3 != null ? new clm(map3) : null;
        this.b = ht4.e(map, "text");
        Object obj2 = map.get(pg1.ATOM_values);
        Map map4 = obj2 instanceof Map ? (Map) obj2 : null;
        this.c = map4 != null ? ht4.h(map4) : map2;
    }

    public final clm a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (clm) ipChange.ipc$dispatch("3e714f18", new Object[]{this});
        }
        return this.f29469a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
        }
        return this.b;
    }

    public final Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("70cb8894", new Object[]{this});
        }
        return this.c;
    }

    public final void d(clm clmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89535308", new Object[]{this, clmVar});
        } else {
            this.f29469a = clmVar;
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void f(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea33897a", new Object[]{this, map});
        } else {
            this.c = map;
        }
    }

    public final Map<String, Object> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        clm clmVar = this.f29469a;
        return a.j(jpu.a("header", clmVar != null ? clmVar.y() : null), jpu.a("text", this.b), jpu.a(pg1.ATOM_values, this.c));
    }
}
