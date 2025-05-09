package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.h2g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p2g<C extends h2g<C>> extends f2g<C> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<o2g, Map<q2g, List<g1a<n2g<Object>, xhv>>>> f25828a = new LinkedHashMap();

    static {
        t2o.a(1002438679);
    }

    public p2g(C c) {
        super(c);
    }

    public static /* synthetic */ Object ipc$super(p2g p2gVar, String str, Object... objArr) {
        if (str.hashCode() == 2024047597) {
            super.f();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/arch/kernel/component/event/KernelEventComponent");
    }

    @Override // tb.f2g
    public void a(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcab972", new Object[]{this, c});
        }
    }

    public final <T> void e(o2g o2gVar, q2g q2gVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8cd4432", new Object[]{this, o2gVar, q2gVar, t});
            return;
        }
        ckf.g(o2gVar, "category");
        ckf.g(q2gVar, "identifier");
        Map map = (Map) ((LinkedHashMap) this.f25828a).get(o2gVar);
        if (t == null) {
            t = (T) new Object();
        }
        n2g n2gVar = new n2g(o2gVar, q2gVar, t);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                q2g q2gVar2 = (q2g) entry.getKey();
                List<g1a> list = (List) entry.getValue();
                if (ckf.b(q2gVar2, q2gVar) || ckf.b(q2gVar2, q2g.Companion.b())) {
                    for (g1a g1aVar : list) {
                        g1aVar.invoke(n2gVar);
                    }
                }
            }
        }
        n2gVar.f();
    }

    @Override // tb.f2g, tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        ((LinkedHashMap) this.f25828a).clear();
        super.f();
    }

    public final void g(q2g q2gVar, o2g o2gVar, g1a<? super n2g<Object>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f81843", new Object[]{this, q2gVar, o2gVar, g1aVar});
            return;
        }
        ckf.g(q2gVar, "identifier");
        ckf.g(o2gVar, "category");
        ckf.g(g1aVar, "callback");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f25828a;
        Object obj = linkedHashMap.get(o2gVar);
        if (obj == null) {
            obj = new HashMap();
            linkedHashMap.put(o2gVar, obj);
        }
        Map map = (Map) obj;
        Object obj2 = map.get(q2gVar);
        if (obj2 == null) {
            obj2 = new ArrayList();
            map.put(q2gVar, obj2);
        }
        ((List) obj2).add(g1aVar);
    }

    public final Boolean h(q2g q2gVar, o2g o2gVar, g1a<? super n2g<Object>, xhv> g1aVar) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("929230c7", new Object[]{this, q2gVar, o2gVar, g1aVar});
        }
        ckf.g(q2gVar, "identifier");
        ckf.g(o2gVar, "category");
        ckf.g(g1aVar, "callback");
        Map map = (Map) ((LinkedHashMap) this.f25828a).get(o2gVar);
        if (map == null || (list = (List) map.get(q2gVar)) == null) {
            return null;
        }
        return Boolean.valueOf(list.remove(g1aVar));
    }
}
