package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.es6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaGetBizDataStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaGetBizDataStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaGetBizDataStore metaGetBizDataStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaGetBizDataStore");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspPayResult mspPayResult;
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        Object obj = null;
        Object obj2 = null;
        String str = null;
        if (this.mMspContext == null || this.mContext == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        String str2 = "";
        if (actionParamsJson == null) {
            return str2;
        }
        String string = actionParamsJson.getString("key");
        if (TextUtils.isEmpty(string)) {
            return str2;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            switch (string.hashCode()) {
                case -934426595:
                    if (string.equals("result")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 106006350:
                    if (string.equals("order")) {
                        break;
                    }
                    c = 65535;
                    break;
                case 1630576895:
                    if (string.equals("orderString")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1903035676:
                    if (string.equals(es6.DP_BIZ_CONTEXT)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 2115255728:
                    if (string.equals("mspParams")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                MspTradeContext mspTradeContext = this.mMspTradeContext;
                if (mspTradeContext != null) {
                    obj = JsonUtil.map2Json(mspTradeContext.getOrderInfoMap());
                }
                if (obj == null) {
                    obj = new JSONObject();
                }
                jSONObject.put("order", obj);
            } else if (c == 1) {
                MspTradeContext mspTradeContext2 = this.mMspTradeContext;
                if (mspTradeContext2 != null) {
                    str = mspTradeContext2.getOrderInfo();
                }
                if (str != null) {
                    str2 = str;
                }
                jSONObject.put("orderString", (Object) str2);
            } else if (c == 2) {
                String lastMspParams = MspConfig.getInstance().getLastMspParams();
                if (lastMspParams != null) {
                    str2 = lastMspParams;
                }
                jSONObject.put("mspParams", (Object) str2);
            } else if (c == 3) {
                MspTradeContext mspTradeContext3 = this.mMspTradeContext;
                if (mspTradeContext3 != null) {
                    obj2 = mspTradeContext3.getBizContext();
                }
                if (obj2 == null) {
                    obj2 = new JSONObject();
                }
                jSONObject.put(es6.DP_BIZ_CONTEXT, obj2);
            } else if (c == 4) {
                JSONObject jSONObject2 = new JSONObject();
                MspTradeContext mspTradeContext4 = this.mMspTradeContext;
                if (!(mspTradeContext4 == null || (mspPayResult = mspTradeContext4.getMspPayResult()) == null)) {
                    mspPayResult.formatResult(2);
                    jSONObject2.put("resultStatus", (Object) mspPayResult.getEndCode());
                    jSONObject2.put("result", (Object) mspPayResult.getResult());
                    jSONObject2.put("memo", (Object) mspPayResult.getMemo());
                    jSONObject2.put(MspGlobalDefine.EXTENDINFO, (Object) mspPayResult.getExtendInfo());
                }
                jSONObject.put("result", (Object) jSONObject2);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return jSONObject.toJSONString();
    }
}
