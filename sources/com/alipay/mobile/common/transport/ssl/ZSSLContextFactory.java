package com.alipay.mobile.common.transport.ssl;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.util.Arrays;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZSSLContextFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SSLContext f4133a;

    public static final X509KeyManager a(KeyManager[] keyManagerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509KeyManager) ipChange.ipc$dispatch("f0ee5c3", new Object[]{keyManagerArr});
        }
        for (KeyManager keyManager : keyManagerArr) {
            if (keyManager instanceof X509KeyManager) {
                return (X509KeyManager) keyManager;
            }
        }
        throw new KeyManagementException("Failed to find an X509KeyManager in " + Arrays.toString(keyManagerArr));
    }

    public static final X509KeyManager createDefaultKeyManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509KeyManager) ipChange.ipc$dispatch("665c0d69", new Object[0]);
        }
        try {
            KeyManagerFactory instance = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            instance.init(null, null);
            return a(instance.getKeyManagers());
        } catch (KeyStoreException e) {
            throw new KeyManagementException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new KeyManagementException(e2);
        } catch (UnrecoverableKeyException e3) {
            throw new KeyManagementException(e3);
        }
    }

    public static final SSLContext createZSSLContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLContext) ipChange.ipc$dispatch("3dae5fcc", new Object[0]);
        }
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(new X509KeyManager[]{createDefaultKeyManager()}, new X509TrustManager[]{X509TrustManagerFactory.getX509TrustManager()}, new SecureRandom());
        return instance;
    }

    public static final SSLContext getSingletonSSLContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SSLContext) ipChange.ipc$dispatch("20bad75", new Object[0]);
        }
        SSLContext sSLContext = f4133a;
        if (sSLContext != null) {
            return sSLContext;
        }
        synchronized (ZSSLContextFactory.class) {
            try {
                SSLContext sSLContext2 = f4133a;
                if (sSLContext2 != null) {
                    return sSLContext2;
                }
                SSLContext createZSSLContext = createZSSLContext();
                f4133a = createZSSLContext;
                return createZSSLContext;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
