package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static MtopRequest a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("e89b7c0c", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", (Object) Login.getUserId());
        jSONObject.put("newSettingOpen", (Object) Boolean.TRUE);
        try {
            jSONObject.put("envData", (Object) VerifyIdentityEngine.getInstance(context).getEnvData(null));
        } catch (Exception unused) {
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.payment.list.get");
        mtopRequest.setVersion("1.1");
        mtopRequest.setData(JSON.toJSONString(jSONObject));
        return mtopRequest;
    }
}
