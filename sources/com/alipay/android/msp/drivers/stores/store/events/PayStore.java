package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PayStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PayStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(PayStore payStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/PayStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        if (mspUIClient == null || mspUIClient.getCurrentPresenter() == null) {
            return null;
        }
        MspBasePresenter currentPresenter = this.mMspUIClient.getCurrentPresenter();
        if (currentPresenter.getIView() == null) {
            return null;
        }
        Activity activity = currentPresenter.getActivity();
        if (currentPresenter.getIView() == null) {
            PhoneCashierMspEngine.getMspBase().invokePay(null, null, eventAction, activity);
            return InvokeActionPlugin.AYSNC_CALLBACK;
        }
        PhoneCashierMspEngine.getMspBase().loadProperties(activity);
        try {
            str = PhoneCashierMspEngine.getMspWallet().buildPayOrderInfo(mspEvent.getActionParamsJson().toJSONString());
            jSONObject = mspEvent.getActionParamsJson();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            this.mMspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "PayStore", e);
            str = PhoneCashierMspEngine.getMspWallet().buildPayOrderInfo(eventAction.getActionData());
            jSONObject = JSON.parseObject(eventAction.getActionData());
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject != null) {
            if (jSONObject.containsKey("extInfo") && (jSONObject2 = jSONObject.getJSONObject("extInfo")) != null) {
                for (String str2 : jSONObject2.keySet()) {
                    jSONObject3.put(str2, (Object) jSONObject2.getString(str2));
                }
            }
            if (jSONObject.containsKey("sourceBundleId")) {
                String string = jSONObject.getString("sourceBundleId");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject3.put("sourceBundleId", (Object) string);
                }
            }
        }
        Context context = this.mContext;
        if (context != null && FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_NEW_AP_LINK_TOKEN_CREATE_100370) && jSONObject3.containsKey("ap_link_token")) {
            String string2 = jSONObject3.getString("ap_link_token");
            jSONObject3.put("ap_link_token", (Object) (string2 + ApLinkTokenUtils.generateUniqueSuffixForOuterApLinkToken(str)));
        }
        PhoneCashierMspEngine.getMspBase().invokePay(str, jSONObject3.toJSONString(), eventAction, activity);
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }
}
