package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(79691785);
    }

    public static void a(vk vkVar, AURAExecuteNodeModel aURAExecuteNodeModel, AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, wi wiVar, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b964c08c", new Object[]{vkVar, aURAExecuteNodeModel, aURAFlowData, aURAGlobalData, wiVar, ptVar});
            return;
        }
        List<lbb> c = vkVar.f(aURAExecuteNodeModel.code, wiVar).c();
        if (!c.isEmpty()) {
            for (lbb lbbVar : c) {
                lbbVar.onDataChanged(aURAFlowData, aURAGlobalData, ptVar);
            }
            Map<String, List<AURAExecuteNodeModel>> map = aURAExecuteNodeModel.extensions;
            if (!(map == null || map.isEmpty())) {
                for (Map.Entry<String, List<AURAExecuteNodeModel>> entry : map.entrySet()) {
                    List<AURAExecuteNodeModel> value = entry.getValue();
                    if (value != null && !value.isEmpty()) {
                        for (AURAExecuteNodeModel aURAExecuteNodeModel2 : value) {
                            if (!vkVar.f(aURAExecuteNodeModel2.code, wiVar).c().isEmpty()) {
                                a(vkVar, aURAExecuteNodeModel2, aURAFlowData, aURAGlobalData, wiVar, ptVar);
                            }
                        }
                    }
                }
            }
        }
    }
}
