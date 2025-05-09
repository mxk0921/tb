package com.taobao.appbundle.scheduler;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum Priority {
    LOW,
    MEDIUM,
    HIGH,
    IMMEDIATE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(Priority priority, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appbundle/scheduler/Priority");
    }

    public static Priority valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Priority) ipChange.ipc$dispatch("9f993fd3", new Object[]{str});
        }
        return (Priority) Enum.valueOf(Priority.class, str);
    }
}
