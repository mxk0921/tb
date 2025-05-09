package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714355);
    }

    public static void a(FluidContext fluidContext, d.j jVar, String str, String str2, String str3, Map map) {
        a.d e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d34b8b", new Object[]{fluidContext, jVar, str, str2, str3, map});
            return;
        }
        a currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData();
        vrp vrpVar = new vrp(str, str2, str3, (currentMediaSetData == null || (e = currentMediaSetData.e()) == null) ? null : e.c, null, map, new lfs(jVar));
        ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(vrpVar);
        ir9.b("FluidChannelMessageSender", "【sendMessage】Send message: " + vrpVar);
    }
}
