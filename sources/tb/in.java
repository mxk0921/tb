package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.Global;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.parse.stateTree.shareContext")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class in extends gt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, ko> c;

    static {
        t2o.a(81789208);
    }

    public static /* synthetic */ Object ipc$super(in inVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/sharecontext/AURAShareContextStateTreeParseExtension");
    }

    public final void B(JSONObject jSONObject, ko koVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b8de73", new Object[]{this, jSONObject, koVar});
            return;
        }
        Component a2 = koVar.a();
        JSONObject b = koVar.b();
        JSONObject jSONObject2 = b.getJSONObject("fields");
        if (!bh.b(jSONObject2)) {
            N0(a2.getFields(), jSONObject2, jSONObject);
        }
        JSONObject jSONObject3 = b.getJSONObject("events");
        if (!bh.b(jSONObject3)) {
            N0(a2.getEvents(), jSONObject3, jSONObject);
        }
    }

    public final JSONObject K0(AURAGlobalData aURAGlobalData, UltronProtocol ultronProtocol) {
        Global global;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("66bd764f", new Object[]{this, aURAGlobalData, ultronProtocol});
        }
        JSONObject jSONObject = (JSONObject) aURAGlobalData.get("aura_share_context", JSONObject.class);
        if (jSONObject != null || (global = ultronProtocol.getGlobal()) == null) {
            return jSONObject;
        }
        JSONObject context = global.getContext();
        if (context == null) {
            context = new JSONObject();
        }
        aURAGlobalData.update("aura_share_context", context);
        return context;
    }

    public final void L(String str, Component component, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204aefca", new Object[]{this, str, component, jSONObject});
            return;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        this.c.put(str, new ko(str, component, jSONObject));
        this.f20205a.update("global_data_local_adjust", this.c);
    }

    public final Object L0(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3f261a", new Object[]{this, jSONObject, str});
        }
        String J0 = J0(str);
        if (TextUtils.isEmpty(J0) || TextUtils.equals(J0, "*")) {
            return jSONObject;
        }
        return gl.d(J0.split("\\."), jSONObject);
    }

    public final boolean M0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7c3f6e0", new Object[]{this, jSONObject})).booleanValue();
        }
        return jSONObject.getBooleanValue("useSharedContext");
    }

    public final void N0(Object obj, JSONObject jSONObject, JSONObject jSONObject2) {
        Object L0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32eb2b0c", new Object[]{this, obj, jSONObject, jSONObject2});
            return;
        }
        for (String str : jSONObject.keySet()) {
            Object obj2 = jSONObject.get(str);
            if (obj2 instanceof String) {
                String str2 = (String) obj2;
                if ((obj instanceof Map) && (L0 = L0(jSONObject2, str2)) != null) {
                    ((Map) obj).put(str, L0);
                }
            }
        }
    }

    public final void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12499a32", new Object[]{this});
        } else if (this.c == null) {
            AURAGlobalData aURAGlobalData = this.f20205a;
            if (aURAGlobalData == null) {
                this.c = new HashMap();
                return;
            }
            Map<String, ko> map = (Map) aURAGlobalData.get("global_data_local_adjust", Map.class);
            this.c = map;
            if (map == null) {
                HashMap hashMap = new HashMap();
                this.c = hashMap;
                this.f20205a.update("global_data_local_adjust", hashMap);
            }
        }
    }

    @Override // tb.gt, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            this.f20205a = aURAGlobalData;
        }
    }

    @Override // tb.gt, tb.dcb
    public void p(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900fdd7", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        m0();
        if (this.c == null) {
            ck.g().d("shareContext扩展点实现mUseSharedContextComponentMap为null");
            return;
        }
        JSONObject K0 = K0(this.f20205a, ultronProtocol);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context", (Object) K0);
        x(jSONObject, this.c);
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
            return;
        }
        RenderComponent data = multiTreeNode.data();
        if (data == null) {
            ck.g().d("shareContext扩展点实现RenderComponent为null");
            return;
        }
        String key = data.getKey();
        if (TextUtils.isEmpty(key)) {
            ck.g().d("shareContext扩展点实现componentKey为null");
            return;
        }
        Component component = data.getComponent();
        Object features = component.getFeatures();
        if (!(features instanceof JSONObject)) {
            ck.g().d("shareContext扩展点实现features不为JSONObject类型");
            return;
        }
        JSONObject jSONObject = ((JSONObject) features).getJSONObject("localAdjust");
        if (jSONObject == null) {
            ck.g().d("localAdjust is null!");
        } else if (!M0(jSONObject)) {
            ck.g().d("useSharedContext is false!");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("dynamicBindingData");
            if (bh.b(jSONObject2)) {
                ck.g().d("dynamicBindingData is null!");
                return;
            }
            m0();
            L(key, component, jSONObject2);
        }
    }

    public final void x(JSONObject jSONObject, Map<String, ko> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c32e79f", new Object[]{this, jSONObject, map});
        } else if (jSONObject == null) {
            ck.g().d("shareContext扩展点实现shareContext为null");
        } else {
            for (String str : map.keySet()) {
                ko koVar = map.get(str);
                if (koVar != null) {
                    B(jSONObject, koVar);
                }
            }
        }
    }

    public final String J0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("837bdbd2", new Object[]{this, str});
        }
        if (str.startsWith("$.")) {
            str = str.substring(2);
        }
        if (str.startsWith("${")) {
            str = str.substring(2);
        }
        return str.endsWith("}") ? str.substring(0, str.length() - 1) : str;
    }
}
