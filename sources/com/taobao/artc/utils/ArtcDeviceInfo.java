package com.taobao.artc.utils;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ArtcDeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int battery_perc;
    public static String brand = Build.BRAND;
    public static boolean is_tmall_cc = false;
    public static int temperature;

    static {
        t2o.a(395313309);
    }

    public ArtcDeviceInfo(Context context) {
        battery_perc = 0;
        temperature = 0;
    }

    public static String convertIPv4ToIPv6(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a28f1d5", new Object[]{str});
        }
        ArtcLog.w("ArtcDeviceInfo", "convertIPv4ToIPv6, ipv4:" + str + ", ipv6:", new Object[0]);
        return "";
    }

    public static boolean isIPv6Only() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eab18368", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean is_tmall_cc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5b89977", new Object[0])).booleanValue();
        }
        return is_tmall_cc;
    }

    public static void set_tmall_cc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d13df4f9", new Object[]{new Boolean(z)});
        } else {
            is_tmall_cc = z;
        }
    }
}
