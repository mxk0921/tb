package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.MspSharePayDialog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SharePaySelStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SharePaySelStore(int i) {
        super(i);
    }

    public static /* synthetic */ MspContext access$000(SharePaySelStore sharePaySelStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("843e715d", new Object[]{sharePaySelStore});
        }
        return sharePaySelStore.mMspContext;
    }

    public static /* synthetic */ MspTradeContext access$100(SharePaySelStore sharePaySelStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("c075bb7e", new Object[]{sharePaySelStore});
        }
        return sharePaySelStore.mMspTradeContext;
    }

    public static /* synthetic */ Object ipc$super(SharePaySelStore sharePaySelStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/SharePaySelStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || this.mMspUIClient == null) {
            return null;
        }
        final JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        MspBasePresenter currentPresenter = this.mMspUIClient.getCurrentPresenter();
        if (currentPresenter == null) {
            return "";
        }
        final Activity activity = currentPresenter.getActivity();
        activity.runOnUiThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SharePaySelStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                actionParamsJson.put(MspGlobalDefine.SESSION, (Object) SharePaySelStore.access$000(SharePaySelStore.this).getGlobalSession());
                MspSharePayDialog.processSel(activity, actionParamsJson, SharePaySelStore.access$100(SharePaySelStore.this));
            }
        });
        return "";
    }
}
