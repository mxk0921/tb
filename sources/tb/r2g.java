package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class r2g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final s2g f27054a;
    public final Map<String, Object> b;

    static {
        t2o.a(1002438706);
    }

    public r2g() {
        this(null, null, 3, null);
    }

    public final s2g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s2g) ipChange.ipc$dispatch("db001a19", new Object[]{this});
        }
        return this.f27054a;
    }

    public final Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d05bb12b", new Object[]{this});
        }
        return this.b;
    }

    public r2g(s2g s2gVar, Map<String, Object> map) {
        ckf.g(s2gVar, "identifier");
        ckf.g(map, "userinfo");
        this.f27054a = s2gVar;
        this.b = map;
        gih.c("OpenArchKmp", "KernelIntent create");
    }

    public /* synthetic */ r2g(s2g s2gVar, Map map, int i, a07 a07Var) {
        this((i & 1) != 0 ? s2g.Companion.a() : s2gVar, (i & 2) != 0 ? new LinkedHashMap() : map);
    }
}
