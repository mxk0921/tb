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
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pl extends ThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicLong f26151a = new AtomicLong(0);
    public static final Comparator b = new b();
    public static final Comparator c = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f26152a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "download#" + this.f26152a.getAndIncrement());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements Comparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
            }
            if (!(obj instanceof ql) || !(obj2 instanceof ql)) {
                return 0;
            }
            ql qlVar = (ql) obj;
            ql qlVar2 = (ql) obj2;
            int i = qlVar.f26806a - qlVar2.f26806a;
            if (i == 0) {
                return (int) (qlVar.c - qlVar2.c);
            }
            return i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements Comparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
            }
            if (!(obj instanceof ql) || !(obj2 instanceof ql)) {
                return 0;
            }
            ql qlVar = (ql) obj;
            ql qlVar2 = (ql) obj2;
            int i = qlVar.f26806a - qlVar2.f26806a;
            if (i == 0) {
                return (int) (qlVar2.c - qlVar.c);
            }
            return i;
        }
    }

    static {
        t2o.a(79691922);
        new a();
    }

    public pl(int i, boolean z, ThreadFactory threadFactory) {
        this(i, 8, 3L, TimeUnit.SECONDS, new PriorityBlockingQueue(512, z ? b : c), threadFactory);
    }

    public static /* synthetic */ Object ipc$super(pl plVar, String str, Object... objArr) {
        if (str.hashCode() == 452660730) {
            super.execute((Runnable) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/schedule/AURAPriorityExecutor");
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            return;
        }
        try {
            if (runnable instanceof ql) {
                ((ql) runnable).c = f26151a.getAndIncrement();
            }
            super.execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
            ck.g().e("AURAPriorityExecutor", th.getMessage());
        }
    }

    public pl(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        try {
            allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
