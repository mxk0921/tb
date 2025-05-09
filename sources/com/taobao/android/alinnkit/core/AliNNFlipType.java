package com.taobao.android.alinnkit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum AliNNFlipType {
    FLIP_NONE(0),
    FLIP_X(1),
    FLIP_Y(2),
    FLIP_XY(3);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int type;

    AliNNFlipType(int i) {
        this.type = i;
    }

    public static /* synthetic */ Object ipc$super(AliNNFlipType aliNNFlipType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/core/AliNNFlipType");
    }

    public static AliNNFlipType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNFlipType) ipChange.ipc$dispatch("50268c93", new Object[]{str});
        }
        return (AliNNFlipType) Enum.valueOf(AliNNFlipType.class, str);
    }
}
