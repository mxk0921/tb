package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.preload.PreloadManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PreloadStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PreloadStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(PreloadStore preloadStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/PreloadStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        String str = null;
        if (!(mspUIClient == null || mspUIClient.getCurrentPresenter() == null || this.mContext == null)) {
            if (this.mMspUIClient.getCurrentPresenter().getIView() == null) {
                return null;
            }
            JSONObject actionParamsJson = mspEvent.getActionParamsJson();
            String string = actionParamsJson.getString("page");
            actionParamsJson.getString("action");
            str = "";
            if (!TextUtils.isEmpty(string) && string.contains("bizapp-collect-money")) {
                try {
                    LogUtil.record(1, "PreloadStore.onMspAction", str);
                    PreloadManager.startPreLoad(this.mContext.getApplicationContext());
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
        }
        return str;
    }
}
