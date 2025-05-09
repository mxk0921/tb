package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g5s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File a(java.io.File r12, java.io.File r13) throws java.lang.Exception {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.g5s.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "c1bd7987"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r12
            r2[r0] = r13
            java.lang.Object r12 = r3.ipc$dispatch(r4, r2)
            java.io.File r12 = (java.io.File) r12
            return r12
        L_0x0018:
            r3 = 3
            r4 = 0
            if (r1 >= r3) goto L_0x008a
            boolean r3 = r13.exists()     // Catch: all -> 0x0034, Exception -> 0x0037
            if (r3 != 0) goto L_0x003d
            java.io.File r3 = r13.getParentFile()     // Catch: all -> 0x0034, Exception -> 0x0037
            boolean r3 = r3.exists()     // Catch: all -> 0x0034, Exception -> 0x0037
            if (r3 != 0) goto L_0x003a
            java.io.File r3 = r13.getParentFile()     // Catch: all -> 0x0034, Exception -> 0x0037
            r3.mkdirs()     // Catch: all -> 0x0034, Exception -> 0x0037
            goto L_0x003a
        L_0x0034:
            r12 = move-exception
            r5 = r4
            goto L_0x007f
        L_0x0037:
            r3 = move-exception
            r5 = r4
            goto L_0x006c
        L_0x003a:
            r13.createNewFile()     // Catch: all -> 0x0034, Exception -> 0x0037
        L_0x003d:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: all -> 0x0034, Exception -> 0x0037
            r3.<init>(r12)     // Catch: all -> 0x0034, Exception -> 0x0037
            java.nio.channels.FileChannel r3 = r3.getChannel()     // Catch: all -> 0x0034, Exception -> 0x0037
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: all -> 0x0063, Exception -> 0x0067
            r5.<init>(r13)     // Catch: all -> 0x0063, Exception -> 0x0067
            java.nio.channels.FileChannel r4 = r5.getChannel()     // Catch: all -> 0x0063, Exception -> 0x0067
            long r8 = r3.size()     // Catch: all -> 0x0063, Exception -> 0x0067
            r6 = 0
            r5 = r3
            r10 = r4
            r5.transferTo(r6, r8, r10)     // Catch: all -> 0x0063, Exception -> 0x0067
            r3.close()
            if (r4 == 0) goto L_0x0062
            r4.close()
        L_0x0062:
            return r13
        L_0x0063:
            r12 = move-exception
            r5 = r4
            r4 = r3
            goto L_0x007f
        L_0x0067:
            r5 = move-exception
            r11 = r4
            r4 = r3
            r3 = r5
            r5 = r11
        L_0x006c:
            r13.delete()     // Catch: all -> 0x007e
            if (r1 == r2) goto L_0x007d
            if (r4 == 0) goto L_0x0076
            r4.close()
        L_0x0076:
            if (r5 == 0) goto L_0x007b
            r5.close()
        L_0x007b:
            int r1 = r1 + r0
            goto L_0x0018
        L_0x007d:
            throw r3     // Catch: all -> 0x007e
        L_0x007e:
            r12 = move-exception
        L_0x007f:
            if (r4 == 0) goto L_0x0084
            r4.close()
        L_0x0084:
            if (r5 == 0) goto L_0x0089
            r5.close()
        L_0x0089:
            throw r12
        L_0x008a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.g5s.a(java.io.File, java.io.File):java.io.File");
    }
}
