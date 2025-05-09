package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ln1 implements yhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f23433a;
    public final olk<yhb> b = new olk<>();

    static {
        t2o.a(468713878);
        t2o.a(468713879);
        t2o.a(468713943);
    }

    public ln1(FluidContext fluidContext) {
        this.f23433a = fluidContext;
    }

    public void addBackEventListener(yhb yhbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c3d791", new Object[]{this, yhbVar});
        } else if (yhbVar != null) {
            this.b.a(yhbVar);
        }
    }

    @Override // tb.yhb
    public void onBackClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce9d949", new Object[]{this});
            return;
        }
        for (yhb yhbVar : this.b.b()) {
            try {
                yhbVar.onBackClick();
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(this.f23433a, yhbVar, "onBackClick", e);
            }
        }
    }

    public void removeBackEventListener(yhb yhbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811e8c4e", new Object[]{this, yhbVar});
        } else if (yhbVar != null) {
            this.b.e(yhbVar);
        }
    }
}
