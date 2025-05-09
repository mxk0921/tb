package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.service.nextrpc.extension.IAURANextRPCPrefetchExtension;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ck;
import tb.ubb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pk implements xbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, qk> f26137a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements ubb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ubb.a[] f26138a;

        static {
            t2o.a(80740482);
            t2o.a(80740472);
        }

        public a(ubb.a... aVarArr) {
            this.f26138a = aVarArr;
        }

        @Override // tb.ubb.a
        public void a(List<kk> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f0800fd", new Object[]{this, list});
                return;
            }
            ubb.a[] aVarArr = this.f26138a;
            if (aVarArr != null) {
                for (ubb.a aVar : aVarArr) {
                    aVar.a(list);
                }
            }
        }

        @Override // tb.ubb.a
        public <T extends kk> void b(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2dcb890", new Object[]{this, t});
                return;
            }
            ubb.a[] aVarArr = this.f26138a;
            if (aVarArr != null) {
                for (ubb.a aVar : aVarArr) {
                    aVar.b(t);
                }
            }
        }

        @Override // tb.ubb.a
        public <T extends kk> void c(T t, List<kk> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef42949a", new Object[]{this, t, list});
                return;
            }
            ubb.a[] aVarArr = this.f26138a;
            if (aVarArr != null) {
                for (ubb.a aVar : aVarArr) {
                    aVar.c(t, list);
                }
            }
        }

        @Override // tb.ubb.a
        public void d(kk kkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9055cbde", new Object[]{this, kkVar});
                return;
            }
            ubb.a[] aVarArr = this.f26138a;
            if (aVarArr != null) {
                for (ubb.a aVar : aVarArr) {
                    aVar.d(kkVar);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements ubb.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ubb.b f26139a;
        public final String b;

        static {
            t2o.a(80740483);
            t2o.a(80740473);
        }

        public b(String str, ubb.b bVar) {
            this.f26139a = bVar;
            this.b = str;
        }

        @Override // tb.ubb.b
        public nk a(AURANextRPCEndpoint aURANextRPCEndpoint, AURANextRPCEndpoint aURANextRPCEndpoint2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nk) ipChange.ipc$dispatch("e68346d3", new Object[]{this, aURANextRPCEndpoint, aURANextRPCEndpoint2});
            }
            ubb.b bVar = this.f26139a;
            if (bVar != null) {
                return bVar.a(aURANextRPCEndpoint, aURANextRPCEndpoint2);
            }
            return null;
        }

        @Override // tb.ubb.b
        public void c(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fa8699e", new Object[]{this, str, map});
            } else if (this.f26139a != null) {
                pk.a().remove(this.b);
                this.f26139a.c(str, map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements ubb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final qk f26140a;

        static {
            t2o.a(80740484);
            t2o.a(80740472);
        }

        public c(qk qkVar) {
            this.f26140a = qkVar;
        }

        @Override // tb.ubb.a
        public void a(List<kk> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f0800fd", new Object[]{this, list});
            } else {
                j(null, list);
            }
        }

        @Override // tb.ubb.a
        public <T extends kk> void b(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2dcb890", new Object[]{this, t});
            } else {
                h(t);
            }
        }

        @Override // tb.ubb.a
        public <T extends kk> void c(T t, List<kk> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef42949a", new Object[]{this, t, list});
            } else {
                j(t, list);
            }
        }

        @Override // tb.ubb.a
        public void d(kk kkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9055cbde", new Object[]{this, kkVar});
            } else {
                j(kkVar, null);
            }
        }

        public final void e(qk qkVar, kk kkVar) {
            long j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69c0e761", new Object[]{this, qkVar, kkVar});
            } else if (kkVar != null) {
                ok g = kkVar.g();
                g.r(qkVar.k());
                if (qkVar.g() != 0) {
                    j = qkVar.g();
                } else {
                    j = qkVar.j();
                }
                g.q(j);
            }
        }

        public final <T extends kk> void f(T t, List<kk> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b14b4e7d", new Object[]{this, t, list, new Boolean(z)});
                return;
            }
            this.f26140a.b.compareAndSet(false, true);
            this.f26140a.o(z);
            rbb g = ck.g();
            g.e("PREFETCHcacheData[" + z + "]" + System.currentTimeMillis());
            this.f26140a.r(System.currentTimeMillis());
            if (t != null) {
                this.f26140a.q(t);
            }
            if (list != null) {
                this.f26140a.a(list);
            }
        }

        public final <T extends kk> void g(T t, List<kk> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b43965f4", new Object[]{this, t, list, new Boolean(z)});
                return;
            }
            AURATraceUtil.a(3, " 预请求收到数据");
            e(this.f26140a, t);
            try {
                this.f26140a.f26791a.lock();
                ubb.a d = this.f26140a.d();
                if (d != null) {
                    AURATraceUtil.b(3);
                    i(d, t, list, z);
                } else {
                    AURATraceUtil.b(3);
                    f(t, list, z);
                }
            } finally {
                try {
                } finally {
                }
            }
        }

        public final <T extends kk> void h(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("454a70d2", new Object[]{this, t});
            } else {
                g(t, null, false);
            }
        }

        public final <T extends kk> void i(ubb.a aVar, T t, List<kk> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e09d38e2", new Object[]{this, aVar, t, list, new Boolean(z)});
            } else if (!z) {
                aVar.b(t);
            } else if (t != null) {
                aVar.c(t, list);
            } else {
                aVar.a(list);
            }
        }

        public final <T extends kk> void j(T t, List<kk> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f8f5bfe", new Object[]{this, t, list});
            } else {
                g(t, list, true);
            }
        }
    }

    static {
        t2o.a(80740481);
        t2o.a(80740486);
    }

    public static /* synthetic */ ConcurrentHashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("6789008f", new Object[0]);
        }
        return f26137a;
    }

    public static Map<String, String> b(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("94bf5f4a", new Object[]{aURANextRPCEndpoint});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data_key", aURANextRPCEndpoint.getKey());
        return hashMap;
    }

    public static Map<String, String> c(qk qkVar, Map<String, String> map) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4a5cea38", new Object[]{qkVar, map});
        }
        AURANextRPCEndpoint i = qkVar.i();
        HashMap hashMap = new HashMap();
        hashMap.put("data_key", i.getKey());
        if (qkVar.g() != 0) {
            j = qkVar.g() - qkVar.k();
        } else {
            j = -1;
        }
        if (qkVar.f() != 0) {
            j = qkVar.f() - qkVar.k();
        }
        hashMap.put(IAURANextRPCPrefetchExtension.DATA_SAVE_TIME, String.valueOf(j));
        hashMap.put(IAURANextRPCPrefetchExtension.DATA_START_TIME, String.valueOf(qkVar.k()));
        hashMap.put(IAURANextRPCPrefetchExtension.DATA_HIT_TIME, String.valueOf(qkVar.f()));
        hashMap.put(IAURANextRPCPrefetchExtension.DATA_RESPONSE_TIME, String.valueOf(qkVar.j()));
        String c2 = tj.c(map);
        if (!TextUtils.isEmpty(c2)) {
            hashMap.put(IAURANextRPCPrefetchExtension.DATA_PARAM, c2);
        }
        return hashMap;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31d7b019", new Object[]{this});
            return;
        }
        for (Map.Entry<String, qk> entry : f26137a.entrySet()) {
            qk value = entry.getValue();
            if (System.currentTimeMillis() - value.j() > value.e()) {
                f26137a.remove(entry.getKey());
            }
        }
    }

    public final qk e(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qk) ipChange.ipc$dispatch("523427fa", new Object[]{this, aURANextRPCEndpoint});
        }
        return f26137a.get(aURANextRPCEndpoint.getKey());
    }

    public ubb.a f(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ubb.a) ipChange.ipc$dispatch("84b6f0e2", new Object[]{this, aURANextRPCEndpoint});
        }
        String key = aURANextRPCEndpoint.getKey();
        qk qkVar = new qk(key, aURANextRPCEndpoint);
        c cVar = new c(qkVar);
        qkVar.s(System.currentTimeMillis());
        if (h()) {
            f26137a.put(key, qkVar);
        }
        return cVar;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        ConcurrentHashMap<String, qk> concurrentHashMap = f26137a;
        if (concurrentHashMap.size() >= 15) {
            d();
        }
        if (concurrentHashMap.size() < 15) {
            return true;
        }
        return false;
    }

    public boolean i(AURANextRPCEndpoint aURANextRPCEndpoint, ubb.a aVar, ubb.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73ea9037", new Object[]{this, aURANextRPCEndpoint, aVar, bVar})).booleanValue();
        }
        b bVar2 = new b(aURANextRPCEndpoint.getKey(), bVar);
        if (!h()) {
            bVar2.c("TYPE_FULL", b(aURANextRPCEndpoint));
            return false;
        }
        qk e = e(aURANextRPCEndpoint);
        if (e != null) {
            nk a2 = bVar2.a(aURANextRPCEndpoint, e.i());
            if (a2.b()) {
                return g(aURANextRPCEndpoint, aVar, bVar2);
            }
            bVar2.c("TYPE_MISS", c(e, a2.a()));
            return false;
        }
        bVar2.c(IAURANextRPCPrefetchExtension.PrefetchCallbackType.TYPE_NOT_FOUNT, b(aURANextRPCEndpoint));
        return false;
    }

    public boolean g(AURANextRPCEndpoint aURANextRPCEndpoint, ubb.a aVar, ubb.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebee63e7", new Object[]{this, aURANextRPCEndpoint, aVar, bVar})).booleanValue();
        }
        qk e = e(aURANextRPCEndpoint);
        AURATraceUtil.g(3, " 真实请求");
        try {
            e.f26791a.lock();
            if (e.b.get() || e.h() != null) {
                e.f26791a.unlock();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - e.j() > e.e()) {
                    e.n(currentTimeMillis);
                    bVar.c("TYPE_EXPIRE", c(e, null));
                    return false;
                }
                kk h = e.h();
                if (h == null || aVar == null) {
                    return true;
                }
                e.n(System.currentTimeMillis());
                try {
                    e.f26791a.lock();
                    if (e.l()) {
                        ck.g().e("命中预请求", ck.b.b().h("uiThread", ao.a()).i("AURA/performance").a());
                        aVar.c(h, e.c());
                        e.m(aVar);
                    } else {
                        aVar.b(h);
                    }
                    bVar.c("TYPE_HIT", c(e, null));
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                e.m(aVar);
                e.p(System.currentTimeMillis());
                bVar.c("TYPE_MERGE", c(e, null));
                return true;
            }
        } finally {
            e.f26791a.unlock();
        }
    }
}
