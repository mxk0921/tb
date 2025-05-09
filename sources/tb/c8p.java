package tb;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c8p {

    /* renamed from: a  reason: collision with root package name */
    public static volatile d8p f16913a;

    public static d8p a(Context context) throws CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        InputStream inputStream;
        long currentTimeMillis = System.currentTimeMillis();
        if (context != null) {
            sq4.b(context);
            if (f16913a == null) {
                synchronized (c8p.class) {
                    if (f16913a == null) {
                        try {
                            inputStream = af2.n(context);
                        } catch (RuntimeException unused) {
                            x5y.c("SecureX509SingleInstance", "get files bks error");
                            inputStream = null;
                        }
                        if (inputStream == null) {
                            x5y.d("SecureX509SingleInstance", "get assets bks");
                            inputStream = context.getAssets().open("hmsrootcas.bks");
                        } else {
                            x5y.d("SecureX509SingleInstance", "get files bks");
                        }
                        f16913a = new d8p(inputStream, "");
                    }
                }
            }
            StringBuilder sb = new StringBuilder("SecureX509TrustManager getInstance: cost : ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms");
            return f16913a;
        }
        throw new NullPointerException("context is null");
    }
}
