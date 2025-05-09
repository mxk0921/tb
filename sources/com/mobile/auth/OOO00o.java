package com.mobile.auth;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.json.JSONObject;
import tb.y1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class OOO00o {
    public static boolean O000000o;
    public static boolean O00000Oo;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class O000000o implements HostnameVerifier {
        public O000000o() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            try {
                if (!TextUtils.isEmpty(str) && sSLSession != null) {
                    try {
                        if (OOOO00O.O000000o(str, ((X509Certificate) sSLSession.getPeerCertificates()[0]).getSubjectDN().getName())) {
                            return true;
                        }
                        return false;
                    } catch (SSLPeerUnverifiedException unused) {
                        OOO.O00000Oo();
                    }
                }
                return false;
            } catch (Throwable th) {
                ExceptionProcessor.processException(th);
                return false;
            }
        }
    }

    public final String O000000o(Context context, String str, HashMap<String, String> hashMap, Object obj) {
        HttpsURLConnection httpsURLConnection;
        Exception e;
        String str2 = str;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = "";
            String str4 = "seqAndroidEmpty";
            try {
                str3 = new URL(str2).getHost();
            } catch (MalformedURLException unused) {
                OOO.O00000Oo();
            }
            if (str3.contains(OO0Oo00.O00000o()) && O00000Oo && O000000o) {
                if (!TextUtils.isEmpty(OOOO00O.O000000o)) {
                    str2 = str2.replaceFirst(OO0Oo00.O00000o(), O000000o(OOOO00O.O000000o));
                }
                O00000Oo = false;
            }
            try {
                try {
                    URL url = new URL(str2);
                    httpsURLConnection = (HttpsURLConnection) (obj != null ? ((Network) obj).openConnection(url) : url.openConnection());
                } catch (Exception e2) {
                    e = e2;
                    httpsURLConnection = null;
                }
                try {
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setDoOutput(false);
                    httpsURLConnection.setUseCaches(false);
                    httpsURLConnection.setInstanceFollowRedirects(false);
                    httpsURLConnection.setReadTimeout(10000);
                    httpsURLConnection.setConnectTimeout(10000);
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setHostnameVerifier(new O000000o());
                    OOO0OO0.O000000o();
                    httpsURLConnection.setInstanceFollowRedirects(true);
                    HttpURLConnection.setFollowRedirects(true);
                    if (hashMap != null) {
                        for (Iterator<String> it = hashMap.keySet().iterator(); it.hasNext(); it = it) {
                            String next = it.next();
                            httpsURLConnection.setRequestProperty(next, hashMap.get(next));
                        }
                    }
                    httpsURLConnection.addRequestProperty("Connection", "close");
                    OOO.O00000o0("TAG\thttpsURLConnection.connect();\n");
                    httpsURLConnection.connect();
                    OOO.O00000o0("connect cost:" + (System.currentTimeMillis() - currentTimeMillis));
                    long currentTimeMillis2 = System.currentTimeMillis();
                    int responseCode = httpsURLConnection.getResponseCode();
                    OOO.O00000o0("response cost:" + (System.currentTimeMillis() - currentTimeMillis2));
                    String url2 = httpsURLConnection.getURL().toString();
                    if (url2.contains("ret_url")) {
                        str4 = Uri.parse(new String(Base64.decode(Uri.parse(url2).getQueryParameter("ret_url"), 0))).getQueryParameter(y1r.COL_SEQ);
                        OOO.O00000o0("seq = " + str4 + "\nstatusCode = " + responseCode);
                    }
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        String str5 = new String(O000000o(inputStream));
                        httpsURLConnection.disconnect();
                        inputStream.close();
                        if (TextUtils.isEmpty(str5)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", 410012);
                            jSONObject.put("msg", "outputStr isEmpty");
                            jSONObject.put(y1r.COL_SEQ, str4);
                            jSONObject.put("data", "requestUrl:".concat(String.valueOf(str2)));
                            return jSONObject.toString();
                        }
                        JSONObject jSONObject2 = new JSONObject(str5);
                        if (TextUtils.isEmpty(jSONObject2.optString(y1r.COL_SEQ))) {
                            jSONObject2.put(y1r.COL_SEQ, str4);
                        }
                        return jSONObject2.toString();
                    } else if (responseCode == 302) {
                        String str6 = new String(httpsURLConnection.getHeaderField("Location"));
                        OOO.O00000o0("statusCode == 302, redirectUrl is \n".concat(str6));
                        OOO.O00000o0("System.currentTimeMillis() is  \n" + System.currentTimeMillis());
                        httpsURLConnection.getInputStream().close();
                        httpsURLConnection.disconnect();
                        if (TextUtils.isEmpty(str6)) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("code", 410013);
                            jSONObject3.put("msg", "无跳转地址");
                            jSONObject3.put("data", str3);
                            return jSONObject3.toString();
                        } else if (str6.startsWith("https")) {
                            return O000000o(context, str6, hashMap, obj);
                        } else {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("code", 410013);
                            jSONObject4.put("msg", "无法跳转HTTP地址");
                            jSONObject4.put("data", str3);
                            return jSONObject4.toString();
                        }
                    } else {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("code", 410010);
                        jSONObject5.put("msg", "https statusCode NOK ".concat(String.valueOf(responseCode)));
                        jSONObject5.put("data", "requestUrl:".concat(String.valueOf(str2)));
                        return jSONObject5.toString();
                    }
                } catch (Exception e3) {
                    e = e3;
                    try {
                        httpsURLConnection.getInputStream().close();
                        httpsURLConnection.disconnect();
                    } catch (Exception unused2) {
                    }
                    int O00000oO = OOOO0.O00000oO();
                    OOO.O00000o0("\n■★■★■★■★■★■★■★■★■★■\n iRetry = >" + O00000oO + " \n   e-->" + e + "\n ■★■★■★■★■★■★■★■★■★■\n");
                    OOO.O00000Oo();
                    String message = e.getMessage();
                    if (message == null || O00000oO >= OOOO0.O00000o()) {
                        try {
                            OOO.O00000o0("catch (Exception e) is  ".concat(String.valueOf(e)));
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("code", 410011);
                            jSONObject6.put("msg", "https异常 : ".concat(String.valueOf(message)));
                            jSONObject6.put("data", "requestUrl->".concat(String.valueOf(str2)));
                            return jSONObject6.toString();
                        } catch (Exception unused3) {
                            return null;
                        }
                    } else {
                        int O00000oo = OOOO0.O00000oo();
                        if (message.contains("resolve host") && (str3.contains(OO0Oo00.O00000o()) || str3.contains(OO0Oo00.O00000oO()))) {
                            OOO.O00000o0("resolve host error: retry->" + O00000oo + " times \ne_getMessage=" + message);
                            if (O00000Oo && O000000o && !TextUtils.isEmpty(OOOO00O.O000000o)) {
                                str2 = str2.replaceFirst(OO0Oo00.O00000o(), O000000o(OOOO00O.O000000o));
                            }
                            return O000000o(context, str2, hashMap, obj);
                        } else if (message.contains("Failed to connect")) {
                            OOO.O00000o0("Failed to connect error: retry->" + O00000oo + " times \ne_getMessage=" + message);
                            return O000000o(context, str2, hashMap, obj);
                        } else {
                            OOO.O00000o0("other  error: retry->" + O00000oo + " times \ne_getMessage=" + message);
                            return O000000o(context, str2, hashMap, obj);
                        }
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[Catch: Exception -> 0x004d, TRY_LEAVE, TryCatch #1 {Exception -> 0x004d, blocks: (B:26:0x0045, B:28:0x004a), top: B:34:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String O000000o(java.io.InputStream r6) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x002b, Exception -> 0x0030
            r1.<init>()     // Catch: all -> 0x002b, Exception -> 0x0030
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: all -> 0x0016, Exception -> 0x0031
        L_0x000a:
            int r3 = r6.read(r2)     // Catch: all -> 0x0016, Exception -> 0x0031
            r4 = -1
            if (r3 == r4) goto L_0x0018
            r4 = 0
            r1.write(r2, r4, r3)     // Catch: all -> 0x0016, Exception -> 0x0031
            goto L_0x000a
        L_0x0016:
            r0 = move-exception
            goto L_0x0043
        L_0x0018:
            byte[] r2 = r1.toByteArray()     // Catch: all -> 0x0016, Exception -> 0x0031
            java.lang.String r3 = new java.lang.String     // Catch: all -> 0x0016, Exception -> 0x0031
            r3.<init>(r2)     // Catch: all -> 0x0016, Exception -> 0x0031
            r1.close()     // Catch: all -> 0x0028, Exception -> 0x002a
            r6.close()     // Catch: all -> 0x0028, Exception -> 0x002a
            goto L_0x002a
        L_0x0028:
            r6 = move-exception
            goto L_0x003f
        L_0x002a:
            return r3
        L_0x002b:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0043
        L_0x0030:
            r1 = r0
        L_0x0031:
            com.mobile.auth.OOO.O00000Oo()     // Catch: all -> 0x0016
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch: all -> 0x0028, Exception -> 0x0042
        L_0x0039:
            if (r6 == 0) goto L_0x0042
            r6.close()     // Catch: all -> 0x0028, Exception -> 0x0042
            goto L_0x0042
        L_0x003f:
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r6)
        L_0x0042:
            return r0
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch: Exception -> 0x004d
        L_0x0048:
            if (r6 == 0) goto L_0x004d
            r6.close()     // Catch: Exception -> 0x004d
        L_0x004d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.OOO00o.O000000o(java.io.InputStream):java.lang.String");
    }

    private static String O000000o(String str) {
        try {
            if (!str.contains(":")) {
                return str;
            }
            return "[" + str + "]";
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }
}
