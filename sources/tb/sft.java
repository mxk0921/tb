package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class sft {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f28022a = new ScheduledThreadPoolExecutor(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f28023a;
        public final TimeUnit b;
        public final long c;

        static {
            t2o.a(954204165);
            t2o.a(954204167);
        }

        public a(Runnable runnable, TimeUnit timeUnit, long j) {
            this.f28023a = runnable;
            this.b = timeUnit;
            this.c = j;
        }

        @Override // tb.sft.c
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sft.access$000(sft.this).schedule(this.f28023a, this.c, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f28024a;

        static {
            t2o.a(954204166);
            t2o.a(954204167);
        }

        public b(Runnable runnable) {
            this.f28024a = runnable;
        }

        @Override // tb.sft.c
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f28024a.run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void run();
    }

    static {
        t2o.a(954204164);
    }

    public static /* synthetic */ ScheduledThreadPoolExecutor access$000(sft sftVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("84ad2828", new Object[]{sftVar});
        }
        return sftVar.f28022a;
    }

    public static sft createInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sft) ipChange.ipc$dispatch("45a5d6ee", new Object[0]);
        }
        return new sft();
    }

    public c createTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2686a411", new Object[]{this, runnable}) : new b(runnable);
    }

    public void shutDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f20d3fd", new Object[]{this});
        } else {
            this.f28022a.shutdown();
        }
    }

    public c createTask(Runnable runnable, TimeUnit timeUnit, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("6849605", new Object[]{this, runnable, timeUnit, new Long(j)}) : new a(runnable, timeUnit, j);
    }
}
