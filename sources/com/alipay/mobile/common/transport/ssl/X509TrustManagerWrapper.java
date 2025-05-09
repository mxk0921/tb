package com.alipay.mobile.common.transport.ssl;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class X509TrustManagerWrapper extends EmptyX509TrustManagerWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f4131a;

    public X509TrustManagerWrapper(X509TrustManager x509TrustManager) {
        this.f4131a = x509TrustManager;
    }

    public static final X509TrustManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509TrustManager) ipChange.ipc$dispatch("72e32614", new Object[0]);
        }
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            return b(instance.getTrustManagers());
        } catch (KeyStoreException e) {
            throw new KeyManagementException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new KeyManagementException(e2);
        }
    }

    public static final X509TrustManager b(TrustManager[] trustManagerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509TrustManager) ipChange.ipc$dispatch("9493f4e3", new Object[]{trustManagerArr});
        }
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        throw new KeyManagementException("Failed to find an X509TrustManager in " + Arrays.toString(trustManagerArr));
    }

    public static /* synthetic */ Object ipc$super(X509TrustManagerWrapper x509TrustManagerWrapper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/transport/ssl/X509TrustManagerWrapper");
    }

    @Override // com.alipay.mobile.common.transport.ssl.EmptyX509TrustManagerWrapper, javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee06893b", new Object[]{this, x509CertificateArr, str});
            return;
        }
        LogCatUtil.info("X509TrustManagerWrapper", "[checkClientTrusted] enter");
        this.f4131a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // com.alipay.mobile.common.transport.ssl.EmptyX509TrustManagerWrapper, javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab6d06b3", new Object[]{this, x509CertificateArr, str});
            return;
        }
        LogCatUtil.info("X509TrustManagerWrapper", "[checkServerTrusted] enter.");
        try {
            this.f4131a.checkServerTrusted(x509CertificateArr, str);
        } catch (Throwable th) {
            LogCatUtil.info("X509TrustManagerWrapper", "checkServerTrusted: authMethod:" + str + ", x509Certificates: " + Arrays.toString(x509CertificateArr));
            if (th instanceof CertificateException) {
                throw th;
            }
            throw new CertificateException(th);
        }
    }

    @Override // com.alipay.mobile.common.transport.ssl.EmptyX509TrustManagerWrapper, javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509Certificate[]) ipChange.ipc$dispatch("cdefad90", new Object[]{this});
        }
        X509Certificate[] acceptedIssuers = this.f4131a.getAcceptedIssuers();
        StringBuilder sb = new StringBuilder("[getAcceptedIssuers] acceptedIssuers len : ");
        if (acceptedIssuers != null) {
            obj = Integer.valueOf(acceptedIssuers.length);
        } else {
            obj = " is null. ";
        }
        sb.append(obj);
        LogCatUtil.info("X509TrustManagerWrapper", sb.toString());
        return acceptedIssuers;
    }

    public X509TrustManagerWrapper() {
        this.f4131a = a();
    }
}
