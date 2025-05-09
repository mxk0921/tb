package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.parse.dataRef")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sh extends gt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81788995);
    }

    public static /* synthetic */ Object ipc$super(sh shVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/common/parse/AURADataRefExtension");
    }

    public final Object B(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3f261a", new Object[]{this, jSONObject, str});
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "*")) {
            return jSONObject;
        }
        return gl.d(str.split("\\."), jSONObject);
    }

    public final void m0(JSONObject jSONObject, String str, Component component, String str2) {
        Map b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979049da", new Object[]{this, jSONObject, str, component, str2});
            return;
        }
        Object B = B(jSONObject, str);
        if (B != null && (b = gl.b(str2, component)) != null) {
            String[] j = gl.j(str2);
            if (j != null) {
                gl.m(j, b, B);
            } else if (B instanceof Map) {
                b.putAll((Map) B);
            }
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
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51ac098", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        RenderComponent data = multiTreeNode.data();
        if (data != null && (component = data.getComponent()) != null) {
            Object features = component.getFeatures();
            if (features instanceof JSONObject) {
                L(ultronProtocol.getOriginData(), component, x((JSONObject) features));
            }
        }
    }

    public final JSONArray x(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9e84ce6", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("dataRef");
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getJSONArray("metadatas");
    }

    public final void L(JSONObject jSONObject, Component component, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212c34d5", new Object[]{this, jSONObject, component, jSONArray});
        } else if (!bh.b(jSONObject) && !bh.a(jSONArray)) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("source");
                    String string2 = jSONObject2.getString("target");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        if (string.startsWith("$.")) {
                            string = string.substring(2);
                        }
                        if (string2.startsWith("$.")) {
                            string2 = string2.substring(2);
                        }
                        try {
                            m0(jSONObject, string, component, string2);
                        } catch (Throwable th) {
                            rbb g = ck.g();
                            g.b("AURADataRefExtension", "parseMultiDataRef", "parseMultiDataRef exception:" + th.getMessage());
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
