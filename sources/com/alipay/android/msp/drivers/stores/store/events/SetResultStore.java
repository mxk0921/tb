package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SetResultStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SetResultStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(SetResultStore setResultStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/SetResultStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspTradeContext mspTradeContext;
        MspPayResult mspPayResult;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        String[] actionParamsArray = mspEvent.getActionParamsArray();
        if (actionParamsArray == null || actionParamsArray.length < 3 || (mspTradeContext = this.mMspTradeContext) == null || (mspPayResult = mspTradeContext.getMspPayResult()) == null) {
            return null;
        }
        mspPayResult.setEndCode(actionParamsArray[1]);
        mspPayResult.setMemo(actionParamsArray[0]);
        if (!TextUtils.isEmpty(actionParamsArray[2])) {
            str = Utils.urlDecode(actionParamsArray[2]);
        } else {
            str = "";
        }
        mspPayResult.setResult(str);
        return mspPayResult.toString();
    }
}
