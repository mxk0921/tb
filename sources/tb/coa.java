package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class coa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713032020);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[Catch: Exception -> 0x008b, TRY_LEAVE, TryCatch #3 {Exception -> 0x008b, blocks: (B:32:0x0083, B:34:0x0088), top: B:41:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r7) {
        /*
            r0 = 0
            java.lang.String r1 = "compress fail, src = "
            com.android.alibaba.ip.runtime.IpChange r2 = tb.coa.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0017
            java.lang.String r1 = "ca65584"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r7
            java.lang.Object r7 = r2.ipc$dispatch(r1, r3)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x0017:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r3 = 0
            if (r2 == 0) goto L_0x001f
            return r3
        L_0x001f:
            java.lang.String r2 = "UTF-8"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)     // Catch: all -> 0x0053, Exception -> 0x0056
            byte[] r2 = r7.getBytes(r2)     // Catch: all -> 0x0053, Exception -> 0x0056
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0053, Exception -> 0x0056
            r4.<init>()     // Catch: all -> 0x0053, Exception -> 0x0056
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch: all -> 0x004d, Exception -> 0x0050
            r5.<init>(r4)     // Catch: all -> 0x004d, Exception -> 0x0050
            r5.write(r2)     // Catch: all -> 0x0048, Exception -> 0x004b
            r5.finish()     // Catch: all -> 0x0048, Exception -> 0x004b
            byte[] r2 = r4.toByteArray()     // Catch: all -> 0x0048, Exception -> 0x004b
            java.lang.String r7 = tb.wp1.k(r2)     // Catch: all -> 0x0048, Exception -> 0x004b
            r4.close()     // Catch: Exception -> 0x0047
            r5.close()     // Catch: Exception -> 0x0047
        L_0x0047:
            return r7
        L_0x0048:
            r7 = move-exception
        L_0x0049:
            r3 = r4
            goto L_0x0081
        L_0x004b:
            r2 = move-exception
            goto L_0x0059
        L_0x004d:
            r7 = move-exception
            r5 = r3
            goto L_0x0049
        L_0x0050:
            r2 = move-exception
            r5 = r3
            goto L_0x0059
        L_0x0053:
            r7 = move-exception
            r5 = r3
            goto L_0x0081
        L_0x0056:
            r2 = move-exception
            r4 = r3
            r5 = r4
        L_0x0059:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x0048
            r6.<init>(r1)     // Catch: all -> 0x0048
            r6.append(r7)     // Catch: all -> 0x0048
            java.lang.String r7 = " e = "
            r6.append(r7)     // Catch: all -> 0x0048
            java.lang.String r7 = r2.toString()     // Catch: all -> 0x0048
            r6.append(r7)     // Catch: all -> 0x0048
            java.lang.String r7 = r6.toString()     // Catch: all -> 0x0048
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: all -> 0x0048
            com.taobao.tao.log.TLog.loge(r7, r0)     // Catch: all -> 0x0048
            if (r4 == 0) goto L_0x007b
            r4.close()     // Catch: Exception -> 0x0080
        L_0x007b:
            if (r5 == 0) goto L_0x0080
            r5.close()     // Catch: Exception -> 0x0080
        L_0x0080:
            return r3
        L_0x0081:
            if (r3 == 0) goto L_0x0086
            r3.close()     // Catch: Exception -> 0x008b
        L_0x0086:
            if (r5 == 0) goto L_0x008b
            r5.close()     // Catch: Exception -> 0x008b
        L_0x008b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.coa.a(java.lang.String):java.lang.String");
    }
}
