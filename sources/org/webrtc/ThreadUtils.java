package org.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ThreadUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: org.webrtc.ThreadUtils$1CaughtException  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class C1CaughtException {
        public Exception e;

        static {
            t2o.a(395313831);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: org.webrtc.ThreadUtils$1Result  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class C1Result {
        public V value;

        static {
            t2o.a(395313832);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface BlockingOperation {
        void run() throws InterruptedException;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class ThreadChecker {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Thread thread = Thread.currentThread();

        static {
            t2o.a(395313837);
        }

        public void checkIsOnValidThread() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4dcd09c", new Object[]{this});
                return;
            }
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() != this.thread) {
                throw new IllegalStateException("Wrong thread");
            }
        }

        public void detachThread() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef6a5584", new Object[]{this});
            } else {
                this.thread = null;
            }
        }
    }

    static {
        t2o.a(395313829);
    }

    public static void awaitUninterruptibly(final CountDownLatch countDownLatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d911b5", new Object[]{countDownLatch});
        } else {
            executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.ThreadUtils.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // org.webrtc.ThreadUtils.BlockingOperation
                public void run() throws InterruptedException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        countDownLatch.await();
                    }
                }
            });
        }
    }

    public static void checkIsOnMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd76205b", new Object[0]);
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement[]) ipChange.ipc$dispatch("e8821e2c", new Object[]{stackTraceElementArr, stackTraceElementArr2});
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fe7eb3", new Object[]{blockingOperation});
            return;
        }
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, final Callable<V> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("728386ca", new Object[]{handler, callable});
        }
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            final C1Result r1 = new C1Result();
            final C1CaughtException r2 = new C1CaughtException();
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new Runnable() { // from class: org.webrtc.ThreadUtils.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r1v3, types: [V, java.lang.Object] */
                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        C1Result.this.value = callable.call();
                    } catch (Exception e2) {
                        r2.e = e2;
                    }
                    countDownLatch.countDown();
                }
            });
            awaitUninterruptibly(countDownLatch);
            if (r2.e == null) {
                return r1.value;
            }
            RuntimeException runtimeException = new RuntimeException(r2.e);
            runtimeException.setStackTrace(concatStackTraces(r2.e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }

    public static boolean joinUninterruptibly(Thread thread, long j) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c722c84a", new Object[]{thread, new Long(j)})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j;
        while (j2 > 0) {
            try {
                thread.join(j2);
                break;
            } catch (InterruptedException unused) {
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1499bb3", new Object[]{countDownLatch, new Long(j)})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j;
        z = false;
        while (true) {
            try {
                z2 = countDownLatch.await(j2, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                j2 = j - (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j2 <= 0) {
                    break;
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return z2;
    }

    public static void joinUninterruptibly(final Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c763e", new Object[]{thread});
        } else {
            executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.ThreadUtils.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // org.webrtc.ThreadUtils.BlockingOperation
                public void run() throws InterruptedException {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        thread.join();
                    }
                }
            });
        }
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38c2187", new Object[]{handler, runnable});
        } else {
            invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: org.webrtc.ThreadUtils.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.Callable
                public Void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("b898ca78", new Object[]{this});
                    }
                    runnable.run();
                    return null;
                }
            });
        }
    }
}
