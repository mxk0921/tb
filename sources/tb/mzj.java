package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetRequestParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;
import com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import tb.kzj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mzj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SWITCH_REQUEST_CONSTANT = "switchVersionRequest";

    /* renamed from: a  reason: collision with root package name */
    public final ozj f24408a;
    public final at6 b;
    public final xs6 c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f24409a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ c c;
        public final /* synthetic */ String d;

        public a(String[] strArr, JSONObject jSONObject, c cVar, String str) {
            this.f24409a = strArr;
            this.b = jSONObject;
            this.c = cVar;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                mzj.a(mzj.this, this.f24409a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements n3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f24410a;
        public final /* synthetic */ String b;

        public b(c cVar, String str) {
            this.f24410a = cVar;
            this.b = str;
        }

        @Override // tb.n3o
        public void a(AwesomeGetData awesomeGetData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95b68d3b", new Object[]{this, awesomeGetData});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            mzj.b(mzj.this, awesomeGetData, this.b);
            jSONObject.put("dataModel", (Object) awesomeGetData);
            if (!(mzj.p(mzj.this) == null || awesomeGetData == null)) {
                mzj.p(mzj.this).H(awesomeGetData.getExt());
            }
            ((kzj.a) this.f24410a).c(jSONObject);
        }

        @Override // tb.n3o
        public void error(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", (Object) str2);
            jSONObject.put("errorCode", (Object) str);
            ((kzj.a) this.f24410a).a(jSONObject);
        }

        @Override // tb.n3o
        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
            } else {
                ((kzj.a) this.f24410a).b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
    }

    static {
        t2o.a(487587925);
    }

    public mzj(xs6 xs6Var, ozj ozjVar) {
        this.f24408a = ozjVar;
        this.b = xs6Var.e();
        this.c = xs6Var;
    }

    public static /* synthetic */ void a(mzj mzjVar, String[] strArr, JSONObject jSONObject, c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae502a20", new Object[]{mzjVar, strArr, jSONObject, cVar, str});
        } else {
            mzjVar.j(strArr, jSONObject, cVar, str);
        }
    }

    public static /* synthetic */ void b(mzj mzjVar, AwesomeGetData awesomeGetData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c5b8e0", new Object[]{mzjVar, awesomeGetData, str});
        } else {
            mzjVar.e(awesomeGetData, str);
        }
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66e9c271", new Object[0]);
        }
        PositionInfo i = o78.i(q4a.b);
        PositionInfo f = o78.f(q4a.b);
        HashMap hashMap = new HashMap();
        hashMap.put("countryId", i.countryCode);
        hashMap.put("cityId", i.cityId);
        hashMap.put("countryNumCode", i.countryNumCode);
        hashMap.put("actualLanguageCode", i.actualLanguageCode);
        hashMap.put("currencyCode", i.currencyCode);
        hashMap.put("selectedEditionCode", i.editionCode);
        hashMap.put("realEditionCode", f.editionCode);
        return JSON.toJSONString(hashMap);
    }

    public static /* synthetic */ at6 p(mzj mzjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (at6) ipChange.ipc$dispatch("a72207a9", new Object[]{mzjVar});
        }
        return mzjVar.b;
    }

    public final void c(String str, AwesomeGetContainerParams awesomeGetContainerParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c858167b", new Object[]{this, str, awesomeGetContainerParams});
            return;
        }
        teb b2 = this.c.b(str);
        if (b2 != null) {
            b2.d(awesomeGetContainerParams);
        }
    }

    public final void d(AwesomeGetRequestParams awesomeGetRequestParams, String str) {
        Map<String, AwesomeGetContainerParams> containerParams;
        AwesomeGetContainerParams awesomeGetContainerParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a904026", new Object[]{this, awesomeGetRequestParams, str});
        } else if (ao4.b(str) && (containerParams = awesomeGetRequestParams.getContainerParams()) != null && (awesomeGetContainerParams = containerParams.get(str)) != null) {
            containerParams.put("recommend_multi_channel", awesomeGetContainerParams);
            containerParams.remove(str);
        }
    }

    public final void e(AwesomeGetData awesomeGetData, String str) {
        Map<String, AwesomeGetContainerData> containers;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("861ad0ab", new Object[]{this, awesomeGetData, str});
        } else if (ao4.b(str) && awesomeGetData != null && (containers = awesomeGetData.getContainers()) != null && containers.containsKey("recommend_multi_channel")) {
            containers.put(str, containers.get("recommend_multi_channel"));
            containers.remove("recommend_multi_channel");
        }
    }

    public final void i(String[] strArr, String str, JSONObject jSONObject, fs8 fs8Var, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5d188b", new Object[]{this, strArr, str, jSONObject, fs8Var, cVar});
            return;
        }
        AwesomeGetRequestParams h = h(strArr, jSONObject, fs8Var);
        if (rj7.b()) {
            i65.c("RecmdRequestController", JSON.toJSONString(h));
        }
        if (h != null) {
            o(str, h, fs8Var, cVar);
        }
    }

    public final void j(String[] strArr, JSONObject jSONObject, c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a45a3e", new Object[]{this, strArr, jSONObject, cVar, str});
            return;
        }
        i65.d("RecmdRequestController", "start action in async thread");
        jrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "start action in async thread");
        String string = jSONObject.getString("strategy");
        jSONObject.getIntValue("timeout");
        fs8 fs8Var = new fs8();
        fs8Var.b = MethodEnum.POST;
        String b2 = w4a.b(this.c, strArr);
        if (b2 != null) {
            ooq c2 = this.f24408a.c(str, string, b2);
            if (c2.f25530a || ao4.a(jSONObject.getString("containerId"))) {
                fs8Var.f19496a = c2.b;
                n(jSONObject, fs8Var);
                i(strArr, b2, jSONObject, fs8Var, cVar);
                i65.d("RecmdRequestController", "end action");
                jrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "end action");
                return;
            }
            jrg.c(fdv.F_NETWORK_REQUEST, "process_error", "网关2.0网络请求，请求策略拦截", "RecmdRequestController", "strategyState : " + c2);
        }
    }

    public void k(JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d204f2a0", new Object[]{this, jSONObject, cVar});
            return;
        }
        jrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "start action");
        if (!f(jSONObject, cVar)) {
            i65.d("RecmdRequestController", "start action:", jSONObject.toJSONString());
            String[] a2 = w4a.a(jSONObject);
            String string = jSONObject.getString("requestType");
            if (!g(cVar, a2, string)) {
                if (mst.a()) {
                    nt6.a().c(new a(a2, jSONObject, cVar, string));
                } else {
                    j(a2, jSONObject, cVar, string);
                }
            }
        }
    }

    public final b11 l(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b11) ipChange.ipc$dispatch("ecb9d2e2", new Object[]{this, obj});
        }
        if (obj instanceof b11) {
            return (b11) obj;
        }
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String string = jSONObject.getString("apiName");
        String string2 = jSONObject.getString("apiVersion");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        return new b11(string, string2);
    }

    public final void o(String str, AwesomeGetRequestParams awesomeGetRequestParams, fs8 fs8Var, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a970b1", new Object[]{this, str, awesomeGetRequestParams, fs8Var, cVar});
        } else {
            this.f24408a.e(str, awesomeGetRequestParams, fs8Var, new b(cVar, str), this.c);
        }
    }

    public final void n(JSONObject jSONObject, fs8 fs8Var) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51c1e06", new Object[]{this, jSONObject, fs8Var});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("bizParam");
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject(TSRecmdReqPrefetch.PREFETCH_PARAMS)) != null) {
            try {
                jSONObject3.remove(TSRecmdReqPrefetch.PREFETCH_PARAMS);
                fs8Var.c = true;
                fs8Var.d = jSONObject2.getString("timeout");
                ArrayList arrayList = new ArrayList();
                jSONObject3.put("prefetch", "true");
                arrayList.add("prefetch");
                JSONArray jSONArray = jSONObject2.getJSONArray(TSRecmdReqPrefetch.PREFETCH_PARAMS_IGNORE);
                if (jSONArray != null) {
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            arrayList.add(next.toString());
                        }
                    }
                }
                fs8Var.e = arrayList;
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean f(JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c81c4e56", new Object[]{this, jSONObject, cVar})).booleanValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return false;
        }
        jrg.c(fdv.F_NETWORK_REQUEST, "param_error", "网关2.0网络请求，参数为空", "RecmdRequestController", "requestParam is empty");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMsg", (Object) "requestParam is empty ");
        jSONObject2.put("errorCode", (Object) 1);
        ((kzj.a) cVar).a(jSONObject2);
        return true;
    }

    public final boolean g(c cVar, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1dd6a3c", new Object[]{this, cVar, strArr, str})).booleanValue();
        }
        if (strArr != null && !TextUtils.isEmpty(str)) {
            return false;
        }
        jrg.c(fdv.F_NETWORK_REQUEST, "param_error", "网关2.0网络请求，参数异常", "RecmdRequestController", "containerId or requestType is empty");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", (Object) "containerId or requestType is empty");
        jSONObject.put("errorCode", (Object) 1);
        ((kzj.a) cVar).a(jSONObject);
        return true;
    }

    public final AwesomeGetRequestParams h(String[] strArr, JSONObject jSONObject, fs8 fs8Var) {
        b11 l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetRequestParams) ipChange.ipc$dispatch("59601bc9", new Object[]{this, strArr, jSONObject, fs8Var});
        }
        AwesomeGetRequestParams awesomeGetRequestParams = new AwesomeGetRequestParams();
        for (String str : strArr) {
            vqb d = this.c.d(str);
            if (d != null) {
                AwesomeGetContainerParams f = d.f(this.b.l(str), JSON.parseObject(JSON.toJSONString(jSONObject)));
                if (f != null) {
                    c(str, f);
                    awesomeGetRequestParams.getContainerParams().put(str, f);
                    d(awesomeGetRequestParams, str);
                }
                if (!q5a.d() && ao4.a(str) && c6o.c(jSONObject.getString("requestType"))) {
                    return null;
                }
            }
        }
        if (awesomeGetRequestParams.getContainerParams().isEmpty()) {
            return null;
        }
        ioc c2 = this.c.g().c();
        IAppAdapter a2 = this.c.g().a();
        awesomeGetRequestParams.setUserId(c2.getUserId());
        awesomeGetRequestParams.setNick(c2.getNick());
        awesomeGetRequestParams.setUtdid(a2.getUTDID());
        bnc a3 = this.c.g().b().a();
        if (a3 != null) {
            awesomeGetRequestParams.setLongitude(a3.getLongitude());
            awesomeGetRequestParams.setLatitude(a3.getLatitude());
            awesomeGetRequestParams.setCountryName(a3.h());
            awesomeGetRequestParams.setProvinceCode(a3.e());
            awesomeGetRequestParams.setProvinceName(a3.f());
            awesomeGetRequestParams.setCityCode(a3.d());
            awesomeGetRequestParams.setCityName(a3.g());
            awesomeGetRequestParams.setAreaCode(a3.c());
            awesomeGetRequestParams.setAreaName(a3.b());
            awesomeGetRequestParams.setAddress(a3.i());
            awesomeGetRequestParams.setPoiRefreshTime(a3.a() / 1000);
        }
        try {
            awesomeGetRequestParams.setEdition(m());
            PositionInfo i = o78.i(q4a.b);
            if (i != null) {
                awesomeGetRequestParams.setCountryCode(i.countryCode);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (jSONObject.getJSONObject(SWITCH_REQUEST_CONSTANT) != null) {
            awesomeGetRequestParams.setSwitchVersionRequest(jSONObject.getJSONObject(SWITCH_REQUEST_CONSTANT));
        }
        if (jSONObject.containsKey(czh.KEY_PREVIEW_PARAM)) {
            awesomeGetRequestParams.setPreviewParam(jSONObject.getString(czh.KEY_PREVIEW_PARAM));
        }
        oob d2 = this.c.g().d();
        if (d2 != null) {
            String a4 = d2.a(jSONObject);
            if (!TextUtils.isEmpty(a4)) {
                awesomeGetRequestParams.setCommonBizParams(a4);
            }
        }
        awesomeGetRequestParams.setApiName(jSONObject.getString("apiName"));
        awesomeGetRequestParams.setVersion(jSONObject.getString("apiVersion"));
        Object obj = jSONObject.get("apiInfo");
        if (!(obj == null || (l = l(obj)) == null)) {
            awesomeGetRequestParams.setApiName(l.a());
            awesomeGetRequestParams.setVersion(l.b());
        }
        return awesomeGetRequestParams;
    }
}
