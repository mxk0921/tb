package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.ability.impl.mtop.MtopAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.section.MqpBehavior;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.network.decorator.RpcRequestDecorator;
import com.alipay.android.msp.network.model.RequestConfig;
import com.alipay.android.msp.network.model.RpcRequestData;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.net.LdcUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RpcStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(RpcStore rpcStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/RpcStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        return a(mspEvent.getActionParamsJson());
    }

    public final String a(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        TradeLogicData tradeLogicData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        MspBasePresenter currentPresenter = mspUIClient != null ? mspUIClient.getCurrentPresenter() : null;
        MspBaseContract.IView iView = currentPresenter != null ? currentPresenter.getIView() : null;
        boolean booleanValue = jSONObject.getBooleanValue("showLoading");
        if (!(!booleanValue || currentPresenter == null || iView == null)) {
            LogUtil.record(1, "RpcStore:executeRpc", "showLoading");
            iView.showLoadingView(new String[0]);
        }
        HashMap hashMap = new HashMap();
        try {
            String string = jSONObject.getString("operationType");
            boolean equals = "pb".equals(jSONObject.getString("type"));
            String str4 = jSONObject.get(MtopAbility.API_REQUEST_DATA);
            if (jSONObject.containsKey("action")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("action");
                str = jSONObject2.containsKey("name") ? jSONObject2.getString("name") : null;
                if (jSONObject2.containsKey("params")) {
                    str3 = jSONObject2.getJSONObject("params").toJSONString();
                } else {
                    str3 = "{}";
                }
                RequestConfig requestConfig = new RequestConfig(str3, jSONObject2.toJSONString(), this.mBizId, false);
                MspTradeContext mspTradeContext = this.mMspTradeContext;
                if (mspTradeContext != null) {
                    tradeLogicData = mspTradeContext.getTradeLogicData();
                    requestConfig.setSessionId(tradeLogicData.getSessionId());
                } else {
                    tradeLogicData = null;
                }
                RpcRequestData invokeRpcRequestParamsString = RpcRequestDecorator.getInvokeRpcRequestParamsString(requestConfig, str3, this.mContext);
                hashMap.put(MspNetConstants.Request.MSP_PARAM, LdcUtils.getMspParams(tradeLogicData, str3));
                hashMap.put("mqp-tid", TidStorage.getInstance().getTid());
                hashMap.put("mqp-apiver", invokeRpcRequestParamsString.getApi_version());
                hashMap.put("mqp-bp", PluginManager.getRender().getEngineParams());
                str4 = invokeRpcRequestParamsString.toJsonParams();
            } else {
                str = null;
            }
            if (str4 != null) {
                if (equals) {
                    str2 = jSONObject.getString(MtopAbility.API_REQUEST_DATA);
                } else if (str4 instanceof JSONArray) {
                    str2 = str4.toString();
                } else if (str4 instanceof JSONObject) {
                    str2 = "[" + ((JSONObject) str4).toJSONString() + "]";
                } else if (!(str4 instanceof String)) {
                    str2 = jSONObject.getString(MtopAbility.API_REQUEST_DATA);
                } else if (!str4.startsWith("[")) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.add(str4);
                    str2 = jSONArray.toJSONString();
                } else {
                    str2 = str4;
                }
                MqpBehavior.getInstance().onGeneralRpcStart(this.mMspContext, string, str);
                if (TextUtils.isEmpty(str)) {
                    this.mStEvent.onStatistic("action", "rpc|".concat(String.valueOf(string)));
                } else {
                    this.mStEvent.onStatistic("action", "rpc|" + string + "|" + str);
                }
                SpmHelper.spmClickRpcRequest(this.mMspContext, str);
                StEvent stEvent = this.mStEvent;
                StringBuilder sb = new StringBuilder();
                sb.append(JSON.toJSONBytes(str2, new SerializerFeature[0]).length);
                stEvent.onStatistic(StEvent.SEND_MSG, sb.toString());
                JSONObject executeRpc = PhoneCashierMspEngine.getMspUtils().executeRpc(equals, string, str2, this.mBizId, hashMap);
                StEvent stEvent2 = this.mStEvent;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(JSON.toJSONBytes(executeRpc, new SerializerFeature[0]).length);
                stEvent2.onStatistic(StEvent.RECV_MSG, sb2.toString());
                this.mStEvent.onStatistic(StEvent.SERVER_COST, "0");
                MqpBehavior.getInstance().onGeneralRpcEnd(this.mMspContext, string, str);
                if (executeRpc == null) {
                    if (iView != null && booleanValue) {
                        try {
                            LogUtil.record(1, "RpcStore:executeRpc", "hideLoading");
                            iView.stopLoadingView();
                        } catch (Exception e) {
                            LogUtil.printExceptionStackTrace(e);
                        }
                    }
                    return "{}";
                }
                String jSONString = executeRpc.toJSONString();
                if (iView != null && booleanValue) {
                    try {
                        LogUtil.record(1, "RpcStore:executeRpc", "hideLoading");
                        iView.stopLoadingView();
                    } catch (Exception e2) {
                        LogUtil.printExceptionStackTrace(e2);
                    }
                }
                return jSONString;
            }
            if (iView != null && booleanValue) {
                try {
                    LogUtil.record(1, "RpcStore:executeRpc", "hideLoading");
                    iView.stopLoadingView();
                } catch (Exception e3) {
                    LogUtil.printExceptionStackTrace(e3);
                }
            }
            return "{}";
        } catch (Throwable th) {
            try {
                LogUtil.record(4, "RpcStore:executeRpc", "exception caught");
                LogUtil.printExceptionStackTrace(th);
                if (iView != null && booleanValue) {
                    try {
                        LogUtil.record(1, "RpcStore:executeRpc", "hideLoading");
                        iView.stopLoadingView();
                    } catch (Exception e4) {
                        LogUtil.printExceptionStackTrace(e4);
                    }
                }
                return "{}";
            } catch (Throwable th2) {
                if (iView != null && booleanValue) {
                    try {
                        LogUtil.record(1, "RpcStore:executeRpc", "hideLoading");
                        iView.stopLoadingView();
                    } catch (Exception e5) {
                        LogUtil.printExceptionStackTrace(e5);
                    }
                }
                throw th2;
            }
        }
    }
}
