package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.FalcoLifecycleActionMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dz8 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f18170a;
    public final /* synthetic */ FalcoLifecycleActionMonitor b;

    public dz8(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, long j) {
        this.b = falcoLifecycleActionMonitor;
        this.f18170a = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        FalcoLifecycleActionMonitor.y(this.b);
        if (FalcoLifecycleActionMonitor.v(this.b) < 0) {
            FalcoLifecycleActionMonitor.w(this.b, 0);
        }
        FalcoLifecycleActionMonitor falcoLifecycleActionMonitor = this.b;
        if (FalcoLifecycleActionMonitor.O(falcoLifecycleActionMonitor) == 0 && FalcoLifecycleActionMonitor.v(this.b) == 0) {
            z = true;
        }
        FalcoLifecycleActionMonitor.u(falcoLifecycleActionMonitor, z);
        if (FalcoLifecycleActionMonitor.t(this.b)) {
            FalcoLifecycleActionMonitor.z(this.b, this.f18170a);
        }
    }
}
