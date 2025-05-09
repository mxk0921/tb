package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vfg implements gjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f29981a;
    public final olk<fjc> b = new olk<>();
    public boolean c = false;

    static {
        t2o.a(468714067);
        t2o.a(468714065);
    }

    public vfg(FluidContext fluidContext) {
        this.f29981a = fluidContext;
    }

    @Override // tb.hjc
    public void a(fjc fjcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d84c8a97", new Object[]{this, fjcVar});
        } else if (fjcVar != null) {
            this.b.a(fjcVar);
        }
    }

    @Override // tb.gjc
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89cf8bc", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.fjc
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2907857", new Object[]{this});
            return;
        }
        this.c = true;
        ir9.b("LandscapeListenerManager", "onScreenLandscape, mIsLandscape: " + this.c + ", observers size: " + this.b.c());
        for (fjc fjcVar : this.b.b()) {
            try {
                fjcVar.v();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29981a, fjcVar, "onScreenLandscape", e);
            }
        }
    }

    @Override // tb.fjc
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41b2f79", new Object[]{this});
            return;
        }
        this.c = false;
        ir9.b("LandscapeListenerManager", "onScreenNormal, mIsLandscape: " + this.c + ", observers size: " + this.b.c());
        for (fjc fjcVar : this.b.b()) {
            try {
                fjcVar.x();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f29981a, fjcVar, "onScreenNormal", e);
            }
        }
    }
}
