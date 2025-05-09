package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.event.adjust.trigger")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class vf extends js {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MultiTreeNode e;
    public hbb f;

    static {
        t2o.a(81789115);
    }

    public static /* synthetic */ Object ipc$super(vf vfVar, String str, Object... objArr) {
        if (str.hashCode() == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/linkage/AURAAdjustTriggerExtension");
    }

    @Override // tb.js
    public boolean m0(mi miVar, mbb<mi, Void> mbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3db904b0", new Object[]{this, miVar, mbbVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.zs, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        this.e = (MultiTreeNode) aURAGlobalData.get("global_data_render_root", MultiTreeNode.class);
        this.f = hbbVar;
    }

    @Override // tb.js
    public void L(UMFLinkageTrigger uMFLinkageTrigger, List<nbb> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd90ae90", new Object[]{this, uMFLinkageTrigger, list});
            return;
        }
        MultiTreeNode multiTreeNode = this.e;
        if (multiTreeNode == null) {
            this.f.b(new mi(1, "AURALinkagePluginDomain", "adjustTriggerExt", "状态树为空，请检查解析服务是否正确保存状态树到全局变量中"));
        } else {
            uMFLinkageTrigger.setStateTree(multiTreeNode);
        }
    }
}
