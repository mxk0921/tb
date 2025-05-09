package com.alipay.mobile.common.transport.utils;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import com.alipay.mobile.common.transport.ssl.X509TrustManagerFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SSLSocketUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f4154a;
    public static Method b;
    public static Method c;
    public static SSLCertificateSocketFactory d;

    public static boolean b(SSLSocket sSLSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14eb5776", new Object[]{sSLSocket, str})).booleanValue();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = getSSLCertificateSocketFactory();
        if (sSLCertificateSocketFactory == null) {
            LogCatUtil.warn("SSLSocketUtil", "[enableTlsExtensionsV2] sslCertificateSocketFactory is null.");
            return false;
        }
        try {
            sSLCertificateSocketFactory.setHostname(sSLSocket, str);
            sSLCertificateSocketFactory.setUseSessionTickets(sSLSocket, true);
            if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                LogCatUtil.info("SSLSocketUtil", "[enableTlsExtensionsV2] Execution success.");
            }
            return true;
        } catch (Throwable th) {
            LogCatUtil.error("SSLSocketUtil", "[enableTlsExtensionsV2] enableTlsExtensionsV2 fail. Exception：" + th.toString(), th);
            return false;
        }
    }

    public static void d(SSLSocket sSLSocket, String str) {
        Class<?> e = e();
        if (e == null) {
            LogCatUtil.warn("SSLSocketUtil", "[enableTlsExtensionsV1] localOpenSslSocketClass is null. ");
        } else if (e.isInstance(sSLSocket)) {
            try {
                Method c2 = c();
                if (c2 != null) {
                    c2.invoke(sSLSocket, Boolean.TRUE);
                }
                Method a2 = a();
                if (a2 != null) {
                    a2.invoke(sSLSocket, str);
                }
                if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                    LogCatUtil.info("SSLSocketUtil", "[enableTlsExtensionsV1] Execution success.");
                }
            } catch (Throwable th) {
                LogCatUtil.warn("SSLSocketUtil", "This isn't Android 2.3 or better. getMethodSetHostname exception:" + th.toString());
            }
        }
    }

    public static final Class<?> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("76b61817", new Object[0]);
        }
        Class<?> cls = f4154a;
        if (cls != null) {
            return cls;
        }
        synchronized (SSLSocketUtil.class) {
            Class<?> cls2 = f4154a;
            try {
            } catch (Exception e) {
                LogCatUtil.warn("SSLSocketUtil", "This isn't an Android runtime, exception:" + e.toString());
            }
            if (cls2 != null) {
                return cls2;
            }
            try {
                f4154a = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused) {
                f4154a = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            }
            return f4154a;
        }
    }

    public static final void enableTlsExtensions(SSLSocket sSLSocket, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc6e1c7", new Object[]{sSLSocket, str});
        } else if (sSLSocket == null) {
            LogCatUtil.warn("SSLSocketUtil", "[enableTlsExtensions] Illegal socket param. socket is null.");
        } else if (sSLSocket.isClosed() || sSLSocket.isInputShutdown() || sSLSocket.isOutputShutdown()) {
            LogCatUtil.warn("SSLSocketUtil", "[enableTlsExtensions] Illegal socket param. socket is closed.");
        } else if (Build.VERSION.SDK_INT <= 25 || !b(sSLSocket, str)) {
            d(sSLSocket, str);
        }
    }

    public static final Method a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("334ea716", new Object[0]);
        }
        Method method = c;
        if (method != null) {
            return method;
        }
        try {
            c = e().getMethod("setHostname", String.class);
        } catch (NoSuchMethodException e) {
            LogCatUtil.warn("SSLSocketUtil", "This isn't Android 2.3 or better. getMethodSetHostname exception:" + e.toString());
        }
        return c;
    }

    public static final Method c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("33fb52b5", new Object[0]);
        }
        Method method = b;
        if (method != null) {
            return method;
        }
        try {
            b = e().getMethod("setUseSessionTickets", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
            LogCatUtil.warn("SSLSocketUtil", "This isn't Android 2.3 or better. getMethodSetUseSessionTickets exception:" + e.toString());
        }
        return b;
    }

    public static final SSLCertificateSocketFactory getSSLCertificateSocketFactory() {
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
            d.setTrustManagers(new TrustManager[]{X509TrustManagerFactory.getX509TrustManager()});
            return d;
        }
    }
}
