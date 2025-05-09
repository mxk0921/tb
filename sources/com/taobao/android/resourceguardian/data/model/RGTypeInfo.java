package com.taobao.android.resourceguardian.data.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RGTypeInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_ALL = 999;
    public static final int EVENT_BATTERY_CAPACITY = 401;
    public static final int EVENT_BATTERY_TEMPERATURE = 402;
    public static final int EVENT_CPU_USAGE = 101;
    public static final int EVENT_MEMORY = 201;
    public static final int EVENT_NATIVE_MEMORY = 202;
    public static final int EVENT_TOTAL_PSS_MEMORY = 203;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface RGType {
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c0d0932", new Object[]{new Integer(i)});
        }
        if (i == 101) {
            return "cpuLoad";
        }
        if (i == 201) {
            return "memoryLevel";
        }
        if (i == 202) {
            return "nativeMemoryLevel";
        }
        if (i == 401) {
            return "leftBattery";
        }
        if (i != 402) {
            return "errorType";
        }
        return "batteryTemperature";
    }
}
