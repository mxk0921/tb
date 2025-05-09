package tb;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class t8y {
    public static final String c = "hmsrootcas.bks";
    public static final String d = "";
    public static final String e = "bks";
    public static final String f = "052root";

    /* renamed from: a  reason: collision with root package name */
    public final Context f28570a;

    public t8y(Context context) {
        this.f28570a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public X509Certificate a(String str, String str2) {
        Throwable th;
        Throwable e2;
        InputStream inputStream;
        KeyStore instance;
        X509Certificate x509Certificate = null;
        InputStream inputStream2 = null;
        try {
            try {
                instance = KeyStore.getInstance(e);
                inputStream = this.f28570a.getAssets().open(str);
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = str;
                r3y.b(inputStream2);
                throw th;
            }
        } catch (IOException e3) {
            e2 = e3;
            inputStream = null;
            x5y.c("X509CertificateUtil", "loadBksCA: exception : " + e2.getMessage());
            str = inputStream;
            r3y.b(str);
            return x509Certificate;
        } catch (KeyStoreException e4) {
            e2 = e4;
            inputStream = null;
            x5y.c("X509CertificateUtil", "loadBksCA: exception : " + e2.getMessage());
            str = inputStream;
            r3y.b(str);
            return x509Certificate;
        } catch (NoSuchAlgorithmException e5) {
            e2 = e5;
            inputStream = null;
            x5y.c("X509CertificateUtil", "loadBksCA: exception : " + e2.getMessage());
            str = inputStream;
            r3y.b(str);
            return x509Certificate;
        } catch (CertificateException e6) {
            e2 = e6;
            inputStream = null;
            x5y.c("X509CertificateUtil", "loadBksCA: exception : " + e2.getMessage());
            str = inputStream;
            r3y.b(str);
            return x509Certificate;
        } catch (Throwable th3) {
            th = th3;
            r3y.b(inputStream2);
            throw th;
        }
        try {
            inputStream.reset();
            instance.load(inputStream, "".toCharArray());
            x509Certificate = (X509Certificate) instance.getCertificate(str2);
            str = inputStream;
        } catch (IOException e7) {
            e2 = e7;
            x5y.c("X509CertificateUtil", "loadBksCA: exception : " + e2.getMessage());
            str = inputStream;
            r3y.b(str);
            return x509Certificate;
        } catch (KeyStoreException e8) {
            e2 = e8;
            x5y.c("X509CertificateUtil", "loadBksCA: exception : " + e2.getMessage());
            str = inputStream;
            r3y.b(str);
            return x509Certificate;
        } catch (NoSuchAlgorithmException e9) {
            e2 = e9;
            x5y.c("X509CertificateUtil", "loadBksCA: exception : " + e2.getMessage());
            str = inputStream;
            r3y.b(str);
            return x509Certificate;
        } catch (CertificateException e10) {
            e2 = e10;
            x5y.c("X509CertificateUtil", "loadBksCA: exception : " + e2.getMessage());
            str = inputStream;
            r3y.b(str);
            return x509Certificate;
        }
        r3y.b(str);
        return x509Certificate;
    }

    public X509Certificate b() {
        return a("hmsrootcas.bks", f);
    }
}
