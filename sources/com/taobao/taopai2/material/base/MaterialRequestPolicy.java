package com.taobao.taopai2.material.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum MaterialRequestPolicy {
    NET,
    CACHE,
    CACHE_NET,
    NET_CACHE;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MaterialRequestPolicy materialRequestPolicy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai2/material/base/MaterialRequestPolicy");
    }

    public static MaterialRequestPolicy valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialRequestPolicy) ipChange.ipc$dispatch("c348e70e", new Object[]{str});
        }
        return (MaterialRequestPolicy) Enum.valueOf(MaterialRequestPolicy.class, str);
    }
}
