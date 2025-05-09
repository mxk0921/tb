package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.ArrayList;
import java.util.List;
import tb.v4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mmn implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final imn f24138a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements pmn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d90 f24139a;
        public final /* synthetic */ String b;

        public a(d90 d90Var, String str) {
            this.f24139a = d90Var;
            this.b = str;
        }

        @Override // tb.pmn
        public void a(List<String> list, List<String> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd86ffe0", new Object[]{this, list, list2});
                return;
            }
            f0b.i().c("loadCacheByCacheAction");
            if (list == null || list.isEmpty()) {
                mmn mmnVar = mmn.this;
                d90 d90Var = this.f24139a;
                mmn.b(mmnVar, d90Var, 4, "load cache : read file error, cid=" + this.b);
            }
            for (String str : list) {
                AwesomeGetContainerData u = mmn.c(mmn.this).u(str);
                if (u == null || u.getBaseData() == null) {
                    mmn mmnVar2 = mmn.this;
                    d90 d90Var2 = this.f24139a;
                    mmn.b(mmnVar2, d90Var2, 4, "load cache : container data is null, cid=" + str);
                } else {
                    List<SectionModel> n = kmn.n(str, u, null);
                    mmn.c(mmn.this).k0(str, n);
                    mmn.this.e(str, n, this.f24139a);
                    hrg.e("cacheProcess", "gateway2.loadCache", "load cache data trigger successfully");
                    mmn mmnVar3 = mmn.this;
                    mmn.d(mmnVar3, this.f24139a, mmn.c(mmnVar3).u(str));
                }
            }
        }
    }

    static {
        t2o.a(729809670);
        t2o.a(475004944);
    }

    public mmn(imn imnVar) throws GatewayException {
        if (imnVar != null) {
            this.f24138a = imnVar;
            return;
        }
        throw new GatewayException("RecmdDataSource should not be null");
    }

    public static /* synthetic */ void b(mmn mmnVar, d90 d90Var, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7eb198b", new Object[]{mmnVar, d90Var, new Integer(i), str});
        } else {
            mmnVar.f(d90Var, i, str);
        }
    }

    public static /* synthetic */ imn c(mmn mmnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imn) ipChange.ipc$dispatch("96167f98", new Object[]{mmnVar});
        }
        return mmnVar.f24138a;
    }

    public static /* synthetic */ void d(mmn mmnVar, d90 d90Var, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3e867c", new Object[]{mmnVar, d90Var, awesomeGetContainerData});
        } else {
            mmnVar.g(d90Var, awesomeGetContainerData);
        }
    }

    public void e(String str, List<SectionModel> list, d90 d90Var) {
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d5726ec", new Object[]{this, str, list, d90Var});
        } else if (list != null && !list.isEmpty() && str != null && !TextUtils.isEmpty(str)) {
            if (str.startsWith("recommend_")) {
                charSequence = "guess";
            } else {
                charSequence = "homepage";
            }
            if (TextUtils.equals(charSequence, "homepage")) {
                h5b.e().c(list, "homepage", new nmn(this, d90Var, str));
            } else {
                knn.g().e(list, "guess", new omn(this, d90Var, str), str);
            }
        }
    }

    public final void f(d90 d90Var, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc027120", new Object[]{this, d90Var, new Integer(i), str});
            return;
        }
        hrg.c("cacheProcess", "param_error", "网关2.0缓存处理，加载失败", "gateway2.loadCache", str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", (Object) Integer.valueOf(i));
        jSONObject.put("errorMsg", (Object) str);
        ((v4a.a) d90Var).a("fail", jSONObject, null);
    }

    public final void g(d90 d90Var, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7e104", new Object[]{this, d90Var, awesomeGetContainerData});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("containerModel", (Object) awesomeGetContainerData);
        jSONObject.put("dataChangeType", (Object) "base");
        ((v4a.a) d90Var).a("success", jSONObject, null);
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
        String string = jSONObject.getString("containerId");
        if (TextUtils.isEmpty(string)) {
            f(d90Var, 1, "containerId不能为空");
            return;
        }
        try {
            jSONObject.getBooleanValue("needSync");
        } catch (Throwable th) {
            bqa.i("gateway2.loadCache", th, new String[0]);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(string);
        f0b.i().p("loadCacheByCacheAction", 1);
        this.f24138a.M(arrayList, new a(d90Var, string));
        bqa.e("gateway2.loadCache", "end action");
        hrg.e("cacheProcess", "gateway2.loadCache", "end action");
    }
}
