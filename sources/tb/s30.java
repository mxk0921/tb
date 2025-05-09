package tb;

import android.text.TextUtils;
import anet.channel.status.NetworkStatusHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.common.ucp.UcpManager;
import com.taobao.tao.homepage.revision.Revision;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import mtopsdk.mtop.global.SDKUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class s30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Integer c = null;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<String> f27772a = new HashSet<>();
    public final String b;

    static {
        t2o.a(729809839);
    }

    public s30(String str) {
        this.b = str;
        f();
    }

    public final void a(AwesomeGetContainerParams awesomeGetContainerParams, String str, JSONObject jSONObject, imn imnVar) {
        String str2;
        String str3;
        JSONObject jSONObject2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c395213", new Object[]{this, awesomeGetContainerParams, str, jSONObject, imnVar});
            return;
        }
        if (!(awesomeGetContainerParams == null || (jSONObject2 = awesomeGetContainerParams.bizParams) == null)) {
            jSONObject2.put("currentRequestType", (Object) awesomeGetContainerParams.requestType);
        }
        if (c == null) {
            c = Integer.valueOf(f4b.j());
        }
        if (!(c.intValue() <= 0 || imnVar == null || imnVar.q(str) == null)) {
            List<SectionModel> H = imnVar.H(str);
            String str4 = "";
            if (H == null || H.size() <= 0) {
                str2 = str4;
                str3 = str2;
            } else {
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                for (int size = H.size() - 1; size >= 0 && size >= H.size() - c.intValue(); size--) {
                    String e = e(H.get(size));
                    if (!TextUtils.isEmpty(e)) {
                        if (!z) {
                            sb.append(",");
                        }
                        sb.append(e);
                        z = false;
                    }
                }
                String sb2 = sb.toString();
                str3 = d(H);
                Integer integer = jSONObject.getInteger("index");
                if (integer != null) {
                    while (TextUtils.isEmpty(str4)) {
                        int i2 = i + 1;
                        if (i >= 4 || integer.intValue() <= 0 || integer.intValue() >= H.size() - 1) {
                            break;
                        }
                        str4 = e(H.get(integer.intValue()));
                        integer = Integer.valueOf(integer.intValue() - 1);
                        i = i2;
                    }
                }
                str2 = str4;
                str4 = sb2;
            }
            JSONObject jSONObject3 = awesomeGetContainerParams.bizParams;
            if (jSONObject3 != null) {
                jSONObject3.put("latestHundredItem", (Object) str4);
                awesomeGetContainerParams.bizParams.put("firstPagePVID", (Object) str3);
                awesomeGetContainerParams.bizParams.put("currentExposureItemID", (Object) str2);
            }
        }
    }

    public abstract boolean b();

    public AwesomeGetContainerParams c(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("edf61f4", new Object[]{this, imnVar, jSONObject});
        }
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(jSONObject));
        if (!h(this.b, parseObject, imnVar)) {
            return null;
        }
        AwesomeGetContainerParams i = i(this.b, parseObject, imnVar);
        JSONObject jSONObject2 = parseObject.getJSONObject("bizParam");
        if (jSONObject2 != null) {
            jSONObject2.put("hundredClickItemId", (Object) von.f(this.b));
            ee2.a(jSONObject2);
        }
        if (b()) {
            gh0.j().d(this.b, jSONObject2);
        }
        return i;
    }

    public final String d(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c13b69e", new Object[]{this, list});
        }
        String str = null;
        if (list != null && !list.isEmpty()) {
            for (SectionModel sectionModel : list) {
                str = sectionModel.getJSONObject("args").getString(yj4.PARAM_PVID);
                if (!TextUtils.isEmpty(str)) {
                    break;
                }
            }
        }
        return str;
    }

    public final String e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b6d27db", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) {
            return "";
        }
        return jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eda4fff", new Object[]{this});
            return;
        }
        this.f27772a.add("pullRefresh");
        this.f27772a.add("coldStart");
        this.f27772a.add(o78.REFRESH_SOURCE_HOT_START);
        this.f27772a.add(Constant.KEY_PAGEBACK);
        this.f27772a.add("editionSwitch");
        this.f27772a.add("pageEnter");
    }

    public boolean g(imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f998dd4", new Object[]{this, imnVar, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return true;
        }
        boolean booleanValue = jSONObject.getBooleanValue("isNextPage");
        AwesomeGetContainerData u = imnVar.u(this.b);
        boolean isLastPage = u == null ? false : u.isLastPage();
        if (booleanValue && isLastPage) {
            hrg.c(fdv.F_NETWORK_REQUEST, "param_error", "网关2.0网络请求，无法请求下一页", "SubContainerParamsUtils", "lastPage can not request next page");
            return true;
        } else if (booleanValue && "bindData".equals(jSONObject.getString("triggerType")) && u != null && u.getPageNum() == 0 && imnVar.H(this.b) != null && imnVar.H(this.b).size() < 10) {
            hrg.c(fdv.F_NETWORK_REQUEST, "process_error", "网关2.0网络请求，请求优化拦截", "SubContainerParamsUtils", "optimize request scroll next page is active intercept. index = 0 request is 拦截");
            if (cw6.b()) {
                bqa.d("jimbo", "index = 0 request is 拦截");
            }
            return true;
        } else if (!booleanValue || !"scroll".equals(jSONObject.getString("triggerType")) || ((u == null || u.getPageNum() == 0) && (imnVar.H(this.b) == null || imnVar.H(this.b).size() <= 10))) {
            return false;
        } else {
            hrg.c(fdv.F_NETWORK_REQUEST, "process_error", "网关2.0网络请求，请求优化拦截", "SubContainerParamsUtils", "scroll request is not should here, so is active intercept. scroll request is 拦截");
            if (cw6.b()) {
                bqa.d("jimbo", "scroll request is 拦截");
            }
            return true;
        }
    }

    public final boolean h(String str, JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3287278d", new Object[]{this, str, jSONObject, imnVar})).booleanValue();
        }
        hrg.e(fdv.F_NETWORK_REQUEST, "SubContainerParamsUtils", "start doRequest");
        boolean booleanValue = jSONObject.getBooleanValue("isNextPage");
        if (!jSONObject.getBooleanValue("forceRequest") && !booleanValue) {
            boolean J = imnVar.J(str);
            if (!J) {
                try {
                    if (jSONObject.getBooleanValue("checkDeltaExpire")) {
                        return imnVar.K(str);
                    }
                } catch (Throwable unused) {
                }
            }
            if (!J) {
                hrg.e(fdv.F_NETWORK_REQUEST, "SubContainerParamsUtils", "!isDataExpired return");
                return false;
            }
        }
        return true;
    }

    public final AwesomeGetContainerParams i(String str, JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("1bc02d2f", new Object[]{this, str, jSONObject, imnVar});
        }
        AwesomeGetContainerParams awesomeGetContainerParams = new AwesomeGetContainerParams();
        awesomeGetContainerParams.requestType = jSONObject.getString("requestType");
        AwesomeGetContainerData u = imnVar.u(str);
        if (u != null) {
            if (!jSONObject.getBooleanValue("forceRequest")) {
                AwesomeGetContainerInnerData awesomeGetContainerInnerData = u.base;
                long j = 0;
                awesomeGetContainerParams.baseCacheTime = awesomeGetContainerInnerData == null ? 0L : kmn.s(q4a.b, awesomeGetContainerInnerData.cacheTime);
                AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = u.delta;
                if (awesomeGetContainerInnerData2 != null) {
                    j = kmn.s(q4a.b, awesomeGetContainerInnerData2.cacheTime);
                }
                awesomeGetContainerParams.deltaCacheTime = j;
                awesomeGetContainerParams.clientReqTime = System.currentTimeMillis();
                awesomeGetContainerParams.clientReqOffsetTime = SDKUtils.getTimeOffset();
            }
            if (jSONObject.getBooleanValue("isCurrentPage")) {
                awesomeGetContainerParams.pageParams = u.getPageParams();
            } else if (!jSONObject.getBooleanValue("isNextPage")) {
                AwesomeGetPageData awesomeGetPageData = new AwesomeGetPageData();
                awesomeGetPageData.pageNum = 0;
                awesomeGetPageData.virtualPageNum = 0;
                awesomeGetContainerParams.pageParams = awesomeGetPageData;
            } else if (!u.isLastPage()) {
                AwesomeGetPageData clone = u.base.pageParams.clone();
                clone.pageNum++;
                clone.virtualPageNum++;
                awesomeGetContainerParams.pageParams = clone;
            }
            List<SectionModel> deltaData = u.getDeltaData();
            if (deltaData != null && deltaData.size() > 0) {
                ArrayList arrayList = new ArrayList(deltaData.size());
                for (SectionModel sectionModel : deltaData) {
                    String string = sectionModel.getString("sectionBizCode");
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
                awesomeGetContainerParams.deltaSections = arrayList;
            }
        }
        JSONObject a2 = xsl.a(str);
        awesomeGetContainerParams.passParams = a2;
        if (a2 == null) {
            awesomeGetContainerParams.passParams = new JSONObject();
        }
        if (!TextUtils.isEmpty(TBSpeed.getSubEdition())) {
            awesomeGetContainerParams.passParams.put("subEdition", (Object) TBSpeed.getSubEdition());
        }
        if (!TextUtils.isEmpty(TBSpeed.getSpeedPassParams())) {
            awesomeGetContainerParams.passParams.put("subEditionPassParams", (Object) TBSpeed.getSpeedPassParams());
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.get("bizParam");
        if (jSONObject2 != null) {
            awesomeGetContainerParams.bizParams = new JSONObject(jSONObject2);
        } else {
            awesomeGetContainerParams.bizParams = new JSONObject();
        }
        try {
            awesomeGetContainerParams.bizParams.put("wifi_bssid", (Object) NetworkStatusHelper.getWifiBSSID());
        } catch (Throwable th) {
            bqa.b("requestParams", "getWifiBSSID error", th);
        }
        JSONObject k = UcpManager.j().k(awesomeGetContainerParams.requestType);
        if (k != null) {
            awesomeGetContainerParams.bizParams.put("uppParams", (Object) k);
        }
        JSONObject jSONObject3 = awesomeGetContainerParams.bizParams;
        Boolean bool = Boolean.TRUE;
        jSONObject3.put("new2021UIEnable", (Object) bool);
        awesomeGetContainerParams.bizParams.put(q92.IS_COMPLEX_TEXTURE, (Object) bool);
        vh7.a(awesomeGetContainerParams.bizParams);
        String b = os6.b(Revision.MINI_APP_RELATION, "null");
        if (b != null) {
            awesomeGetContainerParams.bizParams.put(Revision.MINI_APP_RELATION, (Object) b);
        }
        awesomeGetContainerParams.bizParams.put("deviceLevel", (Object) m0b.d());
        JSONObject b2 = ge2.b(yyj.e().k());
        if (b2 != null) {
            awesomeGetContainerParams.bizParams.putAll(b2);
        }
        try {
            a(awesomeGetContainerParams, str, jSONObject, imnVar);
        } catch (Throwable th2) {
            if (cw6.b()) {
                th2.printStackTrace();
            } else {
                HashMap hashMap = new HashMap(1);
                hashMap.put("errorMsg", th2.getMessage());
                ddv.b(fdv.F_NETWORK_REQUEST, "request_add_repeat_params", "1.0", "GUESS_YOU_LIKE", hashMap, "request_add_repeat_params", "");
            }
        }
        String z = imnVar.z(str);
        if (!TextUtils.isEmpty(z)) {
            jSONObject2.put("expireAction", (Object) z);
        }
        if (TextUtils.equals(awesomeGetContainerParams.requestType, Constant.KEY_PAGEBACK)) {
            yb7.a().c(awesomeGetContainerParams.bizParams);
        }
        awesomeGetContainerParams.bizParams.put(xti.KEY_TAB_BAR_FRAMEWORK, (Object) xti.FRAMEWORK_MICROSERVICES);
        return awesomeGetContainerParams;
    }
}
