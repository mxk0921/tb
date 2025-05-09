package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class y7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f31894a;
    public final ConcurrentLinkedQueue<x7m> b = new ConcurrentLinkedQueue<>();
    public final Handler c = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void o(x7m x7mVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ x7m b;

        public b(x7m x7mVar) {
            this.b = x7mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a a2 = y7m.a(y7m.this);
            if (a2 != null) {
                a2.o(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ x7m b;

        public c(x7m x7mVar) {
            this.b = x7mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            a a2 = y7m.a(y7m.this);
            if (a2 != null) {
                a2.o(this.b);
            }
        }
    }

    static {
        t2o.a(481297328);
    }

    public static final /* synthetic */ a a(y7m y7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("38d265d5", new Object[]{y7mVar});
        }
        return y7mVar.f31894a;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.removeCallbacksAndMessages(null);
        this.f31894a = null;
    }

    public final void c(x7m x7mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8595251", new Object[]{this, x7mVar});
        } else if (x7mVar != null) {
            if (this.f31894a == null) {
                this.b.add(x7mVar);
            } else {
                this.c.post(new b(x7mVar));
            }
        }
    }

    public final void d(x7m x7mVar, Long l) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70037bf", new Object[]{this, x7mVar, l});
        } else if (x7mVar != null) {
            long j2 = 0;
            if (l == null) {
                j = 0;
            } else {
                j = l.longValue();
            }
            if (j >= 0) {
                j2 = j;
            }
            if (this.f31894a == null) {
                this.b.add(x7mVar);
            } else {
                this.c.postDelayed(new c(x7mVar), j2);
            }
        }
    }

    public final void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994325e5", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.f31894a = aVar;
            x7m poll = this.b.poll();
            while (poll != null) {
                a aVar2 = this.f31894a;
                ckf.d(aVar2);
                aVar2.o(poll);
                poll = this.b.poll();
            }
        }
    }
}
