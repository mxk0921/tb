package com.ali.user.mobile.login;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum AccountType {
    TAOBAO_ACCOUNT("taobao");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String type;

    AccountType(String str) {
        this.type = str;
    }

    public static /* synthetic */ Object ipc$super(AccountType accountType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/login/AccountType");
    }

    public static AccountType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccountType) ipChange.ipc$dispatch("bfb362b1", new Object[]{str});
        }
        return (AccountType) Enum.valueOf(AccountType.class, str);
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }
}
