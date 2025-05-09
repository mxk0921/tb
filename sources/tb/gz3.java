package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.PopupDialog;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gz3 implements dob {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final olk<dob> f20323a = new olk<>();

    static {
        t2o.a(468713687);
        t2o.a(468713680);
        t2o.a(468713681);
    }

    @Override // tb.dob
    public void a(FluidContext fluidContext, PopupDialog popupDialog, PopupDialog popupDialog2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3330bd50", new Object[]{this, fluidContext, popupDialog, popupDialog2});
            return;
        }
        for (dob dobVar : this.f20323a.b()) {
            try {
                dobVar.a(fluidContext, popupDialog, popupDialog2);
            } catch (Exception e) {
                FluidException.throwObserverCallbackException(fluidContext, dobVar, "", e);
            }
        }
    }

    public void b(dob dobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9ece79", new Object[]{this, dobVar});
        } else if (dobVar != null) {
            this.f20323a.a(dobVar);
        }
    }
}
