package com.taobao.android.alinnkit.core;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum AliNNScaleFilterMode {
    NONE(0),
    LINEAR(1),
    BILINEAR(2),
    BOX(3);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int type;

    AliNNScaleFilterMode(int i) {
        this.type = i;
    }

    public static /* synthetic */ Object ipc$super(AliNNScaleFilterMode aliNNScaleFilterMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/alinnkit/core/AliNNScaleFilterMode");
    }

    public static AliNNScaleFilterMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNScaleFilterMode) ipChange.ipc$dispatch("a6b30917", new Object[]{str});
        }
        return (AliNNScaleFilterMode) Enum.valueOf(AliNNScaleFilterMode.class, str);
    }
}
