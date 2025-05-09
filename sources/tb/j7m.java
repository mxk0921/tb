package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.hostcontainer.pageinterface.IHostPageInterfaceService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713919);
    }

    public static boolean a(FluidContext fluidContext, Activity activity) {
        d3a d3aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d21e15f", new Object[]{fluidContext, activity})).booleanValue();
        }
        anl pageInterface = ((IHostPageInterfaceService) fluidContext.getService(IHostPageInterfaceService.class)).getPageInterface();
        if (pageInterface != null) {
            d3aVar = c3a.a((bod) pageInterface);
        } else if (activity instanceof bod) {
            d3aVar = c3a.a((bod) activity);
        } else {
            d3aVar = null;
        }
        if (d3aVar == null || !d3aVar.g()) {
            return false;
        }
        return true;
    }
}
