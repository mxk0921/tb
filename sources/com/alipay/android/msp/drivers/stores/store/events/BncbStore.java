package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BncbStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BncbStore(int i) {
        super(i);
    }

    public static JSONObject a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("be7a595a", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception unused) {
            JSONObject jSONObject2 = new JSONObject();
            for (String str2 : str.split(",")) {
                String[] split2 = str2.substring(1, str2.length() - 1).split("=");
                if (split2.length >= 2) {
                    try {
                        jSONObject2.put(split2[0], (Object) split2[1]);
                    } catch (Throwable unused2) {
                    }
                }
            }
            return jSONObject2;
        }
    }

    public static /* synthetic */ Object ipc$super(BncbStore bncbStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/BncbStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        StringBuilder sb = new StringBuilder();
        if (mspEvent.getActionParamsArray() != null) {
            int length = mspEvent.getActionParamsArray().length;
            for (int i = 0; i < length; i++) {
                String str = mspEvent.getActionParamsArray()[i];
                sb.append("'");
                sb.append(str);
                sb.append("'");
                if (i < length - 1) {
                    sb.append(",");
                }
            }
            LogUtil.record(4, "phonecashiermsp#flybird", "LocBncbStore.onDialogAction", "type[bncb] type.getParams():".concat(String.valueOf(sb)));
        } else {
            String actionData = eventAction.getActionData();
            if (mspEvent.getActionParamsJson() != null) {
                sb.append(mspEvent.getActionParamsJson().toJSONString());
            } else if (!TextUtils.isEmpty(actionData)) {
                if (JsonUtil.isJsonObjectString(actionData)) {
                    sb.append(actionData);
                    LogUtil.record(4, "phonecashiermsp#flybird", "LocBncbStore.onDialogAction.isjson", actionData);
                } else if (actionData.contains(f7l.BRACKET_START_STR) && actionData.contains(f7l.BRACKET_END_STR)) {
                    String substring = actionData.substring(actionData.indexOf(f7l.BRACKET_START_STR) + 1, actionData.indexOf(f7l.BRACKET_END_STR));
                    sb.append(substring);
                    LogUtil.record(4, "phonecashiermsp#flybird", "LocBncbStore.onDialogAction.notJson", substring);
                }
            }
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return null;
        }
        StEvent stEvent = this.mStEvent;
        stEvent.onStatistic("action", "bncb|" + Utils.truncateString(sb2, 50));
        if (this.mMspUIClient == null) {
            return null;
        }
        ITemplateClickCallback templateClickCallback = eventAction.getTemplateClickCallback();
        if (templateClickCallback == null) {
            PluginManager.getRender().callRender(sb2);
            return "";
        }
        templateClickCallback.onClickCallback(a(sb2).toJSONString());
        return "";
    }
}
