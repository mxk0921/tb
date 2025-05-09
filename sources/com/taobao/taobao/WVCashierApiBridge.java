package com.taobao.taobao;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.internal.PayRequest;
import java.util.Map;
import tb.cf3;
import tb.hf3;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WVCashierApiBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_PARAMS = "getParams";
    public static final String PLUGIN_NAME = "TBCashierApi";

    private void handleErrorResult(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("751097cb", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.j(str);
        wVCallBackContext.error(nswVar);
    }

    public static void handleSuccessResult(WVCallBackContext wVCallBackContext, Map<String, String> map, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3885231", new Object[]{wVCallBackContext, map, jSONArray});
            return;
        }
        nsw nswVar = new nsw();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                nswVar.b(string, map.get(string));
            }
        }
        wVCallBackContext.success(nswVar);
    }

    public static /* synthetic */ Object ipc$super(WVCashierApiBridge wVCashierApiBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/WVCashierApiBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        JSONObject a2 = cf3.a(str2);
        if (a2 == null) {
            handleErrorResult(wVCallBackContext, "params为null");
            return false;
        }
        PayRequest c = hf3.b().c();
        if (c == null || c.getExtAttrMap() == null) {
            handleErrorResult(wVCallBackContext, "PayRequest为null");
            return false;
        }
        JSONArray jSONArray = a2.getJSONArray("keys");
        if (ACTION_GET_PARAMS.equals(str)) {
            handleSuccessResult(wVCallBackContext, c.getExtAttrMap(), jSONArray);
        } else {
            handleErrorResult(wVCallBackContext, "action未定义");
        }
        return true;
    }
}
