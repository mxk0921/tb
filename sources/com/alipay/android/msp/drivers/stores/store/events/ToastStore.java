package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ToastStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ToastStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(ToastStore toastStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/ToastStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspUIClient mspUIClient;
        MspBasePresenter currentPresenter;
        MspBaseContract.IView iView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || (mspUIClient = this.mMspUIClient) == null || (currentPresenter = mspUIClient.getCurrentPresenter()) == null || (iView = currentPresenter.getIView()) == null) {
            return null;
        }
        try {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            String string = actionParamsJson.getString("msg");
            String string2 = actionParamsJson.getString("img");
            long longValue = actionParamsJson.getLongValue("time");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            iView.showToastView(string, string2, longValue);
            return "";
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }
}
