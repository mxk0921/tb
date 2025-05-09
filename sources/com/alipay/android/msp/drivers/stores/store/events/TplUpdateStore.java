package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.IRender;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.birdnest.render.api.MspRenderImpl;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TplUpdateStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public TplUpdateStore(int i) {
        super(i);
    }

    public static JSONObject a(ArrayList<String> arrayList, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58cbd6ac", new Object[]{arrayList, str});
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(arrayList);
        jSONObject.put("updatedArr", (Object) jSONArray);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("error", (Object) str);
        }
        return jSONObject;
    }

    public static /* synthetic */ JSONObject access$000(TplUpdateStore tplUpdateStore, ArrayList arrayList, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7ec12c9d", new Object[]{tplUpdateStore, arrayList, str});
        }
        return a(arrayList, str);
    }

    public static /* synthetic */ Object ipc$super(TplUpdateStore tplUpdateStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/TplUpdateStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        final ArrayList arrayList = new ArrayList();
        try {
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            if (actionParamsJson == null) {
                return a(arrayList, "").toJSONString();
            }
            final JSONObject jSONObject = actionParamsJson.getJSONObject("tplInfoDict");
            if (jSONObject == null) {
                return a(arrayList, "必须包含 tplInfoDict 参数").toJSONString();
            }
            final IRender render = PluginManager.getRender();
            if (!(render instanceof MspRenderImpl)) {
                LogUtil.record(8, "TplUpdateStore", "render is ".concat(String.valueOf(render)));
                return a(arrayList, "系统错误").toJSONString();
            }
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.TplUpdateStore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MspRenderImpl mspRenderImpl = (MspRenderImpl) render;
                    String str = "";
                    for (String str2 : jSONObject.keySet()) {
                        try {
                            arrayList.add(mspRenderImpl.notifyTplUpdate(str2, jSONObject.getString(str2)).tplId);
                            LogUtil.record(2, "TplUpdateStore", "download success ".concat(String.valueOf(str2)));
                        } catch (Throwable th) {
                            if (TextUtils.isEmpty(str)) {
                                str = "download error: ".concat(String.valueOf(str2));
                            } else {
                                str = str + ", " + str2;
                            }
                            LogUtil.record(8, "TplUpdateStore", "download error ".concat(String.valueOf(str2)));
                            LogUtil.printExceptionStackTrace(th);
                        }
                    }
                    LocalEventStore.invokeCallback(eventAction, TplUpdateStore.access$000(TplUpdateStore.this, arrayList, str));
                }
            });
            return InvokeActionPlugin.AYSNC_CALLBACK;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return a(arrayList, "").toJSONString();
        }
    }
}
