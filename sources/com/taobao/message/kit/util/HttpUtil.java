package com.taobao.message.kit.util;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import tb.itw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HttpUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HttpUtil";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class TrustAllManager implements X509TrustManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(529531007);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee06893b", new Object[]{this, x509CertificateArr, str});
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab6d06b3", new Object[]{this, x509CertificateArr, str});
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (X509Certificate[]) ipChange.ipc$dispatch("cdefad90", new Object[]{this});
            }
            return new X509Certificate[0];
        }
    }

    static {
        t2o.a(529531005);
    }

    public static String checkHttpUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46cef7b0", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        TLog.logv(TAG, "url before:" + str);
        StringBuilder sb = new StringBuilder();
        if (str.startsWith(itw.URL_SEPARATOR)) {
            sb.append("http:");
            sb.append(str);
        } else {
            sb.append(str);
        }
        String sb2 = sb.toString();
        TLog.logv(TAG, "url after:" + sb2);
        return sb2;
    }

    private static boolean checkUrlPathSuffix(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8635b39c", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith(str2)) {
            return true;
        }
        try {
        } catch (Exception e) {
            TLog.loge(Log.getStackTraceString(e), new String[0]);
        }
        if (Uri.parse(str).getLastPathSegment().endsWith(str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String httpRequest(java.lang.String r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.kit.util.HttpUtil.httpRequest(java.lang.String, java.lang.String, java.util.Map):java.lang.String");
    }

    public static boolean isAnimationPic(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4a10845", new Object[]{str})).booleanValue();
        }
        if (isApng(str) || isGifUrl(str)) {
            return true;
        }
        return false;
    }

    public static boolean isApng(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbf19f87", new Object[]{str})).booleanValue();
        }
        return checkUrlPathSuffix(str, ".apng");
    }

    public static boolean isGifUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f0925aa", new Object[]{str})).booleanValue();
        }
        return checkUrlPathSuffix(str, ".gif");
    }

    public static HttpURLConnection create(URL url) throws NoSuchAlgorithmException, KeyManagementException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("7cfd347d", new Object[]{url});
        }
        if (!url.getProtocol().startsWith("https")) {
            return (HttpURLConnection) url.openConnection();
        }
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, new TrustManager[]{new TrustAllManager()}, null);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        if (TextUtils.equals("true", ConfigUtil.getValue("mpm_business_switch", "ignorehttpscheck", "false"))) {
            httpsURLConnection.setSSLSocketFactory(instance.getSocketFactory());
        }
        httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: com.taobao.message.kit.util.HttpUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("563b2905", new Object[]{this, str, sSLSession})).booleanValue();
                }
                return true;
            }
        });
        return httpsURLConnection;
    }
}
