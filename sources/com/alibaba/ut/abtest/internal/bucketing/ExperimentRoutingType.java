package com.alibaba.ut.abtest.internal.bucketing;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum ExperimentRoutingType {
    Utdid,
    UserId;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ExperimentRoutingType experimentRoutingType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/bucketing/ExperimentRoutingType");
    }

    public static ExperimentRoutingType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentRoutingType) ipChange.ipc$dispatch("b9074965", new Object[]{str});
        }
        return (ExperimentRoutingType) Enum.valueOf(ExperimentRoutingType.class, str);
    }
}
