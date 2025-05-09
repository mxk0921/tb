package com.alipay.android.msp.core.clients;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.net.ViSourceUtil;
import com.alipay.mobile.verifyidentity.proxy.rpc.VIMessageChannelCallback;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspViClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MspTradeContext f3544a;
    public String b;
    public VIMessageChannelCallback c = null;

    public MspViClient(MspTradeContext mspTradeContext) {
        this.f3544a = mspTradeContext;
    }

    public VIMessageChannelCallback getVIMessageChannelCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VIMessageChannelCallback) ipChange.ipc$dispatch("a5658081", new Object[]{this});
        }
        return this.c;
    }

    public void onVidEnd(Bundle bundle, VIMessageChannelCallback vIMessageChannelCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6766dfc", new Object[]{this, bundle, vIMessageChannelCallback});
            return;
        }
        this.c = vIMessageChannelCallback;
        LogUtil.i("MspViClient", "onVidEnd", "confirmAct:" + bundle.getString("confirmAct"));
        try {
            String string = bundle.getString("data");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("VIData", (Object) JSON.parseObject(string));
            ViSourceUtil.requestRpcData(bundle.getString("confirmAct"), jSONObject.toString(), bundle.getInt("bizId"), vIMessageChannelCallback);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace("MspViClient", "onVidEnd", e);
        }
    }

    public void setNextVid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02312ed", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void onVerifyidEnd(int i, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea2e762", new Object[]{this, new Integer(i), str, str2, str3, new Boolean(z)});
            return;
        }
        LogUtil.i("MspViClient", "onVerifyidEnd", ":actionString:paramString" + str + " " + str2 + " " + str3 + " " + z);
        if (this.f3544a != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endCode", (Object) str3);
            jSONObject.put("notExitAfterVid", (Object) Boolean.valueOf(z));
            AlertIntelligenceEngine.startAction(this.f3544a, "act", MspEventTypes.ACTION_STRING_VID, jSONObject.toJSONString(), "", "");
        }
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.c = null;
                LogUtil.i("MspViClient", "onVerifyidEnd", "nextVid：" + this.b + " ");
                if (!TextUtils.isEmpty(this.b)) {
                    JSONObject parseObject = JSON.parseObject(this.b);
                    JSONObject parseObject2 = JSON.parseObject(parseObject.getString("VIData"));
                    String string = parseObject2.getString(MspEventTypes.ACTION_STRING_VID);
                    String string2 = parseObject2.getString("data");
                    LogUtil.i("MspViClient", "onVerifyidEnd", "verifyId::verifyData" + string + " " + string2);
                    this.b = null;
                    PhoneCashierMspEngine.getMspViSec().unifiedStartByVerifyIdentity(i, string, string2, parseObject.toString());
                } else if (!str3.equals("1000") && !z) {
                    ActionsCreator.get(this.f3544a).createEventAction(new EventAction("exit"));
                }
            } else {
                JSONObject parseObject3 = JSON.parseObject(str);
                if (parseObject3.containsKey("params")) {
                    JSONObject jSONObject2 = parseObject3.getJSONObject("params");
                    JSONObject parseObject4 = JSON.parseObject(jSONObject2.toString());
                    if (parseObject4.containsKey(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI)) {
                        String string3 = parseObject4.getString(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
                        parseObject4.remove(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
                        parseObject4.put("name", (Object) string3);
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject2 = JsonUtil.merge(jSONObject2, JSON.parseObject(str2));
                        }
                        parseObject4.put("params", (Object) jSONObject2);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("action", (Object) parseObject4);
                        if (parseObject3.containsKey(MspWebActivity.LOADTXT)) {
                            parseObject4.put(MspWebActivity.LOADTXT, parseObject3.get(MspWebActivity.LOADTXT));
                        }
                        ActionsCreator.get(this.f3544a).createEventAction(MspEventCreator.get().createMspEvent("MspViClient.onVerifyidEnd", jSONObject3));
                    }
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace("MspViClient", "onVerifyidEnd", e);
        }
    }
}
