package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class p1o extends g6l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "replace";

    static {
        t2o.a(80740713);
    }

    public static /* synthetic */ Object ipc$super(p1o p1oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/parse/operation/ReplaceOperation");
    }

    @Override // tb.g6l
    public void a(TreeNode<RenderComponent> treeNode, mu1 mu1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9080d1d7", new Object[]{this, treeNode, mu1Var});
        } else if (mu1Var.a() == null || mu1Var.a().getTarget() == null || mu1Var.b() == null || mu1Var.b().getData() == null || mu1Var.b().getData().get(mu1Var.a().getTarget()) == null) {
            dxu.a().d(e6l.TAG, "action.getDelta() == null || action.getDelta().target == null || action.getDeltaProtocol() == null || action.getDeltaProtocol().data == null || action.getDeltaProtocol().data.get(action.getDelta().target) == null");
        } else {
            Component component = mu1Var.b().getData().get(mu1Var.a().getTarget());
            Component component2 = treeNode.data().getComponent();
            Map<String, Object> fields = component.getFields();
            if (fields != null) {
                component2.fields = fields;
            }
            Map<String, List<Event>> events = component.getEvents();
            if (events != null) {
                component2.events = events;
            }
            Map<String, Object> localFields = component.getLocalFields();
            if (localFields != null) {
                component2.localFields = localFields;
            }
            Object features = component.getFeatures();
            if (features instanceof JSONObject) {
                component2.features = features;
            }
        }
    }
}
