package com.meizu.cloud.pushsdk.c.c;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5775a = "b";
    private static final Object b = new Object();
    private static b c;

    private b(Context context) {
        try {
            System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
        } catch (Exception e) {
            e.printStackTrace();
        }
        a.a(context);
    }

    public static b a(Context context) {
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public c b(String str, Map<String, String> map, String str2) {
        try {
            return a(str, a(map), str2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0108, code lost:
        if (r1 != null) goto L_0x010a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010a, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012c, code lost:
        if (r1 != null) goto L_0x010a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.meizu.cloud.pushsdk.c.c.b] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.meizu.cloud.pushsdk.c.c.c a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.c.c.b.a(java.lang.String, java.util.Map, java.lang.String):com.meizu.cloud.pushsdk.c.c.c");
    }

    private void b(URLConnection uRLConnection) {
        try {
            String headerField = uRLConnection.getHeaderField("X-S-Key");
            String str = f5775a;
            DebugLogger.d(str, "get x_s_key = " + headerField);
            if (!TextUtils.isEmpty(headerField)) {
                a.e().c(headerField);
            }
        } catch (NullPointerException unused) {
        }
    }

    private Map<String, String> a(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>(2);
        }
        byte[] g = a.e().g();
        if (g == null || g.length <= 0) {
            byte[] f = a.e().f();
            if (f != null && f.length > 0) {
                String str = new String(a.e().f());
                DebugLogger.d(f5775a, "attach x_a_key: ".concat(str));
                map.put("X-A-Key", str);
            }
        } else {
            String str2 = new String(g);
            DebugLogger.d(f5775a, "attach x_s_key: ".concat(str2));
            map.put("X-S-Key", str2);
        }
        return map;
    }

    private void a(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        Throwable th;
        GZIPOutputStream gZIPOutputStream;
        try {
            gZIPOutputStream = new GZIPOutputStream(httpURLConnection.getOutputStream());
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.flush();
                try {
                    gZIPOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream = null;
        }
    }

    private void a(URLConnection uRLConnection) {
        try {
            String headerField = uRLConnection.getHeaderField("Key-Timeout");
            String str = f5775a;
            DebugLogger.d(str, "get keyTimeout = " + headerField);
        } catch (NullPointerException unused) {
        }
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused2) {
        }
        return byteArray;
    }
}
