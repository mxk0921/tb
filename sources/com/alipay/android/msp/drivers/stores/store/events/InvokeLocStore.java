package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class InvokeLocStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public InvokeLocStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(InvokeLocStore invokeLocStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/InvokeLocStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspUIClient mspUIClient;
        MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || (mspUIClient = this.mMspUIClient) == null || mspUIClient.getCurrentPresenter() == null || this.mContext == null || (currentPresenter = this.mMspUIClient.getCurrentPresenter()) == null || currentPresenter.getIView() == null) {
            return null;
        }
        String handleAction = this.mMspContext.getStoreCenter().handleAction(MspEventCreator.get().createMspEvent("InvokeLocStore", mspEvent.getActionParamsJson()));
        return TextUtils.isEmpty(handleAction) ? "{}" : handleAction;
    }
}
