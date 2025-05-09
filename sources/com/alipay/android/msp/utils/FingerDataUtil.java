package com.alipay.android.msp.utils;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.framework.hardwarepay.old.fingerprint.FingerprintPayHelper;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerDataUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean checkFingerUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44de4923", new Object[]{str})).booleanValue();
        }
        String fingerUserStatus = getFingerUserStatus(str);
        if (TextUtils.isEmpty(fingerUserStatus) || TextUtils.equals("2", fingerUserStatus)) {
            return true;
        }
        return false;
    }

    public static String getFingerUserStatus(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1636a789", new Object[]{jSONObject, str});
        }
        if (jSONObject == null || !jSONObject.getBooleanValue(MspFlybirdDefine.FLYBIRD_FINGERPAY)) {
            return "";
        }
        return getFingerUserStatus(str);
    }

    private static String getFingerUserStatus(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d98353", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return (String) TaskHelper.submitTask(new Callable<Object>() { // from class: com.alipay.android.msp.utils.FingerDataUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.Callable
                public Object call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ipChange2.ipc$dispatch("6d249ded", new Object[]{this});
                    }
                    try {
                        if (FingerprintPayHelper.getInstance().checkUserStatus(str) == 2) {
                            return "2";
                        }
                        return "1";
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                        return "";
                    }
                }
            }).get(3000L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return "";
        }
    }
}
