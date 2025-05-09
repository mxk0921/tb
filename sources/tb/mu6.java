package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mu6 implements lyb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public q4a f24306a;
    public final x2e b;
    public final imi c;
    public final dyb d;

    static {
        t2o.a(487587948);
        t2o.a(487587964);
    }

    public mu6(xs6 xs6Var, dyb dybVar, boolean z) {
        q4a.a(xs6Var.l(), xs6Var.c());
        this.d = dybVar;
        try {
            this.f24306a = a(xs6Var, z);
            imi imiVar = new imi();
            this.c = imiVar;
            this.f24306a.d(imiVar);
            c(this.f24306a, xs6Var, z);
        } catch (GatewayException e) {
            e.printStackTrace();
        }
        this.b = new p5a(xs6Var, this.c, z);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fac47a64", new Object[]{this})).booleanValue();
        }
        return this.d.a();
    }

    public final void c(q4a q4aVar, xs6 xs6Var, boolean z) throws GatewayException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f551c1", new Object[]{this, q4aVar, xs6Var, new Boolean(z)});
        } else if (z) {
            q4aVar.b(new bzj(xs6Var), "recmd.loadCache");
            q4aVar.b(new kzj(xs6Var), "recmd.request");
            q4aVar.b(new wyj(xs6Var), "recmd.dataProcess");
            q4aVar.b(new wzj(xs6Var), "recmd.uiRefresh");
            q4aVar.b(new rzj(xs6Var), "recmd.scrollToTop");
            q4aVar.b(new vyj(xs6Var), "recmd.dataDelete");
            q4aVar.b(new gzj(xs6Var), "recmd.playerQueue");
            q4aVar.b(new zzj(xs6Var), "recmd.widgetPostMsg");
            q4aVar.b(new izj(xs6Var), "recmd.prefetchDataProcess");
            q4aVar.c(new fmn(), "recmdClickId");
        } else {
            q4aVar.b(new bzj(xs6Var), "newface.loadCache");
            q4aVar.b(new kzj(xs6Var), "newface.request");
            q4aVar.b(new wyj(xs6Var), "newface.dataProcess");
            q4aVar.b(new wzj(xs6Var), "newface.uiRefresh");
            q4aVar.b(new rzj(xs6Var), "newface.scrollToTop");
            q4aVar.b(new vyj(xs6Var), "newface.dataDelete");
            q4aVar.b(new gzj(xs6Var), "newface.playerQueue");
            q4aVar.b(new zzj(xs6Var), "newface.widgetPostMsg");
        }
    }

    public boolean d(String str, String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("362fbf08", new Object[]{this, str, strArr, jSONObject})).booleanValue();
        }
        i65.c("ControlGateway", "state : " + str + ", containers : " + strArr + ", stateParams : " + jSONObject);
        return ((p5a) this.b).e(str, strArr, jSONObject);
    }

    public final q4a a(xs6 xs6Var, boolean z) throws GatewayException {
        y4a y4aVar;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q4a) ipChange.ipc$dispatch("55718596", new Object[]{this, xs6Var, new Boolean(z)});
        }
        if (z && f4b.b("isEnableBatchTrigger", true)) {
            z2 = true;
        }
        if (b() || z2) {
            if (z) {
                y4aVar = new y4a(xs6Var.e().o(), "gateway2/afterbuy_new_gateway2.json", yyj.GATEWAY_DEFAULT_CONFIG_JSON, true);
            } else {
                y4aVar = new y4a(xs6Var.e().o(), "gateway2/info_flow_gateway2.json", yyj.GATEWAY_DEFAULT_CONFIG_JSON, true);
            }
            this.f24306a = new q4a(xs6Var.e().o(), y4aVar.e());
        } else if (z) {
            this.f24306a = new q4a(xs6Var.e().o(), "gateway2/afterbuy_new_gateway2.json", yyj.GATEWAY_DEFAULT_CONFIG_JSON);
        } else {
            this.f24306a = new q4a(xs6Var.e().o(), "gateway2/info_flow_gateway2.json", yyj.GATEWAY_DEFAULT_CONFIG_JSON);
        }
        return this.f24306a;
    }
}
