package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VerifyIdStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public VerifyIdStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(VerifyIdStore verifyIdStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/VerifyIdStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        String[] actionParamsArray = mspEvent.getActionParamsArray();
        if (actionParamsArray == null || actionParamsArray.length <= 0) {
            str = "";
            str2 = str;
        } else {
            str2 = actionParamsArray[0];
            str = actionParamsArray.length >= 2 ? actionParamsArray[1] : "";
        }
        if (this.mMspTradeContext == null) {
            return null;
        }
        PhoneCashierMspEngine.getMspViSec().verifyId(str2, str, eventAction.getActionData(), this.mBizId);
        return "";
    }
}
