package com.taobao.zcache.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum UpdateMatchType {
    Full,
    Prefix,
    Suffix;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UpdateMatchType updateMatchType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/zcache/core/UpdateMatchType");
    }

    public static UpdateMatchType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateMatchType) ipChange.ipc$dispatch("2cea3152", new Object[]{str});
        }
        return (UpdateMatchType) Enum.valueOf(UpdateMatchType.class, str);
    }
}
