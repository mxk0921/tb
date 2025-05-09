package com.taobao.weaver.prefetch;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weaver.prefetch.PerformanceData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.hqm;
import tb.iqm;
import tb.mqm;
import tb.w7a;
import tb.wow;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static a d;

    /* renamed from: a  reason: collision with root package name */
    public final List<mqm> f14104a = new CopyOnWriteArrayList();
    public final LruCache<String, iqm> b = new LruCache<>(20);
    public final Map<String, List<w7a>> c = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.weaver.prefetch.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class C0799a extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ mqm b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0799a(String str, mqm mqmVar, long j, String str2) {
            super(a.this, str);
            this.b = mqmVar;
        }

        public static /* synthetic */ Object ipc$super(C0799a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weaver/prefetch/WMLPrefetch$1");
        }

        public void b(iqm iqmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ec50af4", new Object[]{this, iqmVar});
                return;
            }
            a.a(a.this, a(), iqmVar);
            PerformanceData performanceData = new PerformanceData();
            this.b.getClass();
            System.currentTimeMillis();
            iqmVar.d = performanceData;
            List<w7a> list = (List) a.b(a.this).remove(a());
            if (list != null) {
                for (w7a w7aVar : list) {
                    a.this.c(a(), w7aVar);
                }
            }
        }

        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            List<w7a> list = (List) a.b(a.this).remove(a());
            if (list != null) {
                for (w7a w7aVar : list) {
                    iqm iqmVar = new iqm();
                    iqmVar.d = new PerformanceData();
                    PerformanceData performanceData = iqmVar.d;
                    PerformanceData.PFResult pFResult = PerformanceData.PFResult.EXCEPT;
                    performanceData.f14103a = pFResult;
                    pFResult.setCode(str);
                    iqmVar.d.f14103a.setMsg(str2);
                    w7aVar.b(iqmVar);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public abstract class b implements hqm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f14105a;

        public b(a aVar, String str) {
            this.f14105a = str;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("33eef55f", new Object[]{this});
            }
            return this.f14105a;
        }
    }

    public static /* synthetic */ void a(a aVar, String str, iqm iqmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27abf604", new Object[]{aVar, str, iqmVar});
        } else {
            aVar.h(str, iqmVar);
        }
    }

    public static /* synthetic */ Map b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8916531b", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("82c78ef2", new Object[0]);
        }
        if (d == null) {
            synchronized (a.class) {
                try {
                    if (d == null) {
                        d = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public void c(String str, w7a w7aVar) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5cadda", new Object[]{this, str, w7aVar});
            return;
        }
        iqm iqmVar = this.b.get(str);
        if (iqmVar != null) {
            System.currentTimeMillis();
            if (iqmVar.d == null) {
                iqmVar.d = new PerformanceData();
            }
            iqmVar.d.getClass();
            if (iqmVar.a() || iqmVar.c()) {
                iqmVar.d.f14103a = PerformanceData.PFResult.DATA_EXPIRED;
                w7aVar.b(iqmVar);
                this.b.remove(str);
                return;
            }
            iqmVar.d.f14103a = PerformanceData.PFResult.SUCCESS;
            System.currentTimeMillis();
            w7aVar.a(iqmVar);
            iqmVar.b();
            if (iqmVar.c()) {
                this.b.remove(str);
            }
        } else if (!((ConcurrentHashMap) this.c).containsKey(str) || (list = (List) ((ConcurrentHashMap) this.c).get(str)) == null) {
            iqm iqmVar2 = new iqm();
            PerformanceData performanceData = new PerformanceData();
            iqmVar2.d = performanceData;
            performanceData.f14103a = PerformanceData.PFResult.NO_PREFETCH_DATA;
            w7aVar.b(iqmVar2);
        } else {
            list.add(w7aVar);
        }
    }

    public final String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44e8dfb3", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() + parse.getPath();
    }

    public String f(String str, Map<String, Object> map) {
        wow wowVar;
        mqm mqmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5051e1cd", new Object[]{this, str, map});
        }
        Iterator it = ((CopyOnWriteArrayList) this.f14104a).iterator();
        wow wowVar2 = null;
        while (true) {
            if (!it.hasNext()) {
                wowVar = wowVar2;
                break;
            }
            mqmVar = (mqm) it.next();
            wowVar = mqmVar.b(str, map);
            PrefetchType prefetchType = wowVar.f30829a;
            if (prefetchType != PrefetchType.NOT_SUPPORTED) {
                if (prefetchType == PrefetchType.CUSTOMIZED) {
                    break;
                } else if (prefetchType == PrefetchType.SUPPORTED) {
                    break;
                }
            }
            wowVar2 = wowVar;
        }
        mqmVar = null;
        if (mqmVar == null || wowVar == null) {
            return null;
        }
        String e = e(str);
        if (!TextUtils.isEmpty(wowVar.b)) {
            e = e + "#" + wowVar.b;
        }
        ((ConcurrentHashMap) this.c).put(e, new CopyOnWriteArrayList());
        return mqmVar.a(str, map, new C0799a(e, mqmVar, System.currentTimeMillis(), str));
    }

    public void g(mqm mqmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fac1bb6", new Object[]{this, mqmVar});
        } else {
            ((CopyOnWriteArrayList) this.f14104a).add(mqmVar);
        }
    }

    public final void h(String str, iqm iqmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8310f60", new Object[]{this, str, iqmVar});
        } else if (iqmVar != null) {
            iqmVar.d();
            this.b.put(str, iqmVar);
        }
    }
}
