package com.taobao.themis.ability.basic;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingRequest;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.a1v;
import tb.gbs;
import tb.j8s;
import tb.p8s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSUserTrackerBridge implements j8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(830472201);
        t2o.a(839909427);
    }

    public final JSONObject c(Map<String, Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eda75669", new Object[]{this, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map == null) {
            return jSONObject;
        }
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj != null) {
                str = obj.toString();
            } else {
                str = "";
            }
            jSONObject.put(str2, (Object) str);
        }
        return jSONObject;
    }

    public final HashMap<String, String> d(Map<String, Object> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b6e9653f", new Object[]{this, map});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj != null) {
                str = obj.toString();
            } else {
                str = "";
            }
            hashMap.put(str2, str);
        }
        return hashMap;
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

    public final void b(ITMSPage iTMSPage, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b03beb7", new Object[]{this, iTMSPage, jSONObject, bridgeCallback});
            return;
        }
        String d = gbs.d(jSONObject, "type");
        String d2 = gbs.d(jSONObject, "subType");
        Map<String, Object> f = gbs.f(gbs.c(jSONObject, AgooConstants.MESSAGE_EXT, new JSONObject()), new HashMap());
        if ("behavior".equals(d)) {
            if (a(iTMSPage, d2, f) && bridgeCallback != null) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        } else if (bridgeCallback != null) {
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "type invalid"));
        }
    }

    @ThreadType(ExecutorType.NORMAL)
    @APIMethod
    public void handleLoggingAction(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c937fd", new Object[]{this, apiContext, jSONObject, bridgeCallback});
            return;
        }
        TMSLogger.a("TMSUserTracker", "handleLoggingAction invoke params : " + jSONObject);
        if (jSONObject == null || jSONObject.isEmpty()) {
            TMSLogger.g("TMSUserTracker", "invalid params " + jSONObject);
            if (bridgeCallback != null) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(2, "params is null"));
            }
        }
        b(apiContext.c(), jSONObject, bridgeCallback);
    }

    public final boolean a(ITMSPage iTMSPage, String str, Map<String, Object> map) {
        Activity I;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("236f96b0", new Object[]{this, iTMSPage, str, map})).booleanValue();
        }
        if (iTMSPage == null || (I = iTMSPage.getInstance().I()) == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if ("updatePageName".equals(str)) {
            ((IUserTrackerAdapter) p8s.g(IUserTrackerAdapter.class)).updatePageName(I, map.get("pageName").toString());
            return true;
        } else if (a1v.UPDATE_PAGEURL.equals(str)) {
            ((IUserTrackerAdapter) p8s.g(IUserTrackerAdapter.class)).updatePageUrl(I, map.get("pageUrl").toString());
            return true;
        } else if (a1v.UPDATE_PAGE_PROPERTIES.equals(str)) {
            ((IUserTrackerAdapter) p8s.g(IUserTrackerAdapter.class)).updatePageProperties(I, d(map));
            return true;
        } else if (a1v.UPDATE_NEXT_PAGE_PROPERTIES.equals(str)) {
            ((IUserTrackerAdapter) p8s.g(IUserTrackerAdapter.class)).updateNextPageProperties(d(map));
            return true;
        } else if (a1v.UPDATE_PAGE_UTPARAM.equals(str)) {
            ((IUserTrackerAdapter) p8s.g(IUserTrackerAdapter.class)).updatePageUtParam(I, c(map));
            return true;
        } else if ("updateNextPageUtparam".equals(str)) {
            ((IUserTrackerAdapter) p8s.g(IUserTrackerAdapter.class)).updateNextPageUtParam(c(map));
            return true;
        } else if (!a1v.CUSTOM_ADVANCE.equals(str)) {
            return false;
        } else {
            String str2 = (String) map.get("eventId");
            String str3 = (String) map.get("pageName");
            String str4 = (String) map.get("arg1");
            String str5 = (String) map.get("arg2");
            String str6 = (String) map.get("arg3");
            Map<String, String> f = gbs.f((JSONObject) map.get("args"), new HashMap());
            if (iTMSPage.getInstance() != null) {
                try {
                    String L = iTMSPage.getInstance().L();
                    if (TextUtils.isEmpty(L)) {
                        f.put("miniapp_id", L);
                    }
                } catch (Exception e) {
                    TMSLogger.b("CUSTOM_ADVANCE add common args error", e.getMessage());
                }
            }
            ((IUserTrackerAdapter) p8s.g(IUserTrackerAdapter.class)).customAdvance(str2, str3, str4, str5, str6, f);
            return true;
        }
    }
}
