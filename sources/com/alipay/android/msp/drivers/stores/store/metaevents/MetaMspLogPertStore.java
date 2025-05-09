package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaMspLogPertStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaMspLogPertStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaMspLogPertStore metaMspLogPertStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaMspLogPertStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspContext mspContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || this.mMspUIClient == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        String string = actionParamsJson.getString("type");
        String string2 = actionParamsJson.getString("name");
        long longValue = actionParamsJson.getLongValue("time");
        actionParamsJson.getString("reserved");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || (mspContext = this.mMspContext) == null) {
            return "";
        }
        mspContext.getStatisticInfo().addPerf(string, string2, String.valueOf(longValue));
        return "";
    }
}
