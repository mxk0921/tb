package com.loc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class fh {

    /* renamed from: a  reason: collision with root package name */
    Hashtable<String, ArrayList<a>> f5698a = new Hashtable<>();
    private long i = 0;
    private boolean j = false;
    private String k = "2.0.201501131131".replace(".", "");
    private String l = null;
    boolean b = true;
    long c = 0;
    String d = null;
    fa e = null;
    private String m = null;
    private long n = 0;
    boolean f = true;
    boolean g = true;
    String h = String.valueOf(AMapLocationClientOption.GeoLanguage.DEFAULT);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private ew f5699a = null;
        private String b = null;

        public final ew a() {
            return this.f5699a;
        }

        public final String b() {
            return this.b;
        }

        public final void a(ew ewVar) {
            this.f5699a = ewVar;
        }

        public final void a(String str) {
            this.b = TextUtils.isEmpty(str) ? null : str.replace("##", "#");
        }
    }

    private void c() {
        this.i = 0L;
        if (!this.f5698a.isEmpty()) {
            this.f5698a.clear();
        }
        this.j = false;
    }

    public final ew a(Context context, String str, StringBuilder sb, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str) || !fq.e()) {
            return null;
        }
        String str2 = str + "&" + this.f + "&" + this.g + "&" + this.h;
        if (str2.contains("gps") || !fq.e() || sb == null) {
            return null;
        }
        if (b()) {
            c();
            return null;
        }
        if (z && !this.j) {
            try {
                String a2 = a(str2, sb, context);
                c();
                a(context, a2, z2);
            } catch (Throwable unused) {
            }
        }
        if (this.f5698a.isEmpty()) {
            return null;
        }
        return a(str2, sb, z2);
    }

    public final void b(Context context) {
        try {
            c();
            c(context);
            this.j = false;
            this.d = null;
            this.n = 0L;
        } catch (Throwable th) {
            fr.a(th, "Cache", "destroy part");
        }
    }

    private boolean b() {
        long b = fy.b();
        long j = this.i;
        long j2 = b - j;
        if (j == 0) {
            return false;
        }
        return this.f5698a.size() > 360 || j2 > AuthenticatorCache.MAX_CACHE_TIME;
    }

    /* JADX WARN: Finally extract failed */
    private void c(Context context) throws Exception {
        if (context != null) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase openOrCreateDatabase = context.openOrCreateDatabase("hmdb", 0, null);
                if (fy.a(openOrCreateDatabase, "hist")) {
                    String[] strArr = {String.valueOf(fy.a() - AuthenticatorCache.MAX_CACHE_TIME)};
                    openOrCreateDatabase.delete("hist" + this.k, "time<?", strArr);
                    if (openOrCreateDatabase != null && openOrCreateDatabase.isOpen()) {
                        openOrCreateDatabase.close();
                    }
                } else if (openOrCreateDatabase != null && openOrCreateDatabase.isOpen()) {
                    openOrCreateDatabase.close();
                }
            } catch (Throwable th) {
                try {
                    fr.a(th, "DB", "clearHist p2");
                    if (0 != 0 && sQLiteDatabase.isOpen()) {
                        sQLiteDatabase.close();
                    }
                } catch (Throwable th2) {
                    if (0 != 0 && sQLiteDatabase.isOpen()) {
                        sQLiteDatabase.close();
                    }
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:5:0x000f, B:7:0x0015, B:9:0x0019, B:11:0x001d, B:17:0x0029, B:27:0x004b, B:31:0x0053, B:33:0x0061, B:39:0x0073, B:41:0x0079, B:45:0x0087, B:46:0x008e, B:47:0x0090, B:49:0x0094, B:51:0x009a, B:53:0x00a5, B:54:0x00a9, B:55:0x00ad, B:56:0x00b2, B:58:0x00b6, B:59:0x00bb, B:63:0x00c6, B:66:0x00d5, B:75:0x00e6), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087 A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:5:0x000f, B:7:0x0015, B:9:0x0019, B:11:0x001d, B:17:0x0029, B:27:0x004b, B:31:0x0053, B:33:0x0061, B:39:0x0073, B:41:0x0079, B:45:0x0087, B:46:0x008e, B:47:0x0090, B:49:0x0094, B:51:0x009a, B:53:0x00a5, B:54:0x00a9, B:55:0x00ad, B:56:0x00b2, B:58:0x00b6, B:59:0x00bb, B:63:0x00c6, B:66:0x00d5, B:75:0x00e6), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:5:0x000f, B:7:0x0015, B:9:0x0019, B:11:0x001d, B:17:0x0029, B:27:0x004b, B:31:0x0053, B:33:0x0061, B:39:0x0073, B:41:0x0079, B:45:0x0087, B:46:0x008e, B:47:0x0090, B:49:0x0094, B:51:0x009a, B:53:0x00a5, B:54:0x00a9, B:55:0x00ad, B:56:0x00b2, B:58:0x00b6, B:59:0x00bb, B:63:0x00c6, B:66:0x00d5, B:75:0x00e6), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6 A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:5:0x000f, B:7:0x0015, B:9:0x0019, B:11:0x001d, B:17:0x0029, B:27:0x004b, B:31:0x0053, B:33:0x0061, B:39:0x0073, B:41:0x0079, B:45:0x0087, B:46:0x008e, B:47:0x0090, B:49:0x0094, B:51:0x009a, B:53:0x00a5, B:54:0x00a9, B:55:0x00ad, B:56:0x00b2, B:58:0x00b6, B:59:0x00bb, B:63:0x00c6, B:66:0x00d5, B:75:0x00e6), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:5:0x000f, B:7:0x0015, B:9:0x0019, B:11:0x001d, B:17:0x0029, B:27:0x004b, B:31:0x0053, B:33:0x0061, B:39:0x0073, B:41:0x0079, B:45:0x0087, B:46:0x008e, B:47:0x0090, B:49:0x0094, B:51:0x009a, B:53:0x00a5, B:54:0x00a9, B:55:0x00ad, B:56:0x00b2, B:58:0x00b6, B:59:0x00bb, B:63:0x00c6, B:66:0x00d5, B:75:0x00e6), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d5 A[Catch: all -> 0x00ed, TryCatch #0 {all -> 0x00ed, blocks: (B:5:0x000f, B:7:0x0015, B:9:0x0019, B:11:0x001d, B:17:0x0029, B:27:0x004b, B:31:0x0053, B:33:0x0061, B:39:0x0073, B:41:0x0079, B:45:0x0087, B:46:0x008e, B:47:0x0090, B:49:0x0094, B:51:0x009a, B:53:0x00a5, B:54:0x00a9, B:55:0x00ad, B:56:0x00b2, B:58:0x00b6, B:59:0x00bb, B:63:0x00c6, B:66:0x00d5, B:75:0x00e6), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.loc.ew a(com.loc.fb r16, boolean r17, com.loc.ew r18, com.loc.ff r19, java.lang.StringBuilder r20, java.lang.String r21, android.content.Context r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fh.a(com.loc.fb, boolean, com.loc.ew, com.loc.ff, java.lang.StringBuilder, java.lang.String, android.content.Context, boolean):com.loc.ew");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0013, B:10:0x001b, B:12:0x0023, B:14:0x0031, B:18:0x0045, B:20:0x004b, B:22:0x0055, B:24:0x0068, B:27:0x0073, B:29:0x0077, B:31:0x007d, B:32:0x0089, B:34:0x008f, B:35:0x0093), top: B:39:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.loc.ew a(java.lang.String r5, java.lang.StringBuilder r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = "cgiwifi"
            boolean r1 = r5.contains(r1)     // Catch: all -> 0x0041
            if (r1 != 0) goto L_0x0045
            java.lang.String r1 = "wifi"
            boolean r1 = r5.contains(r1)     // Catch: all -> 0x0041
            if (r1 == 0) goto L_0x0013
            goto L_0x0045
        L_0x0013:
            java.lang.String r6 = "cgi"
            boolean r6 = r5.contains(r6)     // Catch: all -> 0x0041
            if (r6 == 0) goto L_0x0043
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.fh$a>> r6 = r4.f5698a     // Catch: all -> 0x0041
            boolean r6 = r6.containsKey(r5)     // Catch: all -> 0x0041
            if (r6 == 0) goto L_0x0043
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.fh$a>> r6 = r4.f5698a     // Catch: all -> 0x0041
            java.lang.Object r6 = r6.get(r5)     // Catch: all -> 0x0041
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: all -> 0x0041
            int r6 = r6.size()     // Catch: all -> 0x0041
            if (r6 <= 0) goto L_0x0043
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.fh$a>> r6 = r4.f5698a     // Catch: all -> 0x0041
            java.lang.Object r6 = r6.get(r5)     // Catch: all -> 0x0041
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: all -> 0x0041
            r1 = 0
            java.lang.Object r6 = r6.get(r1)     // Catch: all -> 0x0041
            com.loc.fh$a r6 = (com.loc.fh.a) r6     // Catch: all -> 0x0041
            goto L_0x0049
        L_0x0041:
            r5 = move-exception
            goto L_0x0098
        L_0x0043:
            r6 = r0
            goto L_0x0049
        L_0x0045:
            com.loc.fh$a r6 = r4.a(r6, r5)     // Catch: all -> 0x0041
        L_0x0049:
            if (r6 == 0) goto L_0x009f
            com.loc.ew r1 = r6.a()     // Catch: all -> 0x0041
            boolean r1 = com.loc.fy.a(r1)     // Catch: all -> 0x0041
            if (r1 == 0) goto L_0x009f
            com.loc.ew r1 = r6.a()     // Catch: all -> 0x0041
            java.lang.String r2 = "mem"
            r1.e(r2)     // Catch: all -> 0x0041
            java.lang.String r2 = r6.b()     // Catch: all -> 0x0041
            r1.h(r2)     // Catch: all -> 0x0041
            if (r7 != 0) goto L_0x0089
            long r2 = r1.getTime()     // Catch: all -> 0x0041
            boolean r7 = com.loc.fq.a(r2)     // Catch: all -> 0x0041
            if (r7 == 0) goto L_0x0073
            goto L_0x0089
        L_0x0073:
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.fh$a>> r7 = r4.f5698a     // Catch: all -> 0x0041
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.containsKey(r5)     // Catch: all -> 0x0041
            if (r7 == 0) goto L_0x009f
            java.util.Hashtable<java.lang.String, java.util.ArrayList<com.loc.fh$a>> r7 = r4.f5698a     // Catch: all -> 0x0041
            java.lang.Object r5 = r7.get(r5)     // Catch: all -> 0x0041
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: all -> 0x0041
            r5.remove(r6)     // Catch: all -> 0x0041
            goto L_0x009f
        L_0x0089:
            boolean r5 = com.loc.fy.a(r1)     // Catch: all -> 0x0041
            if (r5 == 0) goto L_0x0093
            r5 = 0
            r4.c = r5     // Catch: all -> 0x0041
        L_0x0093:
            r5 = 4
            r1.setLocationType(r5)     // Catch: all -> 0x0041
            return r1
        L_0x0098:
            java.lang.String r6 = "Cache"
            java.lang.String r7 = "get1"
            com.loc.fr.a(r5, r6, r7)
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fh.a(java.lang.String, java.lang.StringBuilder, boolean):com.loc.ew");
    }

    private a a(StringBuilder sb, String str) {
        a aVar;
        boolean z;
        if (this.f5698a.isEmpty() || TextUtils.isEmpty(sb)) {
            return null;
        }
        if (!this.f5698a.containsKey(str)) {
            return null;
        }
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        Hashtable hashtable3 = new Hashtable();
        ArrayList<a> arrayList = this.f5698a.get(str);
        char c = 1;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            a aVar2 = arrayList.get(size);
            if (!TextUtils.isEmpty(aVar2.b())) {
                if (!a(aVar2.b(), sb)) {
                    z = false;
                } else if (fy.a(aVar2.b(), sb.toString())) {
                    aVar = aVar2;
                    break;
                } else {
                    z = true;
                }
                a(aVar2.b(), hashtable);
                a(sb.toString(), hashtable2);
                hashtable3.clear();
                for (String str2 : hashtable.keySet()) {
                    hashtable3.put(str2, "");
                }
                for (String str3 : hashtable2.keySet()) {
                    hashtable3.put(str3, "");
                }
                Set keySet = hashtable3.keySet();
                double[] dArr = new double[keySet.size()];
                double[] dArr2 = new double[keySet.size()];
                Iterator it = keySet.iterator();
                int i = 0;
                while (it != null && it.hasNext()) {
                    String str4 = (String) it.next();
                    boolean containsKey = hashtable.containsKey(str4);
                    double d = vu3.b.GEO_NOT_SUPPORT;
                    dArr[i] = containsKey ? 1.0d : 0.0d;
                    if (hashtable2.containsKey(str4)) {
                        d = 1.0d;
                    }
                    dArr2[i] = d;
                    i++;
                }
                keySet.clear();
                double[] a2 = a(dArr, dArr2);
                if (a2[0] < 0.800000011920929d) {
                    aVar = aVar2;
                    if (a2[c] < Math.min(fq.g(), 0.618d)) {
                        if (z && a2[0] >= Math.min(fq.g(), 0.618d)) {
                        }
                    }
                    break;
                    break;
                }
                aVar = aVar2;
                break;
                break;
            }
            size--;
            c = 1;
        }
        aVar = null;
        hashtable.clear();
        hashtable2.clear();
        hashtable3.clear();
        return aVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: AttachTryCatchVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null type added to not empty exception handler: UnsupportedEncodingException -> 0x009d
        	at jadx.core.dex.trycatch.ExceptionHandler.addCatchType(ExceptionHandler.java:54)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.createHandler(AttachTryCatchVisitor.java:136)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.convertToHandlers(AttachTryCatchVisitor.java:123)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.initTryCatches(AttachTryCatchVisitor.java:59)
        	at jadx.core.dex.visitors.AttachTryCatchVisitor.visit(AttachTryCatchVisitor.java:47)
        */
    private java.lang.String a(java.lang.String r9, java.lang.StringBuilder r10, android.content.Context r11) {
        /*
            r8 = this;
            java.lang.String r0 = ",access"
            java.lang.String r1 = "&"
            java.lang.String r2 = "cgi"
            java.lang.String r3 = "#"
            r4 = 0
            if (r11 != 0) goto L_0x000c
            return r4
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            com.loc.fy.l(r11)     // Catch: UnsupportedEncodingException -> 0x009d
            r11 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            r8.l = r11     // Catch: UnsupportedEncodingException -> 0x009d
            r9.contains(r1)     // Catch: UnsupportedEncodingException -> 0x009d
            r11 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            r6 = 0     // Catch: UnsupportedEncodingException -> 0x009d
            if (r11 == 0) goto L_0x0026     // Catch: UnsupportedEncodingException -> 0x009d
            r9.indexOf(r1)     // Catch: UnsupportedEncodingException -> 0x009d
            r11 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            r9.substring(r6, r11)     // Catch: UnsupportedEncodingException -> 0x009d
            r9 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            r9.lastIndexOf(r3)     // Catch: UnsupportedEncodingException -> 0x009d
            r11 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            int r11 = r11 + 1     // Catch: UnsupportedEncodingException -> 0x009d
            r9.substring(r11)     // Catch: UnsupportedEncodingException -> 0x009d
            r11 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            r11.equals(r2)     // Catch: UnsupportedEncodingException -> 0x009d
            r1 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            if (r1 == 0) goto L_0x0044     // Catch: UnsupportedEncodingException -> 0x009d
            r9.length()     // Catch: UnsupportedEncodingException -> 0x009d
            r10 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            int r10 = r10 + (-12)     // Catch: UnsupportedEncodingException -> 0x009d
            r9.substring(r6, r10)     // Catch: UnsupportedEncodingException -> 0x009d
            r9 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            r5.put(r2, r9)     // Catch: UnsupportedEncodingException -> 0x009d
            goto L_0x0088     // Catch: UnsupportedEncodingException -> 0x009d
            android.text.TextUtils.isEmpty(r10)     // Catch: UnsupportedEncodingException -> 0x009d
            r1 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            if (r1 != 0) goto L_0x0088     // Catch: UnsupportedEncodingException -> 0x009d
            r10.indexOf(r0)     // Catch: UnsupportedEncodingException -> 0x009d
            r1 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            r7 = -1     // Catch: UnsupportedEncodingException -> 0x009d
            if (r1 == r7) goto L_0x0088     // Catch: UnsupportedEncodingException -> 0x009d
            r11.length()     // Catch: UnsupportedEncodingException -> 0x009d
            r11 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            int r11 = r11 + 9     // Catch: UnsupportedEncodingException -> 0x009d
            r9.length()     // Catch: UnsupportedEncodingException -> 0x009d
            r1 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            int r1 = r1 - r11     // Catch: UnsupportedEncodingException -> 0x009d
            r9.substring(r6, r1)     // Catch: UnsupportedEncodingException -> 0x009d
            r9 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            r5.put(r2, r9)     // Catch: UnsupportedEncodingException -> 0x009d
            r10.toString()     // Catch: UnsupportedEncodingException -> 0x009d
            r9 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            r9.split(r0)     // Catch: UnsupportedEncodingException -> 0x009d
            r9 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            r10 = r9[r6]     // Catch: UnsupportedEncodingException -> 0x009d
            r10.contains(r3)     // Catch: UnsupportedEncodingException -> 0x009d
            r10 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            if (r10 == 0) goto L_0x0080     // Catch: UnsupportedEncodingException -> 0x009d
            r9 = r9[r6]     // Catch: UnsupportedEncodingException -> 0x009d
            r9.lastIndexOf(r3)     // Catch: UnsupportedEncodingException -> 0x009d
            r10 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            int r10 = r10 + 1     // Catch: UnsupportedEncodingException -> 0x009d
            r9.substring(r10)     // Catch: UnsupportedEncodingException -> 0x009d
            r9 = move-result     // Catch: UnsupportedEncodingException -> 0x009d
            goto L_0x0082     // Catch: UnsupportedEncodingException -> 0x009d
            r9 = r9[r6]     // Catch: UnsupportedEncodingException -> 0x009d
            java.lang.String r10 = "mmac"     // Catch: UnsupportedEncodingException -> 0x009d
            r5.put(r10, r9)     // Catch: UnsupportedEncodingException -> 0x009d
            r5.toString()
            r9 = move-result
            java.lang.String r10 = "UTF-8"
            r9.getBytes(r10)
            r9 = move-result
            java.lang.String r10 = r8.l
            com.loc.fg.a(r9, r10)
            r9 = move-result
            com.loc.p.b(r9)
            r9 = move-result
            return r9
        L_0x009d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fh.a(java.lang.String, java.lang.StringBuilder, android.content.Context):java.lang.String");
    }

    public final void a() {
        this.c = 0L;
        this.d = null;
    }

    public final void a(Context context) {
        if (!this.j) {
            try {
                c();
                a(context, (String) null, false);
            } catch (Throwable th) {
                fr.a(th, "Cache", "loadDB");
            }
            this.j = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0291 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0296 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025d A[EDGE_INSN: B:128:0x025d->B:86:0x025d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0192 A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b0, blocks: (B:32:0x00a9, B:40:0x00d6, B:42:0x00f0, B:43:0x00f8, B:45:0x00fe, B:46:0x010b, B:48:0x011b, B:51:0x014b, B:52:0x015e, B:56:0x0169, B:59:0x0192, B:64:0x01ac, B:66:0x01b2, B:68:0x01de, B:69:0x01eb, B:71:0x01f1), top: B:117:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026d A[LOOP:0: B:37:0x00bb->B:87:0x026d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(android.content.Context r20, java.lang.String r21, boolean r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fh.a(android.content.Context, java.lang.String, boolean):void");
    }

    public final void a(AMapLocationClientOption aMapLocationClientOption) {
        this.g = aMapLocationClientOption.isNeedAddress();
        this.f = aMapLocationClientOption.isOffset();
        this.b = aMapLocationClientOption.isLocationCacheEnable();
        this.h = String.valueOf(aMapLocationClientOption.getGeoLanguage());
    }

    public final void a(fa faVar) {
        this.e = faVar;
    }

    public final void a(String str) {
        this.d = str;
    }

    /* JADX WARN: Finally extract failed */
    private void a(String str, AMapLocation aMapLocation, StringBuilder sb, Context context) throws Exception {
        if (context != null) {
            if (this.l == null) {
                this.l = fy.l(context);
            }
            String a2 = a(str, sb, context);
            StringBuilder sb2 = new StringBuilder();
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = context.openOrCreateDatabase("hmdb", 0, null);
                sb2.append("CREATE TABLE IF NOT EXISTS hist");
                sb2.append(this.k);
                sb2.append(" (feature VARCHAR PRIMARY KEY, nb VARCHAR, loc VARCHAR, time VARCHAR);");
                sQLiteDatabase.execSQL(sb2.toString());
                sb2.delete(0, sb2.length());
                sb2.append("REPLACE INTO ");
                sb2.append("hist");
                sb2.append(this.k);
                sb2.append(" VALUES (?, ?, ?, ?)");
                Object[] objArr = new Object[4];
                objArr[0] = a2;
                byte[] a3 = fg.a(sb.toString().getBytes("UTF-8"), this.l);
                objArr[1] = a3;
                objArr[2] = fg.a(aMapLocation.toStr().getBytes("UTF-8"), this.l);
                objArr[3] = Long.valueOf(aMapLocation.getTime());
                for (int i = 1; i < 3; i++) {
                    objArr[i] = p.b((byte[]) objArr[i]);
                }
                sQLiteDatabase.execSQL(sb2.toString(), objArr);
                sb2.delete(0, sb2.length());
                sb2.delete(0, sb2.length());
                if (sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.close();
                }
            } catch (Throwable th) {
                try {
                    fr.a(th, "DB", "updateHist");
                    sb2.delete(0, sb2.length());
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        sQLiteDatabase.close();
                    }
                } catch (Throwable th2) {
                    sb2.delete(0, sb2.length());
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        sQLiteDatabase.close();
                    }
                    throw th2;
                }
            }
        }
    }

    public final void a(String str, StringBuilder sb, ew ewVar, Context context, boolean z) {
        try {
            if (fy.a(ewVar)) {
                String str2 = str + "&" + ewVar.isOffset() + "&" + ewVar.i() + "&" + ewVar.j();
                if (a(str2, ewVar) && !ewVar.e().equals("mem") && !ewVar.e().equals("file") && !ewVar.e().equals("wifioff") && !"-3".equals(ewVar.d())) {
                    if (b()) {
                        c();
                    }
                    JSONObject f = ewVar.f();
                    if (fy.a(f, "offpct")) {
                        f.remove("offpct");
                        ewVar.a(f);
                    }
                    if (str2.contains("wifi")) {
                        if (!TextUtils.isEmpty(sb)) {
                            if (ewVar.getAccuracy() >= 300.0f) {
                                int i = 0;
                                for (String str3 : sb.toString().split("#")) {
                                    if (str3.contains(",")) {
                                        i++;
                                    }
                                }
                                if (i >= 8) {
                                    return;
                                }
                            } else if (ewVar.getAccuracy() <= 3.0f) {
                                return;
                            }
                            if (str2.contains("cgiwifi") && !TextUtils.isEmpty(ewVar.g())) {
                                String replace = str2.replace("cgiwifi", "cgi");
                                ew h = ewVar.h();
                                if (fy.a(h)) {
                                    a(replace, new StringBuilder(), h, context, true);
                                }
                            }
                        } else {
                            return;
                        }
                    } else if (str2.contains("cgi") && (!(sb == null || sb.indexOf(",") == -1) || "4".equals(ewVar.d()))) {
                        return;
                    }
                    ew a2 = a(str2, sb, false);
                    if (!fy.a(a2) || !a2.toStr().equals(ewVar.toStr(3))) {
                        this.i = fy.b();
                        a aVar = new a();
                        aVar.a(ewVar);
                        aVar.a(TextUtils.isEmpty(sb) ? null : sb.toString());
                        if (this.f5698a.containsKey(str2)) {
                            this.f5698a.get(str2).add(aVar);
                        } else {
                            ArrayList<a> arrayList = new ArrayList<>();
                            arrayList.add(aVar);
                            this.f5698a.put(str2, arrayList);
                        }
                        if (z) {
                            a(str2, ewVar, sb, context);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            fr.a(th, "Cache", "add");
        }
    }

    private static void a(String str, Hashtable<String, String> hashtable) {
        String[] split;
        if (!TextUtils.isEmpty(str)) {
            hashtable.clear();
            for (String str2 : str.split("#")) {
                if (!TextUtils.isEmpty(str2) && !str2.contains("|")) {
                    hashtable.put(str2, "");
                }
            }
        }
    }

    private boolean a(ew ewVar, boolean z) {
        if (!a(z)) {
            return false;
        }
        return ewVar == null || fq.a(ewVar.getTime()) || z;
    }

    private static boolean a(String str, ew ewVar) {
        if (TextUtils.isEmpty(str) || !fy.a(ewVar) || str.startsWith("#")) {
            return false;
        }
        return str.contains("network");
    }

    private static boolean a(String str, StringBuilder sb) {
        String str2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(sb) || !str.contains(",access") || sb.indexOf(",access") == -1) {
            return false;
        }
        String[] split = str.split(",access");
        if (split[0].contains("#")) {
            String str3 = split[0];
            str2 = str3.substring(str3.lastIndexOf("#") + 1);
        } else {
            str2 = split[0];
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        String sb2 = sb.toString();
        return sb2.contains(str2 + ",access");
    }

    private boolean a(boolean z) {
        if (fq.e() || z) {
            return this.b || fq.f() || z;
        }
        return false;
    }

    private static double[] a(double[] dArr, double[] dArr2) {
        double[] dArr3 = new double[3];
        double d = vu3.b.GEO_NOT_SUPPORT;
        double d2 = 0.0d;
        double d3 = 0.0d;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < dArr.length; i3++) {
            double d4 = dArr[i3];
            d2 += d4 * d4;
            double d5 = dArr2[i3];
            d3 += d5 * d5;
            d += d4 * d5;
            if (d5 == 1.0d) {
                i2++;
                if (d4 == 1.0d) {
                    i++;
                }
            }
        }
        dArr3[0] = d / (Math.sqrt(d2) * Math.sqrt(d3));
        double d6 = i;
        dArr3[1] = (d6 * 1.0d) / i2;
        dArr3[2] = d6;
        for (int i4 = 0; i4 < 2; i4++) {
            if (dArr3[i4] > 1.0d) {
                dArr3[i4] = 1.0d;
            }
        }
        return dArr3;
    }
}
