package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BnvbStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BnvbStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(BnvbStore bnvbStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/BnvbStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspUIClient mspUIClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || (mspUIClient = this.mMspUIClient) == null) {
            return null;
        }
        MspBasePresenter currentPresenter = mspUIClient.getCurrentPresenter();
        if (!(currentPresenter == null || currentPresenter.getIView() == null)) {
            currentPresenter.getIView().addMaskView();
        }
        try {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            if (actionParamsJson == null) {
                return "";
            }
            String string = actionParamsJson.getString("succNotifyName");
            String string2 = actionParamsJson.getString("failNotifyName");
            if (!TextUtils.isEmpty(string)) {
                this.mMspUIClient.setSuccNotifyName(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                this.mMspUIClient.setFailNotifyName(string2);
            }
            ActionsCreator.get(this.mMspContext).createUIShowAction(actionParamsJson, false, this.mStEvent);
            return "";
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }
}
