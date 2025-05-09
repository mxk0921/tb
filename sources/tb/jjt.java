package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.task.Coordinator;
import java.util.HashSet;
import java.util.Iterator;
import tb.jjt;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class jjt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jjt INSTANCE = new jjt();

    /* renamed from: a  reason: collision with root package name */
    public static final f93 f22032a = new f93();
    public static final HashSet<pnh> b = new HashSet<>();
    public static final Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ e93 c;
        public final /* synthetic */ String d;

        public a(e93 e93Var, String str) {
            this.c = e93Var;
            this.d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(rpc.c cVar, e93 e93Var, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cadcc61a", new Object[]{cVar, e93Var, str});
                return;
            }
            ckf.g(e93Var, "$info");
            ckf.g(str, "$type");
            if (cVar == null || cVar.d() == null) {
                e93Var.e(false);
                return;
            }
            e93Var.d(cVar);
            jjt.d(jjt.INSTANCE, str);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/performance/perf/TemplateManager$loadTemplate$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            final rpc.c c = jjt.a().c(this.c);
            Handler b = jjt.b();
            final e93 e93Var = this.c;
            final String str = this.d;
            b.post(new Runnable() { // from class: tb.mrz
                @Override // java.lang.Runnable
                public final void run() {
                    jjt.a.f(rpc.c.this, e93Var, str);
                }
            });
        }
    }

    static {
        t2o.a(815792838);
    }

    public static final /* synthetic */ f93 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f93) ipChange.ipc$dispatch("43acf05b", new Object[0]);
        }
        return f22032a;
    }

    public static final /* synthetic */ Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("513a18bf", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ void d(jjt jjtVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01049b6", new Object[]{jjtVar, str});
        } else {
            jjtVar.k(str);
        }
    }

    public static final void o(pnh pnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8c6e93", new Object[]{pnhVar});
            return;
        }
        ckf.g(pnhVar, "$listener");
        b.add(pnhVar);
    }

    public static final void p(pnh pnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aedaba0b", new Object[]{pnhVar});
            return;
        }
        ckf.g(pnhVar, "$listener");
        b.remove(pnhVar);
    }

    public final void e(String str, rpc.c cVar, TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b67afe7", new Object[]{this, str, cVar, templateBean});
            return;
        }
        ckf.g(str, "itemType");
        ckf.g(cVar, "file");
        ckf.g(templateBean, "templateBean");
        f22032a.a(str, cVar, templateBean);
    }

    public final e93 f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e93) ipChange.ipc$dispatch("92054e85", new Object[]{this, str});
        }
        ckf.g(str, "type");
        return f22032a.b(str);
    }

    public final rpc.c g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("ac4c6847", new Object[]{this, str});
        }
        ckf.g(str, "type");
        e93 b2 = f22032a.b(str);
        if (b2 != null) {
            return b2.a();
        }
        return null;
    }

    public final rpc.c h(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("f0155fdb", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "type");
        ckf.g(str2, "version");
        ckf.g(str3, "url");
        e93 b2 = f22032a.b(str);
        if (b2 != null && ckf.b(b2.c().version, str2) && ckf.b(b2.c().url, str3)) {
            rpc.c a2 = b2.a();
            if ((a2 != null ? a2.d() : null) != null) {
                return b2.a();
            }
        }
        return null;
    }

    public final boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("750662be", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "type");
        return f22032a.d(str);
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2550fb07", new Object[]{this, str});
            return;
        }
        Iterator<pnh> it = b.iterator();
        while (it.hasNext()) {
            it.next().b(str);
        }
    }

    public final void l(final pnh pnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca937dc", new Object[]{this, pnhVar});
            return;
        }
        ckf.g(pnhVar, DataReceiveMonitor.CB_LISTENER);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            b.add(pnhVar);
        } else {
            c.post(new Runnable() { // from class: tb.krz
                @Override // java.lang.Runnable
                public final void run() {
                    jjt.o(pnh.this);
                }
            });
        }
    }

    public final void m(final pnh pnhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30fe87a3", new Object[]{this, pnhVar});
            return;
        }
        ckf.g(pnhVar, DataReceiveMonitor.CB_LISTENER);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            b.remove(pnhVar);
        } else {
            c.post(new Runnable() { // from class: tb.lrz
                @Override // java.lang.Runnable
                public final void run() {
                    jjt.p(pnh.this);
                }
            });
        }
    }

    public final void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea4a11", new Object[]{this, str});
            return;
        }
        ckf.g(str, "type");
        e93 b2 = f22032a.b(str);
        if (b2 != null && !b2.b()) {
            b2.e(true);
            Coordinator.execute(new a(b2, str));
        }
    }
}
