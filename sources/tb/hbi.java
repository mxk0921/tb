package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hbi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f20530a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        t2o.a(676331695);
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
            char[] cArr2 = f20530a;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.io.File r6) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.hbi.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "ef8d90f6"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            java.lang.Object r6 = r1.ipc$dispatch(r2, r3)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x0015:
            r1 = 0
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: all -> 0x0064, Exception -> 0x0067
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: all -> 0x0064, Exception -> 0x0067
            r3.<init>(r6)     // Catch: all -> 0x0064, Exception -> 0x0067
            java.nio.channels.FileChannel r1 = r3.getChannel()     // Catch: all -> 0x0043, Exception -> 0x0047
            r6 = 102400(0x19000, float:1.43493E-40)
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)     // Catch: all -> 0x0043, Exception -> 0x0047
        L_0x002c:
            int r4 = r1.read(r6)     // Catch: all -> 0x0043, Exception -> 0x0047
            r5 = -1
            if (r4 == r5) goto L_0x004b
            byte[] r5 = r6.array()     // Catch: all -> 0x0043, Exception -> 0x0047
            r2.update(r5, r0, r4)     // Catch: all -> 0x0043, Exception -> 0x0047
            r6.position(r0)     // Catch: all -> 0x0043, Exception -> 0x0047
            r4 = 1
            java.lang.Thread.sleep(r4)     // Catch: all -> 0x0043, Exception -> 0x0047
            goto L_0x002c
        L_0x0043:
            r6 = move-exception
            r0 = r1
            r1 = r3
            goto L_0x0084
        L_0x0047:
            r6 = move-exception
            r0 = r1
            r1 = r3
            goto L_0x0069
        L_0x004b:
            byte[] r6 = r2.digest()     // Catch: all -> 0x0043, Exception -> 0x0047
            java.lang.String r6 = a(r6)     // Catch: all -> 0x0043, Exception -> 0x0047
            r3.close()     // Catch: IOException -> 0x0057
            goto L_0x005b
        L_0x0057:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005b:
            r1.close()     // Catch: IOException -> 0x005f
            goto L_0x0063
        L_0x005f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0063:
            return r6
        L_0x0064:
            r6 = move-exception
            r0 = r1
            goto L_0x0084
        L_0x0067:
            r6 = move-exception
            r0 = r1
        L_0x0069:
            r6.printStackTrace()     // Catch: all -> 0x0083
            if (r1 == 0) goto L_0x0076
            r1.close()     // Catch: IOException -> 0x0072
            goto L_0x0076
        L_0x0072:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0076:
            if (r0 == 0) goto L_0x0080
            r0.close()     // Catch: IOException -> 0x007c
            goto L_0x0080
        L_0x007c:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0080:
            java.lang.String r6 = ""
            return r6
        L_0x0083:
            r6 = move-exception
        L_0x0084:
            if (r1 == 0) goto L_0x008e
            r1.close()     // Catch: IOException -> 0x008a
            goto L_0x008e
        L_0x008a:
            r1 = move-exception
            r1.printStackTrace()
        L_0x008e:
            if (r0 == 0) goto L_0x0098
            r0.close()     // Catch: IOException -> 0x0094
            goto L_0x0098
        L_0x0094:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0098:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hbi.b(java.io.File):java.lang.String");
    }

    public static String c(MessageDigest messageDigest, InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a042c8a7", new Object[]{messageDigest, inputStream});
        }
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            messageDigest.update(bArr, 0, read);
        }
        inputStream.close();
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public static String d(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5ee0f7e", new Object[]{inputStream});
        }
        try {
            try {
                String c = c(MessageDigest.getInstance("MD5"), inputStream);
                if (inputStream == null) {
                    return c;
                }
                try {
                    inputStream.close();
                    return c;
                } catch (IOException e) {
                    e.printStackTrace();
                    return c;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }
}
