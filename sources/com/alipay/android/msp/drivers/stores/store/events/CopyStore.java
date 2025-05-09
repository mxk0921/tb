package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.CustomToast;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CopyStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CopyStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(CopyStore copyStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/CopyStore");
    }

    public static /* synthetic */ void access$000(CopyStore copyStore, Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e990717d", new Object[]{copyStore, activity, new Boolean(z)});
        } else if (z) {
            CustomToast.showToast(activity, R.drawable.alipay_msp_copy_successful, LanguageHelper.localizedStringForKey("msp_copy_success", activity.getString(R.string.msp_copy_success), new Object[0]), 2000L);
        } else {
            CustomToast.showToast(activity, R.drawable.alipay_msp_copy_failed, LanguageHelper.localizedStringForKey("msp_copy_failed", activity.getString(R.string.msp_copy_failed), new Object[0]), 2000L);
        }
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspUIClient mspUIClient;
        MspBasePresenter currentPresenter;
        final String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || (mspUIClient = this.mMspUIClient) == null || (currentPresenter = mspUIClient.getCurrentPresenter()) == null) {
            return null;
        }
        final Activity activity = currentPresenter.getActivity();
        try {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            final boolean z2 = actionParamsJson.containsKey(LoginConstants.SHOW_TOAST) ? !TextUtils.equals(actionParamsJson.getString(LoginConstants.SHOW_TOAST), "false") : true;
            if (actionParamsJson.containsKey("type")) {
                z = true ^ TextUtils.equals(actionParamsJson.getString("type"), "read");
            }
            if (actionParamsJson.containsKey("text")) {
                str = actionParamsJson.getString("text");
            } else {
                str = "";
            }
            if (z) {
                if (!TextUtils.isEmpty(str)) {
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.CopyStore.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            boolean z3 = false;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                z3 = PhoneCashierMspEngine.getMspWallet().writeClipData(activity, str, "pay");
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                            }
                            if (z2) {
                                CopyStore.access$000(CopyStore.this, activity, z3);
                            }
                        }
                    });
                }
                return "";
            }
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.CopyStore.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        str2 = PhoneCashierMspEngine.getMspWallet().readClipData(activity, r3, "pay");
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                        str2 = "";
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("pasteboardStr", (Object) str2);
                    LocalEventStore.invokeCallback(eventAction, jSONObject);
                }
            });
            return InvokeActionPlugin.AYSNC_CALLBACK;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }
}
