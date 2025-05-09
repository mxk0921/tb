package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s86 implements ixb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator f27864a = new b();
    public static final Comparator b = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f27865a = new AtomicInteger(1);

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "download#" + this.f27865a.getAndIncrement();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Comparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
            }
            if (!(obj instanceof t86) || !(obj2 instanceof t86)) {
                return 0;
            }
            t86 t86Var = (t86) obj;
            t86 t86Var2 = (t86) obj2;
            int i = t86Var.f28564a - t86Var2.f28564a;
            if (i == 0) {
                return (int) (t86Var.c - t86Var2.c);
            }
            return i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements Comparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
            }
            if (!(obj instanceof t86) || !(obj2 instanceof t86)) {
                return 0;
            }
            t86 t86Var = (t86) obj;
            t86 t86Var2 = (t86) obj2;
            int i = t86Var.f28564a - t86Var2.f28564a;
            if (i == 0) {
                return (int) (t86Var2.c - t86Var.c);
            }
            return i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f27866a;
        public final /* synthetic */ String b;

        public d(s86 s86Var, int i, String str) {
            this.b = str;
            this.f27866a = new AtomicInteger(i);
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return this.b + this.f27866a.getAndIncrement();
        }
    }

    static {
        new AtomicLong(0L);
        new a();
    }

    @Override // tb.ixb
    public ThreadPoolExecutor a(int i, boolean z, String str, int i2) {
        Comparator comparator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("d9b6ece5", new Object[]{this, new Integer(i), new Boolean(z), str, new Integer(i2)});
        }
        d dVar = new d(this, i2, str);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (z) {
            comparator = f27864a;
        } else {
            comparator = b;
        }
        return b(i, 8, 3L, timeUnit, new PriorityBlockingQueue(512, comparator), dVar);
    }

    public ThreadPoolExecutor b(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, qqt qqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("70849b90", new Object[]{this, new Integer(i), new Integer(i2), new Long(j), timeUnit, blockingQueue, qqtVar});
        }
        ExecutorService createExecutorService = VExecutors.getThreadPoolFactory().createExecutorService(i, i2, j, timeUnit, blockingQueue, qqtVar, new ThreadPoolExecutor.AbortPolicy());
        try {
            h36.g("virtualThread", "Create-Virtual_Thread");
            ((ThreadPoolExecutor) createExecutorService).setKeepAliveTime(j, timeUnit);
            ((ThreadPoolExecutor) createExecutorService).allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
        return (ThreadPoolExecutor) createExecutorService;
    }
}
