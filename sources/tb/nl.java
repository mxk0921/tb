package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.aspect.lifecycle.popupWindow")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nl extends ms {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, RenderComponent> f;

    static {
        t2o.a(81789200);
    }

    public static /* synthetic */ Object ipc$super(nl nlVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 418368253) {
            super.afterFlowExecute((yk) objArr[0], (cg) objArr[1], ((Boolean) objArr[2]).booleanValue());
            return null;
        } else if (hashCode == 1111077198) {
            super.beforeServiceExecute((AURAInputData) objArr[0], (cg) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/popupWindow/AURAPopupWindowLifecycleExtension");
        }
    }

    public final boolean P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ec722a8", new Object[]{this})).booleanValue();
        }
        return xk.a("enablePopupWindowClearPerf", true);
    }

    public final Map<String, RenderComponent> Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("37f1ddd0", new Object[]{this});
        }
        if (this.f == null && L0() != null) {
            this.f = (Map) L0().get("global_data_popup_window", Map.class);
        }
        return this.f;
    }

    public final void R0(String str, RenderComponent renderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91ec988e", new Object[]{this, str, renderComponent});
            return;
        }
        AURARenderComponent aURARenderComponent = new AURARenderComponent();
        aURARenderComponent.key = renderComponent.getKey();
        Component component = renderComponent.getComponent();
        aURARenderComponent.data = new AURARenderComponentData(component.getType(), component.getFields(), component.getEvents(), component.getFeatures(), null, component.getCodePopupWindowMap(), component.getLocalFields(), component.getStatus());
        qi qiVar = new qi();
        qiVar.t(aURARenderComponent);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) str);
        if ("commonErrorPopup".equals(renderComponent.getKey()) || "itemErrorPopup".equals(renderComponent.getKey())) {
            jSONObject.put("popupData", (Object) renderComponent);
        }
        qiVar.n(jSONObject);
        pi.b(M0().c(), ml.EVENT_TYPE, qiVar);
    }

    @Override // tb.ms, tb.xab
    public void afterFlowExecute(yk ykVar, cg cgVar, boolean z) {
        RenderComponent renderComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18efcafd", new Object[]{this, ykVar, cgVar, new Boolean(z)});
            return;
        }
        super.afterFlowExecute(ykVar, cgVar, z);
        Map<String, RenderComponent> Q0 = Q0();
        if (Q0 != null && Q0.size() == 1) {
            for (String str : Q0.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    if (P0()) {
                        renderComponent = Q0.remove(str);
                    } else {
                        renderComponent = Q0.get(str);
                    }
                    if (renderComponent != null) {
                        R0(str, renderComponent);
                    }
                }
            }
        }
    }

    @Override // tb.ms, tb.xab
    public void beforeServiceExecute(AURAInputData aURAInputData, cg cgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4239b14e", new Object[]{this, aURAInputData, cgVar});
            return;
        }
        super.beforeServiceExecute(aURAInputData, cgVar);
        if (!P0()) {
            Map<String, RenderComponent> Q0 = Q0();
            if (dl.PARSE_SERVICE_CODE.equals(cgVar.b()) && Q0 != null) {
                Q0.clear();
            }
        }
    }
}
