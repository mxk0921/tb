package com.taobao.themis.taobao.initializer.kernel;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum TMSInitTaskExecutorType {
    SYNC,
    IDLE,
    NORMAL,
    IO,
    NETWORK;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TMSInitTaskExecutorType tMSInitTaskExecutorType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/initializer/kernel/TMSInitTaskExecutorType");
    }

    public static TMSInitTaskExecutorType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSInitTaskExecutorType) ipChange.ipc$dispatch("bc9e0268", new Object[]{str});
        }
        return (TMSInitTaskExecutorType) Enum.valueOf(TMSInitTaskExecutorType.class, str);
    }
}
