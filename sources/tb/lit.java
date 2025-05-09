package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.weex_framework.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class lit {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public static final ExecutorService c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Set<tzd>> f23362a = new HashMap<>();
    public final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        static {
            t2o.a(993001769);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    public static final void k(c cVar, final Map map, yko ykoVar, final Map map2, final lit litVar, final ConcurrentHashMap concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73755654", new Object[]{cVar, map, ykoVar, map2, litVar, concurrentHashMap});
            return;
        }
        ckf.g(cVar, "$copyInfo");
        ckf.g(map, "$firstScreenAsyncTemplates");
        ckf.g(ykoVar, "$core");
        ckf.g(map2, "$asyncTemplates");
        ckf.g(litVar, "this$0");
        ckf.g(concurrentHashMap, "$files");
        final rpc.d c2 = xjt.c(cVar, map, ykoVar, new ConcurrentHashMap());
        if (c2 != null) {
            litVar.b.post(new Runnable() { // from class: tb.zqz
                @Override // java.lang.Runnable
                public final void run() {
                    lit.l(concurrentHashMap, c2, litVar, map);
                }
            });
        }
        final rpc.d c3 = xjt.c(cVar, map2, ykoVar, new ConcurrentHashMap());
        if (c3 != null) {
            litVar.b.post(new Runnable() { // from class: tb.arz
                @Override // java.lang.Runnable
                public final void run() {
                    lit.m(concurrentHashMap, c3, litVar, map2);
                }
            });
        }
    }

    public static final void l(ConcurrentHashMap concurrentHashMap, rpc.d dVar, lit litVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fce0542e", new Object[]{concurrentHashMap, dVar, litVar, map});
            return;
        }
        ckf.g(concurrentHashMap, "$files");
        ckf.g(dVar, "$it");
        ckf.g(litVar, "this$0");
        ckf.g(map, "$firstScreenAsyncTemplates");
        concurrentHashMap.putAll(dVar.f27532a);
        Map<String, rpc.c> map2 = dVar.f27532a;
        ckf.f(map2, "result");
        litVar.e(map, map2);
    }

    public static final void m(ConcurrentHashMap concurrentHashMap, rpc.d dVar, lit litVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729359ee", new Object[]{concurrentHashMap, dVar, litVar, map});
            return;
        }
        ckf.g(concurrentHashMap, "$files");
        ckf.g(dVar, "$it");
        ckf.g(litVar, "this$0");
        ckf.g(map, "$asyncTemplates");
        concurrentHashMap.putAll(dVar.f27532a);
        Map<String, rpc.c> map2 = dVar.f27532a;
        ckf.f(map2, "result");
        litVar.e(map, map2);
    }

    public static final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84b2af9a", new Object[0]);
        }
        return "xsearch_lazy_download";
    }

    public final void c(c cVar, final Map<String, ? extends TemplateBean> map, final Map<String, ? extends TemplateBean> map2, final yko ykoVar, final ConcurrentHashMap<String, rpc.c> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a721e9", new Object[]{this, cVar, map, map2, ykoVar, concurrentHashMap});
            return;
        }
        ckf.g(cVar, "info");
        ckf.g(map, "firstScreenAsyncTemplates");
        ckf.g(map2, "asyncTemplates");
        ckf.g(ykoVar, "core");
        ckf.g(concurrentHashMap, vs3.FILES_DIR_NAME);
        final c cVar2 = new c();
        cVar2.q(cVar.e());
        cVar2.r(cVar.i());
        c.execute(new Runnable() { // from class: tb.yqz
            @Override // java.lang.Runnable
            public final void run() {
                lit.k(c.this, map, ykoVar, map2, this, concurrentHashMap);
            }
        });
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f52a6f7", new Object[]{this, str});
            return;
        }
        Set<tzd> set = this.f23362a.get(str);
        if (set != null) {
            for (tzd tzdVar : set) {
                tzdVar.a();
            }
        }
    }

    public final void e(Map<String, ? extends TemplateBean> map, Map<String, ? extends rpc.c> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2509c31d", new Object[]{this, map, map2});
            return;
        }
        for (Map.Entry<String, ? extends TemplateBean> entry : map.entrySet()) {
            if (map2.containsKey(((TemplateBean) entry.getValue()).url)) {
                f(entry.getKey());
            } else {
                d(entry.getKey());
            }
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16896f8b", new Object[]{this, str});
            return;
        }
        Set<tzd> set = this.f23362a.get(str);
        if (set != null) {
            for (tzd tzdVar : set) {
                tzdVar.c();
            }
        }
    }

    public final void g(String str, tzd tzdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1971716", new Object[]{this, str, tzdVar});
            return;
        }
        ckf.g(tzdVar, DataReceiveMonitor.CB_LISTENER);
        if (str != null) {
            Set<tzd> set = this.f23362a.get(str);
            if (set == null) {
                set = new HashSet<>();
                this.f23362a.put(str, set);
            }
            set.add(tzdVar);
        }
    }

    public final void h(String str, tzd tzdVar) {
        Set<tzd> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1264f5d", new Object[]{this, str, tzdVar});
            return;
        }
        ckf.g(tzdVar, DataReceiveMonitor.CB_LISTENER);
        if (str != null && (set = this.f23362a.get(str)) != null) {
            set.remove(tzdVar);
        }
    }

    static {
        t2o.a(993001768);
        ThreadPoolExecutor threadPoolExecutor = null;
        ExecutorService newFixedThreadPool = VExecutors.newFixedThreadPool(3, new qqt() { // from class: tb.xqz
            @Override // tb.qqt
            public final String newThreadName() {
                String n;
                n = lit.n();
                return n;
            }
        }, new ThreadPoolExecutor.DiscardOldestPolicy());
        ckf.f(newFixedThreadPool, "newFixedThreadPool(...)");
        c = newFixedThreadPool;
        if (newFixedThreadPool instanceof ThreadPoolExecutor) {
            threadPoolExecutor = (ThreadPoolExecutor) newFixedThreadPool;
        }
        if (threadPoolExecutor != null) {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
        }
    }
}
