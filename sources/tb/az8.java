package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.FalcoLifecycleActionMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class az8 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f16085a;
    public final /* synthetic */ long b;
    public final /* synthetic */ FalcoLifecycleActionMonitor c;

    public az8(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor, boolean z, long j) {
        this.c = falcoLifecycleActionMonitor;
        this.f16085a = z;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (FalcoLifecycleActionMonitor.O(this.c) == 0 && this.f16085a) {
            FalcoLifecycleActionMonitor.V(this.c, true);
        }
        FalcoLifecycleActionMonitor.B(this.c).add(Long.valueOf(this.b));
    }
}
