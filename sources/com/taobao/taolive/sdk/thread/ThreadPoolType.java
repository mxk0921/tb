package com.taobao.taolive.sdk.thread;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum ThreadPoolType {
    MTOP,
    IO,
    NORMAL;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ThreadPoolType threadPoolType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/thread/ThreadPoolType");
    }

    public static ThreadPoolType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolType) ipChange.ipc$dispatch("6c6cf330", new Object[]{str});
        }
        return (ThreadPoolType) Enum.valueOf(ThreadPoolType.class, str);
    }
}
