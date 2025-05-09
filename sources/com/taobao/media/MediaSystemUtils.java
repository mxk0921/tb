package com.taobao.media;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaSystemUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Application sApplication;
    public static boolean sIsApkDebug = true;
    public static boolean sIsSupportWeex = false;
    public static int sNoWifiNotice = 0;

    static {
        t2o.a(774897684);
    }

    public static boolean isApkDebuggable() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4aeae8b", new Object[0])).booleanValue();
        }
        Application application = sApplication;
        if (application == null || !sIsApkDebug) {
            return false;
        }
        try {
            if ((application.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            sIsApkDebug = z;
            return z;
        } catch (Exception e) {
            AVSDKLog.e("", e.getMessage());
            return false;
        }
    }
}
