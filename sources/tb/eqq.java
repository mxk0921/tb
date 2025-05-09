package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class eqq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(620757079);
    }

    /* JADX WARN: Finally extract failed */
    public static ud8 a(InputStream inputStream, lp2 lp2Var, int[] iArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ud8) ipChange.ipc$dispatch("19bc3c0f", new Object[]{inputStream, lp2Var, iArr});
        }
        xpq xpqVar = new xpq(null, iArr[0], 0);
        try {
            b(inputStream, lp2Var, xpqVar);
            iArr[0] = xpqVar.b();
            return xpqVar.a();
        } catch (Throwable th) {
            iArr[0] = xpqVar.b();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d A[Catch: all -> 0x006b, TryCatch #4 {all -> 0x006b, blocks: (B:20:0x0058, B:22:0x005f, B:25:0x0067, B:28:0x006d, B:29:0x0074, B:33:0x007d, B:35:0x0083), top: B:64:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(java.io.InputStream r10, tb.lp2 r11, tb.xpq r12) throws java.lang.Exception {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.eqq.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "4f9b37a2"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r10
            r4[r0] = r11
            r10 = 2
            r4[r10] = r12
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x0021
            byte[] r2 = r11.a(r2)
            goto L_0x0023
        L_0x0021:
            byte[] r2 = new byte[r2]
        L_0x0023:
            int r3 = r12.d
            java.lang.String r4 = "Stream"
            r5 = 0
            if (r3 <= 0) goto L_0x004b
            if (r11 == 0) goto L_0x0034
            byte[] r3 = r11.a(r3)     // Catch: OutOfMemoryError -> 0x003c
            r9 = r5
            r5 = r3
            r3 = r9
            goto L_0x004c
        L_0x0034:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: OutOfMemoryError -> 0x003c
            int r6 = r12.d     // Catch: OutOfMemoryError -> 0x003c
            r3.<init>(r6)     // Catch: OutOfMemoryError -> 0x003c
            goto L_0x004c
        L_0x003c:
            int r3 = r12.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r1] = r3
            java.lang.String r3 = "allocate byte array OOM with content length=%d"
            tb.fiv.c(r4, r3, r6)
        L_0x004b:
            r3 = r5
        L_0x004c:
            if (r5 != 0) goto L_0x0058
            if (r3 != 0) goto L_0x0058
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r6 = 32768(0x8000, float:4.5918E-41)
            r3.<init>(r6)
        L_0x0058:
            int r6 = r10.read(r2)     // Catch: all -> 0x006b
            r7 = -1
            if (r6 == r7) goto L_0x007b
            boolean r8 = r12.c(r6)     // Catch: all -> 0x006b
            if (r8 == 0) goto L_0x007b
            if (r3 == 0) goto L_0x006d
            r3.write(r2, r1, r6)     // Catch: all -> 0x006b
            goto L_0x0074
        L_0x006b:
            r12 = move-exception
            goto L_0x00ab
        L_0x006d:
            int r7 = r12.b()     // Catch: all -> 0x006b
            java.lang.System.arraycopy(r2, r1, r5, r7, r6)     // Catch: all -> 0x006b
        L_0x0074:
            boolean r6 = r12.f(r6)     // Catch: all -> 0x006b
            if (r6 != 0) goto L_0x0058
            goto L_0x009d
        L_0x007b:
            if (r3 == 0) goto L_0x0082
            byte[] r3 = r3.toByteArray()     // Catch: all -> 0x006b
            goto L_0x0083
        L_0x0082:
            r3 = r5
        L_0x0083:
            r12.g(r3)     // Catch: all -> 0x006b
            if (r6 == r7) goto L_0x009c
            java.lang.String r3 = "read bytes incorrect, exceed content-length=%d"
            int r12 = r12.d     // Catch: all -> 0x0099
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: all -> 0x0099
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x0099
            r0[r1] = r12     // Catch: all -> 0x0099
            tb.fiv.k(r4, r3, r0)     // Catch: all -> 0x0099
            goto L_0x009c
        L_0x0099:
            r12 = move-exception
            r0 = 0
            goto L_0x00ab
        L_0x009c:
            r0 = 0
        L_0x009d:
            if (r11 == 0) goto L_0x00a7
            r11.b(r2)
            if (r0 == 0) goto L_0x00a7
            r11.b(r5)
        L_0x00a7:
            r10.close()     // Catch: all -> 0x00aa
        L_0x00aa:
            return
        L_0x00ab:
            if (r11 == 0) goto L_0x00b5
            r11.b(r2)
            if (r0 == 0) goto L_0x00b5
            r11.b(r5)
        L_0x00b5:
            r10.close()     // Catch: all -> 0x00b8
        L_0x00b8:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.eqq.b(java.io.InputStream, tb.lp2, tb.xpq):void");
    }
}
