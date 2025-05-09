package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.monitor.Monitor;
import java.util.HashMap;
import java.util.Map;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class qdp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, sod> f26685a = new HashMap<>();
    public final qpu b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601227);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601226);
    }

    public qdp(qpu qpuVar, xod xodVar) {
        ckf.g(qpuVar, "context");
        ckf.g(xodVar, "serviceRegistry");
        this.b = qpuVar;
        for (Map.Entry<Class<? extends sod>, sod> entry : xodVar.getServices().entrySet()) {
            this.f26685a.put(entry.getKey().getName(), entry.getValue());
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4cdb5e", new Object[]{this});
            return;
        }
        q8u.Companion.a("createServiceList");
        for (sod sodVar : this.f26685a.values()) {
            try {
                sodVar.onCreateService(this.b);
            } catch (Exception e) {
                Map<String, ? extends Object> f = v3i.f(jpu.a("service", sodVar.getClass().getName()));
                gi8 gi8Var = gi8.INSTANCE;
                gi8Var.a("createServiceList error, service = " + sodVar, f, Monitor.Type.FRAMEWORK, Monitor.Code.INIT_SERVICE_ERROR, true, e);
            }
        }
        q8u.Companion.c();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421d40a0", new Object[]{this});
            return;
        }
        for (sod sodVar : this.f26685a.values()) {
            try {
                sodVar.onDestroyService(this.b);
            } catch (Exception e) {
                tpu.a aVar = tpu.Companion;
                aVar.a("ServiceManager", "destroyServiceList error, service = " + sodVar, e);
            }
        }
    }

    public final <T extends sod> sod c(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sod) ipChange.ipc$dispatch("10f4299c", new Object[]{this, cls});
        }
        ckf.g(cls, "serviceClass");
        return this.f26685a.get(cls.getName());
    }
}
