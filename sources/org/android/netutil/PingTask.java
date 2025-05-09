package org.android.netutil;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PingTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int PING_DEFAULT_TIME = 5;
    private int interval;
    private int maxtime;
    private int payload;
    private String pingIPStr;
    private int ttl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class PingFuture extends AsyncTask implements Future<PingResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private PingResponse _inner_response;
        private long native_ptr;

        public static /* synthetic */ PingFuture access$100(PingFuture pingFuture, String str, int i, int i2, int i3, int i4, PingTaskWatcher pingTaskWatcher) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (PingFuture) ipChange.ipc$dispatch("5ccfa715", new Object[]{pingFuture, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), pingTaskWatcher}) : pingFuture.start(str, i, i2, i3, i4, pingTaskWatcher);
        }

        public static /* synthetic */ Object ipc$super(PingFuture pingFuture, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/netutil/PingTask$PingFuture");
        }

        private PingFuture start(String str, int i, int i2, int i3, int i4, PingTaskWatcher pingTaskWatcher) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PingFuture) ipChange.ipc$dispatch("e88312e", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), pingTaskWatcher});
            }
            PingResponse pingResponse = new PingResponse(i2);
            this._inner_response = pingResponse;
            pingResponse.registerWatcher(pingTaskWatcher);
            this.native_ptr = PingTask.access$400(this, str, i, i2, i3, i4);
            return this;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            return false;
        }

        public void finalize() throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            super.finalize();
            long j = this.native_ptr;
            if (j != 0) {
                PingTask.access$200(j);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
            }
            return this.done;
        }

        public void onPingEntry(int i, int i2, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8f347d6", new Object[]{this, new Integer(i), new Integer(i2), new Double(d)});
            } else {
                this._inner_response.appendEntry(i, i2, d);
            }
        }

        public void onTaskFinish(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8def6fb", new Object[]{this, str, new Integer(i)});
                return;
            }
            this._inner_response.setLocalIPStr(str);
            this._inner_response.setEndWithErrcode(i);
        }

        public void onTimxceed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b750c0f1", new Object[]{this, str});
            } else {
                this._inner_response.setLastHopIPStr(str);
            }
        }

        private PingFuture() {
            this.native_ptr = 0L;
            this._inner_response = null;
        }

        @Override // java.util.concurrent.Future
        public PingResponse get() throws InterruptedException, ExecutionException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PingResponse) ipChange.ipc$dispatch("743e8bba", new Object[]{this});
            }
            try {
                return get(0L, TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // java.util.concurrent.Future
        public PingResponse get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PingResponse) ipChange.ipc$dispatch("28042146", new Object[]{this, new Long(j), timeUnit});
            }
            synchronized (this) {
                try {
                    if (!this.done) {
                        long j2 = this.native_ptr;
                        if (j2 == 0) {
                            return null;
                        }
                        if (PingTask.access$300(j2, timeUnit.toSeconds(j))) {
                            PingTask.access$200(this.native_ptr);
                            this.native_ptr = 0L;
                        } else {
                            throw new TimeoutException();
                        }
                    }
                    return this._inner_response;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public PingTask(String str, int i, int i2, int i3, int i4) {
        this.pingIPStr = str;
        this.interval = i;
        this.maxtime = i2 == 0 ? PING_DEFAULT_TIME : i2;
        this.payload = i3;
        this.ttl = i4;
    }

    public static /* synthetic */ void access$200(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adadb7eb", new Object[]{new Long(j)});
        } else {
            releasePingTask(j);
        }
    }

    public static /* synthetic */ boolean access$300(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c4e2b3e", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        return waitPingTask(j, j2);
    }

    public static /* synthetic */ long access$400(PingFuture pingFuture, String str, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cff5493d", new Object[]{pingFuture, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).longValue();
        }
        return createPingTask(pingFuture, str, i, i2, i3, i4);
    }

    private static native long createPingTask(PingFuture pingFuture, String str, int i, int i2, int i3, int i4);

    private static native void releasePingTask(long j);

    private static native boolean waitPingTask(long j, long j2);

    public Future<PingResponse> launch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("9d27bb50", new Object[]{this});
        }
        return launchWith(null);
    }

    public Future<PingResponse> launchWith(PingTaskWatcher pingTaskWatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("54403d2d", new Object[]{this, pingTaskWatcher});
        }
        return PingFuture.access$100(new PingFuture(), this.pingIPStr, this.interval, this.maxtime, this.payload, this.ttl, pingTaskWatcher);
    }

    public PingTask(String str) {
        this(str, 0, 0, 0, 0);
    }
}
