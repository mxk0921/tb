package com.android.taobao.aop;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ANDROID_OS_BUILD_PROXY {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(497025029);
    }

    private static boolean limitedOS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bee13689", new Object[0])).booleanValue();
        }
        if (Globals.getApplication().getApplicationInfo().targetSdkVersion < 29 || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    public static String proxy_getSerial() {
        String serial;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16a75c40", new Object[0]);
        }
        if (!limitedOS() && Build.VERSION.SDK_INT >= 26) {
            try {
                serial = Build.getSerial();
                return serial;
            } catch (SecurityException unused) {
            }
        }
        return "unknown";
    }
}
