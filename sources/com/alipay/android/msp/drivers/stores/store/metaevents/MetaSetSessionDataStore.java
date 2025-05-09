package com.alipay.android.msp.drivers.stores.store.metaevents;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaSetSessionDataStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaSetSessionDataStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaSetSessionDataStore metaSetSessionDataStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaSetSessionDataStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || this.mContext == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        this.mMspContext.setMetaSessionData(actionParamsJson);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.TRUE);
        return jSONObject.toJSONString();
    }
}
