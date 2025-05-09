package com.huawei.hms.push.ups.entity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TokenResult extends CodeResult {
    private String c;

    public TokenResult() {
    }

    public String getToken() {
        return this.c;
    }

    public void setToken(String str) {
        this.c = str;
    }

    public TokenResult(int i) {
        super(i);
    }

    public TokenResult(int i, String str) {
        super(i, str);
    }

    public TokenResult(String str) {
        this.c = str;
    }
}
