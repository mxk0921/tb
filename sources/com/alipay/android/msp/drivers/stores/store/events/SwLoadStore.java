package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.drivers.stores.storecenter.ActionStoreCenter;
import com.alipay.android.msp.framework.hardwarepay.old.dialog.ValidateDialogProxy;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SwLoadStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SwLoadStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(SwLoadStore swLoadStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/SwLoadStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        EventLogUtil.SpecificEvent.wearableUsage("swloadStore");
        MspContext mspContext = this.mMspContext;
        ValidateDialogProxy dialog = mspContext instanceof MspTradeContext ? ((ActionStoreCenter) mspContext.getStoreCenter()).getDialog() : null;
        String[] actionParamsArray = mspEvent.getActionParamsArray();
        if (dialog == null || actionParamsArray == null || actionParamsArray.length <= 0) {
            return null;
        }
        int i = -1;
        for (String str : actionParamsArray) {
            if (str != null) {
                String trim = str.trim();
                if (trim.startsWith("time=")) {
                    try {
                        i = Integer.parseInt(trim.substring(trim.indexOf("=") + 1));
                    } catch (NumberFormatException e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                    if (i >= 0) {
                        dialog.dismiss(i);
                    }
                } else if (trim.startsWith("loadtxt=")) {
                    dialog.updateMsg(trim.substring(trim.indexOf("=") + 1), 0, -16777216);
                } else if (TextUtils.equals(trim, "status=success")) {
                    dialog.showLoadingSuccess();
                } else if (TextUtils.equals(trim, "status=loading")) {
                    dialog.setAllButtonsGone();
                }
            }
        }
        if (i < 0 || this.mMspContext.getStoreCenter() == null) {
            return "";
        }
        ((ActionStoreCenter) this.mMspContext.getStoreCenter()).setDialog(null);
        return "";
    }
}
