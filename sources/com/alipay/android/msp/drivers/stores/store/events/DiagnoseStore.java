package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DiagnoseStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DiagnoseStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(DiagnoseStore diagnoseStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/DiagnoseStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspWindowFrameStack frameStack;
        MspWindowFrame peekFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        if (mspUIClient == null || (frameStack = mspUIClient.getFrameStack()) == null || (peekFrame = frameStack.peekFrame()) == null) {
            return null;
        }
        try {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            LogUtil.record(1, "LocDiagnoseStore:onDialogAction", actionParamsJson.toString());
            peekFrame.setDiagnoseParams(actionParamsJson);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return peekFrame.toString();
    }
}
