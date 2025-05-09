package tb;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ey6 implements BridgeCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final uq f18882a;
    public final boolean b;

    static {
        t2o.a(839909439);
    }

    public ey6(uq uqVar, boolean z) {
        this.f18882a = uqVar;
        this.b = z;
    }

    @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
    public void sendBridgeResponse(BridgeResponse bridgeResponse) {
        jr jrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9dfe87", new Object[]{this, bridgeResponse});
        } else if (this.f18882a != null) {
            if (bridgeResponse == null) {
                jrVar = new jr(true, new JSONObject());
            } else if (bridgeResponse instanceof BridgeResponse.Error) {
                BridgeResponse.Error error = (BridgeResponse.Error) bridgeResponse;
                jrVar = new jr.a(error.getErrorCode() + "", error.getErrorMessage(), error.getSignature());
            } else {
                jrVar = new jr(true, bridgeResponse.get());
            }
            this.f18882a.a(jrVar, this.b);
        }
    }

    @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
    public void sendJSONResponse(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56830cbc", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (this.f18882a != null) {
            this.f18882a.a(new jr(true, jSONObject), z);
        }
    }

    @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
    public void sendJSONResponse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3456c918", new Object[]{this, jSONObject});
        } else if (this.f18882a != null) {
            this.f18882a.a(new jr(true, jSONObject), this.b);
        }
    }
}
