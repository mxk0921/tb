package com.uc.crashsdk.a;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f14230a = true;
    private static String b = "";

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2, true, false);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2, true, true);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, boolean z) {
        return a(bArr, bArr2, z, true);
    }

    private static boolean b(File file, String str, String str2) {
        try {
            byte[] a2 = a(file);
            if (!(a2 == null || a2.length == 0)) {
                return a(a2, str, str2);
            }
            return false;
        } catch (Exception e) {
            g.a(e);
            return false;
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, boolean z, boolean z2) {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(z ? 1 : 2, secretKeySpec, ivParameterSpec);
        if (!z) {
            return instance.doFinal(bArr);
        }
        if (!z2) {
            bArr = a(bArr);
        }
        return instance.doFinal(bArr);
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 16];
        int length = bArr.length;
        bArr2[0] = (byte) (length & 255);
        bArr2[1] = (byte) ((length >> 8) & 255);
        bArr2[2] = (byte) ((length >> 16) & 255);
        bArr2[3] = (byte) ((length >> 24) & 255);
        for (int i = 4; i < 16; i++) {
            bArr2[i] = 0;
        }
        System.arraycopy(bArr, 0, bArr2, 16, bArr.length);
        return bArr2;
    }

    public static byte[] a() {
        return new byte[]{48, 25, 6, 55};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] a(java.lang.String r7, byte[] r8) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: all -> 0x0087
            r1.<init>(r7)     // Catch: all -> 0x0087
            java.net.URLConnection r7 = r1.openConnection()     // Catch: all -> 0x0087
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch: all -> 0x0087
            r1 = 5000(0x1388, float:7.006E-42)
            r7.setConnectTimeout(r1)     // Catch: all -> 0x0083
            r7.setReadTimeout(r1)     // Catch: all -> 0x0083
            r1 = 1
            r7.setDoInput(r1)     // Catch: all -> 0x0083
            r7.setDoOutput(r1)     // Catch: all -> 0x0083
            java.lang.String r1 = "POST"
            r7.setRequestMethod(r1)     // Catch: all -> 0x0083
            r1 = 0
            r7.setUseCaches(r1)     // Catch: all -> 0x0083
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = "application/x-www-form-urlencoded"
            r7.setRequestProperty(r2, r3)     // Catch: all -> 0x0083
            java.lang.String r2 = "Content-Length"
            int r3 = r8.length     // Catch: all -> 0x0083
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: all -> 0x0083
            r7.setRequestProperty(r2, r3)     // Catch: all -> 0x0083
            java.io.OutputStream r2 = r7.getOutputStream()     // Catch: all -> 0x0083
            r2.write(r8)     // Catch: all -> 0x0080
            int r8 = r7.getResponseCode()     // Catch: all -> 0x0080
            r3 = 200(0xc8, float:2.8E-43)
            if (r8 == r3) goto L_0x0051
            com.uc.crashsdk.a.g.a(r2)
            com.uc.crashsdk.a.g.a(r0)
            com.uc.crashsdk.a.g.a(r0)
            r7.disconnect()     // Catch: all -> 0x0050
        L_0x0050:
            return r0
        L_0x0051:
            java.io.InputStream r8 = r7.getInputStream()     // Catch: all -> 0x0080
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: all -> 0x007e
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x007e
            int r5 = r8.available()     // Catch: all -> 0x007e
            r4.<init>(r5)     // Catch: all -> 0x007e
        L_0x0062:
            int r5 = r8.read(r3)     // Catch: all -> 0x008a
            r6 = -1
            if (r5 == r6) goto L_0x006d
            r4.write(r3, r1, r5)     // Catch: all -> 0x008a
            goto L_0x0062
        L_0x006d:
            byte[] r0 = r4.toByteArray()     // Catch: all -> 0x008a
            com.uc.crashsdk.a.g.a(r2)
            com.uc.crashsdk.a.g.a(r8)
            com.uc.crashsdk.a.g.a(r4)
            r7.disconnect()     // Catch: all -> 0x007d
        L_0x007d:
            return r0
        L_0x007e:
            r4 = r0
            goto L_0x008a
        L_0x0080:
            r8 = r0
            r4 = r8
            goto L_0x008a
        L_0x0083:
            r8 = r0
        L_0x0084:
            r2 = r8
            r4 = r2
            goto L_0x008a
        L_0x0087:
            r7 = r0
            r8 = r7
            goto L_0x0084
        L_0x008a:
            com.uc.crashsdk.a.g.a(r2)
            com.uc.crashsdk.a.g.a(r8)
            com.uc.crashsdk.a.g.a(r4)
            if (r7 == 0) goto L_0x0098
            r7.disconnect()     // Catch: all -> 0x0098
        L_0x0098:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.c.a(java.lang.String, byte[]):byte[]");
    }

    public static void a(byte[] bArr, int i, byte[] bArr2) {
        if (f14230a || bArr2.length == 4) {
            for (int i2 = 0; i2 < 4; i2++) {
                bArr[i2 + i] = bArr2[i2];
            }
            return;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    private static byte[] a(File file) {
        FileInputStream fileInputStream;
        Throwable th;
        Exception e;
        int length;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = 0;
        byte[] bArr = null;
        r1 = null;
        bufferedInputStream2 = 0;
        Closeable closeable = null;
        try {
            if (!file.isFile()) {
                return null;
            }
            try {
                length = (int) file.length();
                fileInputStream = new FileInputStream(file);
                try {
                    bufferedInputStream = new BufferedInputStream(fileInputStream);
                } catch (Exception e2) {
                    e = e2;
                    bufferedInputStream2 = 0;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedInputStream2 = 0;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
            try {
                bArr = new byte[length];
                int i = 0;
                while (i < length) {
                    int read = bufferedInputStream.read(bArr, i, length - i);
                    if (-1 == read) {
                        break;
                    }
                    i += read;
                }
                g.a(bufferedInputStream);
                g.a(fileInputStream);
                return bArr;
            } catch (Exception e4) {
                e = e4;
                closeable = bufferedInputStream;
                bufferedInputStream2 = bArr;
                g.b(e);
                g.a(closeable);
                g.a(fileInputStream);
                return bufferedInputStream2;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream2 = bufferedInputStream;
                g.a((Closeable) bufferedInputStream2);
                g.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static boolean a(File file, String str, String str2) {
        for (int i = 0; i < 2; i++) {
            if (b(file, str, str2)) {
                return true;
            }
            a.a("crashsdk", "upload try again: " + str);
        }
        return false;
    }

    private static boolean a(byte[] bArr, String str, String str2) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        byte[] byteArray;
        a.a("Uploading to " + str2);
        OutputStream outputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            try {
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                StringBuilder sb = new StringBuilder();
                sb.append("------------izQ290kHh6g3Yn2IeyJCoc\r\n");
                sb.append("Content-Disposition: form-data; name=\"file\";");
                sb.append(" filename=\"");
                sb.append(str);
                sb.append("\"\r\n");
                sb.append("Content-Type: application/octet-stream\r\n");
                sb.append("\r\n");
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=----------izQ290kHh6g3Yn2IeyJCoc");
                httpURLConnection.setRequestProperty("Content-Disposition", "form-data; name=\"file\"; filename=" + str);
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(sb.length() + 40 + bArr.length));
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(sb.toString().getBytes());
                    outputStream2.write(bArr);
                    outputStream2.write("\r\n------------izQ290kHh6g3Yn2IeyJCoc--\r\n".getBytes());
                    int responseCode = httpURLConnection.getResponseCode();
                    a.a("crashsdk", "Response code: " + responseCode);
                    if (responseCode != 200) {
                        g.a(outputStream2);
                        g.a((Closeable) null);
                        g.a((Closeable) null);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused) {
                        }
                        return false;
                    }
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byte[] bArr2 = new byte[1024];
                        byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
                        while (true) {
                            try {
                                int read = inputStream.read(bArr2);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read);
                            } catch (Throwable th2) {
                                th = th2;
                                outputStream = outputStream2;
                                try {
                                    g.b(th);
                                    return false;
                                } finally {
                                    g.a(outputStream);
                                    g.a(inputStream);
                                    g.a(byteArrayOutputStream);
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                }
                            }
                        }
                        if (byteArrayOutputStream.toByteArray() != null) {
                            a.a("crashsdk", "Log upload response: " + new String(byteArray));
                            g.a(outputStream2);
                            g.a(inputStream);
                            g.a(byteArrayOutputStream);
                            try {
                                httpURLConnection.disconnect();
                            } catch (Throwable unused3) {
                            }
                            return true;
                        }
                        g.a(outputStream2);
                        g.a(inputStream);
                        g.a(byteArrayOutputStream);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused4) {
                        }
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStream = null;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
            httpURLConnection = null;
            byteArrayOutputStream = null;
        }
    }
}
