package com.taobao.android.fluid.framework.preload.cardwarmup;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum WarmUpReason {
    HEALTHY,
    LIST_SPEED;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WarmUpReason warmUpReason, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/cardwarmup/WarmUpReason");
    }

    public static WarmUpReason valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WarmUpReason) ipChange.ipc$dispatch("5b4e88b8", new Object[]{str});
        }
        return (WarmUpReason) Enum.valueOf(WarmUpReason.class, str);
    }
}
