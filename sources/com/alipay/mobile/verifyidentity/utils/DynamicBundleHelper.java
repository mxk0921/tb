package com.alipay.mobile.verifyidentity.utils;

import android.content.Context;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bcq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DynamicBundleHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUNDLE_KEY_ZFACE = "biometric";

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            Class.forName("com.alipay.mobile.security.zim.api.ZIMFacade");
            VerifyLogger.getInstance().eventBehavior("UC-MobileIC-20241015-2", "", "", "", null);
            return true;
        } catch (Exception unused) {
            VerifyLogger.getInstance().eventBehavior("UC-MobileIC-20241015-1", "", "", "", null);
            return false;
        }
    }

    public static void injectBundle(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225762d8", new Object[]{context, str});
        } else {
            bcq.a().f(context, str);
        }
    }

    public static boolean isBundleEnable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0341844", new Object[]{str})).booleanValue();
        }
        str.hashCode();
        if (!str.equals(BUNDLE_KEY_ZFACE)) {
            return false;
        }
        return a();
    }
}
