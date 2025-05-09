package com.ali.user.mobile.rpc.login.model;

import android.os.Build;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginRequestBase extends MemberRequestBase {
    public String biometricId;
    public String biometricState;
    public String deviceTokenKey;
    public String deviceTokenSign;
    public String hid;
    public String maskMobile;
    public String pageType;
    public String sid;
    public String snsToken;
    public String supportBiometricType;
    public long t;
    public boolean useDeviceToken = true;
    public String deviceName = Build.BRAND + f7l.BRACKET_START_STR + Build.MODEL + f7l.BRACKET_END_STR;
    public boolean useAcitonType = true;

    static {
        t2o.a(68157577);
    }
}
