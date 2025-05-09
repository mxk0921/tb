package tb;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.ComponentView;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class el {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740526);
    }

    public static RenderComponent a(UltronProtocol ultronProtocol, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderComponent) ipChange.ipc$dispatch("12f12726", new Object[]{ultronProtocol, str});
        }
        Map<String, Component> data = ultronProtocol.getData();
        ComponentView componentView = null;
        if (data == null) {
            return null;
        }
        Component component = data.get(str);
        if (component != null) {
            componentView = b(ultronProtocol, component.getType());
        }
        return new RenderComponent(str, component, componentView);
    }

    public static ComponentView b(UltronProtocol ultronProtocol, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentView) ipChange.ipc$dispatch("35426ed0", new Object[]{ultronProtocol, str});
        }
        for (ComponentView componentView : ultronProtocol.getContainer().getData()) {
            if (componentView.getType().contains(str)) {
                return componentView;
            }
        }
        return new ComponentView();
    }

    public static boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0b3d40f", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
        if (jSONObject2 == null) {
            return false;
        }
        return jSONObject2.getBooleanValue("degrade");
    }
}
