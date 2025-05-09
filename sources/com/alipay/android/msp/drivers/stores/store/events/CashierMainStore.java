package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CashierMainStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CashierMainStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(CashierMainStore cashierMainStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/CashierMainStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspContext mspContext = this.mMspContext;
        if (mspContext == null) {
            return null;
        }
        MspUIClient mspUIClient = mspContext.getMspUIClient();
        if (mspUIClient != null) {
            MspBasePresenter currentPresenter = mspUIClient.getCurrentPresenter();
            if (!(currentPresenter == null || currentPresenter.getIView() == null)) {
                currentPresenter.getIView().showLoadingView("");
            }
            if (mspUIClient instanceof MspWindowClient) {
                ((MspWindowClient) mspUIClient).setPreSubmitPageLoading(false);
            }
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson != null) {
            ActionsCreator.get(this.mMspContext).createUIRecoverAction("", actionParamsJson.getString("action"));
        } else {
            ActionsCreator.get(this.mMspContext).createUIFirstAction();
        }
        return null;
    }
}
