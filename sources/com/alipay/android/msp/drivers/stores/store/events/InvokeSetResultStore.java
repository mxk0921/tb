package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.container.MspContainerClient;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class InvokeSetResultStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public InvokeSetResultStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(InvokeSetResultStore invokeSetResultStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/InvokeSetResultStore");
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
        if (mspEvent.getActionParamsJson() == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        MspContext mspContext = this.mMspContext;
        if (mspContext instanceof MspContainerContext) {
            MspContainerClient mspContainerClient = ((MspContainerContext) mspContext).getMspContainerClient();
            if (!(mspContainerClient == null || mspContainerClient.getMspContainerResult() == null)) {
                mspContainerClient.getMspContainerResult().setBizResult(actionParamsJson.toJSONString());
            }
            jSONObject.put("success", (Object) Boolean.TRUE);
        } else {
            jSONObject.put("success", (Object) Boolean.FALSE);
        }
        LogUtil.record(1, "InvokeSetResultStore:setBizResult", "res=" + jSONObject.toJSONString());
        return jSONObject.toJSONString();
    }
}
