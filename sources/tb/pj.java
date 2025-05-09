package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pj implements obb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static obb b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, List<nbb>> f26118a = new HashMap();

    static {
        t2o.a(81788933);
        t2o.a(79691823);
    }

    public static obb f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (obb) ipChange.ipc$dispatch("ac21ea67", new Object[0]);
        }
        if (fj.e("useNewInstancePoolManager", true, true)) {
            return qj.h();
        }
        if (b == null) {
            synchronized (pj.class) {
                try {
                    if (b == null) {
                        b = new pj();
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
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3082cc", new Object[]{this, context, nbbVar});
        } else if (nbbVar != null) {
            int identityHashCode = System.identityHashCode(context);
            if (!((HashMap) this.f26118a).containsKey(Integer.valueOf(identityHashCode))) {
                list = new ArrayList();
            } else {
                list = (List) ((HashMap) this.f26118a).get(Integer.valueOf(identityHashCode));
            }
            if (list == null) {
                list = new ArrayList();
            }
            if (!list.contains(nbbVar)) {
                rbb g = ck.g();
                g.d("AURAInstanceManager cacheInstance " + identityHashCode);
                list.add(nbbVar);
                ((HashMap) this.f26118a).put(Integer.valueOf(identityHashCode), list);
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
        for (Integer num : ((HashMap) this.f26118a).keySet()) {
            List list = (List) ((HashMap) this.f26118a).get(num);
            if (list != null) {
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
        return (List) ((HashMap) this.f26118a).get(Integer.valueOf(System.identityHashCode(context)));
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
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1735047b", new Object[]{this, context, nbbVar});
        } else if (nbbVar != null) {
            int identityHashCode = System.identityHashCode(context);
            if (((HashMap) this.f26118a).containsKey(Integer.valueOf(identityHashCode)) && (list = (List) ((HashMap) this.f26118a).get(Integer.valueOf(identityHashCode))) != null) {
                rbb g = ck.g();
                g.d("AURAInstanceManager rmInstance " + identityHashCode);
                list.remove(nbbVar);
                if (list.isEmpty()) {
                    ((HashMap) this.f26118a).remove(Integer.valueOf(identityHashCode));
                }
            }
        }
    }
}
