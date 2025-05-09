package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class a10<ExposeKey, ExposeData> implements h4c<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_CACHE_SIZE = 8;
    public static final long DEFAULT_EXPOSE_DELAY = 0;

    /* renamed from: a  reason: collision with root package name */
    public Handler f15471a;
    public LruCache<ExposeKey, b<ExposeData>> c;
    public String h;
    public final Map<ExposeKey, b<ExposeData>> b = new HashMap();
    public final Map<ExposeKey, ExposeData> d = new LinkedHashMap();
    public final Map<ExposeKey, b<ExposeData>> e = new HashMap();
    public final Set<ExposeKey> f = new HashSet();
    public final Set<ExposeKey> g = new LinkedHashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f15472a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ String d;

        public a(boolean z, Object obj, Object obj2, String str) {
            this.f15472a = z;
            this.b = obj;
            this.c = obj2;
            this.d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f15472a) {
                if (DinamicXEngine.j0()) {
                    h36.g("DXExposure", "batch beforeDataExpose exposed at key: " + this.b);
                }
                ((HashSet) a10.this.f).add(this.b);
                a10.this.G(this, this.b, this.c, true, this.d);
                a10.this.y();
            } else {
                a10.this.G(this, this.b, this.c, false, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b<ExposeData> {

        /* renamed from: a  reason: collision with root package name */
        public final ExposeData f15473a;
        public final String b;
        public final boolean c;
        public final Runnable d;

        static {
            t2o.a(444597119);
        }

        public b(ExposeData exposedata, String str, boolean z, Runnable runnable) {
            this.f15473a = exposedata;
            this.b = str;
            this.c = z;
            this.d = runnable;
        }
    }

    static {
        t2o.a(444597117);
        t2o.a(444597123);
    }

    public Runnable A(ExposeKey exposekey, ExposeData exposedata, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("a4d97639", new Object[]{this, exposekey, exposedata, new Boolean(z), str});
        }
        return new a(z, exposekey, exposedata, str);
    }

    public Looper B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("c7f5376b", new Object[]{this});
        }
        return Looper.getMainLooper();
    }

    public abstract void C(ExposeKey exposekey, ExposeData exposedata, String str);

    public void D(ExposeKey exposekey, ExposeData exposedata, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0135812", new Object[]{this, exposekey, exposedata, new Boolean(z), str});
        } else if (z) {
            if (DinamicXEngine.j0()) {
                h36.g("DXExposure", "batch onDataExpose success at key: " + exposekey);
            }
            this.g.add(exposekey);
        } else {
            C(exposekey, exposedata, str);
        }
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3e3eaf", new Object[]{this});
        }
    }

    public void G(Runnable runnable, ExposeKey exposekey, ExposeData exposedata, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59fc62cd", new Object[]{this, runnable, exposekey, exposedata, new Boolean(z), str});
            return;
        }
        ((HashMap) this.b).remove(exposekey);
        if (!z(exposekey, exposedata, str)) {
            if (!H(exposekey, exposedata, str, n())) {
                this.c.put(exposekey, new b<>(exposedata, str, z, runnable));
                return;
            }
            D(exposekey, exposedata, z, str);
            J(exposekey, str);
        }
    }

    public abstract boolean H(ExposeKey exposekey, ExposeData exposedata, String str, Map<ExposeKey, ExposeData> map);

    public final void I(ExposeKey exposekey, ExposeData exposedata, String str, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5914f2a2", new Object[]{this, exposekey, exposedata, str, new Boolean(z), new Long(j)});
            return;
        }
        Runnable A = A(exposekey, exposedata, z, str);
        b bVar = new b(exposedata, str, z, A);
        ((HashMap) this.b).put(exposekey, bVar);
        this.f15471a.postDelayed(A, j);
        if (z) {
            if (DinamicXEngine.j0()) {
                h36.g("DXExposure", "batch postExposeTask at key: " + exposekey);
            }
            ((HashMap) this.e).put(exposekey, bVar);
        }
    }

    public ExposeData J(ExposeKey exposekey, String str) {
        b<ExposeData> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExposeData) ipChange.ipc$dispatch("5fb8387", new Object[]{this, exposekey, str});
        }
        if (!v() || (remove = this.c.remove(exposekey)) == null) {
            return null;
        }
        K(exposekey, remove);
        return remove.f15473a;
    }

    public final void K(ExposeKey exposekey, b<ExposeData> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("679d9b72", new Object[]{this, exposekey, bVar});
        } else if (bVar != null) {
            this.f15471a.removeCallbacks(bVar.d);
            if (bVar.c && u() && exposekey != null) {
                ((HashSet) this.f).add(exposekey);
                y();
            }
        }
    }

    @Override // tb.h4c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afb60e", new Object[]{this});
        } else if (!v()) {
            this.f15471a = p();
            this.c = o();
            F();
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae85ed9d", new Object[]{this})).intValue();
        }
        return 8;
    }

    @Override // tb.h4c
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861a892d", new Object[]{this, str});
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.d).entrySet()) {
            l(entry.getKey(), entry.getValue(), str);
        }
    }

    @Override // tb.h4c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf7aba5", new Object[]{this});
        } else if (v() && this.c.size() != 0) {
            try {
                for (Map.Entry<ExposeKey, b<ExposeData>> entry : this.c.snapshot().entrySet()) {
                    q(entry.getKey(), entry.getValue().f15473a, entry.getValue().b);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.h4c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (v()) {
            this.f15471a = null;
            E();
        }
    }

    @Override // tb.h4c
    public void e(ExposeKey exposekey, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a349c8b", new Object[]{this, exposekey, str});
        } else {
            f(exposekey, str, true);
        }
    }

    @Override // tb.h4c
    public void f(ExposeKey exposekey, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5fa7a9", new Object[]{this, exposekey, str, new Boolean(z)});
            return;
        }
        ExposeData J = J(exposekey, str);
        K(exposekey, (b) ((HashMap) this.b).remove(exposekey));
        if (z) {
            w(exposekey, J, str);
        }
    }

    @Override // tb.h4c
    public Map<ExposeKey, ExposeData> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7c9e86e", new Object[]{this});
        }
        return new HashMap(this.d);
    }

    @Override // tb.h4c
    public Map<ExposeKey, ExposeData> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("22643da7", new Object[]{this});
        }
        HashMap hashMap = new HashMap(this.d);
        ((LinkedHashMap) this.d).clear();
        return hashMap;
    }

    @Override // tb.h4c
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74000ea1", new Object[]{this, str});
        } else if (v()) {
            for (Map.Entry entry : ((LinkedHashMap) this.d).entrySet()) {
                A(entry.getKey(), entry.getValue(), false, str).run();
            }
        }
    }

    @Override // tb.h4c
    public void j(ExposeKey exposekey, ExposeData exposedata) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed8580e", new Object[]{this, exposekey, exposedata});
        } else {
            this.d.put(exposekey, exposedata);
        }
    }

    @Override // tb.h4c
    public void k(String str, List<ExposeKey> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdeca7f3", new Object[]{this, str, list});
        } else if (!u()) {
            this.h = str;
            if (DinamicXEngine.j0()) {
                h36.g("DXExposure", "start batchTriggerExpose");
            }
            if (list == null || list.isEmpty()) {
                for (Map.Entry entry : ((LinkedHashMap) this.d).entrySet()) {
                    s(entry.getKey(), entry.getValue(), str, true, r());
                }
            } else {
                for (ExposeKey exposekey : list) {
                    Object obj = ((LinkedHashMap) this.d).get(exposekey);
                    if (obj != null) {
                        s(exposekey, obj, str, true, r());
                    }
                }
            }
            if (((HashMap) this.e).isEmpty()) {
                this.h = null;
                if (DinamicXEngine.j0()) {
                    h36.g("DXExposure", "end batchTriggerExpose pendingTasks.isEmpty");
                }
            }
        } else if (DinamicXEngine.j0()) {
            h36.g("DXExposure", "isBatchExposing skip");
        }
    }

    @Override // tb.h4c
    public void l(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc791c8d", new Object[]{this, exposekey, exposedata, str});
        } else {
            s(exposekey, exposedata, str, false, r());
        }
    }

    @Override // tb.h4c
    public void m(ExposeKey exposekey, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48fc2df", new Object[]{this, exposekey, str});
        } else {
            this.d.remove(exposekey);
        }
    }

    public final Map<ExposeKey, ExposeData> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d5f9dd13", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<ExposeKey, b<ExposeData>> entry : this.c.snapshot().entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().f15473a);
        }
        return hashMap;
    }

    public LruCache<ExposeKey, b<ExposeData>> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("cd040c5e", new Object[]{this});
        }
        return new LruCache<>(b());
    }

    public Handler p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("93331871", new Object[]{this});
        }
        return new Handler(B());
    }

    public void q(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a980ba01", new Object[]{this, exposekey, exposedata, str});
        } else {
            s(exposekey, exposedata, str, false, 0L);
        }
    }

    public long r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a200cd1a", new Object[]{this})).longValue();
        }
        return 0L;
    }

    public final void s(ExposeKey exposekey, ExposeData exposedata, String str, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c395011a", new Object[]{this, exposekey, exposedata, str, new Boolean(z), new Long(j)});
        } else if (v()) {
            K(exposekey, (b) ((HashMap) this.b).remove(exposekey));
            I(exposekey, exposedata, str, z, j);
        }
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aee3231", new Object[]{this})).booleanValue();
        }
        if (!this.f.equals(((HashMap) this.e).keySet()) || ((HashMap) this.e).isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d53bdc", new Object[]{this})).booleanValue();
        }
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59e1a492", new Object[]{this})).booleanValue();
        }
        if (this.f15471a != null) {
            return true;
        }
        return false;
    }

    public void w(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0576d0e", new Object[]{this, exposekey, exposedata, str});
        }
    }

    public abstract void x(List<Pair<ExposeKey, ExposeData>> list, String str);

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42376d1f", new Object[]{this});
        } else if (t()) {
            ArrayList arrayList = new ArrayList();
            for (ExposeKey exposekey : this.g) {
                b bVar = (b) ((HashMap) this.e).get(exposekey);
                if (bVar != null) {
                    arrayList.add(new Pair(exposekey, bVar.f15473a));
                }
            }
            if (DinamicXEngine.j0()) {
                h36.g("DXExposure", "finished onBatchDataExpose batchSize: " + arrayList.size());
            }
            x(arrayList, this.h);
            ((HashMap) this.e).clear();
            ((HashSet) this.f).clear();
            this.g.clear();
            this.h = null;
        }
    }

    public boolean z(ExposeKey exposekey, ExposeData exposedata, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d7a8bb9", new Object[]{this, exposekey, exposedata, str})).booleanValue();
        }
        return false;
    }
}
