package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.edit.EditTextManager;
import com.alipay.android.msp.utils.edit.EditTextUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BackStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BackStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(BackStore backStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/BackStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspUIClient mspUIClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (!(this.mMspContext == null || (mspUIClient = this.mMspUIClient) == null)) {
            MspWindowFrameStack frameStack = mspUIClient.getFrameStack();
            MspBasePresenter currentPresenter = this.mMspUIClient.getCurrentPresenter();
            if (currentPresenter == null || frameStack == null) {
                LogUtil.record(4, "BackStore:onMspAction", "presenter is null");
            } else {
                try {
                    MspBaseContract.IView iView = currentPresenter.getIView();
                    if (iView != null) {
                        iView.addMaskView();
                    }
                    if (frameStack.popTopWindowFrame(false, null)) {
                        this.mMspContext.getStatisticInfo().addEvent(new StEvent("onBack", "native", "exit"));
                        this.mMspContext.exit(0);
                        LogUtil.record(1, "BackStore:onMspAction", "checkpoint1:old", "");
                    }
                    EditTextUtil editTextUtils = EditTextManager.getEditTextUtils();
                    if (editTextUtils != null) {
                        editTextUtils.clear(this.mBizId);
                    }
                    return "";
                } catch (Exception e) {
                    MspContext mspContext = this.mMspContext;
                    if (mspContext != null) {
                        mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, e.getClass().getName(), e);
                    }
                    return null;
                }
            }
        }
        return null;
    }
}
