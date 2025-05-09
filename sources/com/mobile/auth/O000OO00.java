package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O000OO00 {
    private static final String O000000o = "O000OO00";

    public static O000O0o O000000o(Context context, HttpURLConnection httpURLConnection) {
        String str;
        try {
            O000O0o o000O0o = new O000O0o();
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            List<String> list = headerFields.get("Log-Level");
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    String str2 = list.get(0);
                    if (!TextUtils.isEmpty(str2)) {
                        O0000Oo.O00000Oo(context, str2);
                    }
                }
            }
            List<String> list2 = headerFields.get("dm");
            if (list2 != null && !list2.isEmpty() && (str = list2.get(0)) != null && (str.equals("1") || str.equals("2"))) {
                String O0000OOo = O000OO.O0000OOo(context);
                if (!TextUtils.isEmpty(O0000OOo) && !O0000OOo.equals(str)) {
                    o000O0o.O00000Oo = true;
                }
            }
            List<String> list3 = headerFields.get("p-ikgx");
            if (list3 != null && !list3.isEmpty()) {
                String str3 = list3.get(0);
                if (!TextUtils.isEmpty(str3)) {
                    o000O0o.O000000o = str3;
                }
            }
            return o000O0o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0204, code lost:
        if (r2 == null) goto L_0x02f8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0206, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x024f, code lost:
        if (r2 == null) goto L_0x02f8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02b1, code lost:
        if (r2 != null) goto L_0x0206;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b9 A[Catch: all -> 0x02f8, TRY_ENTER, TryCatch #18 {all -> 0x02f8, blocks: (B:110:0x01b9, B:112:0x01be, B:115:0x0201, B:117:0x0206, B:121:0x024c, B:137:0x02ae, B:141:0x02f0, B:143:0x02f5), top: B:168:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01be A[Catch: all -> 0x02f8, TRY_LEAVE, TryCatch #18 {all -> 0x02f8, blocks: (B:110:0x01b9, B:112:0x01be, B:115:0x0201, B:117:0x0206, B:121:0x024c, B:137:0x02ae, B:141:0x02f0, B:143:0x02f5), top: B:168:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0201 A[Catch: all -> 0x02f8, TRY_ENTER, TryCatch #18 {all -> 0x02f8, blocks: (B:110:0x01b9, B:112:0x01be, B:115:0x0201, B:117:0x0206, B:121:0x024c, B:137:0x02ae, B:141:0x02f0, B:143:0x02f5), top: B:168:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024c A[Catch: all -> 0x02f8, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x02f8, blocks: (B:110:0x01b9, B:112:0x01be, B:115:0x0201, B:117:0x0206, B:121:0x024c, B:137:0x02ae, B:141:0x02f0, B:143:0x02f5), top: B:168:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0254 A[Catch: all -> 0x020b, TRY_ENTER, TryCatch #7 {all -> 0x020b, blocks: (B:113:0x01c3, B:119:0x020e, B:124:0x0254, B:125:0x0290, B:127:0x0296, B:129:0x029a, B:130:0x029d), top: B:168:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0296 A[Catch: all -> 0x020b, TryCatch #7 {all -> 0x020b, blocks: (B:113:0x01c3, B:119:0x020e, B:124:0x0254, B:125:0x0290, B:127:0x0296, B:129:0x029a, B:130:0x029d), top: B:168:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029a A[Catch: all -> 0x020b, TryCatch #7 {all -> 0x020b, blocks: (B:113:0x01c3, B:119:0x020e, B:124:0x0254, B:125:0x0290, B:127:0x0296, B:129:0x029a, B:130:0x029d), top: B:168:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a9 A[Catch: all -> 0x02a5, TRY_LEAVE, TryCatch #3 {all -> 0x02a5, blocks: (B:132:0x02a1, B:135:0x02a9), top: B:162:0x02a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ae A[Catch: all -> 0x02f8, TRY_ENTER, TRY_LEAVE, TryCatch #18 {all -> 0x02f8, blocks: (B:110:0x01b9, B:112:0x01be, B:115:0x0201, B:117:0x0206, B:121:0x024c, B:137:0x02ae, B:141:0x02f0, B:143:0x02f5), top: B:168:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f0 A[Catch: all -> 0x02f8, TRY_ENTER, TryCatch #18 {all -> 0x02f8, blocks: (B:110:0x01b9, B:112:0x01be, B:115:0x0201, B:117:0x0206, B:121:0x024c, B:137:0x02ae, B:141:0x02f0, B:143:0x02f5), top: B:168:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f5 A[Catch: all -> 0x02f8, TRY_LEAVE, TryCatch #18 {all -> 0x02f8, blocks: (B:110:0x01b9, B:112:0x01be, B:115:0x0201, B:117:0x0206, B:121:0x024c, B:137:0x02ae, B:141:0x02f0, B:143:0x02f5), top: B:168:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0302 A[Catch: all -> 0x0305, TRY_LEAVE, TryCatch #2 {all -> 0x0305, blocks: (B:148:0x02fd, B:150:0x0302), top: B:160:0x02fd }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.net.HttpURLConnection, javax.net.ssl.HttpsURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.net.HttpURLConnection, javax.net.ssl.HttpsURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.net.Network] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Unknown variable types count: 5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mobile.auth.O000OOo O000000o(android.content.Context r19, java.lang.String r20, java.lang.String r21, android.net.Network r22, java.lang.String r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O000OO00.O000000o(android.content.Context, java.lang.String, java.lang.String, android.net.Network, java.lang.String, java.lang.String, boolean):com.mobile.auth.O000OOo");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc A[Catch: all -> 0x00d8, Exception -> 0x00f8, TryCatch #6 {Exception -> 0x00f8, blocks: (B:51:0x00f4, B:55:0x00fc, B:57:0x0101), top: B:72:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101 A[Catch: all -> 0x00d8, Exception -> 0x00f8, TRY_LEAVE, TryCatch #6 {Exception -> 0x00f8, blocks: (B:51:0x00f4, B:55:0x00fc, B:57:0x0101), top: B:72:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O000000o(android.content.Context r16, java.lang.String r17, android.net.Network r18) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O000OO00.O000000o(android.content.Context, java.lang.String, android.net.Network):java.lang.String");
    }

    public static final HostnameVerifier O000000o() {
        try {
            return new HostnameVerifier() { // from class: com.mobile.auth.O000OO00.1
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str, SSLSession sSLSession) {
                    try {
                        HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
                        if (!defaultHostnameVerifier.verify("id6.me", sSLSession)) {
                            if (!defaultHostnameVerifier.verify("card.e.189.cn", sSLSession)) {
                                return false;
                            }
                        }
                        return true;
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                            return false;
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                            return false;
                        }
                    }
                }
            };
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
