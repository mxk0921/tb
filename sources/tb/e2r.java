package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.data.AccsStreamConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e2r implements fud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, x1r> f18232a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, c2r<f2r>> b = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Map<String, c2r<f2r>>> c = new ConcurrentHashMap<>();
    public final Map<String, Map<String, List<f2r>>> d = new ConcurrentHashMap();
    public final Map<String, AccsStreamConfig> e = new ConcurrentHashMap();
    public final Map<String, PriorityBlockingQueue<f2r>> f = new ConcurrentHashMap();
    public long g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c2r f18234a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public b(c2r c2rVar, String str, String str2, int i, int i2) {
            this.f18234a = c2rVar;
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            List<f2r> t = this.f18234a.t(this.b, this.c, this.d, this.e);
            if (t != null && t.size() > 0) {
                for (f2r f2rVar : t) {
                    d2r.b().e(f2rVar);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x1r f18235a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public c(x1r x1rVar, String str, String str2, int i, int i2) {
            this.f18235a = x1rVar;
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f18235a.b(this.b, this.c, this.d, this.e);
            }
        }
    }

    static {
        t2o.a(343933181);
        t2o.a(343933194);
    }

    public static /* synthetic */ Map e(e2r e2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("135f2313", new Object[]{e2rVar});
        }
        return e2rVar.f;
    }

    @Override // tb.fud
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a4c7a0", new Object[]{this, str, str2});
        } else {
            d2r.b().g(str, str2);
        }
    }

    @Override // tb.fud
    public boolean b(f2r f2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a1778d8", new Object[]{this, f2rVar})).booleanValue();
        }
        if (!g(f2rVar.d())) {
            return false;
        }
        d2r.b().e(f2rVar);
        return true;
    }

    @Override // tb.fud
    public String c(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3485d772", new Object[]{this, str, obj});
        }
        x1r x1rVar = this.f18232a.get(str);
        if (x1rVar != null) {
            return x1rVar.d(obj);
        }
        return null;
    }

    @Override // tb.fud
    public void d(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9527b7f", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        x1r x1rVar = this.f18232a.get(str);
        if (x1rVar != null) {
            yqt.c().execute(new c(x1rVar, str, str2, i, i2));
        }
    }

    public void f(f2r f2rVar) {
        c2r<f2r> c2rVar;
        AccsStreamConfig accsStreamConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc8895e", new Object[]{this, f2rVar});
            return;
        }
        String d = f2rVar.d();
        String e = f2rVar.e();
        if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(e)) {
            if (!g(d)) {
                k(f2rVar);
                return;
            }
            Map<String, c2r<f2r>> map = this.c.get(d);
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.c.put(d, map);
                c2rVar = null;
            } else {
                c2rVar = map.get(e);
            }
            if (c2rVar == null && (accsStreamConfig = (AccsStreamConfig) ((ConcurrentHashMap) this.e).get(d)) != null) {
                c2rVar = new c2r<>(d, e, accsStreamConfig.getStartSeq(), accsStreamConfig.getSeqSnapshotInterval(), accsStreamConfig.getSyncTimeoutInMill(), accsStreamConfig.isSaveDB(), this);
                map.put(e, c2rVar);
            }
            if (!g(d) || c2rVar == null) {
                k(f2rVar);
            } else {
                c2rVar.offer(f2rVar);
            }
        }
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9fd69d5", new Object[]{this, str})).booleanValue();
        }
        return this.f18232a.containsKey(str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f18233a;
        public final /* synthetic */ String b;

        public a(WeakReference weakReference, String str) {
            this.f18233a = weakReference;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            x1r x1rVar = (x1r) this.f18233a.get();
            if (x1rVar == null) {
                pmo.c("SyncManagerImpl", "output() callback was recycled", new Object[0]);
                return;
            }
            synchronized (x1rVar.f31075a) {
                try {
                    f2r f2rVar = (f2r) ((PriorityBlockingQueue) e2r.e(e2r.this).get(this.b)).poll();
                    if (f2rVar != null) {
                        String c = f2rVar.c();
                        if (f2rVar.a() == null && !TextUtils.isEmpty(c)) {
                            f2rVar.g(x1rVar.a(c));
                        }
                        pmo.c("SyncManagerImpl", "output", f2rVar);
                        x1rVar.c(f2rVar);
                    }
                }
            }
        }
    }

    public void h(f2r f2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bbaa955", new Object[]{this, f2rVar});
            return;
        }
        x1r x1rVar = this.f18232a.get(f2rVar.d());
        if (x1rVar == null) {
            pmo.c("SyncManagerImpl", "output, callback = null", new Object[0]);
            return;
        }
        String d = f2rVar.d();
        PriorityBlockingQueue priorityBlockingQueue = (PriorityBlockingQueue) ((ConcurrentHashMap) this.f).get(d);
        if (priorityBlockingQueue == null) {
            priorityBlockingQueue = new PriorityBlockingQueue(64, d2r.comparator);
            ((ConcurrentHashMap) this.f).put(d, priorityBlockingQueue);
        }
        priorityBlockingQueue.offer(f2rVar);
        yqt.c().execute(new a(new WeakReference(x1rVar), d));
    }

    public void i(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fd2683", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        c2r<f2r> c2rVar = this.b.get(str);
        if (c2rVar == null) {
            pmo.c("SyncManagerImpl", "query() executor = null", new Object[0]);
        } else {
            yqt.b().execute(new b(c2rVar, str, str2, i, i2));
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4c2d4c", new Object[]{this, str});
        } else if (g(str)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.g;
            if (j <= 0 || elapsedRealtime - j > 5000) {
                this.g = elapsedRealtime;
                Map<String, c2r<f2r>> map = this.c.get(str);
                if (map != null) {
                    for (c2r<f2r> c2rVar : map.values()) {
                        if (c2rVar != null) {
                            c2rVar.s();
                        }
                    }
                }
                pmo.c("SyncManagerImpl", "tryToPull() ", new Object[0]);
            }
        }
    }

    public final void k(f2r f2rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44950047", new Object[]{this, f2rVar});
            return;
        }
        pmo.c("SyncManagerImpl", "saveToLocal", f2rVar);
        Map map = (Map) ((ConcurrentHashMap) this.d).get(f2rVar.d());
        if (map == null) {
            map = new HashMap();
            ((ConcurrentHashMap) this.d).put(f2rVar.d(), map);
        }
        List list = (List) map.get(f2rVar.e());
        if (list == null) {
            list = new ArrayList(10);
            map.put(f2rVar.e(), list);
        }
        list.add(f2rVar);
    }

    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942e3b7f", new Object[]{this, str, str2});
        } else if (!g(str)) {
            pmo.c("SyncManagerImpl", "recover() not subscribed", "serviceId", str);
            ((ConcurrentHashMap) this.d).remove(str);
        } else {
            Map map = (Map) ((ConcurrentHashMap) this.d).get(str);
            if (map != null) {
                for (List<f2r> list : map.values()) {
                    if (list != null && !list.isEmpty()) {
                        for (f2r f2rVar : list) {
                            f(f2rVar);
                        }
                    }
                }
            }
        }
    }

    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64fe9aac", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && g(str)) {
            pmo.c("SyncManagerImpl", "unSubscribeStream", "serviceId", str);
            Map<String, c2r<f2r>> remove = this.c.remove(str);
            if (remove != null) {
                for (c2r<f2r> c2rVar : remove.values()) {
                    if (c2rVar != null) {
                        c2rVar.v();
                    }
                }
            }
            this.f18232a.remove(str);
        }
    }

    public boolean l(String str, String str2, int i, int i2, long j, boolean z, x1r x1rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("593910e6", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Long(j), new Boolean(z), x1rVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || x1rVar == null) {
            pmo.c("SyncManagerImpl", "SyncManager.subscribeStream(), serviceId or callback = NULL!", new Object[0]);
            return false;
        }
        pmo.c("SyncManagerImpl", "subscribeStream", "serviceId", str, "streamId", str2, "startFromSeq", Integer.valueOf(i), "snapInterval", Integer.valueOf(i2));
        this.f18232a.put(str, x1rVar);
        AccsStreamConfig accsStreamConfig = new AccsStreamConfig(str);
        accsStreamConfig.setStartSeq(i);
        accsStreamConfig.setSeqSnapshotInterval(i2);
        accsStreamConfig.setSyncTimeoutInMill(j);
        accsStreamConfig.setSaveDB(z);
        ((ConcurrentHashMap) this.e).put(str, accsStreamConfig);
        j(str, null);
        return true;
    }
}
