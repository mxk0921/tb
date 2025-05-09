package com.alibaba.ut.abtest.internal.bucketing.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum ExperimentCognationType {
    RootDomain,
    Domain,
    Layer,
    LaunchLayer,
    Unknown;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ExperimentCognationType experimentCognationType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/bucketing/model/ExperimentCognationType");
    }

    public static ExperimentCognationType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExperimentCognationType) ipChange.ipc$dispatch("8a6e570f", new Object[]{str});
        }
        return (ExperimentCognationType) Enum.valueOf(ExperimentCognationType.class, str);
    }
}
