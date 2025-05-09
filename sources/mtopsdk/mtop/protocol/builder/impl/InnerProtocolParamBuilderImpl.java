package mtopsdk.mtop.protocol.builder.impl;

import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.ApiTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.features.MtopFeatureManager;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SDKUtils;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.network.NetParam;
import mtopsdk.mtop.protocol.builder.ProtocolParamBuilder;
import mtopsdk.mtop.util.FullTraceHelper;
import mtopsdk.mtop.util.MtopStatistics;
import mtopsdk.xstate.network.NetworkStateReceiver;
import org.json.JSONException;
import org.json.JSONObject;
import tb.inx;
import tb.kqd;
import tb.n9f;
import tb.owp;
import tb.pl4;
import tb.t2o;
import tb.w4j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InnerProtocolParamBuilderImpl implements ProtocolParamBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.InnerProtocolParamBuilderImpl";
    private MtopConfig mtopConfig = null;

    static {
        t2o.a(589299977);
        t2o.a(589299976);
    }

    private void setOldTopProtocolParams(Mtop mtop, MtopNetworkProp mtopNetworkProp, HashMap<String, String> hashMap) {
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
        Object obj;
        String str;
        HashMap<String, String> hashMap;
        InnerProtocolParamBuilderImpl innerProtocolParamBuilderImpl;
        HashMap<String, String> hashMap2;
        String str2;
        MtopNetworkProp mtopNetworkProp;
        String str3;
        String str4;
        String str5;
        String str6;
        kqd kqdVar;
        String str7;
        HashMap<String, String> hashMap3;
        String str8;
        String str9;
        HashMap<String, String> hashMap4;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("67c1f235", new Object[]{this, w4jVar});
        }
        MtopStatistics mtopStatistics = w4jVar.g;
        mtopStatistics.buildParamsStartTime = mtopStatistics.currentTimeMillis();
        Mtop mtop = w4jVar.f30449a;
        MtopConfig mtopConfig = mtop.getMtopConfig();
        this.mtopConfig = mtopConfig;
        kqd kqdVar2 = mtopConfig.sign;
        if (kqdVar2 != null || owp.c(w4jVar)) {
            MtopRequest mtopRequest = w4jVar.b;
            MtopNetworkProp mtopNetworkProp2 = w4jVar.d;
            HashMap<String, String> hashMap5 = new HashMap<>(64);
            hashMap5.put("utdid", mtop.getUtdid());
            hashMap5.put("uid", StringUtils.isNotBlank(mtopNetworkProp2.reqUserId) ? mtopNetworkProp2.reqUserId : mtop.getMultiAccountUserId(mtopNetworkProp2.userInfo));
            if (FullTraceHelper.isLowBuyer()) {
                hashMap5.put(HttpHeaderConstant.X_LOW_BUYER, "1");
            }
            if (StringUtils.isNotBlank(mtopNetworkProp2.reqBizExt)) {
                hashMap5.put("reqbiz-ext", mtopNetworkProp2.reqBizExt);
            }
            if (StringUtils.isBlank(mtopNetworkProp2.reqAppKey)) {
                MtopConfig mtopConfig2 = this.mtopConfig;
                mtopNetworkProp2.reqAppKey = mtopConfig2.appKey;
                mtopNetworkProp2.authCode = mtopConfig2.authCode;
            }
            String str10 = mtopNetworkProp2.reqAppKey;
            String str11 = mtopNetworkProp2.authCode;
            if (StringUtils.isNotBlank(this.mtopConfig.routerId)) {
                hashMap5.put("routerId", this.mtopConfig.routerId);
            }
            if (StringUtils.isNotBlank(mtopNetworkProp2.routerId)) {
                hashMap5.put("routerId", mtopNetworkProp2.routerId);
            }
            if (StringUtils.isNotBlank(this.mtopConfig.placeId)) {
                hashMap5.put("placeId", this.mtopConfig.placeId);
            }
            if (StringUtils.isNotBlank(mtopNetworkProp2.placeId)) {
                hashMap5.put("placeId", mtopNetworkProp2.placeId);
            }
            hashMap5.put("appKey", str10);
            String data = mtopRequest.getData();
            if (mtopNetworkProp2.priorityFlag && mtopNetworkProp2.priorityData != null) {
                try {
                    JSONObject jSONObject = new JSONObject(data);
                    jSONObject.putOpt(HttpHeaderConstant.X_PRIORITY_DATA, JSON.toJSONString(mtopNetworkProp2.priorityData));
                    data = jSONObject.toString();
                } catch (Exception e) {
                    String str12 = w4jVar.h;
                    TBSdkLog.e(TAG, str12, "set api priority data error, priorityData:" + mtopNetworkProp2.priorityData, e);
                }
            }
            hashMap5.put("data", data);
            String valueOf = String.valueOf(SDKUtils.getCorrectionTime());
            hashMap5.put("t", valueOf);
            String apiName = mtopRequest.getApiName();
            Locale locale = Locale.US;
            hashMap5.put("api", apiName.toLowerCase(locale));
            hashMap5.put("v", mtopRequest.getVersion().toLowerCase(locale));
            hashMap5.put("sid", mtop.getMultiAccountSid(mtopNetworkProp2.userInfo));
            hashMap5.put("ttid", mtopNetworkProp2.ttid);
            hashMap5.put("deviceId", mtop.getDeviceId());
            String c = inx.c(DispatchConstants.LATITUDE);
            if (StringUtils.isNotBlank(c)) {
                String c2 = inx.c(DispatchConstants.LONGTITUDE);
                if (StringUtils.isNotBlank(c2)) {
                    hashMap5.put(DispatchConstants.LATITUDE, c);
                    hashMap5.put(DispatchConstants.LONGTITUDE, c2);
                }
            }
            long mtopTotalFeatures = MtopFeatureManager.getMtopTotalFeatures(mtop);
            if (mtopNetworkProp2.reqSource == 1) {
                mtopTotalFeatures |= MtopFeatureManager.getMtopFeatureValue(11);
            }
            if (mtopNetworkProp2.priorityFlag) {
                mtopTotalFeatures |= MtopFeatureManager.getMtopFeatureValue(12);
            }
            hashMap5.put(HttpHeaderConstant.X_FEATURES, String.valueOf(mtopTotalFeatures));
            if (mtopNetworkProp2.streamMode) {
                hashMap5.put(HttpHeaderConstant.X_ACCEPT_STREAM, Boolean.TRUE.toString());
            }
            if (!SwitchConfig.getInstance().getEnableExtDataAlignIos() || (SwitchConfig.getInstance().getUseSecurityAdapter() & 4) != 4) {
                setOldTopProtocolParams(mtop, mtopNetworkProp2, hashMap5);
            } else {
                ApiTypeEnum apiTypeEnum = mtopNetworkProp2.apiType;
                if (apiTypeEnum != null) {
                    hashMap5.put(HttpHeaderConstant.KEY_EXTTYPE, apiTypeEnum.getApiType());
                }
                if (mtopNetworkProp2.isInnerOpen) {
                    mtopNetworkProp2.accessToken = inx.d(StringUtils.concatStr(mtop.getInstanceId(), mtopNetworkProp2.openAppKey), "accessToken");
                }
                StringBuilder sb = new StringBuilder(64);
                if (StringUtils.isNotBlank(mtopNetworkProp2.openAppKey)) {
                    sb.append("openappkey=");
                    sb.append(mtopNetworkProp2.openAppKey);
                }
                if (StringUtils.isNotBlank(mtopNetworkProp2.accessToken)) {
                    sb.append(";accesstoken=");
                    sb.append(mtopNetworkProp2.accessToken);
                }
                hashMap5.put(HttpHeaderConstant.KEY_EXTDATA, sb.toString());
            }
            if (!TextUtils.isEmpty(mtopNetworkProp2.openBiz)) {
                hashMap5.put("open-biz", mtopNetworkProp2.openBiz);
                if (!TextUtils.isEmpty(mtopNetworkProp2.miniAppKey)) {
                    hashMap5.put("mini-appkey", mtopNetworkProp2.miniAppKey);
                }
                if (!TextUtils.isEmpty(mtopNetworkProp2.reqAppKey)) {
                    hashMap5.put("req-appkey", mtopNetworkProp2.requestSourceAppKey);
                }
                if (!TextUtils.isEmpty(mtopNetworkProp2.openBizData)) {
                    hashMap5.put("open-biz-data", mtopNetworkProp2.openBizData);
                }
                String d = inx.d(StringUtils.concatStr(mtop.getInstanceId(), mtopNetworkProp2.miniAppKey), "accessToken");
                mtopNetworkProp2.accessToken = d;
                if (!TextUtils.isEmpty(d)) {
                    hashMap5.put("accessToken", mtopNetworkProp2.accessToken);
                }
            }
            HashMap<String, String> hashMap6 = new HashMap<>();
            if (TextUtils.isEmpty(mtopNetworkProp2.pageUrl)) {
                obj = HttpHeaderConstant.KEY_EXTTYPE;
                str = "";
            } else {
                str = mtopNetworkProp2.pageUrl;
                obj = HttpHeaderConstant.KEY_EXTTYPE;
            }
            hashMap6.put(pl4.KEY_PAGE_ID, str);
            hashMap6.put("pageName", TextUtils.isEmpty(mtopNetworkProp2.pageName) ? "" : mtopNetworkProp2.pageName);
            String str13 = w4jVar.h;
            TBSdkLog.e(TAG, str13, "[buildParams]request sign start , apiKey=" + mtopRequest.getKey());
            FullTraceHelper.recordReqSignStart(w4jVar.g);
            if ((SwitchConfig.getInstance().getUseSecurityAdapter() & 4) == 4) {
                boolean z = mtopNetworkProp2.wuaFlag >= 0 || mtopNetworkProp2.wuaRetry;
                long currentTimeMillis = w4jVar.g.currentTimeMillis();
                String str14 = w4jVar.o.requestId;
                HashMap<String, String> hashMap7 = new HashMap<>();
                mtopNetworkProp = mtopNetworkProp2;
                FullTraceHelper.beginSection("mtop_sign", w4jVar.h);
                if (owp.c(w4jVar)) {
                    String uuid = UUID.randomUUID().toString();
                    str8 = HttpHeaderConstant.X_MINI_WUA;
                    hashMap7.put(HttpHeaderConstant.X_SIGN, uuid.replaceAll("-", ""));
                    hashMap5.put(HttpHeaderConstant.X_SIGN_CONTROL, "1");
                    w4jVar.g.isSignDegraded = true;
                    if (owp.a(this.mtopConfig.context, mtopRequest.getKey())) {
                        w4jVar.t = true;
                        w4jVar.g.cookieDisable = true;
                        String c3 = inx.c("SgCookie");
                        if (!TextUtils.isEmpty(c3)) {
                            String str15 = w4jVar.h;
                            hashMap4 = hashMap7;
                            TBSdkLog.e(TAG, str15, "[buildParams]add sgcookie header , apiKey=" + mtopRequest.getKey() + ", sgcookie=" + c3);
                            hashMap5.put(HttpHeaderConstant.X_SG_COOKIE, c3);
                            str4 = str10;
                            str3 = "pv";
                            str6 = "sign";
                            hashMap2 = hashMap6;
                            kqdVar = kqdVar2;
                            obj2 = HttpHeaderConstant.X_SIGN;
                            hashMap = hashMap5;
                            str9 = str11;
                            str7 = "";
                        }
                    }
                    hashMap4 = hashMap7;
                    str4 = str10;
                    str3 = "pv";
                    str6 = "sign";
                    hashMap2 = hashMap6;
                    kqdVar = kqdVar2;
                    obj2 = HttpHeaderConstant.X_SIGN;
                    hashMap = hashMap5;
                    str9 = str11;
                    str7 = "";
                } else {
                    str8 = HttpHeaderConstant.X_MINI_WUA;
                    hashMap5.put("mtopBusiness", String.valueOf(w4jVar.o instanceof MtopBusiness));
                    n9f n9fVar = (n9f) kqdVar2;
                    str6 = "sign";
                    kqdVar = kqdVar2;
                    obj2 = HttpHeaderConstant.X_SIGN;
                    str3 = "pv";
                    str9 = str11;
                    str7 = "";
                    hashMap2 = hashMap6;
                    str4 = str10;
                    hashMap = hashMap5;
                    hashMap4 = n9fVar.r(hashMap5, hashMap6, str10, str9, z, str14);
                    hashMap.remove("mtopBusiness");
                    MtopStatistics mtopStatistics2 = w4jVar.g;
                    mtopStatistics2.computeSignTime = mtopStatistics2.currentTimeMillis() - currentTimeMillis;
                }
                FullTraceHelper.endSection();
                if (hashMap4 != null) {
                    String str16 = hashMap4.get(obj2);
                    if (StringUtils.isBlank(str16)) {
                        String str17 = w4jVar.h;
                        TBSdkLog.e(TAG, str17, "[buildParams]get sign failed empty output , apiKey=" + mtopRequest.getKey() + ",authCode=" + str9);
                        return hashMap;
                    }
                    hashMap.put(str6, str16);
                    if (z) {
                        String str18 = hashMap4.get("wua");
                        hashMap.put("wua", str18);
                        if (StringUtils.isBlank(str18)) {
                            String str19 = w4jVar.h;
                            TBSdkLog.e(TAG, str19, "[buildParams]get wua failed empty output , apiKey=" + mtopRequest.getKey() + ",authCode=" + str9);
                        }
                    }
                    String str20 = hashMap4.get(str8);
                    hashMap.put(str8, str20);
                    if (StringUtils.isBlank(str20)) {
                        String str21 = w4jVar.h;
                        TBSdkLog.e(TAG, str21, "[buildParams]get mini wua failed empty output , apiKey=" + mtopRequest.getKey() + ",authCode=" + str9);
                    }
                    String str22 = hashMap4.get(HttpHeaderConstant.X_UMID_TOKEN);
                    hashMap.put("umt", str22);
                    if (StringUtils.isBlank(str22)) {
                        String str23 = w4jVar.h;
                        TBSdkLog.e(TAG, str23, "[buildParams]get umt failed empty output , apiKey=" + mtopRequest.getKey() + ",authCode=" + str9);
                    }
                    String str24 = hashMap4.get("x-sgext");
                    if (StringUtils.isNotBlank(str24)) {
                        hashMap.put("x-sgext", str24);
                    }
                    if (SwitchConfig.getInstance().isSecPipuHeaderEnable()) {
                        String str25 = hashMap4.get("x-pipu1");
                        if (StringUtils.isNotBlank(str25)) {
                            hashMap.put("x-pipu1", str25);
                        }
                    }
                    hashMap.put(str3, DispatchConstants.LATEST_VER_CODE_PROTOCOL);
                    innerProtocolParamBuilderImpl = this;
                    FullTraceHelper.recordReqSignFinish(w4jVar.g);
                    TBSdkLog.e(TAG, w4jVar.h, "[buildParams]request sign finish.");
                    innerProtocolParamBuilderImpl.buildExtParams(w4jVar, hashMap);
                    MtopStatistics mtopStatistics3 = w4jVar.g;
                    mtopStatistics3.buildParamsEndTime = mtopStatistics3.currentTimeMillis();
                    MtopStatistics mtopStatistics4 = w4jVar.g;
                    mtopStatistics4.buildParamsTime = mtopStatistics4.buildParamsEndTime - mtopStatistics4.buildParamsStartTime;
                    return hashMap;
                }
                str5 = str9;
                str2 = str8;
            } else {
                hashMap2 = hashMap6;
                str2 = HttpHeaderConstant.X_MINI_WUA;
                mtopNetworkProp = mtopNetworkProp2;
                str3 = "pv";
                str4 = str10;
                hashMap = hashMap5;
                str5 = str11;
                str6 = "sign";
                kqdVar = kqdVar2;
                str7 = "";
            }
            hashMap.remove(obj);
            hashMap.remove(HttpHeaderConstant.KEY_EXTDATA);
            innerProtocolParamBuilderImpl = this;
            innerProtocolParamBuilderImpl.setOldTopProtocolParams(mtop, mtopNetworkProp, hashMap);
            hashMap.put(str3, "6.2");
            long currentTimeMillis2 = w4jVar.g.currentTimeMillis();
            n9f n9fVar2 = (n9f) kqdVar;
            String o = n9fVar2.o(hashMap, str4, str5);
            MtopStatistics mtopStatistics5 = w4jVar.g;
            mtopStatistics5.computeSignTime = mtopStatistics5.currentTimeMillis() - currentTimeMillis2;
            if (StringUtils.isBlank(o)) {
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("apiKey=");
                sb2.append(mtopRequest.getKey());
                sb2.append(" call getMtopApiSign failed.[appKey=");
                sb2.append(str4);
                sb2.append(", authCode=");
                sb2.append(str5);
                sb2.append("]");
                TBSdkLog.e(TAG, w4jVar.h, sb2.toString());
                return hashMap;
            }
            hashMap.put(str6, o);
            if (mtopNetworkProp.wuaFlag >= 0 || mtopNetworkProp.wuaRetry) {
                long currentTimeMillis3 = w4jVar.g.currentTimeMillis();
                String s = (SwitchConfig.getInstance().getUseSecurityAdapter() & 1) == 1 ? n9fVar2.s(hashMap, str4) : str7;
                if (StringUtils.isBlank(s)) {
                    s = n9fVar2.k(o, str5, mtopNetworkProp.wuaFlag);
                }
                MtopStatistics mtopStatistics6 = w4jVar.g;
                mtopStatistics6.computeWuaTime = mtopStatistics6.currentTimeMillis() - currentTimeMillis3;
                if (!StringUtils.isBlank(s)) {
                    hashMap.put("wua", s);
                } else {
                    String str26 = w4jVar.h;
                    TBSdkLog.e(TAG, str26, mtopRequest.getKey() + " call getAvmpSign for wua fail.");
                }
            }
            long currentTimeMillis4 = w4jVar.g.currentTimeMillis();
            if ((SwitchConfig.getInstance().getUseSecurityAdapter() & 1) == 1) {
                hashMap3 = hashMap2;
                str7 = n9fVar2.n(hashMap, hashMap3);
            } else {
                hashMap3 = hashMap2;
            }
            if (StringUtils.isBlank(str7)) {
                str7 = n9fVar2.p(valueOf, str4, str5, hashMap3, 8);
            }
            MtopStatistics mtopStatistics7 = w4jVar.g;
            mtopStatistics7.computeMiniWuaTime = mtopStatistics7.currentTimeMillis() - currentTimeMillis4;
            hashMap.put(str2, str7);
            if (StringUtils.isBlank(str7)) {
                String str27 = w4jVar.h;
                TBSdkLog.e(TAG, str27, mtopRequest.getKey() + " call getSecurityBodyDataEx for mini_wua failed.");
            }
            FullTraceHelper.recordReqSignFinish(w4jVar.g);
            TBSdkLog.e(TAG, w4jVar.h, "[buildParams]request sign finish.");
            innerProtocolParamBuilderImpl.buildExtParams(w4jVar, hashMap);
            MtopStatistics mtopStatistics32 = w4jVar.g;
            mtopStatistics32.buildParamsEndTime = mtopStatistics32.currentTimeMillis();
            MtopStatistics mtopStatistics42 = w4jVar.g;
            mtopStatistics42.buildParamsTime = mtopStatistics42.buildParamsEndTime - mtopStatistics42.buildParamsStartTime;
            return hashMap;
        }
        TBSdkLog.e(TAG, w4jVar.h, "ISign of mtopConfig in mtopInstance is null");
        return null;
    }

    private void buildExtParams(w4j w4jVar, Map<String, String> map) {
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
        String str = this.mtopConfig.appVersion;
        if (StringUtils.isNotBlank(str)) {
            map.put(HttpHeaderConstant.X_APP_VER, str);
        }
        String str2 = this.mtopConfig.xOrangeQ;
        if (StringUtils.isNotBlank(str2)) {
            map.put(HttpHeaderConstant.X_ORANGE_Q, str2);
        }
        map.put(HttpHeaderConstant.X_APP_CONF_V, String.valueOf(this.mtopConfig.xAppConfigVersion));
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
                        TBSdkLog.w(TAG, "set wifi ssid error.", e);
                    }
                }
            }
            if ((2 & mtopNetworkProp.netParam) != 0) {
                String str4 = NetworkStateReceiver.d;
                if (!TextUtils.isEmpty(str4)) {
                    try {
                        jSONObject.put(NetParam.NetParamKey.BSSID, str4);
                    } catch (JSONException e2) {
                        TBSdkLog.w(TAG, "set wifi bssid error.", e2);
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
            String str7 = this.mtopConfig.mtopGlobalABTestParams.get(mtopNetworkProp.pageUrl);
            if (str7 != null) {
                map.put(HttpHeaderConstant.X_PAGE_MAB, str7);
            }
        }
    }
}
