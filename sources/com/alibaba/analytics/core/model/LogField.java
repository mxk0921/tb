package com.alibaba.analytics.core.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum LogField {
    IMEI,
    IMSI,
    BRAND,
    DEVICE_MODEL,
    RESOLUTION,
    CARRIER,
    ACCESS,
    ACCESS_SUBTYPE,
    CHANNEL,
    APPKEY,
    APPVERSION,
    LL_USERNICK,
    USERNICK,
    LL_USERID,
    USERID,
    LANGUAGE,
    OS,
    OSVERSION,
    SDKVERSION,
    START_SESSION_TIMESTAMP,
    UTDID,
    SDKTYPE,
    RESERVE2,
    RESERVE3,
    RESERVE4,
    RESERVE5,
    RESERVES,
    RECORD_TIMESTAMP,
    PAGE,
    EVENTID,
    ARG1,
    ARG2,
    ARG3,
    ARGS;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(LogField logField, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/model/LogField");
    }

    public static LogField valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogField) ipChange.ipc$dispatch("ec70228", new Object[]{str});
        }
        return (LogField) Enum.valueOf(LogField.class, str);
    }
}
