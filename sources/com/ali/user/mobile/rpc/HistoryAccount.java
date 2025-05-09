package com.ali.user.mobile.rpc;

import android.text.TextUtils;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.login.model.LoginConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HistoryAccount implements Comparator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean DEBUG = Debuggable.isDebug();
    public String accountId;
    public String alipayCrossed;
    public long alipayHid;
    public String autologinToken;
    public String biometricId;
    public String email;
    public int hasPwd = -1;
    public String headImg;
    public boolean isVip;
    public String loginAccount;
    public String loginPhone;
    public int loginSite;
    public long loginTime;
    public String loginType;
    public String mobile;
    public String nick;
    public String nickName;
    public String srcLoginType;
    public String tokenKey;
    public long userId;
    public String userInputName;
    public String vipExpireTime;

    static {
        t2o.a(68157561);
    }

    public HistoryAccount() {
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
        }
        long j = ((HistoryAccount) obj).loginTime;
        long j2 = ((HistoryAccount) obj2).loginTime;
        if (j > j2) {
            return -1;
        }
        if (j == j2) {
            return 0;
        }
        return 1;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        return super.equals(obj);
    }

    public String getAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("774e9962", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.loginAccount)) {
            return this.loginAccount;
        }
        if (TextUtils.isEmpty(this.mobile)) {
            return this.email;
        }
        return this.mobile;
    }

    public String getAccountId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("387f3cc7", new Object[]{this});
        }
        return this.accountId;
    }

    public String getLoginPhone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b105ea5e", new Object[]{this});
        }
        return this.loginPhone;
    }

    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue();
        }
        return this.loginSite;
    }

    public int isHasPwd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eff01207", new Object[]{this})).intValue();
        }
        return this.hasPwd;
    }

    public void setAccountId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a617f7", new Object[]{this, str});
        } else {
            this.accountId = str;
        }
    }

    public void setHasPwd(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d259c137", new Object[]{this, new Integer(i)});
        } else {
            this.hasPwd = i;
        }
    }

    public void setLoginPhone(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a0e8d8", new Object[]{this, str});
        } else {
            this.loginPhone = str;
        }
    }

    public void setLoginSite(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e197c00e", new Object[]{this, new Integer(i)});
        } else {
            this.loginSite = i;
        }
    }

    public void setSrcLoginType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca820a12", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, LoginConstant.LOGIN_TYPE_FINGERPRINT)) {
            this.srcLoginType = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (!DEBUG) {
            return super.toString();
        }
        return "HistoryAccount{, userId=" + this.userId + ", nick=" + this.nick + ", nickName=" + this.nickName + ", email=" + this.email + ", mobile=" + this.mobile + ", loginPhone=" + this.loginPhone + ", loginAccount=" + this.loginAccount + ", loginTime=" + this.loginTime + ", loginType=" + this.loginType + ", srcLoginType=" + this.srcLoginType + ", headImg=" + this.headImg + ", tokenKey=" + this.tokenKey;
    }

    public void update(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d3c0f4", new Object[]{this, historyAccount});
        } else if (this.userId == historyAccount.userId) {
            this.biometricId = historyAccount.biometricId;
            this.autologinToken = historyAccount.autologinToken;
            if (!TextUtils.isEmpty(historyAccount.userInputName)) {
                this.userInputName = historyAccount.userInputName;
            }
            if (!TextUtils.isEmpty(historyAccount.tokenKey)) {
                this.tokenKey = historyAccount.tokenKey;
            }
            this.email = historyAccount.email;
            if (!TextUtils.isEmpty(historyAccount.headImg)) {
                this.headImg = historyAccount.headImg;
            }
            if (!TextUtils.isEmpty(historyAccount.loginType)) {
                this.loginType = historyAccount.loginType;
            }
            this.nick = historyAccount.nick;
            this.mobile = historyAccount.mobile;
            if (!TextUtils.isEmpty(historyAccount.loginAccount)) {
                this.loginAccount = historyAccount.loginAccount;
            }
            long j = historyAccount.loginTime;
            if (j > 0) {
                this.loginTime = j;
            }
            this.loginPhone = historyAccount.loginPhone;
            this.loginSite = historyAccount.loginSite;
            this.alipayCrossed = historyAccount.alipayCrossed;
            this.hasPwd = historyAccount.hasPwd;
            this.isVip = historyAccount.isVip;
            this.vipExpireTime = historyAccount.vipExpireTime;
            setSrcLoginType(historyAccount.srcLoginType);
            this.biometricId = historyAccount.biometricId;
        }
    }

    public HistoryAccount(String str, String str2, String str3, long j, long j2, String str4, long j3, String str5, String str6, String str7, String str8, String str9, int i) {
        this.userInputName = str;
        this.mobile = str2;
        this.headImg = str3;
        this.userId = j;
        this.alipayHid = j2;
        this.autologinToken = str4;
        this.loginTime = j3;
        this.tokenKey = str5;
        this.loginType = str6;
        this.nick = str7;
        this.email = str8;
        this.alipayCrossed = str9;
        this.loginSite = i;
    }

    public HistoryAccount(String str, String str2, String str3, long j, long j2, String str4, String str5, String str6) {
        this.mobile = str;
        this.email = str2;
        this.headImg = str3;
        this.userId = j;
        this.loginTime = j2;
        this.loginType = str4;
        this.nickName = str5;
        this.loginAccount = str6;
    }
}
