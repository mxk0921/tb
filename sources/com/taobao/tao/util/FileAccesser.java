package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FileAccesser {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946415);
    }

    public static boolean delete(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea815e00", new Object[]{str})).booleanValue();
        }
        return new File(str).delete();
    }

    public static boolean hasFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed646d4b", new Object[]{str})).booleanValue();
        }
        if (new File(str).exists()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] read(java.lang.String r9) {
        /*
            java.lang.String r0 = "read time cost:"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tao.util.FileAccesser.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r0 = "cc4c5616"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r9
            java.lang.Object r9 = r1.ipc$dispatch(r0, r2)
            byte[] r9 = (byte[]) r9
            return r9
        L_0x0018:
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: all -> 0x005f, Exception -> 0x0062
            r4.<init>(r9)     // Catch: all -> 0x005f, Exception -> 0x0062
            java.nio.channels.FileChannel r9 = r4.getChannel()     // Catch: all -> 0x0059, Exception -> 0x005c
            long r5 = r9.size()     // Catch: all -> 0x0054, Exception -> 0x0057
            int r6 = (int) r5     // Catch: all -> 0x0054, Exception -> 0x0057
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r6)     // Catch: all -> 0x0054, Exception -> 0x0057
            r9.read(r5)     // Catch: all -> 0x0054, Exception -> 0x0057
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x0054, Exception -> 0x0057
            r6.<init>(r0)     // Catch: all -> 0x0054, Exception -> 0x0057
            long r7 = java.lang.System.currentTimeMillis()     // Catch: all -> 0x0054, Exception -> 0x0057
            long r7 = r7 - r1
            r6.append(r7)     // Catch: all -> 0x0054, Exception -> 0x0057
            byte[] r0 = r5.array()     // Catch: all -> 0x0054, Exception -> 0x0057
            r4.close()     // Catch: IOException -> 0x0047
            goto L_0x004b
        L_0x0047:
            r1 = move-exception
            r1.printStackTrace()
        L_0x004b:
            r9.close()     // Catch: IOException -> 0x004f
            goto L_0x0053
        L_0x004f:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0053:
            return r0
        L_0x0054:
            r0 = move-exception
        L_0x0055:
            r3 = r4
            goto L_0x007d
        L_0x0057:
            r0 = move-exception
            goto L_0x0065
        L_0x0059:
            r0 = move-exception
            r9 = r3
            goto L_0x0055
        L_0x005c:
            r0 = move-exception
            r9 = r3
            goto L_0x0065
        L_0x005f:
            r0 = move-exception
            r9 = r3
            goto L_0x007d
        L_0x0062:
            r0 = move-exception
            r9 = r3
            r4 = r9
        L_0x0065:
            r0.printStackTrace()     // Catch: all -> 0x0054
            if (r4 == 0) goto L_0x0072
            r4.close()     // Catch: IOException -> 0x006e
            goto L_0x0072
        L_0x006e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0072:
            if (r9 == 0) goto L_0x007c
            r9.close()     // Catch: IOException -> 0x0078
            goto L_0x007c
        L_0x0078:
            r9 = move-exception
            r9.printStackTrace()
        L_0x007c:
            return r3
        L_0x007d:
            if (r3 == 0) goto L_0x0087
            r3.close()     // Catch: IOException -> 0x0083
            goto L_0x0087
        L_0x0083:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0087:
            if (r9 == 0) goto L_0x0091
            r9.close()     // Catch: IOException -> 0x008d
            goto L_0x0091
        L_0x008d:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0091:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.FileAccesser.read(java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c7, code lost:
        r6.delete();
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean write(java.lang.String r10, java.nio.ByteBuffer r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.util.FileAccesser.write(java.lang.String, java.nio.ByteBuffer):boolean");
    }
}
