package com.ali.user.open.core.broadcast;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum LoginAction {
    NOTIFY_LOGIN_SUCCESS,
    NOTIFY_LOGIN_FAILED,
    NOTIFY_LOGIN_CANCEL,
    NOTIFY_LOGOUT,
    NOTIFY_SNS_UNBIND;
    
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(LoginAction loginAction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/broadcast/LoginAction");
    }

    public static LoginAction valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginAction) ipChange.ipc$dispatch("bfdb99ab", new Object[]{str});
        }
        return (LoginAction) Enum.valueOf(LoginAction.class, str);
    }
}
