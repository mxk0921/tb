package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialog;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AlertStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3570a;

    public AlertStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(AlertStore alertStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/AlertStore");
    }

    public static void showAntDialog(Activity activity, JSONObject jSONObject, FlybirdDialogEventDesc.DialogCallback dialogCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33561fd", new Object[]{activity, jSONObject, dialogCallback});
        } else {
            LogUtil.record(8, "AlertStore:showAntDialog", "activity=".concat(String.valueOf(activity)));
        }
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, final EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || this.mMspUIClient == null || eventAction == null) {
            return null;
        }
        this.f3570a = FlybirdDialogImpl.antDialogEnable(this.mContext);
        final FlybirdDialogEventDesc.DialogCallback dialogCallback = new FlybirdDialogEventDesc.DialogCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.AlertStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc.DialogCallback
            public void onCallback(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bd79f2d5", new Object[]{this, str});
                    return;
                }
                if (!TextUtils.equals(eventAction.getEventFrom(), "invoke")) {
                    if (eventAction.getTemplateClickCallback() != null) {
                        eventAction.getTemplateClickCallback().onClickCallback(str);
                    } else {
                        PluginManager.getRender().callRender(str);
                    }
                }
                Utils.sendToDocument(eventAction, str);
            }
        };
        MspBasePresenter currentPresenter = this.mMspUIClient.getCurrentPresenter();
        if (currentPresenter == null) {
            return InvokeActionPlugin.AYSNC_CALLBACK;
        }
        final Activity activity = currentPresenter.getActivity();
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.AlertStore.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AlertStore.access$000(AlertStore.this, activity, mspEvent, dialogCallback);
                }
            }
        });
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }

    public static /* synthetic */ void access$000(AlertStore alertStore, Activity activity, EventAction.MspEvent mspEvent, FlybirdDialogEventDesc.DialogCallback dialogCallback) {
        boolean z;
        Object obj;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebe8423", new Object[]{alertStore, activity, mspEvent, dialogCallback});
        } else if (activity != null && !activity.isFinishing()) {
            LogUtil.record(1, "AlertStore:showFlybirdDialog", "activity=".concat(String.valueOf(activity)));
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            String string = actionParamsJson.getString("title");
            String string2 = actionParamsJson.getString("message");
            String string3 = actionParamsJson.getString(MspFlybirdDefine.FLYBIRD_DIALOG_CANCEL);
            String string4 = actionParamsJson.getString(MspFlybirdDefine.FLYBIRD_DIALOG_OK);
            String string5 = actionParamsJson.getString(MspFlybirdDefine.FLYBIRD_DIALOG_OTHER);
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = null;
            String str = "0";
            if (!TextUtils.isEmpty(string3)) {
                if (alertStore.f3570a) {
                    jSONObject = new JSONObject();
                    jSONObject.put("index", (Object) str);
                    jSONObject.put("clickIndex", (Object) str);
                } else {
                    jSONObject = null;
                }
                arrayList.add(FlybirdDialogEventDesc.build(string3, jSONObject, dialogCallback));
                z = true;
            } else {
                z = false;
            }
            if (!TextUtils.isEmpty(string5)) {
                if (alertStore.f3570a) {
                    jSONObject2 = new JSONObject();
                    if (z) {
                        obj = "2";
                    } else {
                        obj = "1";
                    }
                    jSONObject2.put("index", obj);
                    jSONObject2.put("clickIndex", (Object) "2");
                }
                arrayList.add(FlybirdDialogEventDesc.build(string5, jSONObject2, dialogCallback));
            }
            if (!TextUtils.isEmpty(string4)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("ok", (Object) "1");
                if (alertStore.f3570a) {
                    if (z) {
                        str = "1";
                    }
                    jSONObject3.put("index", (Object) str);
                    jSONObject3.put("clickIndex", (Object) "1");
                }
                arrayList.add(FlybirdDialogEventDesc.build(string4, jSONObject3, dialogCallback));
            }
            if (arrayList.size() > 2) {
                Collections.reverse(arrayList);
            }
            FlybirdDialog.showDialogV2(activity, string, string2, arrayList);
        }
    }
}
