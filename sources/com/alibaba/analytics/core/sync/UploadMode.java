package com.alibaba.analytics.core.sync;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum UploadMode {
    REALTIME,
    BATCH,
    LAUNCH,
    INTERVAL,
    DEVELOPMENT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UploadMode uploadMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/sync/UploadMode");
    }

    public static UploadMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadMode) ipChange.ipc$dispatch("3757c63a", new Object[]{str});
        }
        return (UploadMode) Enum.valueOf(UploadMode.class, str);
    }
}
