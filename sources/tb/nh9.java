package tb;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class nh9 extends mh9 {
    public static byte[] a(File file) {
        ckf.g(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                th = null;
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                    ckf.f(bArr, "copyOf(...)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        np8 np8Var = new np8(8193);
                        np8Var.write(read2);
                        hp2.b(fileInputStream, np8Var, 0, 2, th);
                        int size = np8Var.size() + i;
                        if (size >= 0) {
                            byte[] e = np8Var.e();
                            bArr = Arrays.copyOf(bArr, size);
                            ckf.f(bArr, "copyOf(...)");
                            hc1.d(e, bArr, i, 0, np8Var.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                lw3.a(fileInputStream, th);
            }
        }
    }

    public static final String b(File file, Charset charset) {
        InputStreamReader inputStreamReader;
        ckf.g(file, "<this>");
        ckf.g(charset, "charset");
        try {
            String c = nmt.c(new InputStreamReader(new FileInputStream(file), charset));
            th = null;
            return c;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static /* synthetic */ String c(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = uj3.UTF_8;
        }
        return b(file, charset);
    }
}
