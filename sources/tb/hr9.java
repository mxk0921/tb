package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.render.MultiRecyclerViewAdapter;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714358);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd290a3", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableListChangedMsg", true);
    }

    public static void b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de725abd", new Object[]{fluidContext});
            return;
        }
        a currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData();
        if (currentMediaSetData != null) {
            a.d e = currentMediaSetData.e();
            IMessageService iMessageService = (IMessageService) fluidContext.getService(IMessageService.class);
            if (iMessageService != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("isScroll", "true");
                iMessageService.sendMessage(new vrp("VSMSG_recyclerViewGlissade", e.c, hashMap));
            }
        }
    }

    public static void c(FluidContext fluidContext) {
        a currentMediaSetData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8163284c", new Object[]{fluidContext});
        } else if (a() && (currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData()) != null) {
            a.d e = currentMediaSetData.e();
            IMessageService iMessageService = (IMessageService) fluidContext.getService(IMessageService.class);
            if (iMessageService != null) {
                iMessageService.sendMessage(new vrp("VSMSG_listChanged", e.c, new HashMap()));
            }
            MultiRecyclerViewAdapter mediaCardListAdapter = ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).getMediaCardListAdapter();
            if (mediaCardListAdapter != null) {
                mediaCardListAdapter.s0();
            }
        }
    }
}
