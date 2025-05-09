package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mur {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f24320a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(mur murVar) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "tbuprofen-thread";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final mur f24321a = new mur();

        static {
            t2o.a(824180790);
        }

        public static /* synthetic */ mur a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mur) ipChange.ipc$dispatch("1b0512f6", new Object[0]);
            }
            return f24321a;
        }
    }

    static {
        t2o.a(824180788);
    }

    public mur() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) VExecutors.newScheduledThreadPool(2, new a(this));
        this.f24320a = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(5L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static mur b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mur) ipChange.ipc$dispatch("be90c3b", new Object[0]);
        }
        return b.a();
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            this.f24320a.execute(runnable);
        }
    }

    public void c(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616d8010", new Object[]{this, runnable, new Long(j), timeUnit});
        } else {
            this.f24320a.schedule(runnable, j, timeUnit);
        }
    }
}
