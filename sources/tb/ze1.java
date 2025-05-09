package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ze1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ze1 c;
    public final AtomicInteger b = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f32702a = VExecutors.newScheduledThreadPool(4, new a());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(396361824);
            t2o.a(972029960);
        }

        public a() {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            int andIncrement = ze1.a(ze1.this).getAndIncrement();
            return "AsyncThreadPool:" + andIncrement;
        }
    }

    static {
        t2o.a(396361823);
    }

    public static /* synthetic */ AtomicInteger a(ze1 ze1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("b98bd8df", new Object[]{ze1Var});
        }
        return ze1Var.b;
    }

    public static ze1 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze1) ipChange.ipc$dispatch("eaa6a10e", new Object[0]);
        }
        if (c == null) {
            synchronized (ze1.class) {
                try {
                    if (c == null) {
                        c = new ze1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public synchronized void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be75d9d", new Object[]{this, runnable});
            return;
        }
        try {
            this.f32702a.submit(runnable);
        } catch (Exception e) {
            Log.e("AsyncThreadPool", "提交到异步线程池失败" + e);
        }
    }
}
