package com.alibaba.security.ccrc.enums;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum RunState {
    INITIAL,
    PREPARING,
    PREPARE_SUCCESS,
    ACTIVE_ING,
    ACTIVE_WAITING,
    ACTIVE_SUCCESS;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(RunState runState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/enums/RunState");
    }

    public static RunState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RunState) ipChange.ipc$dispatch("6ceef579", new Object[]{str});
        }
        return (RunState) Enum.valueOf(RunState.class, str);
    }
}
