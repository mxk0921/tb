package com.taobao.downgrade;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.xpf;
import tb.xxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class AliHADowngradeSDKBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_ID = "BizID";
    private static final String GET_DOWNGRADE_INFO = "getDowngradeInfo";
    private static final String IS_TEST = "IsTest";
    public static final String JS_BRIDGE_SDK_NAME = "AliHADowngradeSDKBridge";

    public static /* synthetic */ Object ipc$super(AliHADowngradeSDKBridge aliHADowngradeSDKBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/downgrade/AliHADowngradeSDKBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (GET_DOWNGRADE_INFO.equals(str)) {
            return getDowngradeInfo(str2, wVCallBackContext);
        }
        return false;
    }

    private boolean getDowngradeInfo(String str, WVCallBackContext wVCallBackContext) {
        Map<String, String> traceMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("324d1a1f", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        nsw nswVar = new nsw();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(BIZ_ID);
            Downgrade.isTest = jSONObject.optBoolean(IS_TEST);
            DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy(string);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(xxl.TACTICS_FUNCTION, downgradeStrategy.getTacticsFunction());
            jSONObject2.put(xxl.TACTICS_PERFORMANCE, downgradeStrategy.getTacticsPerformance());
            com.alibaba.fastjson.JSONObject param = downgradeStrategy.getParam();
            if (param != null && param.size() > 0) {
                jSONObject2.put("param", new JSONObject(param));
            }
            nswVar.d("result", jSONObject2);
            if (Downgrade.isTest && (traceMap = downgradeStrategy.getTraceMap()) != null) {
                nswVar.d("extraInfo", new JSONObject(traceMap));
            }
            nswVar.m();
            xpf.b(System.currentTimeMillis() - currentTimeMillis);
            wVCallBackContext.success(nswVar);
            return true;
        } catch (Throwable th) {
            nswVar.b("errMsg", th.getMessage());
            wVCallBackContext.error(nswVar);
            return false;
        }
    }
}
