package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.widget.MspSharePayDialog;
import com.alipay.android.msp.utils.EventLogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SharePayStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SharePayStore(int i) {
        super(i);
    }

    public static /* synthetic */ MspContext access$000(SharePayStore sharePayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("eee2ff3", new Object[]{sharePayStore});
        }
        return sharePayStore.mMspContext;
    }

    public static /* synthetic */ MspContext access$100(SharePayStore sharePayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("6e5e0ad2", new Object[]{sharePayStore});
        }
        return sharePayStore.mMspContext;
    }

    public static /* synthetic */ MspTradeContext access$200(SharePayStore sharePayStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("ab334fcb", new Object[]{sharePayStore});
        }
        return sharePayStore.mMspTradeContext;
    }

    public static /* synthetic */ Object ipc$super(SharePayStore sharePayStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/SharePayStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (!(this.mMspContext == null || this.mMspUIClient == null)) {
            EventLogUtil.logPayEvent("1010970", "value", "sharepay_plugin");
            final JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SharePayStore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = actionParamsJson;
                    if (jSONObject != null) {
                        jSONObject.put(MspGlobalDefine.SESSION, (Object) SharePayStore.access$000(SharePayStore.this).getGlobalSession());
                        MspSharePayDialog.processSdk(SharePayStore.access$100(SharePayStore.this).getContext(), actionParamsJson, SharePayStore.access$200(SharePayStore.this));
                    }
                }
            });
        }
        return null;
    }
}
