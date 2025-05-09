package tb;

import com.alibaba.android.aura.nodemodel.AURAPluginNodeModel;
import com.alibaba.android.aura.nodemodel.branch.AURABranchModel;
import com.alibaba.android.aura.nodemodel.workflow.AURAExecuteNodeModel;
import com.alibaba.android.aura.nodemodel.workflow.AURAFlowNodeModel;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, AURAFlowNodeModel> f20699a = new HashMap();
    public final Map<String, AURABranchModel> b = new HashMap();

    static {
        t2o.a(79691909);
    }

    public hk(AURAPluginNodeModel aURAPluginNodeModel) {
        a(aURAPluginNodeModel);
    }

    public static hk e(AURAPluginNodeModel aURAPluginNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hk) ipChange.ipc$dispatch("2793f3ef", new Object[]{aURAPluginNodeModel});
        }
        return new hk(aURAPluginNodeModel);
    }

    public final void a(AURAPluginNodeModel aURAPluginNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18030259", new Object[]{this, aURAPluginNodeModel});
            return;
        }
        List<AURAFlowNodeModel> list = aURAPluginNodeModel.flows;
        if (!bh.a(list)) {
            for (AURAFlowNodeModel aURAFlowNodeModel : list) {
                this.f20699a.put(aURAFlowNodeModel.code, aURAFlowNodeModel);
            }
        }
        List<AURABranchModel> list2 = aURAPluginNodeModel.branches;
        if (!bh.a(list2)) {
            for (AURABranchModel aURABranchModel : list2) {
                this.b.put(aURABranchModel.code, aURABranchModel);
            }
        }
    }

    public AURABranchModel b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURABranchModel) ipChange.ipc$dispatch("c1b9fd29", new Object[]{this, str});
        }
        return (AURABranchModel) ((HashMap) this.b).get(str);
    }

    public List<AURAExecuteNodeModel> c(AURAFlowNodeModel aURAFlowNodeModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("561c5c89", new Object[]{this, aURAFlowNodeModel});
        }
        return aURAFlowNodeModel.nodes;
    }

    public AURAFlowNodeModel d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAFlowNodeModel) ipChange.ipc$dispatch("5758502c", new Object[]{this, str});
        }
        return (AURAFlowNodeModel) ((HashMap) this.f20699a).get(str);
    }
}
