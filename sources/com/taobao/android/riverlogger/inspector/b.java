package com.taobao.android.riverlogger.inspector;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f9312a;
    private final a b;
    public int d;
    public Map<String, List<String>> e;
    public String g;
    private final ByteArrayOutputStream c = new ByteArrayOutputStream(8192);
    public int f = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(int i, b bVar);
    }

    static {
        t2o.a(649068575);
    }

    private b(String str, a aVar) {
        this.f9312a = str;
        this.b = aVar;
    }

    public static void c(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4db45ff", new Object[]{str, aVar});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new b(str, aVar));
        }
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("65cd3b53", new Object[]{this});
        }
        if (this.f == 0) {
            return this.c.toByteArray();
        }
        return null;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b385e34f", new Object[]{this});
        }
        if (this.f != 0) {
            return "";
        }
        try {
            return this.c.toString("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (r5 == null) goto L_0x00a1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "gzip"
            java.lang.String r3 = "status code "
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.riverlogger.inspector.b.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0017
            java.lang.String r2 = "5c510192"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r8
            r4.ipc$dispatch(r2, r1)
            return
        L_0x0017:
            r4 = 0
            java.net.URL r5 = new java.net.URL     // Catch: all -> 0x0089, Exception -> 0x008c
            java.lang.String r6 = r8.f9312a     // Catch: all -> 0x0089, Exception -> 0x008c
            r5.<init>(r6)     // Catch: all -> 0x0089, Exception -> 0x008c
            java.net.URLConnection r5 = r5.openConnection()     // Catch: all -> 0x0089, Exception -> 0x008c
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: all -> 0x0089, Exception -> 0x008c
            r5.setInstanceFollowRedirects(r1)     // Catch: all -> 0x005a, Exception -> 0x005c
            java.lang.String r1 = "GET"
            r5.setRequestMethod(r1)     // Catch: all -> 0x005a, Exception -> 0x005c
            java.lang.String r1 = "Accept-Encoding"
            r5.setRequestProperty(r1, r2)     // Catch: all -> 0x005a, Exception -> 0x005c
            int r1 = r5.getResponseCode()     // Catch: all -> 0x005a, Exception -> 0x005c
            r8.d = r1     // Catch: all -> 0x005a, Exception -> 0x005c
            r6 = 200(0xc8, float:2.8E-43)
            r7 = -1
            if (r1 != r6) goto L_0x006e
            java.io.InputStream r4 = r5.getInputStream()     // Catch: all -> 0x005a, Exception -> 0x005c
            java.util.Map r1 = r5.getHeaderFields()     // Catch: all -> 0x005a, Exception -> 0x005c
            r8.e = r1     // Catch: all -> 0x005a, Exception -> 0x005c
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r1 = r5.getHeaderField(r1)     // Catch: all -> 0x005a, Exception -> 0x005c
            boolean r1 = android.text.TextUtils.equals(r2, r1)     // Catch: all -> 0x005a, Exception -> 0x005c
            if (r1 == 0) goto L_0x005e
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: all -> 0x005a, Exception -> 0x005c
            r1.<init>(r4)     // Catch: all -> 0x005a, Exception -> 0x005c
            r4 = r1
            goto L_0x005e
        L_0x005a:
            r0 = move-exception
            goto L_0x00a9
        L_0x005c:
            r0 = move-exception
            goto L_0x008e
        L_0x005e:
            r1 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r1]     // Catch: all -> 0x005a, Exception -> 0x005c
        L_0x0062:
            int r3 = r4.read(r2, r0, r1)     // Catch: all -> 0x005a, Exception -> 0x005c
            if (r3 == r7) goto L_0x0080
            java.io.ByteArrayOutputStream r6 = r8.c     // Catch: all -> 0x005a, Exception -> 0x005c
            r6.write(r2, r0, r3)     // Catch: all -> 0x005a, Exception -> 0x005c
            goto L_0x0062
        L_0x006e:
            r8.f = r7     // Catch: all -> 0x005a, Exception -> 0x005c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x005a, Exception -> 0x005c
            r0.<init>(r3)     // Catch: all -> 0x005a, Exception -> 0x005c
            int r1 = r8.d     // Catch: all -> 0x005a, Exception -> 0x005c
            r0.append(r1)     // Catch: all -> 0x005a, Exception -> 0x005c
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x005a, Exception -> 0x005c
            r8.g = r0     // Catch: all -> 0x005a, Exception -> 0x005c
        L_0x0080:
            if (r4 == 0) goto L_0x0085
            r4.close()     // Catch: Exception -> 0x0085
        L_0x0085:
            r5.disconnect()
            goto L_0x00a1
        L_0x0089:
            r0 = move-exception
            r5 = r4
            goto L_0x00a9
        L_0x008c:
            r0 = move-exception
            r5 = r4
        L_0x008e:
            r1 = -2
            r8.f = r1     // Catch: all -> 0x005a
            java.lang.String r0 = r0.toString()     // Catch: all -> 0x005a
            r8.g = r0     // Catch: all -> 0x005a
            if (r4 == 0) goto L_0x009e
            r4.close()     // Catch: Exception -> 0x009d
            goto L_0x009e
        L_0x009d:
        L_0x009e:
            if (r5 == 0) goto L_0x00a1
            goto L_0x0085
        L_0x00a1:
            com.taobao.android.riverlogger.inspector.b$a r0 = r8.b
            int r1 = r8.f
            r0.a(r1, r8)
            return
        L_0x00a9:
            if (r4 == 0) goto L_0x00b0
            r4.close()     // Catch: Exception -> 0x00af
            goto L_0x00b0
        L_0x00af:
        L_0x00b0:
            if (r5 == 0) goto L_0x00b5
            r5.disconnect()
        L_0x00b5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.riverlogger.inspector.b.run():void");
    }
}
