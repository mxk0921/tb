package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.atools.Constants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class of {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, ScheduledThreadPoolExecutor> f25342a = new ConcurrentHashMap();
    public static ScheduledThreadPoolExecutor b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f25343a;
        public final AtomicLong b = new AtomicLong();

        static {
            t2o.a(398458883);
        }

        public a(String str) {
            this.f25343a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.f25343a + "-" + this.b.incrementAndGet());
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        t2o.a(398458882);
    }

    public static ScheduledThreadPoolExecutor a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("9ce6bbb", new Object[]{new Integer(i), str});
        }
        Map<String, ScheduledThreadPoolExecutor> map = f25342a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) ((ConcurrentHashMap) map).get(str);
        if (scheduledThreadPoolExecutor == null) {
            synchronized (map) {
                try {
                    scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) ((ConcurrentHashMap) map).get(str);
                    if (scheduledThreadPoolExecutor == null) {
                        scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new a(str));
                        scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
                        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                        ((ConcurrentHashMap) map).put(str, scheduledThreadPoolExecutor);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return scheduledThreadPoolExecutor;
    }

    public static ScheduledThreadPoolExecutor b(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("7af21cef", new Object[]{new Integer(i), str, new Long(j)});
        }
        Map<String, ScheduledThreadPoolExecutor> map = f25342a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) ((ConcurrentHashMap) map).get(str);
        if (scheduledThreadPoolExecutor == null) {
            synchronized (map) {
                try {
                    scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) ((ConcurrentHashMap) map).get(str);
                    if (scheduledThreadPoolExecutor == null) {
                        scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new a(str));
                        scheduledThreadPoolExecutor.setKeepAliveTime(j, TimeUnit.MILLISECONDS);
                        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                        ((ConcurrentHashMap) map).put(str, scheduledThreadPoolExecutor);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return scheduledThreadPoolExecutor;
    }

    public static ScheduledThreadPoolExecutor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("d7444a4e", new Object[0]);
        }
        if (b == null) {
            b = a(1, Constants.MODULE);
        }
        return b;
    }
}
