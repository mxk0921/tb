package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPReachViewState;
import com.taobao.android.ucp.bridge.NativeBroadcast;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fsu implements k3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750687);
        t2o.a(404750674);
    }

    @Override // tb.k3e
    public void a(UCPReachViewState uCPReachViewState) {
        JSONObject jSONObject;
        NativeBroadcast.Callback callback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fcfcef", new Object[]{this, uCPReachViewState});
        } else if (uCPReachViewState != null && !TextUtils.isEmpty(uCPReachViewState.key) && !TextUtils.isEmpty(uCPReachViewState.group) && (jSONObject = uCPReachViewState.trackInfo) != null && (callback = (NativeBroadcast.Callback) jSONObject.get("callback")) != null) {
            callback.callback((JSONObject) JSON.toJSON(uCPReachViewState), null);
            if (esu.KEY_TERMINAL.equals(uCPReachViewState.key) || "Error".equals(uCPReachViewState.key)) {
                callback.close();
            }
        }
    }
}
