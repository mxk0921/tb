package com.alipay.apmobilesecuritysdk.apdid;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class OneApdidBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized String getOneData(Context context) {
        synchronized (OneApdidBridge.class) {
            IpChange ipChange = $ipChange;
            if (!(ipChange instanceof IpChange)) {
                return "";
            }
            return (String) ipChange.ipc$dispatch("7d72e319", new Object[]{context});
        }
    }

    public static void initOneSDK(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994ac768", new Object[]{context, map});
        }
    }

    public static boolean needUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be86520a", new Object[0])).booleanValue();
        }
        return false;
    }
}
