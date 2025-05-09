package com.alipay.mobile.common.netsdkextdependapi.security;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SignResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static SignResult c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4025a;
    public String b;
    public String sign;
    public int signType;

    public SignResult() {
        this.sign = "";
        this.signType = SignRequest.SIGN_TYPE_MD5;
        this.f4025a = false;
        this.b = "";
    }

    public static final SignResult newEmptySignData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SignResult) ipChange.ipc$dispatch("6477177a", new Object[0]);
        }
        if (c == null) {
            c = new SignResult();
        }
        return c;
    }

    public static final SignResult newErrorResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SignResult) ipChange.ipc$dispatch("bc989695", new Object[]{str});
        }
        return new SignResult(str);
    }

    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return this.b;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.f4025a;
    }

    public void setErrorCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710bac24", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void setSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.f4025a = z;
        }
    }

    public SignResult(String str) {
        this.sign = "";
        this.signType = SignRequest.SIGN_TYPE_MD5;
        this.f4025a = false;
        this.b = str;
    }
}
