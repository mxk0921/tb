package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714356);
    }

    public static void a(FluidContext fluidContext) {
        a.d e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62ec52b", new Object[]{fluidContext});
            return;
        }
        a currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData();
        if (currentMediaSetData != null && (e = currentMediaSetData.e()) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("position", "up");
            IDataService iDataService = (IDataService) fluidContext.getService(IDataService.class);
            if (iDataService.getConfig() != null) {
                if (iDataService.getConfig().h()) {
                    hashMap.put("enablePlayRate", "true");
                }
                if (iDataService.getConfig().g()) {
                    hashMap.put("enablePlayFeedback", "true");
                }
                if (iDataService.getConfig().j() != null) {
                    hashMap.put("type", iDataService.getConfig().j().E);
                }
            }
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(new vrp("VSMSG_clickMore", e.c, hashMap));
        }
    }
}
