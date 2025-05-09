package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Thread;
import java.util.concurrent.ConcurrentHashMap;
import tb.ekh;
import tb.o93;
import tb.oqt;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class VThread implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;
    public static final int NORM_PRIORITY = 5;
    private static final String TAG = "VThread";
    private static int sThreadInitNumber;
    private volatile Thread carrier;
    private int priority;
    private Runnable target;
    private long tid;
    private final Thread virtualThread;
    public static boolean sSupportThreadLocal = false;
    public static final o93 sSharedPool = CarrierCachedPoolImpl.instance();
    private static final ConcurrentHashMap<Thread, VThread> sThreadVThreadMap = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Thread, VThread> sVirtualThreadVThreadMap = new ConcurrentHashMap<>();
    private static long sThreadSeqNumber = 1152921504606846976L;
    private final Object lock = new Object();
    private boolean daemon = false;
    private volatile int threadStatus = 0;

    static {
        t2o.a(969932811);
    }

    public VThread(Runnable runnable) {
        VirtualThread virtualThread = new VirtualThread(this);
        this.virtualThread = virtualThread;
        init(virtualThread, runnable);
    }

    private void attachCarrier(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423ff6ab", new Object[]{this, thread});
            return;
        }
        thread.setName(this.virtualThread.getName());
        synchronized (this.lock) {
            this.carrier = thread;
            this.carrier.setContextClassLoader(this.virtualThread.getContextClassLoader());
            this.carrier.setUncaughtExceptionHandler(this.virtualThread.getUncaughtExceptionHandler());
            this.threadStatus = 2;
        }
        sThreadVThreadMap.put(thread, this);
        synchronized (this.virtualThread) {
            sVirtualThreadVThreadMap.put(this.virtualThread, this);
        }
        if (sSupportThreadLocal) {
            oqt.b(this.virtualThread, thread);
        } else {
            ekh.b(this.virtualThread);
        }
    }

    public static Thread currentCarrierThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("27d04597", new Object[0]);
        }
        return Thread.currentThread();
    }

    public static VThread currentVThreadByCarrier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VThread) ipChange.ipc$dispatch("17375df0", new Object[0]) : currentVThreadByCarrier(currentCarrierThread());
    }

    private static VThread currentVThreadByVirtualThread(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VThread) ipChange.ipc$dispatch("1721041e", new Object[]{thread});
        }
        return sVirtualThreadVThreadMap.get(thread);
    }

    public static Thread currentVirtualThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("87ad91a4", new Object[0]);
        }
        Thread currentCarrierThread = currentCarrierThread();
        VThread currentVThreadByCarrier = currentVThreadByCarrier(currentCarrierThread);
        if (currentVThreadByCarrier != null) {
            return currentVThreadByCarrier.getVirtualThread();
        }
        return currentCarrierThread;
    }

    private void detachCarrier(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1edb81d", new Object[]{this, thread});
            return;
        }
        if (sSupportThreadLocal) {
            oqt.a(this.virtualThread, thread);
        } else {
            ekh.a(this.virtualThread);
        }
        synchronized (this.virtualThread) {
            try {
                ConcurrentHashMap<Thread, VThread> concurrentHashMap = sVirtualThreadVThreadMap;
                if (concurrentHashMap.get(this.virtualThread) == this) {
                    concurrentHashMap.remove(this.virtualThread);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sThreadVThreadMap.remove(thread);
        synchronized (this.lock) {
            this.virtualThread.setContextClassLoader(this.carrier.getContextClassLoader());
            this.virtualThread.setUncaughtExceptionHandler(this.carrier.getUncaughtExceptionHandler());
            this.carrier.setContextClassLoader(getClass().getClassLoader());
            this.carrier.setUncaughtExceptionHandler(null);
            this.threadStatus = 3;
            this.carrier = null;
            this.lock.notifyAll();
        }
    }

    private void init(Thread thread, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716bed86", new Object[]{this, thread, runnable});
        } else if (thread != null) {
            this.target = runnable;
            this.tid = nextThreadID();
        } else {
            throw new NullPointerException("virtualThread cannot be null");
        }
    }

    public static boolean interrupted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb59c1cd", new Object[0])).booleanValue();
        }
        return Thread.interrupted();
    }

    private static synchronized long nextThreadID() {
        synchronized (VThread.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("25217133", new Object[0])).longValue();
            }
            long j = sThreadSeqNumber + 1;
            sThreadSeqNumber = j;
            return j;
        }
    }

    private static synchronized int nextThreadNum() {
        synchronized (VThread.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dea3cf63", new Object[0])).intValue();
            }
            int i = sThreadInitNumber;
            sThreadInitNumber = i + 1;
            return i;
        }
    }

    public Thread getCarrier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("3628d29e", new Object[]{this});
        }
        return this.carrier;
    }

    public long getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0c", new Object[]{this})).longValue();
        }
        return this.tid;
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.virtualThread.getName();
    }

    public final int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return this.priority;
    }

    public StackTraceElement[] getStackTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement[]) ipChange.ipc$dispatch("4093147d", new Object[]{this});
        }
        Thread thread = this.carrier;
        if (thread != null) {
            return thread.getStackTrace();
        }
        return new StackTraceElement[0];
    }

    public Thread.State getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread.State) ipChange.ipc$dispatch("9cc6b378", new Object[]{this});
        }
        if (this.carrier != null) {
            synchronized (this.lock) {
                try {
                    if (this.carrier != null) {
                        return this.carrier.getState();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = this.threadStatus;
        if (i == 0) {
            return Thread.State.NEW;
        }
        if (i == 1 || i == 2) {
            return Thread.State.RUNNABLE;
        }
        if (i != 3) {
            return Thread.State.TERMINATED;
        }
        return Thread.State.TERMINATED;
    }

    public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread.UncaughtExceptionHandler) ipChange.ipc$dispatch("cfe68928", new Object[]{this});
        }
        if (this.carrier != null) {
            synchronized (this.lock) {
                try {
                    if (this.carrier != null) {
                        return this.carrier.getUncaughtExceptionHandler();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.virtualThread.getUncaughtExceptionHandler();
    }

    public int getVState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("832694ab", new Object[]{this})).intValue();
        }
        return this.threadStatus;
    }

    public Thread getVirtualThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("8cecac41", new Object[]{this});
        }
        return this.virtualThread;
    }

    @Deprecated
    public void interrupt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363cc96a", new Object[]{this});
        } else if (this.carrier != null) {
            synchronized (this.lock) {
                try {
                    if (this.carrier != null) {
                        this.carrier.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean isAlive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue();
        }
        if (this.threadStatus == 0 || this.threadStatus == 3) {
            return false;
        }
        return true;
    }

    @Deprecated
    public final boolean isDaemon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6174b5d9", new Object[]{this})).booleanValue();
        }
        return this.daemon;
    }

    public boolean isInterrupted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a1f3343", new Object[]{this})).booleanValue();
        }
        if (this.carrier != null) {
            synchronized (this.lock) {
                try {
                    if (this.carrier != null) {
                        return this.carrier.isInterrupted();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    @Deprecated
    public final void join() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac60bcb1", new Object[]{this});
        } else {
            join(0L);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Thread currentCarrierThread = currentCarrierThread();
        attachCarrier(currentCarrierThread);
        try {
            Runnable runnable = this.target;
            if (runnable != null) {
                runnable.run();
            }
        } finally {
            try {
                detachCarrier(currentCarrierThread);
            } catch (Throwable th) {
            }
        }
        detachCarrier(currentCarrierThread);
    }

    public void setContextClassLoader(ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48824c5", new Object[]{this, classLoader});
        } else if (this.carrier != null) {
            synchronized (this.lock) {
                try {
                    if (this.carrier != null) {
                        this.carrier.setContextClassLoader(classLoader);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Deprecated
    public final void setDaemon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9169d567", new Object[]{this, new Boolean(z)});
        } else if (!isAlive()) {
            this.daemon = z;
        } else {
            throw new IllegalThreadStateException();
        }
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else if (str != null) {
            this.virtualThread.setName(str);
            if (this.threadStatus != 0) {
                synchronized (this.lock) {
                    try {
                        if (!(this.threadStatus == 0 || this.carrier == null)) {
                            this.carrier.setName(str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } else {
            throw new NullPointerException("name cannot be null");
        }
    }

    public final void setPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f878ef6", new Object[]{this, new Integer(i)});
        } else if (i > 10 || i < 1) {
            throw new IllegalArgumentException();
        } else {
            this.priority = i;
            if (this.threadStatus != 0) {
                synchronized (this.lock) {
                    try {
                        if (!(this.threadStatus == 0 || this.carrier == null)) {
                            this.carrier.setPriority(i);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce33732", new Object[]{this, uncaughtExceptionHandler});
        } else if (this.carrier != null) {
            synchronized (this.lock) {
                try {
                    if (this.carrier != null) {
                        this.carrier.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        synchronized (this.lock) {
            if (this.threadStatus == 0) {
                this.threadStatus = 1;
            } else {
                throw new IllegalThreadStateException();
            }
        }
        sSharedPool.execute(this);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VThread[" + getName() + "," + getPriority() + "," + this.threadStatus + "]";
    }

    private static VThread currentVThreadByCarrier(Thread thread) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VThread) ipChange.ipc$dispatch("128d2fa1", new Object[]{thread}) : sThreadVThreadMap.get(thread);
    }

    @Deprecated
    public final void join(long j) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb75033", new Object[]{this, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            synchronized (this.lock) {
                try {
                    if (i == 0) {
                        while (isAlive()) {
                            this.lock.wait(10L);
                        }
                    } else {
                        long j2 = 0;
                        while (isAlive()) {
                            long j3 = j - j2;
                            if (j3 <= 0) {
                                break;
                            }
                            this.lock.wait(j3);
                            j2 = System.currentTimeMillis() - currentTimeMillis;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("timeout value is negative");
    }

    public VThread(Thread thread) {
        this.virtualThread = thread;
        init(thread, thread);
    }

    public VThread(String str) {
        Thread virtualThread = new VirtualThread(str);
        this.virtualThread = virtualThread;
        init(virtualThread, virtualThread);
    }

    public VThread(Thread thread, Runnable runnable) {
        this.virtualThread = thread;
        init(thread, runnable);
    }

    public VThread(Runnable runnable, String str) {
        VirtualThread virtualThread = new VirtualThread(this, str);
        this.virtualThread = virtualThread;
        init(virtualThread, runnable);
    }
}
