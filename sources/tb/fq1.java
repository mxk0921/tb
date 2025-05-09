package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class fq1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final fq1 INSTANCE = new fq1();

    static {
        t2o.a(140509189);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(android.graphics.Bitmap r9) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "Base64Utils"
            java.lang.String r2 = "bitmapToBase64, e="
            java.lang.String r3 = "data:image/jpeg;base64,"
            com.android.alibaba.ip.runtime.IpChange r4 = tb.fq1.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001e
            java.lang.String r1 = "54d16232"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r8
            r0 = 1
            r2[r0] = r9
            java.lang.Object r9 = r4.ipc$dispatch(r1, r2)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L_0x001e:
            java.lang.String r4 = "bitmap"
            tb.ckf.g(r9, r4)
            r4 = 0
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0066, Exception -> 0x0068
            r5.<init>()     // Catch: all -> 0x0066, Exception -> 0x0068
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: all -> 0x004e, Exception -> 0x0051
            r7 = 100
            r9.compress(r6, r7, r5)     // Catch: all -> 0x004e, Exception -> 0x0051
            byte[] r9 = r5.toByteArray()     // Catch: all -> 0x004e, Exception -> 0x0051
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r0)     // Catch: all -> 0x004e, Exception -> 0x0051
            if (r9 == 0) goto L_0x0053
            int r0 = r9.length()     // Catch: all -> 0x004e, Exception -> 0x0051
            if (r0 != 0) goto L_0x0041
            goto L_0x0053
        L_0x0041:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x004e, Exception -> 0x0051
            r0.<init>(r3)     // Catch: all -> 0x004e, Exception -> 0x0051
            r0.append(r9)     // Catch: all -> 0x004e, Exception -> 0x0051
            java.lang.String r9 = r0.toString()     // Catch: all -> 0x004e, Exception -> 0x0051
            goto L_0x0053
        L_0x004e:
            r9 = move-exception
            r4 = r5
            goto L_0x008c
        L_0x0051:
            r9 = move-exception
            goto L_0x006a
        L_0x0053:
            r5.close()     // Catch: Exception -> 0x0057
            goto L_0x0065
        L_0x0057:
            r0 = move-exception
            tb.iih r3 = tb.iih.INSTANCE
            java.lang.String r0 = tb.sm8.b(r0)
            java.lang.String r0 = r2.concat(r0)
            r3.a(r1, r0)
        L_0x0065:
            return r9
        L_0x0066:
            r9 = move-exception
            goto L_0x008c
        L_0x0068:
            r9 = move-exception
            r5 = r4
        L_0x006a:
            tb.iih r0 = tb.iih.INSTANCE     // Catch: all -> 0x004e
            java.lang.String r9 = tb.sm8.b(r9)     // Catch: all -> 0x004e
            java.lang.String r9 = r2.concat(r9)     // Catch: all -> 0x004e
            r0.a(r1, r9)     // Catch: all -> 0x004e
            if (r5 == 0) goto L_0x008b
            r5.close()     // Catch: Exception -> 0x007d
            goto L_0x008b
        L_0x007d:
            r9 = move-exception
            tb.iih r0 = tb.iih.INSTANCE
            java.lang.String r9 = tb.sm8.b(r9)
            java.lang.String r9 = r2.concat(r9)
            r0.a(r1, r9)
        L_0x008b:
            return r4
        L_0x008c:
            if (r4 == 0) goto L_0x00a0
            r4.close()     // Catch: Exception -> 0x0092
            goto L_0x00a0
        L_0x0092:
            r0 = move-exception
            tb.iih r3 = tb.iih.INSTANCE
            java.lang.String r0 = tb.sm8.b(r0)
            java.lang.String r0 = r2.concat(r0)
            r3.a(r1, r0)
        L_0x00a0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fq1.a(android.graphics.Bitmap):java.lang.String");
    }
}
