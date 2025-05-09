package com.mobile.auth;

import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.b;
import java.io.Closeable;
import java.io.IOException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00O0o implements O00OO0O {
    private static O00Ooo00 O000000o;

    private String O000000o() {
        return b.f4616a[0] + "." + b.f4616a[2] + "." + b.f4616a[4] + "." + b.f4616a[6];
    }

    public synchronized SSLSocketFactory O000000o(O00OoO0o o00OoO0o, a aVar) {
        if (o00OoO0o instanceof O00Oo0o0) {
            O00Ooo00 o00Ooo00 = new O00Ooo00(HttpsURLConnection.getDefaultSSLSocketFactory(), aVar);
            if (O000000o == null) {
                O000000o = o00Ooo00;
            }
            return o00Ooo00;
        }
        if (O000000o == null) {
            O000000o = new O00Ooo00(HttpsURLConnection.getDefaultSSLSocketFactory(), aVar);
        }
        return O000000o;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(31:5|(1:7)|17|18|(1:20)(1:22)|21|142|23|(3:25|(5:28|29|136|30|26)|146)|39|(3:41|(2:43|(1:45))|(1:48)(1:49))|46|50|(1:52)|53|54|(3:56|140|57)(1:62)|63|138|64|65|133|66|(2:67|(1:69)(1:147))|74|75|(1:77)(1:78)|79|(2:86|149)|85|148)|(29:16|18|(0)(0)|21|142|23|(0)|39|(0)|46|50|(0)|53|54|(0)(0)|63|138|64|65|133|66|(3:67|(0)(0)|69)|74|75|(0)(0)|79|(1:81)|86|149)|133|66|(3:67|(0)(0)|69)|74|75|(0)(0)|79|(0)|86|149) */
    /* JADX WARN: Can't wrap try/catch for region: R(35:2|(2:144|3)|(31:5|(1:7)|17|18|(1:20)(1:22)|21|142|23|(3:25|(5:28|29|136|30|26)|146)|39|(3:41|(2:43|(1:45))|(1:48)(1:49))|46|50|(1:52)|53|54|(3:56|140|57)(1:62)|63|138|64|65|133|66|(2:67|(1:69)(1:147))|74|75|(1:77)(1:78)|79|(2:86|149)|85|148)|14|(29:16|18|(0)(0)|21|142|23|(0)|39|(0)|46|50|(0)|53|54|(0)(0)|63|138|64|65|133|66|(3:67|(0)(0)|69)|74|75|(0)(0)|79|(1:81)|86|149)|17|18|(0)(0)|21|142|23|(0)|39|(0)|46|50|(0)|53|54|(0)(0)|63|138|64|65|133|66|(3:67|(0)(0)|69)|74|75|(0)(0)|79|(0)|86|149|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0254, code lost:
        r12.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0271, code lost:
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0274, code lost:
        r6 = r10.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c6, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ea, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01eb, code lost:
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ee, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ef, code lost:
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0219, code lost:
        r15 = 200050;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0220, code lost:
        r15 = 102102;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x018f A[EDGE_INSN: B:147:0x018f->B:74:0x018f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[Catch: all -> 0x004a, Exception -> 0x0053, TryCatch #8 {Exception -> 0x0053, all -> 0x004a, blocks: (B:3:0x0030, B:5:0x0045, B:14:0x005c, B:16:0x0066, B:18:0x0072, B:20:0x0078, B:21:0x0086, B:22:0x0089), top: B:144:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089 A[Catch: all -> 0x004a, Exception -> 0x0053, TRY_LEAVE, TryCatch #8 {Exception -> 0x0053, all -> 0x004a, blocks: (B:3:0x0030, B:5:0x0045, B:14:0x005c, B:16:0x0066, B:18:0x0072, B:20:0x0078, B:21:0x0086, B:22:0x0089), top: B:144:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[Catch: all -> 0x00c6, Exception -> 0x00ca, TryCatch #9 {Exception -> 0x00ca, all -> 0x00c6, blocks: (B:23:0x0094, B:25:0x009a, B:26:0x00a2, B:28:0x00a8), top: B:142:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[Catch: all -> 0x00c0, Exception -> 0x00c3, TryCatch #12 {Exception -> 0x00c3, all -> 0x00c0, blocks: (B:30:0x00b6, B:41:0x00d2, B:43:0x00d6, B:48:0x00df, B:49:0x0113, B:50:0x011b, B:52:0x013c, B:53:0x0145, B:56:0x0150), top: B:136:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c A[Catch: all -> 0x00c0, Exception -> 0x00c3, TryCatch #12 {Exception -> 0x00c3, all -> 0x00c0, blocks: (B:30:0x00b6, B:41:0x00d2, B:43:0x00d6, B:48:0x00df, B:49:0x0113, B:50:0x011b, B:52:0x013c, B:53:0x0145, B:56:0x0150), top: B:136:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0150 A[Catch: all -> 0x00c0, Exception -> 0x00c3, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x00c3, all -> 0x00c0, blocks: (B:30:0x00b6, B:41:0x00d2, B:43:0x00d6, B:48:0x00df, B:49:0x0113, B:50:0x011b, B:52:0x013c, B:53:0x0145, B:56:0x0150), top: B:136:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017c A[Catch: all -> 0x018a, Exception -> 0x018d, LOOP:1: B:67:0x0176->B:69:0x017c, LOOP_END, TryCatch #2 {Exception -> 0x018d, blocks: (B:66:0x0174, B:67:0x0176, B:69:0x017c, B:74:0x018f), top: B:133:0x0174 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022a A[Catch: all -> 0x018a, TryCatch #6 {all -> 0x018a, blocks: (B:66:0x0174, B:67:0x0176, B:69:0x017c, B:74:0x018f, B:91:0x01f0, B:95:0x0226, B:97:0x022a, B:99:0x0232, B:101:0x023a), top: B:133:0x0174 }] */
    @Override // com.mobile.auth.O00OO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O000000o(com.mobile.auth.O00o00 r20, com.mobile.auth.O0O00oO r21, com.cmic.sso.sdk.a r22) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O00O0o.O000000o(com.mobile.auth.O00o00, com.mobile.auth.O0O00oO, com.cmic.sso.sdk.a):void");
    }

    private void O000000o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
