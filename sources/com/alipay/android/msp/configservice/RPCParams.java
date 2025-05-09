package com.alipay.android.msp.configservice;

import android.content.Context;
import android.os.Build;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.android.alibaba.ip.runtime.IpChange;
import tb.upx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RPCParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f3535a;

    public static synchronized JSONObject getRpcParams(Context context) {
        synchronized (RPCParams.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("9ad7bb4c", new Object[]{context});
            }
            if (f3535a == null) {
                f3535a = new JSONObject();
                DeviceInfo deviceInfo = new DeviceInfo();
                f3535a.put(upx.PRODUCT_ID, (Object) "ALIPAY_SDK_ANDROID");
                f3535a.put("systemType", (Object) "android");
                f3535a.put("clientVersion", (Object) GlobalSdkConstant.getMspVersion());
                f3535a.put("mobileBrand", (Object) Build.BRAND);
                f3535a.put("mobileModel", (Object) Build.MODEL);
                f3535a.put("osVersion", (Object) Build.VERSION.RELEASE);
                f3535a.put("romVersion", (Object) deviceInfo.getRomVersion());
                f3535a.put("manufacturer", (Object) deviceInfo.getManufacturer());
                f3535a.put("appName", (Object) GlobalHelper.getInstance().getPackageName());
                f3535a.put("utdid", (Object) GlobalHelper.getInstance().getUtdid(context));
            }
            return f3535a;
        }
    }
}
