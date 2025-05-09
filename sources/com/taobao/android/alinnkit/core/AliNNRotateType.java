package com.taobao.android.alinnkit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum AliNNRotateType {
    Rotate0(0),
    Rotate90(90),
    Rotate180(180),
    Rotate270(270);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int type;

    AliNNRotateType(int i) {
        this.type = i;
    }

    public static /* synthetic */ Object ipc$super(AliNNRotateType aliNNRotateType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/core/AliNNRotateType");
    }

    public static AliNNRotateType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNRotateType) ipChange.ipc$dispatch("7a2f60a5", new Object[]{str});
        }
        return (AliNNRotateType) Enum.valueOf(AliNNRotateType.class, str);
    }
}
