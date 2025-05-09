package tb;

import android.os.Build;
import com.ali.user.mobile.rpc.safe.AES;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class eoo {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f18731a = {"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"};
    public static final String[] b = {"TLS_RSA", AES.BLOCK_MODE, "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "NULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};

    public static boolean a(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return b(sSLSocket, b);
    }

    public static boolean b(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        for (String str : enabledCipherSuites) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    arrayList.add(str);
                    break;
                } else if (upperCase.contains(strArr[i].toUpperCase(Locale.ENGLISH))) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }

    public static void c(SSLSocket sSLSocket) {
        if (sSLSocket != null && !g(sSLSocket)) {
            a(sSLSocket);
        }
    }

    public static void d(SSLSocket sSLSocket) {
        if (sSLSocket != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.3", "TLSv1.2"});
            }
            if (i < 29) {
                sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
            }
        }
    }

    public static SSLContext f() throws NoSuchAlgorithmException {
        if (Build.VERSION.SDK_INT >= 29) {
            return SSLContext.getInstance("TLSv1.3");
        }
        return SSLContext.getInstance("TLSv1.2");
    }

    public static boolean g(SSLSocket sSLSocket) {
        if (sSLSocket == null) {
            return false;
        }
        return h(sSLSocket, f18731a);
    }

    public static boolean h(SSLSocket sSLSocket, String[] strArr) {
        if (sSLSocket == null) {
            return false;
        }
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        ArrayList arrayList = new ArrayList();
        List asList = Arrays.asList(strArr);
        for (String str : enabledCipherSuites) {
            if (asList.contains(str.toUpperCase(Locale.ENGLISH))) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        return true;
    }

    public static boolean e(SSLSocket sSLSocket, String[] strArr) {
        if (!(sSLSocket == null || strArr == null)) {
            try {
                sSLSocket.setEnabledProtocols(strArr);
                return true;
            } catch (Exception e) {
                x5y.c("SSLUtil", "setEnabledProtocols: exception : " + e.getMessage());
            }
        }
        return false;
    }
}
