package com.huawei.secure.android.common.util;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SecurityCommonException extends Exception {
    private static final long c = 1;

    /* renamed from: a  reason: collision with root package name */
    private String f5536a;
    private String b;

    public SecurityCommonException() {
    }

    public String getMsgDes() {
        return this.b;
    }

    public String getRetCd() {
        return this.f5536a;
    }

    public SecurityCommonException(Throwable th) {
        super(th);
    }

    public SecurityCommonException(String str, Throwable th) {
        super(str, th);
    }

    public SecurityCommonException(String str) {
        super(str);
        this.b = str;
    }

    public SecurityCommonException(String str, String str2) {
        this.f5536a = str;
        this.b = str2;
    }
}
