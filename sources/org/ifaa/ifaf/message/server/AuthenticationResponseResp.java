package org.ifaa.ifaf.message.server;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class AuthenticationResponseResp extends IFAFServerMessage {
    private boolean authenticationResult;
    private String token;

    public String getToken() {
        return this.token;
    }

    public boolean isAuthenticationResult() {
        return this.authenticationResult;
    }

    public void setAuthenticationResult(boolean z) {
        this.authenticationResult = z;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
