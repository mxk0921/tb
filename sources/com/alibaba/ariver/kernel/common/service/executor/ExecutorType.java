package com.alibaba.ariver.kernel.common.service.executor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum ExecutorType {
    SYNC,
    UI,
    URGENT_DISPLAY,
    URGENT,
    NORMAL,
    IO,
    NETWORK,
    IDLE,
    SERIAL;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ExecutorType executorType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/kernel/common/service/executor/ExecutorType");
    }

    public static ExecutorType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorType) ipChange.ipc$dispatch("d46584b2", new Object[]{str});
        }
        return (ExecutorType) Enum.valueOf(ExecutorType.class, str);
    }
}
