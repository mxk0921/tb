package org.android.spdy;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface SslCertcb {
    void getPerformance(SpdySession spdySession, SslPermData sslPermData);

    SslPublickey getPublicKey(SpdySession spdySession);

    int putCertificate(SpdySession spdySession, byte[] bArr, int i);
}
