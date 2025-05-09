package com.taobao.themis.ability.basic;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.AutoCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.bbs;
import tb.gbs;
import tb.ies;
import tb.j8s;
import tb.p8s;
import tb.q9s;
import tb.t2o;
import tb.xds;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSNavigatorBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(830472198);
        t2o.a(839909427);
    }

    public static Uri a(Context context, bbs bbsVar, String str, String str2, JSONObject jSONObject, String str3) {
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("254c5d0d", new Object[]{context, bbsVar, str, str2, jSONObject, str3});
        }
        if (bbsVar == null || context == null) {
            return null;
        }
        Uri.Builder appendQueryParameter = ies.g("https://m.duanqu.com").buildUpon().appendQueryParameter("_ariver_appid", str).appendQueryParameter("page", str2);
        if (jSONObject != null && !jSONObject.isEmpty()) {
            String string = jSONObject.getString("envVersion");
            if (!TextUtils.isEmpty(string) && !bbsVar.c0().isMiniAppDebug()) {
                if ("develop".equals(string)) {
                    str4 = "DEBUG";
                } else if ("trial".equals(string)) {
                    str4 = "TRIAL";
                } else if ("examine".equals(string)) {
                    str4 = "REVIEW";
                } else {
                    str4 = "ONLINE";
                }
                if ("ONLINE".equals(str4)) {
                    str5 = "online";
                } else {
                    str5 = "debug";
                }
                String string2 = jSONObject.getString("version");
                appendQueryParameter.appendQueryParameter("nbsn", str4);
                appendQueryParameter.appendQueryParameter("nbsource", str5);
                appendQueryParameter.appendQueryParameter("nbsv", string2);
            }
        }
        try {
            StringBuilder sb = new StringBuilder();
            if (str3 != null) {
                sb.append(URLDecoder.decode(str3));
            }
            JSONObject c = c(jSONObject);
            if (c != null) {
                for (Map.Entry<String, Object> entry : c.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && (entry.getValue() instanceof String)) {
                        if (sb.length() != 0) {
                            sb.append("&");
                        }
                        sb.append(entry.getKey());
                        sb.append("=");
                        sb.append(entry.getValue());
                    }
                }
            }
            if (sb.length() != 0) {
                appendQueryParameter.appendQueryParameter("query", sb.toString());
            }
        } catch (Throwable th) {
            TMSLogger.b("query parse error occurred, msg: " + th.getMessage(), th.getLocalizedMessage());
        }
        return appendQueryParameter.build();
    }

    public static JSONObject c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a93e3fc5", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("param")) == null || (jSONObject3 = jSONObject2.getJSONObject("referrerInfo")) == null) {
            return null;
        }
        return jSONObject3.getJSONObject("extraData");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.alibaba.fastjson.JSONObject r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.ability.basic.TMSNavigatorBridge.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "82ebf23a"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            r4.d(r5)
            java.lang.String r0 = "param"
            com.alibaba.fastjson.JSONObject r5 = r5.getJSONObject(r0)
            if (r5 != 0) goto L_0x0022
            return
        L_0x0022:
            java.lang.String r0 = "referrerInfo"
            java.lang.String r1 = r5.getString(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0030
            return
        L_0x0030:
            com.alibaba.fastjson.JSONObject r1 = com.alibaba.fastjson.JSON.parseObject(r1)     // Catch: Exception -> 0x003a
            r4.d(r1)     // Catch: Exception -> 0x0038
            goto L_0x003f
        L_0x0038:
            r2 = move-exception
            goto L_0x003c
        L_0x003a:
            r2 = move-exception
            r1 = 0
        L_0x003c:
            r2.printStackTrace()
        L_0x003f:
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = r1.toJSONString()
            r5.put(r0, r1)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.ability.basic.TMSNavigatorBridge.b(com.alibaba.fastjson.JSONObject):void");
    }

    public final void d(JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("783074a6", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.containsKey("extraData") && (obj = jSONObject.get("extraData")) != null && obj.toString().length() > 100) {
            jSONObject.remove("extraData");
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void exit(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f2881a", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            apiContext.a().finish();
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void exitApp(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59caf635", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            apiContext.a().finish();
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void exitTinyApp(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528d1e55", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            apiContext.a().finish();
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void navigateToHomePage(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40db1ebe", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (apiContext.b() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        } else {
            apiContext.b().W().b(0);
        }
    }

    @ThreadType(ExecutorType.UI)
    @AutoCallback
    @APIMethod
    public BridgeResponse navigateToMiniProgram(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingParam({"appId"}) String str, @BindingParam({"path"}) String str2, @BindingParam({"query"}) String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BridgeResponse) ipChange.ipc$dispatch("195c8a59", new Object[]{this, apiContext, jSONObject, str, str2, str3});
        }
        if (apiContext == null || apiContext.a() == null || apiContext.b() == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        bbs b = apiContext.b();
        b(jSONObject);
        Uri a2 = a(apiContext.a(), b, str, str2, jSONObject, str3);
        if (a2 == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        ((INavigatorAdapter) p8s.g(INavigatorAdapter.class)).openURL(apiContext.a(), a2.toString(), null, null, null);
        return BridgeResponse.SUCCESS;
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

    @ThreadType(ExecutorType.SYNC)
    @APIMethod
    public void originalRouteUrl(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862c6381", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (apiContext.b() instanceof bbs) {
            String e0 = apiContext.b().e0();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) e0);
            bridgeCallback.sendJSONResponse(jSONObject);
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void pop(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c880c7", new Object[]{this, apiContext, bridgeCallback});
        } else if (apiContext == null || apiContext.a() == null || apiContext.b() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            apiContext.b().W().f(false);
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void navigateToOutside(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam({"url"}) String str, @BindingParam({"params"}) JSONObject jSONObject) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a61f027", new Object[]{this, apiContext, bridgeCallback, str, jSONObject});
        } else if (apiContext == null || apiContext.a() == null || TextUtils.isEmpty(str)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            if (q9s.k1()) {
                Uri g = ies.g(str);
                if (apiContext.b() != null) {
                    g = xds.a(g, apiContext.b());
                }
                String uri = g.toString();
                HashMap hashMap = new HashMap();
                hashMap.put("url", uri);
                hashMap.put("miniapp_id", apiContext.b().L());
                hashMap.put("spm_ori", apiContext.b().b0());
                hashMap.put("logkey", "/mapp.guide.pdp");
                ((IUserTrackerAdapter) p8s.g(IUserTrackerAdapter.class)).customAdvance("2101", "TRVTbApiPage", "TRVnavigateToOutside", null, null, hashMap);
                str2 = uri;
            } else {
                str2 = str;
            }
            ((INavigatorAdapter) p8s.g(INavigatorAdapter.class)).openURL(apiContext.a(), str2, jSONObject != null ? gbs.l(jSONObject) : null, null, null);
            bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public void push(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam({"url"}) String str, @BindingParam({"type"}) String str2, @BindingParam({"windowInfo"}) JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aefc37e", new Object[]{this, apiContext, bridgeCallback, str, str2, jSONObject});
        } else if (apiContext == null || apiContext.a() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            bbs b = apiContext.b();
            if (b == null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            } else if (b.a0() == TMSSolutionType.UNIAPP) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "params invalid"));
            } else {
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
                if (!q9s.F1()) {
                    ((INavigatorAdapter) p8s.g(INavigatorAdapter.class)).openURL(apiContext.a(), str, null, null, null);
                    return;
                }
                Window b2 = jSONObject != null ? new Window.a().b(jSONObject, TMSMetaInfoWrapper.Type.AppInfo) : null;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("mixRenderType", (Object) str2);
                if (jSONObject == null) {
                    z = false;
                }
                jSONObject2.put("pushWindowInfoNotNull", (Object) Boolean.valueOf(z));
                b.W().a(b.V().a(str, b2, jSONObject2, null));
            }
        }
    }
}
