package com.alibaba.analytics.core.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum UTMCLogFields {
    DEVICE_ID,
    AGGREGATION_LOG,
    ALIYUN_PLATFORM_FLAG;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UTMCLogFields uTMCLogFields, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/model/UTMCLogFields");
    }

    public static UTMCLogFields valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTMCLogFields) ipChange.ipc$dispatch("3e081d90", new Object[]{str});
        }
        return (UTMCLogFields) Enum.valueOf(UTMCLogFields.class, str);
    }
}
