package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.RemoConfig;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.d;
import com.taobao.android.remoteso.resolver2.j;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.qbo;
import tb.yb1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class jbn implements igd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kgd f21894a;
    public final cgd b;
    public final com.taobao.android.remoteso.index.d c;
    public final lbn d;
    public final b7o e;
    public final hln<String> f;
    public final rzc g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements qbo.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f21895a;
        public final /* synthetic */ long b;

        public a(long j, long j2) {
            this.f21895a = j;
            this.b = j2;
        }

        @Override // tb.qbo.b
        public void a(qbo.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0294393", new Object[]{this, cVar});
            } else {
                jbn.a(jbn.this, cVar);
            }
        }

        @Override // tb.qbo.b
        public int count() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("507fb609", new Object[]{this})).intValue();
            }
            return (int) this.f21895a;
        }

        @Override // tb.qbo.b
        public long interval() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a25b7ec0", new Object[]{this})).longValue();
            }
            return this.b;
        }

        @Override // tb.qbo.b
        public String tag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2499139f", new Object[]{this});
            }
            return "prefetch-so";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements qbo.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f21896a;
        public final /* synthetic */ long b;

        public b(long j, long j2) {
            this.f21896a = j;
            this.b = j2;
        }

        @Override // tb.qbo.b
        public void a(qbo.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0294393", new Object[]{this, cVar});
            } else {
                jbn.b(jbn.this, cVar);
            }
        }

        @Override // tb.qbo.b
        public int count() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("507fb609", new Object[]{this})).intValue();
            }
            return (int) this.f21896a;
        }

        @Override // tb.qbo.b
        public long interval() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a25b7ec0", new Object[]{this})).longValue();
            }
            return this.b;
        }

        @Override // tb.qbo.b
        public String tag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2499139f", new Object[]{this});
            }
            return "prefetch-assets";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements yb1.a<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public boolean test(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a78fe5a7", new Object[]{this, str})).booleanValue();
            }
            return jbn.c(jbn.this, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qbo.c f21898a;

        public d(qbo.c cVar) {
            this.f21898a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f21898a.b.run();
            RSoLog.d("prefetch-so -> onStop, has failed, need retry");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements gk4<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f21899a;
        public final /* synthetic */ qbo.c b;
        public final /* synthetic */ long c;

        public e(i iVar, qbo.c cVar, long j) {
            this.f21899a = iVar;
            this.b = cVar;
            this.c = j;
        }

        /* renamed from: b */
        public Void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("9de713d0", new Object[]{this, str});
            }
            z6o c = j.c(jbn.d(jbn.this), str);
            if (c == null) {
                RSoLog.d("prefetch-so -> skip " + str + ", info targetReq == null");
                return null;
            }
            if (jbn.e(jbn.this, c, this.f21899a, this.b.a())) {
                uos.f(this.c);
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qbo.c f21900a;

        public f(qbo.c cVar) {
            this.f21900a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f21900a.b.run();
            RSoLog.d("prefetch-assets -> onStop, has failed, need retry");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.a f21901a;

        public g(jbn jbnVar, d.a aVar) {
            this.f21901a = aVar;
        }

        @Override // com.taobao.android.remoteso.resolver2.d.a
        public void a(a7o a7oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def47b8e", new Object[]{this, a7oVar});
            } else {
                this.f21901a.a(a7oVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class h implements Comparable<h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f21902a;
        private final SoIndexData.SoFileInfo b;
        private final int c;

        public h(String str, SoIndexData.SoFileInfo soFileInfo, int i) {
            this.f21902a = str;
            this.b = soFileInfo;
            this.c = i;
        }

        public static /* synthetic */ String a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a52902db", new Object[]{hVar});
            }
            return hVar.f21902a;
        }

        public static /* synthetic */ SoIndexData.SoFileInfo b(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("892e02fe", new Object[]{hVar});
            }
            return hVar.b;
        }

        /* renamed from: d */
        public int compareTo(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6768ec63", new Object[]{this, hVar})).intValue();
            }
            return Integer.compare(this.c, hVar.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class i implements d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f21903a;
        public final Runnable b;
        public volatile boolean c = true;

        public i(int i, Runnable runnable) {
            this.f21903a = new AtomicInteger(i);
            this.b = runnable;
        }

        @Override // com.taobao.android.remoteso.resolver2.d.a
        public void a(a7o a7oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("def47b8e", new Object[]{this, a7oVar});
                return;
            }
            if (!a7oVar.j()) {
                RSoLog.d("prefetch -> found failed fetch, result=" + a7oVar);
                this.c = false;
            }
            if (this.f21903a.decrementAndGet() > 0) {
                return;
            }
            if (this.c) {
                RSoLog.d("prefetch -> all result success, stop prefetch");
                return;
            }
            RSoLog.d("prefetch -> some result failed, need retry prefetch");
            this.b.run();
        }
    }

    public jbn(kgd kgdVar, cgd cgdVar, com.taobao.android.remoteso.index.d dVar, lbn lbnVar, b7o b7oVar, hln<String> hlnVar, rzc rzcVar) {
        this.f21894a = kgdVar;
        this.b = cgdVar;
        this.c = dVar;
        this.d = lbnVar;
        this.e = b7oVar;
        this.f = hlnVar;
        this.g = rzcVar;
    }

    public static /* synthetic */ void a(jbn jbnVar, qbo.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357541d", new Object[]{jbnVar, cVar});
        } else {
            jbnVar.g(cVar);
        }
    }

    public static /* synthetic */ void b(jbn jbnVar, qbo.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c72efc", new Object[]{jbnVar, cVar});
        } else {
            jbnVar.f(cVar);
        }
    }

    public static /* synthetic */ boolean c(jbn jbnVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59dc8375", new Object[]{jbnVar, str})).booleanValue();
        }
        return jbnVar.h(str);
    }

    public static /* synthetic */ com.taobao.android.remoteso.index.d d(jbn jbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.remoteso.index.d) ipChange.ipc$dispatch("cb8df9c7", new Object[]{jbnVar});
        }
        return jbnVar.c;
    }

    public static /* synthetic */ boolean e(jbn jbnVar, z6o z6oVar, d.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53dbd553", new Object[]{jbnVar, z6oVar, aVar, new Boolean(z)})).booleanValue();
        }
        return jbnVar.i(z6oVar, aVar, z);
    }

    public final void g(qbo.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726ce59f", new Object[]{this, cVar});
            return;
        }
        long c2 = this.b.c("key_prefetch_request_interval", 1000L);
        Collection<String> b2 = yb1.b(this.c.p(), new c());
        if (b2.size() < 1) {
            RSoLog.d("prefetch-so -> skipped, libNames.size() < 1");
        } else {
            this.f.a(b2, new e(new i(b2.size(), new d(cVar)), cVar, c2));
        }
    }

    @Override // tb.igd
    public void trigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7573e3f", new Object[]{this});
            return;
        }
        RSoLog.d("prefetch -> startPreFetch enter");
        if (this.b.a("key_prefetch_disabled", false)) {
            RSoLog.d("prefetch ->  prefetch disabled.");
            return;
        }
        long c2 = this.b.c("key_prefetch_retry_count", 5L);
        cgd cgdVar = this.b;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        new qbo(new a(c2, cgdVar.c("key_prefetch_so_retry_interval", timeUnit.toMillis(10L)))).c(0L);
        new qbo(new b(c2, this.b.c("key_prefetch_assets_retry_interval", timeUnit.toMillis(15L)))).c(0L);
    }

    public final boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28a6bfdf", new Object[]{this, str})).booleanValue();
        }
        if ("primary7.prof,primary80.prof,primary81.prof".contains(str)) {
            RSoLog.d("prefetch -> shouldPrefetch = false, VALUE_PREFETCH_BLACK_LIST contains lib = " + str);
            return false;
        } else if (this.b.b("black_list_prefetch_lib", "").contains(str)) {
            RSoLog.d("prefetch -> shouldPrefetch = false, in black list, lib = " + str);
            return false;
        } else if (this.d.c(str)) {
            RSoLog.d("prefetch -> shouldPrefetch = true, by RSoPrefetchRecorder, lib = " + str);
            return true;
        } else {
            SoInfo2 e2 = this.c.e(str);
            if (e2 == null || e2.ext.allowPreFetch) {
                return true;
            }
            RSoLog.d("prefetch -> shouldPrefetch = false, from soinfo2.allowPreFetch, lib = " + str);
            return false;
        }
    }

    public final boolean i(z6o z6oVar, d.a aVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b2e6024", new Object[]{this, z6oVar, aVar, new Boolean(z)})).booleanValue();
        }
        RSoLog.d("prefetch -> resolveOne, do resolveOneResult ,  targetReq=" + z6oVar.b() + ",  callback=" + aVar);
        if (z) {
            str = "prefetch_retry";
        } else {
            str = "prefetch";
        }
        try {
            z6oVar.m(str);
            a7o h2 = this.e.h(z6oVar);
            if (h2.j()) {
                aVar.a(h2);
                return false;
            }
            this.e.i(z6oVar, new g(this, aVar));
            return true;
        } catch (Throwable th) {
            rbn.g("prefetch->resolveOne", th);
            aVar.a(j.f(z6oVar, RSoException.error(6311, th), "prefetch-error"));
            RSoLog.g("prefetch -> resolveOne, resolve lib failed");
            return false;
        }
    }

    public final void f(qbo.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e04e7486", new Object[]{this, cVar});
            return;
        }
        RSoLog.d("prefetch-assets ->  start index = " + cVar.f26658a);
        long c2 = this.b.c("key_prefetch_assets_request_group_size", 9L);
        long c3 = this.b.c("key_prefetch_assets_request_group_interval", 1100L);
        long c4 = this.b.c("key_prefetch_assets_request_interval", 100L);
        long c5 = this.b.c("key_prefetch_assets_pv_threshold", 10L);
        HashMap hashMap = new HashMap();
        List<RemoConfig> q = this.c.q();
        for (RemoConfig remoConfig : q) {
            String uri = remoConfig.getUri();
            if (trq.e(uri)) {
                hashMap.put(uri, Integer.valueOf(remoConfig.getPv()));
            }
        }
        RSoLog.d("prefetch-assets ->  configs.size = " + q.size());
        PriorityQueue priorityQueue = new PriorityQueue();
        for (Map.Entry<String, SoIndexData.SoFileInfo> entry : this.c.i().getAssets().entrySet()) {
            String key = entry.getKey();
            SoIndexData.SoFileInfo value = entry.getValue();
            Integer num = (Integer) hashMap.get(key);
            if (num != null) {
                c3 = c3;
                if (num.intValue() >= c5) {
                    priorityQueue.add(new h(key, value, num.intValue()));
                }
            } else {
                c3 = c3;
            }
        }
        RSoLog.d("prefetch-assets -> nodes.size = " + priorityQueue.size());
        if (priorityQueue.isEmpty()) {
            RSoLog.d("prefetch-assets -> stopped, nodes.size = 0");
            return;
        }
        i iVar = new i(priorityQueue.size(), new f(cVar));
        Iterator it = priorityQueue.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            int i3 = i2 + 1;
            if (i(z6o.i(h.a(hVar), h.b(hVar), null), iVar, cVar.a())) {
                uos.f(((long) i3) % c2 == 0 ? c3 : c4);
            }
            i2 = i3;
        }
    }
}
