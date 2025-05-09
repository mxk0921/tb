package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "adam.impl.parser.redirect.eventChain")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nrl implements dcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AURAGlobalData f24906a;

    static {
        t2o.a(350224400);
        t2o.a(80740505);
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            this.f24906a = aURAGlobalData;
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.dcb
    public void p(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900fdd7", new Object[]{this, multiTreeNode, ultronProtocol});
            return;
        }
        JSONObject jSONObject = ultronProtocol.getFeatures() instanceof JSONObject ? (JSONObject) ultronProtocol.getFeatures() : null;
        if (jSONObject != null) {
            Object obj = jSONObject.get(DXTraceUtil.TYPE_EVENT_CHAIN_STRING);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                JSONArray jSONArray = jSONObject2.getJSONArray("source");
                this.f24906a.update("adamConfig", jSONObject2.getJSONObject("defaultConfig"));
                this.f24906a.update("templates", jSONArray);
            }
        }
    }

    @Override // tb.dcb
    public String s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5c80c46", new Object[]{this, jSONObject});
        }
        return "0";
    }

    @Override // tb.dcb
    public void w0(MultiTreeNode multiTreeNode, UltronProtocol ultronProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51ac098", new Object[]{this, multiTreeNode, ultronProtocol});
        }
    }
}
