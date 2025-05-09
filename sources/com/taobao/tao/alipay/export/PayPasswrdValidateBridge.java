package com.taobao.tao.alipay.export;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.utils.CashDeskLog;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.bf3;
import tb.df3;
import tb.kpw;
import tb.nsw;
import tb.xal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PayPasswrdValidateBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CHECK_PAY_PASSWORD = "checkPayPasswordAction";
    private static final String ACTION_GET_LOGIN_TOKEN = "getLoginToken";
    public static final String PLUGIN_NAME = "TBWVPayPasswrdValidateHandler";
    public static WVCallBackContext wvCallBack;

    private void appendExtParams(JSONObject jSONObject, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33575333", new Object[]{this, jSONObject, map, str});
            return;
        }
        for (String str2 : jSONObject.keySet()) {
            if (!str.equals(str2)) {
                map.put(str2, jSONObject.getString(str2));
            }
        }
    }

    private void cancelResultEventHandler(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f7eb82", new Object[]{this, jSONObject});
        } else if (jSONObject.containsKey("needResultJump") && !jSONObject.getBooleanValue("needResultJump") && wvCallBack != null) {
            nsw nswVar = new nsw();
            nswVar.b("ResultStatus", "20000");
            wvCallBack.success(nswVar);
            wvCallBack = null;
        }
    }

    private void dispatchPayEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7aa393", new Object[]{this, str, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(CashdeskConstants.VALIDATE_ARGS, "true");
        if (jSONObject.getBooleanValue(CashdeskConstants.ENCODE_PARAMS)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                bf3.g("ENCODE_EXCEPTION", e.getMessage());
                handleAlipayErrorResult(e.getMessage());
            }
        }
        hashMap.put("signStr", str);
        appendExtParams(jSONObject, hashMap, "url");
        Cashdesk.invokeAlipay(getContext(), hashMap);
    }

    private void executorWXPay(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94cb7d3f", new Object[]{this, jSONObject, str});
            return;
        }
        Context context = getContext();
        if ((context instanceof Activity) || wvCallBack == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("signStr", str);
            appendExtParams(jSONObject, hashMap, "url");
            new df3().f((Activity) context, hashMap, null);
            return;
        }
        handleAlipayErrorResult("context must Activity");
    }

    private static void handleAlipayErrorResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa04fca4", new Object[]{str});
            return;
        }
        if (wvCallBack != null) {
            nsw nswVar = new nsw();
            nswVar.j(str);
            wvCallBack.error(nswVar);
        }
        wvCallBack = null;
    }

    public static void handleAlipayResult(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae1ac8", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        if (wvCallBack != null) {
            nsw nswVar = new nsw();
            nswVar.b("result", str4);
            nswVar.b("memo", str2);
            nswVar.b(MspGlobalDefine.OPEN_TIME, str3);
            nswVar.b("ResultStatus", str);
            nswVar.b(MspGlobalDefine.EXTENDINFO, str5);
            wvCallBack.success(nswVar);
        }
        wvCallBack = null;
    }

    private void invokeCashDeskWithEncodeParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa07257", new Object[]{this, str});
            return;
        }
        Map<String, String> queryMap = Cashdesk.getQueryMap(str);
        queryMap.put(CashdeskConstants.VALIDATE_ARGS, "true");
        queryMap.put(CashdeskConstants.ENCODE_PARAMS, "true");
        Cashdesk.invokeAlipay(Globals.getApplication(), queryMap);
    }

    private void invokeCashDeskWithExtParams(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a8f0ec", new Object[]{this, str, jSONObject, str2});
        } else if (PayRequest.CALL_WEIXIN_SDK.equals(str)) {
            executorWXPay(jSONObject, str2);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("signStr", str2);
            hashMap.put(CashdeskConstants.VALIDATE_ARGS, "true");
            appendExtParams(jSONObject, hashMap, "url");
            Cashdesk.invokeAlipay(Globals.getApplication(), hashMap);
        }
    }

    public static /* synthetic */ Object ipc$super(PayPasswrdValidateBridge payPasswrdValidateBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/alipay/export/PayPasswrdValidateBridge");
    }

    public static boolean isNeedResultCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74417c0d", new Object[0])).booleanValue();
        }
        if (wvCallBack != null) {
            return true;
        }
        return false;
    }

    private void checkPayPasswordAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8663f22", new Object[]{this, str});
            return;
        }
        JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString("url");
        cancelResultEventHandler(parseObject);
        if (xal.a("enableNewPay", true)) {
            dispatchPayEvent(string, parseObject);
            return;
        }
        String string2 = parseObject.getString("cashierType");
        String string3 = parseObject.getString(CashdeskConstants.ENCODE_PARAMS);
        String string4 = parseObject.getString("from");
        if (Boolean.parseBoolean(string3)) {
            invokeCashDeskWithEncodeParams(string);
        } else if (string2 == null && string4 == null) {
            Nav from = Nav.from(Globals.getApplication());
            from.toUri("http://d.m.taobao.com/goAlipay.htm?" + string + "&taobaoCheckPayPasswordAction=true");
        } else {
            invokeCashDeskWithExtParams(string2, parseObject, string);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "PayPasswordValidateBridge调用 action：" + str + " ，params：" + str2);
        if (ACTION_GET_LOGIN_TOKEN.equals(str)) {
            nsw nswVar = new nsw();
            nswVar.b("sid", Login.getSid());
            wVCallBackContext.success(nswVar);
            return true;
        } else if (!ACTION_CHECK_PAY_PASSWORD.equals(str)) {
            return false;
        } else {
            checkPayPasswordAction(str2);
            wvCallBack = wVCallBackContext;
            return true;
        }
    }
}
