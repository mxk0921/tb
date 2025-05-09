package com.taobao.android.external;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum UCPReachViewOpenState {
    OPEN,
    WAIT,
    TERMINATION;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UCPReachViewOpenState uCPReachViewOpenState, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/external/UCPReachViewOpenState");
    }

    public static UCPReachViewOpenState valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCPReachViewOpenState) ipChange.ipc$dispatch("ac747a2a", new Object[]{str});
        }
        return (UCPReachViewOpenState) Enum.valueOf(UCPReachViewOpenState.class, str);
    }
}
