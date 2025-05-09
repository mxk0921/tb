package com.alipay.android.msp.drivers.stores.store.events;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.pay.results.H5PayResult;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class WapPayStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public WapPayStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(WapPayStore wapPayStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/WapPayStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null) {
            return "";
        }
        String[] actionParamsArray = mspEvent.getActionParamsArray();
        LogUtil.record(4, "WapPayStore:onDialogAction", "onDialogAction Thread startPay ");
        final H5PayResult h5PayResult = new H5PayResult();
        if (!(this.mContext == null || actionParamsArray == null || actionParamsArray.length <= 0)) {
            Intent intent = new Intent(this.mContext, MspWebActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("url", actionParamsArray[0]);
            bundle.putString("type", MspEventTypes.ACTION_STRING_WAPPAY);
            bundle.putParcelable(MspWebActivity.RESULT_RECEIVER, new ResultReceiver(null) { // from class: com.alipay.android.msp.drivers.stores.store.events.WapPayStore.1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i, Bundle bundle2) {
                    H5PayResult.fromBundle(bundle2, h5PayResult);
                    synchronized (h5PayResult) {
                        h5PayResult.notify();
                    }
                }
            });
            if (actionParamsArray.length == 2) {
                bundle.putString("cookie", actionParamsArray[1]);
            }
            bundle.putBoolean("from_mcashier", true);
            intent.putExtras(bundle);
            MspUIClient mspUIClient = this.mMspUIClient;
            if (mspUIClient == null) {
                return "";
            }
            MspBasePresenter currentPresenter = mspUIClient.getCurrentPresenter();
            if (!(currentPresenter == null || currentPresenter.getIView() == null)) {
                currentPresenter.getIView().openActivity(intent, null);
            }
        }
        synchronized (h5PayResult) {
            try {
                LogUtil.record(4, "WapPayStore:onDialogAction", "onDialogAction Thread wait ");
                h5PayResult.wait();
            } catch (InterruptedException e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        LogUtil.record(4, "WapPayStore:onDialogAction", "onDialogAction Thread notify ");
        this.mMspContext.exit(0);
        return "";
    }
}
