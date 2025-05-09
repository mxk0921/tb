package com.mobile.auth;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00O0o00 {
    private static O00O0o00 O000000o;
    private static long O00000Oo;
    private O000000o O00000o0 = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class O000000o {
        private int O000000o = -1;
        private int O00000Oo = -1;

        public int O000000o() {
            return this.O00000Oo;
        }
    }

    private O00O0o00() {
    }

    public static O00O0o00 O000000o() {
        if (O000000o == null) {
            O000000o = new O00O0o00();
        }
        return O000000o;
    }

    public O000000o O00000Oo() {
        O000000o o000000o = this.O00000o0;
        return o000000o == null ? new O000000o() : o000000o;
    }

    private void O000000o(Context context) {
        SubscriptionManager from;
        int defaultDataSubscriptionId;
        int i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            from = SubscriptionManager.from(context.getApplicationContext());
            if (from != null) {
                try {
                    if (this.O00000o0.O000000o == -1 && i >= 24) {
                        O000000o o000000o = this.O00000o0;
                        defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
                        o000000o.O00000Oo = defaultDataSubscriptionId;
                        O0O0O.O00000Oo("UMCTelephonyManagement", "android 7.0及以上手机getDefaultDataSubscriptionId适配成功: dataSubId = " + this.O00000o0.O00000Oo);
                        return;
                    }
                } catch (Exception unused) {
                    O0O0O.O000000o("UMCTelephonyManagement", "android 7.0及以上手机getDefaultDataSubscriptionId适配失败");
                }
                try {
                    Object invoke = from.getClass().getMethod("getDefaultDataSubId", new Class[0]).invoke(from, new Object[0]);
                    if ((invoke instanceof Integer) || (invoke instanceof Long)) {
                        this.O00000o0.O00000Oo = ((Integer) invoke).intValue();
                        O0O0O.O00000Oo("UMCTelephonyManagement", "android 7.0以下手机getDefaultDataSubId适配成功: dataSubId = " + this.O00000o0.O00000Oo);
                        return;
                    }
                } catch (Exception unused2) {
                    O0O0O.O000000o("UMCTelephonyManagement", "readDefaultDataSubId-->getDefaultDataSubId 反射出错");
                }
                try {
                    Object invoke2 = from.getClass().getMethod("getDefaultDataSubscriptionId", new Class[0]).invoke(from, new Object[0]);
                    if ((invoke2 instanceof Integer) || (invoke2 instanceof Long)) {
                        this.O00000o0.O00000Oo = ((Integer) invoke2).intValue();
                        O0O0O.O00000Oo("UMCTelephonyManagement", "反射getDefaultDataSubscriptionId适配成功: dataSubId = " + this.O00000o0.O00000Oo);
                    }
                } catch (Exception unused3) {
                    O0O0O.O000000o("UMCTelephonyManagement", "getDefaultDataSubscriptionId-->getDefaultDataSubscriptionId 反射出错");
                }
            }
        } else {
            this.O00000o0.O000000o = -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
        if (r11 != null) goto L_0x0088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
        if (r11 == null) goto L_0x0095;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
        com.mobile.auth.O0O0O.O00000Oo("UMCTelephonyManagement", "readSimInfoDbEnd");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void O00000Oo(android.content.Context r11) {
        /*
            r10 = this;
            java.lang.String r0 = "sim_id"
            java.lang.String r1 = "_id"
            java.lang.String r2 = "readSimInfoDbStart"
            java.lang.String r3 = "UMCTelephonyManagement"
            com.mobile.auth.O0O0O.O00000Oo(r3, r2)
            java.lang.String r2 = "content://telephony/siminfo"
            android.net.Uri r5 = android.net.Uri.parse(r2)
            android.content.ContentResolver r4 = r11.getContentResolver()
            r11 = 0
            java.lang.String[] r6 = new java.lang.String[]{r1, r0}     // Catch: all -> 0x0076, Exception -> 0x008c
            java.lang.String r7 = "sim_id>=?"
            java.lang.String r2 = "0"
            java.lang.String[] r8 = new java.lang.String[]{r2}     // Catch: all -> 0x0076, Exception -> 0x008c
            r9 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch: all -> 0x0076, Exception -> 0x008c
            if (r11 == 0) goto L_0x0086
        L_0x002c:
            boolean r2 = r11.moveToNext()     // Catch: all -> 0x0076, Exception -> 0x008c
            if (r2 == 0) goto L_0x0086
            int r2 = r11.getColumnIndex(r0)     // Catch: all -> 0x0076, Exception -> 0x008c
            int r2 = r11.getInt(r2)     // Catch: all -> 0x0076, Exception -> 0x008c
            int r4 = r11.getColumnIndex(r1)     // Catch: all -> 0x0076, Exception -> 0x008c
            int r4 = r11.getInt(r4)     // Catch: all -> 0x0076, Exception -> 0x008c
            com.mobile.auth.O00O0o00$O000000o r5 = r10.O00000o0     // Catch: all -> 0x0076, Exception -> 0x008c
            int r5 = com.mobile.auth.O00O0o00.O000000o.O00000Oo(r5)     // Catch: all -> 0x0076, Exception -> 0x008c
            r6 = -1
            if (r5 != r6) goto L_0x0078
            com.mobile.auth.O00O0o00$O000000o r5 = r10.O00000o0     // Catch: all -> 0x0076, Exception -> 0x008c
            int r5 = com.mobile.auth.O00O0o00.O000000o.O000000o(r5)     // Catch: all -> 0x0076, Exception -> 0x008c
            if (r5 == r6) goto L_0x0078
            com.mobile.auth.O00O0o00$O000000o r5 = r10.O00000o0     // Catch: all -> 0x0076, Exception -> 0x008c
            int r5 = com.mobile.auth.O00O0o00.O000000o.O000000o(r5)     // Catch: all -> 0x0076, Exception -> 0x008c
            if (r5 != r4) goto L_0x0078
            com.mobile.auth.O00O0o00$O000000o r5 = r10.O00000o0     // Catch: all -> 0x0076, Exception -> 0x008c
            com.mobile.auth.O00O0o00.O000000o.O000000o(r5, r2)     // Catch: all -> 0x0076, Exception -> 0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x0076, Exception -> 0x008c
            r5.<init>()     // Catch: all -> 0x0076, Exception -> 0x008c
            java.lang.String r6 = "通过读取sim db获取数据流量卡的卡槽值："
            r5.append(r6)     // Catch: all -> 0x0076, Exception -> 0x008c
            r5.append(r2)     // Catch: all -> 0x0076, Exception -> 0x008c
            java.lang.String r5 = r5.toString()     // Catch: all -> 0x0076, Exception -> 0x008c
            com.mobile.auth.O0O0O.O00000Oo(r3, r5)     // Catch: all -> 0x0076, Exception -> 0x008c
            goto L_0x0078
        L_0x0076:
            r0 = move-exception
            goto L_0x009c
        L_0x0078:
            com.mobile.auth.O00O0o00$O000000o r5 = r10.O00000o0     // Catch: all -> 0x0076, Exception -> 0x008c
            int r5 = com.mobile.auth.O00O0o00.O000000o.O00000Oo(r5)     // Catch: all -> 0x0076, Exception -> 0x008c
            if (r5 != r2) goto L_0x002c
            com.mobile.auth.O00O0o00$O000000o r2 = r10.O00000o0     // Catch: all -> 0x0076, Exception -> 0x008c
            com.mobile.auth.O00O0o00.O000000o.O00000Oo(r2, r4)     // Catch: all -> 0x0076, Exception -> 0x008c
            goto L_0x002c
        L_0x0086:
            if (r11 == 0) goto L_0x0095
        L_0x0088:
            r11.close()
            goto L_0x0095
        L_0x008c:
            java.lang.String r0 = "readSimInfoDb error"
            com.mobile.auth.O0O0O.O000000o(r3, r0)     // Catch: all -> 0x0076
            if (r11 == 0) goto L_0x0095
            goto L_0x0088
        L_0x0095:
            java.lang.String r11 = "readSimInfoDbEnd"
            com.mobile.auth.O0O0O.O00000Oo(r3, r11)
            return
        L_0x009c:
            if (r11 == 0) goto L_0x00a1
            r11.close()
        L_0x00a1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O00O0o00.O00000Oo(android.content.Context):void");
    }

    public void O000000o(Context context, boolean z) {
        long currentTimeMillis = System.currentTimeMillis() - O00000Oo;
        if (currentTimeMillis >= 5000 || currentTimeMillis <= 0) {
            this.O00000o0 = new O000000o();
            if (z) {
                O000000o(context);
                if ((O0OO0Oo.O00000oO() || O0OO0Oo.O00000oo()) && O0OO0Oo.O00000o()) {
                    O0O0O.O00000Oo("UMCTelephonyManagement", "华为手机兼容性处理");
                    if (this.O00000o0.O00000Oo == 0 || this.O00000o0.O00000Oo == 1) {
                        if (this.O00000o0.O000000o == -1) {
                            O000000o o000000o = this.O00000o0;
                            o000000o.O000000o = o000000o.O00000Oo;
                        }
                        this.O00000o0.O00000Oo = -1;
                    }
                    if (!(this.O00000o0.O000000o == -1 && this.O00000o0.O00000Oo == -1)) {
                        O00000Oo(context);
                    }
                }
                O00000Oo = System.currentTimeMillis();
            }
        }
    }
}
