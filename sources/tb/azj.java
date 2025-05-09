package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.h5b;
import tb.knn;
import tb.v4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class azj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final imn f16092a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements pmn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f16093a;
        public final /* synthetic */ d90 b;
        public final /* synthetic */ String[] c;

        public a(JSONObject jSONObject, d90 d90Var, String[] strArr) {
            this.f16093a = jSONObject;
            this.b = d90Var;
            this.c = strArr;
        }

        @Override // tb.pmn
        public void a(List<String> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd86ffe0", new Object[]{this, list, list2});
                return;
            }
            f0b.i().c("loadCacheByNewFaceLoadCacheAction");
            if (list == null || list.isEmpty()) {
                azj azjVar = azj.this;
                JSONObject jSONObject = this.f16093a;
                d90 d90Var = this.b;
                azj.b(azjVar, jSONObject, d90Var, null, 4, "load cache : read file error, cid=" + this.c);
            }
            for (String str : list) {
                AwesomeGetContainerData u = azj.c(azj.this).u(str);
                if (u == null || u.getBaseData() == null) {
                    azj azjVar2 = azj.this;
                    JSONObject jSONObject2 = this.f16093a;
                    d90 d90Var2 = this.b;
                    azj.b(azjVar2, jSONObject2, d90Var2, str, 4, "load cache : container data is null, cid=" + str);
                } else {
                    List<SectionModel> n = kmn.n(str, u, null);
                    azj.c(azj.this).k0(str, n);
                    azj.this.e(str, n, this.f16093a, this.b);
                    hrg.e("cacheProcess", "gateway2.loadCache", "load cache data trigger successfully");
                    azj azjVar3 = azj.this;
                    azj.d(azjVar3, this.f16093a, this.b, str, azj.c(azjVar3).u(str));
                }
            }
            z60.c().h();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements h5b.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f16094a;
        public final /* synthetic */ d90 b;
        public final /* synthetic */ String c;

        public b(JSONObject jSONObject, d90 d90Var, String str) {
            this.f16094a = jSONObject;
            this.b = d90Var;
            this.c = str;
        }

        @Override // tb.h5b.e
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            azj azjVar = azj.this;
            azj.d(azjVar, this.f16094a, this.b, this.c, azj.c(azjVar).u(this.c));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements knn.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f16095a;
        public final /* synthetic */ d90 b;
        public final /* synthetic */ String c;

        public c(JSONObject jSONObject, d90 d90Var, String str) {
            this.f16095a = jSONObject;
            this.b = d90Var;
            this.c = str;
        }

        @Override // tb.knn.d
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            hrg.e("cacheProcess", "gateway2.loadCache", "template download completed trigger successfully");
            azj azjVar = azj.this;
            azj.d(azjVar, this.f16095a, this.b, this.c, azj.c(azjVar).u(this.c));
        }
    }

    static {
        t2o.a(729809777);
        t2o.a(475004944);
    }

    public azj(imn imnVar) throws GatewayException {
        if (imnVar != null) {
            this.f16092a = imnVar;
            return;
        }
        throw new GatewayException("RecmdDataSource should not be null");
    }

    public static /* synthetic */ void b(azj azjVar, JSONObject jSONObject, d90 d90Var, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc621dcb", new Object[]{azjVar, jSONObject, d90Var, str, new Integer(i), str2});
        } else {
            azjVar.f(jSONObject, d90Var, str, i, str2);
        }
    }

    public static /* synthetic */ imn c(azj azjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imn) ipChange.ipc$dispatch("baf55610", new Object[]{azjVar});
        }
        return azjVar.f16092a;
    }

    public static /* synthetic */ void d(azj azjVar, JSONObject jSONObject, d90 d90Var, String str, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bfde80", new Object[]{azjVar, jSONObject, d90Var, str, awesomeGetContainerData});
        } else {
            azjVar.g(jSONObject, d90Var, str, awesomeGetContainerData);
        }
    }

    public void e(String str, List<SectionModel> list, JSONObject jSONObject, d90 d90Var) {
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f776716", new Object[]{this, str, list, jSONObject, d90Var});
        } else if (list != null && !list.isEmpty() && str != null && !TextUtils.isEmpty(str)) {
            if (yyj.e().q(str)) {
                charSequence = "guess";
            } else {
                charSequence = "homepage";
            }
            if (TextUtils.equals(charSequence, "homepage")) {
                h5b.e().c(list, "homepage", new b(jSONObject, d90Var, str));
            } else {
                knn.g().e(list, "guess", new c(jSONObject, d90Var, str), str);
            }
        }
    }

    public final void f(JSONObject jSONObject, d90 d90Var, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270a8ece", new Object[]{this, jSONObject, d90Var, str, new Integer(i), str2});
            return;
        }
        hrg.c("cacheProcess", "param_error", "网关2.0缓存处理，加载失败", "gateway2.loadCache", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerId", (Object) str);
        jSONObject2.put("errorCode", (Object) Integer.valueOf(i));
        jSONObject2.put("errorMsg", (Object) str2);
        n5a.a(jSONObject2, n5a.c(jSONObject));
        ((v4a.a) d90Var).a("fail", jSONObject2, null);
    }

    public final void g(JSONObject jSONObject, d90 d90Var, String str, AwesomeGetContainerData awesomeGetContainerData) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90aa3c0", new Object[]{this, jSONObject, d90Var, str, awesomeGetContainerData});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerModel", (Object) awesomeGetContainerData);
        jSONObject2.put("dataChangeType", (Object) "base");
        if (a3b.m(awesomeGetContainerData)) {
            str2 = "local";
        } else {
            str2 = "remote";
        }
        jSONObject2.put("dataSourceType", (Object) str2);
        jSONObject2.put("containerId", (Object) str);
        jSONObject2.put("requestType", (Object) s0j.MTS_SUB_STAGE_LOAD_CACHE);
        n5a.a(jSONObject2, n5a.c(jSONObject));
        ((v4a.a) d90Var).a("success", jSONObject2, null);
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        bqa.e("gateway2.loadCache", "start action:", jSONObject.toJSONString());
        hrg.e("cacheProcess", "gateway2.loadCache", "start action");
        String[] b2 = yyj.e().b(jSONObject);
        if (b2 == null) {
            f(jSONObject, d90Var, null, 1, "containers");
            return;
        }
        try {
            jSONObject.getBooleanValue("needSync");
        } catch (Throwable th) {
            bqa.i("gateway2.loadCache", th, new String[0]);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(b2));
        f0b.i().p("loadCacheByNewFaceLoadCacheAction", 1);
        this.f16092a.M(arrayList, new a(jSONObject, d90Var, b2));
        bqa.e("gateway2.loadCache", "end action");
        hrg.e("cacheProcess", "gateway2.loadCache", "end action");
    }
}
