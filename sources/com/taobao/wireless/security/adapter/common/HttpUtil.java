package com.taobao.wireless.security.adapter.common;

/* loaded from: classes.dex */
public class HttpUtil {

    /* renamed from: а  reason: contains not printable characters */
    private static String f525 = "HttpUtil";

    /* renamed from: б  reason: contains not printable characters */
    private static int f526 = 1000;

    public static String downloadFileBridge(String str, String str2) {
        return C0808.m355(str, str2);
    }

    public static String sendSyncHttpGetRequestBridge(String str) {
        C0807 r1 = C0808.m352(str, null);
        if (r1 != null) {
            return r1.f542;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #0 {Exception -> 0x0063, blocks: (B:23:0x004a, B:25:0x0060), top: B:29:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String sendSyncHttpPostRequestBridge(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, int r11) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x0063
            int r1 = r7.length()
            if (r1 == 0) goto L_0x0063
            if (r9 == 0) goto L_0x0063
            int r1 = r9.length()
            if (r1 != 0) goto L_0x0012
            goto L_0x0063
        L_0x0012:
            r1 = 1
            if (r10 != r1) goto L_0x0035
            if (r8 == 0) goto L_0x0034
            int r10 = r8.length()
            if (r10 != 0) goto L_0x001e
            goto L_0x0034
        L_0x001e:
            java.lang.String[] r10 = new java.lang.String[r1]
            r1 = 0
            r10[r1] = r8
            boolean r10 = com.taobao.wireless.security.adapter.common.C0806.m349(r10)
            if (r10 == 0) goto L_0x0045
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.String r1 = "keyindex"
            r10.put(r1, r8)
            goto L_0x0045
        L_0x0034:
            return r0
        L_0x0035:
            r8 = 2
            if (r10 != r8) goto L_0x0045
            java.lang.String r8 = "+"
            java.lang.String r10 = "%2B"
            java.lang.String r8 = r9.replace(r8, r10)
            byte[] r8 = r8.getBytes()
            goto L_0x0049
        L_0x0045:
            byte[] r8 = r9.getBytes()
        L_0x0049:
            r3 = r8
            java.lang.String r4 = "application/x-www-form-urlencoded;charset=UTF-8"
            r2 = 0
            int r8 = com.taobao.wireless.security.adapter.common.HttpUtil.f526     // Catch: Exception -> 0x0063
            int r5 = r11 * r8
            int r8 = com.taobao.wireless.security.adapter.common.HttpUtil.f526     // Catch: Exception -> 0x0063
            int r6 = r11 * r8
            r1 = r7
            com.taobao.wireless.security.adapter.common.б r7 = com.taobao.wireless.security.adapter.common.C0808.m354(r1, r2, r3, r4, r5, r6)     // Catch: Exception -> 0x0063
            int r8 = r7.f543     // Catch: Exception -> 0x0063
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x0063
            java.lang.String r7 = r7.f542     // Catch: Exception -> 0x0063
            r0 = r7
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.wireless.security.adapter.common.HttpUtil.sendSyncHttpPostRequestBridge(java.lang.String, java.lang.String, java.lang.String, int, int):java.lang.String");
    }
}
