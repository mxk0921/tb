package com.taobao.highway.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.pxa;
import tb.t2o;
import tb.vxa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HighwayJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JS_DEFAULT_SOLUTION = "JS_SOLUTION";
    public static final String JS_DEFAULT_TRIGGER = "JS_TRIGGER";

    static {
        t2o.a(1034944572);
    }

    public static /* synthetic */ Object ipc$super(HighwayJSBridge highwayJSBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/highway/jsbridge/HighwayJSBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                wVCallBackContext.error(nsw.RET_PARAM_ERR);
                return false;
            } else if (!vxa.g()) {
                wVCallBackContext.error(nsw.RET_PARAM_ERR);
                return false;
            } else {
                pxa c = vxa.c();
                if (c == null) {
                    wVCallBackContext.error(nsw.RET_PARAM_ERR);
                    return false;
                }
                JSONObject jSONObject = new JSONObject(str2);
                if ("sendEvent".equals(str)) {
                    if (!TextUtils.isEmpty(jSONObject.getString("eventName")) && !TextUtils.isEmpty(jSONObject.getString("highway_content"))) {
                        String string = jSONObject.getString("eventName");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("highway_content");
                        c.e(string, jSONObject2, JS_DEFAULT_SOLUTION, "JS_TRIGGER_" + str);
                        wVCallBackContext.success(nsw.RET_SUCCESS);
                        return true;
                    }
                    wVCallBackContext.error(nsw.RET_PARAM_ERR);
                    return false;
                } else if ("sendBatchEvent".equals(str)) {
                    if (TextUtils.isEmpty(jSONObject.getString("eventName"))) {
                        wVCallBackContext.error(nsw.RET_PARAM_ERR);
                        return false;
                    }
                    c.b(jSONObject.getString("eventName"));
                    wVCallBackContext.success(nsw.RET_SUCCESS);
                    return true;
                } else if (!"sendSceneEvent".equals(str)) {
                    wVCallBackContext.error(nsw.RET_PARAM_ERR);
                    return false;
                } else if (TextUtils.isEmpty(jSONObject.getString("sceneName"))) {
                    wVCallBackContext.error(nsw.RET_PARAM_ERR);
                    return false;
                } else {
                    c.a(jSONObject.getString("sceneName"));
                    wVCallBackContext.success(nsw.RET_SUCCESS);
                    return true;
                }
            }
        } catch (JSONException unused) {
            wVCallBackContext.error(nsw.RET_PARAM_ERR);
            return false;
        }
    }
}
