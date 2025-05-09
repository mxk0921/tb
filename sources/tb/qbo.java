package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qbo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b f26655a;
    public final AtomicInteger b = new AtomicInteger(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f26656a;

        /* compiled from: Taobao */
        /* renamed from: tb.qbo$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC1036a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f26657a;

            public RunnableC1036a(int i) {
                this.f26657a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int i = this.f26657a + 1;
                if (i > qbo.a(qbo.this).count()) {
                    RSoLog.d(qbo.a(qbo.this).tag() + " retryable, onNext reach limit, tryIndex=" + i + ", count=" + qbo.a(qbo.this).count());
                    return;
                }
                qbo qboVar = qbo.this;
                qboVar.c(qbo.a(qboVar).interval() * this.f26657a);
            }
        }

        public a(long j) {
            this.f26656a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RSoLog.d(qbo.a(qbo.this).tag() + " retryable, enter, already delayed=" + this.f26656a);
            int andIncrement = qbo.b(qbo.this).getAndIncrement();
            c cVar = new c(andIncrement, new RunnableC1036a(andIncrement));
            RSoLog.d(qbo.a(qbo.this).tag() + " retryable, trying, index=" + andIncrement);
            qbo.a(qbo.this).a(cVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a(c cVar);

        int count();

        long interval();

        String tag();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f26658a;
        public final Runnable b;

        public c(int i, Runnable runnable) {
            this.f26658a = i;
            this.b = runnable;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("43085e0f", new Object[]{this})).booleanValue();
            }
            if (this.f26658a > 1) {
                return true;
            }
            return false;
        }
    }

    public qbo(b bVar) {
        this.f26655a = bVar;
    }

    public static /* synthetic */ b a(qbo qboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8c7248dd", new Object[]{qboVar});
        }
        return qboVar.f26655a;
    }

    public static /* synthetic */ AtomicInteger b(qbo qboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("2c32e3c6", new Object[]{qboVar});
        }
        return qboVar.b;
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f662bfb", new Object[]{this, new Long(j)});
        } else {
            qbn.e(new a(j), j);
        }
    }
}
