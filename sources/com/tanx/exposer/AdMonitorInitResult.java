package com.tanx.exposer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum AdMonitorInitResult {
    SUCCESS,
    PARAMS_ERROR,
    INTERNAL_ERROR;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AdMonitorInitResult adMonitorInitResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tanx/exposer/AdMonitorInitResult");
    }

    public static AdMonitorInitResult valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorInitResult) ipChange.ipc$dispatch("cac37573", new Object[]{str});
        }
        return (AdMonitorInitResult) Enum.valueOf(AdMonitorInitResult.class, str);
    }
}
