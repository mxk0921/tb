package com.taobao.themis.widget;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.WidgetStartParams;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.vivo.push.BuildConfig;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import tb.bbs;
import tb.cfs;
import tb.ckf;
import tb.ddx;
import tb.eas;
import tb.f7l;
import tb.ies;
import tb.j8s;
import tb.p8s;
import tb.t2o;
import tb.wde;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0014J%\u0010\u0017\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u000bJ\u0019\u0010\u001a\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u000bJ%\u0010\u001d\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/taobao/themis/widget/TMSWidgetBridge;", "Ltb/j8s;", "<init>", "()V", "Ltb/xhv;", "onInitialized", "onFinalized", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "apiContext", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "getSceneInfo", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "", "errorCode", "errorMsg", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "bridgeCallback", "widgetDowngrade", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "getInitData", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;)V", "getBizData", "gestureMode", "setGestureMode", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Ljava/lang/String;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "getRelationAppId", "getRelationAppInfo", "Lcom/alibaba/fastjson/JSONObject;", "extraData", "navigateToRelationMiniProgram", "(Lcom/taobao/themis/kernel/ability/base/ApiContext;Lcom/alibaba/fastjson/JSONObject;)Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeResponse;", "themis_widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWidgetBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(852492295);
        t2o.a(839909427);
    }

    public final Uri a(bbs bbsVar) {
        IUserTrackerAdapter iUserTrackerAdapter;
        String spmOri;
        String realSpmUrl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("a900a867", new Object[]{this, bbsVar});
        }
        StartParams startParams = (StartParams) bbsVar.g(StartParams.class);
        WidgetStartParams widgetStartParams = null;
        if (startParams == null || !(startParams instanceof WidgetStartParams)) {
            startParams = null;
        }
        WidgetStartParams widgetStartParams2 = (WidgetStartParams) startParams;
        String relationUrl = widgetStartParams2 == null ? null : widgetStartParams2.getRelationUrl();
        if (relationUrl == null) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(relationUrl).buildUpon();
        HashMap hashMap = new HashMap();
        StartParams startParams2 = (StartParams) bbsVar.g(StartParams.class);
        if (startParams2 == null || !(startParams2 instanceof WidgetStartParams)) {
            startParams2 = null;
        }
        WidgetStartParams widgetStartParams3 = (WidgetStartParams) startParams2;
        if (!(widgetStartParams3 == null || (realSpmUrl = widgetStartParams3.getRealSpmUrl()) == null)) {
            hashMap.put("spm-url", realSpmUrl);
            buildUpon.appendQueryParameter("spm_ori", realSpmUrl);
        }
        StartParams startParams3 = (StartParams) bbsVar.g(StartParams.class);
        if (startParams3 != null && (startParams3 instanceof WidgetStartParams)) {
            widgetStartParams = startParams3;
        }
        WidgetStartParams widgetStartParams4 = widgetStartParams;
        if (!(widgetStartParams4 == null || (spmOri = widgetStartParams4.getSpmOri()) == null)) {
            hashMap.put("spm_ori", spmOri);
            buildUpon.appendQueryParameter("widget_ori", spmOri);
        }
        if (!hashMap.isEmpty() && (iUserTrackerAdapter = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class)) != null) {
            iUserTrackerAdapter.updateNextPageProperties(a.r(hashMap));
        }
        return buildUpon.build();
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public final void getInitData(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b77ae28", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b = apiContext.b();
        if (b == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        StartParams startParams = (StartParams) b.g(StartParams.class);
        String str = null;
        if (startParams == null || !(startParams instanceof WidgetStartParams)) {
            startParams = null;
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
        if (widgetStartParams != null) {
            str = widgetStartParams.getInitData();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "initData", (String) JSON.parseObject(str));
            bridgeCallback.sendJSONResponse(jSONObject);
        } catch (Throwable th) {
            TMSLogger.c("TMSWidgetBridge", "getInitData fail", th);
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(10, "InitData is null or format exception"));
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse getRelationAppId(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("ee3c703e", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        bbs b = apiContext.b();
        if (b == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        StartParams startParams = (StartParams) b.g(StartParams.class);
        String str = null;
        if (startParams == null || !(startParams instanceof WidgetStartParams)) {
            startParams = null;
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
        if (widgetStartParams != null) {
            str = widgetStartParams.getRelationUrl();
        }
        if (str == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("_ariver_appid");
        if (queryParameter == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse3, "FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "relationAppId", queryParameter);
        return new BridgeResponse(jSONObject);
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse getSceneInfo(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("80d65518", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        bbs b = apiContext.b();
        if (b == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        StartParams startParams = (StartParams) b.g(StartParams.class);
        JSONObject jSONObject = null;
        if (startParams == null || !(startParams instanceof WidgetStartParams)) {
            startParams = null;
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
        if (widgetStartParams != null) {
            jSONObject = widgetStartParams.getSceneParamObject();
        }
        if (jSONObject == null) {
            return new BridgeResponse.Error(10, "sceneInfo format exception");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "sceneInfo", (String) jSONObject);
        return new BridgeResponse(jSONObject2);
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public final BridgeResponse navigateToRelationMiniProgram(@BindingApiContext ApiContext apiContext, @BindingParam({"extraData"}) JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("1a595157", new Object[]{this, apiContext, jSONObject});
        }
        ckf.g(apiContext, "apiContext");
        bbs b = apiContext.b();
        if (b == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        ddx.INSTANCE.a(b);
        Uri a2 = a(b);
        if (a2 == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject2.put((JSONObject) "extraData", (String) jSONObject);
        bbs b2 = apiContext.b();
        ckf.d(b2);
        jSONObject2.put((JSONObject) "appId", b2.L());
        xhv xhvVar = xhv.INSTANCE;
        bundle.putString("referrerInfo", jSONObject2.toJSONString());
        INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) p8s.b(INavigatorAdapter.class);
        if (iNavigatorAdapter != null) {
            Activity a3 = apiContext.a();
            ckf.f(a3, "apiContext.activity");
            String uri = a2.toString();
            ckf.f(uri, "uri.toString()");
            INavigatorAdapter.b.a(iNavigatorAdapter, a3, uri, bundle, null, null, 16, null);
        }
        BridgeResponse bridgeResponse3 = BridgeResponse.SUCCESS;
        ckf.f(bridgeResponse3, "SUCCESS");
        return bridgeResponse3;
    }

    @Override // tb.j8s
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // tb.j8s
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse setGestureMode(@BindingApiContext ApiContext apiContext, @BindingParam({"gestureMode"}) String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("24c71708", new Object[]{this, apiContext, str});
        }
        ckf.g(apiContext, "apiContext");
        bbs b = apiContext.b();
        if (b == null || !TMSInstanceExtKt.u(b)) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        } else if (str == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.INVALID_PARAM;
            ckf.f(bridgeResponse2, "INVALID_PARAM");
            return bridgeResponse2;
        } else {
            cfs.c(b, str);
            BridgeResponse bridgeResponse3 = BridgeResponse.SUCCESS;
            ckf.f(bridgeResponse3, "SUCCESS");
            return bridgeResponse3;
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void widgetDowngrade(@BindingApiContext ApiContext apiContext, @BindingParam({"errorCode"}) String str, @BindingParam({"errorMsg"}) String str2, @BindingCallback BridgeCallback bridgeCallback) {
        wde wdeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9db8773", new Object[]{this, apiContext, str, str2, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(str, "errorCode");
        ckf.g(str2, "errorMsg");
        ckf.g(bridgeCallback, "bridgeCallback");
        ITMSPage c = apiContext.c();
        if (!(c == null || (wdeVar = (wde) c.getExtension(wde.class)) == null)) {
            eas easVar = eas.i;
            String str3 = easVar.f18428a;
            ckf.f(str3, "TMS_ERR_WIDGET_DOWNGRADE.errorCode");
            String str4 = easVar.b;
            ckf.f(str4, "TMS_ERR_WIDGET_DOWNGRADE.errorMsg");
            wdeVar.b(str3, str4);
        }
        JSONObject jSONObject = new JSONObject();
        eas easVar2 = eas.i;
        jSONObject.put((JSONObject) "errorCode", easVar2.f18428a);
        jSONObject.put((JSONObject) "errorMessage", easVar2.b);
        jSONObject.put((JSONObject) "bizErrorCode", str);
        jSONObject.put((JSONObject) "bizErrorMessage", str2);
        bridgeCallback.sendJSONResponse(jSONObject);
    }

    @ThreadType(ExecutorType.NETWORK)
    @APIMethod
    public final void getBizData(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IMtopInnerAdapter.Response response;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ae61b1", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        ckf.g(apiContext, "apiContext");
        ckf.g(bridgeCallback, "bridgeCallback");
        bbs b = apiContext.b();
        if (b == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            return;
        }
        StartParams startParams = (StartParams) b.g(StartParams.class);
        String str = null;
        if (startParams == null || !(startParams instanceof WidgetStartParams)) {
            startParams = null;
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
        String sceneParamValue = widgetStartParams == null ? null : widgetStartParams.getSceneParamValue("schemaDataId");
        StartParams startParams2 = (StartParams) b.g(StartParams.class);
        if (startParams2 == null || !(startParams2 instanceof WidgetStartParams)) {
            startParams2 = null;
        }
        WidgetStartParams widgetStartParams2 = (WidgetStartParams) startParams2;
        String sceneParamValue2 = widgetStartParams2 == null ? null : widgetStartParams2.getSceneParamValue("sellerId");
        if (sceneParamValue == null || sceneParamValue2 == null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "sellerId or schemaDataId empty"));
            return;
        }
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) p8s.b(IMtopInnerAdapter.class);
        if (iMtopInnerAdapter == null) {
            response = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "schemaDataId", sceneParamValue);
            jSONObject2.put((JSONObject) "sellerId", sceneParamValue2);
            jSONArray.add(jSONObject2);
            xhv xhvVar = xhv.INSTANCE;
            jSONObject.put((JSONObject) "queries", jSONArray.toJSONString());
            response = IMtopInnerAdapter.a.b(iMtopInnerAdapter, "mtop.com.taobao.miniapp.schema.data.runtime.get", "1.0", jSONObject, null, false, null, null, null, null, BuildConfig.VERSION_CODE, null);
        }
        if (response != null && response.getSuccess()) {
            JSONObject data = response.getData();
            if ((data == null ? null : data.getJSONObject("data")) != null) {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject data2 = response.getData();
                ckf.d(data2);
                jSONObject3.put((JSONObject) "bizData", (String) data2.getJSONObject("data"));
                bridgeCallback.sendJSONResponse(jSONObject3);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) (response == null ? null : response.getErrorCode()));
        sb.append(f7l.CONDITION_IF_MIDDLE);
        if (response != null) {
            str = response.getErrorMsg();
        }
        sb.append((Object) str);
        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(12, sb.toString()));
    }

    @ThreadType(ExecutorType.NORMAL)
    @AutoCallback
    @APIMethod
    public final BridgeResponse getRelationAppInfo(@BindingApiContext ApiContext apiContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("becacc91", new Object[]{this, apiContext});
        }
        ckf.g(apiContext, "apiContext");
        bbs b = apiContext.b();
        if (b == null) {
            BridgeResponse bridgeResponse = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse, "FORBIDDEN_ERROR");
            return bridgeResponse;
        }
        StartParams startParams = (StartParams) b.g(StartParams.class);
        String str = null;
        if (startParams == null || !(startParams instanceof WidgetStartParams)) {
            startParams = null;
        }
        WidgetStartParams widgetStartParams = (WidgetStartParams) startParams;
        if (widgetStartParams != null) {
            str = widgetStartParams.getRelationUrl();
        }
        if (str == null) {
            BridgeResponse bridgeResponse2 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse2, "FORBIDDEN_ERROR");
            return bridgeResponse2;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("_ariver_appid");
        if (queryParameter == null) {
            BridgeResponse bridgeResponse3 = BridgeResponse.FORBIDDEN_ERROR;
            ckf.f(bridgeResponse3, "FORBIDDEN_ERROR");
            return bridgeResponse3;
        }
        HashMap hashMap = new HashMap();
        String c = ies.c(str, "query");
        if (!TextUtils.isEmpty(c)) {
            String decode = URLDecoder.decode(c);
            List<String> z0 = wsq.z0(decode, new String[]{"&"}, false, 0, 6, null);
            if (z0.size() > 1) {
                for (String str2 : z0) {
                    List z02 = wsq.z0(str2, new String[]{"="}, false, 0, 6, null);
                    if (z02.size() >= 2) {
                        hashMap.put(z02.get(0), z02.get(1));
                    }
                }
            } else {
                List z03 = wsq.z0(decode, new String[]{"="}, false, 0, 6, null);
                if (z03.size() >= 2) {
                    hashMap.put(z03.get(0), z03.get(1));
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "relationAppId", queryParameter);
        jSONObject.put((JSONObject) "query", (String) hashMap);
        return new BridgeResponse(jSONObject);
    }
}
