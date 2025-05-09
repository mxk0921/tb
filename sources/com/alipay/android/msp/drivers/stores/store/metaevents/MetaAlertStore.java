package com.alipay.android.msp.drivers.stores.store.metaevents;

import android.app.Activity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialog;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MetaAlertStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3580a;

    public MetaAlertStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(MetaAlertStore metaAlertStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/metaevents/MetaAlertStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || this.mContext == null || this.mMspUIClient == null) {
            return null;
        }
        final JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return "";
        }
        this.f3580a = FlybirdDialogImpl.antDialogEnable(this.mContext);
        final FlybirdDialogEventDesc.DialogCallback dialogCallback = new FlybirdDialogEventDesc.DialogCallback() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaAlertStore.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc.DialogCallback
            public void onCallback(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bd79f2d5", new Object[]{this, str});
                } else {
                    Utils.sendToDocument(eventAction, str);
                }
            }
        };
        MspBasePresenter currentPresenter = this.mMspUIClient.getCurrentPresenter();
        if (currentPresenter == null) {
            return InvokeActionPlugin.AYSNC_CALLBACK;
        }
        final Activity activity = currentPresenter.getActivity();
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.metaevents.MetaAlertStore.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    MetaAlertStore.access$000(MetaAlertStore.this, activity, actionParamsJson, dialogCallback);
                }
            }
        });
        return InvokeActionPlugin.AYSNC_CALLBACK;
    }

    public static /* synthetic */ void access$000(MetaAlertStore metaAlertStore, Activity activity, JSONObject jSONObject, FlybirdDialogEventDesc.DialogCallback dialogCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d284883e", new Object[]{metaAlertStore, activity, jSONObject, dialogCallback});
        } else if (activity != null && !activity.isFinishing() && jSONObject != null) {
            LogUtil.record(1, "MetaAlertStore:showFlybirdDialog", "activity=".concat(String.valueOf(activity)));
            String string = jSONObject.getString("message");
            String string2 = jSONObject.getString("title");
            JSONArray jSONArray = jSONObject.getJSONArray("buttons");
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null && jSONArray.size() > 0) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (metaAlertStore.f3580a) {
                        if (i == 0) {
                            jSONObject2.put("ok", (Object) "1");
                        }
                        jSONObject2.put("index", (Object) String.valueOf(i));
                        jSONObject2.put("clickIndex", (Object) String.valueOf(i + 1));
                    } else {
                        jSONObject2.put("ok", (Object) String.valueOf(i));
                    }
                    arrayList.add(FlybirdDialogEventDesc.build(jSONArray.getString(i), jSONObject2, dialogCallback));
                }
            }
            FlybirdDialog.showDialogV2(activity, string2, string, arrayList);
        }
    }
}
