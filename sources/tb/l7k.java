package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l7k implements y6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public q2e f23150a;

    static {
        t2o.a(468714746);
        t2o.a(468714745);
    }

    @Override // tb.y6d
    public void a(FluidContext fluidContext, List<a> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dcd869c", new Object[]{this, fluidContext, list, new Boolean(z)});
            return;
        }
        ir9.b("NormalOpen_PickPreloadController", "PickPreloadControllerNew,updateView");
        ((IDataService) fluidContext.getService(IDataService.class)).setMediaSet(list);
    }

    @Override // tb.y6d
    public RotateAnimation b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RotateAnimation) ipChange.ipc$dispatch("b1a7db17", new Object[]{this});
        }
        return ((i22) this.f23150a).i();
    }

    @Override // tb.y6d
    public void c(FluidContext fluidContext, Context context, anl anlVar, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e505cd0d", new Object[]{this, fluidContext, context, anlVar, viewGroup, new Boolean(z)});
            return;
        }
        neu neuVar = new neu(context, anlVar, fluidContext, viewGroup, z);
        this.f23150a = neuVar;
        neuVar.i0();
    }

    @Override // tb.y6d
    public void d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9538a4", new Object[]{this, fluidContext});
        }
    }

    @Override // tb.y6d
    public a e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("93b3d2da", new Object[]{this, fluidContext});
        }
        return null;
    }
}
