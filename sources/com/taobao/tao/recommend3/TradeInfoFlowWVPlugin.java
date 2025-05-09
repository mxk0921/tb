package com.taobao.tao.recommend3;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.tao.log.TLog;
import org.json.JSONException;
import tb.arm;
import tb.ee2;
import tb.fve;
import tb.kpw;
import tb.nsw;
import tb.p78;
import tb.r4p;
import tb.t2o;
import tb.uqa;
import tb.wba;
import tb.wrn;
import tb.xqm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TradeInfoFlowWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CONTAINER_ID = "containerID";
    private static final String GET_FEEDS_PARAMS = "getFeedsParams";
    private static final String GET_FEEDS_STICK_STATUS = "getFeedsStickStatus";
    private static final String IS_AFTER_BUY_STICK_END = "isAfterBuyStickEnd";
    private static final String PRE_TRIGGER_INFO_FLOW_REQUEST = "preTriggerInfoflowRequest";
    private static final String TAG = "TradeInfoflowWVPlugin";
    private xqm mPrefetchReceiver;

    static {
        t2o.a(729809649);
    }

    private void feedsStickStatusCallBack(String str, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db98320", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Exception unused) {
            uqa.b("Bridge", "FeedsStickStatusCallBack", "params parse exception");
            wVCallBackContext.error();
            jSONObject = null;
        }
        if (jSONObject == null) {
            uqa.b("Bridge", "FeedsStickStatusCallBack", "popParams == null");
            wVCallBackContext.error();
            return;
        }
        nswVar.a(IS_AFTER_BUY_STICK_END, Boolean.valueOf(wrn.NOT_REACH_TOP.equals(wrn.a(jSONObject.getString(CONTAINER_ID)))));
        wVCallBackContext.success(nswVar);
    }

    private void getFeedsParams(String str, WVCallBackContext wVCallBackContext) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad51e853", new Object[]{this, str, wVCallBackContext});
            return;
        }
        TLog.logd("tb_homepage", TAG, "RecommendJSUtil getFeedsParams， params = " + str);
        nsw nswVar = new nsw();
        TBLocationDTO d = p78.a() ? TBLocationClient.d() : null;
        if (d != null) {
            str2 = d.provinceCode;
        } else {
            str2 = "";
        }
        String c = wba.c();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        ee2.a(jSONObject);
        if (jSONObject.containsKey("tb_homepage_clientCache_lbs")) {
            jSONObject2 = jSONObject.getJSONObject("tb_homepage_clientCache_lbs");
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put(r4p.KEY_GLOBAL_LBS, c);
            jSONObject3.put("provinceCode", str2);
            jSONObject3.put("tb_homepage_clientCache_lbs", jSONObject2.toJSONString());
        } catch (JSONException e) {
            TLog.loge("tb_homepage", TAG, "json parser failed" + e.toString());
        }
        nswVar.d("data", jSONObject3);
        wVCallBackContext.success(nswVar);
    }

    private String getPageUrl(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2107aac5", new Object[]{this, str});
        }
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Exception unused) {
            fve.e(TAG, "解析参数出现异常");
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.getString("paySuccessURL");
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(TradeInfoFlowWVPlugin tradeInfoFlowWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/TradeInfoFlowWVPlugin");
    }

    private void preTriggerInfoflowRequest(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914d4f8c", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        if (this.mPrefetchReceiver == null) {
            this.mPrefetchReceiver = new xqm();
        }
        String pageUrl = getPageUrl(str);
        arm.f("newbuy");
        this.mPrefetchReceiver.g(pageUrl);
        wVCallBackContext.success(nswVar);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (PRE_TRIGGER_INFO_FLOW_REQUEST.equals(str)) {
            preTriggerInfoflowRequest(str2, wVCallBackContext);
        }
        if (GET_FEEDS_STICK_STATUS.equals(str)) {
            feedsStickStatusCallBack(str2, wVCallBackContext);
        }
        if (GET_FEEDS_PARAMS.equals(str)) {
            getFeedsParams(str2, wVCallBackContext);
        }
        return true;
    }
}
