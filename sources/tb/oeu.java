package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import tb.r2e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oeu implements r2e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f25338a;
    public final olk<r2e> b = new olk<>();
    public boolean c = false;

    static {
        t2o.a(468714742);
        t2o.a(468714741);
        t2o.a(468714743);
    }

    public oeu(FluidContext fluidContext) {
        this.f25338a = fluidContext;
    }

    public void addTransitionAnimListener(r2e r2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb8d566", new Object[]{this, r2eVar});
        } else if (r2eVar != null) {
            this.b.a(r2eVar);
        }
    }

    public boolean isTransitionAnimEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3281bcf6", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.r2e
    public void onAnimationStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771cb104", new Object[]{this});
            return;
        }
        for (r2e r2eVar : this.b.b()) {
            try {
                r2eVar.onAnimationStart();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f25338a, r2eVar, "onAnimationStart", e);
            }
        }
    }

    public void removeTransitionAnimListener(r2e r2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37d70a3", new Object[]{this, r2eVar});
        } else if (r2eVar != null) {
            this.b.e(r2eVar);
        }
    }

    public void addTransitionAnimListener(r2e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82ebcfb", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.b.a(aVar);
        }
    }

    @Override // tb.r2e
    public void onAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
            return;
        }
        this.c = true;
        for (r2e r2eVar : this.b.b()) {
            try {
                r2eVar.onAnimationEnd();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f25338a, r2eVar, "onAnimationEnd", e);
            }
        }
    }

    public void removeTransitionAnimListener(r2e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d76cb38", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.b.e(aVar);
        }
    }
}
