package com.uc.webview.export.internal.interfaces;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface EventHandler {
    void certificate(SslCertificate sslCertificate);

    void data(byte[] bArr, int i);

    void endData();

    void error(int i, String str);

    int getNetworkEngin();

    int getResourceType();

    boolean handleSslErrorRequest(SslError sslError);

    void headers(Object obj);

    void headers(Map<String, List<String>> map);

    boolean isSynchronous();

    void setNetworkEngin(int i);

    void setRequest(IRequest iRequest);

    void setResourceType(int i);

    void status(int i, int i2, int i3, String str);
}
