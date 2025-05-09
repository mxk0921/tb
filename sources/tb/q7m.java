package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class q7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static volatile ScheduledExecutorService f26563a = null;

        /* compiled from: Taobao */
        /* renamed from: tb.q7m$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class C1034a implements qqt {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public int f26564a = 0;

            @Override // tb.qqt
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                StringBuilder sb = new StringBuilder("PltMnnThreadPool_schedule_");
                int i = this.f26564a;
                this.f26564a = 1 + i;
                sb.append(i);
                return sb.toString();
            }
        }

        static {
            t2o.a(481297021);
        }

        public static ScheduledExecutorService a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScheduledExecutorService) ipChange.ipc$dispatch("73e3b116", new Object[0]);
            }
            if (f26563a == null) {
                synchronized (a.class) {
                    try {
                        if (f26563a == null) {
                            f26563a = VExecutors.newScheduledThreadPool(2, new C1034a());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f26563a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static volatile ExecutorService f26565a = null;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements qqt {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qqt
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
                }
                return "PltMnnThreadPool_" + hashCode();
            }
        }

        static {
            t2o.a(481297023);
        }

        public static /* synthetic */ ExecutorService a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutorService) ipChange.ipc$dispatch("b1f59204", new Object[0]);
            }
            return b();
        }

        public static ExecutorService b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutorService) ipChange.ipc$dispatch("2c9c450", new Object[0]);
            }
            if (f26565a == null) {
                synchronized (b.class) {
                    try {
                        if (f26565a == null) {
                            f26565a = VExecutors.newSingleThreadExecutor(new a());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f26565a;
        }
    }

    static {
        t2o.a(481297020);
    }

    public static ScheduledFuture<?> a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("7e00205d", new Object[]{runnable, new Long(j), timeUnit});
        }
        return a.a().schedule(runnable, j, timeUnit);
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee11f0ae", new Object[]{runnable});
        } else {
            b.a().execute(runnable);
        }
    }
}
