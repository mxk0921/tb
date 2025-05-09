package com.taobao.taopai.material;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum MaterialRequestStrategy {
    CACHE_NET,
    ONLY;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MaterialRequestStrategy materialRequestStrategy, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai/material/MaterialRequestStrategy");
    }

    public static MaterialRequestStrategy valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialRequestStrategy) ipChange.ipc$dispatch("975bf5b3", new Object[]{str});
        }
        return (MaterialRequestStrategy) Enum.valueOf(MaterialRequestStrategy.class, str);
    }
}
