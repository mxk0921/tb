package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class o0o implements g8d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IMainFeedsViewService<?> f25067a;
    public h6c.b b;

    static {
        t2o.a(491782564);
        t2o.a(491782563);
    }

    public o0o(cfc cfcVar) {
        this.f25067a = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
    }

    @Override // tb.g8d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15fa750a", new Object[]{this});
        } else {
            b();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c0d919", new Object[]{this});
        } else if (this.f25067a != null) {
            this.b = c();
            this.f25067a.getLifeCycleRegister().M(this.b);
        }
    }

    public final h6c.b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.b) ipChange.ipc$dispatch("67dd6bff", new Object[]{this});
        }
        return new n0o(this);
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a89a29d6", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f25067a;
        if (iMainFeedsViewService != null && this.b != null) {
            iMainFeedsViewService.getLifeCycleRegister().k(this.b);
        }
    }

    @Override // tb.g8d
    public void stopTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b331456a", new Object[]{this});
        } else {
            d();
        }
    }
}
