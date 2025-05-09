package com.taobao.android.sku.weex;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.HashMap;
import java.util.Map;
import tb.o6x;
import tb.pvh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuPreloadModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "Sku_Weex_Preload";
    private static boolean sHasRegistered = false;
    private static final Map<String, Boolean> sPreloadReadyMap = new HashMap();

    static {
        t2o.a(442499283);
    }

    public SkuPreloadModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static int cacheSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae85ed9d", new Object[0])).intValue();
        }
        return sPreloadReadyMap.size();
    }

    public static void clearPreloadInstanceStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dbf0a0a", new Object[0]);
        } else {
            sPreloadReadyMap.clear();
        }
    }

    public static /* synthetic */ Object ipc$super(SkuPreloadModule skuPreloadModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/weex/SkuPreloadModule");
    }

    public static boolean isInstanceReady(String str) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6252099", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (bool = sPreloadReadyMap.get(str)) != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public static void registerModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7a6ff6", new Object[0]);
        } else if (!sHasRegistered) {
            MUSEngine.registerModule(MODULE_NAME, SkuPreloadModule.class);
            sHasRegistered = true;
        }
    }

    @MUSMethod
    public void notifyReadyStatus(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b91b5cef", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        SkuLogUtils.l(MODULE_NAME, "notifyMessage" + jSONObject);
        String d = o6x.d(jSONObject.getString("url"), jSONObject.getString("_sku_token_"));
        boolean parseBoolean = Boolean.parseBoolean(jSONObject.getString("success"));
        if (!TextUtils.isEmpty(d)) {
            sPreloadReadyMap.put(d, Boolean.valueOf(parseBoolean));
        }
        if (!parseBoolean) {
            o6x.a();
        }
        if (pvhVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", (Object) "true");
            pvhVar.b(jSONObject2);
        }
    }
}
