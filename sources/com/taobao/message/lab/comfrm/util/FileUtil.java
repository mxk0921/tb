package com.taobao.message.lab.comfrm.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FileUtil";

    static {
        t2o.a(537919886);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093 A[Catch: IOException -> 0x0062, TRY_ENTER, TRY_LEAVE, TryCatch #7 {IOException -> 0x0062, blocks: (B:23:0x005e, B:43:0x0093), top: B:68:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0063 -> B:67:0x0096). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readAssetsTextFile(android.content.Context r6, java.lang.String r7) {
        /*
            r0 = 0
            java.lang.String r1 = "FileUtil load text: "
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.message.lab.comfrm.util.FileUtil.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.String r1 = "8e17ab77"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            r6 = 1
            r3[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r1, r3)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x001a:
            r2 = 0
            if (r7 != 0) goto L_0x001e
            return r2
        L_0x001e:
            android.content.Context r6 = r6.getApplicationContext()     // Catch: all -> 0x0075, IOException -> 0x0078
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: all -> 0x0075, IOException -> 0x0078
            java.io.InputStream r6 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r6, r7)     // Catch: all -> 0x0075, IOException -> 0x0078
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: all -> 0x006b, IOException -> 0x0071
            int r3 = r6.available()     // Catch: all -> 0x006b, IOException -> 0x0071
            int r3 = r3 + 10
            r7.<init>(r3)     // Catch: all -> 0x006b, IOException -> 0x0071
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: all -> 0x006b, IOException -> 0x006e
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: all -> 0x006b, IOException -> 0x006e
            r4.<init>(r6)     // Catch: all -> 0x006b, IOException -> 0x006e
            r3.<init>(r4)     // Catch: all -> 0x006b, IOException -> 0x006e
            r4 = 2048(0x800, float:2.87E-42)
            char[] r4 = new char[r4]     // Catch: all -> 0x004d, IOException -> 0x0050
        L_0x0043:
            int r5 = r3.read(r4)     // Catch: all -> 0x004d, IOException -> 0x0050
            if (r5 <= 0) goto L_0x0052
            r7.append(r4, r0, r5)     // Catch: all -> 0x004d, IOException -> 0x0050
            goto L_0x0043
        L_0x004d:
            r7 = move-exception
        L_0x004e:
            r2 = r6
            goto L_0x009e
        L_0x0050:
            r0 = move-exception
            goto L_0x007c
        L_0x0052:
            r6.close()     // Catch: IOException -> 0x0056
            goto L_0x005e
        L_0x0056:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r1, r6)
        L_0x005e:
            r3.close()     // Catch: IOException -> 0x0062
            goto L_0x0096
        L_0x0062:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r1, r6)
            goto L_0x0096
        L_0x006b:
            r7 = move-exception
            r3 = r2
            goto L_0x004e
        L_0x006e:
            r0 = move-exception
            r3 = r2
            goto L_0x007c
        L_0x0071:
            r0 = move-exception
            r7 = r2
        L_0x0073:
            r3 = r7
            goto L_0x007c
        L_0x0075:
            r7 = move-exception
            r3 = r2
            goto L_0x009e
        L_0x0078:
            r0 = move-exception
            r6 = r2
            r7 = r6
            goto L_0x0073
        L_0x007c:
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x004d
            android.util.Log.e(r1, r0)     // Catch: all -> 0x004d
            if (r6 == 0) goto L_0x0091
            r6.close()     // Catch: IOException -> 0x0089
            goto L_0x0091
        L_0x0089:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r1, r6)
        L_0x0091:
            if (r3 == 0) goto L_0x0096
            r3.close()     // Catch: IOException -> 0x0062
        L_0x0096:
            if (r7 != 0) goto L_0x0099
            return r2
        L_0x0099:
            java.lang.String r6 = r7.toString()
            return r6
        L_0x009e:
            if (r2 == 0) goto L_0x00ac
            r2.close()     // Catch: IOException -> 0x00a4
            goto L_0x00ac
        L_0x00a4:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r1, r6)
        L_0x00ac:
            if (r3 == 0) goto L_0x00ba
            r3.close()     // Catch: IOException -> 0x00b2
            goto L_0x00ba
        L_0x00b2:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r1, r6)
        L_0x00ba:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.util.FileUtil.readAssetsTextFile(android.content.Context, java.lang.String):java.lang.String");
    }
}
