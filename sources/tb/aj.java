package tb;

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

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.parse.stateTree.decrypt")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class aj extends gt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DECRYPT = "decrypt";
    public static final String KEY_MODULE = "module";
    public static final String KEY_VALUE = "value";
    public static final String USER_CONTEXT_KEY_DECRYPT = "user.feature.decrypt";
    public a c;
    public lo d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(String str, JSONArray jSONArray, RenderComponent renderComponent);
    }

    static {
        t2o.a(81788996);
    }

    public static /* synthetic */ Object ipc$super(aj ajVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/common/parse/AURAFeatureDecryptExtension");
    }

    @Override // tb.gt, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.d = loVar;
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

    @Override // tb.gt, tb.dcb
    public void w0(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        RenderComponent data;
        Component component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51ac098", new Object[]{this, multiTreeNode, ultronProtocol});
        } else if (x() != null && multiTreeNode != null && multiTreeNode.data() != null && (component = (data = multiTreeNode.data()).component) != null && (component.getFeatures() instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) data.component.getFeatures();
            if (jSONObject.getJSONArray(KEY_DECRYPT) != null) {
                Iterator<Object> it = jSONObject.getJSONArray(KEY_DECRYPT).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        try {
                            x().a(((JSONObject) next).getString("module"), ((JSONObject) next).getJSONArray("value"), data);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    public final a x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ab34fe0e", new Object[]{this});
        }
        if (this.c == null) {
            this.c = (a) this.d.g(USER_CONTEXT_KEY_DECRYPT, a.class);
        }
        return this.c;
    }
}
