package tb;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.text.TextUtils;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class hxx implements X509TrustManager {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f20954a;
    public final X509TrustManagerExtensions b;
    public final String c;

    public hxx(String str) {
        this.b = null;
        this.c = str;
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers.length != 0) {
            X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
            this.f20954a = x509TrustManager;
            if (Build.VERSION.SDK_INT > 23) {
                this.b = new X509TrustManagerExtensions(x509TrustManager);
                return;
            }
            return;
        }
        throw new NoSuchAlgorithmException("no trust manager found");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        X509TrustManager x509TrustManager = this.f20954a;
        if (x509TrustManager != null) {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        String str2 = this.c;
        if (Build.VERSION.SDK_INT <= 23 || (x509TrustManagerExtensions = this.b) == null) {
            X509TrustManager x509TrustManager = this.f20954a;
            if (x509TrustManager != null) {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } else {
            x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, "");
        }
        try {
            X500Principal issuerX500Principal = x509CertificateArr[0].getIssuerX500Principal();
            ArrayList arrayList = new ArrayList(0);
            arrayList.add(".*(GeoTrust|VeriSign|Symantec|GlobalSign|CFCA|Entrust|Thawte|DigiCert).*");
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (Pattern.compile((String) arrayList.get(i), 2).matcher(issuerX500Principal.getName()).matches()) {
                    X500Principal subjectX500Principal = x509CertificateArr[0].getSubjectX500Principal();
                    ArrayList arrayList2 = new ArrayList(0);
                    arrayList2.add(".*CN=.*(\\.cup\\.com\\.cn|\\.95516\\.com|\\.chinaunionpay\\.com|\\.unionpay\\.com|\\.unionpaysecure\\.com|\\.95516\\.net)(,.*|$)");
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        if (Pattern.compile((String) arrayList2.get(i2), 2).matcher(subjectX500Principal.getName()).matches()) {
                            return;
                        }
                    }
                    throw new CertificateException();
                }
            }
            throw new CertificateException();
        } catch (Exception unused) {
            throw new CertificateException();
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f20954a.getAcceptedIssuers();
    }
}
