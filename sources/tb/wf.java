package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.protocolCropper.ultron.adjust")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wf extends hs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789203);
    }

    public static /* synthetic */ Object ipc$super(wf wfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/protocolcropper/AURAAdjustUltronProtocolCropperExtension");
    }

    @Override // tb.hs
    public void L(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c47e4f3", new Object[]{this, jSONObject});
        } else {
            ho.b((UltronProtocol) x().get(zj.GLOBAL_DATA_PROTOCOL, UltronProtocol.class), jSONObject);
        }
    }
}
