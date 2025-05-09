package tb;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.m;
import com.taobao.monitor.procedure.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class u5r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, d> f29163a = new HashMap();
    public static final Map<String, mdd> b = new HashMap();
    public static boolean c = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29164a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;

        public a(String str, long j, long j2, String str2, boolean z) {
            this.f29164a = str;
            this.b = j;
            this.c = j2;
            this.d = str2;
            this.e = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!u5r.a()) {
                com.taobao.monitor.procedure.c h = new c.b().j(false).o(false).m(false).l(vxm.b.e()).h();
                sxm sxmVar = sxm.b;
                mdd a2 = sxmVar.a("/" + this.f29164a, h);
                u5r.c().put(this.f29164a, a2);
                a2.c();
                a2.j("taskStart", this.b);
                a2.j("cpuStartTime", this.c);
                a2.a(m.THREAD_NAME, this.d);
                a2.a("isMainThread", Boolean.valueOf(this.e));
            } else if (!u5r.d().keySet().contains(this.f29164a)) {
                d dVar = new d(null);
                d.b(dVar, this.b);
                d.d(dVar, this.c);
                d.f(dVar, this.e);
                d.h(dVar, this.d);
                u5r.d().put(this.f29164a, dVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator it = u5r.d().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                d dVar = (d) entry.getValue();
                if (d.i(dVar) != 0) {
                    com.taobao.monitor.procedure.c h = new c.b().j(false).o(false).m(false).l(vxm.b.e()).h();
                    sxm sxmVar = sxm.b;
                    mdd a2 = sxmVar.a("/" + str, h);
                    a2.c();
                    a2.j("taskStart", d.a(dVar));
                    a2.j("cpuStartTime", d.c(dVar));
                    a2.a("isMainThread", Boolean.valueOf(d.e(dVar)));
                    a2.a(m.THREAD_NAME, d.g(dVar));
                    a2.j("taskEnd", d.i(dVar));
                    a2.j("cpuEndTime", d.k(dVar));
                    a2.end();
                    it.remove();
                }
            }
            u5r.b(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f29166a;
        public long b;
        public long c;
        public long d;
        public boolean e;
        public String f;

        public d() {
        }

        public static /* synthetic */ long a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ed8ba3aa", new Object[]{dVar})).longValue();
            }
            return dVar.f29166a;
        }

        public static /* synthetic */ long b(d dVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a68c68c4", new Object[]{dVar, new Long(j)})).longValue();
            }
            dVar.f29166a = j;
            return j;
        }

        public static /* synthetic */ long c(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("266c0449", new Object[]{dVar})).longValue();
            }
            return dVar.c;
        }

        public static /* synthetic */ long d(d dVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("89b81c05", new Object[]{dVar, new Long(j)})).longValue();
            }
            dVar.c = j;
            return j;
        }

        public static /* synthetic */ boolean e(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f4c64f8", new Object[]{dVar})).booleanValue();
            }
            return dVar.e;
        }

        public static /* synthetic */ boolean f(d dVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ce40b66", new Object[]{dVar, new Boolean(z)})).booleanValue();
            }
            dVar.e = z;
            return z;
        }

        public static /* synthetic */ String g(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b154a76d", new Object[]{dVar});
            }
            return dVar.f;
        }

        public static /* synthetic */ String h(d dVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8737b025", new Object[]{dVar, str});
            }
            dVar.f = str;
            return str;
        }

        public static /* synthetic */ long i(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d10d2626", new Object[]{dVar})).longValue();
            }
            return dVar.b;
        }

        public static /* synthetic */ long j(d dVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("333b35c8", new Object[]{dVar, new Long(j)})).longValue();
            }
            dVar.b = j;
            return j;
        }

        public static /* synthetic */ long k(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ed86c5", new Object[]{dVar})).longValue();
            }
            return dVar.d;
        }

        public static /* synthetic */ long l(d dVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1666e909", new Object[]{dVar, new Long(j)})).longValue();
            }
            dVar.d = j;
            return j;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return c;
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        c = z;
        return z;
    }

    public static /* synthetic */ Map c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Map d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e220286e", new Object[0]);
        }
        return f29163a;
    }

    public static void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d03401", new Object[]{runnable});
        } else {
            w9a.g().f().post(runnable);
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0ac9f2", new Object[]{str});
        } else {
            g(str, null, null);
        }
    }

    public static void g(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c543fdcb", new Object[]{str, str2, map});
        } else {
            e(new b(str, out.a(), SystemClock.currentThreadTimeMillis(), str2, map));
        }
    }

    public static void h(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fa62908", new Object[]{str, str2, map});
        } else {
            g(str, str2, map);
        }
    }

    public static void i(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f90679", new Object[]{str});
            return;
        }
        long a2 = out.a();
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        String name = Thread.currentThread().getName();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            z = true;
        } else {
            z = false;
        }
        e(new a(str, a2, currentThreadTimeMillis, name, z));
    }

    public static void j(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e944dab", new Object[]{str, map});
        } else {
            g(str, null, map);
        }
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7cbf49", new Object[0]);
        } else {
            e(new c());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29165a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Map e;

        public b(String str, long j, long j2, String str2, Map map) {
            this.f29165a = str;
            this.b = j;
            this.c = j2;
            this.d = str2;
            this.e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!u5r.a()) {
                mdd mddVar = (mdd) u5r.c().get(this.f29165a);
                d dVar = (d) u5r.d().get(this.f29165a);
                if (mddVar == null && dVar != null) {
                    com.taobao.monitor.procedure.c h = new c.b().j(false).o(false).m(false).l(vxm.b.e()).h();
                    sxm sxmVar = sxm.b;
                    mddVar = sxmVar.a("/" + this.f29165a, h);
                    mddVar.c();
                    mddVar.j("taskStart", d.a(dVar));
                    mddVar.j("cpuStartTime", d.c(dVar));
                    mddVar.a("isMainThread", Boolean.valueOf(d.e(dVar)));
                    mddVar.a(m.THREAD_NAME, d.g(dVar));
                    u5r.d().remove(this.f29165a);
                }
                if (mddVar != null) {
                    mddVar.j("taskEnd", this.b);
                    mddVar.j("cpuEndTime", this.c);
                    if (!TextUtils.isEmpty(this.d)) {
                        mddVar.a("errorType", this.d);
                    }
                    Map map = this.e;
                    if (map != null && map.size() > 0) {
                        try {
                            for (Map.Entry entry : this.e.entrySet()) {
                                String valueOf = String.valueOf(entry.getKey());
                                if (!TextUtils.isEmpty(valueOf)) {
                                    mddVar.a(valueOf, entry.getValue());
                                }
                            }
                        } catch (Throwable th) {
                            zq6.a("TBAPMAdapterSubTaskManager", th);
                        }
                    }
                    mddVar.end();
                    u5r.c().remove(this.f29165a);
                }
            } else if (u5r.d().keySet().contains(this.f29165a)) {
                d dVar2 = (d) u5r.d().get(this.f29165a);
                d.j(dVar2, this.b);
                d.l(dVar2, this.c);
            }
        }
    }
}
