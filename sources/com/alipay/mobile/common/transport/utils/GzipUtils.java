package com.alipay.mobile.common.transport.utils;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GzipUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] toGzip(byte[] r7) {
        /*
            r0 = 0
            java.lang.String r1 = "GzipUtils"
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.common.transport.utils.GzipUtils.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0017
            java.lang.String r1 = "2d29cafa"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r7
            java.lang.Object r7 = r2.ipc$dispatch(r1, r3)
            byte[] r7 = (byte[]) r7
            return r7
        L_0x0017:
            r2 = 0
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: all -> 0x006e, IOException -> 0x0072
            r3.<init>(r7)     // Catch: all -> 0x006e, IOException -> 0x0072
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x0066, IOException -> 0x006a
            r7.<init>()     // Catch: all -> 0x0066, IOException -> 0x006a
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch: all -> 0x0060, IOException -> 0x0063
            r4.<init>(r7)     // Catch: all -> 0x0060, IOException -> 0x0063
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]     // Catch: all -> 0x0036, IOException -> 0x003a
        L_0x002b:
            int r5 = r3.read(r2)     // Catch: all -> 0x0036, IOException -> 0x003a
            r6 = -1
            if (r5 == r6) goto L_0x003d
            r4.write(r2, r0, r5)     // Catch: all -> 0x0036, IOException -> 0x003a
            goto L_0x002b
        L_0x0036:
            r0 = move-exception
        L_0x0037:
            r2 = r3
            goto L_0x0090
        L_0x003a:
            r0 = move-exception
        L_0x003b:
            r2 = r3
            goto L_0x0075
        L_0x003d:
            r4.flush()     // Catch: all -> 0x0036, IOException -> 0x003a
            r4.finish()     // Catch: all -> 0x0036, IOException -> 0x003a
            byte[] r0 = r7.toByteArray()     // Catch: all -> 0x0036, IOException -> 0x003a
            r3.close()     // Catch: all -> 0x004b
            goto L_0x004f
        L_0x004b:
            r2 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r1, r2)
        L_0x004f:
            r7.close()     // Catch: all -> 0x0053
            goto L_0x0057
        L_0x0053:
            r7 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r1, r7)
        L_0x0057:
            r4.close()     // Catch: all -> 0x005b
            goto L_0x005f
        L_0x005b:
            r7 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r1, r7)
        L_0x005f:
            return r0
        L_0x0060:
            r0 = move-exception
            r4 = r2
            goto L_0x0037
        L_0x0063:
            r0 = move-exception
            r4 = r2
            goto L_0x003b
        L_0x0066:
            r0 = move-exception
            r7 = r2
            r4 = r7
            goto L_0x0037
        L_0x006a:
            r0 = move-exception
            r7 = r2
            r4 = r7
            goto L_0x003b
        L_0x006e:
            r0 = move-exception
            r7 = r2
            r4 = r7
            goto L_0x0090
        L_0x0072:
            r0 = move-exception
            r7 = r2
            r4 = r7
        L_0x0075:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x008f
            r3.<init>()     // Catch: all -> 0x008f
            java.lang.String r5 = "toGzip ex:"
            r3.append(r5)     // Catch: all -> 0x008f
            java.lang.String r5 = r0.toString()     // Catch: all -> 0x008f
            r3.append(r5)     // Catch: all -> 0x008f
            java.lang.String r3 = r3.toString()     // Catch: all -> 0x008f
            com.alipay.mobile.common.transport.utils.LogCatUtil.error(r1, r3)     // Catch: all -> 0x008f
            throw r0     // Catch: all -> 0x008f
        L_0x008f:
            r0 = move-exception
        L_0x0090:
            if (r2 == 0) goto L_0x009a
            r2.close()     // Catch: all -> 0x0096
            goto L_0x009a
        L_0x0096:
            r2 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r1, r2)
        L_0x009a:
            if (r7 == 0) goto L_0x00a4
            r7.close()     // Catch: all -> 0x00a0
            goto L_0x00a4
        L_0x00a0:
            r7 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r1, r7)
        L_0x00a4:
            if (r4 == 0) goto L_0x00ae
            r4.close()     // Catch: all -> 0x00aa
            goto L_0x00ae
        L_0x00aa:
            r7 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r1, r7)
        L_0x00ae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.utils.GzipUtils.toGzip(byte[]):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] unGzip(byte[] r8) {
        /*
            r0 = 0
            java.lang.String r1 = "GzipUtils"
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.common.transport.utils.GzipUtils.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0017
            java.lang.String r1 = "13fb2c1c"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            java.lang.Object r8 = r2.ipc$dispatch(r1, r3)
            byte[] r8 = (byte[]) r8
            return r8
        L_0x0017:
            r2 = 0
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: all -> 0x0068, IOException -> 0x006c
            r3.<init>(r8)     // Catch: all -> 0x0068, IOException -> 0x006c
            java.util.zip.GZIPInputStream r8 = new java.util.zip.GZIPInputStream     // Catch: all -> 0x0061, IOException -> 0x0064
            r8.<init>(r3)     // Catch: all -> 0x0061, IOException -> 0x0064
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r4]     // Catch: all -> 0x005c, IOException -> 0x005e
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x005c, IOException -> 0x005e
            r6.<init>()     // Catch: all -> 0x005c, IOException -> 0x005e
        L_0x002b:
            int r2 = r8.read(r5, r0, r4)     // Catch: all -> 0x0036, IOException -> 0x0039
            r7 = -1
            if (r2 == r7) goto L_0x003c
            r6.write(r5, r0, r2)     // Catch: all -> 0x0036, IOException -> 0x0039
            goto L_0x002b
        L_0x0036:
            r0 = move-exception
        L_0x0037:
            r2 = r6
            goto L_0x008c
        L_0x0039:
            r0 = move-exception
        L_0x003a:
            r2 = r3
            goto L_0x006f
        L_0x003c:
            byte[] r0 = r6.toByteArray()     // Catch: all -> 0x0036, IOException -> 0x0039
            r6.flush()     // Catch: all -> 0x0036, IOException -> 0x0039
            r6.close()     // Catch: all -> 0x0047
            goto L_0x004b
        L_0x0047:
            r2 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r1, r2)
        L_0x004b:
            r8.close()     // Catch: all -> 0x004f
            goto L_0x0053
        L_0x004f:
            r8 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r1, r8)
        L_0x0053:
            r3.close()     // Catch: all -> 0x0057
            goto L_0x005b
        L_0x0057:
            r8 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r1, r8)
        L_0x005b:
            return r0
        L_0x005c:
            r0 = move-exception
            goto L_0x008c
        L_0x005e:
            r0 = move-exception
            r6 = r2
            goto L_0x003a
        L_0x0061:
            r0 = move-exception
            r8 = r2
            goto L_0x008c
        L_0x0064:
            r0 = move-exception
            r8 = r2
            r6 = r8
            goto L_0x003a
        L_0x0068:
            r0 = move-exception
            r8 = r2
            r3 = r8
            goto L_0x008c
        L_0x006c:
            r0 = move-exception
            r8 = r2
            r6 = r8
        L_0x006f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0089
            r3.<init>()     // Catch: all -> 0x0089
            java.lang.String r4 = "unGzip ex:"
            r3.append(r4)     // Catch: all -> 0x0089
            java.lang.String r4 = r0.toString()     // Catch: all -> 0x0089
            r3.append(r4)     // Catch: all -> 0x0089
            java.lang.String r3 = r3.toString()     // Catch: all -> 0x0089
            com.alipay.mobile.common.transport.utils.LogCatUtil.error(r1, r3)     // Catch: all -> 0x0089
            throw r0     // Catch: all -> 0x0089
        L_0x0089:
            r0 = move-exception
            r3 = r2
            goto L_0x0037
        L_0x008c:
            if (r2 == 0) goto L_0x0096
            r2.close()     // Catch: all -> 0x0092
            goto L_0x0096
        L_0x0092:
            r2 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r1, r2)
        L_0x0096:
            if (r8 == 0) goto L_0x00a0
            r8.close()     // Catch: all -> 0x009c
            goto L_0x00a0
        L_0x009c:
            r8 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r1, r8)
        L_0x00a0:
            if (r3 == 0) goto L_0x00aa
            r3.close()     // Catch: all -> 0x00a6
            goto L_0x00aa
        L_0x00a6:
            r8 = move-exception
            com.alipay.mobile.common.transport.utils.LogCatUtil.printError(r1, r8)
        L_0x00aa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.utils.GzipUtils.unGzip(byte[]):byte[]");
    }
}
