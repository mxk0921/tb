package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.MspShareTokenDialog;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShareTokenStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShareTokenStore(int i) {
        super(i);
    }

    public static /* synthetic */ MspTradeContext access$000(ShareTokenStore shareTokenStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("7fd5e1a", new Object[]{shareTokenStore});
        }
        return shareTokenStore.mMspTradeContext;
    }

    public static /* synthetic */ Object ipc$super(ShareTokenStore shareTokenStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/ShareTokenStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspTradeContext == null || this.mMspUIClient == null) {
            return null;
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        final boolean z = !OrderInfoUtil.isSharepayRequest(this.mMspTradeContext);
        MspBasePresenter currentPresenter = this.mMspUIClient.getCurrentPresenter();
        if (currentPresenter == null) {
            return null;
        }
        final Activity activity = currentPresenter.getActivity();
        final String string = actionParamsJson.getString("tokenText");
        activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.ShareTokenStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TextUtils.isEmpty(string)) {
                    MspShareTokenDialog.showDialog(activity, string, ShareTokenStore.access$000(ShareTokenStore.this), z);
                }
            }
        });
        return "";
    }
}
