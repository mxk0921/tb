package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b3v implements d8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16164a = false;
    public static final BlockingQueue<Runnable> b = new LinkedBlockingQueue();
    public static final b3v c = new b3v();

    static {
        t2o.a(962592877);
        t2o.a(962592874);
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f16164a;
    }

    public static /* synthetic */ BlockingQueue c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlockingQueue) ipChange.ipc$dispatch("878a81a9", new Object[0]);
        }
        return b;
    }

    public static b3v d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b3v) ipChange.ipc$dispatch("1bbbb50e", new Object[0]);
        }
        return c;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!f16164a) {
            f16164a = true;
            zdt.c().f(new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (b3v.b()) {
                try {
                    Runnable runnable = (Runnable) b3v.c().take();
                    nhh.m("UTSimpleQueueHandler", "queueCache.take", runnable);
                    runnable.run();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // tb.d8e
    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f862c37", new Object[]{this, runnable});
            return;
        }
        if (f16164a && runnable != null) {
            try {
                ((LinkedBlockingQueue) b).put(runnable);
                nhh.m("UTSimpleQueueHandler", "queueCache.put");
            } catch (Exception unused) {
            }
        }
    }
}
