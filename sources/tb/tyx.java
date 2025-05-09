package tb;

import android.content.Context;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tyx implements X509TrustManager {

    /* renamed from: a  reason: collision with root package name */
    public final X509Certificate f29037a;
    public final List<X509TrustManager> b = new ArrayList();

    public tyx(Context context) {
        if (context != null) {
            sq4.b(context);
            X509Certificate b = new t8y(context).b();
            this.f29037a = b;
            if (b == null) {
                throw new NullPointerException("WebViewX509TrustManger cannot get cbg root ca");
            }
            return;
        }
        throw new NullPointerException("WebViewX509TrustManger context is null");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        x5y.d("WebViewX509TrustManger", "checkClientTrusted");
        List<X509TrustManager> list = this.b;
        if (!((ArrayList) list).isEmpty()) {
            ((X509TrustManager) ((ArrayList) list).get(0)).checkClientTrusted(x509CertificateArr, str);
            return;
        }
        throw new CertificateException("checkClientTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        x5y.d("WebViewX509TrustManger", "checkServerTrusted");
        boolean z = false;
        for (X509Certificate x509Certificate : x509CertificateArr) {
            x509Certificate.getIssuerDN().getName();
        }
        X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
        for (int i = 0; i < x509CertificateArr.length; i++) {
            x509CertificateArr2[i] = x509CertificateArr[(x509CertificateArr.length - 1) - i];
        }
        CertificateException e = new CertificateException("CBG root CA CertificateException");
        try {
            z = xwx.c(this.f29037a, x509CertificateArr2);
        } catch (InvalidKeyException e2) {
            x5y.c("WebViewX509TrustManger", "checkServerTrusted InvalidKeyException: " + e2.getMessage());
        } catch (NoSuchAlgorithmException e3) {
            x5y.c("WebViewX509TrustManger", "checkServerTrusted NoSuchAlgorithmException: " + e3.getMessage());
        } catch (NoSuchProviderException e4) {
            x5y.c("WebViewX509TrustManger", "checkServerTrusted NoSuchProviderException: " + e4.getMessage());
        } catch (SignatureException e5) {
            x5y.c("WebViewX509TrustManger", "checkServerTrusted SignatureException: " + e5.getMessage());
        } catch (CertificateException e6) {
            e = e6;
            x5y.c("WebViewX509TrustManger", "checkServerTrusted CertificateException: " + e.getMessage());
        }
        if (!z) {
            throw e;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(((X509TrustManager) it.next()).getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            x5y.c("WebViewX509TrustManger", "getAcceptedIssuers exception : " + e.getMessage());
            return new X509Certificate[0];
        }
    }
}
