package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r86 extends ThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicLong f27188a = new AtomicLong(0);
    public static final Comparator b = new b();
    public static final Comparator c = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f27189a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "download#" + this.f27189a.getAndIncrement());
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

    static {
        t2o.a(444597000);
        new a();
    }

    public r86(int i, boolean z, ThreadFactory threadFactory) {
        this(i, 8, 3L, TimeUnit.SECONDS, new PriorityBlockingQueue(512, z ? b : c), threadFactory);
    }

    public static /* synthetic */ Object ipc$super(r86 r86Var, String str, Object... objArr) {
        if (str.hashCode() == 452660730) {
            super.execute((Runnable) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/template/download/DXPriorityExecutor");
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            return;
        }
        try {
            if (runnable instanceof t86) {
                ((t86) runnable).c = f27188a.getAndIncrement();
            }
            super.execute(runnable);
        } catch (Throwable th) {
            la6.b(xv5.a(th));
        }
    }

    public r86(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        try {
            allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }
}
