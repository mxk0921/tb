package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum DWAspectRatio {
    DW_FIT_CENTER,
    DW_CENTER_CROP,
    DW_FIT_X_Y,
    DW_FIT_ADAPT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(DWAspectRatio dWAspectRatio, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/DWAspectRatio");
    }

    public static DWAspectRatio valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWAspectRatio) ipChange.ipc$dispatch("2e719070", new Object[]{str});
        }
        return (DWAspectRatio) Enum.valueOf(DWAspectRatio.class, str);
    }
}
