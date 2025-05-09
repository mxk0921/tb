package tb;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d8p implements X509TrustManager {
    public static final String d = "hmsrootcas.bks";

    /* renamed from: a  reason: collision with root package name */
    public final List<X509TrustManager> f17650a;

    public d8p(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalArgumentException {
        this(context, false);
    }

    public final void a() {
        x5y.d("SX509TM", "loadSystemCA");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            KeyStore instance = KeyStore.getInstance("AndroidCAStore");
            instance.load(null, null);
            TrustManagerFactory instance2 = TrustManagerFactory.getInstance("X509");
            instance2.init(instance);
            TrustManager[] trustManagers = instance2.getTrustManagers();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    this.f17650a.add((X509TrustManager) trustManager);
                }
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            x5y.c("SX509TM", "loadSystemCA: exception : " + e.getMessage());
        }
        StringBuilder sb = new StringBuilder("loadSystemCA: cost : ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" ms");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
        if (r0 == null) goto L_0x003b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r7) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "loadBksCA"
            java.lang.String r1 = "SX509TM"
            tb.x5y.d(r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            java.io.InputStream r0 = tb.af2.n(r7)
            if (r0 == 0) goto L_0x0039
            java.lang.String r4 = "get bks not from assets"
            tb.x5y.d(r1, r4)     // Catch: IOException -> 0x001a, CertificateException -> 0x001c, KeyStoreException -> 0x001e, NoSuchAlgorithmException -> 0x0020, OutOfMemoryError -> 0x0022
            r6.c(r0)     // Catch: IOException -> 0x001a, CertificateException -> 0x001c, KeyStoreException -> 0x001e, NoSuchAlgorithmException -> 0x0020, OutOfMemoryError -> 0x0022
            goto L_0x0039
        L_0x001a:
            r0 = move-exception
            goto L_0x0023
        L_0x001c:
            r0 = move-exception
            goto L_0x0023
        L_0x001e:
            r0 = move-exception
            goto L_0x0023
        L_0x0020:
            r0 = move-exception
            goto L_0x0023
        L_0x0022:
            r0 = move-exception
        L_0x0023:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "loadBksCA: exception : "
            r4.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            tb.x5y.c(r1, r0)
            goto L_0x003b
        L_0x0039:
            if (r0 != 0) goto L_0x004d
        L_0x003b:
            java.lang.String r0 = " get bks from assets "
            tb.x5y.d(r1, r0)
            android.content.res.AssetManager r7 = r7.getAssets()
            java.lang.String r0 = "hmsrootcas.bks"
            java.io.InputStream r7 = r7.open(r0)
            r6.c(r7)
        L_0x004d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "loadBksCA: cost : "
            r7.<init>(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r7.append(r0)
            java.lang.String r0 = " ms"
            r7.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.d8p.b(android.content.Context):void");
    }

    public final void c(InputStream inputStream) throws NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException {
        TrustManager[] trustManagers;
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            KeyStore instance2 = KeyStore.getInstance(t8y.e);
            instance2.load(inputStream, "".toCharArray());
            instance.init(instance2);
            for (TrustManager trustManager : instance.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    this.f17650a.add((X509TrustManager) trustManager);
                }
            }
        } finally {
            r3y.b(inputStream);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        x5y.d("SX509TM", "checkClientTrusted: ");
        for (X509TrustManager x509TrustManager : this.f17650a) {
            try {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e) {
                x5y.c("SX509TM", "checkServerTrusted CertificateException" + e.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        x5y.d("SX509TM", "checkServerTrusted begin,size=" + x509CertificateArr.length + ",authType=" + str);
        long currentTimeMillis = System.currentTimeMillis();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            new StringBuilder("server ca chain: getSubjectDN is :").append(x509Certificate.getSubjectDN());
            new StringBuilder("IssuerDN :").append(x509Certificate.getIssuerDN());
            new StringBuilder("SerialNumber : ").append(x509Certificate.getSerialNumber());
        }
        List<X509TrustManager> list = this.f17650a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                x5y.d("SX509TM", "check server i=" + i);
                X509TrustManager x509TrustManager = list.get(i);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    x5y.d("SX509TM", "client root ca size=" + acceptedIssuers.length);
                    for (X509Certificate x509Certificate2 : acceptedIssuers) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("client root ca getIssuerDN :");
                        sb.append(x509Certificate2.getIssuerDN());
                    }
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                x5y.d("SX509TM", "checkServerTrusted end, " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e) {
                x5y.c("SX509TM", "checkServerTrusted error :" + e.getMessage() + " , time : " + i);
                if (i == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        x5y.c("SX509TM", "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder("checkServerTrusted: cost : ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(" ms");
    }

    public final void d(InputStream inputStream, String str) {
        if (inputStream == null || str == null) {
            throw new IllegalArgumentException("inputstream or trustPwd is null");
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
                KeyStore instance2 = KeyStore.getInstance(t8y.e);
                instance2.load(inputStream, str.toCharArray());
                instance.init(instance2);
                TrustManager[] trustManagers = instance.getTrustManagers();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        this.f17650a.add((X509TrustManager) trustManager);
                    }
                }
                r3y.b(inputStream);
            } finally {
                r3y.b(inputStream);
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            x5y.c("SX509TM", "loadInputStream: exception : " + e.getMessage());
        }
        StringBuilder sb = new StringBuilder("loadInputStream: cost : ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" ms");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            for (X509TrustManager x509TrustManager : this.f17650a) {
                arrayList.addAll(Arrays.asList(x509TrustManager.getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            x5y.c("SX509TM", "getAcceptedIssuers exception : " + e.getMessage());
            return new X509Certificate[0];
        }
    }

    public d8p(Context context, boolean z) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        this.f17650a = arrayList;
        if (context != null) {
            sq4.b(context);
            if (z) {
                a();
            }
            b(context);
            if (arrayList.isEmpty()) {
                throw new CertificateException("X509TrustManager is empty");
            }
            return;
        }
        throw new IllegalArgumentException("context is null");
    }

    public d8p(InputStream inputStream, String str) throws IllegalArgumentException {
        this.f17650a = new ArrayList();
        d(inputStream, str);
    }
}
