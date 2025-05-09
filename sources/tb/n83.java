package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import tb.d0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n83 implements d0c, yhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f24568a;
    public final olk<d0c> b = new olk<>();
    public final olk<yhb> c = new olk<>();

    static {
        t2o.a(468713938);
        t2o.a(468713939);
        t2o.a(468713944);
        t2o.a(468713943);
    }

    public n83(FluidContext fluidContext) {
        this.f24568a = fluidContext;
    }

    public void a(d0c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe054d36", new Object[]{this, aVar});
        } else if (aVar != null) {
            this.b.a(aVar);
        }
    }

    public void b(d0c d0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f4d0a1", new Object[]{this, d0cVar});
        } else if (d0cVar != null) {
            this.b.a(d0cVar);
        }
    }

    @Override // tb.d0c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
            return;
        }
        for (d0c d0cVar : this.b.b()) {
            try {
                d0cVar.c();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f24568a, d0cVar, "onLongClickCancel", e);
            }
        }
    }

    @Override // tb.d0c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
            return;
        }
        for (d0c d0cVar : this.b.b()) {
            try {
                d0cVar.d();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f24568a, d0cVar, "onPendingClick", e);
            }
        }
    }

    @Override // tb.d0c
    public void f(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        for (d0c d0cVar : this.b.b()) {
            try {
                d0cVar.f(f, f2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f24568a, d0cVar, "onDoubleClick", e);
            }
        }
    }

    @Override // tb.d0c
    public void g(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        for (d0c d0cVar : this.b.b()) {
            try {
                d0cVar.g(f, f2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f24568a, d0cVar, "onTripleClick", e);
            }
        }
    }

    @Override // tb.d0c
    public void h(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        for (d0c d0cVar : this.b.b()) {
            try {
                d0cVar.h(f, f2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f24568a, d0cVar, "onSingleClick", e);
            }
        }
    }

    @Override // tb.yhb
    public void onBackClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce9d949", new Object[]{this});
            return;
        }
        for (yhb yhbVar : this.c.b()) {
            try {
                yhbVar.onBackClick();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f24568a, yhbVar, "onBackClick", e);
            }
        }
    }

    @Override // tb.d0c
    public boolean e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        for (d0c d0cVar : this.b.b()) {
            try {
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f24568a, d0cVar, "onLongClick", e);
            }
            if (d0cVar.e(z)) {
                ir9.b("CardListenersManager", "The observer: " + d0cVar + " intercept the onLongClick event");
                break;
            }
            continue;
        }
        return true;
    }
}
