package com.ali.user.mobile.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginParam extends LoginBaseParam {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 1;
    public boolean callRpc;
    public String errorCode;
    public String helpUrl;

    static {
        t2o.a(68157536);
    }

    public static /* synthetic */ Object ipc$super(LoginParam loginParam, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/model/LoginParam");
    }

    public LoginParam clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginParam) ipChange.ipc$dispatch("a32b18cf", new Object[]{this});
        }
        try {
            return (LoginParam) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
