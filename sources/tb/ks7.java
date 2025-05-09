package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ks7 extends i24 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "doPayV2";

    static {
        t2o.a(614465754);
    }

    public static /* synthetic */ Object ipc$super(ks7 ks7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/subscriber/DoPaySubscriber");
    }

    @Override // tb.i24
    public JSONObject K(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d13c9e0", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", "mtopV2");
        JSONObject jSONObject4 = jSONObject.getJSONObject("mtopConfig");
        if (!(jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("data")) == null)) {
            try {
                str = APSecuritySdk.getInstance(this.j.getApplicationContext()).getTokenResult().apdidToken;
                try {
                    str2 = this.j.getResources().getConfiguration().locale.toString();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                str = str2;
            }
            jSONObject2.put(upx.APDIDTOKEN, (Object) str);
            jSONObject2.put("websiteLanguage", (Object) str2);
        }
        jSONObject3.put("fields", (Object) axf.b(jSONObject));
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("doPay", "@data{}");
        J(jSONObject3, "success", skn.SUBSCRIBER_ID, jSONObject5);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("doPay", "@data{}");
        J(jSONObject3, "fail", ua2.SUBSCRIBER_ID, jSONObject6);
        return jSONObject3;
    }
}
