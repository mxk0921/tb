package com.alipay.android.msp.drivers.stores.store.metaevents;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statistics.SpmWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaSpmPageDestroyStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaSpmPageDestroyStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaSpmPageDestroyStore metaSpmPageDestroyStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaSpmPageDestroyStore");
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
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        actionParamsJson.getString("spmId");
        String string = actionParamsJson.getString("bizCode");
        String string2 = actionParamsJson.getString("param4");
        MspWindowFrameStack frameStack = this.mMspUIClient.getFrameStack();
        MspWindowFrame topTplOrNativeFrame = frameStack != null ? frameStack.getTopTplOrNativeFrame() : null;
        if (topTplOrNativeFrame == null) {
            return null;
        }
        SpmWrapper.onPageEnd(topTplOrNativeFrame, this.mBizId, string2, string);
        return "";
    }
}
