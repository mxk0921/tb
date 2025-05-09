package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.drivers.stores.store.events.FeedbackStore;
import com.alipay.android.msp.framework.statistics.SpmWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaSpmClickedStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaSpmClickedStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaSpmClickedStore metaSpmClickedStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaSpmClickedStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspUIClient mspUIClient;
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
        String string = actionParamsJson.getString("spmId");
        String string2 = actionParamsJson.getString("bizCode");
        String string3 = actionParamsJson.getString("param4");
        if (TextUtils.isEmpty(string) || (mspUIClient = this.mMspUIClient) == null) {
            return null;
        }
        MspWindowFrameStack frameStack = mspUIClient.getFrameStack();
        MspWindowFrame topTplOrNativeFrame = frameStack != null ? frameStack.getTopTplOrNativeFrame() : null;
        if (topTplOrNativeFrame == null) {
            return null;
        }
        SpmWrapper.onPageClick(topTplOrNativeFrame, string, string2, FeedbackStore.createSpmSessionId(this.mBizId, topTplOrNativeFrame), string3, this.mBizId);
        return "";
    }
}
