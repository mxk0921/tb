package com.alipay.android.msp.drivers.legacyapi;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.events.FeedbackStore;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FeedbackApi extends JSPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(FeedbackApi feedbackApi, String str, Object... objArr) {
        if (str.hashCode() == -1503024805) {
            return super.pluginName();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/legacyapi/FeedbackApi");
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
        return super.pluginName();
    }

    @Override // com.alipay.android.app.template.JSPlugin
    public Object execute(JSPlugin.FromCall fromCall, String str, String str2, FBDocument fBDocument, long j, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("796c594e", new Object[]{this, fromCall, str, str2, fBDocument, new Long(j), context});
        }
        LogUtil.record(2, "FeedbackApi:execute", "action=" + str + " ,args=" + str2 + " , doc=" + fBDocument + " , ctx=" + context);
        EventAction eventAction = new EventAction(str);
        eventAction.setEventFrom("invoke");
        eventAction.setInvokeFunKey(j);
        eventAction.setSender(fBDocument);
        eventAction.setInvokeDoc(fBDocument);
        eventAction.setActionData(str2);
        eventAction.setActionParamsJson(JSON.parseObject(str2));
        new FeedbackStore(-1).onMspAction(eventAction, eventAction.getMspEvents()[0]);
        return "{}";
    }
}
