package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.task.Coordinator;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.h5b;
import tb.knn;
import tb.v4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hmn implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final imn f20750a;
    public final WeakReference<d> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f20751a;
        public final /* synthetic */ d90 b;

        public a(JSONObject jSONObject, d90 d90Var) {
            this.f20751a = jSONObject;
            this.b = d90Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                hmn.this.f(this.f20751a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements h5b.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20752a;
        public final /* synthetic */ d90 b;

        public b(String str, d90 d90Var) {
            this.f20752a = str;
            this.b = d90Var;
        }

        @Override // tb.h5b.e
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            hmn hmnVar = hmn.this;
            hmn.c(hmnVar, hmn.b(hmnVar).u(this.f20752a), "base", this.b, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements knn.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20753a;
        public final /* synthetic */ d90 b;

        public c(String str, d90 d90Var) {
            this.f20753a = str;
            this.b = d90Var;
        }

        @Override // tb.knn.d
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            hmn hmnVar = hmn.this;
            hmn.c(hmnVar, hmn.b(hmnVar).u(this.f20753a), "base", this.b, true);
            hrg.e(fdv.F_DATA_PROCESS, "gateway2.dataProcess", "template download completed trigger successfully");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        void a(String str);
    }

    static {
        t2o.a(729809664);
        t2o.a(475004944);
    }

    public hmn(imn imnVar, d dVar) throws GatewayException {
        if (imnVar != null) {
            this.f20750a = imnVar;
            this.b = new WeakReference<>(dVar);
            return;
        }
        throw new GatewayException("RecmdDataSource should not be null");
    }

    public static /* synthetic */ imn b(hmn hmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imn) ipChange.ipc$dispatch("289da300", new Object[]{hmnVar});
        }
        return hmnVar.f20750a;
    }

    public static /* synthetic */ void c(hmn hmnVar, AwesomeGetContainerData awesomeGetContainerData, String str, d90 d90Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e38d376", new Object[]{hmnVar, awesomeGetContainerData, str, d90Var, new Boolean(z)});
        } else {
            hmnVar.k(awesomeGetContainerData, str, d90Var, z);
        }
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        bqa.e("gateway2.dataProcess", "start action:", jSONObject.getString("containerId"));
        hrg.e(fdv.F_DATA_PROCESS, "gateway2.dataProcess", "start action:" + jSONObject.getString("containerId"));
        if (kmn.l()) {
            Coordinator.execute(new a(jSONObject, d90Var));
        } else {
            f(jSONObject, d90Var);
        }
    }

    public void d(String str, List<SectionModel> list, d90 d90Var, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e6968", new Object[]{this, str, list, d90Var, new Boolean(z)});
        } else if (list != null && !list.isEmpty() && str != null && !TextUtils.isEmpty(str)) {
            if (str.startsWith("recommend_")) {
                str2 = "guess";
            } else {
                str2 = "homepage";
            }
            if (TextUtils.equals(str2, "homepage")) {
                h5b.e().c(list, "homepage", new b(str, d90Var));
            } else {
                knn.g().f(list, "guess", z, new c(str, d90Var), str);
            }
        }
    }

    public final void h(String str, rjj rjjVar, imn imnVar, AwesomeGetContainerData awesomeGetContainerData, d90 d90Var) {
        List<SectionModel> baseData;
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87632db", new Object[]{this, str, rjjVar, imnVar, awesomeGetContainerData, d90Var});
            return;
        }
        List<SectionModel> H = imnVar.H(str);
        if (H != null && !H.isEmpty() && awesomeGetContainerData != null) {
            ArrayList arrayList = new ArrayList(H);
            if (mjv.a(arrayList, rjjVar) && (baseData = awesomeGetContainerData.getBaseData()) != null && baseData.size() != 0) {
                int i = rjjVar.f27422a;
                int i2 = rjjVar.b;
                if (i2 == -1) {
                    i2 = arrayList.size() - 1;
                }
                while (i2 >= i) {
                    arrayList.remove(i2);
                    i2--;
                }
                arrayList.addAll(i, baseData);
                awesomeGetContainerData.base.sections = arrayList;
                AwesomeGetContainerInnerData awesomeGetContainerInnerData = awesomeGetContainerData.delta;
                if (!(awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.sections == null)) {
                    awesomeGetContainerInnerData.sections = new ArrayList();
                }
                awesomeGetContainerData.totalSectionList = kmn.n(str, awesomeGetContainerData, null);
                imnVar.c0(str, awesomeGetContainerData.base);
                imnVar.h0(str, awesomeGetContainerData.delta, kmn.d(awesomeGetContainerData));
                imnVar.k0(str, awesomeGetContainerData.getTotalData());
                z4a c2 = z4a.c(str);
                if (c2 != null) {
                    if (!s5a.i(c2.b) || von.y(awesomeGetContainerData)) {
                        z = false;
                    }
                    z2 = z;
                }
                d(str, awesomeGetContainerData.getTotalData(), d90Var, z2);
                j(imnVar.u(str), "base", d90Var);
                hrg.e(fdv.F_DATA_PROCESS, "gateway2.dataProcess", "end mergeUpdateData, dataChangeType : base");
            }
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3211030", new Object[]{this, str});
            return;
        }
        d dVar = this.b.get();
        if (dVar != null) {
            dVar.a(str);
        }
    }

    public final void j(AwesomeGetContainerData awesomeGetContainerData, String str, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ce25ce", new Object[]{this, awesomeGetContainerData, str, d90Var});
            return;
        }
        hrg.e(fdv.F_DATA_PROCESS, "gateway2.dataProcess", "data processing completed trigger successfully");
        k(awesomeGetContainerData, str, d90Var, false);
    }

    public final void k(AwesomeGetContainerData awesomeGetContainerData, String str, d90 d90Var, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f746c6", new Object[]{this, awesomeGetContainerData, str, d90Var, new Boolean(z)});
        } else if (d90Var != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("containerModel", (Object) awesomeGetContainerData);
            jSONObject.put("dataChangeType", (Object) str);
            if (z) {
                str2 = "download";
            } else {
                str2 = "remote";
            }
            jSONObject.put("dataSourceType", (Object) str2);
            ((v4a.a) d90Var).a("finish", jSONObject, null);
        }
    }

    public final void e(String str, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ff6017", new Object[]{this, str, d90Var});
        } else if (d90Var != null) {
            hrg.c(fdv.F_DATA_PROCESS, "param_error", "网关2.0数据处理，参数异常", "gateway2.dataProcess", str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", (Object) 1);
            jSONObject.put("errorMsg", (Object) str);
            ((v4a.a) d90Var).a("finish", jSONObject, null);
        }
    }

    public final void g(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2, String str, JSONObject jSONObject, d90 d90Var, JSONObject jSONObject2) {
        String str2;
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643302b0", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2, str, jSONObject, d90Var, jSONObject2});
            return;
        }
        hrg.e(fdv.F_DATA_PROCESS, "gateway2.dataProcess", "start mergeDelta containerId : " + str);
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = awesomeGetContainerData2.base;
        boolean z2 = awesomeGetContainerInnerData != null && awesomeGetContainerInnerData.dataChange;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = awesomeGetContainerData2.delta;
        boolean z3 = awesomeGetContainerInnerData2 != null && awesomeGetContainerInnerData2.dataChange;
        if (z2) {
            if (awesomeGetContainerData.getBaseData() != null && awesomeGetContainerData2.getPageNum() > 0) {
                awesomeGetContainerData2.base.sections.addAll(0, awesomeGetContainerData.getBaseData());
            }
            awesomeGetContainerData2.totalSectionList = kmn.n(str, awesomeGetContainerData2, awesomeGetContainerData);
        } else if (!(!z3 || awesomeGetContainerData == null || awesomeGetContainerData.getBaseData() == null)) {
            awesomeGetContainerData2.base = awesomeGetContainerData.base;
            awesomeGetContainerData2.totalSectionList = kmn.n(str, awesomeGetContainerData2, awesomeGetContainerData);
        }
        this.f20750a.d0(str, awesomeGetContainerData2.base, jSONObject != null && jSONObject.getBooleanValue("forbiddenCache"));
        this.f20750a.h0(str, awesomeGetContainerData2.delta, kmn.d(awesomeGetContainerData2));
        this.f20750a.k0(str, awesomeGetContainerData2.getTotalData());
        z4a c2 = z4a.c(str);
        if (c2 != null) {
            if (!s5a.i(c2.b) || von.y(awesomeGetContainerData2)) {
                z = false;
            }
        }
        List<SectionModel> totalData = awesomeGetContainerData2.getTotalData();
        if (awesomeGetContainerData2.supportInsertSections()) {
            ArrayList arrayList = new ArrayList(totalData);
            arrayList.addAll(awesomeGetContainerData2.getInsertSections());
            totalData = arrayList;
        }
        d(str, totalData, d90Var, z);
        if (z3) {
            str2 = "delta";
        } else {
            str2 = "base";
        }
        j(this.f20750a.u(str), str2, d90Var);
        if (z2) {
            zjn.p(str, jSONObject2);
        }
        hrg.e(fdv.F_DATA_PROCESS, "gateway2.dataProcess", "end mergeDelta, dataChangeType : ".concat(str2));
    }

    public void f(JSONObject jSONObject, d90 d90Var) {
        AwesomeGetData awesomeGetData;
        Map<String, AwesomeGetContainerData> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127826f7", new Object[]{this, jSONObject, d90Var});
            return;
        }
        bqa.e("gateway2.dataProcess", "start action in async thread");
        hrg.e(fdv.F_DATA_PROCESS, "gateway2.dataProcess", "start action in async thread");
        if (jSONObject == null) {
            e("actionParam is null", d90Var);
            return;
        }
        try {
            awesomeGetData = (AwesomeGetData) jSONObject.get("dataModel");
        } catch (Throwable unused) {
            e("process responseData error", d90Var);
        }
        if (!(awesomeGetData == null || (map = awesomeGetData.containers) == null || map.isEmpty())) {
            this.f20750a.Y(awesomeGetData.currentPageParams);
            this.f20750a.Z(awesomeGetData.currentUTParams);
            for (String str : awesomeGetData.containers.keySet()) {
                AwesomeGetContainerData awesomeGetContainerData = awesomeGetData.containers.get(str);
                if (awesomeGetContainerData == null) {
                    e("responseModel不能为空", d90Var);
                    return;
                }
                rjj rjjVar = (rjj) jSONObject.get("nativeCustomParams");
                if (rjjVar != null) {
                    h(str, rjjVar, this.f20750a, awesomeGetContainerData, d90Var);
                } else {
                    AwesomeGetContainerInnerData awesomeGetContainerInnerData = awesomeGetContainerData.base;
                    boolean z = awesomeGetContainerInnerData != null && awesomeGetContainerInnerData.dataChange;
                    AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = awesomeGetContainerData.delta;
                    boolean z2 = (awesomeGetContainerInnerData2 == null || !awesomeGetContainerInnerData2.dataChange || awesomeGetContainerData.getDeltaData() == null) ? false : true;
                    if (z || z2) {
                        AwesomeGetContainerData u = this.f20750a.u(str);
                        if (this.f20750a.y(str) != null) {
                            kmn.r(u, awesomeGetContainerData);
                        }
                        g(u, awesomeGetContainerData, str, jSONObject.getJSONObject("bizParam"), d90Var, jSONObject);
                        String str2 = "";
                        if (str.startsWith("recommend_home")) {
                            str2 = z4a.HOME_MAIN.c;
                        } else {
                            z4a c2 = z4a.c(str);
                            if (c2 != null) {
                                str2 = c2.c;
                            }
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            gh0.j().m(str2, awesomeGetContainerData);
                        }
                        gh0.j().f();
                        i(str);
                        z68.l().e(awesomeGetData);
                    } else {
                        e("is not base or delta refresh", d90Var);
                        return;
                    }
                }
            }
            bqa.e("gateway2.dataProcess", "end action");
            hrg.e(fdv.F_DATA_PROCESS, "gateway2.dataProcess", "end action");
            return;
        }
        e("dataModel is empty", d90Var);
    }
}
