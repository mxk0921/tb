package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.FalcoLifecycleActionMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bz8 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FalcoLifecycleActionMonitor f16731a;

    public bz8(FalcoLifecycleActionMonitor falcoLifecycleActionMonitor) {
        this.f16731a = falcoLifecycleActionMonitor;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            FalcoLifecycleActionMonitor.x(this.f16731a);
        }
    }
}
