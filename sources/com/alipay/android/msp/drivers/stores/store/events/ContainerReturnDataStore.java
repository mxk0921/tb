package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ContainerReturnDataStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ContainerReturnDataStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(ContainerReturnDataStore containerReturnDataStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/ContainerReturnDataStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        JSONObject jSONObject;
        MspContext mspContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        try {
            jSONObject = mspEvent.getActionParamsJson();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("bizResult");
        boolean booleanValue = jSONObject.getBooleanValue("doNotExit");
        try {
            MspContext mspContext2 = this.mMspContext;
            if ((mspContext2 instanceof MspContainerContext) && jSONObject2 != null) {
                ((MspContainerContext) mspContext2).getMspContainerClient().getMspContainerResult().setBizResult(jSONObject2.toJSONString());
            }
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        if (!booleanValue && (mspContext = this.mMspContext) != null) {
            mspContext.exit(0);
        }
        return jSONObject.toJSONString();
    }
}
