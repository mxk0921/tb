package com.alipay.android.msp.drivers.stores.store.metaevents;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.callback.OnContactSelectCallback;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaSelectContactStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaSelectContactStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaSelectContactStore metaSelectContactStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaSelectContactStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || this.mMspUIClient == null || this.mContext == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        PhoneCashierMspEngine.getMspWallet().selectContact(actionParamsJson, new OnContactSelectCallback() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaSelectContactStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.core.callback.OnContactSelectCallback
            public void onContactSelected(JSONArray jSONArray) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2575eab", new Object[]{this, jSONArray});
                } else if (jSONArray != null) {
                    Utils.sendToDocument(eventAction, jSONArray.toJSONString());
                }
            }
        });
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }
}
