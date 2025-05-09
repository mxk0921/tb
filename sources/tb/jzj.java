package tb;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import java.util.Map;
import tb.lzj;
import tb.v4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jzj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lzj f22308a;
    public final tm2 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements lzj.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22309a;
        public final /* synthetic */ long b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ d90 d;

        public a(String str, long j, JSONObject jSONObject, d90 d90Var) {
            this.f22309a = str;
            this.b = j;
            this.c = jSONObject;
            this.d = d90Var;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5e4f641", new Object[]{this, jSONObject});
                return;
            }
            phg.i("NewFaceRequest_error_" + this.f22309a);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorMsg", (Object) jSONObject.getString("errorMsg"));
            jSONObject2.put("errorCode", (Object) jSONObject.getString("errorCode"));
            jSONObject2.put("nativeCustomParams", this.c.get("nativeCustomParams"));
            n5a.a(jSONObject2, n5a.c(this.c));
            vqa.k().i("MTopRequest").j("doResponse").e("status:error").g("errorMessage", jSONObject.getString("errorMsg")).g("errorCode", jSONObject.getString("errorCode")).a();
            jzj.d(jzj.this, this.c, jSONObject.getString("errorCode"), jSONObject.getString("errorMsg"));
            ((v4a.a) this.d).a("fail", jSONObject2, null);
            phg.h("NewFaceRequest_error_" + this.f22309a);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            phg.i("NewFaceRequest_start_" + this.f22309a);
            p6j.b(this.f22309a, p6j.MTOP_STAGE_ASSEMBLEPARAMS, this.b, SystemClock.uptimeMillis() - this.b, null, false);
            jzj.b(jzj.this, this.c);
            phg.h("NewFaceRequest_start_" + this.f22309a);
        }

        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19a43926", new Object[]{this, jSONObject});
                return;
            }
            phg.i("NewFaceRequest_success_" + this.f22309a);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dataModel", jSONObject.get("dataModel"));
            jSONObject2.put("nativeCustomParams", this.c.get("nativeCustomParams"));
            jSONObject2.put("scrollPosition", this.c.get("scrollPosition"));
            jSONObject2.put("UIOperation", jSONObject.get("UIOperation"));
            jSONObject2.put("isSecondReturn", jSONObject.get("isSecondReturn"));
            n5a.a(jSONObject2, n5a.c(this.c));
            uqa.b("MTopRequest", "doResponse", " status:success");
            phg.i("notifyRequestSuccess_" + this.f22309a);
            jzj.c(jzj.this, this.c, (AwesomeGetData) jSONObject.get("dataModel"));
            phg.h("notifyRequestSuccess_" + this.f22309a);
            jSONObject2.put(TBImageFlowMonitor.REQUEST_START_TIME, this.c.get(TBImageFlowMonitor.REQUEST_START_TIME));
            jSONObject2.put("requestEndTime", this.c.get("requestEndTime"));
            phg.i("NewFaceRequest_next_gateway_" + this.f22309a);
            ((v4a.a) this.d).a("success", jSONObject2, null);
            phg.h("NewFaceRequest_next_gateway_" + this.f22309a);
            phg.h("NewFaceRequest_success_" + this.f22309a);
        }
    }

    static {
        t2o.a(729809783);
        t2o.a(475004944);
    }

    public jzj(imn imnVar, nzj nzjVar) throws GatewayException {
        if (nzjVar == null) {
            throw new GatewayException("RecmdRequestService should not be null");
        } else if (imnVar != null) {
            this.f22308a = new lzj(imnVar, nzjVar);
            this.b = new tm2();
        } else {
            throw new GatewayException("RecmdDataSource should not be null");
        }
    }

    public static /* synthetic */ void b(jzj jzjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d376f72", new Object[]{jzjVar, jSONObject});
        } else {
            jzjVar.g(jSONObject);
        }
    }

    public static /* synthetic */ void c(jzj jzjVar, JSONObject jSONObject, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7032c64c", new Object[]{jzjVar, jSONObject, awesomeGetData});
        } else {
            jzjVar.h(jSONObject, awesomeGetData);
        }
    }

    public static /* synthetic */ void d(jzj jzjVar, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a5f708", new Object[]{jzjVar, jSONObject, str, str2});
        } else {
            jzjVar.f(jSONObject, str, str2);
        }
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        phg.i("NewFaceRequestAction");
        this.f22308a.h(jSONObject, new a(jSONObject != null ? jSONObject.getString("requestType") : null, jSONObject != null ? jSONObject.getLong(p6j.MTOP_STAGE_ASSEMBLEPARAMS_STARTTIME).longValue() : 0L, jSONObject, d90Var));
        phg.h("NewFaceRequestAction");
    }

    public final void e(AwesomeGetData awesomeGetData, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff64f9a2", new Object[]{this, awesomeGetData, awesomeGetContainerData});
        } else {
            awesomeGetContainerData.parentExt = awesomeGetData.getExt();
        }
    }

    public final void f(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ff08b9", new Object[]{this, jSONObject, str, str2});
            return;
        }
        String[] b = yyj.e().b(jSONObject);
        if (b == null) {
            uqa.b("MTopRequest", "notifyRequestFailure", "containers is null");
            return;
        }
        for (String str3 : b) {
            uqb a2 = yyj.e().a(str3);
            if (a2 != null) {
                a2.a(jSONObject, str, str2);
            } else {
                return;
            }
        }
    }

    public final void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac267cd", new Object[]{this, jSONObject});
            return;
        }
        String[] b = yyj.e().b(jSONObject);
        if (b == null) {
            uqa.b("MTopRequest", "notifyRequestStart", "containers is null");
            return;
        }
        for (String str : b) {
            uqb a2 = yyj.e().a(str);
            if (a2 != null) {
                a2.b(jSONObject);
            } else {
                return;
            }
        }
    }

    public final void h(JSONObject jSONObject, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4788d3d3", new Object[]{this, jSONObject, awesomeGetData});
            return;
        }
        String[] b = yyj.e().b(jSONObject);
        if (b == null) {
            uqa.b("MTopRequest", "notifyRequestResult", "containers is null");
            return;
        }
        this.b.c(awesomeGetData.currentPageParams);
        for (String str : b) {
            uqb a2 = yyj.e().a(str);
            if (a2 != null) {
                Map<String, AwesomeGetContainerData> map = awesomeGetData.containers;
                if (map != null) {
                    AwesomeGetContainerData awesomeGetContainerData = map.get(str);
                    if (awesomeGetContainerData != null) {
                        awesomeGetContainerData.containerId = str;
                        e(awesomeGetData, awesomeGetContainerData);
                    }
                    a2.f(jSONObject, awesomeGetContainerData);
                }
            } else {
                return;
            }
        }
    }
}
