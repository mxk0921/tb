package com.android.taobao.aop.report;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum ReportType {
    RESOURCE,
    ASSETS;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ReportType reportType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/android/taobao/aop/report/ReportType");
    }

    public static ReportType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReportType) ipChange.ipc$dispatch("105259a3", new Object[]{str});
        }
        return (ReportType) Enum.valueOf(ReportType.class, str);
    }
}
