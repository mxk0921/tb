package com.taobao.wireless.security.adapter.common;

import android.content.Context;
import android.os.Build;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.taobao.wireless.security.adapter.common.в  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0808 {

    /* renamed from: а  reason: contains not printable characters */
    private static final boolean f545 = false;

    /* renamed from: б  reason: contains not printable characters */
    private static final String f546 = "HttpClientUtils";

    /* renamed from: в  reason: contains not printable characters */
    public static final int f547 = 22000;

    /* renamed from: г  reason: contains not printable characters */
    public static final int f548 = 0;

    /* renamed from: д  reason: contains not printable characters */
    private static final int f549 = 100168;

    /* renamed from: е  reason: contains not printable characters */
    private static Context f550;

    /* renamed from: com.taobao.wireless.security.adapter.common.в$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public static class C0809 {

        /* renamed from: а  reason: contains not printable characters */
        public static final int f551 = -1;

        /* renamed from: б  reason: contains not printable characters */
        public static final int f552 = 200;

        /* renamed from: в  reason: contains not printable characters */
        public static final int f553 = 400;

        /* renamed from: г  reason: contains not printable characters */
        public static final int f554 = 1000;

        /* renamed from: д  reason: contains not printable characters */
        public static final int f555 = 1002;

        /* renamed from: е  reason: contains not printable characters */
        public static final int f556 = 1003;

        /* renamed from: ё  reason: contains not printable characters */
        public static final int f557 = 1004;
    }

    /* renamed from: а  reason: contains not printable characters */
    private static void m351(URLConnection uRLConnection) {
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

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0229, code lost:
        if (com.taobao.wireless.security.adapter.common.C0808.f550.getPackageName().equalsIgnoreCase(com.android.dingtalk.share.ddsharemodule.ShareConstant.DD_APP_PACKAGE) != false) goto L_0x0176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0271, code lost:
        if (com.taobao.wireless.security.adapter.common.C0808.f550.getPackageName().equalsIgnoreCase(com.android.dingtalk.share.ddsharemodule.ShareConstant.DD_APP_PACKAGE) != false) goto L_0x0176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0174, code lost:
        if (com.taobao.wireless.security.adapter.common.C0808.f550.getPackageName().equalsIgnoreCase(com.android.dingtalk.share.ddsharemodule.ShareConstant.DD_APP_PACKAGE) != false) goto L_0x0176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0176, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01df, code lost:
        if (com.taobao.wireless.security.adapter.common.C0808.f550.getPackageName().equalsIgnoreCase(com.android.dingtalk.share.ddsharemodule.ShareConstant.DD_APP_PACKAGE) != false) goto L_0x0176;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021f A[Catch: all -> 0x0275, TRY_LEAVE, TryCatch #13 {all -> 0x0275, blocks: (B:65:0x0166, B:67:0x016a, B:69:0x0176, B:95:0x01d1, B:97:0x01d5, B:107:0x021b, B:109:0x021f, B:118:0x0263, B:120:0x0267), top: B:153:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0267 A[Catch: all -> 0x0275, TRY_LEAVE, TryCatch #13 {all -> 0x0275, blocks: (B:65:0x0166, B:67:0x016a, B:69:0x0176, B:95:0x01d1, B:97:0x01d5, B:107:0x021b, B:109:0x021f, B:118:0x0263, B:120:0x0267), top: B:153:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d5 A[Catch: all -> 0x0275, TRY_LEAVE, TryCatch #13 {all -> 0x0275, blocks: (B:65:0x0166, B:67:0x016a, B:69:0x0176, B:95:0x01d1, B:97:0x01d5, B:107:0x021b, B:109:0x021f, B:118:0x0263, B:120:0x0267), top: B:153:0x0030 }] */
    /* renamed from: б  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.wireless.security.adapter.common.C0807 m352(java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.wireless.security.adapter.common.C0808.m352(java.lang.String, java.util.Map):com.taobao.wireless.security.adapter.common.б");
    }

    /* renamed from: в  reason: contains not printable characters */
    public static C0807 m353(String str, Map<String, String> map, byte[] bArr) {
        return m354(str, map, bArr, null, 22000, 22000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x021c, code lost:
        if (com.taobao.wireless.security.adapter.common.C0808.f550.getPackageName().equalsIgnoreCase(com.android.dingtalk.share.ddsharemodule.ShareConstant.DD_APP_PACKAGE) != false) goto L_0x01a5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x026a, code lost:
        if (com.taobao.wireless.security.adapter.common.C0808.f550.getPackageName().equalsIgnoreCase(com.android.dingtalk.share.ddsharemodule.ShareConstant.DD_APP_PACKAGE) != false) goto L_0x01a5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b9, code lost:
        if (com.taobao.wireless.security.adapter.common.C0808.f550.getPackageName().equalsIgnoreCase(com.android.dingtalk.share.ddsharemodule.ShareConstant.DD_APP_PACKAGE) != false) goto L_0x01a5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a3, code lost:
        if (com.taobao.wireless.security.adapter.common.C0808.f550.getPackageName().equalsIgnoreCase(com.android.dingtalk.share.ddsharemodule.ShareConstant.DD_APP_PACKAGE) != false) goto L_0x01a5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a5, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x02c6: IF  (r13 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:155:0x02cd, block:B:152:0x02c6 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x02e8: INVOKE  (r5v2 ?? I:com.taobao.wireless.security.adapter.datareport.а$в), (r14 I:int) type: VIRTUAL call: com.taobao.wireless.security.adapter.datareport.а.в.з(int):void, block:B:157:0x02da */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0212 A[Catch: all -> 0x02bd, TRY_LEAVE, TryCatch #18 {all -> 0x02bd, blocks: (B:82:0x0195, B:84:0x0199, B:86:0x01a5, B:115:0x020e, B:117:0x0212, B:129:0x025c, B:131:0x0260, B:143:0x02ab, B:145:0x02af), top: B:192:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0260 A[Catch: all -> 0x02bd, TRY_LEAVE, TryCatch #18 {all -> 0x02bd, blocks: (B:82:0x0195, B:84:0x0199, B:86:0x01a5, B:115:0x020e, B:117:0x0212, B:129:0x025c, B:131:0x0260, B:143:0x02ab, B:145:0x02af), top: B:192:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02af A[Catch: all -> 0x02bd, TRY_LEAVE, TryCatch #18 {all -> 0x02bd, blocks: (B:82:0x0195, B:84:0x0199, B:86:0x01a5, B:115:0x020e, B:117:0x0212, B:129:0x025c, B:131:0x0260, B:143:0x02ab, B:145:0x02af), top: B:192:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0228 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x027e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: г  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.wireless.security.adapter.common.C0807 m354(java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17, byte[] r18, java.lang.String r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.wireless.security.adapter.common.C0808.m354(java.lang.String, java.util.Map, byte[], java.lang.String, int, int):com.taobao.wireless.security.adapter.common.б");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0243, code lost:
        if (com.taobao.wireless.security.adapter.common.C0808.f550.getPackageName().equalsIgnoreCase(com.android.dingtalk.share.ddsharemodule.ShareConstant.DD_APP_PACKAGE) != false) goto L_0x0381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02e0, code lost:
        if (com.taobao.wireless.security.adapter.common.C0808.f550.getPackageName().equalsIgnoreCase(com.android.dingtalk.share.ddsharemodule.ShareConstant.DD_APP_PACKAGE) != false) goto L_0x0381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x037f, code lost:
        if (com.taobao.wireless.security.adapter.common.C0808.f550.getPackageName().equalsIgnoreCase(r7) != false) goto L_0x0381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0381, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0239 A[Catch: all -> 0x0384, TRY_LEAVE, TryCatch #23 {all -> 0x0384, blocks: (B:127:0x0233, B:129:0x0239, B:150:0x02ce, B:152:0x02d4, B:172:0x036d, B:174:0x0373, B:176:0x0381), top: B:231:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d4 A[Catch: all -> 0x0384, TRY_LEAVE, TryCatch #23 {all -> 0x0384, blocks: (B:127:0x0233, B:129:0x0239, B:150:0x02ce, B:152:0x02d4, B:172:0x036d, B:174:0x0373, B:176:0x0381), top: B:231:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0373 A[Catch: all -> 0x0384, TryCatch #23 {all -> 0x0384, blocks: (B:127:0x0233, B:129:0x0239, B:150:0x02ce, B:152:0x02d4, B:172:0x036d, B:174:0x0373, B:176:0x0381), top: B:231:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03d4 A[Catch: all -> 0x03e3, TryCatch #2 {all -> 0x03e3, blocks: (B:194:0x03d0, B:196:0x03d4, B:198:0x03e0), top: B:211:0x03d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0333 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x039c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x029b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x033a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: д  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m355(java.lang.String r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.wireless.security.adapter.common.C0808.m355(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: е  reason: contains not printable characters */
    private static URLConnection m356(String str, int i, int i2, String str2) {
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

    /* renamed from: ж  reason: contains not printable characters */
    public static void m357(Context context) {
        if (context != null) {
            f550 = context;
        }
    }

    /* renamed from: ё  reason: contains not printable characters */
    private static int m358(URLConnection uRLConnection) throws IOException {
        return uRLConnection instanceof HttpsURLConnection ? ((HttpsURLConnection) uRLConnection).getResponseCode() : ((HttpURLConnection) uRLConnection).getResponseCode();
    }
}
