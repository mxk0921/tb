package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class exn implements gk4<cxn, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<gcf> f18873a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cxn f18874a;

        public a(cxn cxnVar) {
            this.f18874a = cxnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (gcf gcfVar : exn.b(exn.this)) {
                gcfVar.a(this.f18874a);
            }
        }
    }

    public exn(Set<gcf> set) {
        this.f18873a = set;
    }

    public static /* synthetic */ Set b(exn exnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("f5902699", new Object[]{exnVar});
        }
        return exnVar.f18873a;
    }

    /* renamed from: c */
    public Void a(cxn cxnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("c3498969", new Object[]{this, cxnVar});
        }
        if (cxnVar.d() == 1001 || cxnVar.d() == 1003) {
            if (this.b.compareAndSet(false, true)) {
                RSoLog.d("remo,RemoUIResultDelegate,consume, trigger,  result = " + cxnVar + ",  callbacks=" + this.f18873a);
                rbn.i("RemoUIResultDelegate.consume", new a(cxnVar));
            }
            return null;
        }
        RSoLog.d("remo,RemoUIResultDelegate, updateResult, skip trigger, result = " + cxnVar);
        return null;
    }
}
