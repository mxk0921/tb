package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ewx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ThreadPoolExecutor f18858a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f18859a;
        public final AtomicInteger b = new AtomicInteger();

        /* compiled from: Taobao */
        /* renamed from: tb.ewx$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C0917a extends Thread {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0917a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public static /* synthetic */ Object ipc$super(C0917a aVar, String str, Object... objArr) {
                if (str.hashCode() == 1548812690) {
                    super.run();
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/uploader/implement/f/b$a$1");
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Process.setThreadPriority(a.a(a.this));
                super.run();
            }
        }

        public a(int i) {
            this.f18859a = 10;
            this.f18859a = i;
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b97790b3", new Object[]{aVar})).intValue();
            }
            return aVar.f18859a;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new C0917a(runnable, "aus work thread:" + this.b.getAndIncrement());
        }
    }

    public static Future<?> a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("f9227d7c", new Object[]{runnable});
        }
        try {
            return b().submit(runnable);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static ThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("26487748", new Object[0]);
        }
        if (f18858a == null) {
            synchronized (ewx.class) {
                try {
                    if (f18858a == null) {
                        f18858a = c(2, 4, 30, 128, new a(10));
                        f18858a.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f18858a;
    }

    public static ThreadPoolExecutor c(int i, int i2, int i3, int i4, ThreadFactory threadFactory) {
        LinkedBlockingQueue linkedBlockingQueue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("aedf63cf", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), threadFactory});
        }
        if (i4 > 0) {
            linkedBlockingQueue = new LinkedBlockingQueue(i4);
        } else {
            linkedBlockingQueue = new LinkedBlockingQueue();
        }
        return new ThreadPoolExecutor(i, i2, i3, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
    }
}
