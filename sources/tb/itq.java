package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.virtual_thread.adapter.monitor.MonitorThreadPoolFactory;
import com.taobao.android.virtual_thread.face.StubThreadPoolFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class itq implements yct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1r f21578a;
    public final yiw b;

    static {
        t2o.a(970981405);
        t2o.a(970981409);
    }

    public itq(j1r j1rVar, yiw yiwVar) {
        this.f21578a = j1rVar;
        this.b = yiwVar;
    }

    @Override // tb.yct
    public void execute() {
        hrt hrtVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.f21578a.c("useVirtualThread", this.b.a())) {
            boolean c = this.f21578a.c("useMonitorVirtualThread", this.b.a());
            if (c) {
                hrtVar = new MonitorThreadPoolFactory();
            } else {
                hrtVar = new StubThreadPoolFactory();
            }
            htq.a(hrtVar);
            if (c) {
                TCrashSDK.instance().addJvmUncaughtCrashListener(new tqt());
            }
            ghh.b("StubVirtualThreadTask", "succ");
        } else {
            ghh.a("StubVirtualThreadTask", "failed", Boolean.valueOf(this.f21578a.c("useVirtualThread", this.b.a())), Boolean.valueOf(this.b.a()));
        }
    }
}
