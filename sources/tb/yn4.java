package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yn4 implements g8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IContainerService<?> f32212a;
    public e6v b;

    static {
        t2o.a(491782538);
        t2o.a(491782563);
    }

    public yn4(cfc cfcVar) {
        this.f32212a = (IContainerService) cfcVar.a(IContainerService.class);
    }

    @Override // tb.g8d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fa750a", new Object[]{this});
            return;
        }
        IContainerService<?> iContainerService = this.f32212a;
        if (iContainerService == null) {
            fve.e("ContainerUiRefreshPerformanceTrace", "startTrace mContainerService is null");
        } else {
            b(iContainerService);
        }
    }

    public final void b(IContainerService<?> iContainerService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca1db2d4", new Object[]{this, iContainerService});
            return;
        }
        if (this.b == null) {
            this.b = new e6v();
        }
        iContainerService.addUiRefreshListener(this.b);
    }

    public final void c(IContainerService<?> iContainerService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e57674", new Object[]{this, iContainerService});
            return;
        }
        e6v e6vVar = this.b;
        if (e6vVar != null) {
            iContainerService.removeUiRefreshListener(e6vVar);
        }
    }

    @Override // tb.g8d
    public void stopTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b331456a", new Object[]{this});
            return;
        }
        IContainerService<?> iContainerService = this.f32212a;
        if (iContainerService == null) {
            fve.e("ContainerUiRefreshPerformanceTrace", "stopTrace mContainerService is null");
        } else {
            c(iContainerService);
        }
    }
}
