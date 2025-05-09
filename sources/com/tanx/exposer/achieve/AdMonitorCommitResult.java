package com.tanx.exposer.achieve;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum AdMonitorCommitResult {
    COMMITED,
    PARAMS_ERROR,
    INTERNAL_ERROR;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AdMonitorCommitResult adMonitorCommitResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tanx/exposer/achieve/AdMonitorCommitResult");
    }

    public static AdMonitorCommitResult valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorCommitResult) ipChange.ipc$dispatch("c96fb3aa", new Object[]{str});
        }
        return (AdMonitorCommitResult) Enum.valueOf(AdMonitorCommitResult.class, str);
    }
}
