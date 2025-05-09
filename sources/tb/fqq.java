package tb;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fqq implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            x5y.d("", "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            wwx.a(str, x509Certificate, true);
            uyx.b();
            return true;
        } catch (SSLException e) {
            x5y.c("", "SSLException : " + e.getMessage());
            return false;
        }
    }
}
