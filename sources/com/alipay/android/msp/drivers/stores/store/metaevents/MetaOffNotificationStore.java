package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventBusUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaOffNotificationStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaOffNotificationStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaOffNotificationStore metaOffNotificationStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaOffNotificationStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || this.mMspUIClient == null || this.mContext == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        String string = mspEvent.getActionParamsJson().getString("name");
        if (TextUtils.isEmpty(string)) {
            jSONObject.put("message", (Object) "param name must not null");
            jSONObject.put("success", (Object) Boolean.FALSE);
            return jSONObject.toJSONString();
        }
        boolean offNotification = BroadcastUtil.offNotification(this.mMspContext, this.mContext, string);
        boolean offNotification2 = EventBusUtil.offNotification(this.mMspContext, this.mContext, string);
        LogUtil.record(2, "OffNotificationStore:onAction", "off broadCast : " + offNotification + ", off eventBus : " + offNotification2);
        if (!offNotification || !offNotification2) {
            z = false;
        }
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        return jSONObject.toJSONString();
    }
}
