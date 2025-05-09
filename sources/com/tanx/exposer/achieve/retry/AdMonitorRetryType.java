package com.tanx.exposer.achieve.retry;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum AdMonitorRetryType {
    DB,
    MEMORY,
    NONE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AdMonitorRetryType adMonitorRetryType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tanx/exposer/achieve/retry/AdMonitorRetryType");
    }

    public static AdMonitorRetryType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorRetryType) ipChange.ipc$dispatch("cfcee1cf", new Object[]{str});
        }
        return (AdMonitorRetryType) Enum.valueOf(AdMonitorRetryType.class, str);
    }
}
