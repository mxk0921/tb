package com.alipay.android.msp.network.http.http;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SSLSocketUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f3705a;
    public static Method b;
    public static Method c;
    public static SSLCertificateSocketFactory d;

    public static final Class<?> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f8bc810d", new Object[0]);
        }
        Class<?> cls = f3705a;
        if (cls != null) {
            return cls;
        }
        synchronized (SSLSocketUtil.class) {
            Class<?> cls2 = f3705a;
            try {
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (cls2 != null) {
                return cls2;
            }
            try {
                f3705a = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused) {
                f3705a = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            }
            return f3705a;
        }
    }

    public static boolean d(SSLSocket sSLSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14eb5776", new Object[]{sSLSocket, str})).booleanValue();
        }
        SSLCertificateSocketFactory f = f();
        if (f == null) {
            LogUtil.record(4, "SSLSocketUtil:enableTlsExtensionsV2", "[enableTlsExtensionsV2] sslCertificateSocketFactory is null.");
            return false;
        }
        try {
            f.setHostname(sSLSocket, str);
            f.setUseSessionTickets(sSLSocket, true);
            return true;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public static X509TrustManager e() throws KeyManagementException {
        TrustManager[] trustManagers;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509TrustManager) ipChange.ipc$dispatch("d95c135b", new Object[0]);
        }
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            for (TrustManager trustManager : instance.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new KeyManagementException("Failed to find an X509TrustManager in " + Arrays.toString(trustManagers));
        } catch (KeyStoreException e) {
            throw new KeyManagementException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new KeyManagementException(e2);
        }
    }

    public static final void enableTlsExtensions(SSLSocket sSLSocket, String str) {
        Class<?> c2;
        if (sSLSocket == null || sSLSocket.isClosed() || sSLSocket.isInputShutdown() || sSLSocket.isOutputShutdown()) {
            return;
        }
        if ((Build.VERSION.SDK_INT <= 25 || !d(sSLSocket, str)) && (c2 = c()) != null && c2.isInstance(sSLSocket)) {
            try {
                Method b2 = b();
                if (b2 != null) {
                    b2.invoke(sSLSocket, Boolean.TRUE);
                }
                Method a2 = a();
                if (a2 != null) {
                    a2.invoke(sSLSocket, str);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static SSLCertificateSocketFactory f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLCertificateSocketFactory) ipChange.ipc$dispatch("148491f4", new Object[0]);
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = d;
        if (sSLCertificateSocketFactory != null) {
            return sSLCertificateSocketFactory;
        }
        synchronized (SSLSocketUtil.class) {
            SSLCertificateSocketFactory sSLCertificateSocketFactory2 = d;
            if (sSLCertificateSocketFactory2 != null) {
                return sSLCertificateSocketFactory2;
            }
            d = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(12000);
            d.setTrustManagers(new TrustManager[]{e()});
            return d;
        }
    }

    public static final Method a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("2c8ff2e0", new Object[0]);
        }
        Method method = c;
        if (method != null) {
            return method;
        }
        try {
            c = c().getMethod("setHostname", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static final Method b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("2d3c9e7f", new Object[0]);
        }
        Method method = b;
        if (method != null) {
            return method;
        }
        try {
            b = c().getMethod("setUseSessionTickets", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return b;
    }
}
