package tb;

import com.alibaba.analytics.AnalyticsMgr;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ngd;
import tb.u9t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v9t implements ngd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f29876a = new CopyOnWriteArrayList();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public volatile ngd.a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RSoLog.d("tracker-> trySubmitCachedNodes in task enter");
            if (v9t.d(v9t.this).isEmpty()) {
                RSoLog.d("tracker-> trySubmitCachedNodes intask skip, cachedTrackNodes isEmpty !!");
                return;
            }
            RSoLog.d("tracker,trySubmitCachedNodes cachedTrackNodes.size=" + v9t.d(v9t.this).size());
            for (b bVar : v9t.d(v9t.this)) {
                v9t.f(v9t.this, b.a(bVar), b.b(bVar), b.c(bVar), b.d(bVar));
            }
            v9t.d(v9t.this).clear();
            RSoLog.d("tracker-> trySubmitCachedNodes in task done.");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f29878a;
        public final String b;
        public final Map<String, Object> c;
        public final RSoException d;

        public b(int i, String str, Map<String, Object> map, RSoException rSoException) {
            this.f29878a = i;
            this.b = str;
            this.c = map;
            this.d = rSoException;
        }

        public static /* synthetic */ int a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f989a94f", new Object[]{bVar})).intValue();
            }
            return bVar.f29878a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a8eb1e05", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ Map c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2093ab4f", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ RSoException d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RSoException) ipChange.ipc$dispatch("2fdd641c", new Object[]{bVar});
            }
            return bVar.d;
        }
    }

    public static /* synthetic */ List d(v9t v9tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ca7e3783", new Object[]{v9tVar});
        }
        return v9tVar.f29876a;
    }

    public static /* synthetic */ void f(v9t v9tVar, int i, String str, Map map, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4536e56", new Object[]{v9tVar, new Integer(i), str, map, rSoException});
        } else {
            v9tVar.i(i, str, map, rSoException);
        }
    }

    @Override // tb.ngd
    public void a(ngd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c269554", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    @Override // tb.ngd
    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb808d0", new Object[]{this, str, map});
            return;
        }
        try {
            g(map);
            if (h()) {
                ((CopyOnWriteArrayList) this.f29876a).add(new b(1, str, map, null));
                return;
            }
            i(1, str, map, null);
            j();
        } catch (Throwable th) {
            AppMonitor.Counter.commit(ngd.RSO_TRACK_MODULE, str, th.toString(), 1.0d);
        }
    }

    @Override // tb.ngd
    public void c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e42e39c", new Object[]{this, str, map});
            return;
        }
        try {
            g(map);
            if (h()) {
                ((CopyOnWriteArrayList) this.f29876a).add(new b(2, str, map, null));
                return;
            }
            i(2, str, map, null);
            j();
        } catch (Throwable th) {
            AppMonitor.Counter.commit(ngd.RSO_TRACK_MODULE, str, th.toString(), 1.0d);
        }
    }

    @Override // tb.ngd
    public void e(String str, Map<String, Object> map, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867f18d4", new Object[]{this, str, map, rSoException});
            return;
        }
        try {
            g(map);
            if (h()) {
                ((CopyOnWriteArrayList) this.f29876a).add(new b(3, str, map, rSoException));
                return;
            }
            i(3, str, map, rSoException);
            j();
        } catch (Throwable th) {
            AppMonitor.Counter.commit(ngd.RSO_TRACK_MODULE, str, th.toString(), 1.0d);
        }
    }

    public final void g(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0607e79", new Object[]{this, map});
            return;
        }
        ngd.a aVar = this.c;
        if (map == null || aVar == null) {
            RSoLog.d("srcArgs == null || binder == null");
        } else {
            ((u9t.e) aVar).a(map);
        }
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11dfa662", new Object[]{this})).booleanValue();
        }
        return true ^ AnalyticsMgr.p();
    }

    public final void i(int i, String str, Map<String, Object> map, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d632f976", new Object[]{this, new Integer(i), str, map, rSoException});
        } else if (i == 1) {
            yau.b(ngd.RSO_TRACK_MODULE, str, map);
        } else if (i == 2) {
            yau.d(ngd.RSO_TRACK_MODULE, str, map);
        } else if (i == 3) {
            if (rSoException == null) {
                yau.c(ngd.RSO_TRACK_MODULE, str, map, -1, "");
            } else {
                yau.c(ngd.RSO_TRACK_MODULE, str, map, rSoException.getErrorCode(), rSoException.getErrorMsg());
            }
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b110a183", new Object[]{this});
        } else if (this.b.compareAndSet(false, true)) {
            if (((CopyOnWriteArrayList) this.f29876a).isEmpty()) {
                RSoLog.d("tracker-> trySubmitCachedNodes skip, cachedTrackNodes isEmpty !!");
                return;
            }
            RSoLog.d("tracker-> trySubmitCachedNodes enter");
            qbn.d(new a());
        }
    }
}
