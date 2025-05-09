package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.l2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaMspLogEventStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public MetaMspLogEventStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaMspLogEventStore metaMspLogEventStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaMspLogEventStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspWindowFrame findFrameBySender;
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
        String string = actionParamsJson.getString("type");
        String string2 = actionParamsJson.getString("name");
        String string3 = actionParamsJson.getString("currView");
        actionParamsJson.getString("nextView");
        actionParamsJson.getLongValue("prepTime");
        actionParamsJson.getLongValue("netTime");
        actionParamsJson.getLongValue(l2o.COL_S_TIME);
        actionParamsJson.getLongValue(StEvent.PARSE_TIME);
        actionParamsJson.getLongValue("bnParseTime");
        actionParamsJson.getLongValue("bnCreateTime");
        actionParamsJson.getLongValue(StEvent.SHOW_TIME);
        actionParamsJson.getLongValue("sendSize");
        actionParamsJson.getLongValue("recvSize");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return "";
        }
        if (!(this.mMspContext == null || this.mMspUIClient == null || !TextUtils.isEmpty(string3))) {
            string3 = this.mMspContext.getCurrentWinTpName();
            MspWindowFrameStack frameStack = this.mMspUIClient.getFrameStack();
            if (!(frameStack == null || eventAction.getSender() == null || (findFrameBySender = frameStack.findFrameBySender(eventAction.getSender())) == null)) {
                string3 = findFrameBySender.getTplId();
            }
        }
        MspContext mspContext = this.mMspContext;
        if (mspContext == null) {
            return "";
        }
        mspContext.getStatisticInfo().addEvent(new StEvent(string3, string, string2));
        return "";
    }
}
