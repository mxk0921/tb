package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdContainerMsg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qzj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final imn f27019a;
    public final xzj b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f27020a;
        public final /* synthetic */ d90 b;

        public a(JSONObject jSONObject, d90 d90Var) {
            this.f27020a = jSONObject;
            this.b = d90Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            phg.m("NewFaceScrollToTopAction");
            qzj.this.b(this.f27020a, this.b);
            phg.l("NewFaceScrollToTopAction");
        }
    }

    static {
        t2o.a(729809786);
        t2o.a(475004944);
    }

    public qzj(imn imnVar, xzj xzjVar) throws GatewayException {
        if (imnVar != null) {
            this.f27019a = imnVar;
            this.b = xzjVar;
            return;
        }
        throw new GatewayException("RarecmdGatewayDataSource should not be null");
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        if (jSONObject != null) {
            str = jSONObject.getString("requestType");
        } else {
            str = "";
        }
        this.b.x(new a(jSONObject, d90Var), "scrollToTop", TextUtils.equals(str, "coldStart"), 1, 0);
    }

    public void b(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5973857b", new Object[]{this, jSONObject, d90Var});
        } else if (jSONObject != null && !TextUtils.equals("download", jSONObject.getString("dataSourceType"))) {
            String string = jSONObject.getString("containerId");
            if (TextUtils.equals(yyj.e().k(), string)) {
                jSONObject.put("_msgType", "scrollToTop");
                if (jSONObject.getBooleanValue("isSecondReturn")) {
                    bqa.d("gateway2.scrollToTop", "scrollToTopAction is SecondReturn");
                    return;
                }
                HomeInfoFlowDataService c = c(string);
                if (c != null) {
                    c.processUiRefresh(this.f27019a, jSONObject);
                } else {
                    zza.b(this.f27019a.D()).c(RecmdContainerMsg.getMessage(jSONObject));
                }
                bqa.e("gateway2.scrollToTop", "end action");
            }
        }
    }

    public final HomeInfoFlowDataService c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeInfoFlowDataService) ipChange.ipc$dispatch("824c9268", new Object[]{this, str});
        }
        return rue.a(str);
    }
}
