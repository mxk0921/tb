package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uas {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(849346570);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r5) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.uas.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "ecb67769"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            java.lang.Object r5 = r2.ipc$dispatch(r3, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x0015:
            r2 = 0
            if (r5 == 0) goto L_0x0069
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x001f
            goto L_0x0069
        L_0x001f:
            java.lang.String r3 = ""
            java.net.URL r4 = new java.net.URL     // Catch: all -> 0x0049, IOException -> 0x004c
            r4.<init>(r5)     // Catch: all -> 0x0049, IOException -> 0x004c
            java.net.URLConnection r5 = r4.openConnection()     // Catch: all -> 0x0049, IOException -> 0x004c
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: all -> 0x0049, IOException -> 0x004c
            r4 = 5000(0x1388, float:7.006E-42)
            r5.setConnectTimeout(r4)     // Catch: all -> 0x0045, IOException -> 0x0047
            r5.setReadTimeout(r4)     // Catch: all -> 0x0045, IOException -> 0x0047
            java.io.InputStream r4 = r5.getInputStream()     // Catch: all -> 0x0045, IOException -> 0x0047
            java.lang.String r3 = b(r4)     // Catch: all -> 0x0045, IOException -> 0x0047
            r5.disconnect()     // Catch: Exception -> 0x0040, all -> 0x0069
            goto L_0x0065
        L_0x0040:
            r5 = move-exception
            r5.printStackTrace()     // Catch: all -> 0x0069
            goto L_0x0065
        L_0x0045:
            r0 = move-exception
            goto L_0x004f
        L_0x0047:
            goto L_0x005a
        L_0x0049:
            r0 = move-exception
            r5 = r2
            goto L_0x004f
        L_0x004c:
            r5 = r2
            goto L_0x005a
        L_0x004f:
            if (r5 == 0) goto L_0x0059
            r5.disconnect()     // Catch: Exception -> 0x0055, all -> 0x0069
            goto L_0x0059
        L_0x0055:
            r5 = move-exception
            r5.printStackTrace()     // Catch: all -> 0x0069
        L_0x0059:
            throw r0     // Catch: all -> 0x0069
        L_0x005a:
            if (r5 == 0) goto L_0x0064
            r5.disconnect()     // Catch: Exception -> 0x0060, all -> 0x0069
            goto L_0x0064
        L_0x0060:
            r5 = move-exception
            r5.printStackTrace()     // Catch: all -> 0x0069
        L_0x0064:
            r0 = 1
        L_0x0065:
            if (r0 == 0) goto L_0x0068
            return r2
        L_0x0068:
            return r3
        L_0x0069:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uas.a(java.lang.String):java.lang.String");
    }

    public static String b(InputStream inputStream) {
        Throwable th;
        IOException e;
        StringBuilder sb;
        BufferedReader bufferedReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d6ca476", new Object[]{inputStream});
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                sb = new StringBuilder(inputStream.available() + 10);
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            char[] cArr = new char[4096];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read <= 0) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            String sb2 = sb.toString();
            try {
                bufferedReader.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            return sb2;
        } catch (IOException e5) {
            e = e5;
            bufferedReader2 = bufferedReader;
            e.printStackTrace();
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            if (inputStream == null) {
                return "";
            }
            try {
                inputStream.close();
                return "";
            } catch (IOException e7) {
                e7.printStackTrace();
                return "";
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            throw th;
        }
    }
}
