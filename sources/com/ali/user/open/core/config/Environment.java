package com.ali.user.open.core.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum Environment {
    ONLINE,
    PRE,
    TEST,
    SANDBOX;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(Environment environment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/config/Environment");
    }

    public static Environment valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Environment) ipChange.ipc$dispatch("37a4a014", new Object[]{str});
        }
        return (Environment) Enum.valueOf(Environment.class, str);
    }
}
