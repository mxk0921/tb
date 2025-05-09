package com.tmall.android.dai.trigger;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum EventProcessResult {
    RESULT_IGNORE,
    RESULT_CONSUMED,
    RESULT_COMPLETE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(EventProcessResult eventProcessResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/trigger/EventProcessResult");
    }

    public static EventProcessResult valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventProcessResult) ipChange.ipc$dispatch("1f928e8b", new Object[]{str});
        }
        return (EventProcessResult) Enum.valueOf(EventProcessResult.class, str);
    }
}
