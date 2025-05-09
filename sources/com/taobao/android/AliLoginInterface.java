package com.taobao.android;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface AliLoginInterface {
    boolean checkSessionValid();

    String getNick();

    String getUserId();

    void login(boolean z);
}
