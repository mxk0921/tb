package com.alibaba.ut.abtest;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public enum UTABMethod {
    Pull,
    Push;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UTABMethod uTABMethod, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/UTABMethod");
    }

    public static UTABMethod valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTABMethod) ipChange.ipc$dispatch("9ca8299e", new Object[]{str});
        }
        return (UTABMethod) Enum.valueOf(UTABMethod.class, str);
    }
}
