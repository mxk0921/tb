package tb;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class r3y {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                x5y.c("IOUtil", "closeSecure IOException");
            }
        }
    }

    public static void b(InputStream inputStream) {
        a(inputStream);
    }

    public static void c(OutputStream outputStream) {
        a(outputStream);
    }

    public static void d(Reader reader) {
        a(reader);
    }
}
