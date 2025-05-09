package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import tb.v4a;
import tb.vmn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class umn implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vmn f29498a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements vmn.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f29499a;
        public final /* synthetic */ d90 b;

        public a(umn umnVar, JSONObject jSONObject, d90 d90Var) {
            this.f29499a = jSONObject;
            this.b = d90Var;
        }

        @Override // tb.vmn.c
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19a43926", new Object[]{this, jSONObject});
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dataModel", jSONObject.get("dataModel"));
            jSONObject2.put("bizParam", this.f29499a.get("bizParam"));
            ((v4a.a) this.b).a("success", jSONObject2, null);
        }

        @Override // tb.vmn.c
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5e4f641", new Object[]{this, jSONObject});
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorMsg", (Object) jSONObject.getString("errorMsg"));
            jSONObject2.put("errorCode", (Object) jSONObject.getString("errorCode"));
            jSONObject2.put("bizParam", this.f29499a.get("bizParam"));
            ((v4a.a) this.b).a("fail", jSONObject2, null);
        }
    }

    static {
        t2o.a(729809676);
        t2o.a(475004944);
    }

    public umn(imn imnVar, wmn wmnVar) throws GatewayException {
        if (wmnVar == null) {
            throw new GatewayException("RecmdRequestService should not be null");
        } else if (imnVar != null) {
            this.f29498a = new vmn(imnVar, wmnVar);
        } else {
            throw new GatewayException("RecmdDataSource should not be null");
        }
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        bqa.e("gateway2.request", "start action:", jSONObject.toJSONString());
        hrg.e(fdv.F_NETWORK_REQUEST, "gateway2.request", "start action");
        this.f29498a.g(jSONObject, new a(this, jSONObject, d90Var));
    }
}
