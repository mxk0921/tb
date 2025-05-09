package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class twp implements gk4<cxn, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<gcf> f29004a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cxn f29005a;

        public a(cxn cxnVar) {
            this.f29005a = cxnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (gcf gcfVar : twp.b(twp.this)) {
                gcfVar.a(this.f29005a);
            }
        }
    }

    public twp(Set<gcf> set) {
        this.f29004a = set;
    }

    public static /* synthetic */ Set b(twp twpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("3a4a892d", new Object[]{twpVar});
        }
        return twpVar.f29004a;
    }

    /* renamed from: c */
    public Void a(cxn cxnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("c3498969", new Object[]{this, cxnVar});
        }
        if (!this.b.compareAndSet(false, true)) {
            return null;
        }
        RSoLog.d("remo,SilentResultDelegate,consume, trigger,  result = " + cxnVar + ",  callbacks=" + this.f29004a);
        rbn.i("SilentResultDelegate.consume", new a(cxnVar));
        return null;
    }
}
