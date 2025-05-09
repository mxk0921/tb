package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DestroyStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DestroyStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(DestroyStore destroyStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/DestroyStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        if (mspUIClient == null) {
            return "";
        }
        MspWindowFrameStack frameStack = mspUIClient.getFrameStack();
        try {
            String[] actionParamsArray = mspEvent.getActionParamsArray();
            if (actionParamsArray != null && actionParamsArray.length > 0) {
                MspBasePresenter currentPresenter = this.mMspUIClient.getCurrentPresenter();
                if (!(currentPresenter == null || currentPresenter.getIView() == null)) {
                    currentPresenter.getIView().addMaskView();
                }
                boolean popTopWindowFrame = frameStack != null ? frameStack.popTopWindowFrame(true, actionParamsArray[0]) : false;
                LogUtil.d("DestroyStore", "onMspAction", actionParamsArray[0] + " result=" + popTopWindowFrame);
            }
        } catch (Exception e) {
            MspContext mspContext = this.mMspContext;
            if (mspContext != null) {
                mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, e.getClass().getName(), e);
            }
        }
        return "";
    }
}
