package tb;

import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.delta.OperateInsert;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hbf extends g6l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "insert";

    static {
        t2o.a(80740710);
    }

    public static /* synthetic */ Object ipc$super(hbf hbfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/parse/operation/InsertOperation");
    }

    @Override // tb.g6l
    public void a(TreeNode<RenderComponent> treeNode, mu1 mu1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9080d1d7", new Object[]{this, treeNode, mu1Var});
        } else if (mu1Var.a() == null || mu1Var.a().getTarget() == null || mu1Var.b() == null || mu1Var.b().getData() == null || mu1Var.b().getData().get(mu1Var.a().getTarget()) == null) {
            dxu.a().d(OperateInsert.TAG, "action.getDelta() == null || action.getDelta().target == null || action.getDeltaProtocol() == null || action.getDeltaProtocol().data == null || action.getDeltaProtocol().data.get(action.getDelta().target) == null");
        } else {
            Map<String, Object> fields = mu1Var.b().getData().get(mu1Var.a().getTarget()).getFields();
            if (treeNode.data().component.getFields() == null || fields == null) {
                dxu.a().d(OperateInsert.TAG, "状态树未找到对应的节点");
            } else {
                treeNode.data().component.getFields().putAll(fields);
            }
        }
    }
}
