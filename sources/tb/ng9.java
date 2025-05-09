package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ng9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0042 -> B:37:0x0052). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.io.File r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ng9.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "17aa6aa1"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            r0 = 0
            boolean r1 = r4.exists()     // Catch: all -> 0x0046, Exception -> 0x0048
            if (r1 != 0) goto L_0x001d
            return r0
        L_0x001d:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: all -> 0x0046, Exception -> 0x0048
            r1.<init>(r4)     // Catch: all -> 0x0046, Exception -> 0x0048
            int r4 = r1.available()     // Catch: all -> 0x0038, Exception -> 0x003b
            byte[] r4 = new byte[r4]     // Catch: all -> 0x0038, Exception -> 0x003b
            int r2 = r1.read(r4)     // Catch: all -> 0x0038, Exception -> 0x003b
            r3 = -1
            if (r2 == r3) goto L_0x003d
            java.lang.String r2 = new java.lang.String     // Catch: all -> 0x0038, Exception -> 0x003b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r4, r3)     // Catch: all -> 0x0038, Exception -> 0x003b
            r0 = r2
            goto L_0x003d
        L_0x0038:
            r4 = move-exception
            r0 = r1
            goto L_0x0053
        L_0x003b:
            r4 = move-exception
            goto L_0x004a
        L_0x003d:
            r1.close()     // Catch: IOException -> 0x0041
            goto L_0x0052
        L_0x0041:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x0052
        L_0x0046:
            r4 = move-exception
            goto L_0x0053
        L_0x0048:
            r4 = move-exception
            r1 = r0
        L_0x004a:
            r4.printStackTrace()     // Catch: all -> 0x0038
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch: IOException -> 0x0041
        L_0x0052:
            return r0
        L_0x0053:
            if (r0 == 0) goto L_0x005d
            r0.close()     // Catch: IOException -> 0x0059
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ng9.a(java.io.File):java.lang.String");
    }

    public static boolean b(String str, String str2, boolean z) {
        Throwable th;
        Exception e;
        BufferedWriter bufferedWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("267926a3", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                bufferedWriter = new BufferedWriter(new FileWriter(str, z));
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(str2);
            bufferedWriter.close();
            try {
                bufferedWriter.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return true;
        } catch (Exception e4) {
            e = e4;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }
}
