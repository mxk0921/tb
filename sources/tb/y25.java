package tb;

import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.features.MtopFeatureManager;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.network.NetParam;
import mtopsdk.mtop.protocol.builder.ProtocolParamBuilder;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.xstate.network.NetworkStateReceiver;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class y25 implements ProtocolParamBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MtopConfig f31798a = null;

    static {
        t2o.a(590348293);
        t2o.a(589299976);
    }

    public final void a(w4j w4jVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c5fc80", new Object[]{this, w4jVar, map});
            return;
        }
        MtopNetworkProp mtopNetworkProp = w4jVar.d;
        map.put("netType", inx.c("netType"));
        map.put("nq", inx.c("nq"));
        if (map.get("umt") == null) {
            map.put("umt", inx.d(w4jVar.f30449a.getInstanceId(), "umt"));
        }
        String str = this.f31798a.appVersion;
        if (StringUtils.isNotBlank(str)) {
            map.put(HttpHeaderConstant.X_APP_VER, str);
        }
        String str2 = this.f31798a.xOrangeQ;
        if (StringUtils.isNotBlank(str2)) {
            map.put(HttpHeaderConstant.X_ORANGE_Q, str2);
        }
        map.put(HttpHeaderConstant.X_APP_CONF_V, String.valueOf(this.f31798a.xAppConfigVersion));
        String c = inx.c(MspGlobalDefine.UA);
        if (c != null) {
            map.put("user-agent", c);
        }
        map.put(HttpHeaderConstant.CLIENT_TRACE_ID, mtopNetworkProp.clientTraceId);
        if (SwitchConfig.getInstance().getEnableFalcoId()) {
            map.put("x-falco-id", mtopNetworkProp.falcoId);
        }
        map.put("f-refer", "mtop");
        if (mtopNetworkProp.netParam > 0) {
            JSONObject jSONObject = new JSONObject();
            if ((1 & mtopNetworkProp.netParam) != 0) {
                String str3 = NetworkStateReceiver.c;
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        jSONObject.put(NetParam.NetParamKey.SSID, str3);
                    } catch (JSONException e) {
                        TBSdkLog.w("qmtopsdk.InnerProtocolParamBuilderImpl", "set wifi ssid error.", e);
                    }
                }
            }
            if ((2 & mtopNetworkProp.netParam) != 0) {
                String str4 = NetworkStateReceiver.d;
                if (!TextUtils.isEmpty(str4)) {
                    try {
                        jSONObject.put(NetParam.NetParamKey.BSSID, str4);
                    } catch (JSONException e2) {
                        TBSdkLog.w("qmtopsdk.InnerProtocolParamBuilderImpl", "set wifi bssid error.", e2);
                    }
                }
            }
            if (jSONObject.length() > 0) {
                map.put(HttpHeaderConstant.X_NETINFO, jSONObject.toString());
            }
        }
        String str5 = mtopNetworkProp.pageName;
        if (str5 != null) {
            map.put(HttpHeaderConstant.X_PAGE_NAME, str5);
        }
        String str6 = mtopNetworkProp.pageUrl;
        if (str6 != null) {
            map.put(HttpHeaderConstant.X_PAGE_URL, str6);
            String str7 = this.f31798a.mtopGlobalABTestParams.get(mtopNetworkProp.pageUrl);
            if (str7 != null) {
                map.put(HttpHeaderConstant.X_PAGE_MAB, str7);
            }
        }
    }

    public final void b(Mtop mtop, MtopNetworkProp mtopNetworkProp, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323ed44f", new Object[]{this, mtop, mtopNetworkProp, hashMap});
        } else if (mtopNetworkProp.apiType != null) {
            if (mtopNetworkProp.isInnerOpen) {
                mtopNetworkProp.accessToken = inx.d(StringUtils.concatStr(mtop.getInstanceId(), mtopNetworkProp.openAppKey), "accessToken");
            }
            hashMap.put(HttpHeaderConstant.KEY_EXTTYPE, mtopNetworkProp.apiType.getApiType());
            StringBuilder sb = new StringBuilder(64);
            if (StringUtils.isNotBlank(mtopNetworkProp.openAppKey)) {
                sb.append("openappkey=");
                sb.append(mtopNetworkProp.openAppKey);
            }
            if (StringUtils.isNotBlank(mtopNetworkProp.accessToken)) {
                sb.append(";accesstoken=");
                sb.append(mtopNetworkProp.accessToken);
            }
            hashMap.put(HttpHeaderConstant.KEY_EXTDATA, sb.toString());
        }
    }

    @Override // mtopsdk.mtop.protocol.builder.ProtocolParamBuilder
    public Map<String, String> buildParams(w4j w4jVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("67c1f235", new Object[]{this, w4jVar});
        }
        MtopStatistics mtopStatistics = w4jVar.g;
        mtopStatistics.buildParamsStartTime = mtopStatistics.currentTimeMillis();
        Mtop mtop = w4jVar.f30449a;
        this.f31798a = mtop.getMtopConfig();
        MtopRequest mtopRequest = w4jVar.b;
        MtopNetworkProp mtopNetworkProp = w4jVar.d;
        HashMap<String, String> hashMap = new HashMap<>(64);
        hashMap.put("utdid", mtop.getUtdid());
        if (StringUtils.isNotBlank(mtopNetworkProp.reqUserId)) {
            str = mtopNetworkProp.reqUserId;
        } else {
            str = mtop.getMultiAccountUserId(mtopNetworkProp.userInfo);
        }
        hashMap.put("uid", str);
        if (StringUtils.isNotBlank(mtopNetworkProp.reqBizExt)) {
            hashMap.put("reqbiz-ext", mtopNetworkProp.reqBizExt);
        }
        if (StringUtils.isBlank(mtopNetworkProp.reqAppKey)) {
            MtopConfig mtopConfig = this.f31798a;
            mtopNetworkProp.reqAppKey = mtopConfig.appKey;
            mtopNetworkProp.authCode = mtopConfig.authCode;
        }
        String str2 = mtopNetworkProp.reqAppKey;
        if (StringUtils.isNotBlank(this.f31798a.routerId)) {
            hashMap.put("routerId", this.f31798a.routerId);
        }
        if (StringUtils.isNotBlank(mtopNetworkProp.routerId)) {
            hashMap.put("routerId", mtopNetworkProp.routerId);
        }
        if (StringUtils.isNotBlank(this.f31798a.placeId)) {
            hashMap.put("placeId", this.f31798a.placeId);
        }
        if (StringUtils.isNotBlank(mtopNetworkProp.placeId)) {
            hashMap.put("placeId", mtopNetworkProp.placeId);
        }
        hashMap.put("appKey", str2);
        String data = mtopRequest.getData();
        if (mtopNetworkProp.priorityFlag && mtopNetworkProp.priorityData != null) {
            try {
                JSONObject jSONObject = new JSONObject(data);
                jSONObject.putOpt(HttpHeaderConstant.X_PRIORITY_DATA, JSON.toJSONString(mtopNetworkProp.priorityData));
                data = jSONObject.toString();
            } catch (Exception e) {
                String str3 = w4jVar.h;
                TBSdkLog.e("qmtopsdk.InnerProtocolParamBuilderImpl", str3, "set api priority data error, priorityData:" + mtopNetworkProp.priorityData, e);
            }
        }
        hashMap.put("data", data);
        hashMap.put("t", String.valueOf(SDKUtils.getCorrectionTime()));
        String apiName = mtopRequest.getApiName();
        Locale locale = Locale.US;
        hashMap.put("api", apiName.toLowerCase(locale));
        hashMap.put("v", mtopRequest.getVersion().toLowerCase(locale));
        hashMap.put("sid", mtop.getMultiAccountSid(mtopNetworkProp.userInfo));
        hashMap.put("ttid", mtopNetworkProp.ttid);
        hashMap.put("deviceId", mtop.getDeviceId());
        String c = inx.c(DispatchConstants.LATITUDE);
        if (StringUtils.isNotBlank(c)) {
            String c2 = inx.c(DispatchConstants.LONGTITUDE);
            if (StringUtils.isNotBlank(c2)) {
                hashMap.put(DispatchConstants.LATITUDE, c);
                hashMap.put(DispatchConstants.LONGTITUDE, c2);
            }
        }
        long mtopTotalFeatures = MtopFeatureManager.getMtopTotalFeatures(mtop);
        if (mtopNetworkProp.reqSource == 1) {
            mtopTotalFeatures |= MtopFeatureManager.getMtopFeatureValue(11);
        }
        if (mtopNetworkProp.priorityFlag) {
            mtopTotalFeatures |= MtopFeatureManager.getMtopFeatureValue(12);
        }
        hashMap.put(HttpHeaderConstant.X_FEATURES, String.valueOf(mtopTotalFeatures));
        b(mtop, mtopNetworkProp, hashMap);
        if (!TextUtils.isEmpty(mtopNetworkProp.openBiz)) {
            hashMap.put("open-biz", mtopNetworkProp.openBiz);
            if (!TextUtils.isEmpty(mtopNetworkProp.miniAppKey)) {
                hashMap.put("mini-appkey", mtopNetworkProp.miniAppKey);
            }
            if (!TextUtils.isEmpty(mtopNetworkProp.reqAppKey)) {
                hashMap.put("req-appkey", mtopNetworkProp.requestSourceAppKey);
            }
            if (!TextUtils.isEmpty(mtopNetworkProp.openBizData)) {
                hashMap.put("open-biz-data", mtopNetworkProp.openBizData);
            }
            String d = inx.d(StringUtils.concatStr(mtop.getInstanceId(), mtopNetworkProp.miniAppKey), "accessToken");
            mtopNetworkProp.accessToken = d;
            if (!TextUtils.isEmpty(d)) {
                hashMap.put("accessToken", mtopNetworkProp.accessToken);
            }
        }
        hashMap.put("pv", "6.2");
        hashMap.put("sign", UUID.randomUUID().toString());
        a(w4jVar, hashMap);
        MtopStatistics mtopStatistics2 = w4jVar.g;
        mtopStatistics2.buildParamsEndTime = mtopStatistics2.currentTimeMillis();
        MtopStatistics mtopStatistics3 = w4jVar.g;
        mtopStatistics3.buildParamsTime = mtopStatistics3.buildParamsEndTime - mtopStatistics3.buildParamsStartTime;
        return hashMap;
    }
}
