package com.ali.user.open.history;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HistoryAccount {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String email;
    public String mobile;
    public String nick;
    public String t;
    public String tokenKey;
    public String userId;

    public HistoryAccount() {
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        return super.equals(obj);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "" + this.nick;
    }

    public HistoryAccount(String str, String str2, String str3, String str4, String str5) {
        this.userId = str;
        this.tokenKey = str2;
        this.nick = str3;
        this.mobile = str4;
        this.email = str5;
    }
}
