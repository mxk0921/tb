package com.ali.user.open.ucc.remote.broadcast;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum UccResultAction {
    NOTIFY_UCC_LOGIN_SUCCESS,
    NOTIFY_UCC_LOGIN_FAILED,
    NOTIFY_UCC_LOGIN_CANCEL,
    NOTIFY_UCC_LOGOUT;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(UccResultAction uccResultAction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/ucc/remote/broadcast/UccResultAction");
    }

    public static UccResultAction valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UccResultAction) ipChange.ipc$dispatch("3e8e03a1", new Object[]{str});
        }
        return (UccResultAction) Enum.valueOf(UccResultAction.class, str);
    }
}
