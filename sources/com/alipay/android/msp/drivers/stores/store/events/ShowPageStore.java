package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShowPageStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShowPageStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(ShowPageStore showPageStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/ShowPageStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspBasePresenter currentPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (this.mMspUIClient == null) {
            return null;
        }
        if (!actionParamsJson.containsKey("param")) {
            return "";
        }
        String string = actionParamsJson.getString("param");
        MspUIClient mspUIClient = this.mMspUIClient;
        if (!(mspUIClient == null || (currentPresenter = mspUIClient.getCurrentPresenter()) == null || currentPresenter.getIView() == null)) {
            currentPresenter.getIView().addMaskView();
        }
        try {
            if (this.mMspUIClient.getMspWindowFrameDispatcher().parseRendDataFromUIShow(JSON.parseObject(string), false, this.mStEvent)) {
                return "";
            }
            LogUtil.record(4, "ShowPageStore:onMspAction", "frame == null");
            return null;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }
}
