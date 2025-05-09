package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdContainerMsg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xmn implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final imn f31474a;

    static {
        t2o.a(729809678);
        t2o.a(475004944);
    }

    public xmn(imn imnVar) throws GatewayException {
        if (imnVar != null) {
            this.f31474a = imnVar;
            return;
        }
        throw new GatewayException("RarecmdGatewayDataSource should not be null");
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
        } else if (jSONObject != null && !TextUtils.equals("download", jSONObject.getString("dataSourceType"))) {
            jSONObject.put("_msgType", "scrollToTop");
            zza.b(this.f31474a.D()).c(RecmdContainerMsg.getMessage(jSONObject));
            bqa.e("gateway2.scrollToTop", "end action");
        }
    }
}
