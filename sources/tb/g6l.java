package tb;

import android.text.TextUtils;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.cl;
import tb.j1i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class g6l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740712);
    }

    public abstract void a(TreeNode<RenderComponent> treeNode, mu1 mu1Var);

    public jn b(mu1 mu1Var, jn jnVar, j1i.a aVar) throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jn) ipChange.ipc$dispatch("f22eb162", new Object[]{this, mu1Var, jnVar, aVar});
        }
        MultiTreeNode i = jnVar.i();
        if (i == null) {
            return jn.a();
        }
        Map<String, RenderComponent> e = jnVar.e();
        TreeNode<RenderComponent> find = i.find(e.get(mu1Var.a().getTarget()));
        if (find != null) {
            c(jnVar, find, mu1Var);
            a(find, mu1Var);
            if (aVar != null) {
                ((cl.a) aVar).a(find);
            }
        }
        return jn.c(jnVar.k(), jnVar.h(), jnVar.g(), jnVar.l(), i, e, jnVar.d(), jnVar.f());
    }

    public final void c(jn jnVar, TreeNode<RenderComponent> treeNode, mu1 mu1Var) throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f60855", new Object[]{this, jnVar, treeNode, mu1Var});
            return;
        }
        UltronDeltaProtocol b = mu1Var.b();
        RenderComponent data = treeNode.data();
        if (b != null && data != null && !TextUtils.isEmpty(data.key)) {
            jnVar.q(mu1Var.c(), data.key);
        }
    }
}
