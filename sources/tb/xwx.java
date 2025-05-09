package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xwx {
    public static boolean a(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        return x509Certificate.getKeyUsage()[5];
    }

    public static boolean d(X509Certificate[] x509CertificateArr) {
        for (int i = 0; i < x509CertificateArr.length - 1; i++) {
            if (!a(x509CertificateArr[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(X509Certificate[] x509CertificateArr) {
        Throwable e;
        Date date = new Date();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            try {
                x509Certificate.checkValidity(date);
            } catch (CertificateExpiredException e2) {
                e = e2;
                x5y.c(TplMsg.VALUE_T_NATIVE_RETURN, "verifyCertificateDate: exception : " + e.getMessage());
                return false;
            } catch (CertificateNotYetValidException e3) {
                e = e3;
                x5y.c(TplMsg.VALUE_T_NATIVE_RETURN, "verifyCertificateDate: exception : " + e.getMessage());
                return false;
            } catch (Exception e4) {
                x5y.c(TplMsg.VALUE_T_NATIVE_RETURN, "verifyCertificateDate : exception : " + e4.getMessage());
                return false;
            }
        }
        return true;
    }

    public static boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            if (e(new X509Certificate[]{x509Certificate, x509Certificate2})) {
                return true;
            }
            x5y.c(TplMsg.VALUE_T_NATIVE_RETURN, "verify: date not right");
            return false;
        } catch (InvalidKeyException e) {
            x5y.c(TplMsg.VALUE_T_NATIVE_RETURN, "verify: publickey InvalidKeyException " + e.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e2) {
            x5y.c(TplMsg.VALUE_T_NATIVE_RETURN, "verify: publickey NoSuchAlgorithmException " + e2.getMessage());
            return false;
        } catch (NoSuchProviderException e3) {
            x5y.c(TplMsg.VALUE_T_NATIVE_RETURN, "verify: publickey NoSuchProviderException " + e3.getMessage());
            return false;
        } catch (SignatureException e4) {
            x5y.c(TplMsg.VALUE_T_NATIVE_RETURN, "verify: publickey SignatureException " + e4.getMessage());
            return false;
        } catch (CertificateException e5) {
            x5y.c(TplMsg.VALUE_T_NATIVE_RETURN, "verify: publickey CertificateException " + e5.getMessage());
            return false;
        } catch (Exception e6) {
            x5y.c(TplMsg.VALUE_T_NATIVE_RETURN, "verify: Exception " + e6.getMessage());
            return false;
        }
    }

    public static boolean c(X509Certificate x509Certificate, X509Certificate[] x509CertificateArr) throws NoSuchProviderException, CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Principal principal = null;
        int i = 0;
        while (i < x509CertificateArr.length) {
            X509Certificate x509Certificate2 = x509CertificateArr[i];
            Principal issuerDN = x509Certificate2.getIssuerDN();
            Principal subjectDN = x509Certificate2.getSubjectDN();
            if (principal != null) {
                if (issuerDN.equals(principal)) {
                    x509CertificateArr[i].verify(x509CertificateArr[i - 1].getPublicKey());
                } else {
                    x5y.c(TplMsg.VALUE_T_NATIVE_RETURN, "verify: principalIssuer not match");
                    return false;
                }
            }
            i++;
            principal = subjectDN;
        }
        return b(x509Certificate, x509CertificateArr[0]) && e(x509CertificateArr) && a(x509Certificate) && d(x509CertificateArr);
    }
}
