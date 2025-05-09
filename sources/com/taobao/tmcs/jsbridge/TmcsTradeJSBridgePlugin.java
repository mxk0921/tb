package com.taobao.tmcs.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tmcs.utils.TmcsOrderParamsHelper;
import org.json.JSONException;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TmcsTradeJSBridgePlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TmcsTradeJSBridgePlugin";
    public static final String TLOG_MODULE = "MCTradeJSBridge";

    public static /* synthetic */ Object ipc$super(TmcsTradeJSBridgePlugin tmcsTradeJSBridgePlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tmcs/jsbridge/TmcsTradeJSBridgePlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"getOrderParams".equals(str)) {
            return false;
        }
        JSONObject e = TmcsOrderParamsHelper.e(this.mContext);
        try {
            nsw nswVar = nsw.RET_SUCCESS;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("exParams", JSON.toJSONString(e));
            jSONObject.put("countryCode", TmcsOrderParamsHelper.d(this.mContext));
            nswVar.h(jSONObject);
            wVCallBackContext.success(nswVar);
            return true;
        } catch (JSONException e2) {
            String str3 = TAG;
            TLog.logi(TLOG_MODULE, str3, "fastjson转org.json失败: " + e2.getMessage());
            wVCallBackContext.success(nsw.RET_FAIL);
            return true;
        }
    }
}
