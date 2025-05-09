package com.alibaba.triver.triver_shop.wvjsbridge;

import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kht;
import tb.kpw;
import tb.nsw;
import tb.sk2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WVAriverShopBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766510501);
    }

    public static /* synthetic */ Object ipc$super(WVAriverShopBridge wVAriverShopBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/wvjsbridge/WVAriverShopBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (kht.actionOpenBrandZone.equals(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str2);
                String string = parseObject.getString("appId");
                String string2 = parseObject.getString("path");
                String string3 = parseObject.getString("transition");
                String string4 = parseObject.getString(RVStartParams.KEY_SUPER_SPLASH);
                JSONObject jSONObject = parseObject.getJSONObject("loadingParams");
                String string5 = parseObject.getString("query");
                String string6 = parseObject.getString("extQuery");
                nsw nswVar = new nsw();
                if (wVCallBackContext.getWebview() == null || !sk2.i(wVCallBackContext.getWebview().getContext(), string, string2, string5, string3, jSONObject, string4, string6, (Bundle) null)) {
                    nswVar.a("success", Boolean.FALSE);
                } else {
                    nswVar.a("success", Boolean.TRUE);
                }
                wVCallBackContext.success(nswVar);
                return true;
            } catch (JSONException unused) {
                wVCallBackContext.error();
            }
        }
        return false;
    }
}
