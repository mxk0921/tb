package com.alipay.security.mobile.cache;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AuthenticatorModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FILE_NAME = "iotauth.biometric.authticator.model";
    private static final String KEY_ALIPAY_UID = "alipay_user_id";
    private static final String KEY_FP_CLIENT_STATUS = "ifaa_client_status_";

    public static String getClientStatus(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f388b272", new Object[]{context});
        }
        String tempUserId = getTempUserId(context);
        if (TextUtils.isEmpty(tempUserId)) {
            return "2";
        }
        CacheUtils instance = CacheUtils.getInstance(context, FILE_NAME);
        String localData = instance.getLocalData(KEY_FP_CLIENT_STATUS + tempUserId);
        return TextUtils.isEmpty(localData) ? "2" : localData;
    }

    public static String getTempUserId(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fda30cf", new Object[]{context});
        }
        return CacheUtils.getInstance(context, FILE_NAME).getLocalData("alipay_user_id");
    }

    public static void saveClientStatus(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacbaf3b", new Object[]{context, str, str2});
        } else if (!TextUtils.isEmpty(str2)) {
            saveUserIdTemp(context, str2);
            CacheUtils instance = CacheUtils.getInstance(context, FILE_NAME);
            instance.addToLocalData(KEY_FP_CLIENT_STATUS + str2, str);
            CacheUtils instance2 = CacheUtils.getInstance(context, FILE_NAME);
            instance2.pushToPref(KEY_FP_CLIENT_STATUS + str2, str);
        }
    }

    public static void saveUserIdTemp(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc96334", new Object[]{context, str});
            return;
        }
        CacheUtils.getInstance(context, FILE_NAME).addToLocalData("alipay_user_id", str);
        CacheUtils.getInstance(context, FILE_NAME).pushToPref("alipay_user_id", str);
    }
}
