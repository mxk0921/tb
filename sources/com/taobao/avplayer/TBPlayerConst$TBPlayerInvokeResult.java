package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum TBPlayerConst$TBPlayerInvokeResult {
    TBPlayerInvokeResultSuccess,
    TBPlayerInvokeResultInvalidKey,
    TBPlayerInvokeResultInvalidParam,
    TBPlayerInvokeResultInvalidInvoke,
    TBPlayerInvokeResultRepeatUrl,
    TBPlayerInvokeResultPermissionDeny;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(TBPlayerConst$TBPlayerInvokeResult tBPlayerConst$TBPlayerInvokeResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/TBPlayerConst$TBPlayerInvokeResult");
    }

    public static TBPlayerConst$TBPlayerInvokeResult valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPlayerConst$TBPlayerInvokeResult) ipChange.ipc$dispatch("f029f572", new Object[]{str});
        }
        return (TBPlayerConst$TBPlayerInvokeResult) Enum.valueOf(TBPlayerConst$TBPlayerInvokeResult.class, str);
    }
}
