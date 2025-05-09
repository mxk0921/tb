package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.layoutmanager.module.NavigationTabModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y5b implements NavigationTabModule.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f31864a;
    public final olk<NavigationTabModule.d> b = new olk<>();

    static {
        t2o.a(468714386);
        t2o.a(468714387);
        t2o.a(502268122);
    }

    public y5b(FluidContext fluidContext) {
        this.f31864a = fluidContext;
    }

    @Override // com.taobao.android.layoutmanager.module.NavigationTabModule.d
    public void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a4f1fd", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b("HostAppListenersManager", "onNavigationShowHideStatusChanged 被执行，isHideStatus：" + z + "，监听器数量：" + this.b.c());
        for (NavigationTabModule.d dVar : this.b.b()) {
            try {
                dVar.F(z);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f31864a, dVar, "onNavigationShowHideStatusChanged", e);
            }
        }
    }

    public void a(NavigationTabModule.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8694d9c", new Object[]{this, dVar});
        } else if (dVar != null) {
            this.b.a(dVar);
        }
    }

    public void b(NavigationTabModule.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("433d30bf", new Object[]{this, dVar});
        } else if (dVar != null) {
            this.b.e(dVar);
        }
    }
}
