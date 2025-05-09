package com.alibaba.wireless.aliprivacy;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum AuthStatus {
    UNKNOWN,
    FIRST_TIME_OR_NEVER_AGAIN,
    SHOULD_SHOW_RATIONALE,
    GRANTED,
    DENIED,
    DEFAULT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AuthStatus authStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacy/AuthStatus");
    }

    public static AuthStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthStatus) ipChange.ipc$dispatch("7207de7d", new Object[]{str});
        }
        return (AuthStatus) Enum.valueOf(AuthStatus.class, str);
    }
}
