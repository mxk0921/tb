package com.alipay.android.msp.drivers.stores.storecenter;

import android.text.TextUtils;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.drivers.stores.store.events.AuthStore;
import com.alipay.android.msp.framework.hardwarepay.old.dialog.ValidateDialogProxy;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ActionStoreCenter extends StoreCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ValidateDialogProxy f3583a = null;

    public ActionStoreCenter(MspContext mspContext) {
        super(mspContext);
    }

    public static /* synthetic */ Object ipc$super(ActionStoreCenter actionStoreCenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/storecenter/ActionStoreCenter");
    }

    public final LocalEventStore b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalEventStore) ipChange.ipc$dispatch("e773f1aa", new Object[]{this, str});
        }
        LocalEventStore localEventStore = this.mPluginsMap.get(str);
        if (localEventStore != null) {
            return localEventStore;
        }
        c(str);
        return this.mPluginsMap.get(str);
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8e4701", new Object[]{this, str});
            return;
        }
        LogUtil.i("ActionStoreCenter", "registerJsPluginWhenHandleAction", "actionName=".concat(String.valueOf(str)));
        if (!TextUtils.equals(str, "continue")) {
            this.mMspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "lazy_register_plugin", "pluginName=".concat(String.valueOf(str)));
            InvokeActionPlugin.registerMspLocalJsPluginWithPluginName(this.mMspContext, str);
        }
    }

    @Override // com.alipay.android.msp.drivers.stores.storecenter.StoreCenter
    public void doCleanBeforeWindowChange(int i) {
        LocalEventStore localEventStore;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a08f7f", new Object[]{this, new Integer(i)});
            return;
        }
        if (!InvokeActionPlugin.isJsPluginRegisterAsync()) {
            localEventStore = this.mPluginsMap.get("auth");
        } else if (this.mMspContext instanceof MspTradeContext) {
            localEventStore = b("auth");
        } else {
            localEventStore = null;
        }
        if (localEventStore instanceof AuthStore) {
            ((AuthStore) localEventStore).beforeFrameChangedClean(i);
        }
    }

    public ValidateDialogProxy getDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValidateDialogProxy) ipChange.ipc$dispatch("2d2c0609", new Object[]{this});
        }
        return this.f3583a;
    }

    public void setDialog(ValidateDialogProxy validateDialogProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a9335e3", new Object[]{this, validateDialogProxy});
        } else {
            this.f3583a = validateDialogProxy;
        }
    }

    @Override // com.alipay.android.msp.drivers.stores.storecenter.StoreCenter
    public String handleAction(EventAction eventAction) {
        MspContext mspContext;
        LocalEventStore localEventStore;
        MspContext mspContext2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f20afaca", new Object[]{this, eventAction});
        }
        if (eventAction == null || (mspContext = this.mMspContext) == null) {
            return "";
        }
        String str = null;
        if (isWholeEventGoDyApi(eventAction, mspContext.getContext())) {
            if (this.mMspContext.getWorkerServiceDoc() != null) {
                if (handleDyApi(eventAction, null)) {
                    return "";
                }
            } else if (((MspWindowClient) this.mMspContext.getMspUIClient()).getContainerPresenter() != null) {
                LogUtil.record(2, "getWorkerServiceDoc", "getActionData=" + eventAction.getActionData());
                this.mMspContext.getStatisticInfo().addError("np", "event_no_main_service", Utils.truncateString(eventAction.getActionData(), 30));
            }
        }
        interceptForStatistics(eventAction);
        EventAction.MspEvent[] mspEvents = eventAction.getMspEvents();
        if (mspEvents != null && mspEvents.length > 0) {
            for (EventAction.MspEvent mspEvent : mspEvents) {
                if (isSingleEventGoDyApi(eventAction, mspEvent, this.mMspContext.getContext())) {
                    if (this.mMspContext.getWorkerServiceDoc() != null) {
                        if (handleDyApi(eventAction, mspEvent)) {
                            continue;
                        }
                    } else if (((MspWindowClient) this.mMspContext.getMspUIClient()).getContainerPresenter() != null) {
                        LogUtil.record(2, "getWorkerServiceDoc", "getActionData=" + eventAction.getActionData());
                        this.mMspContext.getStatisticInfo().addError("np", "event_no_main_service", mspEvent.getActionName());
                    }
                }
                if (!InvokeActionPlugin.isJsPluginRegisterAsync()) {
                    localEventStore = this.mPluginsMap.get(mspEvent.getActionName());
                } else {
                    localEventStore = b(mspEvent.getActionName());
                }
                if (localEventStore == null) {
                    continue;
                } else if (TextUtils.equals(mspEvent.getActionName(), "submit") && (mspContext2 = this.mMspContext) != null && ((MspTradeContext) mspContext2).isSubmitState()) {
                    return "";
                } else {
                    str = localEventStore.onstMspAction(eventAction, mspEvent);
                }
            }
        }
        return str;
    }
}
