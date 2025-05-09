package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qj implements obb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile obb b;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<Integer, List<nbb>> f26777a = new ConcurrentHashMap<>();

    static {
        t2o.a(79691806);
        t2o.a(79691823);
    }

    public static obb h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (obb) ipChange.ipc$dispatch("ac21ea67", new Object[0]);
        }
        if (b == null) {
            synchronized (qj.class) {
                try {
                    if (b == null) {
                        b = new qj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Override // tb.obb
    public void a(Context context, nbb nbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3082cc", new Object[]{this, context, nbbVar});
        } else if (nbbVar != null) {
            rbb g = ck.g();
            g.e("cacheInstance " + nbbVar.getUserContext().d() + " toPool ：" + context.getClass().getSimpleName(), ck.b.b().i("AURA/core").a());
            f(nbbVar.getUserContext().d());
            int identityHashCode = System.identityHashCode(context);
            List<nbb> list = this.f26777a.get(Integer.valueOf(identityHashCode));
            if (list == null) {
                list = new ArrayList<>();
                this.f26777a.put(Integer.valueOf(identityHashCode), list);
            }
            synchronized (this.f26777a) {
                i(list, nbbVar);
            }
        }
    }

    @Override // tb.obb
    public List<nbb> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("bce7d504", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (List<nbb> list : this.f26777a.values()) {
            synchronized (this.f26777a) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    @Override // tb.obb
    public List<nbb> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7d5d814d", new Object[]{this, context});
        }
        int identityHashCode = System.identityHashCode(context);
        for (Integer num : this.f26777a.keySet()) {
            if (num.intValue() == identityHashCode) {
                return this.f26777a.get(Integer.valueOf(identityHashCode));
            }
        }
        return null;
    }

    @Override // tb.obb
    public nbb d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nbb) ipChange.ipc$dispatch("c0cd2c20", new Object[]{this, str});
        }
        for (nbb nbbVar : b()) {
            if (str.equals(nbbVar.getUserContext().d())) {
                return nbbVar;
            }
        }
        return null;
    }

    @Override // tb.obb
    public void e(Context context, nbb nbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1735047b", new Object[]{this, context, nbbVar});
        } else if (nbbVar != null) {
            rbb g = ck.g();
            g.e("removeInstance " + nbbVar.getUserContext().d() + " fromPool: " + context.getClass().getSimpleName(), ck.b.b().i("AURA/core").a());
            int identityHashCode = System.identityHashCode(context);
            Iterator<Map.Entry<Integer, List<nbb>>> it = this.f26777a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, List<nbb>> next = it.next();
                List<nbb> value = next.getValue();
                if (identityHashCode == next.getKey().intValue()) {
                    synchronized (this.f26777a) {
                        try {
                            value.remove(nbbVar);
                            if (value.isEmpty()) {
                                it.remove();
                            }
                        } finally {
                        }
                    }
                }
            }
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9aefca0", new Object[]{this, str});
            return;
        }
        Iterator<Map.Entry<Integer, List<nbb>>> it = this.f26777a.entrySet().iterator();
        while (it.hasNext()) {
            if (g(it.next().getValue(), str) != null) {
                rbb g = ck.g();
                g.e("移除已经存在的bizCode：" + str, ck.b.b().i("AURA/core").a());
                it.remove();
            }
        }
    }

    public final nbb g(List<nbb> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nbb) ipChange.ipc$dispatch("faaf0d72", new Object[]{this, list, str});
        }
        for (nbb nbbVar : list) {
            if (str.equals(nbbVar.getUserContext().d())) {
                return nbbVar;
            }
        }
        return null;
    }

    public final void i(List<nbb> list, nbb nbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7be8de3", new Object[]{this, list, nbbVar});
            return;
        }
        nbb g = g(list, nbbVar.getUserContext().d());
        if (g != null) {
            list.remove(g);
        }
        list.add(nbbVar);
    }
}
