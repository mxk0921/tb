package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cbi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f16958a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        t2o.a(947912767);
    }

    public static final String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1515c409", new Object[]{bArr});
        }
        char[] cArr = new char[32];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            byte b = bArr[i2];
            int i3 = i + 1;
            char[] cArr2 = f16958a;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String getTextMd5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e96a4f4", new Object[]{str});
        }
        try {
            return a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isMd5Same(java.lang.String r6, java.lang.String r7) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.cbi.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "d370f299"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L_0x0023
            return r0
        L_0x0023:
            java.lang.String r6 = r6.toLowerCase()
            if (r7 != 0) goto L_0x002a
            return r1
        L_0x002a:
            r0 = 0
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: all -> 0x007d, Exception -> 0x0080
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: all -> 0x007d, Exception -> 0x0080
            r3.<init>(r7)     // Catch: all -> 0x007d, Exception -> 0x0080
            java.nio.channels.FileChannel r0 = r3.getChannel()     // Catch: all -> 0x0058, Exception -> 0x005c
            r7 = 102400(0x19000, float:1.43493E-40)
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)     // Catch: all -> 0x0058, Exception -> 0x005c
        L_0x0041:
            int r4 = r0.read(r7)     // Catch: all -> 0x0058, Exception -> 0x005c
            r5 = -1
            if (r4 == r5) goto L_0x0060
            byte[] r5 = r7.array()     // Catch: all -> 0x0058, Exception -> 0x005c
            r2.update(r5, r1, r4)     // Catch: all -> 0x0058, Exception -> 0x005c
            r7.position(r1)     // Catch: all -> 0x0058, Exception -> 0x005c
            r4 = 1
            java.lang.Thread.sleep(r4)     // Catch: all -> 0x0058, Exception -> 0x005c
            goto L_0x0041
        L_0x0058:
            r6 = move-exception
            r7 = r0
            r0 = r3
            goto L_0x009b
        L_0x005c:
            r6 = move-exception
            r7 = r0
            r0 = r3
            goto L_0x0082
        L_0x0060:
            byte[] r7 = r2.digest()     // Catch: all -> 0x0058, Exception -> 0x005c
            java.lang.String r7 = a(r7)     // Catch: all -> 0x0058, Exception -> 0x005c
            boolean r6 = r7.equals(r6)     // Catch: all -> 0x0058, Exception -> 0x005c
            r3.close()     // Catch: IOException -> 0x0070
            goto L_0x0074
        L_0x0070:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0074:
            r0.close()     // Catch: IOException -> 0x0078
            goto L_0x007c
        L_0x0078:
            r7 = move-exception
            r7.printStackTrace()
        L_0x007c:
            return r6
        L_0x007d:
            r6 = move-exception
            r7 = r0
            goto L_0x009b
        L_0x0080:
            r6 = move-exception
            r7 = r0
        L_0x0082:
            r6.printStackTrace()     // Catch: all -> 0x009a
            if (r0 == 0) goto L_0x008f
            r0.close()     // Catch: IOException -> 0x008b
            goto L_0x008f
        L_0x008b:
            r6 = move-exception
            r6.printStackTrace()
        L_0x008f:
            if (r7 == 0) goto L_0x0099
            r7.close()     // Catch: IOException -> 0x0095
            goto L_0x0099
        L_0x0095:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0099:
            return r1
        L_0x009a:
            r6 = move-exception
        L_0x009b:
            if (r0 == 0) goto L_0x00a5
            r0.close()     // Catch: IOException -> 0x00a1
            goto L_0x00a5
        L_0x00a1:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00a5:
            if (r7 == 0) goto L_0x00af
            r7.close()     // Catch: IOException -> 0x00ab
            goto L_0x00af
        L_0x00ab:
            r7 = move-exception
            r7.printStackTrace()
        L_0x00af:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cbi.isMd5Same(java.lang.String, java.lang.String):boolean");
    }
}
