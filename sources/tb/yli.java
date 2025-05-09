package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.TreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yli extends g6l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "merge";

    static {
        t2o.a(80740711);
    }

    public static /* synthetic */ Object ipc$super(yli yliVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/parse/operation/MergeOperation");
    }

    @Override // tb.g6l
    public void a(TreeNode<RenderComponent> treeNode, mu1 mu1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9080d1d7", new Object[]{this, treeNode, mu1Var});
        } else if (mu1Var.a() == null || mu1Var.a().getTarget() == null || mu1Var.b() == null || mu1Var.b().getData() == null || mu1Var.b().getData().get(mu1Var.a().getTarget()) == null) {
            dxu.a().d("MergeOperation", "action.getDelta() == null || action.getDelta().target == null || action.getDeltaProtocol() == null || action.getDeltaProtocol().data == null || action.getDeltaProtocol().data.get(action.getDelta().target) == null");
        } else {
            Component component = mu1Var.b().getData().get(mu1Var.a().getTarget());
            RenderComponent data = treeNode.data();
            if (data != null) {
                Component component2 = data.getComponent();
                Map<String, Object> fields = component.getFields();
                if (fields != null) {
                    if (component2.getFields() == null) {
                        component2.fields = new HashMap();
                    }
                    component2.getFields().putAll(fields);
                } else {
                    dxu.a().d("MergeOperation", "fields 节点为null");
                }
                Map<String, List<Event>> events = component.getEvents();
                if (events != null) {
                    if (component2.getEvents() == null) {
                        component2.events = new HashMap();
                    }
                    component2.getEvents().putAll(events);
                } else {
                    dxu.a().d("MergeOperation", "events 节点为null");
                }
                Map<String, Object> localFields = component.getLocalFields();
                if (localFields != null) {
                    if (component2.getLocalFields() == null) {
                        component2.localFields = new HashMap();
                    }
                    component2.getLocalFields().putAll(localFields);
                } else {
                    dxu.a().d("MergeOperation", "localFields 节点为null");
                }
                Object features = component.getFeatures();
                if (features instanceof JSONObject) {
                    if (component2.getFeatures() == null) {
                        component2.features = new JSONObject();
                    }
                    ((JSONObject) component2.getFeatures()).putAll((JSONObject) features);
                    return;
                }
                dxu.a().d("MergeOperation", "features 节点为null");
            }
        }
    }
}
