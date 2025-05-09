package com.taobao.wireless.link.webApp;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.irg;
import tb.kpw;
import tb.mrp;
import tb.nsw;
import tb.t2o;
import tb.wyw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WebAppJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_ADD_SHORTCUT = "addShortCut2Desktop";
    public static final String NAME = "ShortCutInterface";

    static {
        t2o.a(1030750353);
    }

    public static /* synthetic */ Object ipc$super(WebAppJSBridge webAppJSBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/webApp/WebAppJSBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (wVCallBackContext == null) {
            return false;
        }
        if (TextUtils.equals(str, ACTION_ADD_SHORTCUT)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String str3 = (String) jSONObject.get("labelName");
                String str4 = (String) jSONObject.get("resId");
                String str5 = (String) jSONObject.get("url");
                irg.a("WebApp", "WebAppJSBridge === execute === labelName = " + str3 + "  resId = " + str4 + "  url = " + str5);
                mrp.a(wyw.b().f31024a, str3, str4, str5);
                nsw nswVar = new nsw();
                nswVar.d("data", jSONObject);
                wVCallBackContext.success(nswVar);
            } catch (Exception e) {
                irg.a("WebApp", "WebAppJSBridge === execute === 解析异常：" + e.getMessage());
                wVCallBackContext.error();
                return false;
            }
        }
        return true;
    }
}
