package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class foa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962592984);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003f -> B:55:0x0065). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(byte[] r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.foa.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "605a7c75"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            byte[] r4 = (byte[]) r4
            return r4
        L_0x0015:
            if (r4 == 0) goto L_0x007b
            int r0 = r4.length
            if (r0 != 0) goto L_0x001c
            goto L_0x007b
        L_0x001c:
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x004d, Exception -> 0x0050
            r1.<init>()     // Catch: all -> 0x004d, Exception -> 0x0050
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: all -> 0x0048, Exception -> 0x004a
            int r3 = r4.length     // Catch: all -> 0x0048, Exception -> 0x004a
            r2.<init>(r1, r3)     // Catch: all -> 0x0048, Exception -> 0x004a
            r2.write(r4)     // Catch: all -> 0x0043, Exception -> 0x0046
            r2.finish()     // Catch: all -> 0x0043, Exception -> 0x0046
            byte[] r0 = r1.toByteArray()     // Catch: all -> 0x0043, Exception -> 0x0046
            r2.close()     // Catch: IOException -> 0x0036
            goto L_0x003a
        L_0x0036:
            r4 = move-exception
            r4.printStackTrace()
        L_0x003a:
            r1.close()     // Catch: IOException -> 0x003e
            goto L_0x0065
        L_0x003e:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x0065
        L_0x0043:
            r4 = move-exception
            r0 = r2
            goto L_0x0066
        L_0x0046:
            r4 = move-exception
            goto L_0x0053
        L_0x0048:
            r4 = move-exception
            goto L_0x0066
        L_0x004a:
            r4 = move-exception
            r2 = r0
            goto L_0x0053
        L_0x004d:
            r4 = move-exception
            r1 = r0
            goto L_0x0066
        L_0x0050:
            r4 = move-exception
            r1 = r0
            r2 = r1
        L_0x0053:
            r4.printStackTrace()     // Catch: all -> 0x0043
            if (r2 == 0) goto L_0x0060
            r2.close()     // Catch: IOException -> 0x005c
            goto L_0x0060
        L_0x005c:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0060:
            if (r1 == 0) goto L_0x0065
            r1.close()     // Catch: IOException -> 0x003e
        L_0x0065:
            return r0
        L_0x0066:
            if (r0 == 0) goto L_0x0070
            r0.close()     // Catch: IOException -> 0x006c
            goto L_0x0070
        L_0x006c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0070:
            if (r1 == 0) goto L_0x007a
            r1.close()     // Catch: IOException -> 0x0076
            goto L_0x007a
        L_0x0076:
            r0 = move-exception
            r0.printStackTrace()
        L_0x007a:
            throw r4
        L_0x007b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.foa.a(byte[]):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0081, code lost:
        if (r2 == null) goto L_0x0084;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] b(byte[] r8) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.foa.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "13fb2c1c"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            java.lang.Object r8 = r1.ipc$dispatch(r2, r3)
            byte[] r8 = (byte[]) r8
            return r8
        L_0x0015:
            r1 = 0
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: all -> 0x0056, Exception -> 0x005a
            r2.<init>(r8)     // Catch: all -> 0x0056, Exception -> 0x005a
            java.util.zip.GZIPInputStream r8 = new java.util.zip.GZIPInputStream     // Catch: all -> 0x004f, Exception -> 0x0052
            r8.<init>(r2)     // Catch: all -> 0x004f, Exception -> 0x0052
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r3]     // Catch: all -> 0x004a, Exception -> 0x004c
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x004a, Exception -> 0x004c
            r5.<init>()     // Catch: all -> 0x004a, Exception -> 0x004c
        L_0x0029:
            int r6 = r8.read(r4, r0, r3)     // Catch: all -> 0x0034, Exception -> 0x0037
            r7 = -1
            if (r6 == r7) goto L_0x0039
            r5.write(r4, r0, r6)     // Catch: all -> 0x0034, Exception -> 0x0037
            goto L_0x0029
        L_0x0034:
            r0 = move-exception
            r1 = r5
            goto L_0x005f
        L_0x0037:
            goto L_0x0073
        L_0x0039:
            r5.flush()     // Catch: all -> 0x0034, Exception -> 0x0037
            byte[] r1 = r5.toByteArray()     // Catch: all -> 0x0034, Exception -> 0x0037
            r5.close()     // Catch: Exception -> 0x0043
        L_0x0043:
            r8.close()     // Catch: IOException -> 0x0046
        L_0x0046:
            r2.close()     // Catch: IOException -> 0x0084
            goto L_0x0084
        L_0x004a:
            r0 = move-exception
            goto L_0x005f
        L_0x004c:
            r5 = r1
            goto L_0x0073
        L_0x004f:
            r0 = move-exception
            r8 = r1
            goto L_0x005f
        L_0x0052:
            r8 = r1
            r5 = r8
            goto L_0x0073
        L_0x0056:
            r0 = move-exception
            r8 = r1
            r2 = r8
            goto L_0x005f
        L_0x005a:
            r8 = r1
            r2 = r8
            r5 = r2
            goto L_0x0073
        L_0x005f:
            if (r1 == 0) goto L_0x0066
            r1.close()     // Catch: Exception -> 0x0065
            goto L_0x0066
        L_0x0065:
        L_0x0066:
            if (r8 == 0) goto L_0x006d
            r8.close()     // Catch: IOException -> 0x006c
            goto L_0x006d
        L_0x006c:
        L_0x006d:
            if (r2 == 0) goto L_0x0072
            r2.close()     // Catch: IOException -> 0x0072
        L_0x0072:
            throw r0
        L_0x0073:
            if (r5 == 0) goto L_0x007a
            r5.close()     // Catch: Exception -> 0x0079
            goto L_0x007a
        L_0x0079:
        L_0x007a:
            if (r8 == 0) goto L_0x0081
            r8.close()     // Catch: IOException -> 0x0080
            goto L_0x0081
        L_0x0080:
        L_0x0081:
            if (r2 == 0) goto L_0x0084
            goto L_0x0046
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.foa.b(byte[]):byte[]");
    }
}
