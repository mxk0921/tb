package com.taobao.android.external;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public enum UCPActionType {
    Error,
    Expose,
    Click,
    Cancel,
    ClickWithoutClose,
    CancelWithError;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UCPActionType uCPActionType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/external/UCPActionType");
    }

    public static UCPActionType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCPActionType) ipChange.ipc$dispatch("11226649", new Object[]{str});
        }
        return (UCPActionType) Enum.valueOf(UCPActionType.class, str);
    }
}
