package com.huawei.hms.push;

import com.huawei.hms.aaid.constant.ErrorEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BaseException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final int f5428a;
    private final ErrorEnum b;

    public BaseException(int i) {
        ErrorEnum fromCode = ErrorEnum.fromCode(i);
        this.b = fromCode;
        this.f5428a = fromCode.getExternalCode();
    }

    public int getErrorCode() {
        return this.f5428a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b.getMessage();
    }
}
