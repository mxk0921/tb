package com.meizu.cloud.pushsdk.notification.g;

import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final File f5911a;
    private final File b;
    private final String c;

    public e(String str, String str2) {
        File file = new File(str);
        this.f5911a = file;
        File file2 = new File(str2);
        this.b = file2;
        this.c = file2.getAbsolutePath();
        DebugLogger.i("ZipExtractTask", "Extract mInput file = " + file.toString());
        DebugLogger.i("ZipExtractTask", "Extract mOutput file = " + file2.toString());
    }

    private int a(InputStream inputStream, OutputStream outputStream) {
        StringBuilder sb;
        IOException e;
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
        int i = 0;
        while (true) {
            try {
                try {
                    int read = bufferedInputStream.read(bArr, 0, 8192);
                    if (read == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, read);
                    i += read;
                } catch (IOException e2) {
                    DebugLogger.e("ZipExtractTask", "Extracted IOException:" + e2.toString());
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e3) {
                        DebugLogger.e("ZipExtractTask", "out.close() IOException e=" + e3.toString());
                    }
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e4) {
                        e = e4;
                        sb = new StringBuilder("in.close() IOException e=");
                        sb.append(e.toString());
                        DebugLogger.e("ZipExtractTask", sb.toString());
                        return i;
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e5) {
                    DebugLogger.e("ZipExtractTask", "out.close() IOException e=" + e5.toString());
                }
                try {
                    bufferedInputStream.close();
                } catch (IOException e6) {
                    DebugLogger.e("ZipExtractTask", "in.close() IOException e=" + e6.toString());
                }
                throw th;
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
        } catch (IOException e7) {
            DebugLogger.e("ZipExtractTask", "out.close() IOException e=" + e7.toString());
        }
        try {
            bufferedInputStream.close();
        } catch (IOException e8) {
            e = e8;
            sb = new StringBuilder("in.close() IOException e=");
            sb.append(e.toString());
            DebugLogger.e("ZipExtractTask", sb.toString());
            return i;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (r13 == null) goto L_0x0077;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
        r10 = r13.split("/")[0];
        com.meizu.cloud.pushinternal.DebugLogger.i("ZipExtractTask", "Extract temp directory=" + r17.b + "/" + r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long c() {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.notification.g.e.c():long");
    }

    public boolean b() {
        if (c() > 0) {
            return true;
        }
        return false;
    }

    private void a() {
        File file = this.f5911a;
        if (file != null && file.exists()) {
            StringBuilder sb = this.f5911a.delete() ? new StringBuilder("Delete file:") : new StringBuilder("Can't delete file:");
            sb.append(this.f5911a.toString());
            sb.append(" after extracted.");
            DebugLogger.i("ZipExtractTask", sb.toString());
        }
    }
}
