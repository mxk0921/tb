package com.taobao.themis.kernel.executor;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum ExecutorType {
    SYNC,
    UI,
    JSAPI,
    MANIFEST,
    AUDIO,
    URGENT,
    NORMAL,
    IO,
    NETWORK,
    IDLE,
    SERIAL,
    URGENT_DISPLAY;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ExecutorType executorType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/executor/ExecutorType");
    }

    public static ExecutorType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorType) ipChange.ipc$dispatch("81d471ff", new Object[]{str});
        }
        return (ExecutorType) Enum.valueOf(ExecutorType.class, str);
    }
}
