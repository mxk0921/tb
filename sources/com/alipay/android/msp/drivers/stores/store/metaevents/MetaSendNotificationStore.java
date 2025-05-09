package com.alipay.android.msp.drivers.stores.store.metaevents;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventBusUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaSendNotificationStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaSendNotificationStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaSendNotificationStore metaSendNotificationStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaSendNotificationStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        LogUtil.record(1, "MetaSendNotificationStore:onMspAction", "MetaSendNotificationStore");
        String string = actionParamsJson.getString("name");
        JSONObject jSONObject = actionParamsJson.getJSONObject(Constants.KEY_USER_ID);
        StringBuilder sb = new StringBuilder("notifyHashId@");
        sb.append((actionParamsJson.toString() + System.currentTimeMillis()).hashCode());
        EventBusUtil.postNotification(string, BroadcastUtil.postNotification(string, jSONObject, sb.toString(), this.mContext, this.mBizId));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("success", (Object) Boolean.TRUE);
        return jSONObject2.toJSONString();
    }
}
