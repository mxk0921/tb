package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class bh1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<dh1>> f16381a = new ConcurrentHashMap();
    public final Map<String, Integer> b = new ConcurrentHashMap();
    public final Map<Integer, Map<String, Integer>> c = new ConcurrentHashMap();
    public final Map<Integer, Map<String, Set<Integer>>> d = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a<T> implements Comparator<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, t, t2})).intValue();
            }
            return t84.a(Integer.valueOf(((dh1) t).d()), Integer.valueOf(((dh1) t2).d()));
        }
    }

    public final synchronized boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b8d3ac7", new Object[]{this})).booleanValue();
        }
        return ((ConcurrentHashMap) this.c).isEmpty();
    }

    public final synchronized List<dh1> b(dh1 dh1Var) {
        List<dh1> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("807597cb", new Object[]{this, dh1Var});
        }
        ckf.g(dh1Var, "attachedResponse");
        if (!dh1Var.f()) {
            return new ArrayList();
        }
        String a2 = dh1Var.a();
        if (((ConcurrentHashMap) this.b).get(a2) == null) {
            List list2 = (List) ((ConcurrentHashMap) this.f16381a).get(a2);
            if (list2 == null) {
                list2 = new ArrayList();
            }
            if (list2.isEmpty()) {
                ((ConcurrentHashMap) this.f16381a).put(a2, list2);
            }
            list2.add(dh1Var);
            if (list2.size() > 1) {
                c04.u(list2, new a());
            }
            list = new ArrayList<>();
        } else {
            d(dh1Var);
            list = xz3.e(dh1Var);
        }
        return list;
    }

    public final synchronized List<dh1> c(z0i z0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c9aa6beb", new Object[]{this, z0iVar});
        }
        ckf.g(z0iVar, "mainResponse");
        int h = z0iVar.h();
        ((ConcurrentHashMap) this.c).put(Integer.valueOf(h), z0iVar.b());
        for (String str : z0iVar.b().keySet()) {
            ((ConcurrentHashMap) this.b).put(str, Integer.valueOf(h));
        }
        ArrayList<dh1> arrayList = new ArrayList();
        for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
            List list = (List) ((ConcurrentHashMap) this.f16381a).get((String) entry.getKey());
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        for (dh1 dh1Var : arrayList) {
            d(dh1Var);
        }
        ((ConcurrentHashMap) this.f16381a).clear();
        return arrayList;
    }

    public final void d(dh1 dh1Var) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e2217d", new Object[]{this, dh1Var});
            return;
        }
        String a2 = dh1Var.a();
        int d = dh1Var.d();
        Integer num2 = (Integer) ((ConcurrentHashMap) this.b).get(a2);
        Map map = (Map) ((ConcurrentHashMap) this.c).get(num2);
        if (map != null && (num = (Integer) map.get(a2)) != null) {
            Map<Integer, Map<String, Set<Integer>>> map2 = this.d;
            Integer valueOf = Integer.valueOf(d);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map2;
            Object obj = concurrentHashMap.get(valueOf);
            if (obj == null) {
                obj = new LinkedHashMap();
                concurrentHashMap.put(valueOf, obj);
            }
            Map map3 = (Map) obj;
            Object obj2 = map3.get(a2);
            if (obj2 == null) {
                obj2 = new LinkedHashSet();
                map3.put(a2, obj2);
            }
            Set set = (Set) obj2;
            set.add(Integer.valueOf(d));
            if (set.size() == num.intValue()) {
                map.remove(a2);
                if (map.isEmpty()) {
                    Map<Integer, Map<String, Integer>> map4 = this.c;
                    if (map4 != null) {
                        kqu.d(map4).remove(num2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                }
            }
        }
    }
}
