package tb;

import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fcl implements f4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ViewEngine f19190a;

    static {
        t2o.a(614465729);
        t2o.a(614465728);
    }

    @Override // tb.f4d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205a7134", new Object[]{this});
            return;
        }
        kor.a("OrderActiveLifeCycleImp", "doStop", "----");
        ViewEngine viewEngine = this.f19190a;
        if (viewEngine != null) {
            viewEngine.w0();
        }
    }

    @Override // tb.f4d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
        } else {
            kor.a("OrderActiveLifeCycleImp", "doDestroy", "----");
        }
    }

    @Override // tb.f4d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfdbf32", new Object[]{this});
            return;
        }
        kor.a("OrderActiveLifeCycleImp", "doPause", "----");
        ViewEngine viewEngine = this.f19190a;
        if (viewEngine != null) {
            viewEngine.t0();
        }
    }

    @Override // tb.f4d
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3479e", new Object[]{this});
            return;
        }
        kor.a("OrderActiveLifeCycleImp", "doStart", "----");
        ViewEngine viewEngine = this.f19190a;
        if (viewEngine != null) {
            viewEngine.v0();
        }
    }

    @Override // tb.f4d
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e619651f", new Object[]{this});
            return;
        }
        kor.a("OrderActiveLifeCycleImp", "doResume", "----");
        ViewEngine viewEngine = this.f19190a;
        if (viewEngine != null) {
            viewEngine.u0();
        }
    }

    public void f(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8cb726a", new Object[]{this, viewEngine});
        } else {
            this.f19190a = viewEngine;
        }
    }
}
