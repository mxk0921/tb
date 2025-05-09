package com.taobao.taopai2.material.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum MaterialRequestPriority {
    LOW,
    DEFAULT,
    HIGH;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MaterialRequestPriority materialRequestPriority, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai2/material/base/MaterialRequestPriority");
    }

    public static MaterialRequestPriority valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialRequestPriority) ipChange.ipc$dispatch("b8a6439c", new Object[]{str});
        }
        return (MaterialRequestPriority) Enum.valueOf(MaterialRequestPriority.class, str);
    }
}
