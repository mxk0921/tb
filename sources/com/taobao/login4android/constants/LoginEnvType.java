package com.taobao.login4android.constants;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum LoginEnvType {
    ONLINE(3),
    PRE(2),
    DEV(1);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int aliuserSdkEvnType;

    LoginEnvType(int i) {
        this.aliuserSdkEvnType = i;
    }

    public static /* synthetic */ Object ipc$super(LoginEnvType loginEnvType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/constants/LoginEnvType");
    }

    public static LoginEnvType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginEnvType) ipChange.ipc$dispatch("4f23c56e", new Object[]{str});
        }
        return (LoginEnvType) Enum.valueOf(LoginEnvType.class, str);
    }

    public int getSdkEnvType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13de471d", new Object[]{this})).intValue();
        }
        return this.aliuserSdkEvnType;
    }
}
