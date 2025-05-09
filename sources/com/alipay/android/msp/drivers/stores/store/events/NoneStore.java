package com.alipay.android.msp.drivers.stores.store.events;

import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NoneStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public NoneStore(int i) {
        super(i);
    }

    public static /* synthetic */ MspContext access$000(NoneStore noneStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("31416ba4", new Object[]{noneStore});
        }
        return noneStore.mMspContext;
    }

    public static /* synthetic */ Object ipc$super(NoneStore noneStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/NoneStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null) {
            return "";
        }
        try {
            LogUtil.record(1, "NoneStore:onMspAction", "startPay");
            MspUIClient mspUIClient = this.mMspUIClient;
            if (mspUIClient != null) {
                MspBasePresenter currentPresenter = mspUIClient.getCurrentPresenter();
                MspWindowFrameStack frameStack = this.mMspUIClient.getFrameStack();
                if (!(currentPresenter == null || frameStack == null)) {
                    MspBaseContract.IView iView = currentPresenter.getIView();
                    if (iView != null) {
                        LogUtil.record(1, "NoneStore:onMspAction", pg1.ATOM_do);
                        iView.removeMaskView();
                    }
                    if (frameStack.getTopTplOrNativeFrame() == null) {
                        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.NoneStore.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    NoneStore.access$000(NoneStore.this).exit(0);
                                }
                            }
                        }, 100L);
                    }
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return "";
    }
}
