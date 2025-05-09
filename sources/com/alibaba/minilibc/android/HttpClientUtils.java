package com.alibaba.minilibc.android;

import android.os.Build;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class HttpClientUtils {
    private static final boolean DEBUG = false;
    private static final int ERROR_HANDLER_METHOD_ID_DOWNLOAD_FILE_FAILED = 100168;
    private static final int ERROR_HANDLER_METHOD_ID_HTTPS_POST_ERROR = 100206;
    private static final String TAG = "HttpClientUtils";
    public static final int TIMEOUT_DEFAULT = 22000;
    public static final int TIMEOUT_MIN = 0;

    /* loaded from: classes.dex */
    public static class ResCode {
        public static final int CUSTOM_SSL_HANDSHAKE_ERROR = 1004;
        public static final int CUSTOM_UNKONW_HOST = 1003;
        public static final int EXCEPTION = 1002;
        public static final int HTTP_RESPONSE_NULL = 1000;
        public static final int REQ_PARAM_INVALID = 400;
        public static final int STATUS_OK = 200;
        public static final int UNKNOWN = -1;
    }

    private static void disconnect(URLConnection uRLConnection) {
        if (uRLConnection != null) {
            try {
                if (uRLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) uRLConnection).disconnect();
                } else if (uRLConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnection).disconnect();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021d A[Catch: Exception -> 0x0219, TRY_LEAVE, TryCatch #13 {Exception -> 0x0219, blocks: (B:114:0x0215, B:117:0x021d), top: B:140:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cf A[Catch: Exception -> 0x01cb, TRY_LEAVE, TryCatch #2 {Exception -> 0x01cb, blocks: (B:95:0x01c7, B:98:0x01cf), top: B:128:0x01c7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.minilibc.android.HttpClientResult doHttpPost(java.lang.String r25, java.util.Map<java.lang.String, java.lang.String> r26, byte[] r27, java.lang.String r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.minilibc.android.HttpClientUtils.doHttpPost(java.lang.String, java.util.Map, byte[], java.lang.String, int, int):com.alibaba.minilibc.android.HttpClientResult");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0285 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0241 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x027e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean downloadFile(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.minilibc.android.HttpClientUtils.downloadFile(java.lang.String, java.lang.String):boolean");
    }

    private static URLConnection getDefaultURLConnection(String str, int i, int i2, String str2) {
        URLConnection uRLConnection = null;
        try {
        } catch (Throwable th) {
            UserTrackMethodJniBridge.addUtRecord("100168", 1, 0, "", 0L, th.getMessage(), str, "", "", "");
        }
        if (!str.startsWith("http")) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
        uRLConnection = new URL(str).openConnection();
        if (i <= 0) {
            i = 22000;
        }
        if (i2 <= 0) {
            i2 = 22000;
        }
        if (str.startsWith("https")) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
            httpsURLConnection.setConnectTimeout(i);
            httpsURLConnection.setReadTimeout(i2);
            httpsURLConnection.setRequestMethod(str2);
        } else {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setRequestMethod(str2);
        }
        uRLConnection.setUseCaches(false);
        if ("POST".equals(str2)) {
            uRLConnection.setRequestProperty("Content-Type", "text/plain;charset=UTF-8");
            uRLConnection.setDoOutput(true);
        }
        uRLConnection.setRequestProperty("Accept-Charset", "UTF-8");
        return uRLConnection;
    }

    private static int getResponseCode(URLConnection uRLConnection) throws IOException {
        return uRLConnection instanceof HttpsURLConnection ? ((HttpsURLConnection) uRLConnection).getResponseCode() : ((HttpURLConnection) uRLConnection).getResponseCode();
    }
}
