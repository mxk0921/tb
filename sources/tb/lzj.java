package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.task.Coordinator;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;
import tb.jzj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lzj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nzj f23662a;
    public final imn b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f23663a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ c c;
        public final /* synthetic */ String d;

        public a(String[] strArr, JSONObject jSONObject, c cVar, String str) {
            this.f23663a = strArr;
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
                lzj.a(lzj.this, this.f23663a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements m3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f23664a;
        public final /* synthetic */ JSONObject b;

        public b(c cVar, JSONObject jSONObject) {
            this.f23664a = cVar;
            this.b = jSONObject;
        }

        @Override // tb.m3o
        public void a(AwesomeGetData awesomeGetData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f64babd5", new Object[]{this, awesomeGetData});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dataModel", (Object) awesomeGetData);
            jSONObject.put("UIOperation", (Object) this.b);
            jSONObject.put("isSecondReturn", (Object) Boolean.valueOf(awesomeGetData.isSecondReturn));
            lzj.this.b.a0(awesomeGetData.ext);
            ((jzj.a) this.f23664a).c(jSONObject);
        }

        @Override // tb.m3o
        public void error(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a936c23", new Object[]{this, str, str2});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", (Object) str2);
            jSONObject.put("errorCode", (Object) str);
            ((jzj.a) this.f23664a).a(jSONObject);
        }

        @Override // tb.m3o
        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
            } else {
                ((jzj.a) this.f23664a).b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
    }

    static {
        t2o.a(729809812);
    }

    public lzj(imn imnVar, nzj nzjVar) {
        this.f23662a = nzjVar;
        this.b = imnVar;
    }

    public static /* synthetic */ void a(lzj lzjVar, String[] strArr, JSONObject jSONObject, c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2a919a", new Object[]{lzjVar, strArr, jSONObject, cVar, str});
        } else {
            lzjVar.g(strArr, jSONObject, cVar, str);
        }
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66e9c271", new Object[0]);
        }
        PositionInfo c2 = kbq.c(q4a.b);
        PositionInfo a2 = kbq.a(q4a.b);
        HashMap hashMap = new HashMap();
        hashMap.put("countryId", c2.countryCode);
        hashMap.put("cityId", c2.cityId);
        hashMap.put("countryNumCode", c2.countryNumCode);
        hashMap.put("actualLanguageCode", c2.actualLanguageCode);
        hashMap.put("currencyCode", c2.currencyCode);
        hashMap.put("selectedEditionCode", c2.editionCode);
        hashMap.put("realEditionCode", a2.editionCode);
        return JSON.toJSONString(hashMap);
    }

    public final String d(String str, AwesomeGetRequestParams awesomeGetRequestParams, JSONObject jSONObject) {
        Map<String, String> requestCommonBizParams;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17760295", new Object[]{this, str, awesomeGetRequestParams, jSONObject});
        }
        z4a z4aVar = z4a.NEW_FACE_CHILD;
        ro2 a2 = so2.a(z4aVar.f32522a, str);
        if (a2 == null) {
            return null;
        }
        JSONObject b2 = new f54().a(new qo2(a2)).a(new v5v(str)).a(new gof(awesomeGetRequestParams)).a(new nq()).a(new lv6(awesomeGetRequestParams)).a(new bi2(str)).b(null);
        HomeInfoFlowDataService a3 = rue.a(z4aVar.f32522a);
        if (!(a3 == null || (requestCommonBizParams = a3.getRequestCommonBizParams(jSONObject)) == null || (jSONObject2 = b2.getJSONObject(f54.KEY)) == null)) {
            jSONObject2.putAll(requestCommonBizParams);
        }
        return b2.getString(f54.KEY);
    }

    public final void f(String[] strArr, String str, JSONObject jSONObject, es8 es8Var, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261cd6ae", new Object[]{this, strArr, str, jSONObject, es8Var, cVar});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        AwesomeGetRequestParams e = e(strArr, jSONObject, es8Var);
        hrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "createRequestParams: " + (SystemClock.uptimeMillis() - uptimeMillis));
        if (e != null) {
            uqa.b("MTopRequest", "doRequest", " 请求参数处理完毕，开始发起真实请求, API:" + e.API_NAME);
            j(str, e, es8Var, cVar, null);
        }
    }

    public final void g(String[] strArr, JSONObject jSONObject, c cVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be1f2809", new Object[]{this, strArr, jSONObject, cVar, str});
            return;
        }
        hrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "start action in async thread");
        String string = jSONObject.getString("strategy");
        jSONObject.getIntValue("timeout");
        es8 es8Var = new es8();
        es8Var.b = MethodEnum.POST;
        String j = yyj.e().j(strArr);
        if (j != null) {
            noq e = this.f23662a.e(str, string, j);
            if (!e.f24871a) {
                vqa g = vqa.k().j("handleRequest").i("MTopRequest").e("网关2.0网络请求，请求策略拦截.").g("requestType", str).g("strategyState", e.b);
                if (e.f24871a) {
                    str2 = "true";
                } else {
                    str2 = "false";
                }
                g.g("needRun", str2).a();
                hrg.c(fdv.F_NETWORK_REQUEST, "process_error", "网关2.0网络请求，请求策略拦截", "RecmdRequestController", "strategyState : " + e);
                return;
            }
            es8Var.f18788a = e.b;
            vqa.k().i("MTopRequest").j("handleRequest").e("请求策略未拦截.").g("requestType", str).g("请求策略", e.b).g("containerId", j).a();
            f(strArr, j, jSONObject, es8Var, cVar);
            hrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "end action");
        }
    }

    public void h(JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a2f53", new Object[]{this, jSONObject, cVar});
            return;
        }
        hrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "start action");
        if (!b(jSONObject, cVar)) {
            String[] b2 = yyj.e().b(jSONObject);
            String string = jSONObject.getString("requestType");
            if (!c(cVar, b2, string)) {
                uqa.b("MTopRequest", "checkRequest", " requestParams is valid requestType:" + string);
                if (!t5a.a()) {
                    g(b2, jSONObject, cVar, string);
                } else if (vxl.m(string)) {
                    g(b2, jSONObject, cVar, string);
                } else {
                    Coordinator.execute(new a(b2, jSONObject, cVar, string));
                }
            }
        }
    }

    public final void j(String str, AwesomeGetRequestParams awesomeGetRequestParams, es8 es8Var, c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803a63ce", new Object[]{this, str, awesomeGetRequestParams, es8Var, cVar, jSONObject});
        } else {
            this.f23662a.g(str, awesomeGetRequestParams, es8Var, new b(cVar, jSONObject));
        }
    }

    public final boolean b(JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b78a865", new Object[]{this, jSONObject, cVar})).booleanValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return false;
        }
        hrg.c(fdv.F_NETWORK_REQUEST, "param_error", "网关2.0网络请求，参数为空", "RecmdRequestController", "requestParam is empty");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMsg", (Object) "requestParam is empty ");
        jSONObject2.put("errorCode", (Object) 1);
        ((jzj.a) cVar).a(jSONObject2);
        uqa.b("MTopRequest", "checkRequestParams", "网关2.0网络请求，参数为空");
        return true;
    }

    public final boolean c(c cVar, String[] strArr, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93a6faab", new Object[]{this, cVar, strArr, str})).booleanValue();
        }
        if (strArr != null && !TextUtils.isEmpty(str)) {
            return false;
        }
        hrg.c(fdv.F_NETWORK_REQUEST, "param_error", "网关2.0网络请求，参数异常", "RecmdRequestController", "containerId or requestType is empty");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", (Object) "containerId or requestType is empty");
        jSONObject.put("errorCode", (Object) 1);
        ((jzj.a) cVar).a(jSONObject);
        vqa j = vqa.k().i("MTopRequest").j("checkRequest");
        if (strArr == null) {
            str2 = "null";
        } else {
            str2 = "not null";
        }
        j.g("containerId", str2).g("requestType", str).a();
        return true;
    }

    public final AwesomeGetRequestParams e(String[] strArr, JSONObject jSONObject, es8 es8Var) {
        AwesomeGetContainerParams c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetRequestParams) ipChange.ipc$dispatch("c129fc09", new Object[]{this, strArr, jSONObject, es8Var});
        }
        AwesomeGetRequestParams awesomeGetRequestParams = new AwesomeGetRequestParams();
        for (String str : strArr) {
            uqb a2 = yyj.e().a(str);
            if (!(a2 == null || (c2 = a2.c(this.b, jSONObject)) == null)) {
                awesomeGetRequestParams.containerParams.put(str, c2);
            }
        }
        String string = jSONObject.getString("requestType");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String d = d(string, awesomeGetRequestParams, jSONObject);
        if (TextUtils.equals(string, "coldStart")) {
            vxm.b.e().a("CommonBizParams", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
        if (!TextUtils.isEmpty(d)) {
            awesomeGetRequestParams.commonBizParams = d;
        }
        if (!f4b.b("delGlobalLBS", true)) {
            String c3 = wba.c();
            if (!TextUtils.isEmpty(c3)) {
                awesomeGetRequestParams.globalLbs = c3;
            }
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(mzj.SWITCH_REQUEST_CONSTANT);
        if (jSONObject2 != null) {
            awesomeGetRequestParams.switchVersionRequest = jSONObject2;
        }
        TBLocationDTO tBLocationDTO = null;
        if (awesomeGetRequestParams.containerParams.isEmpty()) {
            uqa.b("MTopRequest", "handleRequest", "基础参数创建过程中,容器参数为空");
            return null;
        }
        phg.i("utdid");
        awesomeGetRequestParams.userId = p7p.g(string);
        awesomeGetRequestParams.encryptUserId = p7p.b(string);
        if (TextUtils.equals(string, "coldStart") && !TextUtils.isEmpty(awesomeGetRequestParams.userId) && TextUtils.isEmpty(awesomeGetRequestParams.encryptUserId)) {
            r5a.i(r5a.f27121a, UtUtils.CHANGED_UPP_EVENT_ID, "encryptUserId_null", "coldStartAndLogin");
            bqa.d("RecmdRequestController", "encryptUserId_null");
        } else if (TextUtils.isEmpty(awesomeGetRequestParams.encryptUserId)) {
            r5a.i(r5a.f27121a, UtUtils.CHANGED_UPP_EVENT_ID, "encryptUserId_null", "requestType_" + string);
        }
        awesomeGetRequestParams.nick = p7p.i(string);
        awesomeGetRequestParams.utdid = s5a.g();
        phg.h("utdid");
        if (p78.a()) {
            tBLocationDTO = TBLocationClient.d();
        }
        if (tBLocationDTO != null) {
            awesomeGetRequestParams.longitude = tBLocationDTO.longitude;
            awesomeGetRequestParams.latitude = tBLocationDTO.latitude;
            awesomeGetRequestParams.countryName = tBLocationDTO.countryName;
            awesomeGetRequestParams.provinceCode = tBLocationDTO.provinceCode;
            awesomeGetRequestParams.provinceName = tBLocationDTO.provinceName;
            awesomeGetRequestParams.cityCode = tBLocationDTO.cityCode;
            awesomeGetRequestParams.cityName = tBLocationDTO.cityName;
            awesomeGetRequestParams.areaCode = tBLocationDTO.areaCode;
            awesomeGetRequestParams.areaName = tBLocationDTO.areaName;
            awesomeGetRequestParams.address = tBLocationDTO.address;
            Long l = tBLocationDTO.timeStamp;
            if (l != null) {
                awesomeGetRequestParams.poiRefreshTime = l.longValue() / 1000;
            }
        }
        awesomeGetRequestParams.edition = i();
        PositionInfo c4 = kbq.c(q4a.b);
        if (c4 != null) {
            awesomeGetRequestParams.countryCode = c4.countryCode;
        }
        String e = os6.e("Preview", czh.KEY_PREVIEW_PARAM, false);
        if (!TextUtils.isEmpty(e)) {
            awesomeGetRequestParams.previewParam = e;
        }
        if (jSONObject.containsKey("apiName")) {
            awesomeGetRequestParams.API_NAME = jSONObject.getString("apiName");
        }
        if (jSONObject.containsKey("apiVersion")) {
            awesomeGetRequestParams.VERSION = jSONObject.getString("apiVersion");
        }
        vqa.k().i("MTopRequest").j("handleRequest").e("基础参数补全完毕.").g("API", awesomeGetRequestParams.API_NAME).g("VERSION", awesomeGetRequestParams.VERSION).g(vyt.TYPE_EDITION_CHANGE, awesomeGetRequestParams.edition).a();
        return awesomeGetRequestParams;
    }
}
