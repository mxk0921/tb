package com.alipay.android.msp.drivers.legacyapi;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.drivers.stores.store.events.RpcStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcApi extends JSPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(RpcApi rpcApi, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/legacyapi/RpcApi");
    }

    @Override // com.alipay.android.app.template.JSPlugin
    public int getContextHashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfc6032e", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.android.app.template.JSPlugin
    public String pluginName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a669a95b", new Object[]{this});
        }
        return "RpcApi";
    }

    @Override // com.alipay.android.app.template.JSPlugin
    public Object execute(JSPlugin.FromCall fromCall, String str, String str2, FBDocument fBDocument, long j, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("796c594e", new Object[]{this, fromCall, str, str2, fBDocument, new Long(j), context});
        }
        LogUtil.record(2, "RpcApi:execute", "action=" + str + " ,args=" + str2 + " , doc=" + fBDocument + " , ctx=" + context);
        final EventAction eventAction = new EventAction(str);
        eventAction.setEventFrom("invoke");
        eventAction.setInvokeFunKey(j);
        eventAction.setSender(fBDocument);
        eventAction.setInvokeDoc(fBDocument);
        eventAction.setActionData(str2);
        eventAction.setActionParamsJson(JSON.parseObject(str2));
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.legacyapi.RpcApi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    RpcStore rpcStore = new RpcStore(0);
                    EventAction eventAction2 = eventAction;
                    LocalEventStore.invokeCallback(eventAction, JSON.parseObject(rpcStore.onMspAction(eventAction2, eventAction2.getMspEvents()[0])));
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
            }
        });
        return FBDocument.NO_RESULT;
    }
}
