package com.huawei.hms.push.ups.entity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CodeResult {

    /* renamed from: a  reason: collision with root package name */
    private int f5462a;
    private String b;

    public CodeResult() {
    }

    public String getReason() {
        return this.b;
    }

    public int getReturnCode() {
        return this.f5462a;
    }

    public void setReason(String str) {
        this.b = str;
    }

    public void setReturnCode(int i) {
        this.f5462a = i;
    }

    public CodeResult(int i) {
        this.f5462a = i;
    }

    public CodeResult(int i, String str) {
        this.f5462a = i;
        this.b = str;
    }
}
