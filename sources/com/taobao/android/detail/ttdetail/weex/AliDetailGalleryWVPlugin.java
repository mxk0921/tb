package com.taobao.android.detail.ttdetail.weex;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.trade.event.Event;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.fsw;
import tb.jwj;
import tb.kpw;
import tb.q84;
import tb.rc7;
import tb.rj8;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliDetailGalleryWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_PICGALLERY = "getPicGallery";
    private static final String ACTION_OPEN_SKU = "openSKU";
    private static final String KEY_COMPONENT_ID = "voName";
    public static final String KEY_PARAMS_ASYNC_BRIDGE_DATA = "asyncBridgeData";
    public static final String KEY_PARAMS_BRIDGE_DATA = "bridgeData";
    private static final String MODULE_NAME = "NewPicGalleryBridge";
    private static final String TAG = "AliDetailGalleryBridge";
    private static final Map<String, JSONObject> s_Params_Map = new ConcurrentHashMap();

    static {
        t2o.a(912262885);
    }

    private JSONObject getDataFromParams(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a1ed17e3", new Object[]{this, jSONObject, str});
        }
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public static /* synthetic */ Object ipc$super(AliDetailGalleryWVPlugin aliDetailGalleryWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/weex/AliDetailGalleryWVPlugin");
    }

    private boolean openSku() {
        Context context = getContext();
        if (!(context instanceof jwj) || !((jwj) context).g2()) {
            try {
                rj8.d(context, (Event) Class.forName("com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent").getConstructor(new Class[0]).newInstance(new Object[0]));
                return true;
            } catch (Throwable th) {
                tgh.c(TAG, "openSku error", th);
                return false;
            }
        } else {
            q84.f(context, new rc7("openSKU", new JSONObject(), new RuntimeAbilityParam[0]));
            return true;
        }
    }

    public static void registerComponentParams(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("279ffebf", new Object[]{str, jSONObject});
        } else if (str != null && jSONObject != null) {
            s_Params_Map.put(str, jSONObject);
        }
    }

    public static boolean registerCurrentModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4ab6ed", new Object[0])).booleanValue();
        }
        try {
            fsw.h(MODULE_NAME, AliDetailGalleryWVPlugin.class);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void removeComponentParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a3b0910", new Object[]{str});
        } else if (str != null) {
            s_Params_Map.remove(str);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("openSKU".equalsIgnoreCase(str)) {
            return openSku();
        }
        if (!ACTION_GET_PICGALLERY.equalsIgnoreCase(str) || wVCallBackContext == null) {
            return false;
        }
        return getPicGallery(str2, wVCallBackContext);
    }

    private boolean getPicGallery(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbd98430", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            String string = JSON.parseObject(str).getString(KEY_COMPONENT_ID);
            if (TextUtils.isEmpty(string)) {
                wVCallBackContext.error("voName is empty");
                return false;
            }
            JSONObject jSONObject = s_Params_Map.get(string);
            if (jSONObject == null) {
                wVCallBackContext.error("voName not put data");
                return false;
            }
            JSONObject dataFromParams = getDataFromParams(jSONObject, KEY_PARAMS_BRIDGE_DATA);
            if (dataFromParams == null) {
                wVCallBackContext.error("voNamecan not find bridgeData");
                return false;
            }
            JSONObject dataFromParams2 = getDataFromParams(jSONObject, KEY_PARAMS_ASYNC_BRIDGE_DATA);
            if (dataFromParams2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putAll(dataFromParams);
                jSONObject2.putAll(dataFromParams2);
                dataFromParams = jSONObject2;
            }
            wVCallBackContext.success(dataFromParams.toJSONString());
            return true;
        } catch (Throwable th) {
            tgh.c(TAG, "getPicGallery error:", th);
            wVCallBackContext.error("unknown exception");
            return false;
        }
    }
}
