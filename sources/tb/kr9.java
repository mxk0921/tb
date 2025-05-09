package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class kr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714359);
    }

    public static void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ec912a", new Object[]{fluidContext});
        } else {
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(new vrp("VSMSG_pausePlayer", pcw.i(fluidContext), null));
        }
    }
}
