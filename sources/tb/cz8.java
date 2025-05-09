package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.FalcoLifecycleActionMonitor;
import com.taobao.falco.t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cz8 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f17466a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ FalcoLifecycleActionMonitor d;

    public cz8(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, long j, long j2, String str) {
        this.d = falcoLifecycleActionMonitor;
        this.f17466a = j;
        this.b = j2;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (FalcoLifecycleActionMonitor.C(this.d) != -1 && FalcoLifecycleActionMonitor.C(this.d) == this.f17466a && !FalcoLifecycleActionMonitor.D(this.d) && !FalcoLifecycleActionMonitor.B(this.d).contains(Long.valueOf(this.b))) {
            FalcoLifecycleActionMonitor.E(this.d, true);
            if (FalcoLifecycleActionMonitor.X(this.d) != null) {
                String F = FalcoLifecycleActionMonitor.F(FalcoLifecycleActionMonitor.X(this.d), t.PAGE_NAME);
                ez8 X = FalcoLifecycleActionMonitor.X(this.d);
                X.y(F + "_" + this.c);
            }
        }
    }
}
