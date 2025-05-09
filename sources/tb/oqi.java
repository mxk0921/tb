package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oqi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PROGRESS_POSITION_DOWN = "down";
    public static final String PROGRESS_POSITION_UP = "up";

    static {
        t2o.a(468714361);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc970cee", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableDragListviewMessage", true);
    }

    public static void c(FluidContext fluidContext, String str, Map map, String str2) {
        a currentMediaSetData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c23a5b24", new Object[]{fluidContext, str, map, str2});
            return;
        }
        IMessageService iMessageService = (IMessageService) fluidContext.getService(IMessageService.class);
        if (iMessageService != null) {
            if (!(str2 != null || (currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData()) == null || currentMediaSetData.e() == null)) {
                str2 = currentMediaSetData.e().c;
            }
            iMessageService.sendMessage(new vrp(str, str2, map));
        }
    }

    public static void d(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20561907", new Object[]{fluidContext, str});
        } else if (a()) {
            ir9.b("MessageSenderHelper", "sendDragingList state=" + str);
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            c(fluidContext, "VSMSG_draggingListView", hashMap, null);
        }
    }

    public static void b(FluidContext fluidContext, String str, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a4dcfb", new Object[]{fluidContext, str, dVar});
        } else if (dVar != null) {
            String str2 = dVar.c;
            ir9.b("MessageSenderHelper", "VSMSG_progressChanged，positionState=" + str + "; sessionId=" + str2);
            HashMap hashMap = new HashMap(1);
            hashMap.put("position", str);
            c(fluidContext, "VSMSG_progressChanged", hashMap, str2);
        }
    }
}
