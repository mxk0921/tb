package com.alibaba.ut.abtest.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum EventType {
    FeatureData,
    ExperimentV5Data,
    BetaExperimentV5Data,
    User;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(EventType eventType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/event/EventType");
    }

    public static EventType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventType) ipChange.ipc$dispatch("490299b8", new Object[]{str});
        }
        return (EventType) Enum.valueOf(EventType.class, str);
    }
}
