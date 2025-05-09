package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SelfDestructiveThread {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MSG_DESTRUCTION = 0;
    private static final int MSG_INVOKE_RUNNABLE = 1;
    private final int mDestructAfterMillisec;
    private Handler mHandler;
    private final int mPriority;
    private HandlerThread mThread;
    private final String mThreadName;
    private final Object mLock = new Object();
    private Handler.Callback mCallback = new Handler.Callback() { // from class: androidx.core.provider.SelfDestructiveThread.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            int i = message.what;
            if (i == 0) {
                SelfDestructiveThread.this.onDestruction();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                SelfDestructiveThread.this.onInvokeRunnable((Runnable) message.obj);
                return true;
            }
        }
    };
    private int mGeneration = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ReplyCallback<T> {
        void onReply(T t);
    }

    public SelfDestructiveThread(String str, int i, int i2) {
        this.mThreadName = str;
        this.mPriority = i;
        this.mDestructAfterMillisec = i2;
    }

    public int getGeneration() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73bbae88", new Object[]{this})).intValue();
        }
        synchronized (this.mLock) {
            i = this.mGeneration;
        }
        return i;
    }

    public boolean isRunning() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        synchronized (this.mLock) {
            if (this.mThread != null) {
                z = true;
            }
        }
        return z;
    }

    public void onDestruction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545ba05a", new Object[]{this});
            return;
        }
        synchronized (this.mLock) {
            try {
                if (!this.mHandler.hasMessages(1)) {
                    this.mThread.quit();
                    this.mThread = null;
                    this.mHandler = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T> void postAndReply(final Callable<T> callable, final ReplyCallback<T> replyCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e031af", new Object[]{this, callable, replyCallback});
            return;
        }
        final Handler create = CalleeHandler.create();
        post(new Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                final Object obj;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    obj = callable.call();
                } catch (Exception unused) {
                    obj = null;
                }
                create.post(new Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            replyCallback.onReply(obj);
                        }
                    }
                });
            }
        });
    }

    public void onInvokeRunnable(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2ff4f9", new Object[]{this, runnable});
            return;
        }
        runnable.run();
        synchronized (this.mLock) {
            this.mHandler.removeMessages(0);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.mDestructAfterMillisec);
        }
    }

    public <T> T postAndWait(final Callable<T> callable, int i) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c99eef0d", new Object[]{this, callable, new Integer(i)});
        }
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        post(new Runnable() { // from class: androidx.core.provider.SelfDestructiveThread.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    atomicReference.set(callable.call());
                } catch (Exception unused) {
                }
                reentrantLock.lock();
                try {
                    atomicBoolean.set(false);
                    newCondition.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    private void post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
            return;
        }
        synchronized (this.mLock) {
            try {
                if (this.mThread == null) {
                    HandlerThread handlerThread = new HandlerThread(this.mThreadName, this.mPriority);
                    this.mThread = handlerThread;
                    handlerThread.start();
                    this.mHandler = new Handler(this.mThread.getLooper(), this.mCallback);
                    this.mGeneration++;
                }
                this.mHandler.removeMessages(0);
                Handler handler = this.mHandler;
                handler.sendMessage(handler.obtainMessage(1, runnable));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
