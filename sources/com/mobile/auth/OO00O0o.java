package com.mobile.auth;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class OO00O0o {
    private static ConcurrentHashMap<String, HostnameVerifier> O000000o = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4 A[Catch: all -> 0x01b6, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c9 A[Catch: all -> 0x01b6, TRY_LEAVE, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0167 A[Catch: all -> 0x016b, TRY_ENTER, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f A[Catch: all -> 0x016b, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174 A[Catch: all -> 0x016b, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179 A[Catch: all -> 0x016b, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191 A[Catch: all -> 0x0195, TRY_ENTER, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0199 A[Catch: all -> 0x0195, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019e A[Catch: all -> 0x0195, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a3 A[Catch: all -> 0x0195, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a8 A[Catch: all -> 0x0195, TRY_LEAVE, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b2 A[Catch: all -> 0x01b6, TRY_ENTER, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba A[Catch: all -> 0x01b6, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bf A[Catch: all -> 0x01b6, TryCatch #17 {all -> 0x0012, blocks: (B:3:0x0001, B:6:0x000d, B:103:0x01d0, B:70:0x0167, B:72:0x016f, B:74:0x0174, B:76:0x0179, B:78:0x017e, B:83:0x0191, B:85:0x0199, B:87:0x019e, B:89:0x01a3, B:91:0x01a8, B:94:0x01b2, B:96:0x01ba, B:98:0x01bf, B:100:0x01c4, B:102:0x01c9, B:41:0x00f9, B:42:0x00ff), top: B:112:0x0001 }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.mobile.auth.OO00OOO] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O000000o(com.mobile.auth.OO00OOO r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.OO00O0o.O000000o(com.mobile.auth.OO00OOO, int, int):java.lang.String");
    }

    private static HostnameVerifier O00000Oo(String str) {
        try {
            String O000000o2 = O000000o(str);
            if (O000000o != null && !TextUtils.isEmpty(O000000o2) && O000000o.containsKey(O000000o2)) {
                return O000000o.get(O000000o2);
            }
            HostnameVerifier hostnameVerifier = new HostnameVerifier() { // from class: com.mobile.auth.OO00O0o.1
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str2, SSLSession sSLSession) {
                    try {
                        return HttpsURLConnection.getDefaultHostnameVerifier().verify(str2, sSLSession);
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
            if (O000000o == null) {
                O000000o = new ConcurrentHashMap<>();
            }
            O000000o.put(O000000o2, hostnameVerifier);
            return hostnameVerifier;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100 A[Catch: all -> 0x00fc, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105 A[Catch: all -> 0x00fc, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010a A[Catch: all -> 0x00fc, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d A[Catch: all -> 0x0121, TRY_ENTER, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0125 A[Catch: all -> 0x0121, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a A[Catch: all -> 0x0121, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012f A[Catch: all -> 0x0121, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134 A[Catch: all -> 0x0121, TRY_LEAVE, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013e A[Catch: all -> 0x0142, TRY_ENTER, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0146 A[Catch: all -> 0x0142, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014b A[Catch: all -> 0x0142, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0150 A[Catch: all -> 0x0142, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0155 A[Catch: all -> 0x0142, TRY_LEAVE, TryCatch #10 {all -> 0x001b, blocks: (B:3:0x0001, B:6:0x0016, B:99:0x015c, B:79:0x011d, B:81:0x0125, B:83:0x012a, B:85:0x012f, B:87:0x0134, B:90:0x013e, B:92:0x0146, B:94:0x014b, B:96:0x0150, B:98:0x0155, B:26:0x0092, B:27:0x0098, B:67:0x00f8, B:69:0x0100, B:71:0x0105, B:73:0x010a, B:75:0x010f), top: B:119:0x0001 }] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String O000000o(com.mobile.auth.OO00OOO r6, int r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.OO00O0o.O000000o(com.mobile.auth.OO00OOO, int, int, int):java.lang.String");
    }

    public static String O000000o(String str) {
        try {
            try {
                return new URL(str).getHost();
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return null;
            }
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
