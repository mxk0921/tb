package com.alipay.mobile.common.transport.ssl;

import com.android.alibaba.ip.runtime.IpChange;
import javax.net.ssl.X509TrustManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class X509TrustManagerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static X509TrustManager f4130a;

    public static final X509TrustManager getX509TrustManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509TrustManager) ipChange.ipc$dispatch("76c44e24", new Object[0]);
        }
        X509TrustManager x509TrustManager = f4130a;
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        synchronized (X509TrustManager.class) {
            try {
                X509TrustManager x509TrustManager2 = f4130a;
                if (x509TrustManager2 != null) {
                    return x509TrustManager2;
                }
                X509TrustManagerWrapper x509TrustManagerWrapper = new X509TrustManagerWrapper();
                f4130a = x509TrustManagerWrapper;
                return x509TrustManagerWrapper;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void resetX509TrustManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b486ddd1", new Object[0]);
        } else {
            f4130a = new X509TrustManagerWrapper();
        }
    }

    public static final void setX509TrustManager(X509TrustManager x509TrustManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae2c4a", new Object[]{x509TrustManager});
        } else {
            f4130a = x509TrustManager;
        }
    }
}
