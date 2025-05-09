package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ReturnDataStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ReturnDataStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(ReturnDataStore returnDataStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/ReturnDataStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspTradeContext mspTradeContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null || (mspTradeContext = this.mMspTradeContext) == null) {
            return null;
        }
        MspPayResult mspPayResult = mspTradeContext.getMspPayResult();
        if (mspPayResult == null) {
            LogUtil.record(1, "ReturnDataStore:onMspAction", "payResult == null");
            return null;
        }
        String orderInfo = this.mMspTradeContext.getOrderInfo();
        if (!TextUtils.isEmpty(orderInfo) && orderInfo.contains("external_spec_action=\"/shareppay/sendMsg\"")) {
            mspPayResult.setEndCode(Constant.CODE_GET_TOKEN_SUCCESS);
        }
        String string = actionParamsJson.getString("resultStatus");
        if (!TextUtils.isEmpty(string)) {
            mspPayResult.setEndCode(string);
        }
        String string2 = actionParamsJson.getString("memo");
        if (!TextUtils.isEmpty(string2)) {
            mspPayResult.setMemo(string2);
        }
        try {
            String string3 = actionParamsJson.getString("result");
            if (!TextUtils.isEmpty(string3)) {
                if (!JsonUtil.isJsonObjectString(string3) && string3.indexOf("{") == 0) {
                    string3 = string3.substring(1, string3.length() - 1);
                }
                mspPayResult.setResult(string3);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        actionParamsJson.remove("resultStatus");
        actionParamsJson.remove("memo");
        actionParamsJson.remove("result");
        if (actionParamsJson.size() > 0) {
            mspPayResult.addExtendInfo(actionParamsJson);
        }
        if (actionParamsJson.getBooleanValue("doNotExit")) {
            return "";
        }
        this.mMspTradeContext.exit(0);
        return "";
    }
}
