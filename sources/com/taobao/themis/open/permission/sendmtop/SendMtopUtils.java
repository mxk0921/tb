package com.taobao.themis.open.permission.sendmtop;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.open.permission.auth.AuthUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.text.Regex;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.common.MtopNetworkProp;
import mtopsdk.mtop.domain.ApiTypeEnum;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopAccountSiteUtils;
import mtopsdk.mtop.intf.MtopUnitStrategy;
import tb.arf;
import tb.bbs;
import tb.ckf;
import tb.ct2;
import tb.i04;
import tb.ies;
import tb.inx;
import tb.pb1;
import tb.q9s;
import tb.qb1;
import tb.r8s;
import tb.t2o;
import tb.tsq;
import tb.uj3;
import tb.vbs;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class SendMtopUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SendMtopUtils INSTANCE = new SendMtopUtils();

    /* renamed from: a  reason: collision with root package name */
    public static final String f13680a = "SendMtopUtils";
    public static final String b = "AutoLoginOnly";
    public static final String c = "x-miniapp-id-taobao";
    public static final String d = HttpHeaderConstant.X_MINI_APPKEY;
    public static final String e = HttpHeaderConstant.X_REQ_APPKEY;
    public static final String f = HttpHeaderConstant.X_OPEN_BIZ_DATA;
    public static final String g = "appId";
    public static final String h = "invokerAppId";
    public static final String i = "x-miniapp-version";
    public static final String j = HttpHeaderConstant.X_PAGE_URL;
    public static final String k = "x-miniapp-env";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(SendMtopResponse sendMtopResponse);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(843055387);
            int[] iArr = new int[EnvModeEnum.values().length];
            iArr[EnvModeEnum.ONLINE.ordinal()] = 1;
            iArr[EnvModeEnum.PREPARE.ordinal()] = 2;
            iArr[EnvModeEnum.TEST.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ void a(SendMtopUtils sendMtopUtils, SendMtopParams sendMtopParams, SendMtopResponse sendMtopResponse, bbs bbsVar, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb2de0", new Object[]{sendMtopUtils, sendMtopParams, sendMtopResponse, bbsVar, new Long(j2)});
        } else {
            sendMtopUtils.k(sendMtopParams, sendMtopResponse, bbsVar, j2);
        }
    }

    public final MtopBusiness b(bbs bbsVar, SendMtopParams sendMtopParams) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("35632cd0", new Object[]{this, bbsVar, sendMtopParams});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(sendMtopParams.getApi());
        mtopRequest.setVersion(sendMtopParams.getV());
        mtopRequest.setNeedEcode(sendMtopParams.getForceLogin());
        mtopRequest.setNeedSession(sendMtopParams.getNeedLogin());
        mtopRequest.dataParams = sendMtopParams.getDataMap();
        mtopRequest.setData(JSON.toJSONString(sendMtopParams.getDataMap()));
        try {
            str = MtopAccountSiteUtils.getInstanceId(sendMtopParams.getAccountSite());
        } catch (Throwable th) {
            TMSLogger.g(f13680a, Log.getStackTraceString(th));
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(sendMtopParams.getAccountSite())) {
                return null;
            }
            str = Mtop.Id.INNER;
        }
        Mtop h2 = h(bbsVar, str);
        if (TextUtils.isEmpty(sendMtopParams.getAccountSite())) {
            String a2 = r8s.a(bbsVar);
            if (!TextUtils.isEmpty(a2)) {
                ckf.d(a2);
                sendMtopParams.setAccountSite(a2);
            }
        }
        if (!TextUtils.isEmpty(sendMtopParams.getAccountSite())) {
            String instanceId = MtopAccountSiteUtils.getInstanceId(sendMtopParams.getAccountSite());
            if (!TextUtils.isEmpty(instanceId)) {
                h2 = h(bbsVar, instanceId);
            }
        }
        String str2 = h2.getMtopConfig().ttid;
        if (!TextUtils.isEmpty(sendMtopParams.getTtid())) {
            str2 = sendMtopParams.getTtid();
        }
        MtopBusiness build = MtopBusiness.build(h2, mtopRequest, str2);
        c(bbsVar, build, sendMtopParams);
        if (build != null && sendMtopParams.getUseCache()) {
            build.useCache();
        }
        return build;
    }

    public final String e(SendMtopParams sendMtopParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7cdfda6", new Object[]{this, sendMtopParams, str});
        }
        int hashCode = str.hashCode();
        if (hashCode != 3261) {
            if (hashCode != 115029) {
                if (hashCode == 1554253136 && str.equals("application")) {
                    return sendMtopParams.getDataMap().get("path");
                }
            } else if (str.equals("top")) {
                return sendMtopParams.getDataMap().get("apiName");
            }
        } else if (str.equals("fc")) {
            return sendMtopParams.getDataMap().get("fcName");
        }
        return null;
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de469bb6", new Object[]{this, str});
        }
        int hashCode = str.hashCode();
        if (hashCode != -1985558130) {
            if (hashCode != -88243248) {
                if (hashCode == 1559440546 && str.equals("mtop.miniapp.cloud.invoke.top")) {
                    return "top";
                }
            } else if (str.equals("mtop.miniapp.cloud.invoke.fc")) {
                return "fc";
            }
        } else if (str.equals("mtop.miniapp.cloud.application.request")) {
            return "application";
        }
        return null;
    }

    public final String g(EnvModeEnum envModeEnum, Mtop mtop) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f00aaf7", new Object[]{this, envModeEnum, mtop});
        }
        if (envModeEnum == null) {
            i2 = -1;
        } else {
            i2 = b.$EnumSwitchMapping$0[envModeEnum.ordinal()];
        }
        if (i2 != 1) {
            if (i2 != 2) {
                return "";
            }
            return MtopUnitStrategy.GUIDE_PRE_DOMAIN;
        } else if (mtop == null || !ckf.b(MtopUnitStrategy.GUIDE_ONLINE_DOMAIN, mtop.getMtopConfig().mtopDomain.getDomain(envModeEnum))) {
            return "acs4miniapp-inner.m.taobao.com";
        } else {
            return "guide-acs4miniapp-inner.m.taobao.com";
        }
    }

    public final Mtop h(bbs bbsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("de73b20f", new Object[]{this, bbsVar, str});
        }
        Mtop instance = Mtop.instance(str, bbsVar.I().getApplicationContext());
        ckf.f(instance, "instance(instanceId, ins…ivity.applicationContext)");
        return instance;
    }

    public final String i(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("394709f", new Object[]{this, bbsVar});
        }
        String e0 = bbsVar.e0();
        ckf.f(e0, "instance.url");
        Uri.Builder buildUpon = Uri.parse("https://m.duanqu.com").buildUpon();
        String[] j2 = j();
        if (j2 != null) {
            Iterator a2 = qb1.a(j2);
            while (true) {
                pb1 pb1Var = (pb1) a2;
                if (!pb1Var.hasNext()) {
                    break;
                }
                String str = (String) pb1Var.next();
                if (buildUpon != null) {
                    buildUpon.appendQueryParameter(str, ies.c(e0, str));
                }
            }
        }
        String builder = buildUpon.toString();
        ckf.f(builder, "builder.toString()");
        return builder;
    }

    public final void k(SendMtopParams sendMtopParams, SendMtopResponse sendMtopResponse, bbs bbsVar, long j2) {
        String e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fe821c", new Object[]{this, sendMtopParams, sendMtopResponse, bbsVar, new Long(j2)});
            return;
        }
        double currentTimeMillis = System.currentTimeMillis() - j2;
        vbs.q(bbsVar, sendMtopParams.getApi(), sendMtopResponse.getSuccess(), currentTimeMillis, sendMtopResponse.getErrorCode(), sendMtopResponse.getErrorMsg());
        String f2 = f(sendMtopParams.getApi());
        if (f2 != null && (e2 = e(sendMtopParams, f2)) != null) {
            vbs.c(bbsVar, e2, f2, sendMtopResponse.getSuccess(), currentTimeMillis, sendMtopResponse.getErrorCode(), sendMtopResponse.getErrorMsg());
        }
    }

    @JvmStatic
    public static final Map<String, String> d(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5a617d90", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "instance");
        String j2 = r8s.j(bbsVar);
        String s = r8s.s(bbsVar);
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = null;
        String q = r8s.q(bbsVar, null, 1, null);
        String r = r8s.r(bbsVar);
        String str = g;
        hashMap.put(str, s);
        hashMap.put(c, s);
        hashMap.put(d, j2);
        String str2 = i;
        String i2 = r8s.i(bbsVar);
        if (i2 == null) {
            i2 = "";
        }
        hashMap.put(str2, i2);
        hashMap.put(j, INSTANCE.i(bbsVar));
        if (r8s.D(bbsVar)) {
            jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "templateVersion", r8s.y(bbsVar));
            jSONObject.put((JSONObject) RVStartParams.KEY_TEMPLATE_ID, q);
            jSONObject.put((JSONObject) "appKey", r);
        }
        hashMap.put(e, r);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) str, s);
        jSONObject2.put((JSONObject) h, q);
        jSONObject2.put((JSONObject) "viaFusionApp", (String) Boolean.TRUE);
        if (jSONObject != null) {
            jSONObject2.put((JSONObject) "templateConfig", (String) jSONObject);
        }
        String str3 = f;
        String jSONString = jSONObject2.toJSONString();
        ckf.f(jSONString, "bizDataObject.toJSONString()");
        hashMap.put(str3, jSONString);
        if (q9s.h1()) {
            String str4 = k;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put((JSONObject) "nbsn", (String) bbsVar.c0().getNBScene());
            jSONObject3.put((JSONObject) "nbsource", bbsVar.c0().getNBSource());
            String jSONString2 = jSONObject3.toJSONString();
            ckf.f(jSONString2, "JSONObject().apply {\n   …         }.toJSONString()");
            hashMap.put(str4, jSONString2);
        }
        return hashMap;
    }

    @JvmStatic
    public static final void l(final bbs bbsVar, final SendMtopParams sendMtopParams, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69037e", new Object[]{bbsVar, sendMtopParams, aVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        if (aVar != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            final SendMtopResponse sendMtopResponse = new SendMtopResponse();
            if (sendMtopParams == null || TextUtils.isEmpty(sendMtopParams.getApi())) {
                sendMtopResponse.setErrorMsg("2");
                sendMtopResponse.setErrorCode("invalid parameter!");
                aVar.a(sendMtopResponse);
                return;
            }
            SendMtopUtils sendMtopUtils = INSTANCE;
            MtopBusiness b2 = sendMtopUtils.b(bbsVar, sendMtopParams);
            if (b2 == null) {
                sendMtopResponse.setSuccess(false);
                sendMtopResponse.setErrorCode(ct2.COLOR_TAG_NOT_ZCACHE_RESOURCE);
                sendMtopResponse.setErrorMsg("不支持的账号实例");
                sendMtopUtils.k(sendMtopParams, sendMtopResponse, bbsVar, currentTimeMillis);
                aVar.a(sendMtopResponse);
                return;
            }
            b2.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.themis.open.permission.sendmtop.SendMtopUtils$requestAsync$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    } else {
                        onError(i2, mtopResponse, obj);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    } else if (mtopResponse == null) {
                        SendMtopResponse.this.setSuccess(false);
                        SendMtopResponse.this.setErrorCode("MTOP_RESPONSE_NULL");
                        SendMtopResponse.this.setErrorMsg("网络请求异常");
                        SendMtopUtils.a(SendMtopUtils.INSTANCE, sendMtopParams, SendMtopResponse.this, bbsVar, currentTimeMillis);
                        aVar.a(SendMtopResponse.this);
                    } else {
                        SendMtopResponse sendMtopResponse2 = SendMtopResponse.this;
                        String retCode = mtopResponse.getRetCode();
                        ckf.f(retCode, "response.retCode");
                        sendMtopResponse2.setErrorCode(retCode);
                        SendMtopResponse sendMtopResponse3 = SendMtopResponse.this;
                        String retMsg = mtopResponse.getRetMsg();
                        ckf.f(retMsg, "response.retMsg");
                        sendMtopResponse3.setErrorMsg(retMsg);
                        SendMtopResponse.this.setData(mtopResponse.getBytedata());
                        SendMtopResponse.this.setSuccess(mtopResponse.isApiSuccess());
                        SendMtopUtils.a(SendMtopUtils.INSTANCE, sendMtopParams, SendMtopResponse.this, bbsVar, currentTimeMillis);
                        aVar.a(SendMtopResponse.this);
                        AuthUtils authUtils = AuthUtils.INSTANCE;
                        bbs bbsVar2 = bbsVar;
                        String errorCode = SendMtopResponse.this.getErrorCode();
                        byte[] bytedata = mtopResponse.getBytedata();
                        ckf.f(bytedata, "response.bytedata");
                        authUtils.c(bbsVar2, errorCode, arf.i(new String(bytedata, uj3.UTF_8)));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse == null) {
                        SendMtopResponse.this.setSuccess(false);
                        SendMtopResponse.this.setErrorCode("MTOP_RESPONSE_NULL");
                        SendMtopResponse.this.setErrorMsg("网络请求异常");
                        SendMtopUtils.a(SendMtopUtils.INSTANCE, sendMtopParams, SendMtopResponse.this, bbsVar, currentTimeMillis);
                        aVar.a(SendMtopResponse.this);
                    } else {
                        SendMtopResponse sendMtopResponse2 = SendMtopResponse.this;
                        String retCode = mtopResponse.getRetCode();
                        ckf.f(retCode, "response.retCode");
                        sendMtopResponse2.setErrorCode(retCode);
                        SendMtopResponse sendMtopResponse3 = SendMtopResponse.this;
                        String retMsg = mtopResponse.getRetMsg();
                        ckf.f(retMsg, "response.retMsg");
                        sendMtopResponse3.setErrorMsg(retMsg);
                        SendMtopResponse.this.setData(mtopResponse.getBytedata());
                        SendMtopResponse.this.setSuccess(mtopResponse.isApiSuccess());
                        SendMtopResponse.this.setHeaders(mtopResponse.getHeaderFields());
                        SendMtopUtils.a(SendMtopUtils.INSTANCE, sendMtopParams, SendMtopResponse.this, bbsVar, currentTimeMillis);
                        aVar.a(SendMtopResponse.this);
                    }
                }
            });
            b2.startRequest();
        }
    }

    public final void c(bbs bbsVar, MtopBusiness mtopBusiness, SendMtopParams sendMtopParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe1bd39", new Object[]{this, bbsVar, mtopBusiness, sendMtopParams});
            return;
        }
        if (TextUtils.isEmpty(sendMtopParams.getAccountSite()) || tsq.x("taobao", sendMtopParams.getAccountSite(), true)) {
            mtopBusiness.setCustomDomain(g(EnvModeEnum.ONLINE, mtopBusiness.getMtopInstance()), g(EnvModeEnum.PREPARE, mtopBusiness.getMtopInstance()), g(EnvModeEnum.TEST, mtopBusiness.getMtopInstance()));
        }
        TMSLogger.a(f13680a, ckf.p(" userInfo:", mtopBusiness.mtopProp.userInfo));
        for (Map.Entry<String, String> entry : sendMtopParams.getParameterMap().entrySet()) {
            mtopBusiness.addHttpQueryParameter(entry.getKey(), entry.getValue());
        }
        if (!TextUtils.isEmpty(sendMtopParams.getMpHost())) {
            mtopBusiness.setCustomDomain(sendMtopParams.getMpHost());
        }
        String dataType = sendMtopParams.getDataType();
        if (!(dataType == null || dataType.length() == 0 || !(TextUtils.equals("json", sendMtopParams.getDataType()) || TextUtils.equals("originaljson", sendMtopParams.getDataType())))) {
            String upperCase = sendMtopParams.getDataType().toUpperCase();
            ckf.f(upperCase, "this as java.lang.String).toUpperCase()");
            mtopBusiness.setJsonType(JsonTypeEnum.valueOf(upperCase));
        }
        mtopBusiness.setBizId("60");
        if (sendMtopParams.getTimer() > 0) {
            mtopBusiness.setSocketTimeoutMilliSecond((int) sendMtopParams.getTimer());
            mtopBusiness.setConnectionTimeoutMilliSecond((int) sendMtopParams.getTimer());
        }
        mtopBusiness.showLoginUI(!ckf.b(b, sendMtopParams.getSessionOption()));
        if (sendMtopParams.getWuaFlag() > 0) {
            mtopBusiness.useWua();
        }
        String str = sendMtopParams.getHeaders().get(HttpHeaderConstant.X_MINI_APPKEY);
        mtopBusiness.setOpenBiz("mini-app");
        MethodEnum methodEnum = MethodEnum.GET;
        if (!TextUtils.equals(methodEnum.getMethod(), sendMtopParams.getMethod())) {
            methodEnum = MethodEnum.POST;
        }
        mtopBusiness.reqMethod(methodEnum);
        mtopBusiness.setMiniAppKey(str);
        mtopBusiness.setRequestSourceAppKey(sendMtopParams.getHeaders().get(e));
        mtopBusiness.setOpenBizData(sendMtopParams.getHeaders().get(f));
        mtopBusiness.headers(sendMtopParams.getHeaders());
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(sendMtopParams.getUserAgent())) {
            hashMap.put(HttpHeaderConstant.X_UA, CommonExtKt.i());
        } else {
            hashMap.put(HttpHeaderConstant.X_UA, sendMtopParams.getUserAgent());
        }
        mtopBusiness.headers((Map<String, String>) hashMap);
        mtopBusiness.setPageUrl(sendMtopParams.getHeaders().get(j));
        if (sendMtopParams.isAddISVHeader()) {
            MtopNetworkProp mtopNetworkProp = mtopBusiness.mtopProp;
            mtopNetworkProp.apiType = ApiTypeEnum.ISV_OPEN_API;
            mtopNetworkProp.isInnerOpen = true;
            if (!TextUtils.isEmpty(str)) {
                mtopBusiness.mtopProp.openAppKey = str;
            }
            mtopBusiness.mtopProp.accessToken = "";
        }
        String concatStr = StringUtils.concatStr(mtopBusiness.getMtopInstance().getInstanceId(), str);
        AuthUtils authUtils = AuthUtils.INSTANCE;
        if (authUtils.n(bbsVar) != null) {
            inx.m(concatStr, "accessToken", authUtils.n(bbsVar));
        } else {
            inx.j(concatStr, "accessToken");
        }
    }

    public final String[] j() {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3ca1e86f", new Object[]{this});
        }
        try {
            if (!TextUtils.isEmpty("sellerId,shopId,_ariver_appid")) {
                List<String> split = new Regex(",").split("sellerId,shopId,_ariver_appid", 0);
                if (!split.isEmpty()) {
                    ListIterator<String> listIterator = split.listIterator(split.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            list = i04.v0(split, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = yz3.i();
                Object[] array = list.toArray(new String[0]);
                if (array != null) {
                    return (String[]) array;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    static {
        t2o.a(843055385);
    }
}
