package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rzj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final at6 f27696a;
    public final xs6 b;

    static {
        t2o.a(487587917);
        t2o.a(475004944);
    }

    public rzj(xs6 xs6Var) throws GatewayException {
        if (xs6Var != null) {
            this.f27696a = xs6Var.e();
            this.b = xs6Var;
            return;
        }
        throw new GatewayException("dataServiceEngineContext should not be null");
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
        } else if (jSONObject != null && !TextUtils.equals("download", jSONObject.getString("dataSourceType"))) {
            String string = jSONObject.getString("containerId");
            if (!TextUtils.equals(this.b.i(), string)) {
                jSONObject.put("_msgType", "scrollToTop");
                b(string, this.f27696a, jSONObject);
            }
        }
    }

    public final void b(String str, at6 at6Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("572fc3da", new Object[]{this, str, at6Var, jSONObject});
            return;
        }
        vqb d = this.b.d(str);
        if (d != null) {
            d.c(at6Var.l(str), jSONObject);
        }
    }
}
