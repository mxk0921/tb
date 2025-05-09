package com.taobao.android.alinnkit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum AliNNForwardType {
    FORWARD_CPU(0),
    FORWARD_OPENCL(3),
    FORWARD_AUTO(4),
    FORWARD_OPENGL(6),
    FORWARD_VULKAN(7),
    FORWARD_NPU(8);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int type;

    AliNNForwardType(int i) {
        this.type = i;
    }

    public static /* synthetic */ Object ipc$super(AliNNForwardType aliNNForwardType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/core/AliNNForwardType");
    }

    public static AliNNForwardType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNForwardType) ipChange.ipc$dispatch("57fab35d", new Object[]{str});
        }
        return (AliNNForwardType) Enum.valueOf(AliNNForwardType.class, str);
    }
}
