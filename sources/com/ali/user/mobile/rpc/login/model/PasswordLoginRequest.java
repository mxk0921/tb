package com.ali.user.mobile.rpc.login.model;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PasswordLoginRequest extends LoginRequestBase {
    public String loginId;
    public String password;
    public boolean pwdEncrypted = false;
    public String loginType = "taobao";

    static {
        t2o.a(68157584);
    }
}
