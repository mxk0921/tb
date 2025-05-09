package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.parse.popupWindow")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ol extends gt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, RenderComponent> c;

    static {
        t2o.a(81789201);
    }

    public static /* synthetic */ Object ipc$super(ol olVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/popupWindow/AURAPopupWindowStateExtension");
    }

    @Override // tb.gt, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.c = (Map) aURAGlobalData.get("global_data_popup_window", Map.class);
        this.f20205a = aURAGlobalData;
    }

    @Override // tb.gt, tb.dcb
    public void w0(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        RenderComponent data;
        Component component;
        Map<String, Object> fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51ac098", new Object[]{this, multiTreeNode, ultronProtocol});
        } else if (multiTreeNode != null && (data = multiTreeNode.data()) != null && (component = data.getComponent()) != null && (fields = component.getFields()) != null) {
            Object obj = fields.get("code");
            Object obj2 = fields.get("state");
            if ((obj instanceof String) && (obj2 instanceof String)) {
                String str = (String) obj;
                if ("open".equals(obj2)) {
                    if (this.c == null) {
                        this.c = new HashMap();
                    }
                    if (this.c.size() != 0) {
                        return;
                    }
                    if ("commonErrorPopup".equals(data.getKey()) || "itemErrorPopup".equals(data.getKey())) {
                        x(str, data);
                    } else if (multiTreeNode.parent() != null) {
                        x(str, multiTreeNode.parent().data());
                    }
                }
            }
        }
    }

    public final void x(String str, RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ba6369", new Object[]{this, str, renderComponent});
            return;
        }
        this.c.put(str, renderComponent);
        this.f20205a.update("global_data_popup_window", this.c);
    }
}
