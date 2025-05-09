package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class InvokeVerifyIdentityStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public InvokeVerifyIdentityStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(InvokeVerifyIdentityStore invokeVerifyIdentityStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/InvokeVerifyIdentityStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        if (mspUIClient == null || mspUIClient.getCurrentPresenter() == null || this.mMspUIClient.getCurrentPresenter().getIView() == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        try {
            if (actionParamsJson == null) {
                LogUtil.record(1, "LocalPlugin:verifyIdentity", "param = null");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", (Object) "2000");
                return jSONObject.toJSONString();
            }
            PhoneCashierMspEngine.getMspViSec().verifyIdentity(actionParamsJson, this.mContext, this.mBizId, eventAction);
            return InvokeActionPlugin.AYSNC_CALLBACK;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }
}
