package tb;

import com.nirvana.tools.requestqueue.strategy.ExecuteStrategy;
import java.util.concurrent.ConcurrentHashMap;
import tb.f4o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class n5o {
    public static volatile n5o b;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, f4o> f24531a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements f4o.e {
        public a() {
        }

        public final void a(f4o f4oVar) {
            n5o.this.f24531a.remove(f4oVar.c.getID());
        }
    }

    public static n5o a() {
        if (b == null) {
            synchronized (n5o.class) {
                try {
                    if (b == null) {
                        b = new n5o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public <T extends p9o> void b(d3o<T> d3oVar) {
        if (d3oVar != null) {
            ConcurrentHashMap<String, f4o> concurrentHashMap = this.f24531a;
            f4o f4oVar = concurrentHashMap.get(d3oVar.getID());
            if (f4oVar != null) {
                f4oVar.b(d3oVar);
                if (ExecuteStrategy.USE_NEW == d3oVar.getExecuteStrategy()) {
                    f4o<T>.f fVar = f4oVar.b;
                    if (fVar != null) {
                        fVar.a();
                        f4oVar.b = null;
                    }
                    f4oVar.c = d3oVar;
                    f4oVar.a();
                    return;
                }
                return;
            }
            f4o f4oVar2 = new f4o(d3oVar, new a());
            f4oVar2.b(d3oVar);
            concurrentHashMap.put(d3oVar.getID(), f4oVar2);
            f4oVar2.a();
        }
    }
}
