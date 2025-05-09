package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.base.keyboard.KeyboardManager;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HideKeyboardStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public HideKeyboardStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(HideKeyboardStore hideKeyboardStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/HideKeyboardStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspUIClient mspUIClient;
        MspBasePresenter currentPresenter;
        final Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || (mspUIClient = this.mMspUIClient) == null || (currentPresenter = mspUIClient.getCurrentPresenter()) == null || (activity = currentPresenter.getActivity()) == null) {
            return "";
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.HideKeyboardStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    KeyboardManager.getInstance().hideKeyboard(activity);
                    InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
                    View currentFocus = activity.getCurrentFocus();
                    if (currentFocus == null) {
                        currentFocus = new View(activity);
                    }
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        });
        return "";
    }
}
