package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final CopyOnWriteArrayList<kmi> c = new CopyOnWriteArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, CopyOnWriteArrayList<gmi>>> f22759a = new ConcurrentHashMap<>();
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(100663304);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(100663303);
    }

    public kmi() {
        c.add(this);
    }

    public final void a(gmi gmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea89e63", new Object[]{this, gmiVar});
            return;
        }
        ckf.g(gmiVar, "callback");
        if (!this.b.get()) {
            ConcurrentHashMap<String, CopyOnWriteArrayList<gmi>> concurrentHashMap = this.f22759a.get(gmiVar.a());
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                this.f22759a.put(gmiVar.a(), concurrentHashMap);
            }
            CopyOnWriteArrayList<gmi> copyOnWriteArrayList = concurrentHashMap.get(gmiVar.b());
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                concurrentHashMap.put(gmiVar.b(), copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(gmiVar);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.b.compareAndSet(false, true)) {
            this.f22759a.clear();
            c.remove(this);
        }
    }

    public final void c(String str, String str2, Map<?, ?> map) {
        CopyOnWriteArrayList<gmi> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5403dca", new Object[]{this, str, str2, map});
            return;
        }
        ckf.g(str, "bizId");
        ckf.g(str2, "eventName");
        if (!this.b.get()) {
            Iterator<kmi> it = c.iterator();
            while (it.hasNext()) {
                ConcurrentHashMap<String, CopyOnWriteArrayList<gmi>> concurrentHashMap = it.next().f22759a.get(str);
                if (concurrentHashMap != null) {
                    copyOnWriteArrayList = concurrentHashMap.get(str2);
                } else {
                    copyOnWriteArrayList = null;
                }
                if (copyOnWriteArrayList != null) {
                    int i = 0;
                    for (Object obj : copyOnWriteArrayList) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            gmi gmiVar = (gmi) obj;
                            if (gmiVar.c()) {
                                copyOnWriteArrayList.remove(gmiVar);
                            }
                            gmiVar.d(map);
                            i = i2;
                        } else {
                            yz3.p();
                            throw null;
                        }
                    }
                    continue;
                }
            }
        }
    }

    public final void d(String str, String str2) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<gmi>> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1923f65", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "bizId");
        ckf.g(str2, "eventName");
        if (!this.b.get() && (concurrentHashMap = this.f22759a.get(str)) != null) {
            concurrentHashMap.remove(str2);
        }
    }

    public final void e(String str, String str2, gmi gmiVar) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<gmi>> concurrentHashMap;
        CopyOnWriteArrayList<gmi> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c774c472", new Object[]{this, str, str2, gmiVar});
            return;
        }
        ckf.g(str, "bizId");
        ckf.g(str2, "eventName");
        ckf.g(gmiVar, "callback");
        if (!this.b.get() && (concurrentHashMap = this.f22759a.get(str)) != null && (copyOnWriteArrayList = concurrentHashMap.get(str2)) != null) {
            copyOnWriteArrayList.remove(gmiVar);
        }
    }
}
