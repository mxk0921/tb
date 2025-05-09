package com.alipay.android.msp.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DateUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String format() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9662a762", new Object[0]) : ThreadSafeDateFormat.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS");
    }

    public static String formatHms() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("931b6c2", new Object[0]);
        }
        return ThreadSafeDateFormat.format(new Date(), "HH:mm:ss");
    }

    public static String format(Long l) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62165103", new Object[]{l}) : ThreadSafeDateFormat.format(new Date(l.longValue()), "yyyy-MM-dd HH:mm:ss:SSS");
    }
}
