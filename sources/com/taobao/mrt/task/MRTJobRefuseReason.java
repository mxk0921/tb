package com.taobao.mrt.task;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum MRTJobRefuseReason {
    MRTJobRefuseReasonNone,
    MRTJobRefuseReasonBug,
    MRTJobRefuseThreadExceed;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MRTJobRefuseReason mRTJobRefuseReason, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/task/MRTJobRefuseReason");
    }

    public static MRTJobRefuseReason valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTJobRefuseReason) ipChange.ipc$dispatch("21f264af", new Object[]{str});
        }
        return (MRTJobRefuseReason) Enum.valueOf(MRTJobRefuseReason.class, str);
    }
}
