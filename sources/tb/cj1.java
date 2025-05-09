package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.mar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class cj1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public mar f17092a;
    public final ConcurrentHashMap<String, a> b = new ConcurrentHashMap<>();
    public final Set<String> c = new HashSet();
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final Context e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a();

        void c();

        void g();

        void h(long j, long j2);

        void i(long j, long j2);

        void j();

        void onEnd();

        void onError(String str);

        void onPause();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements mar.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ mar f17093a;
        public final /* synthetic */ cj1 b;

        public b(mar marVar, cj1 cj1Var) {
            this.f17093a = marVar;
            this.b = cj1Var;
        }

        @Override // tb.mar.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44d765fc", new Object[]{this, str});
                return;
            }
            cj1 cj1Var = this.b;
            a b = cj1.b(cj1Var, cj1.a(cj1Var), str);
            if (b != null) {
                b.j();
            }
        }

        @Override // tb.mar.a
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7775d5e1", new Object[]{this, str});
                return;
            }
            cj1 cj1Var = this.b;
            a b = cj1.b(cj1Var, cj1.a(cj1Var), str);
            if (b != null) {
                b.g();
            }
        }

        @Override // tb.mar.a
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd41f1d1", new Object[]{this, str});
                return;
            }
            cj1 cj1Var = this.b;
            a b = cj1.b(cj1Var, cj1.a(cj1Var), str);
            if (b != null) {
                b.onEnd();
            }
        }

        @Override // tb.mar.a
        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5cd676c", new Object[]{this, str});
                return;
            }
            cj1 cj1Var = this.b;
            a b = cj1.b(cj1Var, cj1.a(cj1Var), str);
            if (b != null) {
                b.onEnd();
            }
        }

        @Override // tb.mar.a
        public void e(long j, long j2, long j3, Object obj, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49df7f36", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj, str});
                return;
            }
            cj1 cj1Var = this.b;
            a b = cj1.b(cj1Var, cj1.a(cj1Var), str);
            if (b != null) {
                b.h(this.f17093a.a(str), this.f17093a.b(str));
            }
        }

        @Override // tb.mar.a
        public void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a1d9ccd", new Object[]{this, str});
                return;
            }
            cj1 cj1Var = this.b;
            a b = cj1.b(cj1Var, cj1.a(cj1Var), str);
            if (b != null) {
                b.i(this.f17093a.a(str), this.f17093a.b(str));
            }
        }

        @Override // tb.mar.a
        public void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a12b8ab0", new Object[]{this, str});
                return;
            }
            cj1 cj1Var = this.b;
            a b = cj1.b(cj1Var, cj1.a(cj1Var), str);
            if (b != null) {
                b.c();
            }
        }

        @Override // tb.mar.a
        public void onError(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724a699a", new Object[]{this, new Integer(i), new Integer(i2), str});
                return;
            }
            cj1 cj1Var = this.b;
            a b = cj1.b(cj1Var, cj1.a(cj1Var), str);
            if (b != null) {
                b.onError("player error: " + i + ", " + i2);
            }
        }

        @Override // tb.mar.a
        public void onPause(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb560aa8", new Object[]{this, str});
                return;
            }
            cj1 cj1Var = this.b;
            a b = cj1.b(cj1Var, cj1.a(cj1Var), str);
            if (b != null) {
                b.onPause();
            }
        }

        @Override // tb.mar.a
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
                return;
            }
            cj1 cj1Var = this.b;
            a b = cj1.b(cj1Var, cj1.a(cj1Var), str);
            if (b != null) {
                b.a();
            }
        }
    }

    static {
        t2o.a(98566213);
    }

    public cj1(Context context) {
        ckf.g(context, "context");
        this.e = context;
    }

    public static final /* synthetic */ ConcurrentHashMap a(cj1 cj1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("8c7f27dc", new Object[]{cj1Var});
        }
        return cj1Var.b;
    }

    public static final /* synthetic */ a b(cj1 cj1Var, ConcurrentHashMap concurrentHashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("dcdd6854", new Object[]{cj1Var, concurrentHashMap, str});
        }
        return cj1Var.i(concurrentHashMap, str);
    }

    public final synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a24b6e7", new Object[]{this, str});
            return;
        }
        ckf.g(str, "id");
        ((HashSet) this.c).add(str);
    }

    public final mar d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mar) ipChange.ipc$dispatch("5b124989", new Object[]{this});
        }
        mar marVar = this.f17092a;
        if (marVar == null) {
            synchronized (this) {
                marVar = this.f17092a;
                if (marVar == null) {
                    marVar = new mar(this.e);
                    this.f17092a = marVar;
                }
            }
        }
        iih iihVar = iih.INSTANCE;
        iihVar.b("AudioWrapper", "AudioInstance: " + marVar.hashCode());
        return marVar;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        mar marVar = this.f17092a;
        if (marVar != null) {
            marVar.o();
            this.f17092a = null;
        }
        this.d.compareAndSet(true, false);
    }

    public final synchronized void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8699358", new Object[]{this, str});
            return;
        }
        ckf.g(str, "id");
        ((HashSet) this.c).remove(str);
        if (((HashSet) this.c).isEmpty()) {
            e();
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("660a3743", new Object[]{this, str});
            return;
        }
        ckf.g(str, "token");
        h(str);
        d().y(str);
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc5d65b", new Object[]{this, str});
            return;
        }
        ckf.g(str, "token");
        this.b.remove(str);
    }

    public final a i(ConcurrentHashMap<String, a> concurrentHashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("da9faa5a", new Object[]{this, concurrentHashMap, str});
        }
        if (str != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac5ff24", new Object[]{this});
        } else if (this.d.compareAndSet(false, true)) {
            mar d = d();
            d.q(new b(d, this));
        }
    }

    public final void k(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b5d4eb", new Object[]{this, str, aVar});
            return;
        }
        ckf.g(str, "token");
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        this.b.put(str, aVar);
        j();
    }
}
