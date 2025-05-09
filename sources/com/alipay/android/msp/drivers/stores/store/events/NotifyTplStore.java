package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.mobile.beehive.eventbus.EventBusManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NotifyTplStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public NotifyTplStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(NotifyTplStore notifyTplStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/NotifyTplStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mContext == null) {
            this.mContext = GlobalHelper.getInstance().getContext();
        }
        EventBusManager.getInstance().post(mspEvent.getActionParamsJson(), MspGlobalDefine.EVENT_NOTIFY_TPL);
        return "";
    }
}
