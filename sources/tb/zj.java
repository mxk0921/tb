package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.parse.stateTree.linkage")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zj extends gt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    @Deprecated
    public static final String GLOBAL_DATA_PROTOCOL = "global_data_linkage_protocol";
    public static final String GLOBAL_DATA_STATE_TREE = "global_data_linkage_state_tree";
    public AURAGlobalData c;

    static {
        t2o.a(81789118);
    }

    public static /* synthetic */ Object ipc$super(zj zjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/AURALinkageParseExtension");
    }

    @Override // tb.gt, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        }
    }

    @Override // tb.gt, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            this.c = aURAGlobalData;
        }
    }

    @Override // tb.gt, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.gt, tb.dcb
    public void p(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900fdd7", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        this.c.update(GLOBAL_DATA_STATE_TREE, multiTreeNode);
        this.c.update(GLOBAL_DATA_PROTOCOL, ultronProtocol);
    }
}
