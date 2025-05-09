package com.alipay.android.msp.configservice;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.plugin.engine.IBizEngine;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ConfigFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3530a;

    public ConfigFetcher(Context context) {
        this.f3530a = context;
    }

    public JSONObject buildParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e06e8c45", new Object[]{this, str});
        }
        JSONObject rpcParams = RPCParams.getRpcParams(this.f3530a);
        if (!TextUtils.isEmpty(str)) {
            rpcParams.put("lastResponseTime", (Object) str);
        } else {
            try {
                rpcParams.remove("lastResponseTime");
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return rpcParams;
    }

    public JSONObject fetch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5635d8eb", new Object[]{this, str});
        }
        JSONObject buildParams = buildParams(str);
        IBizEngine mspUtils = PhoneCashierMspEngine.getMspUtils();
        return mspUtils.executeRpc(false, "alipay.client.switches.all.get.outside", "[" + buildParams.toString() + "]", -1, null);
    }
}
