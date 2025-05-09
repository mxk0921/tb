package com.alipay.android.msp.framework.drm;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MqpConfigService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d84a241a", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_".concat(String.valueOf(str)));
    }

    public static JSONObject getJson(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a8ea448f", new Object[]{str});
        }
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return JSON.parseObject(a2);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace("MqpConfigService", "getJson, value=".concat(String.valueOf(a2)), th);
            return null;
        }
    }

    public static boolean isFalse(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94ae77ee", new Object[]{str})).booleanValue();
        }
        if (!isTrue(str)) {
            return true;
        }
        return false;
    }

    public static boolean isTrue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("471b1a6d", new Object[]{str})).booleanValue();
        }
        return "true".equals(a(str));
    }
}
