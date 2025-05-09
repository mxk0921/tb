package com.huawei.hms.hatool;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.Deflater;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class k1 {
    public static String a(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        }
        try {
            h hVar = new h(1024);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                hVar.a(bArr, read);
            }
            if (hVar.b() == 0) {
                a((Closeable) fileInputStream);
                return "";
            }
            String str = new String(hVar.a(), "UTF-8");
            a((Closeable) fileInputStream);
            return str;
        } catch (FileNotFoundException unused3) {
            fileInputStream2 = fileInputStream;
            v.f("hmsSdk", "getInfoFromFile(): No files need to be read");
            a((Closeable) fileInputStream2);
            return "";
        } catch (IOException unused4) {
            fileInputStream2 = fileInputStream;
            v.f("hmsSdk", "getInfoFromFile(): stream.read or new string exception");
            a((Closeable) fileInputStream2);
            return "";
        } catch (Throwable th3) {
            th = th3;
            a((Closeable) fileInputStream);
            throw th;
        }
    }

    public static String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                    a((Closeable) byteArrayOutputStream);
                    return byteArrayOutputStream2;
                }
            }
        } catch (Throwable th) {
            a((Closeable) byteArrayOutputStream);
            throw th;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                v.f("hmsSdk", "closeQuietly(): Exception when closing the closeable!");
            }
        }
    }

    public static void a(File file, String str) {
        Throwable th;
        String str2;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(str.getBytes("UTF-8"));
                    fileOutputStream.flush();
                } catch (FileNotFoundException unused) {
                    fileOutputStream = fileOutputStream;
                    str2 = "saveInfoToFile(): No files need to be read";
                    v.f("hmsSdk", str2);
                    a((Closeable) fileOutputStream);
                } catch (IOException unused2) {
                    fileOutputStream = fileOutputStream;
                    str2 = "saveInfoToFile(): io exc from write info to file!";
                    v.f("hmsSdk", str2);
                    a((Closeable) fileOutputStream);
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream;
                a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        } catch (IOException unused4) {
        } catch (Throwable th3) {
            th = th3;
            a((Closeable) fileOutputStream);
            throw th;
        }
        a((Closeable) fileOutputStream);
    }

    private static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                v.f("hmsSdk", "closeStream(): Exception: close OutputStream error!");
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (Exception unused) {
            v.f("hmsSdk", "closeQuietly(): Exception when connHttp.getInputStream()!,There may be no network, or no INTERNET permission");
        }
        httpURLConnection.disconnect();
        v.a("hmsSdk", " connHttp disconnect");
    }

    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        deflater.end();
        a((OutputStream) byteArrayOutputStream);
        return byteArray;
    }
}
