package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bc4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<bc4, List<bc4.a>>> f16290a = new HashMap();
    public final Map<Component, List<bc4.a>> b = new HashMap();

    static {
        t2o.a(503317213);
    }

    public <T> void a(Component component, String str, bc4<T, ?> bc4Var, T t) {
        Map map;
        List<bc4.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afe48a8b", new Object[]{this, component, str, bc4Var, t});
        } else if (!((HashMap) this.f16290a).isEmpty() && !TextUtils.isEmpty(str) && bc4Var != null && t != null && (map = (Map) ((HashMap) this.f16290a).get(str)) != null && !map.isEmpty() && (list = (List) map.get(bc4Var)) != null && !list.isEmpty()) {
            for (bc4.a aVar : list) {
                aVar.a(component, t);
            }
        }
    }

    public <T, Observer extends bc4.a<T>> T b(Component component, String str, bc4<T, Observer> bc4Var, Observer observer) {
        Component K;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4c6a6ae5", new Object[]{this, component, str, bc4Var, observer});
        }
        if (component == null || TextUtils.isEmpty(str) || bc4Var == null || observer == null) {
            return null;
        }
        Map map = (Map) ((HashMap) this.f16290a).get(str);
        if (map == null) {
            map = new HashMap();
            ((HashMap) this.f16290a).put(str, map);
        }
        List list = (List) map.get(bc4Var);
        if (list == null) {
            list = new ArrayList();
            map.put(bc4Var, list);
        }
        if (list.contains(observer)) {
            return null;
        }
        list.add(observer);
        List list2 = (List) ((HashMap) this.b).get(component);
        if (list2 == null) {
            list2 = new ArrayList();
            ((HashMap) this.b).put(component, list2);
        }
        list2.add(observer);
        n j = q.j(component.getNode(), str);
        if (j == null || (K = j.K()) == null || (t = (T) K.getComponentInfo(bc4Var)) == null) {
            return null;
        }
        observer.a(K, t);
        return t;
    }

    public void c(Component component) {
        List<bc4.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d57b4e51", new Object[]{this, component});
        } else if (component != null && (list = (List) ((HashMap) this.b).remove(component)) != null && !list.isEmpty()) {
            for (bc4.a aVar : list) {
                d(component, null, null, aVar);
            }
        }
    }

    public <T, Observer extends bc4.a<T>> void d(Component component, String str, bc4<T, Observer> bc4Var, bc4.a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09f534e", new Object[]{this, component, str, bc4Var, aVar});
        } else if (component != null && aVar != null) {
            if (!TextUtils.isEmpty(str)) {
                e((Map) ((HashMap) this.f16290a).get(str), bc4Var, aVar);
            } else {
                for (Map.Entry entry : ((HashMap) this.f16290a).entrySet()) {
                    e((Map) entry.getValue(), bc4Var, aVar);
                }
            }
            List list = (List) ((HashMap) this.b).get(component);
            if (!(list == null || list.isEmpty())) {
                list.remove(aVar);
                if (list.size() == 0) {
                    ((HashMap) this.b).remove(component);
                }
            }
        }
    }

    public final void e(Map<bc4, List<bc4.a>> map, bc4 bc4Var, bc4.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9ec1e3", new Object[]{this, map, bc4Var, aVar});
        } else if (map != null && !map.isEmpty() && aVar != null) {
            if (bc4Var != null) {
                f(map.get(bc4Var), aVar);
                return;
            }
            for (Map.Entry<bc4, List<bc4.a>> entry : map.entrySet()) {
                f(entry.getValue(), aVar);
            }
        }
    }

    public final void f(List<bc4.a> list, bc4.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b9b051", new Object[]{this, list, aVar});
        } else if (aVar != null && list != null && list.size() != 0) {
            list.remove(aVar);
        }
    }
}
