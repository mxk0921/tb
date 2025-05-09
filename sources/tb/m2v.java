package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class m2v implements d8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23746a = false;
    public static final BlockingQueue<Runnable> b = new LinkedBlockingQueue();
    public static final m2v c = new m2v();

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
            while (m2v.b()) {
                try {
                    ((Runnable) m2v.c().take()).run();
                } catch (Throwable unused) {
                }
            }
        }
    }

    static {
        t2o.a(962592875);
        t2o.a(962592874);
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f23746a;
    }

    public static /* synthetic */ BlockingQueue c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BlockingQueue) ipChange.ipc$dispatch("878a81a9", new Object[0]);
        }
        return b;
    }

    public static m2v d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m2v) ipChange.ipc$dispatch("e48ac20", new Object[0]);
        }
        return c;
    }

    @Override // tb.d8e
    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f862c37", new Object[]{this, runnable});
            return;
        }
        if (f23746a && runnable != null) {
            try {
                ((LinkedBlockingQueue) b).put(runnable);
            } catch (Exception unused) {
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!f23746a) {
            f23746a = true;
            zdt.c().f(new a());
        }
    }
}
