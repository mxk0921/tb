package com.taobao.android.alinnkit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum AliNNBufferType {
    NCHW(0),
    NHWC(1);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int type;

    AliNNBufferType(int i) {
        this.type = i;
    }

    public static /* synthetic */ Object ipc$super(AliNNBufferType aliNNBufferType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/core/AliNNBufferType");
    }

    public static AliNNBufferType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNBufferType) ipChange.ipc$dispatch("cdf630e0", new Object[]{str});
        }
        return (AliNNBufferType) Enum.valueOf(AliNNBufferType.class, str);
    }
}
