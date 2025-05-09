package com.taobao.taopai2.material.task;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public enum MaterialPriority {
    LOW,
    NORMAL,
    HIGH;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MaterialPriority materialPriority, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai2/material/task/MaterialPriority");
    }

    public static MaterialPriority valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaterialPriority) ipChange.ipc$dispatch("a7ac70f7", new Object[]{str});
        }
        return (MaterialPriority) Enum.valueOf(MaterialPriority.class, str);
    }
}
