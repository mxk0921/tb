package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oe1 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iwl f25325a = new iwl();
    private final mj8 b;

    static {
        t2o.a(723517441);
    }

    public oe1(mj8 mj8Var) {
        this.b = mj8Var;
    }

    public void a(iwq iwqVar, Event event, kj8 kj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1646f16d", new Object[]{this, iwqVar, event, kj8Var});
            return;
        }
        this.f25325a.a(gwl.a(iwqVar, event, kj8Var));
        this.b.c().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        gwl b = this.f25325a.b();
        if (b != null) {
            this.b.d(b);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
