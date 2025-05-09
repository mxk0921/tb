package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.task.Coordinator;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.api.Login;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vmn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Integer c = null;

    /* renamed from: a  reason: collision with root package name */
    public final wmn f30107a;
    public final imn b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f30108a;
        public final /* synthetic */ c b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public a(JSONObject jSONObject, c cVar, String str, String str2) {
            this.f30108a = jSONObject;
            this.b = cVar;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vmn.a(vmn.this, this.f30108a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements m3o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rjj f30109a;
        public final /* synthetic */ c b;

        public b(vmn vmnVar, rjj rjjVar, c cVar) {
            this.f30109a = rjjVar;
            this.b = cVar;
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
            rjj rjjVar = this.f30109a;
            if (rjjVar != null) {
                jSONObject.put("nativeCustomParams", (Object) rjjVar);
            }
            this.b.a(jSONObject);
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
            this.b.b(jSONObject);
        }

        @Override // tb.m3o
        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a(JSONObject jSONObject);

        void b(JSONObject jSONObject);
    }

    static {
        t2o.a(729809734);
    }

    public vmn(imn imnVar, wmn wmnVar) {
        this.f30107a = wmnVar;
        this.b = imnVar;
    }

    public static /* synthetic */ void a(vmn vmnVar, JSONObject jSONObject, c cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad0ba3d", new Object[]{vmnVar, jSONObject, cVar, str, str2});
        } else {
            vmnVar.f(jSONObject, cVar, str, str2);
        }
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66e9c271", new Object[0]);
        }
        PositionInfo c2 = kbq.c(q4a.b);
        HashMap hashMap = new HashMap();
        hashMap.put("countryId", c2.countryCode);
        hashMap.put("cityId", c2.cityId);
        hashMap.put("countryNumCode", c2.countryNumCode);
        hashMap.put("actualLanguageCode", c2.actualLanguageCode);
        hashMap.put("currencyCode", c2.currencyCode);
        return JSON.toJSONString(hashMap);
    }

    public final void b(AwesomeGetContainerParams awesomeGetContainerParams, String str, JSONObject jSONObject) {
        imn imnVar;
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280220c9", new Object[]{this, awesomeGetContainerParams, str, jSONObject});
            return;
        }
        if (c == null) {
            c = Integer.valueOf(f4b.j());
        }
        if (!(c.intValue() <= 0 || (imnVar = this.b) == null || imnVar.q(str) == null)) {
            String str3 = awesomeGetContainerParams.requestType;
            List<SectionModel> H = this.b.H(str);
            String str4 = "";
            if (H == null || H.size() <= 0) {
                str2 = str4;
            } else {
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                for (int size = H.size() - 1; size >= 0 && size >= H.size() - c.intValue(); size--) {
                    String j = j(H.get(size));
                    if (!TextUtils.isEmpty(j)) {
                        if (!z) {
                            sb.append(",");
                        }
                        sb.append(j);
                        z = false;
                    }
                }
                String sb2 = sb.toString();
                if (H.size() > 0) {
                    awesomeGetContainerParams.bizParams.put("firstPagePVID", (Object) i(H, k(H)));
                }
                Integer integer = jSONObject.getInteger("index");
                if (integer != null) {
                    while (TextUtils.isEmpty(str4)) {
                        int i2 = i + 1;
                        if (i >= 4 || integer.intValue() <= 0 || integer.intValue() >= H.size() - 1) {
                            break;
                        }
                        str4 = j(H.get(integer.intValue()));
                        integer = Integer.valueOf(integer.intValue() - 1);
                        i = i2;
                    }
                }
                str2 = str4;
                str4 = sb2;
            }
            JSONObject jSONObject2 = awesomeGetContainerParams.bizParams;
            if (jSONObject2 != null) {
                jSONObject2.put("currentRequestType", (Object) str3);
                awesomeGetContainerParams.bizParams.put("latestHundredItem", (Object) str4);
                awesomeGetContainerParams.bizParams.put("currentExposureItemID", (Object) str2);
            }
        }
    }

    public final fjb c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fjb) ipChange.ipc$dispatch("58aabc75", new Object[]{this, jSONObject, str});
        }
        ro2 a2 = so2.a(str, jSONObject.getString("requestType"));
        if (a2 == null) {
            return null;
        }
        return new qo2(a2);
    }

    public final String d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23297c5f", new Object[]{this, jSONObject, str});
        }
        f54 f54Var = new f54();
        fjb c2 = c(jSONObject, str);
        if (c2 != null) {
            f54Var.a(c2);
        }
        f54Var.a(new ii7());
        return f54Var.b(null).getString(f54.KEY);
    }

    public final void f(JSONObject jSONObject, c cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8726ff8a", new Object[]{this, jSONObject, cVar, str, str2});
            return;
        }
        bqa.e("RecmdRequestController", "start action in async thread");
        hrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "start action in async thread");
        String string = jSONObject.getString("strategy");
        jSONObject.getIntValue("timeout");
        es8 es8Var = new es8();
        es8Var.b = MethodEnum.POST;
        noq d = this.f30107a.d(str2, string, str);
        if (!d.f24871a) {
            hrg.c(fdv.F_NETWORK_REQUEST, "process_error", "网关2.0网络请求，请求策略拦截", "RecmdRequestController", "strategyState : " + d);
            return;
        }
        es8Var.f18788a = d.b;
        n(str, jSONObject, es8Var);
        e(jSONObject, es8Var, cVar);
        bqa.e("RecmdRequestController", "end action");
        hrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "end action");
    }

    public final String j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b6d27db", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) {
            return "";
        }
        return jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
    }

    public final int k(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6fefcdb", new Object[]{this, list})).intValue();
        }
        return Math.min(8, list.size());
    }

    public final String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3fadd7f", new Object[]{this, str});
        }
        return a3b.e();
    }

    public final boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59225726", new Object[]{this, str})).booleanValue();
        }
        return str.startsWith("recommend_");
    }

    public final AwesomeGetRequestParams p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetRequestParams) ipChange.ipc$dispatch("ce9fe534", new Object[]{this, jSONObject});
        }
        AwesomeGetRequestParams awesomeGetRequestParams = new AwesomeGetRequestParams();
        awesomeGetRequestParams.userId = Login.getOldUserId();
        awesomeGetRequestParams.nick = Login.getOldNick();
        awesomeGetRequestParams.utdid = s5a.g();
        TBLocationDTO d = p78.a() ? TBLocationClient.d() : null;
        if (d != null) {
            awesomeGetRequestParams.longitude = d.longitude;
            awesomeGetRequestParams.latitude = d.latitude;
            awesomeGetRequestParams.countryName = d.countryName;
            awesomeGetRequestParams.provinceCode = d.provinceCode;
            awesomeGetRequestParams.provinceName = d.provinceName;
            awesomeGetRequestParams.cityCode = d.cityCode;
            awesomeGetRequestParams.cityName = d.cityName;
            awesomeGetRequestParams.areaCode = d.areaCode;
            awesomeGetRequestParams.areaName = d.areaName;
            awesomeGetRequestParams.address = d.address;
            Long l = d.timeStamp;
            if (l != null) {
                awesomeGetRequestParams.poiRefreshTime = l.longValue() / 1000;
            }
        }
        String c2 = wba.c();
        if (!TextUtils.isEmpty(c2)) {
            awesomeGetRequestParams.globalLbs = c2;
        }
        awesomeGetRequestParams.edition = h();
        PositionInfo c3 = kbq.c(q4a.b);
        if (c3 != null) {
            awesomeGetRequestParams.countryCode = c3.countryCode;
        }
        if (jSONObject.getJSONObject(mzj.SWITCH_REQUEST_CONSTANT) != null) {
            awesomeGetRequestParams.switchVersionRequest = jSONObject.getJSONObject(mzj.SWITCH_REQUEST_CONSTANT);
        }
        if (jSONObject.containsKey(czh.KEY_PREVIEW_PARAM)) {
            awesomeGetRequestParams.previewParam = jSONObject.getString(czh.KEY_PREVIEW_PARAM);
        }
        String string = jSONObject.getString("containerId");
        String d2 = d(jSONObject, string);
        if (!TextUtils.isEmpty(d2)) {
            awesomeGetRequestParams.commonBizParams = d2;
        }
        awesomeGetRequestParams.containerParams.put(string, o(string, jSONObject));
        return awesomeGetRequestParams;
    }

    public final void n(String str, JSONObject jSONObject, es8 es8Var) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591b96a2", new Object[]{this, str, jSONObject, es8Var});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("bizParam");
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject(TSRecmdReqPrefetch.PREFETCH_PARAMS)) != null) {
            try {
                jSONObject3.remove(TSRecmdReqPrefetch.PREFETCH_PARAMS);
                es8Var.c = true;
                es8Var.d = jSONObject2.getString("timeout");
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
                es8Var.e = arrayList;
            } catch (Throwable unused) {
            }
        }
    }

    public final String i(List<SectionModel> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77e205bf", new Object[]{this, list, new Integer(i)});
        }
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            JSONObject jSONObject = list.get(i2).getJSONObject("args");
            if (!(jSONObject == null || (str = jSONObject.getString(yj4.PARAM_PVID)) == null)) {
                break;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (android.text.TextUtils.equals(r2.requestType, "newInteractive") != false) goto L_0x006c;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams o(java.lang.String r12, com.alibaba.fastjson.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.vmn.o(java.lang.String, com.alibaba.fastjson.JSONObject):com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams");
    }

    public void g(JSONObject jSONObject, c cVar) {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8804342f", new Object[]{this, jSONObject, cVar});
            return;
        }
        bqa.e("RecmdRequestController", "start action:", jSONObject.toJSONString());
        hrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "start action");
        if (jSONObject.isEmpty()) {
            hrg.c(fdv.F_NETWORK_REQUEST, "param_error", "网关2.0网络请求，参数为空", "RecmdRequestController", "requestParam is empty");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorMsg", "requestParam is empty ");
            jSONObject2.put("errorCode", (Object) 1);
            cVar.b(jSONObject2);
            return;
        }
        String string = jSONObject.getString("containerId");
        String string2 = jSONObject.getString("requestType");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            hrg.c(fdv.F_NETWORK_REQUEST, "param_error", "网关2.0网络请求，参数异常", "RecmdRequestController", "containerId or requestType is empty");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("errorMsg", "containerId or requestType is empty");
            jSONObject3.put("errorCode", (Object) 1);
            cVar.b(jSONObject3);
            return;
        }
        boolean booleanValue = jSONObject.getBooleanValue("isNextPage");
        AwesomeGetContainerData u = this.b.u(string);
        if (u != null) {
            z = u.isLastPage();
        }
        if (!booleanValue || !z) {
            if (booleanValue) {
                str = string2;
                if ("bindData".equals(jSONObject.getString("triggerType")) && u != null && u.getPageNum() == 0 && this.b.H(string) != null && this.b.H(string).size() < 10) {
                    hrg.c(fdv.F_NETWORK_REQUEST, "process_error", "网关2.0网络请求，请求优化拦截", "RecmdRequestController", "optimize request scroll next page is active intercept. index = 0 request is 拦截");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("errorMsg", "optimize request scroll next page is active intercept.");
                    jSONObject4.put("errorCode", (Object) 5);
                    cVar.b(jSONObject4);
                    if (cw6.b()) {
                        bqa.d("jimbo", "index = 0 request is 拦截");
                        return;
                    }
                    return;
                }
            } else {
                str = string2;
            }
            if (booleanValue && "scroll".equals(jSONObject.getString("triggerType")) && ((u != null && u.getPageNum() != 0) || (this.b.H(string) != null && this.b.H(string).size() > 10))) {
                hrg.c(fdv.F_NETWORK_REQUEST, "process_error", "网关2.0网络请求，请求优化拦截", "RecmdRequestController", "scroll request is not should here, so is active intercept. scroll request is 拦截");
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("errorMsg", "scroll request is not should here, so is active intercept.");
                jSONObject5.put("errorCode", (Object) 5);
                cVar.b(jSONObject5);
                if (cw6.b()) {
                    bqa.d("jimbo", "scroll request is 拦截");
                }
            } else if (t5a.a()) {
                Coordinator.execute(new a(jSONObject, cVar, string, str));
            } else {
                f(jSONObject, cVar, string, str);
            }
        } else {
            hrg.c(fdv.F_NETWORK_REQUEST, "param_error", "网关2.0网络请求，无法请求下一页", "RecmdRequestController", "lastPage can not request next page");
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("errorMsg", "lastPage can not request next page");
            jSONObject6.put("errorCode", (Object) 1);
            cVar.b(jSONObject6);
        }
    }

    public final void e(JSONObject jSONObject, es8 es8Var, c cVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a04d509d", new Object[]{this, jSONObject, es8Var, cVar});
            return;
        }
        hrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "start doRequest");
        String string = jSONObject.getString("containerId");
        String string2 = jSONObject.getString("apiName");
        String string3 = jSONObject.getString("apiVersion");
        boolean booleanValue = jSONObject.getBooleanValue("isNextPage");
        if (!jSONObject.getBooleanValue("forceRequest") && !booleanValue) {
            boolean J = this.b.J(string);
            if (!J) {
                try {
                    if (jSONObject.getBooleanValue("checkDeltaExpire")) {
                        boolean K = this.b.K(string);
                        if (!string.startsWith("recommend_home_main_")) {
                            if (!string.startsWith("recommend_home_intl_")) {
                                if (m(string)) {
                                }
                                J = !J || (z && K);
                            }
                        }
                        JSONObject jSONObject2 = jSONObject.getJSONObject("bizParam");
                        z = jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.getString("itemId"));
                        hrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "WindVane param check : " + z);
                        if (!J) {
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (!J) {
                hrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "!isDataExpired return");
                return;
            }
        }
        AwesomeGetRequestParams p = p(jSONObject);
        p.API_NAME = string2;
        p.VERSION = string3;
        Object obj = jSONObject.get("apiInfo");
        if (obj != null && (obj instanceof d11)) {
            d11 d11Var = (d11) obj;
            p.API_NAME = d11Var.a();
            p.VERSION = d11Var.b();
        }
        Object obj2 = jSONObject.get("nativeCustomParams");
        rjj rjjVar = (obj2 == null || !(obj2 instanceof rjj)) ? null : (rjj) obj2;
        JSONObject jSONObject3 = jSONObject.getJSONObject("bizParam");
        if (jSONObject3 != null) {
            jSONObject3.put("hundredClickItemId", (Object) von.f(string));
            ee2.a(jSONObject3);
            jSONObject3.put("deviceLevel", (Object) m0b.d());
        }
        gh0.j().d(string, jSONObject3);
        hrg.e(fdv.F_NETWORK_REQUEST, "RecmdRequestController", "start request containerId : " + string);
        this.f30107a.f(string, p, es8Var, new b(this, rjjVar, cVar));
    }
}
