package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;
import java.util.List;
import tb.v4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wyj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final at6 f31012a;
    public final xs6 b;
    public final vr6 c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f31013a;
        public final /* synthetic */ d90 b;

        public a(JSONObject jSONObject, d90 d90Var) {
            this.f31013a = jSONObject;
            this.b = d90Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wyj.b(wyj.this, this.f31013a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements wit {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31014a;
        public final /* synthetic */ d90 b;

        public b(String str, d90 d90Var) {
            this.f31014a = str;
            this.b = d90Var;
        }

        @Override // tb.wit
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            wyj wyjVar = wyj.this;
            wyj.d(wyjVar, this.f31014a, wyj.c(wyjVar).l(this.f31014a), "base", this.b, true);
            jrg.e(fdv.F_DATA_PROCESS, "DataService.dataProcess", "template download completed trigger successfully. containerId : " + this.f31014a);
        }
    }

    static {
        t2o.a(487587906);
        t2o.a(475004944);
    }

    public wyj(xs6 xs6Var) throws GatewayException {
        if (xs6Var != null) {
            this.b = xs6Var;
            this.f31012a = xs6Var.e();
            this.c = new vr6(xs6Var);
            return;
        }
        throw new GatewayException("dataServiceEngineContext should not be null");
    }

    public static /* synthetic */ void b(wyj wyjVar, JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e0e2ee", new Object[]{wyjVar, jSONObject, d90Var});
        } else {
            wyjVar.n(jSONObject, d90Var);
        }
    }

    public static /* synthetic */ at6 c(wyj wyjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (at6) ipChange.ipc$dispatch("16455cdb", new Object[]{wyjVar});
        }
        return wyjVar.f31012a;
    }

    public static /* synthetic */ void d(wyj wyjVar, String str, AwesomeGetContainerData awesomeGetContainerData, String str2, d90 d90Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18690014", new Object[]{wyjVar, str, awesomeGetContainerData, str2, d90Var, new Boolean(z)});
        } else {
            wyjVar.s(str, awesomeGetContainerData, str2, d90Var, z);
        }
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        i65.d("DataService.dataProcess", "start action:", jSONObject.getString("containerId"));
        jrg.e(fdv.F_DATA_PROCESS, "DataService.dataProcess", "start action:" + jSONObject.getString("containerId"));
        if (mst.a()) {
            nt6.a().c(new a(jSONObject, d90Var));
        } else {
            n(jSONObject, d90Var);
        }
    }

    public final void e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d892978", new Object[]{this, str, jSONObject});
            return;
        }
        teb b2 = this.b.b(str);
        if (b2 != null) {
            b2.b(str, jSONObject);
        }
    }

    public final void f(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1687e6da", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2, str});
            return;
        }
        if (awesomeGetContainerData.getBaseData() != null && awesomeGetContainerData2.getPageNum() > 0) {
            awesomeGetContainerData2.getBase().getSections().addAll(0, awesomeGetContainerData.getBaseData());
        }
        r(str, awesomeGetContainerData2);
        awesomeGetContainerData2.setTotalData(this.b.f().g(str, awesomeGetContainerData2, awesomeGetContainerData));
    }

    public final void g(String str, JSONObject jSONObject, AwesomeGetData awesomeGetData, d90 d90Var) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a39ecd64", new Object[]{this, str, jSONObject, awesomeGetData, d90Var});
            return;
        }
        AwesomeGetContainerData awesomeGetContainerData = awesomeGetData.getContainers().get(str);
        if (awesomeGetContainerData == null) {
            m(jSONObject, str, "responseModel不能为空", d90Var);
            return;
        }
        boolean isBaseDataChange = awesomeGetContainerData.isBaseDataChange();
        boolean isDeltaDataChange = awesomeGetContainerData.isDeltaDataChange();
        if (isBaseDataChange || isDeltaDataChange) {
            AwesomeGetContainerData l = this.f31012a.l(str);
            if (this.f31012a.n(str) != null) {
                this.b.f().h(l, awesomeGetContainerData);
            }
            p(l, awesomeGetContainerData, str, jSONObject, d90Var);
            e(str, jSONObject);
            h(str, jSONObject, this.f31012a);
            l(str, awesomeGetContainerData.getTotalData(), d90Var);
            dd0.a(awesomeGetContainerData.getExt());
            if (isDeltaDataChange) {
                str2 = "delta";
            } else {
                str2 = "base";
            }
            t(str, this.f31012a.l(str), str2, d90Var, false, jSONObject);
            return;
        }
        m(jSONObject, str, "is not base or delta refresh", d90Var);
    }

    public final void h(String str, JSONObject jSONObject, at6 at6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e218f28c", new Object[]{this, str, jSONObject, at6Var});
            return;
        }
        vqb d = this.b.d(str);
        if (d != null) {
            d.e(at6Var.l(str), jSONObject);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    public final void i(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf52693", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2, str});
        } else if (awesomeGetContainerData != null && awesomeGetContainerData.getBaseData() != null) {
            awesomeGetContainerData.getBase().setDataChange(false);
            awesomeGetContainerData2.setBase(awesomeGetContainerData.getBase());
            k(str, awesomeGetContainerData2);
            awesomeGetContainerData2.setTotalData(this.b.f().g(str, awesomeGetContainerData2, awesomeGetContainerData));
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    public final void k(String str, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71253cc7", new Object[]{this, str, awesomeGetContainerData});
        } else if (awesomeGetContainerData != null) {
            JSONObject a2 = ysl.a(str);
            if (j(awesomeGetContainerData)) {
                JSONObject passParams = awesomeGetContainerData.getDelta().getPassParams();
                if (a2 == null) {
                    a2 = passParams;
                } else if (passParams != null && !passParams.isEmpty()) {
                    a2.putAll(passParams);
                }
                ysl.b(str, a2);
            }
            awesomeGetContainerData.getBase().setPassParams(a2);
        }
    }

    public final void l(String str, List<SectionModel> list, d90 d90Var) {
        vqb d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d5726ec", new Object[]{this, str, list, d90Var});
        } else if (list != null && !list.isEmpty() && str != null && !TextUtils.isEmpty(str) && (d = this.b.d(str)) != null) {
            d.d(list, new b(str, d90Var));
        }
    }

    public final void n(JSONObject jSONObject, d90 d90Var) {
        AwesomeGetData awesomeGetData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127826f7", new Object[]{this, jSONObject, d90Var});
            return;
        }
        i65.d("DataService.dataProcess", "start action in async thread");
        jrg.e(fdv.F_DATA_PROCESS, "DataService.dataProcess", "start action in async thread");
        if (jSONObject == null) {
            m(jSONObject, null, "actionParam is null", d90Var);
            return;
        }
        try {
            Object obj = jSONObject.get("dataModel");
            if (obj instanceof AwesomeGetData) {
                awesomeGetData = (AwesomeGetData) jSONObject.get("dataModel");
            } else if (obj instanceof String) {
                awesomeGetData = (AwesomeGetData) JSON.parseObject((String) obj, AwesomeGetData.class);
            } else {
                return;
            }
        } catch (Throwable unused) {
            jrg.c(fdv.F_DATA_PROCESS, "param_error", "数据处理异常", "DataService.dataProcess", "数据处理异常");
        }
        if (!(awesomeGetData == null || awesomeGetData.getContainers() == null || awesomeGetData.getContainers().isEmpty())) {
            this.f31012a.y(awesomeGetData.getCurrentPageParams());
            this.f31012a.z(awesomeGetData.getCurrentUTParams());
            this.f31012a.A(awesomeGetData.getGlobalUTParams());
            this.c.a(awesomeGetData);
            for (String str : awesomeGetData.getContainers().keySet()) {
                g(str, jSONObject, awesomeGetData, d90Var);
            }
            i65.d("DataService.dataProcess", "end action");
            jrg.e(fdv.F_DATA_PROCESS, "DataService.dataProcess", "end action");
            return;
        }
        m(jSONObject, null, "dataModel is empty", d90Var);
    }

    public final boolean o(String str, xs6 xs6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a805734f", new Object[]{this, str, xs6Var})).booleanValue();
        }
        return TextUtils.equals(str, xs6Var.i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    public final void p(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2, String str, JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9719e2a", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2, str, jSONObject, d90Var});
            return;
        }
        jrg.e(fdv.F_DATA_PROCESS, "DataService.dataProcess", "start mergeDelta containerId : " + str);
        boolean isBaseDataChange = awesomeGetContainerData2.isBaseDataChange();
        boolean isDeltaDataChange = awesomeGetContainerData2.isDeltaDataChange();
        if (isBaseDataChange) {
            f(awesomeGetContainerData, awesomeGetContainerData2, str);
        } else if (isDeltaDataChange) {
            i(awesomeGetContainerData, awesomeGetContainerData2, str);
        }
        this.f31012a.C(str, awesomeGetContainerData2.getBase(), o(str, this.b));
        this.f31012a.E(str, awesomeGetContainerData2.getDelta(), this.b.f().a(awesomeGetContainerData2));
        this.f31012a.G(str, awesomeGetContainerData2.getTotalData());
        jrg.e(fdv.F_DATA_PROCESS, "DataService.dataProcess", "end mergeData, isDeltaRefresh : " + isDeltaDataChange);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    public final void r(String str, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e4519f", new Object[]{this, str, awesomeGetContainerData});
        } else if (q(awesomeGetContainerData)) {
            ysl.b(str, awesomeGetContainerData.getPassParams());
        } else if (awesomeGetContainerData != null && awesomeGetContainerData.getBase() != null) {
            awesomeGetContainerData.getBase().setPassParams(ysl.a(str));
        }
    }

    public final void s(String str, AwesomeGetContainerData awesomeGetContainerData, String str2, d90 d90Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d333cc62", new Object[]{this, str, awesomeGetContainerData, str2, d90Var, new Boolean(z)});
        } else {
            t(str, awesomeGetContainerData, str2, d90Var, z, null);
        }
    }

    public final void t(String str, AwesomeGetContainerData awesomeGetContainerData, String str2, d90 d90Var, boolean z, JSONObject jSONObject) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44d02ce", new Object[]{this, str, awesomeGetContainerData, str2, d90Var, new Boolean(z), jSONObject});
        } else if (d90Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerId", (Object) str);
            jSONObject2.put("containerModel", (Object) awesomeGetContainerData);
            jSONObject2.put("dataChangeType", (Object) str2);
            if (z) {
                str3 = "download";
            } else {
                str3 = "remote";
            }
            jSONObject2.put("dataSourceType", (Object) str3);
            o5a.a(jSONObject2, o5a.b(jSONObject));
            ((v4a.a) d90Var).a("finish", jSONObject2, null);
        }
    }

    public final boolean j(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e78c694f", new Object[]{this, awesomeGetContainerData})).booleanValue();
        }
        if (awesomeGetContainerData == null || awesomeGetContainerData.getDeltaExt() == null) {
            return false;
        }
        return awesomeGetContainerData.getDeltaExt().getBooleanValue("updatePassParams");
    }

    public final void m(JSONObject jSONObject, String str, String str2, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f52b869", new Object[]{this, jSONObject, str, str2, d90Var});
        } else if (d90Var != null) {
            jrg.c(fdv.F_DATA_PROCESS, "param_error", "网关2.0数据处理，参数异常", "DataService.dataProcess", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerId", (Object) str);
            jSONObject2.put("errorCode", (Object) 1);
            jSONObject2.put("errorMsg", (Object) str2);
            jSONObject2.put("dataSourceType", (Object) "remote");
            o5a.a(jSONObject2, o5a.b(jSONObject));
            ((v4a.a) d90Var).a("finish", jSONObject2, null);
        }
    }

    public final boolean q(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55913f77", new Object[]{this, awesomeGetContainerData})).booleanValue();
        }
        if (awesomeGetContainerData == null || awesomeGetContainerData.getExt() == null) {
            return false;
        }
        return awesomeGetContainerData.getExt().getBooleanValue("updatePassParams");
    }
}
