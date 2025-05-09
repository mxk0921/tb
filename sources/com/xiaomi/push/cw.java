package com.xiaomi.push;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class cw {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends cv {
        public a() {
            super(1);
        }

        @Override // com.xiaomi.push.cv
        public String a(Context context, String str, List<bf> list) {
            URL url;
            if (list == null) {
                url = new URL(str);
            } else {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                for (bf bfVar : list) {
                    buildUpon.appendQueryParameter(bfVar.a(), bfVar.b());
                }
                url = new URL(buildUpon.toString());
            }
            return bg.a(context, url);
        }
    }

    public static int a(int i, int i2) {
        return (((i2 + 243) / 1448) * 132) + 1080 + i + i2;
    }

    public static int a(int i, int i2, int i3) {
        return (((i2 + 200) / 1448) * 132) + 1011 + i2 + i + i3;
    }

    private static int a(cv cvVar, String str, List<bf> list, String str2) {
        if (cvVar.a() == 1) {
            return a(str.length(), a(str2));
        }
        if (cvVar.a() != 2) {
            return -1;
        }
        return a(str.length(), a(list), a(str2));
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    public static int a(List<bf> list) {
        int i = 0;
        for (bf bfVar : list) {
            if (!TextUtils.isEmpty(bfVar.a())) {
                i += bfVar.a().length();
            }
            if (!TextUtils.isEmpty(bfVar.b())) {
                i += bfVar.b().length();
            }
        }
        return i * 2;
    }

    public static String a(Context context, String str, List<bf> list) {
        return a(context, str, list, new a(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad A[Catch: MalformedURLException -> 0x0026, TRY_ENTER, TryCatch #3 {MalformedURLException -> 0x0026, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x0020, B:13:0x002a, B:15:0x0030, B:16:0x0033, B:17:0x0038, B:19:0x003e, B:21:0x0047, B:23:0x004f, B:48:0x00ad, B:49:0x00bf), top: B:60:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r20, java.lang.String r21, java.util.List<com.xiaomi.push.bf> r22, com.xiaomi.push.cv r23, boolean r24) {
        /*
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            boolean r4 = com.xiaomi.push.bg.b(r20)
            r5 = 0
            if (r4 == 0) goto L_0x00c9
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: MalformedURLException -> 0x0026
            r4.<init>()     // Catch: MalformedURLException -> 0x0026
            if (r24 == 0) goto L_0x0029
            com.xiaomi.push.cs r6 = com.xiaomi.push.cs.a()     // Catch: MalformedURLException -> 0x0026
            com.xiaomi.push.co r6 = r6.m564a(r0)     // Catch: MalformedURLException -> 0x0026
            if (r6 == 0) goto L_0x0024
            java.util.ArrayList r4 = r6.a(r0)     // Catch: MalformedURLException -> 0x0026
        L_0x0024:
            r13 = r6
            goto L_0x002a
        L_0x0026:
            r0 = move-exception
            goto L_0x00c6
        L_0x0029:
            r13 = r5
        L_0x002a:
            boolean r6 = r4.contains(r0)     // Catch: MalformedURLException -> 0x0026
            if (r6 != 0) goto L_0x0033
            r4.add(r0)     // Catch: MalformedURLException -> 0x0026
        L_0x0033:
            java.util.Iterator r4 = r4.iterator()     // Catch: MalformedURLException -> 0x0026
            r6 = r5
        L_0x0038:
            boolean r0 = r4.hasNext()     // Catch: MalformedURLException -> 0x0026
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r0 = r4.next()     // Catch: MalformedURLException -> 0x0026
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14     // Catch: MalformedURLException -> 0x0026
            if (r2 == 0) goto L_0x004e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: MalformedURLException -> 0x0026
            r0.<init>(r2)     // Catch: MalformedURLException -> 0x0026
            r15 = r0
            goto L_0x004f
        L_0x004e:
            r15 = r5
        L_0x004f:
            long r16 = java.lang.System.currentTimeMillis()     // Catch: MalformedURLException -> 0x0026
            boolean r0 = r3.m574a(r1, r14, r15)     // Catch: IOException -> 0x00a7
            if (r0 != 0) goto L_0x005b
            goto L_0x00c5
        L_0x005b:
            java.lang.String r12 = r3.a(r1, r14, r15)     // Catch: IOException -> 0x00a7
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: IOException -> 0x009e
            if (r0 != 0) goto L_0x007f
            if (r13 == 0) goto L_0x007d
            long r6 = java.lang.System.currentTimeMillis()     // Catch: IOException -> 0x0078
            long r8 = r6 - r16
            int r0 = a(r3, r14, r15, r12)     // Catch: IOException -> 0x0078
            long r10 = (long) r0     // Catch: IOException -> 0x0078
            r6 = r13
            r7 = r14
            r6.a(r7, r8, r10)     // Catch: IOException -> 0x0078
            goto L_0x007d
        L_0x0078:
            r0 = move-exception
            r18 = r0
            r0 = r12
            goto L_0x00ab
        L_0x007d:
            r6 = r12
            goto L_0x00c5
        L_0x007f:
            if (r13 == 0) goto L_0x00a2
            long r6 = java.lang.System.currentTimeMillis()     // Catch: IOException -> 0x009e
            long r8 = r6 - r16
            int r0 = a(r3, r14, r15, r12)     // Catch: IOException -> 0x009e
            long r10 = (long) r0
            r0 = 0
            r6 = r13
            r7 = r14
            r18 = r12
            r12 = r0
            r6.a(r7, r8, r10, r12)     // Catch: IOException -> 0x0096
            goto L_0x00a4
        L_0x0096:
            r0 = move-exception
        L_0x0097:
            r19 = r18
            r18 = r0
            r0 = r19
            goto L_0x00ab
        L_0x009e:
            r0 = move-exception
            r18 = r12
            goto L_0x0097
        L_0x00a2:
            r18 = r12
        L_0x00a4:
            r6 = r18
            goto L_0x0038
        L_0x00a7:
            r0 = move-exception
            r18 = r0
            r0 = r6
        L_0x00ab:
            if (r13 == 0) goto L_0x00bf
            long r6 = java.lang.System.currentTimeMillis()     // Catch: MalformedURLException -> 0x0026
            long r8 = r6 - r16
            int r6 = a(r3, r14, r15, r0)     // Catch: MalformedURLException -> 0x0026
            long r10 = (long) r6     // Catch: MalformedURLException -> 0x0026
            r6 = r13
            r7 = r14
            r12 = r18
            r6.a(r7, r8, r10, r12)     // Catch: MalformedURLException -> 0x0026
        L_0x00bf:
            r18.printStackTrace()     // Catch: MalformedURLException -> 0x0026
            r6 = r0
            goto L_0x0038
        L_0x00c5:
            return r6
        L_0x00c6:
            r0.printStackTrace()
        L_0x00c9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.cw.a(android.content.Context, java.lang.String, java.util.List, com.xiaomi.push.cv, boolean):java.lang.String");
    }
}
