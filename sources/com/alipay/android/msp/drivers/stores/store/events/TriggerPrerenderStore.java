package com.alipay.android.msp.drivers.stores.store.events;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.ui.base.PreRendManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.z9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TriggerPrerenderStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public TriggerPrerenderStore(int i) {
        super(i);
    }

    public static /* synthetic */ StEvent access$000(TriggerPrerenderStore triggerPrerenderStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StEvent) ipChange.ipc$dispatch("1d7cb1b2", new Object[]{triggerPrerenderStore});
        }
        return triggerPrerenderStore.mStEvent;
    }

    public static /* synthetic */ MspContext access$100(TriggerPrerenderStore triggerPrerenderStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("44f62fa", new Object[]{triggerPrerenderStore});
        }
        return triggerPrerenderStore.mMspContext;
    }

    public static /* synthetic */ Object ipc$super(TriggerPrerenderStore triggerPrerenderStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/TriggerPrerenderStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspUIClient mspUIClient;
        JSONObject actionParamsJson;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        try {
            MspContext mspContext = this.mMspContext;
            if (mspContext == null || mspContext.getContext() == null || (mspUIClient = this.mMspUIClient) == null || mspUIClient.getCurrentPresenter() == null || this.mMspContext.isUpgradePreRendTpl() || (actionParamsJson = mspEvent.getActionParamsJson()) == null) {
                return null;
            }
            String string = actionParamsJson.getString("tplId");
            String string2 = actionParamsJson.getString("action");
            Activity activity = this.mMspUIClient.getCurrentPresenter().getActivity();
            PreRendManager.OnTplPreRendListener onTplPreRendListener = new PreRendManager.OnTplPreRendListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.TriggerPrerenderStore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.msp.ui.base.PreRendManager.OnTplPreRendListener
                public void onTplPreRendFail(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("496d4923", new Object[]{this, new Integer(i)});
                        return;
                    }
                    LogUtil.record(8, "TriggerPrerenderStore:onMspAction", "onTplPreRendFail=".concat(String.valueOf(i)));
                    TriggerPrerenderStore.access$100(TriggerPrerenderStore.this).getStatisticInfo().addError("tpl", "triggerPrerenderFail", z9u.ARG_ERROR_CODE.concat(String.valueOf(i)));
                }

                @Override // com.alipay.android.msp.ui.base.PreRendManager.OnTplPreRendListener
                public void onTplPreRendSuccess(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9fb79ff9", new Object[]{this, str});
                    } else if (!TextUtils.isEmpty(str)) {
                        if (str.startsWith("QUICKPAY@")) {
                            str = str.substring(9);
                        }
                        TriggerPrerenderStore.access$000(TriggerPrerenderStore.this).onStatistic("action", "triggerPrerender|".concat(String.valueOf(str)));
                    }
                }
            };
            if (!TextUtils.isEmpty(string)) {
                PreRendManager.getInstance().doPreloadTpl(activity, string, this.mBizId, onTplPreRendListener, "event");
            } else if (!TextUtils.isEmpty(string2)) {
                PreRendManager.getInstance().preRendTpl(activity, this.mMspContext.getBizId(), string2, onTplPreRendListener, "event");
            }
            return "{\"result\":true}";
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }
}
