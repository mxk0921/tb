package com.alibaba.ut.abtest.bucketing.feature;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum FeatureType {
    Crowd;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(FeatureType featureType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/bucketing/feature/FeatureType");
    }

    public static FeatureType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FeatureType) ipChange.ipc$dispatch("65ae6db7", new Object[]{str});
        }
        return (FeatureType) Enum.valueOf(FeatureType.class, str);
    }
}
