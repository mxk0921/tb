package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.nodemodel.branch.AURANodeBranchModel;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.protocolCropper.ultron.submit")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sn extends rt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789204);
    }

    public static /* synthetic */ Object ipc$super(sn snVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/protocolcropper/AURASubmitUltronProtocolCropperExtension");
    }

    public final void J0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e396ca9c", new Object[]{this, jSONObject});
            return;
        }
        UMFLinkageTrigger m0 = m0();
        if (m0 != null) {
            if (!jSONObject.containsKey(x96.PATH_OPERATOR)) {
                jSONObject.put(x96.PATH_OPERATOR, (Object) m0.getTriggerComponentKey());
            }
            if (!jSONObject.containsKey("operatorEvent")) {
                jSONObject.put("operatorEvent", (Object) m0.getEventKey());
            }
        }
    }

    @Override // tb.rt
    public void L(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c47e4f3", new Object[]{this, jSONObject});
            return;
        }
        J0(jSONObject);
        ho.b((UltronProtocol) x().get(zj.GLOBAL_DATA_PROTOCOL, UltronProtocol.class), jSONObject);
    }

    public final UMFLinkageTrigger m0() {
        AURAFlowData r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFLinkageTrigger) ipChange.ipc$dispatch("55f6ded9", new Object[]{this});
        }
        if (B().c().a(new AURANodeBranchModel(qn.BRANCH_CODE_ENABLE_SUBMIT_UPLOAD_TRIGGER, true, "default")) && (r = r()) != null) {
            return (UMFLinkageTrigger) r.get(rn.FLOW_DATA_KEY_LINKAGE_TRIGGER, UMFLinkageTrigger.class);
        }
        return null;
    }
}
