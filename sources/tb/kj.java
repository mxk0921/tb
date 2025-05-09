package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.parse.component.groupSelected")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kj extends gt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81788998);
    }

    public static /* synthetic */ Object ipc$super(kj kjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/common/parse/AURAGroupSelectedExtension");
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
        }
    }

    @Override // tb.gt, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.gt
    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.gt, tb.dcb
    public void w0(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51ac098", new Object[]{this, multiTreeNode, ultronProtocol});
        } else if (multiTreeNode.data() != null && multiTreeNode.data().getComponentView() != null) {
            x(multiTreeNode.data());
        }
    }

    public final void x(RenderComponent renderComponent) {
        Map<String, Object> fields;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da573e19", new Object[]{this, renderComponent});
            return;
        }
        Component component = renderComponent.component;
        if (component != null && (fields = component.getFields()) != null) {
            Object obj = fields.get("group");
            if ((obj instanceof JSONObject) && (jSONArray = (jSONObject = (JSONObject) obj).getJSONArray("items")) != null) {
                String string = jSONObject.getString("min");
                if (!TextUtils.isEmpty(string)) {
                    Iterator<Object> it = jSONArray.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            String string2 = ((JSONObject) next).getString("optional");
                            if (!TextUtils.isEmpty(string2) && (string2.equals("disable") || string2.equals("none"))) {
                                i++;
                            }
                        }
                    }
                    if (Math.max(0, jSONArray.size() - i) <= Integer.parseInt(string) && (jSONArray2 = jSONObject.getJSONArray("selectedId")) != null) {
                        Iterator<Object> it2 = jSONArray.iterator();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (next2 instanceof JSONObject) {
                                JSONObject jSONObject2 = (JSONObject) next2;
                                String string3 = jSONObject2.getString("id");
                                if (!TextUtils.isEmpty(string3) && TextUtils.isEmpty(jSONObject2.getString("optional")) && jSONArray2.contains(string3)) {
                                    jSONObject2.put("optional", (Object) "force");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
