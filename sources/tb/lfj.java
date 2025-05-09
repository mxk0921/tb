package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lfj implements xxc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final olk<xxc> f23314a = new olk<>();

    static {
        t2o.a(468714591);
        t2o.a(468714590);
        t2o.a(468714589);
    }

    public void addMuteFlagChangedListener(xxc xxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3070590", new Object[]{this, xxcVar});
        } else if (xxcVar != null) {
            this.f23314a.a(xxcVar);
        }
    }

    @Override // tb.xxc
    public void onMuteFlagChanged(FluidContext fluidContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aea737bd", new Object[]{this, fluidContext, str, str2});
            return;
        }
        for (xxc xxcVar : this.f23314a.b()) {
            try {
                xxcVar.onMuteFlagChanged(fluidContext, str, str2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(null, xxcVar, "", e);
            }
        }
    }

    public void removeMuteFlagChangedListener(xxc xxcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b995eb33", new Object[]{this, xxcVar});
        } else if (xxcVar != null) {
            this.f23314a.e(xxcVar);
        }
    }
}
