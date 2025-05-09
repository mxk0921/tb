package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class vsw implements xae {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicInteger b = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f30233a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30234a;

        public a(vsw vswVar, String str) {
            this.f30234a = str;
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return this.f30234a + vsw.b().getAndIncrement();
        }
    }

    static {
        t2o.a(989856414);
        t2o.a(989856404);
    }

    public vsw(int i, String str) {
        this.f30233a = VExecutors.newFixedThreadPool(i, new a(this, str));
    }

    public static /* synthetic */ AtomicInteger b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return b;
    }

    @Override // tb.xae
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            this.f30233a.execute(runnable);
        }
    }

    @Override // tb.xae
    public Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable});
        }
        return this.f30233a.submit(runnable);
    }
}
