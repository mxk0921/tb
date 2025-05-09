package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;
import tb.mzj;
import tb.v4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kzj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mzj f23024a;
    public final xs6 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements mzj.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f23025a;
        public final /* synthetic */ d90 b;

        public a(JSONObject jSONObject, d90 d90Var) {
            this.f23025a = jSONObject;
            this.b = d90Var;
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5e4f641", new Object[]{this, jSONObject});
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorMsg", (Object) jSONObject.getString("errorMsg"));
            jSONObject2.put("errorCode", (Object) jSONObject.getString("errorCode"));
            jSONObject2.put("nativeCustomParams", this.f23025a.get("nativeCustomParams"));
            jSONObject2.put("containers", this.f23025a.get("containers"));
            o5a.a(jSONObject2, o5a.b(this.f23025a));
            kzj.d(kzj.this, this.f23025a, jSONObject.getString("errorMsg"), jSONObject.getString("errorCode"));
            ((v4a.a) this.b).a("fail", jSONObject2, null);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
            } else {
                kzj.b(kzj.this, this.f23025a);
            }
        }

        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19a43926", new Object[]{this, jSONObject});
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dataModel", jSONObject.get("dataModel"));
            jSONObject2.put("nativeCustomParams", this.f23025a.get("nativeCustomParams"));
            o5a.a(jSONObject2, o5a.b(this.f23025a));
            kzj.c(kzj.this, this.f23025a, (AwesomeGetData) jSONObject.get("dataModel"));
            ((v4a.a) this.b).a("success", jSONObject2, null);
        }
    }

    static {
        t2o.a(487587915);
        t2o.a(475004944);
    }

    public kzj(xs6 xs6Var) throws GatewayException {
        if (xs6Var != null) {
            this.b = xs6Var;
            this.f23024a = new mzj(xs6Var, xs6Var.j());
            return;
        }
        throw new GatewayException("dataServiceEngineContext should not be null");
    }

    public static /* synthetic */ void b(kzj kzjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("495cda7f", new Object[]{kzjVar, jSONObject});
        } else {
            kzjVar.f(jSONObject);
        }
    }

    public static /* synthetic */ void c(kzj kzjVar, JSONObject jSONObject, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594ca3e7", new Object[]{kzjVar, jSONObject, awesomeGetData});
        } else {
            kzjVar.g(jSONObject, awesomeGetData);
        }
    }

    public static /* synthetic */ void d(kzj kzjVar, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cfefdd1", new Object[]{kzjVar, jSONObject, str, str2});
        } else {
            kzjVar.e(jSONObject, str, str2);
        }
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        i65.d("DataService.request", "start action:", jSONObject.toJSONString());
        jrg.e(fdv.F_NETWORK_REQUEST, "DataService.request", "start action");
        String string = jSONObject.getString("containerId");
        if (TextUtils.isEmpty(string)) {
            Object obj = jSONObject.get("containers");
            if (obj instanceof String[]) {
                String[] strArr = (String[]) obj;
                if (strArr.length >= 1) {
                    string = strArr[0];
                }
            }
        }
        jSONObject.put("containerId", (Object) string);
        this.f23024a.k(jSONObject, new a(jSONObject, d90Var));
    }

    public final void e(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ff08b9", new Object[]{this, jSONObject, str, str2});
            return;
        }
        String[] a2 = w4a.a(jSONObject);
        if (a2 == null) {
            i65.c("MTopRequest", "notifyRequestFailure", "containers is null");
            return;
        }
        for (String str3 : a2) {
            vqb d = this.b.d(str3);
            if (d != null) {
                d.a(jSONObject, str, str2);
            } else {
                return;
            }
        }
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac267cd", new Object[]{this, jSONObject});
            return;
        }
        String[] a2 = w4a.a(jSONObject);
        if (a2 == null) {
            i65.c("MTopRequest", "notifyRequestStart", "containers is null");
            return;
        }
        for (String str : a2) {
            vqb d = this.b.d(str);
            if (d != null) {
                d.b(jSONObject);
            } else {
                return;
            }
        }
    }

    public final void g(JSONObject jSONObject, AwesomeGetData awesomeGetData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca43d39", new Object[]{this, jSONObject, awesomeGetData});
            return;
        }
        String[] a2 = w4a.a(jSONObject);
        if (a2 == null) {
            i65.c("MTopRequest", "notifyRequestResult", "containers is null");
            return;
        }
        for (String str : a2) {
            vqb d = this.b.d(str);
            if (d != null) {
                if (!(awesomeGetData == null || awesomeGetData.getContainers() == null)) {
                    AwesomeGetContainerData awesomeGetContainerData = awesomeGetData.getContainers().get(str);
                    if (awesomeGetContainerData != null) {
                        awesomeGetContainerData.setContainerId(str);
                    }
                    d.h(jSONObject, awesomeGetContainerData);
                }
            } else {
                return;
            }
        }
    }
}
