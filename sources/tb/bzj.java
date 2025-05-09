package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.v4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bzj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final at6 f16735a;
    public final xs6 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements qmn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f16736a;
        public final /* synthetic */ d90 b;
        public final /* synthetic */ String[] c;

        public a(JSONObject jSONObject, d90 d90Var, String[] strArr) {
            this.f16736a = jSONObject;
            this.b = d90Var;
            this.c = strArr;
        }

        public void a(List<String> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd86ffe0", new Object[]{this, list, list2});
                return;
            }
            if (list == null || list.isEmpty()) {
                bzj bzjVar = bzj.this;
                JSONObject jSONObject = this.f16736a;
                d90 d90Var = this.b;
                bzj.b(bzjVar, jSONObject, d90Var, null, 4, "load cache : read file error, cid=" + this.c);
            }
            for (String str : list) {
                AwesomeGetContainerData l = bzj.c(bzj.this).l(str);
                if (l == null || l.getBaseData() == null) {
                    bzj bzjVar2 = bzj.this;
                    JSONObject jSONObject2 = this.f16736a;
                    d90 d90Var2 = this.b;
                    bzj.b(bzjVar2, jSONObject2, d90Var2, str, 4, "load cache : container data is null, cid=" + str);
                } else {
                    List<SectionModel> g = bzj.d(bzj.this).f().g(str, l, null);
                    bzj.c(bzj.this).G(str, g);
                    bzj.this.f(this.f16736a, str, g, this.b);
                    jrg.e("cacheProcess", "gateway2.loadCache", "load cache data trigger successfully");
                    bzj bzjVar3 = bzj.this;
                    bzj.e(bzjVar3, this.f16736a, this.b, str, bzj.c(bzjVar3).l(str), false);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements wit {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16737a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ d90 c;

        public b(String str, JSONObject jSONObject, d90 d90Var) {
            this.f16737a = str;
            this.b = jSONObject;
            this.c = d90Var;
        }

        @Override // tb.wit
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            jrg.e("cacheProcess", "gateway2.loadCache", "template download completed trigger successfully, containerId : " + this.f16737a);
            bzj bzjVar = bzj.this;
            bzj.e(bzjVar, this.b, this.c, this.f16737a, bzj.c(bzjVar).l(this.f16737a), true);
        }
    }

    static {
        t2o.a(487587909);
        t2o.a(475004944);
    }

    public bzj(xs6 xs6Var) throws GatewayException {
        if (xs6Var != null) {
            this.f16735a = xs6Var.e();
            this.b = xs6Var;
            return;
        }
        throw new GatewayException("dataServiceEngineContext should not be null");
    }

    public static /* synthetic */ void b(bzj bzjVar, JSONObject jSONObject, d90 d90Var, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("314f05e", new Object[]{bzjVar, jSONObject, d90Var, str, new Integer(i), str2});
        } else {
            bzjVar.g(jSONObject, d90Var, str, i, str2);
        }
    }

    public static /* synthetic */ at6 c(bzj bzjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (at6) ipChange.ipc$dispatch("2f09b0b2", new Object[]{bzjVar});
        }
        return bzjVar.f16735a;
    }

    public static /* synthetic */ xs6 d(bzj bzjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xs6) ipChange.ipc$dispatch("9a839e6c", new Object[]{bzjVar});
        }
        return bzjVar.b;
    }

    public static /* synthetic */ void e(bzj bzjVar, JSONObject jSONObject, d90 d90Var, String str, AwesomeGetContainerData awesomeGetContainerData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e023792", new Object[]{bzjVar, jSONObject, d90Var, str, awesomeGetContainerData, new Boolean(z)});
        } else {
            bzjVar.h(jSONObject, d90Var, str, awesomeGetContainerData, z);
        }
    }

    public void f(JSONObject jSONObject, String str, List<SectionModel> list, d90 d90Var) {
        vqb d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee605ac", new Object[]{this, jSONObject, str, list, d90Var});
        } else if (list != null && !list.isEmpty() && str != null && !TextUtils.isEmpty(str) && (d = this.b.d(str)) != null) {
            d.d(list, new b(str, jSONObject, d90Var));
        }
    }

    public final void g(JSONObject jSONObject, d90 d90Var, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270a8ece", new Object[]{this, jSONObject, d90Var, str, new Integer(i), str2});
            return;
        }
        jrg.c("cacheProcess", "param_error", "网关2.0缓存处理，加载失败", "gateway2.loadCache", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerId", (Object) str);
        jSONObject2.put("errorCode", (Object) Integer.valueOf(i));
        jSONObject2.put("errorMsg", (Object) str2);
        jSONObject2.put("dataSourceType", (Object) "local");
        o5a.a(jSONObject2, o5a.b(jSONObject));
        ((v4a.a) d90Var).a("fail", jSONObject2, null);
    }

    public final void h(JSONObject jSONObject, d90 d90Var, String str, AwesomeGetContainerData awesomeGetContainerData, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79efc8fa", new Object[]{this, jSONObject, d90Var, str, awesomeGetContainerData, new Boolean(z)});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerModel", (Object) awesomeGetContainerData);
        jSONObject2.put("dataChangeType", (Object) "base");
        jSONObject2.put("containerId", (Object) str);
        if (z) {
            str2 = "download";
        } else {
            str2 = "local";
        }
        jSONObject2.put("dataSourceType", (Object) str2);
        o5a.a(jSONObject2, o5a.b(jSONObject));
        ((v4a.a) d90Var).a("success", jSONObject2, null);
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        i65.d("gateway2.loadCache", "start action:", jSONObject.toJSONString());
        jrg.e("cacheProcess", "gateway2.loadCache", "start action");
        String[] a2 = w4a.a(jSONObject);
        if (a2 == null) {
            g(jSONObject, d90Var, null, 1, "containers");
            return;
        }
        try {
            z = jSONObject.getBooleanValue("needSync");
        } catch (Throwable th) {
            i65.g("gateway2.loadCache", th, new String[0]);
        }
        this.f16735a.s(new ArrayList(Arrays.asList(a2)), z, new a(jSONObject, d90Var, a2));
        i65.d("gateway2.loadCache", "end action");
        jrg.e("cacheProcess", "gateway2.loadCache", "end action");
    }
}
