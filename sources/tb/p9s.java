package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class p9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final p9s INSTANCE = new p9s();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f25966a = new AtomicInteger(3);
    public static final AtomicInteger b = new AtomicInteger(3);
    public static final AtomicInteger c = new AtomicInteger(3);
    public static final AtomicInteger d = new AtomicInteger(3);

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            tcs.h();
            p9s.e().set(1);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
            Application applicationContext = iEnvironmentService == null ? null : iEnvironmentService.getApplicationContext();
            if (applicationContext != null) {
                y2x.h(applicationContext, hhg.c("InitBasicParam"));
                p9s.f().set(1);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            IEnvironmentService iEnvironmentService = (IEnvironmentService) p8s.b(IEnvironmentService.class);
            Application applicationContext = iEnvironmentService == null ? null : iEnvironmentService.getApplicationContext();
            if (applicationContext != null) {
                b3x.h(applicationContext);
                p9s.g().set(1);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final d INSTANCE = new d();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            opx.h();
            p9s.h().set(1);
        }
    }

    static {
        t2o.a(847249498);
    }

    @JvmStatic
    public static final void a() {
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf9bde8b", new Object[0]);
            return;
        }
        try {
            if (!(b.get() != 0 || (iExecutorService = (IExecutorService) p8s.b(IExecutorService.class)) == null || (executor = iExecutorService.getExecutor(ExecutorType.IDLE)) == null)) {
                executor.execute(a.INSTANCE);
            }
        } catch (Exception e) {
            TMSLogger.c("TMSCompensationInitExtension", "CompensationPreloadInitTask error", e);
        }
    }

    @JvmStatic
    public static final void b() {
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6357afd2", new Object[0]);
            return;
        }
        try {
            if (!(c.get() != 0 || (iExecutorService = (IExecutorService) p8s.b(IExecutorService.class)) == null || (executor = iExecutorService.getExecutor(ExecutorType.IDLE)) == null)) {
                executor.execute(b.INSTANCE);
            }
        } catch (Exception e) {
            TMSLogger.c("TMSCompensationInitExtension", "CompensationZCacheInitTask error", e);
        }
    }

    @JvmStatic
    public static final void c() {
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4636bf7", new Object[0]);
            return;
        }
        try {
            if (!(f25966a.get() != 0 || (iExecutorService = (IExecutorService) p8s.b(IExecutorService.class)) == null || (executor = iExecutorService.getExecutor(ExecutorType.NORMAL)) == null)) {
                executor.execute(c.INSTANCE);
            }
        } catch (Exception e) {
            TMSLogger.c("TMSCompensationInitExtension", "CompensationWeexInitTask error", e);
        }
    }

    @JvmStatic
    public static final void d() {
        IExecutorService iExecutorService;
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0e861e", new Object[0]);
            return;
        }
        try {
            if (!(c.get() != 0 || (iExecutorService = (IExecutorService) p8s.b(IExecutorService.class)) == null || (executor = iExecutorService.getExecutor(ExecutorType.IDLE)) == null)) {
                executor.execute(d.INSTANCE);
            }
        } catch (Exception e) {
            TMSLogger.c("TMSCompensationInitExtension", "CompensationZCacheInitTask error ", e);
        }
    }

    public static final AtomicInteger e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("4d8f3f71", new Object[0]);
        }
        return b;
    }

    public static final AtomicInteger f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("53137780", new Object[0]);
        }
        return d;
    }

    public static final AtomicInteger g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("a5a77a0f", new Object[0]);
        }
        return f25966a;
    }

    public static final AtomicInteger h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("46d6a2b6", new Object[0]);
        }
        return c;
    }
}
