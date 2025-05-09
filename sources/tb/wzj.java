package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wzj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final at6 f31039a;
    public final xs6 b;

    static {
        t2o.a(487587918);
        t2o.a(475004944);
    }

    public wzj(xs6 xs6Var) throws GatewayException {
        if (xs6Var != null) {
            this.b = xs6Var;
            this.f31039a = xs6Var.e();
            return;
        }
        throw new GatewayException("dataServiceEngineContext should not be null");
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
        } else if (jSONObject != null) {
            jrg.e(fdv.F_COMPONENT_RENDER_TAG, "DataService.uiRefresh", "start action");
            String string = jSONObject.getString("containerId");
            Object obj = jSONObject.get("containerModel");
            if (TextUtils.isEmpty(string) || obj == null) {
                c(jSONObject);
            } else {
                b(string, this.f31039a, jSONObject);
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
        if (d == null) {
            i65.c("DataService.uiRefresh", "containerProcessProvider is null");
        } else {
            d.c(at6Var.l(str), jSONObject);
        }
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8224d5ee", new Object[]{this, jSONObject});
            return;
        }
        String[] a2 = w4a.a(jSONObject);
        if (a2 == null) {
            i65.c("DataService.uiRefresh", "No containers");
            return;
        }
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        for (String str : a2) {
            jSONObject2.put("containerId", (Object) str);
            b(str, this.f31039a, jSONObject2);
        }
    }
}
