package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum DWLifecycleType {
    BEFORE,
    MID_BEGIN,
    MID,
    MID_END,
    AFTER;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DWLifecycleType dWLifecycleType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/DWLifecycleType");
    }

    public static DWLifecycleType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWLifecycleType) ipChange.ipc$dispatch("653b995f", new Object[]{str});
        }
        return (DWLifecycleType) Enum.valueOf(DWLifecycleType.class, str);
    }
}
