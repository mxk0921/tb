package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sxv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Removed duplicated region for block: B:51:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.sxv.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "1d95cf18"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0018:
            r0 = 0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: all -> 0x0051, Exception -> 0x0054
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch: all -> 0x0051, Exception -> 0x0054
            java.io.InputStream r4 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r4, r5)     // Catch: all -> 0x0051, Exception -> 0x0054
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch: all -> 0x0051, Exception -> 0x0054
            r1.<init>(r4, r5)     // Catch: all -> 0x0051, Exception -> 0x0054
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: all -> 0x004c, Exception -> 0x004e
            r4.<init>(r1)     // Catch: all -> 0x004c, Exception -> 0x004e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x003c, Exception -> 0x003f
            r5.<init>()     // Catch: all -> 0x003c, Exception -> 0x003f
        L_0x0032:
            java.lang.String r2 = r4.readLine()     // Catch: all -> 0x003c, Exception -> 0x003f
            if (r2 == 0) goto L_0x0041
            r5.append(r2)     // Catch: all -> 0x003c, Exception -> 0x003f
            goto L_0x0032
        L_0x003c:
            r5 = move-exception
            r0 = r4
            goto L_0x0067
        L_0x003f:
            r5 = move-exception
            goto L_0x0057
        L_0x0041:
            java.lang.String r5 = r5.toString()     // Catch: all -> 0x003c, Exception -> 0x003f
            r4.close()     // Catch: IOException -> 0x0048
        L_0x0048:
            r1.close()     // Catch: IOException -> 0x004b
        L_0x004b:
            return r5
        L_0x004c:
            r5 = move-exception
            goto L_0x0067
        L_0x004e:
            r5 = move-exception
            r4 = r0
            goto L_0x0057
        L_0x0051:
            r5 = move-exception
            r1 = r0
            goto L_0x0067
        L_0x0054:
            r5 = move-exception
            r4 = r0
            r1 = r4
        L_0x0057:
            r5.printStackTrace()     // Catch: all -> 0x003c
            if (r4 == 0) goto L_0x0061
            r4.close()     // Catch: IOException -> 0x0060
            goto L_0x0061
        L_0x0060:
        L_0x0061:
            if (r1 == 0) goto L_0x0066
            r1.close()     // Catch: IOException -> 0x0066
        L_0x0066:
            return r0
        L_0x0067:
            if (r0 == 0) goto L_0x006e
            r0.close()     // Catch: IOException -> 0x006d
            goto L_0x006e
        L_0x006d:
        L_0x006e:
            if (r1 == 0) goto L_0x0073
            r1.close()     // Catch: IOException -> 0x0073
        L_0x0073:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sxv.a(android.content.Context, java.lang.String):java.lang.String");
    }
}
