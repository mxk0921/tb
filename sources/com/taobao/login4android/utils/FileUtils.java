package com.taobao.login4android.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(516948010);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1 == null) goto L_0x0044;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String readFileData(android.content.Context r4, java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.login4android.utils.FileUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "57a44251"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0018:
            java.lang.String r0 = ""
            r1 = 0
            java.io.FileInputStream r1 = r4.openFileInput(r5)     // Catch: all -> 0x0033, Exception -> 0x0035
            int r4 = r1.available()     // Catch: all -> 0x0033, Exception -> 0x0035
            if (r4 <= 0) goto L_0x0037
            byte[] r4 = new byte[r4]     // Catch: all -> 0x0033, Exception -> 0x0035
            r1.read(r4)     // Catch: all -> 0x0033, Exception -> 0x0035
            java.lang.String r5 = new java.lang.String     // Catch: all -> 0x0033, Exception -> 0x0035
            java.lang.String r2 = "UTF-8"
            r5.<init>(r4, r2)     // Catch: all -> 0x0033, Exception -> 0x0035
            r0 = r5
            goto L_0x0037
        L_0x0033:
            r4 = move-exception
            goto L_0x003b
        L_0x0035:
            goto L_0x0041
        L_0x0037:
            r1.close()     // Catch: Exception -> 0x0044
            goto L_0x0044
        L_0x003b:
            if (r1 == 0) goto L_0x0040
            r1.close()     // Catch: Exception -> 0x0040
        L_0x0040:
            throw r4
        L_0x0041:
            if (r1 == 0) goto L_0x0044
            goto L_0x0037
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.utils.FileUtils.readFileData(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String readThreadStack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1f628d1", new Object[0]);
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append("\n");
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeFileData(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9fc5e10", new Object[]{context, str, str2});
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = context.openFileOutput(str, 0);
            fileOutputStream.write(str2.getBytes(Charset.forName("UTF-8")));
            fileOutputStream.flush();
        } catch (Exception unused) {
            if (fileOutputStream == null) {
                return;
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        try {
            fileOutputStream.close();
        } catch (Exception unused3) {
        }
    }
}
