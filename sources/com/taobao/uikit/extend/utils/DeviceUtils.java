package com.taobao.uikit.extend.utils;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DeviceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(932184192);
    }

    public static boolean isHUWEIDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea7bb325", new Object[0])).booleanValue();
        }
        return SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean isMIUIDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7df980db", new Object[0])).booleanValue();
        }
        return "Xiaomi".equals(Build.MANUFACTURER);
    }

    public static boolean isMeizuDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdedcb43", new Object[0])).booleanValue();
        }
        return "Meizu".endsWith(Build.MANUFACTURER);
    }
}
