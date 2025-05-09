package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.global.SDKUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class czh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PREVIEW_PARAM = "previewParam";
    public static final Map<String, String> b = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f17467a;

    static {
        t2o.a(729809829);
    }

    public czh(String str) {
        this.f17467a = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ed667c0a", new Object[]{this});
        }
        Map<String, String> map = b;
        if (!((HashMap) map).containsKey(this.f17467a)) {
            String str = this.f17467a;
            ((HashMap) map).put(str, slp.c(dzj.a(str), null));
        }
        return (String) ((HashMap) map).get(this.f17467a);
    }

    public final boolean b(imn imnVar, JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2b56992", new Object[]{this, imnVar, jSONObject})).booleanValue();
        }
        boolean J = imnVar.J(this.f17467a);
        if (!jSONObject.getBooleanValue("checkDeltaExpire")) {
            return J;
        }
        if (!J && !imnVar.K(this.f17467a)) {
            z = false;
        }
        return z;
    }

    public final JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("efe83cce", new Object[]{this, jSONObject});
        }
        return jSONObject.getJSONObject("bizParam");
    }

    public AwesomeGetContainerParams d(imn imnVar, JSONObject jSONObject) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("ac24825", new Object[]{this, imnVar, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject(new HashMap(jSONObject));
        AwesomeGetContainerParams awesomeGetContainerParams = new AwesomeGetContainerParams();
        awesomeGetContainerParams.requestType = jSONObject2.getString("requestType");
        AwesomeGetContainerData u = imnVar.u(this.f17467a);
        if (u != null) {
            if (!jSONObject2.getBooleanValue("forceRequest")) {
                if (!b(imnVar, jSONObject2)) {
                    return null;
                }
                AwesomeGetContainerInnerData awesomeGetContainerInnerData = u.base;
                long j2 = 0;
                awesomeGetContainerParams.baseCacheTime = awesomeGetContainerInnerData == null ? 0L : awesomeGetContainerInnerData.cacheTime;
                AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = u.delta;
                if (awesomeGetContainerInnerData2 != null) {
                    j2 = awesomeGetContainerInnerData2.cacheTime;
                }
                awesomeGetContainerParams.deltaCacheTime = j2;
                awesomeGetContainerParams.clientReqTime = System.currentTimeMillis();
                awesomeGetContainerParams.clientReqOffsetTime = SDKUtils.getTimeOffset();
            }
            AwesomeGetContainerInnerData awesomeGetContainerInnerData3 = u.base;
            if (awesomeGetContainerInnerData3 == null) {
                j = a3b.c(this.f17467a);
            } else {
                j = awesomeGetContainerInnerData3.dataCacheTime;
            }
            awesomeGetContainerParams.realBaseCacheTime = j;
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
        phg.i("prepareCustomerParams");
        awesomeGetContainerParams.bizParams = e(jSONObject2);
        phg.h("prepareCustomerParams");
        JSONObject a2 = xsl.a(this.f17467a);
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
        return awesomeGetContainerParams;
    }

    public final JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("572e755e", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("lastVersion", (Object) a());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put(this.f17467a, (Object) jSONObject3);
        jSONObject2.put(bud.KEY_NEW_CONTENT_ENABLE, (Object) "true");
        Boolean bool = Boolean.TRUE;
        jSONObject2.put("new2021UIEnable", (Object) bool);
        jSONObject2.put(q92.IS_COMPLEX_TEXTURE, (Object) bool);
        vh7.a(jSONObject2);
        jSONObject2.put("deviceLevel", (Object) m0b.d());
        JSONObject c = c(jSONObject);
        if (c != null) {
            jSONObject2.putAll(c);
        }
        JSONObject b2 = ge2.b(this.f17467a);
        if (b2 != null) {
            jSONObject2.putAll(b2);
        }
        if (!f4b.b("delGlobalLBS", true)) {
            wba.b(jSONObject2);
        }
        jSONObject3.put(xti.KEY_TAB_BAR_FRAMEWORK, (Object) xti.FRAMEWORK_MICROSERVICES);
        return jSONObject2;
    }
}
