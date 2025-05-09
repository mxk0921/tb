package com.alibaba.triver.triver_shop.wxmodule;

import android.os.Bundle;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.utils.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.Destroyable;
import com.taobao.weex.common.WXModule;
import java.io.Serializable;
import tb.n61;
import tb.sk2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WXAriverShopModule extends WXModule implements Destroyable, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766510502);
        t2o.a(985661561);
    }

    public static /* synthetic */ Object ipc$super(WXAriverShopModule wXAriverShopModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/wxmodule/WXAriverShopModule");
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @JSMethod
    public void openBrandZone(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e817b3ce", new Object[]{this, str, jSCallback});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
            if (!(wXSDKInstance == null || wXSDKInstance.getContext() == null)) {
                JSONObject parseObject = JSON.parseObject(str);
                String string = parseObject.getString("appId");
                String string2 = parseObject.getString("path");
                String string3 = parseObject.getString("transition");
                String string4 = parseObject.getString(RVStartParams.KEY_SUPER_SPLASH);
                if (sk2.i(this.mWXSDKInstance.getContext(), string, string2, parseObject.getString("query"), string3, parseObject.getJSONObject("loadingParams"), string4, parseObject.getString("extQuery"), (Bundle) null)) {
                    jSONObject.put("success", (Object) Boolean.TRUE);
                } else {
                    jSONObject.put("success", (Object) Boolean.FALSE);
                }
                jSCallback.invoke(jSONObject);
                return;
            }
            jSONObject.put("success", (Object) Boolean.FALSE);
            jSCallback.invoke(jSONObject);
        } catch (Throwable unused) {
            jSONObject.put("success", (Object) Boolean.FALSE);
            jSCallback.invoke(jSONObject);
        }
    }

    @JSMethod
    public void preloadBrandZone(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff958fcd", new Object[]{this, str, jSCallback});
            return;
        }
        RVLogger.e("Triver::AppManager", "preloadBrandZone and subprocess");
        JSONObject jSONObject = new JSONObject();
        try {
            WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
            if (!(wXSDKInstance == null || wXSDKInstance.getContext() == null)) {
                if (CommonUtils.s()) {
                    jSONObject.put("success", (Object) Boolean.FALSE);
                    jSCallback.invoke(jSONObject);
                    return;
                }
                JSONObject jSONObject2 = JSON.parseObject(str).getJSONObject("loadingParams");
                if (jSONObject2 == null || jSONObject2.isEmpty()) {
                    jSONObject.put("success", (Object) Boolean.FALSE);
                } else {
                    String string = jSONObject2.getString("loadingImage");
                    String string2 = jSONObject2.getString("loadingLogo");
                    Bundle bundle = new Bundle();
                    bundle.putString("loadingImage", string);
                    bundle.putString("loadingLogo", string2);
                    n61.Q().i0(this.mWXSDKInstance.getContext(), bundle);
                    jSONObject.put("success", (Object) Boolean.TRUE);
                }
                jSONObject.put("success", (Object) Boolean.TRUE);
                jSCallback.invoke(jSONObject);
                return;
            }
            jSONObject.put("success", (Object) Boolean.FALSE);
            jSCallback.invoke(jSONObject);
        } catch (Throwable unused) {
            jSONObject.put("success", (Object) Boolean.FALSE);
            jSCallback.invoke(jSONObject);
        }
    }
}
