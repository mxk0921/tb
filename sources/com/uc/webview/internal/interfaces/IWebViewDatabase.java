package com.uc.webview.internal.interfaces;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IWebViewDatabase {
    void clearFormData();

    void clearHttpAuthUsernamePassword();

    @Deprecated
    void clearUsernamePassword();

    boolean hasFormData();

    boolean hasHttpAuthUsernamePassword();

    @Deprecated
    boolean hasUsernamePassword();
}
