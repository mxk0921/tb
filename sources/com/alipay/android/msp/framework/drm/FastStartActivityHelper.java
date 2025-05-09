package com.alipay.android.msp.framework.drm;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FastStartActivityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String CONFIG_KEY = "MQP_fast_start_exp";
    public static boolean mConfigGetExperiment;

    public static boolean getBoolConfig(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b71e41ad", new Object[]{context, str})).booleanValue();
        }
        if (mConfigGetExperiment) {
            return TextUtils.equals("10000", PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_".concat(String.valueOf(str))));
        }
        if (context == null || !DrmManager.getInstance(context).isGray(str, false, context)) {
            return false;
        }
        return true;
    }

    public static JSONObject getJsonConfig(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee71118b", new Object[]{context, str});
        }
        if (mConfigGetExperiment) {
            try {
                return JSON.parseObject(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_".concat(String.valueOf(str))));
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return null;
            }
        } else if (context == null) {
            return null;
        } else {
            return DrmManager.getInstance(context).getDrmValueFromKey(str);
        }
    }

    public static void init(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcf041d", new Object[]{new Boolean(z)});
        } else {
            mConfigGetExperiment = false;
        }
    }
}
