package com.tencent.mm.opensdk.diffdev;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface OAuthListener {
    void onAuthFinish(OAuthErrCode oAuthErrCode, String str);

    void onAuthGotQrcode(String str, byte[] bArr);

    void onQrcodeScanned();
}
