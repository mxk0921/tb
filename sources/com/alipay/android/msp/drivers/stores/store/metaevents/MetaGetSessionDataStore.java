package com.alipay.android.msp.drivers.stores.store.metaevents;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaGetSessionDataStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaGetSessionDataStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaGetSessionDataStore metaGetSessionDataStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaGetSessionDataStore");
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
        ArrayList arrayList = new ArrayList();
        if (actionParamsJson.containsKey("key")) {
            arrayList.add(actionParamsJson.getString("key"));
        } else if (actionParamsJson.containsKey("keys")) {
            JSONArray jSONArray = actionParamsJson.getJSONArray("keys");
            if (jSONArray.size() > 0) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            }
        }
        JSONObject metaSessionDataByKeys = this.mMspContext.getMetaSessionDataByKeys(arrayList);
        if (metaSessionDataByKeys == null) {
            metaSessionDataByKeys = new JSONObject();
        }
        return metaSessionDataByKeys.toJSONString();
    }
}
