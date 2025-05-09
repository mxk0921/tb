package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class abm implements mgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e3b f15643a;

    static {
        t2o.a(491782599);
        t2o.a(488636462);
    }

    public abm(e3b e3bVar) {
        this.f15643a = e3bVar;
    }

    @Override // tb.mgb
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        fve.e("PopAppLifecycleListener", "onAppToBackground");
        e3b e3bVar = this.f15643a;
        if (e3bVar != null) {
            e3bVar.j().f();
        }
    }

    @Override // tb.mgb
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        fve.e("PopAppLifecycleListener", "onAppToFront");
        e3b e3bVar = this.f15643a;
        if (e3bVar != null) {
            e3bVar.j().g();
        }
    }
}
