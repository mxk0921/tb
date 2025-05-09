package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ReloadStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ReloadStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(ReloadStore reloadStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/ReloadStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        if (mspUIClient == null || mspUIClient.getCurrentPresenter() == null) {
            return null;
        }
        MspBasePresenter currentPresenter = this.mMspUIClient.getCurrentPresenter();
        if (currentPresenter.getIView() == null) {
            return null;
        }
        currentPresenter.getIView().addMaskView();
        String actionData = eventAction.getActionData();
        LogUtil.record(4, "phonecashiermsp#flybird", "ReloadEvent:onDialogAction", "reload:".concat(String.valueOf(actionData)));
        JSONObject parseObject = JSON.parseObject(actionData);
        if (!parseObject.containsKey("param")) {
            return "";
        }
        JSONObject jSONObject = parseObject.getJSONObject("param");
        Iterator<String> it = jSONObject.keySet().iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            String next = it.next();
            String string = jSONObject.getString(next);
            sb.append("'");
            sb.append(next);
            sb.append("=");
            sb.append(string);
            sb.append("'");
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return "";
        }
        PluginManager.getRender().callRenderReload(sb.toString());
        return "";
    }
}
