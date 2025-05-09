package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pc9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(782237718);
    }

    public static String a(String str) {
        Exception e;
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59166b3", new Object[]{str});
        }
        File file = new File(str);
        if (!file.exists() || file.isDirectory()) {
            return "";
        }
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        bufferedInputStream = new BufferedInputStream(fileInputStream);
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                } catch (Exception e3) {
                    e = e3;
                    bufferedInputStream2 = bufferedInputStream;
                    e.printStackTrace();
                    if (bufferedInputStream2 != null) {
                        bufferedInputStream2.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return new String(bArr);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream2 = bufferedInputStream;
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                            throw th;
                        }
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (bufferedInputStream.read(bArr, 0, length) < length) {
            try {
                bufferedInputStream.close();
                fileInputStream.close();
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            return "";
        }
        bufferedInputStream.close();
        fileInputStream.close();
        return new String(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008a A[Catch: Exception -> 0x0086, TRY_LEAVE, TryCatch #6 {Exception -> 0x0086, blocks: (B:46:0x0082, B:50:0x008a), top: B:68:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[Catch: Exception -> 0x0098, TRY_LEAVE, TryCatch #4 {Exception -> 0x0098, blocks: (B:54:0x0094, B:58:0x009c), top: B:65:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.pc9.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "c4c55c93"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L_0x001c:
            java.io.File r2 = new java.io.File
            r2.<init>(r5)
            java.io.File r5 = r2.getParentFile()
            if (r5 == 0) goto L_0x0039
            boolean r3 = r5.exists()
            if (r3 != 0) goto L_0x0039
            boolean r5 = r5.mkdirs()     // Catch: Exception -> 0x0034
            if (r5 != 0) goto L_0x0039
            return r1
        L_0x0034:
            r5 = move-exception
            r5.printStackTrace()
            return r1
        L_0x0039:
            boolean r5 = r2.exists()
            if (r5 != 0) goto L_0x004b
            boolean r5 = r2.createNewFile()     // Catch: IOException -> 0x0046
            if (r5 != 0) goto L_0x004b
            return r1
        L_0x0046:
            r5 = move-exception
            r5.printStackTrace()
            return r1
        L_0x004b:
            r5 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: all -> 0x0075, Exception -> 0x0079
            r3.<init>(r2)     // Catch: all -> 0x0075, Exception -> 0x0079
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: all -> 0x006d, Exception -> 0x0071
            r2.<init>(r3)     // Catch: all -> 0x006d, Exception -> 0x0071
            byte[] r5 = r6.getBytes()     // Catch: all -> 0x0069, Exception -> 0x006b
            r2.write(r5)     // Catch: all -> 0x0069, Exception -> 0x006b
            r2.close()     // Catch: Exception -> 0x0064
            r3.close()     // Catch: Exception -> 0x0064
            goto L_0x0068
        L_0x0064:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0068:
            return r0
        L_0x0069:
            r5 = move-exception
            goto L_0x0092
        L_0x006b:
            r5 = move-exception
            goto L_0x007d
        L_0x006d:
            r6 = move-exception
            r2 = r5
        L_0x006f:
            r5 = r6
            goto L_0x0092
        L_0x0071:
            r6 = move-exception
            r2 = r5
        L_0x0073:
            r5 = r6
            goto L_0x007d
        L_0x0075:
            r6 = move-exception
            r2 = r5
            r3 = r2
            goto L_0x006f
        L_0x0079:
            r6 = move-exception
            r2 = r5
            r3 = r2
            goto L_0x0073
        L_0x007d:
            r5.printStackTrace()     // Catch: all -> 0x0069
            if (r2 == 0) goto L_0x0088
            r2.close()     // Catch: Exception -> 0x0086
            goto L_0x0088
        L_0x0086:
            r5 = move-exception
            goto L_0x008e
        L_0x0088:
            if (r3 == 0) goto L_0x0091
            r3.close()     // Catch: Exception -> 0x0086
            goto L_0x0091
        L_0x008e:
            r5.printStackTrace()
        L_0x0091:
            return r1
        L_0x0092:
            if (r2 == 0) goto L_0x009a
            r2.close()     // Catch: Exception -> 0x0098
            goto L_0x009a
        L_0x0098:
            r6 = move-exception
            goto L_0x00a0
        L_0x009a:
            if (r3 == 0) goto L_0x00a3
            r3.close()     // Catch: Exception -> 0x0098
            goto L_0x00a3
        L_0x00a0:
            r6.printStackTrace()
        L_0x00a3:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pc9.b(java.lang.String, java.lang.String):boolean");
    }
}
