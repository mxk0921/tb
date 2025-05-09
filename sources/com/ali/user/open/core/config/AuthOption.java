package com.ali.user.open.core.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum AuthOption {
    NORMAL,
    H5ONLY;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AuthOption authOption, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/config/AuthOption");
    }

    public static AuthOption valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthOption) ipChange.ipc$dispatch("925e6292", new Object[]{str});
        }
        return (AuthOption) Enum.valueOf(AuthOption.class, str);
    }
}
